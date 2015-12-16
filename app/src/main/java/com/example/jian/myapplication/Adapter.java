package com.example.jian.myapplication;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Jian on 2015-12-15.
 */
public class Adapter extends FragmentPagerAdapter {

    private Context context;

    public Adapter(FragmentManager fm) {
        super(fm);
    }

    public Adapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0:
                fragment = new MyFragment();
                break;
            case 1:
                fragment = new MyFragment();
                break;
            case 2:
                fragment = new MyFragment();
                break;
            case 3:
                fragment = new MyFragment();
                break;
            case 4:
                fragment = new MyFragment();
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 5;
    }


}
