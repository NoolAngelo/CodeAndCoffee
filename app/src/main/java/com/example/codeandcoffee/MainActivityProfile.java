package com.example.codeandcoffee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivityProfile extends AppCompatActivity {
    private ImageButton btn_back_to_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_profile);

        btn_back_to_main=findViewById(R.id.btnback_to_main);
        btn_back_to_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivityProfile.this,MainActivity2.class);
                startActivity(intent);
            }
        });
    }
}