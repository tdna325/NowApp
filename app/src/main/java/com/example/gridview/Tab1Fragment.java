package com.example.gridview;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class Tab1Fragment extends Fragment {

    public Tab1Fragment() {

    }



    private ListView listView;
    ProductAdapter productAdapter;
    ArrayList<Product> arrayList_pr;
    int[] img_sp = new int[]{R.drawable.sanpham1,R.drawable.sanpham2,R.drawable.sanpham3};
    String[] name_sp = new String[]{"Bà Già - Mít Trộn & Bột Lọc ","Phố Cổ Hà Nội - Triệu Nữ Vương","MiLan Milktea"};
    String[] addr_sanpham = new String[]{"K47/25 Lý Thái Tổ, Quận Thanh Khê, Đà Nẵng","152 Triệu Nữ Vương, Quận Hải Châu, Đà Nẵng","22-26 Lê Thánh Tông, Quận Hải Châu, Đà Nẵng"};
    String[] sao_sanpham = new String[]{"4.7","4.7","4.8"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_tab1, container, false);
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