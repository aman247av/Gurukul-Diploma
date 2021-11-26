package com.gap.mobigpk1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pro_managment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pro_managment);
        Button button1 = findViewById(R.id.btn1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1O11tb4IfoAzoDQTVM8wvZQtZfAkypI1S/view?usp=sharing"));
                startActivity(intent);
            }
        });
        Button button2 = findViewById(R.id.btn2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1-NqG80aCPsOFADd1hF9KpUWPy7InaJ8b/view?usp=sharing"));
                startActivity(intent);
            }
        });
        Button button3 = findViewById(R.id.btn3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1VRxaeSxhYqcLau_P-h40nOUfe_nhz0TH/view?usp=sharing"));
                startActivity(intent);
            }
        });
        Button button4 = findViewById(R.id.btn4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/153XtU1ur0czmDq6OruwNpZpv-2Yv7QH6/view?usp=sharing"));
                startActivity(intent);
            }
        });
        Button button5 = findViewById(R.id.btn5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1i4B7QC_w2kwZ1l9rwBNU1vSetikULtLx/view?usp=sharing"));
                startActivity(intent);
            }
        });
    }
}