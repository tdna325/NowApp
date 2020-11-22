package com.example.gridview;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.gridview.Adapter.AdapterRiceTabLayout;
import com.google.android.material.tabs.TabLayout;

public class MainRice extends AppCompatActivity {
    private ViewPager mVp;
    ImageView btback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_rice);
        initView();

        btback = (ImageView) findViewById(R.id.ig_back);
        btback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(com.example.gridview.MainRice.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }

    private void initView() {
        mVp = (ViewPager) findViewById(R.id.Vp_rice);
        mVp.setAdapter(new AdapterRiceTabLayout(getSupportFragmentManager()));
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_rice);
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