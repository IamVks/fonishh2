package com.android.app.fonishh;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by VIKAS on 3/3/2018.
 */

public class VIewPagerAdapter extends FragmentPagerAdapter {

    private final List<Fragment>fragmentList=new ArrayList<>();
    private final List<String> fragmentTitleList = new ArrayList<>();


    public VIewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentTitleList.size();
    }


    @Override
    public CharSequence getPageTitle(int position) {
        return fragmentTitleList.get(position);
    }

    public  void addFragment(Fragment fragment,String title){

        fragmentList.add(fragment);
        fragmentTitleList.add(title);
    }


}
