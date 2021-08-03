package elong.modelView.mainActivityChapter1EventOnView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Spinner;
import androidx.databinding.BindingAdapter;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ObservableArrayList;
import elong.androidApp.R;
import elong.androidApp.databinding.ItemChapter1237LisviewAdvanceBinding;
import elong.modelView.AdapterList;
import elong.models.chapter1_2_3_7.DanhBa;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class DanhBasLvBinder {
    @BindingAdapter("bind:item_lvadvancedanhba")
    public static void bindList(ListView lv, ObservableArrayList<DanhBa>danhBas){
        AdapterList<DanhBa> adapter=new AdapterList<DanhBa>(danhBas) {
            @NotNull
            @Override
            public View rootBinding(@Nullable LayoutInflater inflater, @Nullable ViewGroup parent, @NotNull ObservableArrayList<DanhBa> datas, int position) {
                ItemChapter1237LisviewAdvanceBinding binding= DataBindingUtil.inflate(inflater, R.layout.item_chapter1237_lisview_advance,parent,false);
                binding.setDanhBa(datas.get(position));
                return binding.getRoot();
            }
        };
        lv.setAdapter(adapter);
    }
    @BindingAdapter("bind:item_spinnerdanhba")
    public static void bindLítSpinner(Spinner sp, ObservableArrayList<DanhBa>danhBas){
        AdapterList<DanhBa> adapter=new AdapterList<DanhBa>(danhBas) {
            @NotNull
            @Override
            public View rootBinding(@Nullable LayoutInflater inflater, @Nullable ViewGroup parent, @NotNull ObservableArrayList<DanhBa> datas, int position) {
                ItemChapter1237LisviewAdvanceBinding binding= DataBindingUtil.inflate(inflater, R.layout.item_chapter1237_lisview_advance,parent,false);
                binding.setDanhBa(datas.get(position));
                return binding.getRoot();
            }
        };
        sp.setAdapter(adapter);
    }
}
