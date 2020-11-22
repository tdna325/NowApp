package com.example.gridview.Adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.gridview.Fragment.FragmentRiceBanChay;
import com.example.gridview.Fragment.FragmentRiceDanhGia;
import com.example.gridview.Fragment.FragmentRiceGanToi;
import com.example.gridview.Fragment.FragmentRiceGiaoNhanh;

public class AdapterRiceTabLayout extends FragmentStatePagerAdapter {
    private String listTab[] = {"Gần Tôi" , "Bán Chạy", "Đánh Giá", "Giao Nhanh"};
    private FragmentRiceGanToi FragmentRiceGanToi;
    private FragmentRiceBanChay FragmentRiceBanChay;
    private FragmentRiceDanhGia FragmentRiceDanhGia;
    private FragmentRiceGiaoNhanh FragmentRiceGiaoNhanh;
    public AdapterRiceTabLayout(@NonNull FragmentManager fm) {
        super(fm);
        FragmentRiceGanToi = new FragmentRiceGanToi();
        FragmentRiceBanChay = new FragmentRiceBanChay();
        FragmentRiceDanhGia = new FragmentRiceDanhGia();
        FragmentRiceGiaoNhanh = new FragmentRiceGiaoNhanh();
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if(position == 0){
            return FragmentRiceGanToi;
        } else if (position == 1) {
            return FragmentRiceBanChay;
        } else if(position ==2){
            return FragmentRiceDanhGia;
        } else if(position==3){
            return FragmentRiceGiaoNhanh;
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
