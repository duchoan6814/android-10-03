package com.example.customelistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvGoods;
    CustomGoodsAdapter adt;
    ArrayList<Goods> arr1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvGoods=findViewById(R.id.lvGood);

        arr1=new ArrayList<>();
        arr1.add(new Goods("Google","$18",R.drawable.google));
        arr1.add(new Goods("Google","$18",R.drawable.google));
        arr1.add(new Goods("Google","$18",R.drawable.google));

        adt=new CustomGoodsAdapter(this,R.layout.item_listview,arr1);

        lvGoods.setAdapter(adt);

    }
}