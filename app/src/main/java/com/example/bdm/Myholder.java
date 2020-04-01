package com.example.bdm;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class Myholder extends RecyclerView.ViewHolder {
    ImageView mImageView;
    TextView mName_Product, mDes;

    public Myholder(@NonNull View itemView) {
        super(itemView);

        this.mImageView = itemView.findViewById(R.id.Imagevi);
        this.mDes = itemView.findViewById(R.id.Description);
        this.mName_Product = itemView.findViewById(R.id.Title);
    }
}
