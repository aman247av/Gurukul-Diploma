package com.gap.mobigpk1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class automobile extends AppCompatActivity {
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_automobile);
        Button button1 = findViewById(R.id.btn1);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1Zs8CydMY0yLs3NFOSup5VpC1aIZU1h-u/view?usp=sharing"));
                startActivity(intent);
            }
        });
        Button button2 = findViewById(R.id.btn2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1cyc5CvABQUprxU5lltVY3uZM-Y8WF0ye/view?usp=sharing"));
                startActivity(intent);
            }
        });
        Button button3 = findViewById(R.id.btn3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1uNvWigt4ME_WSV7VrbWQo4ByGzVi-LSU/view?usp=sharing"));
                startActivity(intent);
            }
        });
        Button button4 = findViewById(R.id.btn4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1HDBYJX-Qz7y1t_BR_e0HJFalCyMucuuS/view?usp=sharing"));
                startActivity(intent);
            }
        });
        Button button5 = findViewById(R.id.btn5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/18Z42i_azQ5JTE9G3NzAzwpAKchD0Q0Sa/view?usp=sharing"));
                startActivity(intent);
            }
        });
        Button button6 = findViewById(R.id.btn6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1-wdEOnP-um2p5qGNpbuOIUyr7Uj4CXt1/view?usp=sharing"));
                startActivity(intent);
            }
        });
        Button button7 = findViewById(R.id.btn7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1knwAosvadkiqOO4I_LxHg0RkktCdyn5C/view?usp=sharing"));
                startActivity(intent);
            }
        });
    }
}