package com.improve10x.orders;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class FoodDeliveryItemsActivity extends AppCompatActivity {
    FoodDeliveryItems[] foodDeliveryItems;
    RecyclerView foodDeliveryItemsRv;
    DeliveryFoodItemAdapter deliveryFoodItemAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_delivery_items);
        initViews();
        createDummyData();
        createAdapter();
        connectAdapter();
    }

    private void initViews() {
        foodDeliveryItemsRv = findViewById(R.id.food_delevery_items_rv);
    }

    public void createDummyData(){
        foodDeliveryItems = new FoodDeliveryItems[6];

        foodDeliveryItems[0] = new FoodDeliveryItems();
        foodDeliveryItems[0].foodUrl = "https://images.indianexpress.com/2019/01/raan-e-sikandari-at-punjab-grill-759.jpg";
        foodDeliveryItems[0].deliveryDate = "MONDAY 31";
        foodDeliveryItems[0].deliveryTime = "USUALLY APPEARS WITH IN 12 MIN";
        foodDeliveryItems[0].foodRating = "⭐4.5";
        foodDeliveryItems[0].deliveryAddress = "ARABIC INTERNATIONAL";
        foodDeliveryItems[0].costumerName = "B's Balkans H...";

        foodDeliveryItems[1] = new FoodDeliveryItems();
        foodDeliveryItems[1].foodUrl = "https://i.pinimg.com/736x/9c/18/70/9c1870b7f41e8d80049bf3f0fef96400.jpg";
        foodDeliveryItems[1].deliveryDate = "TUESDAY 12";
        foodDeliveryItems[1].deliveryTime = "USUALLY APPEARS WITH IN 28 MIN";
        foodDeliveryItems[1].foodRating = "⭐4.8";
        foodDeliveryItems[1].deliveryAddress = "SYRIAN ARABIC";
        foodDeliveryItems[1].costumerName = "Syriana";


        foodDeliveryItems[2] = new FoodDeliveryItems();
        foodDeliveryItems[2].foodUrl = "https://i0.wp.com/www.lifewelive101.com/wp-content/uploads/2021/07/Arabian-MUtton-Mandi-recipe-scaled.jpg?resize=768%2C433&ssl=1";
        foodDeliveryItems[2].deliveryDate = "THURSDAY 14";
        foodDeliveryItems[2].deliveryTime = "USUALLY APPEARS WITH IN 12 MIN";
        foodDeliveryItems[2].foodRating = "⭐4.5";
        foodDeliveryItems[2].deliveryAddress = "ARABIC INTERNATIONAL";
        foodDeliveryItems[2].costumerName = "B's Balkans H...";


        foodDeliveryItems[3] = new FoodDeliveryItems();
        foodDeliveryItems[3].foodUrl = "https://i.pinimg.com/736x/9c/18/70/9c1870b7f41e8d80049bf3f0fef96400.jpg";
        foodDeliveryItems[3].deliveryDate = "THURSDAY 31";
        foodDeliveryItems[3].deliveryTime = "USUALLY APPEARS WITH IN 28 MIN";
        foodDeliveryItems[3].foodRating = "⭐4.8";
        foodDeliveryItems[3].deliveryAddress = "SYRIAN ARABIC";
        foodDeliveryItems[3].costumerName = "Syriana";


        foodDeliveryItems[4] = new FoodDeliveryItems();
        foodDeliveryItems[4].foodUrl = "https://images.indianexpress.com/2019/01/raan-e-sikandari-at-punjab-grill-759.jpg";
        foodDeliveryItems[4].deliveryDate = "MONDAY 31";
        foodDeliveryItems[4].deliveryTime = "USUALLY APPEARS WITH IN 12 MIN";
        foodDeliveryItems[4].foodRating = "⭐4.5";
        foodDeliveryItems[4].deliveryAddress = "ARABIC INTERNATIONAL";
        foodDeliveryItems[4].costumerName = "B's Balkans H...";


        foodDeliveryItems[5] = new FoodDeliveryItems();
        foodDeliveryItems[5].foodUrl = "https://i0.wp.com/www.lifewelive101.com/wp-content/uploads/2021/07/Arabian-MUtton-Mandi-recipe-scaled.jpg?resize=768%2C433&ssl=1";
        foodDeliveryItems[5].deliveryDate = "THURSDAY 31";
        foodDeliveryItems[5].deliveryTime = "USUALLY APPEARS WITH IN 28 MIN";
        foodDeliveryItems[5].foodRating = "⭐4.8";
        foodDeliveryItems[5].deliveryAddress = "SYRIAN ARABIC";
        foodDeliveryItems[5].costumerName = "Syriana";
    }

    public void createAdapter(){
        deliveryFoodItemAdapter = new DeliveryFoodItemAdapter(foodDeliveryItems);
    }

    public void connectAdapter(){
        foodDeliveryItemsRv.setLayoutManager(new LinearLayoutManager(this));
        foodDeliveryItemsRv.setAdapter(deliveryFoodItemAdapter);
    }

}