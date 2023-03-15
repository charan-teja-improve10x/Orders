package com.improve10x.orders;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

public class DeliveryItemAdapter extends RecyclerView.Adapter<DeliveryItemViewHolder> {
    FoodDleveryItems[] items;

    public DeliveryItemAdapter(FoodDleveryItems[] deliveryItems){
        items = deliveryItems;
    }
    @NonNull
    @Override
    public DeliveryItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.delevery_items,parent,false);
        DeliveryItemViewHolder viewHolder = new DeliveryItemViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull DeliveryItemViewHolder holder, int position) {
        FoodDleveryItems item = items[position];
        holder.itemNameTxt.setText(item.itemName);
        holder.ratingTxt.setText(item.rating);
        Picasso.get().load(item.imageUrl).into(holder.imageIv);
    }

    @Override
    public int getItemCount() {
        return items.length;
    }
}
