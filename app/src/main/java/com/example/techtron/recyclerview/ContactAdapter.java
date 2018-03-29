package com.example.techtron.recyclerview;

import android.support.v7.widget.RecyclerView;

public class ContactAdapter
    extends RecyclerView.Adapter(ContactAdapter.ViewHolder){

    public ViewHolder extends RecyclerView.ViewHolder{
        public TextView contactName;
        public Button messageButton;

        public ViewHolder(View itemView){
            super(itemView);

            contactName = (TextView) itemView.findViewById(R.id.tv_contactName);
            messageButton = (Button) itemView.findViewById(R.id.btn_message);
        }
    }
}
