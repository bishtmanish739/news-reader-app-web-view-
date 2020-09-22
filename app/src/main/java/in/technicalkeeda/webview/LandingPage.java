package in.technicalkeeda.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class LandingPage extends AppCompatActivity {
    GridView simpleGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_landing_page);




        final int logos[] = {R.drawable.pitho,R.drawable.almoraimage,R.drawable.bageshwar,R.drawable.chamoli
                ,R.drawable.champawat,R.drawable.dun,R.drawable.haridwar,R.drawable.nainital
                ,R.drawable.pauri,R.drawable.pitho,R.drawable.rudra,R.drawable.tehri,R.drawable.uds,R.drawable.uks,R.drawable.almoraimage,R.drawable.ic_share};
        Resources res = getResources();
       // String[] myStrings = res.getStringArray(R.array.birthdaywishes);
        simpleGrid = (GridView) findViewById(R.id.simpleGridView); // init GridView
        // Create an object of CustomAdapter and set Adapter to GirdView
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), logos);
        simpleGrid.setAdapter(customAdapter);
        // implement setOnItemClickListener event on GridView
        simpleGrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // set an Intent to Another Activity
                Intent intent = new Intent(LandingPage.this, MainActivity.class);
                intent.putExtra("image", logos[position]); // put image data in Intent
                intent.putExtra("code", position);
                startActivity(intent); // start Intent
            }
        });
    }
}