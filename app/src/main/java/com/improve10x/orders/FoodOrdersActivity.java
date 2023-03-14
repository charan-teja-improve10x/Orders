package com.improve10x.orders;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class FoodOrdersActivity extends AppCompatActivity {
    FoodItems[] foodItems;
    RecyclerView ordersRv;
    FoodItemAdapter foodItemAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_orders);
        initViews();
        createOrderData();
        createAdapter();
        connectAdapter();
    }

    private void initViews() {
        ordersRv = findViewById(R.id.orders_rv);
    }

    public void createOrderData(){
        foodItems = new FoodItems[6];

        foodItems[0] = new FoodItems();
        foodItems[0].orderNumber = "ORDER #121";
        foodItems[0].orderTime = "05:30 PM |";
        foodItems[0].orderPrice = "$232 |";
        foodItems[0].orderStatus = "Delivery";
        foodItems[0].orderedItems = "Chicken Manjurian, Vegitable Pizza, Chicken Tikka,...";

        foodItems[1] = new FoodItems();
        foodItems[1].orderNumber = "ORDER #120";
        foodItems[1].orderTime = "05:30 PM |";
        foodItems[1].orderPrice = "$98 |";
        foodItems[1].orderStatus = "Pickup";
        foodItems[1].orderedItems = "Margarita Pizza";

        foodItems[2] = new FoodItems();
        foodItems[2].orderNumber = "ORDER #119";
        foodItems[2].orderTime = "05:30 PM |";
        foodItems[2].orderPrice = "$179 |";
        foodItems[2].orderStatus = "Delivery";
        foodItems[2].orderedItems = "Chicken Manjurian, Vegitable Pizza, Chicken Tikka,";

        foodItems[3] = new FoodItems();
        foodItems[3].orderNumber = "ORDER #118";
        foodItems[3].orderTime = "05:30 PM |";
        foodItems[3].orderPrice = "$83 |";
        foodItems[3].orderStatus = "Pickup";
        foodItems[3].orderedItems = "Margarita Pizza";

        foodItems[4] = new FoodItems();
        foodItems[4].orderNumber = "ORDER #117";
        foodItems[4].orderTime = "05:30 PM |";
        foodItems[4].orderPrice = "$232 |";
        foodItems[4].orderStatus = "Delivery";
        foodItems[4].orderedItems = "Chicken Manjurian, Vegitable Pizza, Chicken Tikka,";

        foodItems[5] = new FoodItems();
        foodItems[5].orderNumber = "ORDER #116";
        foodItems[5].orderTime = "05:00 PM |";
        foodItems[5].orderPrice = "$350 |";
        foodItems[5].orderStatus = "Delivery";
        foodItems[5].orderedItems = "Chicken Biryani, Sprite";
    }

    public void createAdapter(){
        foodItemAdapter = new FoodItemAdapter(foodItems);
    }

    public void connectAdapter(){
        ordersRv.setLayoutManager(new LinearLayoutManager(this));
        ordersRv.setAdapter(foodItemAdapter);
    }
}