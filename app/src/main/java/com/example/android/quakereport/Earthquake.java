package com.example.android.quakereport;

public class Earthquake {

    private String mLocation;
    private Double mMagnitude;
    private long mTimeInMilliseconds;
    private String mUrl;


    public Earthquake(Double magnitute, String location, long time, String url){
        mLocation = location;
        mMagnitude = magnitute;
        mTimeInMilliseconds = time;
        mUrl = url;

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
    public String getUrl() {return mUrl;}

}
