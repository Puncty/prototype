package com.puncty.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button createMeetingsBtn;
    Button showMeetingsBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createMeetingsBtn = findViewById(R.id.createMeetingsBtn);
        showMeetingsBtn = findViewById(R.id.showMeetingsBtn);
    }

    public void changeToCreateMeetings(View view){
        Intent intentToCreateMeetings = new Intent(this, CreateMeetings.class);
        startActivity(intentToCreateMeetings);
    }
    public void changeToShowMeetings(View view){
        Intent intentToShowMeetings = new Intent(this, ShowMetings.class);
        startActivity(intentToShowMeetings);
    }
}