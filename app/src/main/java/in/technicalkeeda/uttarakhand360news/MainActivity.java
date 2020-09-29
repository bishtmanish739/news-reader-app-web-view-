package in.technicalkeeda.uttarakhand360news;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    WebView webView;
    private AdView mAdView1;
    private  AdView mAdView2;
    List<String> testDeviceIds = Arrays.asList("8AF74256D8D5C1E9EF7F4C87D703027E");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAdView1 = findViewById(R.id.adView1);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        RequestConfiguration configuration =
                new RequestConfiguration.Builder().setTestDeviceIds(testDeviceIds).build();

        mAdView1 = findViewById(R.id.adView1);
        mAdView2=findViewById(R.id.adView2);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView1.loadAd(adRequest);
        mAdView2.loadAd(adRequest);

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
        if(i==15){
            //job
            webView.loadUrl("https://news.google.com/search?q=%E0%A4%A8%E0%A5%8C%E0%A4%95%E0%A4%B0%E0%A4%BF%E0%A4%AF%E0%A4%BE%E0%A4%82&hl=hi&gl=IN&ceid=IN%3Ahi");
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
