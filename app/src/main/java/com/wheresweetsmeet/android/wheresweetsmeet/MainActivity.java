package com.wheresweetsmeet.android.wheresweetsmeet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    private WebView whereSweetsMeet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        whereSweetsMeet = (WebView) findViewById(R.id.WebView);
        whereSweetsMeet.setWebViewClient(new WebViewClient());
        whereSweetsMeet.loadUrl("http://wheresweetsmeet.com");
        WebSettings webSettings = whereSweetsMeet.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }

    @Override
    public void onBackPressed() {
        if(whereSweetsMeet.canGoBack()){
            whereSweetsMeet.goBack();
        }
        else{
        super.onBackPressed();}
    }
}
