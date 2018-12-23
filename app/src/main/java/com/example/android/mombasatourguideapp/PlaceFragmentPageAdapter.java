package com.example.android.mombasatourguideapp;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.content.Context;

public class PlaceFragmentPageAdapter extends FragmentPagerAdapter {

    /** Context of the app */
    private Context mContext;

    /**
     * Create a new {@link PlaceFragmentPageAdapter} object.
     *
     * @param context is the context of the app
     * @param fm is the fragment manager that will keep each fragment's state in the adapter
     *           across swipes.
     */
    public PlaceFragmentPageAdapter(Context context, FragmentManager fm) {

        super(fm);
        mContext=context;
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number of the app
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new RestaurantFragment();
        } else if (position == 1){
            return new BeachFragment();
        } else if(position==2) {
            return new RecreationFragment();
        }
        else {
            return new ResortFragment();
        }
    }

    /**
     *
     * @return total number of pages
     */
    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.restuarants);
        } else if (position == 1) {
            return mContext.getString(R.string.beaches);
        } else if (position==2) {
            return mContext.getString(R.string.recreation);
        }
        else {
            return mContext.getString(R.string.resorts);
        }
    }
}
