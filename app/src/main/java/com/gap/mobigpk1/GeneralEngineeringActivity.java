package com.gap.mobigpk1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GeneralEngineeringActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.general_engineering);
        Button button1 = findViewById(R.id.btn1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1FyhaMOuyTTll0okcokU46nfsrCBW5CNS/view?usp=sharing"));
                startActivity(intent);
            }
        });
        Button button2 = findViewById(R.id.btn2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1BMZqT_8fy66nSW5XRVD7_-NWN0QuZFs2/view?usp=sharing"));
                startActivity(intent);
            }
        });
        Button button3 = findViewById(R.id.btn3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1WcISeP6i0kbS3DbcOumZuldxN-Ewk7U7/view?usp=sharing"));
                startActivity(intent);
            }
        });
        Button button4 = findViewById(R.id.btn4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/16vVraSbVFlqOhKB7VZB8ezh5SkNsbieY/view?usp=sharing"));
                startActivity(intent);
            }
        });
        Button button5 = findViewById(R.id.btn5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1jHhMSgDGFI-ASiWVLc2BDxq9Z_mfc0-q/view?usp=sharing"));
                startActivity(intent);
            }
        });
        Button button6 = findViewById(R.id.btn6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1Ww-dUAHQYmeEFwtoXpZlEDdJORhi41SQ/view?usp=sharing"));
                startActivity(intent);
            }
        });
        Button button7 = findViewById(R.id.btn7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1ogr_C1u1stYPWGAe3q49NGyvDopn8z0_/view?usp=sharing"));
                startActivity(intent);
            }
        });
        Button button8 = findViewById(R.id.btn8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1S7KCh9K_cUzGp2_vhOTzjihLTkr_bSEU/view?usp=sharing"));
                startActivity(intent);
            }
        });
        Button button9 = findViewById(R.id.btn9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/16l8a8C_cQCLqQHeyvVgXlO2nJdu7wacP/view?usp=sharing"));
                startActivity(intent);
            }
        });
        Button button10 = findViewById(R.id.btn10);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1FhWIvVgV2vplY-00M7YDx4gcKbp5wfLc/view?usp=sharing"));
                startActivity(intent);
            }
        });
        Button button11 = findViewById(R.id.btn11);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1hR93GZ7BDjJfvw2hHL_dHS9gZoMv8atg/view?usp=sharing"));
                startActivity(intent);
            }
        });
        Button button12 = findViewById(R.id.btn12);
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/14GJpDJ8ROS8Jqb4O9Qnxsv7EuBAjA60V/view?usp=sharing"));
                startActivity(intent);
            }
        });
    }
}