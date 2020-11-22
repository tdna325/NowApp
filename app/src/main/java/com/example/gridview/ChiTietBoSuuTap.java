package com.example.gridview;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.gridview.Adapter.AdapterBoSuuTapTabLayout;
import com.google.android.material.tabs.TabLayout;

public class ChiTietBoSuuTap extends AppCompatActivity {
    ImageView btnback;
    private ViewPager mVp;
    private ImageView imageView;
    private TextView name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chi_tiet_bo_suu_tap);
        initView();
        int k = getIntent().getIntExtra("Image",R.drawable.bst1);
        imageView = findViewById(R.id.image_qc);
        name = findViewById(R.id.name_sale);
        imageView.setImageResource(getIntent().getIntExtra("Image",R.drawable.bst1));
        name.setText(getIntent().getStringExtra("Name"));
        btnback = (ImageView) findViewById(R.id.igback);

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    private void initView() {
        mVp = (ViewPager) findViewById(R.id.Vp_bosuatap);
        mVp.setAdapter(new AdapterBoSuuTapTabLayout(getSupportFragmentManager()));
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_bosuatap);
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