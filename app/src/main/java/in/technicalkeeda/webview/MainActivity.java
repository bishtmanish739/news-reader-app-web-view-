package in.technicalkeeda.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView=findViewById(R.id.webview);
        webView.setWebViewClient(new WebViewClient());
        Intent intent=getIntent();
        int i=intent.getIntExtra("code",0);//Extras("code");
        if(i==0){
            //uttarakhand
            webView.loadUrl("https://news.google.com/topics/CAAqJQgKIh9DQkFTRVFvTEwyY3ZNWFJqZDJSak5tb1NBbWhwS0FBUAE?oc=3&ceid=IN:hi");
            WebSettings webSettings=webView.getSettings();
            webSettings.setJavaScriptEnabled(true);

        }
        if(i==1){
            //almora
            webView.loadUrl("https://news.google.com/topics/CAAqIggKIhxDQkFTRHdvSkwyMHZNR1l6WkRObkVnSm9hU2dBUAE?oc=3&ceid=IN:hi");
            WebSettings webSettings=webView.getSettings();
            webSettings.setJavaScriptEnabled(true);

        }
        if(i==2){
            //bageshwar
            webView.loadUrl("https://news.google.com/topics/CAAqIggKIhxDQkFTRHdvSkwyMHZNRGxrWjNobkVnSm9hU2dBUAE?oc=3&ceid=IN:hi");
            WebSettings webSettings=webView.getSettings();
            webSettings.setJavaScriptEnabled(true);

        }
        if(i==3){
            //chamoli
            webView.loadUrl("https://news.google.com/topics/CAAqJggKIiBDQkFTRWdvTUwyY3ZNVEZvTUhsbU5tb3pFZ0pvYVNnQVAB?oc=3&ceid=IN:hi");
            WebSettings webSettings=webView.getSettings();
            webSettings.setJavaScriptEnabled(true);

        }
        if(i==4){
            //champawat
            webView.loadUrl("https://news.google.com/topics/CAAqIggKIhxDQkFTRHdvSkwyMHZNRFIwWjNSNEVnSm9hU2dBUAE?oc=3&ceid=IN:hi");
            WebSettings webSettings=webView.getSettings();
            webSettings.setJavaScriptEnabled(true);

        }
        if(i==5){
            //dun
            webView.loadUrl("https://news.google.com/topics/CAAqIggKIhxDQkFTRHdvSkwyMHZNRFJpZWpKbUVnSm9hU2dBUAE?oc=3&ceid=IN:hi");
            WebSettings webSettings=webView.getSettings();
            webSettings.setJavaScriptEnabled(true);

        }
        if(i==6){
            //haridwar
            webView.loadUrl("https://news.google.com/topics/CAAqIggKIhxDQkFTRHdvSkwyMHZNREZ4Tm5KaUVnSm9hU2dBUAE?oc=3&ceid=IN:hi");
            WebSettings webSettings=webView.getSettings();
            webSettings.setJavaScriptEnabled(true);
        }
        if(i==7){
            //nainital
            webView.loadUrl("https://news.google.com/topics/CAAqIggKIhxDQkFTRHdvSkwyMHZNREU0WTJzNUVnSm9hU2dBUAE?oc=3&ceid=IN:hi");
            WebSettings webSettings=webView.getSettings();
            webSettings.setJavaScriptEnabled(true);

        }
        if(i==8){
            //pauri
            webView.loadUrl("https://news.google.com/topics/CAAqIggKIhxDQkFTRHdvSkwyMHZNRFpmTld4ckVnSm9hU2dBUAE?oc=3&ceid=IN:hi");
            WebSettings webSettings=webView.getSettings();
            webSettings.setJavaScriptEnabled(true);

        }
        if(i==9){
            //pithoragarh
            webView.loadUrl("https://news.google.com/topics/CAAqIggKIhxDQkFTRHdvSkwyMHZNRGxqWDNSM0VnSm9hU2dBUAE?oc=3&ceid=IN:hi");
            WebSettings webSettings=webView.getSettings();
            webSettings.setJavaScriptEnabled(true);

        }
        if(i==10){
            //rudraprayag
            webView.loadUrl("https://news.google.com/topics/CAAqIggKIhxDQkFTRHdvSkwyMHZNR1kyTkdSekVnSm9hU2dBUAE?oc=3&ceid=IN:hi");
            WebSettings webSettings=webView.getSettings();
            webSettings.setJavaScriptEnabled(true);

        } if(i==11){
            //tehri
            webView.loadUrl("https://news.google.com/topics/CAAqJAgKIh5DQkFTRUFvS0wyMHZNRE41T1dZeU1oSUNhR2tvQUFQAQ?oc=3&ceid=IN:hi");
            WebSettings webSettings=webView.getSettings();
            webSettings.setJavaScriptEnabled(true);

        }
        if(i==12){
            //uds
            webView.loadUrl("https://news.google.com/topics/CAAqIggKIhxDQkFTRHdvSkwyMHZNRGxmY3pZNUVnSm9hU2dBUAE?oc=3&ceid=IN:hi");
            WebSettings webSettings=webView.getSettings();
            webSettings.setJavaScriptEnabled(true);
        }
        if(i==13){
            //uttarkashi
            webView.loadUrl("https://news.google.com/topics/CAAqJAgKIh5DQkFTRUFvS0wyMHZNREkxZEd4dWNSSUNhR2tvQUFQAQ?oc=3&ceid=IN:hi");
            WebSettings webSettings=webView.getSettings();
            webSettings.setJavaScriptEnabled(true);

        }
        if(i==14){
            //india
            webView.loadUrl("https://news.google.com/topstories?hl=hi&gl=IN&ceid=IN%3Ahi");
            WebSettings webSettings=webView.getSettings();
            webSettings.setJavaScriptEnabled(true);

        }

        //https://news.google.com/topics/CAAqIggKIhxDQkFTRHdvSkwyMHZNREU0WTJzNUVnSm9hU2dBUAE?oc=3&ceid=IN:hi




    }

    @Override
    public void onBackPressed() {
       if(webView.canGoBack()){
           webView.goBack();
       }
       else{
           super.onBackPressed();
       }
    }
}
