package com.example.gridview.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.gridview.R;
import com.example.gridview.model.Milk;

import java.util.ArrayList;

public class AdapterBoSuuTapListView extends ArrayAdapter<Milk> {
    private Context context;
    private int resource;
    private ArrayList<Milk> arrList;


    public AdapterBoSuuTapListView(@NonNull Context context, int resource, ArrayList<Milk> objects) {
        super(context, resource, objects);
        this.context=context;
        this.resource=resource;
        this.arrList=objects;
    }

    @NonNull
    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(R.layout.item_lv,parent,false);
        ImageView ig_sp = (ImageView) convertView.findViewById(R.id.igsp);
        ImageView ig_check = (ImageView) convertView.findViewById(R.id.igcheck);
        TextView tv_tenquan = (TextView) convertView.findViewById(R.id.tv_tenquan);
        TextView tv_diachi = (TextView) convertView.findViewById(R.id.tv_diachi);
        TextView tv_danhgia = (TextView) convertView.findViewById(R.id.tv_danhgia);
        TextView tv_thoigian = (TextView) convertView.findViewById(R.id.tv_thoigian);
        TextView tv_khac = (TextView) convertView.findViewById(R.id.tv_khac);
        Milk milk = arrList.get(position);
        ig_sp.setImageResource(milk.getmAnh());
        ig_check.setImageResource(milk.getMcheck());
        tv_tenquan.setText(milk.getMtenquan());
        tv_diachi.setText(milk.getMdiachi());
        tv_danhgia.setText(milk.getMdanhgia());
        tv_thoigian.setText(milk.getMtgian());
        tv_khac.setText(milk.getMkhac());
        return convertView;
    }
}
