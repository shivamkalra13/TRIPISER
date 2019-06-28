package com.example.application.tripiser;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Bundle data= getIntent().getExtras();
        if(data==null)
            return;
        String str=data.getString("strdetail");
       ScrollView mylayout=new ScrollView(this);
        TextView detail=new TextView(this);
        detail.setText(str);
        RelativeLayout.LayoutParams textDetails=new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        textDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        textDetails.addRule(RelativeLayout.CENTER_VERTICAL);
        mylayout.addView(detail,textDetails);
        setContentView(mylayout);
    }
}
