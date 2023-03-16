package com.improve10x.orders;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

public class SoupItemAdapter extends RecyclerView.Adapter<SoupItemViewHolder> {
    SoupsItems[] items;

    public SoupItemAdapter(SoupsItems[] soupsItems){
        items = soupsItems;
    }
    @NonNull
    @Override
    public SoupItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.soup_items,parent,false);
        SoupItemViewHolder viewHolder = new SoupItemViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull SoupItemViewHolder holder, int position) {
        SoupsItems item = items[position];
        holder.soupNameTxt.setText(item.soupName);
        holder.soupAmountTxt.setText(item.soupAmount);
        holder.descriptionTxt.setText(item.description);
        Picasso.get().load(item.soupUrl).into(holder.soupIv);
    }

    @Override
    public int getItemCount() {
        return items.length;
    }
}
