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
// * {@link RecreationFragment.OnFragmentInteractionListener} interface
// * to handle interaction events.
// * Use the {@link RecreationFragment#newInstance} factory method to
// * create an instance of this fragment.
// */
public class RecreationFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
//    private static final String ARG_PARAM1 = "param1";
//    private static final String ARG_PARAM2 = "param2";
//
//    // TODO: Rename and change types of parameters
//    private String mParam1;
//    private String mParam2;
//
//    private OnFragmentInteractionListener mListener;

    public RecreationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        ArrayList<Place> places = new ArrayList<Place>();
        //words.add("one");
        places.add(new Place(getString(R.string.mamba), getString(R.string.mamba_loc)));
        places.add(new Place(getString(R.string.haller), getString(R.string.haller_loc)));
        places.add(new Place(getString(R.string.yacht), getString(R.string.yacht_loc)));
        places.add(new Place(getString(R.string.royal), getString(R.string.royal_loc)));
        places.add(new Place(getString(R.string.msa_railway), getString(R.string.msa_railway_loc)));

        //custom layout created anew for we want to pass two arraylists
        PlaceAdapter placesAdapter =
                new PlaceAdapter(getActivity(), places);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(placesAdapter);

        return rootView;
    }

}
