package elong.modelView.mainActivityDataBindingDemo.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;
import androidx.databinding.BindingAdapter;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ObservableArrayList;
import elong.androidApp.R;
import elong.androidApp.databinding.ItemDatabindingBinding;
import elong.modelView.AdapterList;
import elong.modelView.mainActivityDataBindingDemo.User;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ListBinder {
    @BindingAdapter("bind:item_databinding")   /*chính là spinner trong file xml activity_main_data_binding_demo.xml (bind:item_databinding="@={infos.users}")*/
    public static void bindList(Spinner spinner, ObservableArrayList<User> users){
        AdapterList<User> adapter=new AdapterList<User>(users) {
            @NotNull
            @Override
            public View rootBinding(@Nullable LayoutInflater inflater, @Nullable ViewGroup parent, @NotNull ObservableArrayList<User> datas, int position) {
                ItemDatabindingBinding binding          /*binding này có sẵn khi we ép thư viện dataBinding enable=true, */
                        = DataBindingUtil.inflate(inflater, R.layout.item_databinding,parent,false);    /*cú pháp để nhân bản layout lên*/
                binding.setInfor(datas.get(position));   /*binding này sẽ đc hiểu như là biến infor <variable> trong file xml item*/
                return binding.getRoot();
            }
        };
        spinner.setAdapter(adapter);/*add adapter cho spinner*/
    }
}
