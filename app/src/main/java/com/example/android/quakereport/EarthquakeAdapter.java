package com.example.android.quakereport;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {
    public EarthquakeAdapter(Context context, ArrayList<Earthquake> earthquakes){
        super(context, 0, earthquakes);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
            R.layout.earthquake_list_item, parent, false);
        }
        final Earthquake currentEarthquake = getItem(position);

        TextView magnitudeTextView = (TextView) listItemView.findViewById(R.id.magnitude);
        TextView locationTextView =(TextView)  listItemView.findViewById(R.id.location);
        TextView dateTextView = (TextView)  listItemView.findViewById(R.id.date);

        magnitudeTextView.setText(currentEarthquake.getmMagnitude().toString() );
        locationTextView.setText(currentEarthquake.getmLocation());
        dateTextView.setText(currentEarthquake.getmDate());


        return listItemView;
    }

}
