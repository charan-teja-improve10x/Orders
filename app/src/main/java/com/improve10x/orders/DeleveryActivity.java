package com.improve10x.orders;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class DeleveryActivity extends AppCompatActivity {
    FoodDleveryItems[] deliveryItems;
    RecyclerView foodItemsRv;
    DeliveryItemAdapter deliveryItemAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delevery);
        initViews();
        createDummyData();
        createAdapter();
        connectAdapter();
    }

    private void initViews() {
        foodItemsRv = findViewById(R.id.food_items_rv);
    }

    public void createDummyData(){
        deliveryItems = new FoodDleveryItems[6];

        deliveryItems[0] = new FoodDleveryItems();
        deliveryItems[0].imageUrl = "https://i.pinimg.com/originals/83/7f/7e/837f7ef3689a7c340b70c688964fb0dc.jpg";
        deliveryItems[0].itemName = "Chicken Soup";
        deliveryItems[0].rating = "⭐4.5";

        deliveryItems[1] = new FoodDleveryItems();
        deliveryItems[1].imageUrl = "https://www.tabasco.com/wp-content/uploads/2017/04/343.jpg";
        deliveryItems[1].itemName = "Chickpea";
        deliveryItems[1].rating = "⭐4.0";


        deliveryItems[2] = new FoodDleveryItems();
        deliveryItems[2].imageUrl = "https://th.bing.com/th/id/OIP.fA1tMvTW8Xy8Q6gqMjm53QHaEK?pid=ImgDet&rs=1";
        deliveryItems[2].itemName = "Fallafel";
        deliveryItems[2].rating = "⭐4.5";


        deliveryItems[3] = new FoodDleveryItems();
        deliveryItems[3].imageUrl = "https://www.tabasco.com/wp-content/uploads/2017/04/343.jpg";
        deliveryItems[3].itemName = "Chickpea";
        deliveryItems[3].rating = "⭐3.5";


        deliveryItems[4] = new FoodDleveryItems();
        deliveryItems[4].imageUrl = "https://i.pinimg.com/originals/83/7f/7e/837f7ef3689a7c340b70c688964fb0dc.jpg";
        deliveryItems[4].itemName = "Fallafel";
        deliveryItems[4].rating = "⭐4.0";


        deliveryItems[5] = new FoodDleveryItems();
        deliveryItems[5].imageUrl = "https://th.bing.com/th/id/OIP.fA1tMvTW8Xy8Q6gqMjm53QHaEK?pid=ImgDet&rs=1";
        deliveryItems[5].itemName = "Chickpea";
        deliveryItems[5].rating = "⭐4.5";
    }

    public void createAdapter(){
        deliveryItemAdapter = new DeliveryItemAdapter(deliveryItems);
    }

    public void connectAdapter(){
        foodItemsRv.setLayoutManager(new LinearLayoutManager(this));
        foodItemsRv.setAdapter(deliveryItemAdapter);
    }

}