
package com.example.my.newspaperapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebActivity extends AppCompatActivity {
private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        webView = findViewById(R.id.webview);
        String getUrl = getIntent().getExtras().getString("url");
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setBuiltInZoomControls(true);

        if (getUrl.equals("দৈনিক প্রথম আলো")){
            webView.loadUrl("http://www.prothomalo.com/");
        }
        else if (getUrl.equals("কালের কণ্ঠ")){
            webView.loadUrl("http://www.kalerkantho.com/");
        }
        else if (getUrl.equals("সমকাল")){
            webView.loadUrl("http://samakal.com/");
        }
         else if (getUrl.equals("যায় যায় দিন")){
            webView.loadUrl("http://www.jaijaidinbd.com/");
        }
        else if (getUrl.equals("দৈনিক ইত্তেফাক")){
            webView.loadUrl("http://www.ittefaq.com.bd/");
        }
        else if (getUrl.equals("The Daily Star")){
            webView.loadUrl("https://www.thedailystar.net/");
        }
        else if (getUrl.equals("News Today")){
            webView.loadUrl("http://www.newstoday.com.bd/");
        }
        else if (getUrl.equals("The Report")){
            webView.loadUrl("http://bangla.thereport24.com/");
        }

    }
    public boolean onKeyDown(int KeyCode, KeyEvent event){
if (KeyCode == KeyEvent.KEYCODE_BACK && webView.canGoBack()){
    webView.goBack();
    return  true;
}
return super.onKeyDown(KeyCode,event);
    }

}
