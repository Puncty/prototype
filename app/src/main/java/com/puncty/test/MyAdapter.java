package com.puncty.test;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

//Adapter
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private Meeting[] meetings;
    private Context context;

    public MyAdapter(Context context, Meeting[] meetings) {
        this.context = context;
        this.meetings = meetings;
    }

    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.meeting_card, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Meeting meeting = meetings[position];
        holder.meetingPlace.setText("Ort: " + meeting.getPlace());
        holder.meetingDate.setText("Datum: " + ((meeting.getDate()[0]<10)?("0"+meeting.getDate()[0]):(meeting.getDate()[0])) + "." + ((meeting.getDate()[1]<10)?("0"+meeting.getDate()[1]):(meeting.getDate()[1])));
        holder.meetingTime.setText("Uhrzeit: " + meeting.getTime()[0] + ":" + ((meeting.getTime()[1]<10)?("0"+meeting.getTime()[1]):(meeting.getTime()[1])));

    }

    @Override
    public int getItemCount() {
        return meetings.length;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView meetingPlace;
        public TextView meetingDate;
        public TextView meetingTime;
        public TextView meetingMembers;
        public CardView cardView;

        public MyViewHolder(View itemView) {
            super(itemView);
            meetingPlace = itemView.findViewById(R.id.meetingPlace);
            meetingDate = itemView.findViewById(R.id.meetingDate);
            meetingTime = itemView.findViewById(R.id.meetingTime);
            meetingMembers = itemView.findViewById(R.id.meetingMembers);
            cardView = itemView.findViewById(R.id.cardView);

        }
    }
}
