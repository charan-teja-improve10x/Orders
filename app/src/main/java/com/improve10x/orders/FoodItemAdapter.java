package com.improve10x.orders;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FoodItemAdapter extends RecyclerView.Adapter<FoodItemViewHolder> {
    FoodItems[] items;
    public FoodItemAdapter(FoodItems[] foodItems){
        items = foodItems;
    }

    @NonNull
    @Override
    public FoodItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.food_items,parent,false);
        FoodItemViewHolder viewHolder = new FoodItemViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull FoodItemViewHolder holder, int position) {
        FoodItems item = items[position];
        holder.orderNumberTxt.setText(item.orderNumber);
        holder.orderTimeTxt.setText(item.orderTime);
        holder.orderPriceTxt.setText(item.orderPrice);
        holder.orderStatusTxt.setText(item.orderStatus);
        holder.orderItemsTxt.setText(item.orderedItems);
    }

    @Override
    public int getItemCount() {
        return items.length;
    }
}
