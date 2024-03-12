package com.example.codeandcoffee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;

public class cappuccinocheckout extends AppCompatActivity {
    private ImageButton btnPage3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        btnPage3=findViewById(R.id.btnback);
        btnPage3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(cappuccinocheckout.this,MainActivity2.class);
                startActivity(intent);
            }
        });
    }
}