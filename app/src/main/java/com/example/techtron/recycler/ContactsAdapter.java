package com.example.techtron.recycler;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ContactsAdapter
    extends RecyclerView.Adapter<ContactsAdapter.ViewHolder>{

    //remember you are creating a custom view holder, just setting it up is all, that simple
    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView uName;
        public Button message;

        public ViewHolder(View itemView){
            super (itemView);

            uName = (TextView) itemView.findViewById(R.id.nameTV);
            message = (Button) itemView.findViewById(R.id.messageBTN);
        }

        //this is where it gets blurry, but i halfway knew it
        //declare variables set in constructor and make get context method
        List<Contacts> mContacts;
        Context mContext;

        public ContactsAdapter(List<Contacts> contacts, Context context){
            mContacts = contacts;
            mContext = context;
        }

        public Context getContext(){
            return mContext;
        }
    }



    @Override
    public ContactsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(ContactsAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
