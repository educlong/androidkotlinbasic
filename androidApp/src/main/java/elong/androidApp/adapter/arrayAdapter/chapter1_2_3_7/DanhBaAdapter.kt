package elong.androidApp.adapter.arrayAdapter.chapter1_2_3_7

import android.Manifest
import android.app.Activity
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import elong.androidApp.R
import elong.androidApp.chapter2Activity.Chapter2ActivitySMSproject
import elong.models.chapter1_2_3_7.DanhBa
import elong.androidApp.services.chapter2ImplicitIntent.ImplicitIntent

class DanhBaAdapter(var activity: Activity, var resource: Int, var objects: List<DanhBa>) : ArrayAdapter<DanhBa?>(activity, resource, objects) {
    /**CHƯƠNG 1: VIEW VÀ XỬ LÝ SỰ KIỆN TRÊN VIEW*/
    var txtNameDanhBa:TextView?=null
    var txtTelephoneNumber:TextView?=null
    var txtCodeDanhBa:TextView?=null
    var btnCall:ImageButton?=null
    var btnSMS:ImageButton?=null
    var btnDetail:ImageButton?=null
    var btnNational:ImageButton?=null
    /**CHƯƠNG 2: ACTIVITY, EXPLICIT INTENT and IMPLICIT INTENT*/
    private val MY_PERMISSION_REQUEST_CALL_PHONE:Int=0;
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var inflater:LayoutInflater=this.activity!!.layoutInflater
        var row:View=inflater.inflate(this.resource!!,null)
        val danhBa = objects!![position]
        addControlsChapter1(danhBa, row)
        addEventsChapter2(danhBa)
        return row
    }
    /**CHƯƠNG 1: VIEW VÀ XỬ LÝ SỰ KIỆN TRÊN VIEW*/
    private fun addControlsChapter1(danhBa: DanhBa, row:View) {
        txtNameDanhBa=row.findViewById(R.id.txtNameDanhBa)
        txtTelephoneNumber=row.findViewById(R.id.txtTelephoneNumber)
        txtCodeDanhBa=row.findViewById(R.id.txtCodeDanhBa)
        btnCall=row.findViewById(R.id.btnCall)
        btnSMS=row.findViewById(R.id.btnSMS)
        btnDetail=row.findViewById(R.id.btnDetail)
        btnNational=row.findViewById(R.id.btnNational)

        txtCodeDanhBa!!.setText(danhBa.CodeUser!!.toString())
        txtNameDanhBa!!.setText(danhBa.NameUser)
        txtTelephoneNumber!!.setText(danhBa.PhoneUser)
        btnNational!!.setImageResource(R.drawable.elong)
    }
    /**CHƯƠNG 2: ACTIVITY, EXPLICIT INTENT and IMPLICIT INTENT*/
    private fun addEventsChapter2(danhBa: DanhBa) {
        btnCall!!.setOnClickListener { view -> addEventsChapter2DoCall(danhBa) }
        btnSMS!!.setOnClickListener { view -> addEventsChapter2DoSMS(danhBa) }
        btnDetail!!.setOnClickListener { view -> addEventsChapter2DoDetailAndDelete(danhBa) }
    }
    private fun addEventsChapter2DoCall(danhBa: DanhBa) {
        var intent = ImplicitIntent.DiallingCallingControl.diallingCalling(danhBa.PhoneUser.toString(),
                                    Intent.ACTION_CALL,Manifest.permission.CALL_PHONE,this.activity,MY_PERMISSION_REQUEST_CALL_PHONE)
        this.activity.startActivity(intent)
    }
    /**CHƯƠNG 2: ACTIVITY, EXPLICIT INTENT and IMPLICIT INTENT, gọi đến [Chapter2ActivitySMSproject.java] và [activity_main_sms_project.xml]*/
    private fun addEventsChapter2DoSMS(danhBa: DanhBa) {
        Toast.makeText(this.activity, danhBa.PhoneUser,Toast.LENGTH_SHORT).show()
        var intent:Intent=Intent(this.activity,Chapter2ActivitySMSproject::class.java)
        intent.putExtra("danh_ba",danhBa)
        this.activity.startActivity(intent)
    }
    private fun addEventsChapter2DoDetailAndDelete(danhBa: DanhBa) {
        Toast.makeText(this.activity, danhBa.toString(),Toast.LENGTH_SHORT).show()
        this.remove(danhBa)
    }
}