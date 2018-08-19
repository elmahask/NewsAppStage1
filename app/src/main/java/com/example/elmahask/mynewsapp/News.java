package com.example.elmahask.mynewsapp;

public class News {

    private String mTitle;
    private String mUrl;
    private String mSection;
    private String mDate;
    private String mAuthor;



    public News(String mUrl, String mTitle, String mSection, String mDate, String mAuthor) {
        this.mTitle = mTitle;
        this.mUrl = mUrl;
        this.mSection = mSection;
        this.mDate = mDate;
        this.mAuthor = mAuthor;
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

    public String getmAuthor() {
        return mAuthor;
    }
}
