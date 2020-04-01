package com.example.bdm;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Myadapter extends RecyclerView.Adapter<Myholder> {

    Context context;
    ArrayList<Model> models;

    public Myadapter(Context context, ArrayList<Model> models) {
        this.context = context;
        this.models = models;
    }

    @NonNull
    @Override
    public Myholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, null);

        return new Myholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Myholder holder, int position) {
        holder.mName_Product.setText(models.get(position).getName_Products());
        holder.mDes.setText(models.get(position).getDescription());
holder.mImageView.setImageResource(models.get(position).getImg());

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
