package com.madgrid.ribbit.app;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.support.v13.app.FragmentPagerAdapter;

import com.madgrid.ribbit.app.MainActivity.PlaceholderFragment;

import java.util.Locale;

/**
 * Created by madgrid on 7/2/14.
 */

    /**
     * A {@link android.support.v13.app.FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        protected Context mContext;

        public SectionsPagerAdapter(Context context,FragmentManager fm) {
            super(fm);
            mContext = context;
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).
            return PlaceholderFragment.newInstance(position + 1);
        }

        @Override
        public int getCount() {
            // Show 2 total pages.
            return 2;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            Locale l = Locale.getDefault();
            switch (position) {
                case 0:
                    return mContext.getString(R.string.title_section1).toUpperCase(l);
                case 1:
                    return mContext.getString(R.string.title_section2).toUpperCase(l);

            }
            return null;
        }
    }
