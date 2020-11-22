package com.example.gridview.Adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.gridview.Fragment.FragmentDatNhieu;
import com.example.gridview.Fragment.FragmentGanToi;
import com.example.gridview.Fragment.FragmentGiamNhieu;
import com.example.gridview.Fragment.FragmentGoiY;


public class AdapterBoSuuTapTabLayout extends FragmentStatePagerAdapter {
    private String listTab[] = {"Gợi Ý" , "Gần Tôi", "Đặt Nhiều", "Giảm Nhiều"};
    private FragmentGoiY FragmentGoiY;
    private FragmentGanToi FragmentGanToi;
    private FragmentDatNhieu FragmentDatNhieu;
    private FragmentGiamNhieu FragmentGiamNhieu;


    public AdapterBoSuuTapTabLayout(@NonNull FragmentManager fm) {
        super(fm);
        FragmentGoiY = new FragmentGoiY();
        FragmentGanToi = new FragmentGanToi();
        FragmentDatNhieu = new FragmentDatNhieu();
        FragmentGiamNhieu = new FragmentGiamNhieu();
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if(position == 0){
            return FragmentGoiY;
        } else if (position == 1) {
            return FragmentGanToi;
        } else if(position ==2){
            return FragmentDatNhieu;
        } else if(position==3){
            return FragmentGiamNhieu;
        }
        return null;
    }

    @Override
    public int getCount() {
        return listTab.length;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return listTab[position];
    }
}
