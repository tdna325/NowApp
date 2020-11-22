package com.example.gridview;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;


public class Tab2Fragment extends Fragment {


    public Tab2Fragment() {
        // Required empty public constructor
    }


    private ListView listView;
    ProductAdapter productAdapter;
    ArrayList<Product> arrayList_pr;
    int[] img_sp = new int[]{R.drawable.sanpham4,R.drawable.sanpham5,R.drawable.sanpham6};
    String[] name_sp = new String[]{"Quán Chay Loving Vegan","Quán Chay Phước Vegan","Quán Chay Viên Quang"};
    String[] addr_sanpham = new String[]{"202 Đỗ Bá, Quận Ngũ Hành Sơn, Đà Nẵng","285 Hải Phòng, Quận Thanh Khê, Đà Nẵng","566 Trần Cao Vân, Quận Thanh Khê, Đà Nẵng"};
    String[] sao_sanpham = new String[]{"4.9","4.7","4.6"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_tab2, container, false);
        listView = v.findViewById(R.id.lv_sanpham1);
        arrayList_pr = new ArrayList<>();
        for (int i = 0;i<name_sp.length;i++)
        {
            arrayList_pr.add(new Product(img_sp[i],name_sp[i],addr_sanpham[i],sao_sanpham[i]));
        }
        productAdapter = new ProductAdapter(getActivity(),R.layout.list_row_sanpham,arrayList_pr);
        listView.setAdapter(productAdapter);
        return v;


    }

}