package com.example.gridview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewFlipper;

import com.example.gridview.Adapter.Adapter;
import com.example.gridview.Adapter.AdapterBoSuuTapTabLayout;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabLayout;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    //khai báo bottom menu
    BottomNavigationView bottomNavigationView;
    //khai bao Sliper Image
    SlideAdb slideAdb;
    SliderView imageSlider;
    //khai bao Recycler San pham
    RecyclerView recyclerView_sanpham_1;
    ProductSaleAdapter productSaleProductSaleAdapter;
    ArrayList<ProductSale> productSales;
    int[] image_product = new int[]{R.drawable.sanpham_1,R.drawable.sanpham_2,R.drawable.sanpham_3,R.drawable.sanpham_4,R.drawable.sanpham_5};
    String[] name_product = new String[]{"Soda Cá cầu vồng","ỔI HỒNG XAO XUYẾN SIZE L (700ml)","Trà Sữa Pozaa (M)","Hồng Trà Xí Muội","Trà ô long hoa hồng"};
    String[] store_product = new String[]{"Trà Dào Dầm Choux - Văn Cao","Trà Sữa Ăn Vặt Bà Béo - Phan Anh","Pozza Tea - Nguyễn Khánh Toàn","S Coffe - Đường 3 tháng 2","Trà sữa R&B - Phan Châu Trinh"};
    String[] giamoi_product = new String[]{"1.000đ","1.000đ","1.000đ","1.000đ","1.000đ"};
    String[] giacu_product = new String[]{"20.000đ","25.000đ","25.000đ","25.000đ","42.000đ"};

    //san pham 2
    RecyclerView recyclerView_sanpham_2;
    int[] image_product_2 = new int[]{R.drawable.sanpham_6,R.drawable.sanpham_7,R.drawable.sanpham_8,R.drawable.sanpham_9,R.drawable.sanpham_10};
    String[] name_product_2 = new String[]{"Trà Sữa Nhật Bản","Bánh mì phomai mlx khô gà","Bánh mì phô mai truyền thống (hộp 6 bánh)","Bông lan ruốc","Hamburger tôm"};
    String[] store_product_2 = new String[]{"Trà Sữa Ông Nội Quán - Shop Online","Bánh Mì Phô Mai Đà Nẵng & Drink","Bánh Mì Phô Mai Đà Nẵng & Drink","Bánh Mì Phô Mai Đà Nẵng & Drink","Chick & Go - Gà Rán Và Xiên Que Nhật Bản"};
    String[] giamoi_product_2 = new String[]{"11.000đ","11.000đ","11.000đ","11.000đ","11.000đ"};
    String[] giacu_product_2 = new String[]{"20.000đ","20.000đ","20.000đ","20.000đ","20.000đ"};

    // khai bao FlipperView
    ViewFlipper viewFlipper;
    int[] img_flip = new int[]{R.drawable.f_1,R.drawable.f_2,R.drawable.f_3,R.drawable.f_4,R.drawable.f_5,R.drawable.f_6,R.drawable.f_7,R.drawable.f_8,R.drawable.f_9};

    // Recycler View
    RecyclerView recyclerView;
    RecylerAdapter Adapter5;
    ArrayList<Recyler> recylerArrayList;


    // khai bao GridView
    GridView gridView;
    ArrayList<InforList> arrayList;
    Adapter adapter;
    int[] image_gv = new int[]{R.drawable.rice,R.drawable.milk,R.drawable.beer,R.drawable.flower,R.drawable.medica,R.drawable.pet,R.drawable.snack,R.drawable.coke};
    String[] name_gv = new String[]{"Rices","Milks","Beers","Flowers","Medicines","Pets","Snacks","Cokes"};



    // khai báo spinner
    Spinner spinner;

    // khai báo Tablayout

    TabLayout tabLayout;
    ViewPager viewPager;

    // Button
    TextView buttonAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // button chon address
        buttonAdd = findViewById(R.id.btn_addr);

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ActivitySelectAdd.class);
                startActivity(intent);
            }
        });
        Intent intent2 = getIntent();
        String add_select = intent2.getStringExtra("ADDRESS_SELECTED");
        if (add_select==null)
        {
            buttonAdd.setText("Đà Nẵng");
        }
        else
        {
            buttonAdd.setText(add_select);
        }

        AnhXa();
        adapter = new Adapter(this,R.layout.gridlayout,arrayList);
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i;
                switch (position){
                    case 0:
                        i =new Intent(MainActivity.this,MainRice.class);
                        startActivity(i);

                        break;
                    case 1:
                        i =new Intent(MainActivity.this,MainMilk.class);
                        startActivity(i);
                        break;
                    default: Toast.makeText(MainActivity.this,position+"",Toast.LENGTH_SHORT).show();
                }
            }
        });


        //bottom menu
        bottomNavigationView = findViewById(R.id.bottom_menu);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(0);
        menuItem.setChecked(true);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Intent intent;
                switch (item.getItemId()){
                    case R.id.ic_home:
                        break;
                    case R.id.ic_giohang:
                        intent =new Intent(MainActivity.this,MainActivityGioHang.class);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_from_right, R.anim.silde_out_to_left);
                        break;
                    case R.id.ic_me:
                        intent =new Intent(MainActivity.this,MainActivityMe.class);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_from_right, R.anim.silde_out_to_left);
                        break;
                }
                return false;
            }
        });
        // Recycler quảng cáo 2


        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recylerArrayList = new ArrayList<>();
        int[] pic= new int[]{R.drawable.r_0d,R.drawable.r_1k,R.drawable.r_11k,R.drawable.r_111k,R.drawable.r_16h,R.drawable.r_50,R.drawable.ke,R.drawable.free,R.drawable.r_new};
        String[] re_name = new String[]{"Siêu deal 0Đ","Đồng giá 1k","Đồng giá 11k","Đồng giá 111k","Đồ uống giờ vàng 16H","Siêu deal 50%","Ăn xế không lo ế","Freeship XTRA","Quán mới Now mời"};
        for (int j=0; j< re_name.length; j++)
        {
            Recyler recyler = new Recyler(pic[j],re_name[j]);
            recylerArrayList.add(recyler);
        }
        Adapter5 = new RecylerAdapter(recylerArrayList,this);
        recyclerView.setAdapter(Adapter5);


        // Tablayout
        tabLayout = findViewById(R.id.tab_layout);
        viewPager = findViewById(R.id.view_fragment);

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);

        //SanPham_1
        recyclerView_sanpham_1 = findViewById(R.id.recycler_sanpham_1);
        recyclerView_sanpham_1.setHasFixedSize(true);
        LinearLayoutManager layoutManager1 = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView_sanpham_1.setLayoutManager(layoutManager1);
        productSales = new ArrayList<>();
        for (int i= 0;i<name_product.length;i++)
        {
            productSales.add(new ProductSale(image_product[i],name_product[i],store_product[i],giamoi_product[i],giacu_product[i]));
        }
        productSaleProductSaleAdapter = new ProductSaleAdapter(productSales,this);
        recyclerView_sanpham_1.setAdapter(productSaleProductSaleAdapter);
        //SanPham_2
        recyclerView_sanpham_2 = findViewById(R.id.recycler_sanpham_2);
        recyclerView_sanpham_2.setHasFixedSize(true);
        LinearLayoutManager layoutManager2 = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView_sanpham_2.setLayoutManager(layoutManager2);
        productSales = new ArrayList<>();
        for (int i= 0;i<name_product_2.length;i++)
        {
            productSales.add(new ProductSale(image_product_2[i],name_product_2[i],store_product_2[i],giamoi_product_2[i],giacu_product_2[i]));
        }
        productSaleProductSaleAdapter = new ProductSaleAdapter(productSales,this);
        recyclerView_sanpham_2.setAdapter(productSaleProductSaleAdapter);

        //slider

        imageSlider = findViewById(R.id.slider);

        slideAdb = new SlideAdb(img_flip);
        imageSlider.setSliderAdapter(slideAdb);
        imageSlider.setIndicatorAnimation(IndicatorAnimationType.WORM);
        imageSlider.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        imageSlider.startAutoCycle();

    }

    private void AnhXa() {
        gridView = findViewById(R.id.gridView);
        arrayList = new ArrayList<>();
        for (int i = 0;i < name_gv.length;i++)
        {
            InforList inforList =new InforList(image_gv[i],name_gv[i]);
            arrayList.add(inforList);
        }
    }
}