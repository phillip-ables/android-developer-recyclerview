package com.example.techtron.recyclerdeveloper;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

public class AuthorsAdapter extends RecyclerView.Adapter<AuthorsAdapter.ViewHolder>{
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView nameTextView;
        public Button readButton;
        public ViewHolder(View itemView) {
            super(itemView);
            nameTextView = (TextView) itemView.findViewById(R.id.author_name);
            readButton = (Button) itemView.findViewById(R.id.read_author);
        }
    }
    private List<AuthorsList>  mAuthors;
    private Context mContext;

    public AuthorsAdapter(Context context, List<AuthorsList> authors){
        mContext = context;
        mAuthors = authors;
    }
    private Context getContext(){
        return mContext;
    }
}
