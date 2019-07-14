package com.walexhino.andela;

import android.net.http.SslError;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class About_ALC extends AppCompatActivity {
     WebView web;
     String url="http://www.andela.com/alc/";

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_layout);


        web =(WebView)findViewById(R.id.webview);
        web.setWebViewClient(new WebViewClient(){

            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error)
            {
                handler.proceed();
            }
                             });
        web.getSettings().setJavaScriptEnabled(true);
        web.setWebChromeClient(new WebChromeClient());
        web.loadUrl(url);
    }

    @Override
    public void onBackPressed() {
        if(web.canGoBack()){
            web.goBack();
        }
        else{
            super.onBackPressed();
        }
}
}


