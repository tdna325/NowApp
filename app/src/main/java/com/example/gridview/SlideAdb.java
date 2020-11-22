package com.example.gridview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.smarteist.autoimageslider.SliderViewAdapter;

public class SlideAdb extends SliderViewAdapter<SlideAdb.Holder> {
    int[] images;
    public SlideAdb (int[] images)
    {
        this.images = images;
    }

    @Override
    public SlideAdb.Holder onCreateViewHolder(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.slider_item,parent,false);

        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(SlideAdb.Holder viewHolder, int position) {
        viewHolder.imageView.setImageResource(images[position]);
    }

    @Override
    public int getCount() {
        return images.length;
    }

    public class Holder extends SliderViewAdapter.ViewHolder {
        ImageView imageView;


        public Holder(View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.image_slider);


        }
    }
}
