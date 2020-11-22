package com.example.gridview;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;


public class Tab3Fragment extends Fragment {



    public Tab3Fragment() {
        // Required empty public constructor
    }


    private ListView listView;
    ProductAdapter productAdapter;
    ArrayList<Product> arrayList_pr;
    int[] img_sp = new int[]{R.drawable.sanpham3,R.drawable.sanpham7,R.drawable.sanpham8};
    String[] name_sp = new String[]{"MiLan Milktea","Trà Sữa Nội Quán - Shop Online","Milano Coffee - Phạm Như Xương"};
    String[] addr_sanpham = new String[]{"22-26 Lê Thánh Tông, Quận Hải Châu, Đà Nẵng","K15/11 Phạm Ngũ Lão, Quận Hải Châu, Đà Nẵng","21 Phạm Như Xương, Quận Liên Chiểu, Đà Nẵng"};
    String[] sao_sanpham = new String[]{"4.8","4.8","4.8"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_tab3, container, false);
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