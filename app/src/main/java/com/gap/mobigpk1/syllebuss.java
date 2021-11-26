package com.gap.mobigpk1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class syllebuss extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllebuss);

        Button button1 = findViewById(R.id.btn1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1vlgZJkqpq55qDBESRc3-xruR9Kx5W7Py/view?usp=drivesdk"));
                startActivity(intent);
            }
        });

        Button button2 = findViewById(R.id.btn2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1vzNM0PCDHKmAfNPpj5gpiNo_NFZ8KEdl/view?usp=drivesdk"));
                startActivity(intent);
            }
        });
        Button button3 = findViewById(R.id.btn3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1w6Sk3AmkCR6O8vNZQwr9G-LL4QTghsC6/view?usp=drivesdk"));
                startActivity(intent);
            }
        });
    }
}