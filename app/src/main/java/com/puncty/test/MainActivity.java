package com.puncty.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button toMainScreenBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toMainScreenBtn = findViewById(R.id.button2);
    }

    public void toMainScreen(View view){
        Intent toMainScreenIntent = new Intent(this, MainMenu.class);
        startActivity(toMainScreenIntent);
    }
}