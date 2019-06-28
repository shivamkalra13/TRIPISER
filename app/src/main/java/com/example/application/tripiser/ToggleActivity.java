package com.example.application.tripiser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ToggleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle);
    }

    public void onpack(View view)
    {
        Intent i=new Intent(this,ListActivity.class);
        startActivity(i);
    }

    public void ontour(View view)
    {
        Intent i=new Intent(this,TourGuideActivity.class);
        startActivity(i);
    }

    public void onflight(View view)
    {
        Intent i=new Intent(this,WebActivity.class);
        i.putExtra("link","https://www.goibibo.com/flights/");
        startActivity(i);
    }

    public void onhotel(View view)
    {
        Intent i=new Intent(this,WebActivity.class);
        i.putExtra("link","https://www.goibibo.com/hotels/");
        startActivity(i);
    }
}
