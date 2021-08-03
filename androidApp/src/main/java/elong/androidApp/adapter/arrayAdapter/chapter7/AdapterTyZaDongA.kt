package elong.androidApp.adapter.arrayAdapter.chapter7

import android.annotation.SuppressLint
import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import elong.androidApp.R
import elong.models.chapter7.TyZaDongA

class AdapterTyZaDongA(var activity:Activity,var resource: Int,var objects: MutableList<TyZaDongA>) : ArrayAdapter<TyZaDongA>(activity, resource, objects) {

    var imgCountryTyZaJSON:ImageView? = null
    var txtCountryTyZaJSON:TextView?=null
    var txtMuaTienMatTyZaJSON:TextView?=null
    var txtMuaChuyenKhoanTyZaJSON:TextView?=null
    var txtBanTienMatTyZaJSON:TextView?=null
    var txtBanChuyenKhoanTyZaJSON:TextView?=null
    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var inflater:LayoutInflater=this.activity!!.layoutInflater
        var row:View = inflater.inflate(this.resource,null)
        addControls(position,row)
        addEvents(position,row)
        return row
    }

    private fun addControls(position: Int, row: View) {
        imgCountryTyZaJSON= row.findViewById(R.id.imgCountryTyZaJSON)
        txtCountryTyZaJSON=row.findViewById(R.id.txtCountryTyZaJSON)
        txtMuaTienMatTyZaJSON=row.findViewById(R.id.txtMuaTienMatTyZaJSON)
        txtMuaChuyenKhoanTyZaJSON=row.findViewById(R.id.txtMuaChuyenKhoanTyZaJSON)
        txtBanTienMatTyZaJSON=row.findViewById(R.id.txtBanTienMatTyZaJSON)
        txtBanChuyenKhoanTyZaJSON=row.findViewById(R.id.txtBanChuyenKhoanTyZaJSON)

    }

    private fun addEvents(position: Int, row: View) {
        var tyZaDongA:TyZaDongA = this.objects.get(position)
        imgCountryTyZaJSON!!.setImageBitmap(tyZaDongA.BitmapImg)
        txtCountryTyZaJSON!!.text=tyZaDongA.Type
        txtMuaTienMatTyZaJSON!!.text=tyZaDongA.Muatienmat
        txtMuaChuyenKhoanTyZaJSON!!.text=tyZaDongA.Muack
        txtBanTienMatTyZaJSON!!.text=tyZaDongA.Bantienmat
        txtBanChuyenKhoanTyZaJSON!!.text=tyZaDongA.Banck
    }
}