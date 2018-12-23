package com.example.android.mombasatourguideapp;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


///**
// * A simple {@link Fragment} subclass.
// * Activities that contain this fragment must implement the
// * {@link RestaurantFragment.OnFragmentInteractionListener} interface
// * to handle interaction events.
// * Use the {@link RestaurantFragment#newInstance} factory method to
// * create an instance of this fragment.
// */
public class RestaurantFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER


    public RestaurantFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        ArrayList<Place> places = new ArrayList<Place>();
        //words.add("one");
        places.add(new Place(getString(R.string.ten_street), getString(R.string.ten_street_loc), R.drawable.ten_street));
        places.add(new Place(getString(R.string.tamarind), getString(R.string.tamarind_loc), R.drawable.tamarind));
        places.add(new Place(getString(R.string.sea), getString(R.string.sea_loc), R.drawable.sea_haven));
        places.add(new Place(getString(R.string.foro), getString(R.string.foro_loc), R.drawable.forodhani));
        places.add(new Place(getString(R.string.tarboush), getString(R.string.tarboush_loc), R.drawable.tarboush));

        //custom layout created anew for we want to pass two arraylists
        PlaceAdapter placesAdapter =
                new PlaceAdapter(getActivity(), places);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(placesAdapter);

        return rootView;
    }

}
