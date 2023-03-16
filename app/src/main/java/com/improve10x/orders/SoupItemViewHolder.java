package com.improve10x.orders;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SoupItemViewHolder extends RecyclerView.ViewHolder {
    TextView soupNameTxt;
    ImageView soupIv;
    TextView descriptionTxt;
    TextView soupAmountTxt;
    public SoupItemViewHolder(@NonNull View itemView) {
        super(itemView);
        soupNameTxt = itemView.findViewById(R.id.soup_name_txt);
        soupAmountTxt = itemView.findViewById(R.id.soup_amount_txt);
        descriptionTxt = itemView.findViewById(R.id.description_txt);
        soupIv = itemView.findViewById(R.id.soup_iv);
    }
}
