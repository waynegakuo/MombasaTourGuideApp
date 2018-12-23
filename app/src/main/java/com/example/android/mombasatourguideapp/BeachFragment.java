package com.example.android.mombasatourguideapp;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.AdapterView;

import java.util.ArrayList;


///**
// * A simple {@link Fragment} subclass.
// * Activities that contain this fragment must implement the
// * {@link BeachFragment.OnFragmentInteractionListener} interface
// * to handle interaction events.
// * Use the {@link BeachFragment#} factory method to
// * create an instance of this fragment.

public class BeachFragment extends Fragment {

    public BeachFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        ArrayList<Place> places = new ArrayList<Place>();
        //words.add("one");
        places.add(new Place(getString(R.string.shelly_beach), getString(R.string.shelly_loc), R.drawable.shelly));
        places.add(new Place(getString(R.string.msa_beach), getString(R.string.msa_beach_loc), R.drawable.msa_beach));
        places.add(new Place(getString(R.string.pirates), getString(R.string.pirates_loc), R.drawable.pirates));
        places.add(new Place(getString(R.string.nyali), getString(R.string.nyali_loc), R.drawable.nyali_beach));
        places.add(new Place(getString(R.string.voyager), getString(R.string.voyager_loc), R.drawable.voyager));

        //custom layout created anew for we want to pass two arraylists
        PlaceAdapter placesAdapter =
                new PlaceAdapter(getActivity(), places);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(placesAdapter);

        return rootView;
    }

}
