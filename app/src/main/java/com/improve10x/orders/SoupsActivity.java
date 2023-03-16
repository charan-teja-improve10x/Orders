package com.improve10x.orders;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class SoupsActivity extends AppCompatActivity {
    SoupsItems[] soupsItems;
    SoupItemAdapter soupItemAdapter;
    RecyclerView soupRv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soups);
        initViews();
        createDummyData();
        createAdapter();
        connectAdapter();
    }

    private void initViews() {
        soupRv = findViewById(R.id.soups_rv);
    }

    public void createDummyData(){
        soupsItems = new SoupsItems[4];

        soupsItems[0] = new SoupsItems();
        soupsItems[0].soupName = "Chicken Soup";
        soupsItems[0].description = "Chicken Vegetables, butter, tiny pasta, green beans, carrots, ...";
        soupsItems[0].soupAmount = "8.00$";
        soupsItems[0].soupUrl = "https://th.bing.com/th/id/R.c6b49e7916ccc12f981fde0939bfe0bf?rik=nSwLIaerDjrDrw&riu=http%3a%2f%2fs3-media3.fl.yelpcdn.com%2fbphoto%2fKjz0PUO3edoBlrnnUzw8oA%2f348s.jpg&ehk=KgCB%2fzNJH6m6wveCrbGwqpXUQsvbho%2bnYbnY%2fByx4dw%3d&risl=&pid=ImgRaw&r=0";

        soupsItems[1] = new SoupsItems();
        soupsItems[1].soupName = "Chicken Soup";
        soupsItems[1].description = "Chicken Vegetables, butter, tiny pasta, green beans, carrots, ...";
        soupsItems[1].soupAmount = "8.00$";
        soupsItems[1].soupUrl = "https://th.bing.com/th/id/R.c6b49e7916ccc12f981fde0939bfe0bf?rik=nSwLIaerDjrDrw&riu=http%3a%2f%2fs3-media3.fl.yelpcdn.com%2fbphoto%2fKjz0PUO3edoBlrnnUzw8oA%2f348s.jpg&ehk=KgCB%2fzNJH6m6wveCrbGwqpXUQsvbho%2bnYbnY%2fByx4dw%3d&risl=&pid=ImgRaw&r=0";

        soupsItems[2] = new SoupsItems();
        soupsItems[2].soupName = "Chicken Soup";
        soupsItems[2].description = "Chicken Vegetables, butter, tiny pasta, green beans, carrots, ...";
        soupsItems[2].soupAmount = "8.00$";
        soupsItems[2].soupUrl = "https://th.bing.com/th/id/R.c6b49e7916ccc12f981fde0939bfe0bf?rik=nSwLIaerDjrDrw&riu=http%3a%2f%2fs3-media3.fl.yelpcdn.com%2fbphoto%2fKjz0PUO3edoBlrnnUzw8oA%2f348s.jpg&ehk=KgCB%2fzNJH6m6wveCrbGwqpXUQsvbho%2bnYbnY%2fByx4dw%3d&risl=&pid=ImgRaw&r=0";

        soupsItems[3] = new SoupsItems();
        soupsItems[3].soupName = "Chicken Soup";
        soupsItems[3].description = "Chicken Vegetables, butter, tiny pasta, green beans, carrots, ...";
        soupsItems[3].soupAmount = "8.00$";
        soupsItems[3].soupUrl = "https://th.bing.com/th/id/R.c6b49e7916ccc12f981fde0939bfe0bf?rik=nSwLIaerDjrDrw&riu=http%3a%2f%2fs3-media3.fl.yelpcdn.com%2fbphoto%2fKjz0PUO3edoBlrnnUzw8oA%2f348s.jpg&ehk=KgCB%2fzNJH6m6wveCrbGwqpXUQsvbho%2bnYbnY%2fByx4dw%3d&risl=&pid=ImgRaw&r=0";
    }

    public void createAdapter(){
        soupItemAdapter = new SoupItemAdapter(soupsItems);
    }

    public void connectAdapter(){
        soupRv.setLayoutManager(new LinearLayoutManager(this));
        soupRv.setAdapter(soupItemAdapter);
    }
}