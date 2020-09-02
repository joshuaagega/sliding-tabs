package com.gego.tabfragments;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {

    private int numTabs;

        public PagerAdapter(FragmentManager fm,int numTabs){
            super(fm);
            this.numTabs = numTabs;
        }
    @NonNull
    @Override
    public Fragment getItem(int position) {
            switch (position){
                case 0:
                    return new Birds();
                case 1:
                    return new Cats();
                default:
                    return null;
            }
    }

    @Override
    public int getCount() {

        return numTabs ;
    }
}
