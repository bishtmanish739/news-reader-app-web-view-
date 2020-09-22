package in.technicalkeeda.uttarakhand360news;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    Context context;
    int logos[];
    LayoutInflater inflter;
    public CustomAdapter(Context applicationContext, int[] logos) {
        this.context = applicationContext;
        this.logos = logos;
        inflter = (LayoutInflater.from(applicationContext));
    }
    @Override
    public int getCount() {
        return logos.length;
    }
    @Override
    public Object getItem(int i) {
        return null;
    }
    @Override
    public long getItemId(int i) {
        return 0;
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.gridview, null); // inflate the layout
        ImageView icon = (ImageView) view.findViewById(R.id.icon); // get the reference of ImageView
        icon.setImageResource(logos[i]);
        if(i==0){
            TextView title = (TextView) view.findViewById(R.id.DistricTitle);
            title.setText(R.string.uttarakhand);
            // set logo images
        }
        if(i==1){
            TextView title = (TextView) view.findViewById(R.id.DistricTitle);
            title.setText(R.string.almora);
            // set logo images
        }
        if(i==2){
            TextView title = (TextView) view.findViewById(R.id.DistricTitle);
            title.setText(R.string.bageshwar);
            // set logo images
        }
        if(i==3){
            TextView title = (TextView) view.findViewById(R.id.DistricTitle);
            title.setText(R.string.chamoli);
            // set logo images
        }
        if(i==4){
            TextView title = (TextView) view.findViewById(R.id.DistricTitle);
            title.setText(R.string.champawat);
            // set logo images
        } if(i==5){
            TextView title = (TextView) view.findViewById(R.id.DistricTitle);
            title.setText(R.string.dehradun);
            // set logo images
        }
        if(i==6){
            TextView title = (TextView) view.findViewById(R.id.DistricTitle);
            title.setText(R.string.haridwar);
            // set logo images
        } if(i==7){
            TextView title = (TextView) view.findViewById(R.id.DistricTitle);
            title.setText(R.string.nainital);
            // set logo images
        } if(i==8){
            TextView title = (TextView) view.findViewById(R.id.DistricTitle);
            title.setText(R.string.paurigarhwal);
            // set logo images
        } if(i==9){
            TextView title = (TextView) view.findViewById(R.id.DistricTitle);
            title.setText(R.string.pithoragarh);
            // set logo images
        } if(i==10){
            TextView title = (TextView) view.findViewById(R.id.DistricTitle);
            title.setText(R.string.rudraprayag);
            // set logo images
        }
        if(i==11){
            TextView title = (TextView) view.findViewById(R.id.DistricTitle);
            title.setText(R.string.tehrigarhwal);
            // set logo images
        } if(i==12){
            TextView title = (TextView) view.findViewById(R.id.DistricTitle);
            title.setText(R.string.udhamsinghnagar);
            // set logo images
        }
        if(i==13){
            TextView title = (TextView) view.findViewById(R.id.DistricTitle);
            title.setText(R.string.uttarkash);
            // set logo images
        }
        if(i==14){
            TextView title = (TextView) view.findViewById(R.id.DistricTitle);
            title.setText(R.string.india);
            // set logo images
        }
        if(i==15){
            TextView title = (TextView) view.findViewById(R.id.DistricTitle);
            title.setText(R.string.share);
            // set logo images
        }






        return view;
    }
}
