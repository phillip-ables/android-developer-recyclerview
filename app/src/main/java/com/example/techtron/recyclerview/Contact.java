package com.example.techtron.recyclerview;

public class Contact {
    String mName;
    boolean mOnline;

    public Contact(String name, boolean online){
        mName = name;
        mOnline = online;
    }

    public String getName() {
        return mName;
    }

    public boolean isOnline(){
        return mOnline;
    }

    int lastContactId = 0;

    

}
