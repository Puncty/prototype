package com.puncty.test;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import com.puncty.lib.Meetup;
import com.puncty.lib.MeetupCollection;
import com.puncty.lib.Session;
import com.puncty.lib.exceptions.BrokenResponse;
import com.puncty.lib.exceptions.UserAlreadyExists;
import com.puncty.lib.networking.Requester;

import java.util.Date;

public class CreateMeetings extends AppCompatActivity {

    public Session s;
    public MeetupCollection mc;

    public EditText editTextDate;
    public EditText editTextTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //create everything
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_meetings);
        editTextDate = findViewById(R.id.editTextDate);
        editTextTime = findViewById(R.id.editTextTime);

        Session s;
        try {
            s = ensuredSession();
        } catch (BrokenResponse e) {
            return;
        }

        mc = new MeetupCollection(s);
    }

    private void createMeetingButton(){
        Date meeting = new Date();
    }

    public Session ensuredSession() throws BrokenResponse {
        Requester r = new Requester("https://puncty.johannespour.de");
        Session s;
        try {
            s = Session.register(r, "SomeUser", "some@email.com", "SomePassword");
        } catch (UserAlreadyExists e) {
            s = Session.login(r, "some@email.com", "SomePassword");
        }

        return s;
    }
}