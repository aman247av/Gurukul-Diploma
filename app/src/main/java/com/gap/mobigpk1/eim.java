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

public class eim extends AppCompatActivity {
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eim);
        setContentView(R.layout.activity_el11);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        Button button1 = findViewById(R.id.btn1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1tPdhpigSCKJCiF_0puv9y2KZJaxTu5LS/view?usp=sharing"));
                startActivity(intent);
            }
        });
        Button button2 = findViewById(R.id.btn2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1i-gof_mvvCUFp5elbCKtFtsdxGjDyTSY/view?usp=sharing"));
                startActivity(intent);
            }
        });
        Button button3 = findViewById(R.id.btn3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1yLOK6cpLTfK_a5oteHyDKPYdI7GvSS_0/view?usp=sharing"));
                startActivity(intent);
            }
        });
        Button button4 = findViewById(R.id.btn4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1KjHiPayHcYl5C-ao8gaCIIopq9fTIror/view?usp=sharing"));
                startActivity(intent);
            }
        });
        Button button5 = findViewById(R.id.btn5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1JOdDMRrb1Pd0lsWISTCgB1EWDTxpDv0e/view?usp=sharing"));
                startActivity(intent);
            }
        });
        Button button6 = findViewById(R.id.btn6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1o-IBtrIdtTfNqbcnSuEw393FAGzibUfS/view?usp=sharing"));
                startActivity(intent);
            }
        });
        Button button7 = findViewById(R.id.btn7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1ZRskuSqY9zrqXCRlRzwlwsKUJU0Y0qdH/view?usp=sharing"));
                startActivity(intent);
            }
        });
        Button button8 = findViewById(R.id.btn8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1OuubqlG9x-7kvNikTjuCpDJhVfjuOjb2/view?usp=sharing"));
                startActivity(intent);
            }
        });
        Button button9 = findViewById(R.id.btn9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1ulU_l4tOaYZXnf5RIOdkVxsGPydx860r/view?usp=sharing"));
                startActivity(intent);
            }
        });
        Button button10 = findViewById(R.id.btn10);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1iUABdSeMx_vVlSsAcVv0Fv5R57Rfijst/view?usp=sharing"));
                startActivity(intent);
            }
        });
        Button button11 = findViewById(R.id.btn11);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1CcmxezRVJlYhRj6Svrex3TIe0wB9vfG9/view?usp=sharing"));
                startActivity(intent);
            }
        });
        Button button12 = findViewById(R.id.btn12);
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1Inb-gB-9fOvB5ml7IQzjUJpo_jEEpNfD/view?usp=sharing"));
                startActivity(intent);
            }
        });
        Button button13 = findViewById(R.id.btn13);
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1VJWaJupTlmfJ94wakVEwaLIH6tXRIttD/view?usp=sharing"));
                startActivity(intent);
            }
        });
        Button button14 = findViewById(R.id.btn14);
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1rLNApytfvNYoAwD_BnIITvXJ4AoNEtmL/view?usp=sharing"));
                startActivity(intent);
            }
        });
        Button button15 = findViewById(R.id.btn15);
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/10fjY1Gy8F1rrwNbHPxq0ae4owi93oSxE/view?usp=sharing"));
                startActivity(intent);
            }
        });
        Button button16 = findViewById(R.id.btn16);
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1T9E5kZUswwNVdmEdnt8hGx-kWzoASBfd/view?usp=sharing"));
                startActivity(intent);
            }
        });
        Button button17 = findViewById(R.id.btn17);
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1ZDFLQy3ptFhyenzqD8iQgbsLporacaa0/view?usp=sharing"));
                startActivity(intent);
            }
        });
        Button button18 = findViewById(R.id.btn18);
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1DJNp0ocIsVJa2xMawVv0PznJmdb7D4dK/view?usp=sharing"));
                startActivity(intent);
            }
        });
        Button button19 = findViewById(R.id.btn19);
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1Aa2ZnoPLeSGKFdULJcYr1-Sm-3UuP63s/view?usp=sharing"));
                startActivity(intent);
            }
        });
        Button button20 = findViewById(R.id.btn20);
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1t6By4zKuMqiFN4uoDx7zeO8P7zc4TdGD/view?usp=sharing"));
                startActivity(intent);
            }
        });
        Button button21 = findViewById(R.id.btn21);
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1q81EA4ljN-u_QrDx2KAk-ktsq9iNrQq3/view?usp=sharing"));
                startActivity(intent);
            }
        });
        Button button22 = findViewById(R.id.btn22);
        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1qaflGfjwQhiBLDUM_pFoeQ7S-gKGt7Ai/view?usp=sharing"));
                startActivity(intent);
            }
        });
        Button button23 = findViewById(R.id.btn23);
        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/12UeXRcCjJ4ycCG5EM4QUZxTwQo0hHk1E/view?usp=sharing"));
                startActivity(intent);
            }
        });
        Button button24 = findViewById(R.id.btn24);
        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1VeJ8twleK_RzYG9qQMdqs0nF4GAY37J_/view?usp=sharing"));
                startActivity(intent);
            }
        });
        Button button25 = findViewById(R.id.btn25);
        button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1inWd8mKGEoqLXBjQANSeW58h7IkOREla/view?usp=sharing"));
                startActivity(intent);
            }
        });
        Button button26 = findViewById(R.id.btn26);
        button26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1JnD4IooBqMBfXZGgCxo0tz8RY7Hi7fAu/view?usp=sharing"));
                startActivity(intent);
            }
        });
        Button button27 = findViewById(R.id.btn27);
        button27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1OUTf9m7DAINVNLk6qKPJCFqAAzSJMDHv/view?usp=sharing"));
                startActivity(intent);
            }
        });
        Button button28 = findViewById(R.id.btn28);
        button28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1h64Xb2h-ASL5wtIF5ojzChHMTd4WjUxK/view?usp=sharing"));
                startActivity(intent);
            }
        });
        Button button29 = findViewById(R.id.btn29);
        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/15_h3tcktpJQpAKcMELlkF-oEszwv3ZqG/view?usp=sharing"));
                startActivity(intent);
            }
        });
    }
}