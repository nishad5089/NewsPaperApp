package com.example.my.newspaperapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class EnglishNewsActivity extends AppCompatActivity {
    ListView customListview;
    String eNewsPaper[] = {"The Daily Star","News Today","The Report"};
    int images[] = {R.drawable.dailystar,R.drawable.newstoday,R.drawable.thereport};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_news);
        customListview = findViewById(R.id.listview);
        CustomAdapter adapter = new CustomAdapter(EnglishNewsActivity.this,eNewsPaper,images);
        customListview.setAdapter(adapter);

        customListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(EnglishNewsActivity.this,WebActivity.class);
                i.putExtra("url",eNewsPaper[position]);
                Toast.makeText(EnglishNewsActivity.this,eNewsPaper[position],Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });
    }
}
