package com.example.android.quakereport;

public class Earthquake {

    private String mLocation;
    private Double mMagnitude;
    private long mTimeInMilliseconds;

    public Earthquake(Double magnitute, String location, long time){
        mLocation = location;
        mMagnitude = magnitute;


        mTimeInMilliseconds = time;

    }
    public long getmTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }
    public Double getmMagnitude() {
        return mMagnitude;
    }
    public String getmLocation() {
        return mLocation;
    }

}
