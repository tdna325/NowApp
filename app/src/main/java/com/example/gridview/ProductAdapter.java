package com.example.gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class ProductAdapter extends ArrayAdapter<Product> {
    Context context;
    int resource;
    ArrayList<Product> arrayList;
    public ProductAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Product> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.arrayList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(R.layout.list_row_sanpham,parent,false);
        ImageView image_product = convertView.findViewById(R.id.img_sanpham);
        TextView txt_name_product = convertView.findViewById(R.id.name_sanpham);
        TextView txt_addr_product = convertView.findViewById(R.id.addr_sanpham);
        TextView txt_sao_product = convertView.findViewById(R.id.sao_sanpham);
        Product product = arrayList.get(position);

        image_product.setImageResource(product.getmImage());
        txt_name_product.setText(product.getmName());
        txt_addr_product.setText(product.getmAdd());
        txt_sao_product.setText(product.getmSao());

        return convertView;
    }
}
