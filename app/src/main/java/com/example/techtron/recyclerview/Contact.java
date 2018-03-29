package com.example.techtron.recyclerview;

import java.util.ArrayList;

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

    private static int lastContactId = 0;

    public static ArrayList<Contact> createContactList(int numContacts) {
        ArrayList<Contact> contacts = new ArrayList<Contact>();

        for(int i = 0; i < numContacts; i++){
            contacts.add(new Contact("Person "+lastContactId, i < numContacts/2));
        }
        return contacts;
    }

}
