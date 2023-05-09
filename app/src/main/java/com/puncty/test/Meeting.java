package com.puncty.test;

public class Meeting {
    private String place;
    private int day;
    private int month;
    private int hour;
    private int minute;
    private String[] members;
    private String color;

    //Constructor
    public Meeting(String place, int day, int month, int hour, int minute){
        this.place = place;
        this.day = day;
        this.month = month;
        this.hour = hour;
        this.minute = minute;
    }

    //get Methods
    public String getPlace(){
        return place;
    }
    public int[] getDate(){
        int[] date = {day, month};
        return date;
    }
    public int[] getTime(){
        int[] time = {hour, minute};
        return time;
    }
    public String[] getMembers(){
        return members;
    }


}
