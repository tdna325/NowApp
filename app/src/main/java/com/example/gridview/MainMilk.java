package com.example.gridview;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.gridview.Adapter.AdapterBoSuuTapTabLayout;
import com.google.android.material.tabs.TabLayout;

public class MainMilk extends AppCompatActivity {
    private ViewPager mVp;
    ImageView btback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_milk);
        initView();

        btback = (ImageView) findViewById(R.id.ig_back);
        btback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void initView() {
        mVp = (ViewPager) findViewById(R.id.Vp_trasua);
        mVp.setAdapter(new AdapterBoSuuTapTabLayout(getSupportFragmentManager()));
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_trasua);
        tabLayout.setupWithViewPager(mVp);
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                mVp.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}