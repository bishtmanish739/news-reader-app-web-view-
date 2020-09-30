package in.technicalkeeda.uttarakhand360news;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
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
    public static final String NOTIFICATION_CHANNEL_ID = "10001" ;
    private final static String default_notification_channel_id = "default" ;
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
        //notificationshow();

        Resources res = getResources();
        // String[] myStrings = res.getStringArray(R.array.birthdaywishes);
        simpleGrid = (GridView) findViewById(R.id.simpleGridView); // init GridView
        // Create an object of CustomAdapter and set Adapter to GirdView
        scheduleNotification(getNotification( "Read Now..." ) , 1000*24*60*60 ) ;
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
                            String shareMessage= getResources().getString(R.string.sharemgs);
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
                        String shareMessage= getResources().getString(R.string.sharemgs);
                        shareMessage = shareMessage+"\n" + "https://play.google.com/store/apps/details?id=" + BuildConfig.APPLICATION_ID +"\n\n";
                        shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage);
                        startActivity(Intent.createChooser(shareIntent, "choose one"));
                    }


                }
            }
        });





    }
    private void scheduleNotification (Notification notification , long  delay) {
        Intent notificationIntent = new Intent( this, MyNotificationPublisher. class ) ;
        notificationIntent.putExtra(MyNotificationPublisher. NOTIFICATION_ID , 1 ) ;
        notificationIntent.putExtra(MyNotificationPublisher. NOTIFICATION , notification) ;
        PendingIntent pendingIntent = PendingIntent. getBroadcast ( this, 0 , notificationIntent , PendingIntent. FLAG_UPDATE_CURRENT ) ;
        long futureInMillis = SystemClock. elapsedRealtime () + delay ;
        AlarmManager alarmManager = (AlarmManager) getSystemService(Context. ALARM_SERVICE ) ;
        assert alarmManager != null;
        alarmManager.set(AlarmManager. ELAPSED_REALTIME_WAKEUP , futureInMillis , pendingIntent) ;
    }
    private Notification getNotification (String content) {
        Intent intent=new Intent(this,LandingPage.class);
        PendingIntent p=PendingIntent. getActivity ( this, 0 , intent , PendingIntent. FLAG_UPDATE_CURRENT ) ;
        NotificationCompat.Builder builder = new NotificationCompat.Builder( this, default_notification_channel_id ) ;
        builder.setContentTitle( "Missing breaking news ?" ) ;
        builder.setContentText(content) ;
        builder.setSmallIcon(R.drawable. ic_baseline_notifications_active_24 ) ;
        builder.setAutoCancel( true ) ;
        builder.setChannelId( NOTIFICATION_CHANNEL_ID ).setContentIntent(p) ;
        return builder.build() ;
    }
    void  notificationshow(){
        if(Build.VERSION.SDK_INT>Build.VERSION_CODES.O){
            NotificationChannel channel=new NotificationChannel("My Notification","My Notification",NotificationManager.IMPORTANCE_DEFAULT);
            NotificationManager manager=getSystemService(NotificationManager.class);
            manager.createNotificationChannel(channel);
        }
        NotificationCompat.Builder builder=new NotificationCompat.Builder(this,"My Notification").
                setContentTitle("noti").setContentText("click on me").setSmallIcon(R.drawable.ic_baseline_notifications_active_24).
                setAutoCancel(true);
        NotificationManagerCompat managerCompat=NotificationManagerCompat.from(this);
        managerCompat.notify(999,builder.build());

    }

}