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

public class FragmentDatNhieu extends Fragment {
    private View mRootView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mRootView = inflater.inflate(R.layout.activity_dat_nhieu,container,false);

        ArrayList<Milk> arrayList = new ArrayList<>();
        ListView lv = (ListView) mRootView.findViewById(R.id.lvdatnhieu);
        Milk gantoi1 = new Milk(R.drawable.milk1,R.drawable.checkmark,"XIU Milk - Nguyễn Hoàng","239 Nguyễn Hoàng, Quận Thanh Khê, Đà Nẵng","⭐️ 4.8","\uD83D\uDD52 37min*2.5km","1 địa điểm khác >");
        Milk gantoi2 = new Milk(R.drawable.milk2,R.drawable.checkmark,"Trà Sữa Gong Cha - Nguyễn..","225 Nguyễn Văn Thoại, Quận Ngũ Hành Sơn..","⭐️ 4.7","\uD83D\uDD52 44min*13.2km","1 địa điểm khác >");
        Milk gantoi5 = new Milk(R.drawable.milk5,R.drawable.checkmark,"Trà Sữa Nhà Làm Hoa Ly-Trầ..","832 Trần Cao Vân, Quận Thanh Khê, Đà Nẵng","⭐️ 4.8","\uD83D\uDD52 37min*9.4km","1 địa điểm khác >");
        Milk gantoi6 = new Milk(R.drawable.milk1,R.drawable.checkmark,"XIU Milk - Nguyễn Hoàng","239 Nguyễn Hoàng, Quận Thanh Khê, Đà Nẵng","⭐️ 4.8","\uD83D\uDD52 37min*2.5km","1 địa điểm khác >");
        final AdapterBoSuuTapListView customAdapter = new AdapterBoSuuTapListView(mRootView.getContext(),R.layout.item_lv,arrayList);
        arrayList.add(gantoi1);
        arrayList.add(gantoi2);
        arrayList.add(gantoi5);
        arrayList.add(gantoi6);

        lv.setAdapter(customAdapter);


        return mRootView;
    }
}
