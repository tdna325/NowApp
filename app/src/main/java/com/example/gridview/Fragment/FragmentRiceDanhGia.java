package com.example.gridview.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.gridview.Adapter.AdapterBoSuuTapListView;
import com.example.gridview.R;
import com.example.gridview.model.Milk;

import java.util.ArrayList;

public class FragmentRiceDanhGia extends Fragment {
    private View mRootView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mRootView = inflater.inflate(R.layout.activity_fragment_rice_danh_gia,container,false);

        ArrayList<Milk> arrayList = new ArrayList<>();
        ListView lv = (ListView) mRootView.findViewById(R.id.lv_danhgia);
        Milk gantoi4 = new Milk(R.drawable.rice4,R.drawable.checkmark,"Cơm Thố Tuấn Lộc","91D Dũng Sỹ Thanh Khê, Quận Thanh Khê, Đà Nẵng","⭐️ 4.7","\uD83D\uDD52 37min*10.5km","1 địa điểm khác >");
        Milk gantoi5 = new Milk(R.drawable.rice5,R.drawable.checkmark,"Cơm Tấm Ba Lam","105 Huỳnh Thúc Kháng, Quận Hải Châu, Đà Nẵng","⭐️ 4.8","\uD83D\uDD52 37min*9.4km","1 địa điểm khác >");
        Milk gantoi6 = new Milk(R.drawable.rice6,R.drawable.checkmark,"Cơm Kim Long - Ngô Gia Tự","125/8 Ngô Gia Tự, Quận Hải Châu, Đà Nẵng","⭐️ 4.8","\uD83D\uDD52 37min*2.5km","1 địa điểm khác >");
        final AdapterBoSuuTapListView customAdapter = new AdapterBoSuuTapListView(mRootView.getContext(),R.layout.item_lv,arrayList);
        arrayList.add(gantoi4);
        arrayList.add(gantoi5);
        arrayList.add(gantoi6);

        lv.setAdapter(customAdapter);


        return mRootView;
    }
}