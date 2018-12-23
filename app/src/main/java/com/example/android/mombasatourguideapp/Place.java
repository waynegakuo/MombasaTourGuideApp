package com.example.android.mombasatourguideapp;

public class Place {
    private String mPlace;
    private String mInfo;
    private int mImageResourceID= NO_IMAGE; //image resource ID for the track
    private static final int NO_IMAGE=-1;

    /**
     *
     * @param placeName is the name of the location
     * @param info is the information of the place
     */
    public Place (String placeName, String info){
        mPlace=placeName;
        mInfo=info;
    }
    /**
     *
     * @param placeName is the name of the location
     * @param info is the information on the place
     * @param imageResourceID is the drawable resource ID associated with the track
     */
    public Place (String placeName, String info, int imageResourceID){
        mPlace=placeName;
        mInfo=info;
        mImageResourceID=imageResourceID;
    }
    public String getmPlace(){
        return mPlace;
    }
    public String getmInfo(){
        return mInfo;
    }
    public int getImageResourceId(){
        return mImageResourceID;
    }

    /**
     *
     * @return whether or not the track has an image or not
     */
    public boolean hasImage(){
        return mImageResourceID!=NO_IMAGE;
    }
}
