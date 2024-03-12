package com.example.codeandcoffee;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity2 extends AppCompatActivity {
    private ImageButton btnPagetohome;
    private Button btnPage2;

    private ImageButton btnToProfile;
    boolean isDark;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);








        btnPage2=findViewById(R.id.btnCoffee2);
        btnPage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity2.this,cappuccinocheckout.class);
                startActivity(intent);
            }
        });


        btnPagetohome=findViewById(R.id.btn_to_home);
        btnPagetohome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity2.this,MainActivity.class);
                startActivity(intent);
            }
        });


        btnToProfile=findViewById(R.id.btnProfile);
        btnToProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity2.this,MainActivityProfile.class);
                startActivity(intent);
            }
        });
    }
}