package com.example.gridview;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.gridview.Adapter.AdapterChiTietMilkTabLayout;
import com.google.android.material.tabs.TabLayout;

public class ChiTietTraSua extends AppCompatActivity {
    ImageView poster;
    TextView namept;
    TextView diachipt;
    ImageView btnback;
    private ViewPager mVp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chi_tiet_tra_sua);
        poster = findViewById(R.id.image_poster);
        namept = findViewById(R.id.tv_tenquan);
        diachipt = findViewById(R.id.tv_diachi);

        poster.setImageResource(getIntent().getIntExtra("ImagePoster",R.drawable.milk4));
        namept.setText(getIntent().getStringExtra("NamePoster"));
        diachipt.setText(getIntent().getStringExtra("DiaChiPoster"));
        initView();
        btnback = (ImageView) findViewById(R.id.igchitietmilkback);

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    private void initView() {
        mVp = (ViewPager) findViewById(R.id.Vp_chitiettrasua);
        mVp.setAdapter(new AdapterChiTietMilkTabLayout(getSupportFragmentManager()));
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_chitiettrasua);
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