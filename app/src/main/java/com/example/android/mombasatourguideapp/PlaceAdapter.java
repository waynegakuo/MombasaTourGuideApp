package com.example.android.mombasatourguideapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PlaceAdapter extends ArrayAdapter <Place> {
    /**Resource ID for background color for the list of tracks**/
    //private int mColorResourceId;

//    public LocationAdapter(Activity context, ArrayList<Track> words, int colorResourceId) {
//        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
//        // the second argument is used when the ArrayAdapter is populating a single TextView.
//        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
//        // going to use this second argument, so it can be any value. Here, we used 0.
//        super(context, 0, words);
//        mColorResourceId=colorResourceId;
//    }

    public PlaceAdapter(Activity context, ArrayList<Place> places) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, places);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Track} object located at this position in the list
        Place currPlace = getItem(position);

        // Find the TextView in the list_track.xml layout with the ID version_name
        TextView infoView = (TextView) listItemView.findViewById(R.id.details);
        // Get the version name from the current Track object and
        // set this text on the name TextView
        infoView.setText(currPlace.getmInfo());

        // Find the TextView in the list_track.xml layout with the ID version_number
        TextView placeNameView = (TextView) listItemView.findViewById(R.id.place);
        // Get the version number from the current Track object and
        // set this text on the number TextView
        placeNameView.setText(currPlace.getmPlace());


        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        // Get the image resource ID from the current track object and

        if(currPlace.hasImage()){
            // set the image to imageView
            imageView.setImageResource(currPlace.getImageResourceId());
            //ensure that the view is visible
            imageView.setVisibility(View.VISIBLE);
        }
        else {
            //otherwise hide the image
            imageView.setVisibility(View.GONE);
        }

//        //set theme color for the list track
//        View textContainer= listItemView.findViewById(R.id.text_container);
//        //find color that resource ID maps to
//        int color = ContextCompat.getColor(getContext(), mColorResourceId);
//        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
