package com.puncty.test;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import com.puncty.lib.Meetup;
import com.puncty.lib.MeetupCollection;
import com.puncty.lib.Session;
import com.puncty.lib.exceptions.BrokenResponse;
import com.puncty.lib.networking.Requester;

import java.util.Date;

public class CreateMeetings extends AppCompatActivity {

    public Session s;
    public MeetupCollection mc;

    public EditText editTextDate;
    public EditText editTextTime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_meetings);
        editTextDate = findViewById(R.id.editTextDate);
        editTextTime = findViewById(R.id.editTextTime);

        Requester r = new Requester("http://localhost:3000");
        Session s = null;
        try {
            s = Session.login(r, "test@test.com", "1234");
        } catch (BrokenResponse e) {
            System.out.println(e);
        }

        mc = new MeetupCollection(s);
    }

    private void createMeetingButton(){
        Date meeting = new Date();
    }
}