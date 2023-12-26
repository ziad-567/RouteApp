package com.example.routeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_android;
    Button btn_ios;
    Button btn_fullstack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_android = findViewById(R.id.btn_android);
        btn_ios = findViewById(R.id.btn_ios);
        btn_fullstack = findViewById(R.id.btn_fullstack);

        btn_android.setOnClickListener(this);
        btn_ios.setOnClickListener(this);
        btn_fullstack.setOnClickListener(this);

        }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_android){
            Intent intent = new Intent(MainActivity.this, AndroidActivity.class);
            startActivity(intent);
        }else if (view.getId() == R.id.btn_ios){
            Intent intent = new Intent(MainActivity.this, IosActivity.class);
            startActivity(intent);
        }else{
            Intent intent = new Intent(MainActivity.this, FullstackActivity.class);
            startActivity(intent);
        }
    }
}