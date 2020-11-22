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

public class FragmentGanToi extends Fragment {
    private View mRootView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mRootView = inflater.inflate(R.layout.activity_gan_toi,container,false);

        ArrayList<Milk> arrayList = new ArrayList<>();
        ListView lv = (ListView) mRootView.findViewById(R.id.lvgantoi);
        Milk gantoi4 = new Milk(R.drawable.milk4,R.drawable.checkmark,"Trà Đào Dầm Choux - Văn Cao","k2/06 Văn Cao, Quận Thanh Khê, Đà Nẵng","⭐️ 4.7","\uD83D\uDD52 37min*10.5km","1 địa điểm khác >");
        Milk gantoi5 = new Milk(R.drawable.milk5,R.drawable.checkmark,"Trà Sữa Nhà Làm Hoa Ly-Trầ..","832 Trần Cao Vân, Quận Thanh Khê, Đà Nẵng","⭐️ 4.8","\uD83D\uDD52 37min*9.4km","1 địa điểm khác >");
        Milk gantoi6 = new Milk(R.drawable.milk1,R.drawable.checkmark,"XIU Milk - Nguyễn Hoàng","239 Nguyễn Hoàng, Quận Thanh Khê, Đà Nẵng","⭐️ 4.8","\uD83D\uDD52 37min*2.5km","1 địa điểm khác >");
        final AdapterBoSuuTapListView customAdapter = new AdapterBoSuuTapListView(mRootView.getContext(),R.layout.item_lv,arrayList);
        arrayList.add(gantoi4);
        arrayList.add(gantoi5);
        arrayList.add(gantoi6);

        lv.setAdapter(customAdapter);


        return mRootView;
    }
}
