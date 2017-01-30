package com.it_skills.ramzi.tablayoutdemo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentManager;

import java.util.ArrayList;

/**
 * Created by ramzi on 29/01/17.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {

    ArrayList<Fragment> fragments =new ArrayList<>();
    ArrayList<String> tabtitiles = new ArrayList<>();

    public void addFragments(Fragment fragment ,String titles ){
        this.fragments.add(fragment);
        this.tabtitiles.add(titles);
    }

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabtitiles.get(position);
    }
}
