package elong.androidApp.adapter.arrayAdapter.chapter8

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import elong.androidApp.R
import elong.models.chapter8.VoChongTuiGMap

class AdapterAddressVoChongTui(var activity: Activity,var resource: Int,var objects: MutableList<VoChongTuiGMap>) : ArrayAdapter<VoChongTuiGMap>(activity, resource, objects) {
    var imgAddressVkCkGGMap:ImageView?=null
    var txtNameAddressVkCkGGMap:TextView?=null
    var txtLatitudeLongitudeVkCkGGMap:TextView?=null
    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var inflater:LayoutInflater=this.activity.layoutInflater
        var item:View=inflater.inflate(this.resource,null)
        imgAddressVkCkGGMap=item.findViewById(R.id.imgAddressVkCkGGMap)
        txtNameAddressVkCkGGMap=item.findViewById(R.id.txtNameAddressVkCkGGMap)
        txtLatitudeLongitudeVkCkGGMap=item.findViewById(R.id.txtLatitudeLongitudeVkCkGGMap)
        var voChongTuiGMap:VoChongTuiGMap= this.objects[position]
        imgAddressVkCkGGMap!!.setImageBitmap(voChongTuiGMap.BitmapVoChongTuiGMap)
        txtNameAddressVkCkGGMap!!.text=voChongTuiGMap.NameVoChongTuiGMap
        txtLatitudeLongitudeVkCkGGMap!!.text="${voChongTuiGMap.ViDoVoChongTuiGMap}, ${voChongTuiGMap.KinhDoVoChongTuiGMap}"
        return item
    }
}