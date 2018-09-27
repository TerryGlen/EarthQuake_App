package com.example.android.quakereport;

import java.util.Date;

public class Earthquake {

    private String mLocation;
    private Double mMagnitude;
    private String mDate;

    public Earthquake(String location, Double magnitute, String date){
        mLocation = location;
        mMagnitude = magnitute;
        mDate = date;

    }
    public Date getmDate() {
        return mDate;
    }
    public Double getmMagnitude() {
        return mMagnitude;
    }
    public String getmLocation() {
        return mLocation;
    }

}
