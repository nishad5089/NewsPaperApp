package com.example.my.newspaperapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    String paperNames[];
    int images[];
    LayoutInflater inflater;
    public CustomAdapter(Context context,String[] paperNames,int[] images) {
        this.paperNames = paperNames;
        this.images = images;
        inflater = (LayoutInflater.from(context));
    }

    @Override
    public int getCount() {
        return paperNames.length;
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
    public View getView(int position, View view, ViewGroup parent) {
        view = inflater.inflate(R.layout.list_item,parent,false);
        ImageView image =view.findViewById(R.id.imageView);
        TextView paperName = view.findViewById(R.id.paperName);
        image.setImageResource(images[position]);
        paperName.setText(paperNames[position]);

        return view;
    }
}
