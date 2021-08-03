package elong.androidApp.adapter.gMapInfoWindowAdapter.chapter8

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.model.Marker
import elong.androidApp.R
import elong.models.chapter8.VoChongTuiGMap

class AdapterVoChongTuiGMap:GoogleMap.InfoWindowAdapter{
    var activity:Activity?=null
    var voChongTuiGMapGMap:VoChongTuiGMap?=null
    var imgNameVoChongTuiGMap:ImageView?=null
    var txtNameVoChongTuiGMap: TextView?=null

    constructor(activity: Activity?, voChongTuiGMapGMap: VoChongTuiGMap?) {
        this.activity = activity            /*màn hình nào sử dụng cái AdapterCustomInforGMap này*/
        this.voChongTuiGMapGMap = voChongTuiGMapGMap
    }

    override fun getInfoWindow(p0: Marker?): View? {
        return null
    }

    override fun getInfoContents(p0: Marker?): View {   /*hàm getContents để vẽ lên zao diện*/
        var inflater:LayoutInflater=this.activity!!.layoutInflater
        var row:View=inflater.inflate(R.layout.item_chapter8_vochongtui_gmap,null)
        imgNameVoChongTuiGMap=row.findViewById(R.id.imgNameVoChongTuiGMap)
        txtNameVoChongTuiGMap=row.findViewById(R.id.txtNameVoChongTuiGMap)
        if (voChongTuiGMapGMap!!.ImageVoChongTuiGMap!=null)
            imgNameVoChongTuiGMap!!.setImageResource(voChongTuiGMapGMap!!.ImageVoChongTuiGMap!!)
        if (voChongTuiGMapGMap!!.BitmapVoChongTuiGMap!=null)
            imgNameVoChongTuiGMap!!.setImageBitmap(voChongTuiGMapGMap!!.BitmapVoChongTuiGMap!!)
        txtNameVoChongTuiGMap!!.text= voChongTuiGMapGMap!!.NameVoChongTuiGMap
        return row
    }

}