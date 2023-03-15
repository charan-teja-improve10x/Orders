package com.improve10x.orders;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DeliveryItemViewHolder extends RecyclerView.ViewHolder {
    TextView itemNameTxt;
    TextView ratingTxt;
    ImageView imageIv;
    public DeliveryItemViewHolder(@NonNull View itemView) {
        super(itemView);
        itemNameTxt = itemView.findViewById(R.id.food_name_txt);
        ratingTxt = itemView.findViewById(R.id.rating_txt);
        imageIv = itemView.findViewById(R.id.item_image_iv);
    }
}
