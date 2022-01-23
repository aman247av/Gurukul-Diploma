package com.gap.mobigpk1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Window;
import android.view.WindowManager;

import java.util.Objects;

public class StartActivity extends AppCompatActivity {

    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_start);
         sharedPreferences = getSharedPreferences("FIRSTRUN",MODE_PRIVATE);

         if(check()){
             SharedPreferences.Editor myEdit = sharedPreferences.edit();
             myEdit.putString("Language", "H");
             myEdit.commit();
         }


        SystemClock.sleep(1000);
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        finish();
    }

    private boolean check(){
        String value = sharedPreferences.getString("Language",null);
        return value ==null;
    }
}