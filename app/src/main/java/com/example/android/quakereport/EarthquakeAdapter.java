package com.example.android.quakereport;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Mike on 1/12/2017.
 */

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    public EarthquakeAdapter(Context context, List<Earthquake> earthquakes) {
        // Here, we initialize the ArrayAdapters internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, earthquakes);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.earthquake_list_item, parent, false);
        }


            // Get the {@link AndroidFlavor} object located at this position in the list
            Earthquake currentWord = getItem(position);

            // Find the TextView in the list_item.xml layout with the ID version_number
            TextView quakeMagnitude = (TextView) listItemView.findViewById(R.id.quake_magnitude);
            // Get the version number from the current AndroidFlavor object and set this text on the vNameTextView
            quakeMagnitude.setText((int) currentWord.getMagnitude());

            // Find the TextView in the list_item.xml layout with the ID version_number
            TextView quakeLocation = (TextView) listItemView.findViewById(R.id.quake_location);
            // Get the version number from the current AndroidFlavor object and set this text on the vNameTextView
            quakeLocation.setText(currentWord.getLocation());

            // Find the TextView in the list_item.xml layout with the ID version_number
            TextView quakeDate = (TextView) listItemView.findViewById(R.id.quake_date);
            // Get the version number from the current AndroidFlavor object and set this text on the vNameTextView
            quakeDate.setText(currentWord.getDate());

            return listItemView;

    }
}
