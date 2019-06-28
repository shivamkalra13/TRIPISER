package com.example.application.tripiser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        Bundle data=getIntent().getExtras();
        if(data==null)
        {
            return;
        }
        String str=data.getString("link");
        WebView web=(WebView) findViewById(R.id.webview);
        web.loadUrl(str);
    }
}
