package in.technicalkeeda.uttarakhand360news;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import java.util.Arrays;
import java.util.List;

public class LandingPage extends AppCompatActivity {
    GridView simpleGrid;
    List<String> testDeviceIds = Arrays.asList("8AF74256D8D5C1E9EF7F4C87D703027E");
    private InterstitialAd mInterstitialAd;
    final int logos[] = {R.drawable.pitho,R.drawable.almoraimage,R.drawable.bageshwar,R.drawable.chamoli
            ,R.drawable.champawat,R.drawable.dun,R.drawable.haridwar,R.drawable.nainital
            ,R.drawable.pauri,R.drawable.pitho,R.drawable.rudra,R.drawable.tehri,R.drawable.uds,R.drawable.uks,R.drawable.almoraimage,R.drawable.job,R.drawable.ic_share};


    private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_landing_page);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        mAdView = findViewById(R.id.adView);
        RequestConfiguration configuration =
                new RequestConfiguration.Builder().setTestDeviceIds(testDeviceIds).build();
        MobileAds.setRequestConfiguration(configuration);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        Resources res = getResources();
        // String[] myStrings = res.getStringArray(R.array.birthdaywishes);
        simpleGrid = (GridView) findViewById(R.id.simpleGridView); // init GridView
        // Create an object of CustomAdapter and set Adapter to GirdView
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), logos);
        simpleGrid.setAdapter(customAdapter);
        mInterstitialAd=new InterstitialAd(this);
        mInterstitialAd.setAdUnitId(getString(R.string.interstacialadid));
        mInterstitialAd.loadAd(new AdRequest.Builder().build());
        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                simpleGrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        // set an Intent to Another Activity

                        if(position!=16) {
                            Intent intent = new Intent(LandingPage.this, MainActivity.class);

                            intent.putExtra("image", logos[position]); // put image data in Intent
                            intent.putExtra("code", position);
                            startActivity(intent); // start Intent
                            mInterstitialAd.loadAd(new AdRequest.Builder().build());
                        }
                        else{
                            Intent shareIntent = new Intent(Intent.ACTION_SEND);
                            shareIntent.setType("text/plain");
                            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Uttarakhand 360 News");
                            String shareMessage= "\nLet me recommend you this application Read All News Related To Uttarakand and your Locality\n\n";
                            shareMessage = shareMessage + "https://play.google.com/store/apps/details?id=" + BuildConfig.APPLICATION_ID +"\n\n";
                            shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage);
                            startActivity(Intent.createChooser(shareIntent, "choose one"));
                        }
                    }
                });// start Intent
            }
        });

        // implement setOnItemClickListener event on GridView
        simpleGrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
             /*   // set an Intent to Another Activity
                Intent intent = new Intent(LandingPage.this, MainActivity.class);
                intent.putExtra("image", logos[position]); // put image data in Intent
                intent.putExtra("code", position);
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());// start Intent*/
                if(mInterstitialAd.isLoaded()){
                    mInterstitialAd.show();

                }
                else {
                    if(position!=16) {
                        Intent intent = new Intent(LandingPage.this, MainActivity.class);

                        intent.putExtra("image", logos[position]); // put image data in Intent
                        intent.putExtra("code", position);
                        startActivity(intent); // start Intent
                        mInterstitialAd.loadAd(new AdRequest.Builder().build());
                    }
                    else{
                        Intent shareIntent = new Intent(Intent.ACTION_SEND);
                        shareIntent.setType("text/plain");
                        shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Uttarakhand 360 News");
                        String shareMessage= "\nLet me recommend you this application Read All News Related To Uttarakand and your Locality\n\n";
                        shareMessage = shareMessage + "https://play.google.com/store/apps/details?id=" + BuildConfig.APPLICATION_ID +"\n\n";
                        shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage);
                        startActivity(Intent.createChooser(shareIntent, "choose one"));
                    }


                }
            }
        });





    }

}