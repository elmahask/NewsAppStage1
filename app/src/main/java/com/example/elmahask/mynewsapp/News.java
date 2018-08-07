package com.example.elmahask.mynewsapp;

public class News {

    private String mTitle;
    private String mUrl;
    private String mSection;
    private String mDate;
    private String mPillarName;

    public News(String mUrl, String mTitle, String mSection, String mDate, String mPillarName) {
        this.mTitle = mTitle;
        this.mUrl = mUrl;
        this.mSection = mSection;
        this.mDate = mDate;
        this.mPillarName = mPillarName;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmUrl() {
        return mUrl;
    }

    public String getmSection() {
        return mSection;
    }

    public String getmDate() {
        return mDate;
    }

    public String getmPillarName() {
        return mPillarName;
    }
}
