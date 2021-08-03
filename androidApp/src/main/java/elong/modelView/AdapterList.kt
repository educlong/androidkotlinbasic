package elong.modelView

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import androidx.databinding.ObservableArrayList

abstract class AdapterList<Data> : BaseAdapter {
    private var datas:ObservableArrayList<Data> = ObservableArrayList()
    private var inflater:LayoutInflater?=null

    constructor(datas: ObservableArrayList<Data>) : super() {
        this.datas = datas
    }

    override fun getCount(): Int {
        return datas.size
    }

    override fun getItem(position: Int): Data {
        return datas[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View { /*dùng để vẽ lên zao diện, nhân bản data lên*/
        if (inflater==null)    /*tương tự như hàm getView trong ArrayAdapter*/
            if (parent != null)
                inflater=parent.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater /*có inflater rồi thì nạp lên*/
        return rootBinding(inflater,parent,datas,position)
    }

    public abstract fun rootBinding(inflater: LayoutInflater?, parent: ViewGroup?, datas: ObservableArrayList<Data>, position: Int): View
}