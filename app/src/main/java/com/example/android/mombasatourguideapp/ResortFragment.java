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


////**
// * A simple {@link Fragment} subclass.
// * Activities that contain this fragment must implement the
// * {@link RestaurantFragment.OnFragmentInteractionListener} interface
// * to handle interaction events.
// * Use the {@link RestaurantFragment#newInstance} factory method to
// * create an instance of this fragment.
// */
public class ResortFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER


    public ResortFragment() {
        // Required empty public constructor
    }
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        ArrayList<Place> places = new ArrayList<Place>();
        //words.add("one");
        places.add(new Place(getString(R.string.baobab),
                getString(R.string.baobab_price)));
        places.add(new Place(getString(R.string.pride),
                getString(R.string.pride_price)));
        places.add(new Place(getString(R.string.continental),
                getString(R.string.continental_price)));
        places.add(new Place(getString(R.string.makwetu),
                getString(R.string.makwetu_price)));
        places.add(new Place(getString(R.string.pav),
                getString(R.string.pav_price)));

        //custom layout created anew for we want to pass two arraylists
        PlaceAdapter placesAdapter =
                new PlaceAdapter(getActivity(), places);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(placesAdapter);

        return rootView;
    }

}

