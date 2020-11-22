package com.example.gridview.Adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.gridview.Fragment.FragmentChiTietMilkBinhLuan;
import com.example.gridview.Fragment.FragmentChiTietMilkGiaoHang;
import com.example.gridview.Fragment.FragmentChiTietMilkThongTin;

public class AdapterChiTietMilkTabLayout extends FragmentStatePagerAdapter {
    private String listTab[] = {"Giao Hàng" , "Bình Luận", "Thông Tin"};
    private com.example.gridview.Fragment.FragmentChiTietMilkGiaoHang FragmentChiTietMilkGiaoHang;
    private com.example.gridview.Fragment.FragmentChiTietMilkBinhLuan FragmentChiTietMilkBinhLuan;
    private com.example.gridview.Fragment.FragmentChiTietMilkThongTin FragmentChiTietMilkThongTin;
    public AdapterChiTietMilkTabLayout(@NonNull FragmentManager fm) {
        super(fm);
        FragmentChiTietMilkGiaoHang = new FragmentChiTietMilkGiaoHang();
        FragmentChiTietMilkBinhLuan = new FragmentChiTietMilkBinhLuan();
        FragmentChiTietMilkThongTin = new FragmentChiTietMilkThongTin();
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if(position == 0){
            return FragmentChiTietMilkGiaoHang;
        } else if (position == 1) {
            return FragmentChiTietMilkBinhLuan;
        } else if(position ==2){
            return FragmentChiTietMilkThongTin;
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


