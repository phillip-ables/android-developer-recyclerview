package com.example.techtron.recycler;

import java.util.ArrayList;

public class Contacts {
    //what do you want
    private String mName;
    private boolean mOnline;

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

    public ArrayList<Contacts> createContactsList(int numContacts){
        ArrayList<Contacts> contacts  = new ArrayList<Contacts>();

        for (int i = 1; i <numContacts; i++){
            contacts.add(new Contacts("Person "+i, i < numContacts/2));
        }
        return contacts;
    }
}
