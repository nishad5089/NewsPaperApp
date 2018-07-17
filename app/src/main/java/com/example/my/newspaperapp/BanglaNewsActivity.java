package com.example.my.newspaperapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class BanglaNewsActivity extends AppCompatActivity {
    ListView customListview;
    String bNewsPaper[] = {"দৈনিক প্রথম আলো","কালের কণ্ঠ","সমকাল","যায় যায় দিন","দৈনিক ইত্তেফাক"};
int images[] = {R.drawable.prothomalo,R.drawable.kalarkonto,R.drawable.somokal,R.drawable.jaijaidin,R.drawable.ithafaq};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangla_news);
        customListview = findViewById(R.id.listview);
        CustomAdapter adapter = new CustomAdapter(BanglaNewsActivity.this,bNewsPaper,images);
        customListview.setAdapter(adapter);

        customListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(BanglaNewsActivity.this,WebActivity.class);
                i.putExtra("url",bNewsPaper[position]);
                Toast.makeText(BanglaNewsActivity.this,bNewsPaper[position],Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });
    }

}
