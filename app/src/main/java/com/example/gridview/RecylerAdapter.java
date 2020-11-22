package com.example.gridview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecylerAdapter  extends RecyclerView.Adapter<RecylerAdapter.ViewHolder> {
    ArrayList<Recyler> recylers;
    Context context;

    public RecylerAdapter(ArrayList<Recyler> recylerArrayAdapter,Context context) {
        this.recylers = recylerArrayAdapter;
        this.context = context;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View itemView = layoutInflater.inflate(R.layout.recycler_view,parent,false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        holder.txtView.setText(recylers.get(position).getRc_name());
        holder.imgView.setImageResource(recylers.get(position).getPic());
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ChiTietBoSuuTap.class);
                intent.putExtra("Image",recylers.get(position).getPic());
                intent.putExtra("Name",recylers.get(position).getRc_name());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return recylers.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtView;
        ImageView imgView;
        LinearLayout linearLayout;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtView = (TextView) itemView.findViewById(R.id.name_recy);
            imgView = (ImageView) itemView.findViewById(R.id.image_recy);
            linearLayout = (LinearLayout) itemView.findViewById(R.id.linear);
        }
    }






}
