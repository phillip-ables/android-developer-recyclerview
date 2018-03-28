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

    public String getName(){
        return mName;
    }

    public boolean getOnline(){
        return mOnline;
    }

    public static int lastContactId = 0;

    public static ArrayList<Contact> createContactList(int numContacts) {
        ArrayList<Contact> contacts = new ArrayList<Contact>();

        for (int i = 0; i < numContacts; i++){
            contacts.add(new Contact("Person "+i, i< numContacts/2));
        }
        return contacts;
    }
}
