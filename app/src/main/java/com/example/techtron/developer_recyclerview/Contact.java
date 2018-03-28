package com.example.techtron.developer_recyclerview;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Contact {
    String mName;
    boolean mOnline;

    public Contact(String name, boolean online) {
        mName = name;
        mOnline = online;
    }

    public String getName() {
        return mName;
    }

    public boolean getOnline() {
        return mOnline;
    }

}