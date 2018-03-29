package com.example.techtron.recyclerview;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class ContactsAdapter
    extends RecyclerView.Adapter<ContactsAdapter.ViewHolder>{

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView contactName;
        Button message;

        public ViewHolder(View itemView){
            super(itemView);

            contactName = (TextView) itemView.findViewById(R.id.tv_contactName);
            message = (Button) itemView.findViewById(R.id.btn_message);
        }
    }

    private ArrayList<Contact> mContacts;
    private Context mContext;

    public ContactsAdapter(Context context, ArrayList<Contact> contacts){
        mContacts = contacts;
        mContext = context;
    }

    private Context getContext(){
        return mContext;
    }


    @Override
    public ContactsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View contactView = inflater.inflate(R.layout.item_contact, parent, false);

        ViewHolder viewHolder = new ViewHolder(contactView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ContactsAdapter.ViewHolder holder, int position) {
        Contact contact = mContacts.get(position);

        TextView textView = holder.contactName;
        textView.setText(contact.getName());

        Button button = holder.message;
        button.setText(contact.isOnline() ? "Message" : "Offline");
        button.setEnabled(contact.isOnline());
    }

    @Override
    public int getItemCount() {
        return mContacts.size();
    }
}
