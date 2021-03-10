package com.example.customelistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomGoodsAdapter extends BaseAdapter {
    Context ctx;
    int layoutItem;
    ArrayList<Goods> arrayList;

    public CustomGoodsAdapter(Context ctx, int layoutItem, ArrayList<Goods> arrayList) {
        this.ctx = ctx;
        this.layoutItem = layoutItem;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView= LayoutInflater.from(ctx).inflate(layoutItem,parent,false);
        //tao view
        TextView tvName= convertView.findViewById(R.id.name1);
        TextView tvPrice=convertView.findViewById(R.id.price1);
        ImageView tvImage= convertView.findViewById(R.id.image1);
        //gán giá trị
        tvName.setText(arrayList.get(position).getName());
        tvPrice.setText(arrayList.get(position).getPrice());
        tvImage.setImageResource(arrayList.get(position).getImage());
        return convertView;
    }
}
