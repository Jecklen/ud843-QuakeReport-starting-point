package com.example.android.quakereport;

/**
 * Created by Mike on 1/12/2017.
 */

public class Earthquake {

    /** Magnitude of the Earthquake */
    private double mMagnitude;

    /** Location of the Earthquake */
    private String mLocation;

    /** Date of the Earthquake */
    private int mDate;


    /** Setter Method Established */
    public Earthquake(double magnitude, String location, int date){
        mMagnitude = magnitude;
        mLocation = location;
        mDate = date;
    }


    /** Getter Method Established */
    public double getMagnitude(){return mMagnitude;}
    public String getLocation(){return mLocation;}
    public int getDate(){return mDate;}
}
