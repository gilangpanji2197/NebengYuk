package com.example.gilang.nebengyuk;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {


    View view;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
    }

    public void setDetails(Context ctx, String title, String description) {
        TextView mTitleView = view.findViewById(R.id.rTitleTv);
        TextView mDetailTv = view.findViewById(R.id.rDescriptionTv);
        mTitleView.setText(title);
        mDetailTv.setText(description);

    }
}