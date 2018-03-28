package com.example.techtron.developer_recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class ContactsAdapter extends
    RecyclerView.Adapter<ContactsAdapter.ViewHolder>{

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView nameTextView;
        public Button messageButton;

        public ViewHolder(View itemView) {
            super(itemView);

            nameTextView = (TextView) itemView.findViewById(R.id.tv_contactName);
            messageButton = (Button) itemView.findViewById(R.id.btn_message);
        }
    }
}
