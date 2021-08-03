package elong.modelView.mainActivityChapter1EventOnView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.databinding.BindingAdapter;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ObservableArrayList;
import elong.androidApp.R;
import elong.androidApp.databinding.ItemChapter1GridviewBinding;
import elong.modelView.AdapterList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class GvImagesBinder {
    @BindingAdapter("bind:item_gvimages")
    public static void bindList(GridView gv, ObservableArrayList<GvImage> imgs){
        AdapterList<GvImage> adapter=new AdapterList<GvImage>(imgs) {
            @NotNull
            @Override
            public View rootBinding(@Nullable LayoutInflater inflater, @Nullable ViewGroup parent, @NotNull ObservableArrayList<GvImage> datas, int position) {
                ItemChapter1GridviewBinding binding= DataBindingUtil.inflate(inflater, R.layout.item_chapter1_gridview,parent,false);
                binding.setGvimg(datas.get(position));
                return binding.getRoot();
            }
        };
        gv.setAdapter(adapter);
    }
}
