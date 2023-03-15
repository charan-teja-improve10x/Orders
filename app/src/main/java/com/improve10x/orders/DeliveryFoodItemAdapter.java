package com.improve10x.orders;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

public class DeliveryFoodItemAdapter extends RecyclerView.Adapter<FoodDeliveryItemsViewHolder> {
    FoodDeliveryItems[] items;

    public DeliveryFoodItemAdapter(FoodDeliveryItems[] foodDeliveryItems){
        items = foodDeliveryItems;
    }
    @NonNull
    @Override
    public FoodDeliveryItemsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.food_delevery_items,parent,false);
        FoodDeliveryItemsViewHolder viewHolder = new FoodDeliveryItemsViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull FoodDeliveryItemsViewHolder holder, int position) {
        FoodDeliveryItems item = items[position];
        holder.deliveryDateTxt.setText(item.deliveryDate);
        holder.deliveryTimeTxt.setText(item.deliveryTime);
        holder.costumerNameTxt.setText(item.costumerName);
        holder.addressTxt.setText(item.deliveryAddress);
        holder.foodRatingTxt.setText(item.foodRating);
        Picasso.get().load(item.foodUrl).into(holder.foodDeliveryItemIv);
    }

    @Override
    public int getItemCount() {
        return items.length;
    }
}
