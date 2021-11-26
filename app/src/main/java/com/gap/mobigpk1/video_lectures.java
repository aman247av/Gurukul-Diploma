package com.gap.mobigpk1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class video_lectures extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String email=getIntent().getStringExtra("title");
        getSupportActionBar().hide();
        setContentView(R.layout.activity_video_lectures);
        WebView webview=findViewById(R.id.webview);
        webview.setWebViewClient(new WebViewClient());
        webview.loadUrl(email);
        WebSettings webSettings=webview.getSettings();
        webSettings.setJavaScriptEnabled(true);

        webview.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
        webview.getSettings().setAppCacheEnabled(true);
        webview.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);

        webSettings.setSaveFormData(true);
        webSettings.setUseWideViewPort(true);
        webSettings.setDomStorageEnabled(true);
    }
}