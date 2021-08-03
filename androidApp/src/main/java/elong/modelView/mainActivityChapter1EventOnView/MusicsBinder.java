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
import elong.androidApp.databinding.ItemChapter13MusicBinding;
import elong.modelView.AdapterList;
import elong.models.chapter1_3.Music;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class MusicsBinder {
    @BindingAdapter("bind:item_music")
    public static void bindList(Spinner sp, ObservableArrayList<Music>musics){
        AdapterList<Music> adapter=new AdapterList<Music>(musics) {
            @NotNull
            @Override
            public View rootBinding(@Nullable LayoutInflater inflater, @Nullable ViewGroup parent, @NotNull ObservableArrayList<Music> datas, int position) {
                ItemChapter13MusicBinding binding = DataBindingUtil.inflate(inflater, R.layout.item_chapter1_3_music,parent,false);
                if (!datas.get(position).getLike())
                    binding.setMusic(datas.get(position));
                return binding.getRoot();
            }
        };
        sp.setAdapter(adapter);
    }
    @BindingAdapter("bind:item_musiclike")
    public static void bindListLike(Spinner sp, ObservableArrayList<Music>musics){
        AdapterList<Music> adapter=new AdapterList<Music>(musics) {
            @NotNull
            @Override
            public View rootBinding(@Nullable LayoutInflater inflater, @Nullable ViewGroup parent, @NotNull ObservableArrayList<Music> datas, int position) {
                ItemChapter13MusicBinding binding = DataBindingUtil.inflate(inflater, R.layout.item_chapter1_3_music,parent,false);
                if (datas.get(position).getLike())
                    binding.setMusic(datas.get(position));
                return binding.getRoot();
            }
        };
        sp.setAdapter(adapter);
    }
}
