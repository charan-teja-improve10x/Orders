package com.improve10x.orders;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

public class FoodDeliveryItemsViewHolder extends RecyclerView.ViewHolder {
    TextView deliveryTimeTxt;
    TextView costumerNameTxt;
    TextView addressTxt;
    TextView foodRatingTxt;
    TextView deliveryDateTxt;
    ImageView foodDeliveryItemIv;

    public FoodDeliveryItemsViewHolder(@NonNull View itemView) {
        super(itemView);
        deliveryTimeTxt = itemView.findViewById(R.id.delivery_time_txt);
        costumerNameTxt = itemView.findViewById(R.id.costemer_name_txt);
        addressTxt = itemView.findViewById(R.id.address_txt);
        foodRatingTxt = itemView.findViewById(R.id.food_rating_txt);
        deliveryDateTxt = itemView.findViewById(R.id.delevery_date_txt);
        foodDeliveryItemIv = itemView.findViewById(R.id.delevery_food_iv);
    }
}
