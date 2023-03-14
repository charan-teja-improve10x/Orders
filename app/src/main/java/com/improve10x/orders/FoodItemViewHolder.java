package com.improve10x.orders;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FoodItemViewHolder extends RecyclerView.ViewHolder {
    TextView orderNumberTxt;
    TextView orderTimeTxt;
    TextView orderPriceTxt;
    TextView orderStatusTxt;
    TextView orderItemsTxt;
    public FoodItemViewHolder(@NonNull View itemView) {
        super(itemView);
        orderNumberTxt = itemView.findViewById(R.id.order_number_txt);
        orderTimeTxt = itemView.findViewById(R.id.order_time_txt);
        orderPriceTxt = itemView.findViewById(R.id.order_price_txt);
        orderStatusTxt = itemView.findViewById(R.id.order_status_txt);
        orderItemsTxt = itemView.findViewById(R.id.orderd_items_txt);
    }
}
