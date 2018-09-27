package com.example.android.quakereport;

import java.util.Date;

public class Earthquake {

    private String mLocation;
    private Double mMagnitude;
    private String mDate;

    public Earthquake(Double magnitute, String location, String date){
        mLocation = location;
        mMagnitude = magnitute;
        mDate = date;

    }
    public String getmDate() {
        return mDate;
    }
    public Double getmMagnitude() {
        return mMagnitude;
    }
    public String getmLocation() {
        return mLocation;
    }

}
