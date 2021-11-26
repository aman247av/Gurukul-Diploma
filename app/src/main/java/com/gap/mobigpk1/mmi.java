package com.gap.mobigpk1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mmi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mmi);
        Button button1 = findViewById(R.id.btn1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/19gu_TYmGn3TX_rTywiiIRlZGWjtoz-0P/view?usp=sharing"));
                startActivity(intent);
            }
        });
        Button button2 = findViewById(R.id.btn2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1IX-khZVRJQJmUNwl2QHZb9M6r3lJteGL/view?usp=sharing"));
                startActivity(intent);
            }
        });
        Button button3 = findViewById(R.id.btn3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/11954I3-yaOeQ9ouJsw4nfa-RSp-TgGAS/view?usp=sharing"));
                startActivity(intent);
            }
        });
        Button button4 = findViewById(R.id.btn4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1kR7g4d5SROAbpxq7-iaH0lUgnUKhKs1e/view?usp=sharing"));
                startActivity(intent);
            }
        });
        Button button5 = findViewById(R.id.btn5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1XWa9ufMX4otMYptgiPzmB6XMcmho2nOA/view?usp=sharing"));
                startActivity(intent);
            }
        });
        Button button6 = findViewById(R.id.btn6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1P1A6FUMkzAttY4Y7qWzsGNsfUTPQpaeW/view?usp=sharing"));
                startActivity(intent);
            }
        });
        Button button7 = findViewById(R.id.btn7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1PEw1CWOKz-itupHGAgAPhDpK970jzCV0/view?usp=sharing"));
                startActivity(intent);
            }
        });
        Button button8 = findViewById(R.id.btn8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1V_mpQJIuzq7gQmBEvGt7IruIeHSBwdrE/view?usp=sharing"));
                startActivity(intent);
            }
        });
        Button button9 = findViewById(R.id.btn9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1Te_2HzSGeDR3_uc6ePe1Dc3QfWjrBkDD/view?usp=sharing"));
                startActivity(intent);
            }
        });
        Button button10 = findViewById(R.id.btn10);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1bfG-6Uo3QZy-2CZxY2L-tvrJhQi3oZJ-/view?usp=sharing"));
                startActivity(intent);
            }
        });
        Button button11 = findViewById(R.id.btn11);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1n2la8nFa760-c1CCxcRVOtM_jJxGINdF/view?usp=sharing"));
                startActivity(intent);
            }
        });
        Button button12 = findViewById(R.id.btn12);
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1oXq3Cste_MCkr90qO85HPNdNprwJwwAv/view?usp=sharing"));
                startActivity(intent);
            }
        });
        Button button13 = findViewById(R.id.btn13);
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1zVd0NJlwBBTtEU_ypgk4mP2LKXsSznNL/view?usp=sharing"));
                startActivity(intent);
            }
        });
    }
}