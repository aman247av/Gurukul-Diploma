package com.gap.mobigpk1;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.play.core.appupdate.AppUpdateInfo;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.google.android.play.core.appupdate.AppUpdateManagerFactory;
import com.google.android.play.core.install.model.AppUpdateType;
import com.google.android.play.core.install.model.UpdateAvailability;
import com.google.android.play.core.tasks.OnSuccessListener;
import com.google.android.play.core.tasks.Task;
import com.yodo1.mas.Yodo1Mas;
import com.yodo1.mas.error.Yodo1MasError;
import com.yodo1.mas.helper.model.Yodo1MasAdBuildConfig;

public class MainActivity extends AppCompatActivity {

    Fragment fragment=new book();
    private  int REQUEST_CODE=11;
    public Dialog progressDialog;
     Button btn,btn2;
    SharedPreferences sharedPreferences,firsttime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sharedPreferences = getSharedPreferences("FIRSTRUN", MODE_PRIVATE);
        firsttime = getSharedPreferences("firsttime", MODE_PRIVATE);

        Yodo1Mas.getInstance().init(this, "fBKm8gUEIO", new Yodo1Mas.InitListener() {
            @Override
            public void onMasInitSuccessful() {
            }

            @Override
            public void onMasInitFailed(@NonNull Yodo1MasError error) {
            }
        });

        if(!isConnected())
        {
            progressDialog=new Dialog(MainActivity.this);
            progressDialog.setContentView(R.layout.dialog_layout);
            progressDialog.setCancelable(false);
            btn=progressDialog.findViewById(R.id.retry);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(isConnected())
                        progressDialog.dismiss();
                    else
                        Toast.makeText(MainActivity.this,"No Internet Access",Toast.LENGTH_SHORT).show();
                }
            });
            progressDialog.getWindow().setLayout(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT);
            progressDialog.show();
        }

        if(first()){
            SharedPreferences.Editor edit = firsttime.edit();
            edit.putBoolean("firstrun", false);
            edit.commit();
            language();
        }

        AppUpdateManager appUpdateManager= AppUpdateManagerFactory.create(MainActivity.this);
        Task<AppUpdateInfo> appUpdateInfoTask= appUpdateManager.getAppUpdateInfo();
        appUpdateInfoTask.addOnSuccessListener(new OnSuccessListener<AppUpdateInfo>() {
            @Override
            public void onSuccess(AppUpdateInfo result) {
                if(result.updateAvailability()== UpdateAvailability.UPDATE_AVAILABLE
                        && result.isUpdateTypeAllowed(AppUpdateType.IMMEDIATE))
                    try {
                        appUpdateManager.startUpdateFlowForResult(result,AppUpdateType.IMMEDIATE,MainActivity.this,REQUEST_CODE);
                    } catch (IntentSender.SendIntentException e) {
                        e.printStackTrace();
                    }
            }
        });


        getSupportFragmentManager().beginTransaction().replace(R.id.frame,fragment).commit();
        BottomNavigationView btnNav=findViewById(R.id.btn_nav);

        btnNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch(item.getItemId()) {
                    case R.id.book:
                        fragment = new book();
                        break;
                    case R.id.video:
                        fragment=new video();
                        break;
                    case R.id.notes:
                        fragment=new notes();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.frame,fragment).commit();
                return true;
            }

        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.hamburger,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case  R.id.share:
                Intent intent=new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                String Share="Download GURUKUL POLYTECHNIC Now :- https://play.google.com/store/apps/details?id=com.gap.mobigpk1&hl=en";
                String  sub="GURUKUL POLYTECHNIC";
                intent.putExtra(intent.EXTRA_SUBJECT,sub);
                intent.putExtra(intent.EXTRA_TEXT,Share);
                startActivity(Intent.createChooser(intent,"Share Using"));
                return true;

            case R.id.change_lang:
                language();
                break;

            case R.id.update:
                final String app=BuildConfig.APPLICATION_ID;
                try {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" +app)));
                }
                catch (android.content.ActivityNotFoundException anfe)
                {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.gap.mobigpk1&hl=en")));
                }
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==REQUEST_CODE){
            Toast.makeText(this,"Start Download",Toast.LENGTH_SHORT).show();
            if(resultCode!=RESULT_OK){
                Log.d("num","Update Flow failed"+resultCode);
            }
        }
    }

    private boolean language(){
        progressDialog=new Dialog(MainActivity.this);
        progressDialog.setContentView(R.layout.language);
        progressDialog.setCancelable(false);
        btn=progressDialog.findViewById(R.id.hindi);
        btn2=progressDialog.findViewById(R.id.english);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(check()){
                    SharedPreferences.Editor myEdit = sharedPreferences.edit();
                    myEdit.putString("Language", "H");
                    myEdit.commit();
                    Toast.makeText(MainActivity.this,"Hindi saved",Toast.LENGTH_SHORT).show();
                    progressDialog.dismiss();
                }
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(check()){
                    SharedPreferences.Editor myEdit = sharedPreferences.edit();
                    myEdit.putString("Language", "E");
                    myEdit.commit();
                    Toast.makeText(MainActivity.this,"English saved",Toast.LENGTH_SHORT).show();
                    progressDialog.dismiss();
                }

            }
        });

        progressDialog.getWindow().setLayout(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT);
        progressDialog.show();
        return  true;
    }

    private boolean isConnected()
    {
        ConnectivityManager connectivityManager = (ConnectivityManager) getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
        return connectivityManager.getActiveNetworkInfo()!=null && connectivityManager.getActiveNetworkInfo().isConnectedOrConnecting();
    }

    private boolean check(){
        String value = sharedPreferences.getString("Language","H");
        return value!=null;
    }

    private boolean first(){
        boolean value = firsttime.getBoolean("firstrun", true);
        return value;
    }
}

