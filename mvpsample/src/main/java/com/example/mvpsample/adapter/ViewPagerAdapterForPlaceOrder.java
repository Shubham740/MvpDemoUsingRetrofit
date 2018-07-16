package com.example.mvpsample.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by Shubham on 04/12/17.
 * This class is used to define the adapter for ViewPager for Place Order
 * it implements the FragmentPageAdapter Interface .
 * it class has some important methods like getItem(),getCount() and getPageTitle().
 */

public class ViewPagerAdapterForPlaceOrder extends FragmentPagerAdapter {
    private ArrayList<Fragment> fragments=new ArrayList<>();
    private ArrayList<String> tabTitles=new ArrayList<>();
    public ViewPagerAdapterForPlaceOrder(FragmentManager fm) {
        super(fm);
    }
    public void addFragments(Fragment fragments, String tabTitles)
    {
        this.fragments.add(fragments);
        this.tabTitles.add(tabTitles);
    }


    /**
     *
     * @param position : this method returns the fragment according to the position
     * @return
     */
    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    /**
     *
     *
     * @return: this method returns the total fragment on viewPager
     */

    @Override
    public int getCount() {
        return fragments.size();
    }

    /**
     *
     * @param position: this method returns the Title of the page according to the position .
     * @return
     */
    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles.get(position);
    }

}
