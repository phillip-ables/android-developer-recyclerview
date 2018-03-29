package com.example.techtron.recycler;

public class Contacts {
    //what do you want
    String mName;
    boolean mOnline;

    //how you gonna get it
    public Contacts (String name, boolean online) {
        mName = name;
        mOnline = online;
    }

    //whats this class provide
    public String getName() {
        return mName;
    }

    public boolean isOnline() {
        return mOnline;
    }
}
