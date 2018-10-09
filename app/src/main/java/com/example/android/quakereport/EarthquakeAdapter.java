package com.example.android.quakereport;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.SimpleFormatter;


public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {
    private static final String LOCATION_SEPARATOR = " of ";

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
        Earthquake currentEarthquake = getItem(position);

        TextView magnitudeTextView = (TextView) listItemView.findViewById(R.id.magnitude);
        TextView locationTextView =(TextView)  listItemView.findViewById(R.id.location);
        TextView secondaryTextView = (TextView) listItemView.findViewById(R.id.location_offset);
        TextView dateTextView = (TextView)  listItemView.findViewById(R.id.date);
        TextView timeTextView = (TextView) listItemView.findViewById(R.id.time);

        magnitudeTextView.setText(currentEarthquake.getmMagnitude().toString());

        String originalLocation = currentEarthquake.getmLocation();
        String primaryLocation ;
        String locationOffset ;

        if(originalLocation.contains((LOCATION_SEPARATOR))){
            String[] parts = originalLocation.split(LOCATION_SEPARATOR);
            locationOffset = parts[0] + LOCATION_SEPARATOR;
            primaryLocation = parts[1];

        }else {
            locationOffset = getContext().getString(R.string.near_the);
            primaryLocation = originalLocation;
        }
        locationTextView.setText(primaryLocation);
        secondaryTextView.setText(locationOffset);
        Date dateObject = new Date(currentEarthquake.getmTimeInMilliseconds());

        String formattedDate = formatDate(dateObject);
        dateTextView.setText(formattedDate);

        String formattedTime = formatTime(dateObject);
        timeTextView.setText(formattedTime);



        return listItemView;
    }
    private String formatDate(Date dateObject){
        SimpleDateFormat dateFormat = new SimpleDateFormat("LLL dd, yyyy");
        return dateFormat.format(dateObject);

    }
    private String formatTime(Date dateObject){
        SimpleDateFormat timeFormat = new SimpleDateFormat("h:mm a");
        return timeFormat.format(dateObject);
    }
    private String formatDecimal(Date dateObject)
    {
        Number decimalFormat = new Simple
    }
}
