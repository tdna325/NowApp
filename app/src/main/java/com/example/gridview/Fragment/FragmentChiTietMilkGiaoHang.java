package com.example.gridview.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.gridview.Adapter.AdapterMilkListView;
import com.example.gridview.R;
import com.example.gridview.model.ChiTietMilk;

import java.util.ArrayList;

public class FragmentChiTietMilkGiaoHang extends Fragment {
    private View mRootView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mRootView = inflater.inflate(R.layout.activity_fragment_chi_tiet_milk_giao_hang,container,false);

        ArrayList<ChiTietMilk> arrayList = new ArrayList<>();
        ListView lv = (ListView) mRootView.findViewById(R.id.lv_chitietmilkgiaohang);
        ChiTietMilk gantoi1 = new ChiTietMilk(R.drawable.milk1,R.drawable.addmon,"Milo dầm trân châu","\uD83D\uDC5C 999+ | \uD83D\uDC4D 10+","13,000đ");
        ChiTietMilk gantoi2 = new ChiTietMilk(R.drawable.milk1,R.drawable.addmon,"Milo Đặt biệt","\uD83D\uDC5C 999+ | \uD83D\uDC4D 10+","34,000đ");
        ChiTietMilk gantoi3 = new ChiTietMilk(R.drawable.milk1,R.drawable.addmon,"COMBO 66K","\uD83D\uDC5C 999+ | \uD83D\uDC4D 10+","66,000đ");
        ChiTietMilk gantoi4 = new ChiTietMilk(R.drawable.milk1,R.drawable.addmon,"Sữa tươi kem cheese","\uD83D\uDC5C 999+ | \uD83D\uDC4D 10+","27,000đ");
        ChiTietMilk gantoi5 = new ChiTietMilk(R.drawable.milk1,R.drawable.addmon,"Sữa tươi trân châu đường đen","\uD83D\uDC5C 999+ | \uD83D\uDC4D 10+","22,000đ");

        final AdapterMilkListView customAdapter = new AdapterMilkListView(mRootView.getContext(),R.layout.item_lv,arrayList);
        arrayList.add(gantoi1);
        arrayList.add(gantoi2);
        arrayList.add(gantoi3);
        arrayList.add(gantoi4);
        arrayList.add(gantoi5);

        lv.setAdapter(customAdapter);

        return mRootView;
    }
}