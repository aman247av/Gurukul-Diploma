package com.gap.mobigpk1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.yodo1.mas.Yodo1Mas;
import com.yodo1.mas.error.Yodo1MasError;
import com.yodo1.mas.event.Yodo1MasAdEvent;

public class me11 extends AppCompatActivity {

    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_me11);
        sharedPreferences = getSharedPreferences("FIRSTRUN",MODE_PRIVATE);


        if(check()){
            Toast.makeText(getApplicationContext(), "E", Toast.LENGTH_SHORT).show();
        }
        else
            Toast.makeText(getApplicationContext(), "H", Toast.LENGTH_SHORT).show();

        Button button1 = findViewById(R.id.btn1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Yodo1Mas.getInstance().showInterstitialAd(me11.this);
                Yodo1Mas.getInstance().setInterstitialListener(new Yodo1Mas.InterstitialListener() {
                    @Override
                    public void onAdOpened(@NonNull Yodo1MasAdEvent event) {
                    }

                    @Override
                    public void onAdError(@NonNull Yodo1MasAdEvent event, @NonNull Yodo1MasError error) {

                    }

                    @Override
                    public void onAdClosed(@NonNull Yodo1MasAdEvent event) {
                        Intent intent=new Intent(me11.this,Math1aActivity.class);
                        startActivity(intent);
                    }
                });

            }
        });
        Button button2 = findViewById(R.id.btn2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(me11.this,app_chem.class);
                startActivity(intent);
            }
        });
        Button button3 = findViewById(R.id.btn3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(me11.this,AppPhyActivity.class);
                startActivity(intent);
            }
        });
        Button button4 = findViewById(R.id.btn4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(me11.this,EdAllActivity.class);
                startActivity(intent);
            }
        });
        Button button5 = findViewById(R.id.btn5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(me11.this,Cummunication1Activity.class);
                startActivity(intent);
            }
        });
        Button button6 = findViewById(R.id.btn6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(me11.this,BITActivity.class);
                startActivity(intent);
            }
        });
        Button button7 = findViewById(R.id.btn7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(me11.this,WorkshopActivity.class);
                startActivity(intent);
            }
        });
    }


    private boolean check(){
        String value = sharedPreferences.getString("Language","H");
        return !value.equals("H");
    }
}
