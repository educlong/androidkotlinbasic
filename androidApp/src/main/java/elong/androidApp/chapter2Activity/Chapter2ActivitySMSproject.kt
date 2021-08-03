package elong.androidApp.chapter2Activity

import android.Manifest
import android.app.Activity
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import elong.androidApp.R
import elong.models.chapter1_2_3_7.DanhBa
import elong.androidApp.services.chapter2ImplicitIntent.ImplicitIntent

class Chapter2ActivitySMSproject : AppCompatActivity() {
    var txtNguoiNhan:TextView?=null
    var txtNoiDungSMS:EditText?=null
    var btnSendSMS:Button?=null
    var danhBaSelected:DanhBa?=null
    private val MY_PERMISSION_REQUEST_SEND_SMS:Int=0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chapter2_activity_sms_project)
        addControls()
        addEvents()
    }

    private fun addControls() {
        txtNguoiNhan=findViewById(R.id.txtNguoiNhan)
        txtNoiDungSMS=findViewById(R.id.txtNoiDungSMS)
        btnSendSMS=findViewById(R.id.btnSendSMS)
        var intentDanhBa:Intent=intent
        danhBaSelected=intentDanhBa.getSerializableExtra("danh_ba") as DanhBa
        txtNguoiNhan!!.text="${danhBaSelected!!.CodeUser}-${danhBaSelected!!.NameUser}-${danhBaSelected!!.PhoneUser}"    //Lấy intent ra từ DanhBaAdapter (hàm doMessage)
    }
    private fun addEvents() {
        btnSendSMS!!.setOnClickListener { view -> doSendSMS() }
    }
    private fun doSendSMS() {
        registerReceiver(object : BroadcastReceiver() { override fun onReceive(context: Context, intent: Intent) {  //cái này chưa hiểu
                var result = resultCode
                var msg = "Đã gửi tin nhắn thành công!"
                if (result != Activity.RESULT_OK) msg = "Gửi tin nhắn thất bại!"
                Toast.makeText(this@Chapter2ActivitySMSproject, msg, Toast.LENGTH_LONG).show()
            }
        }, IntentFilter("ACTION_MSG_SENT"))
        ImplicitIntent.S_M_S_Control.sMS(danhBaSelected!!.PhoneUser.toString(),txtNoiDungSMS!!.text.toString(),
                    Intent.ACTION_SEND,Manifest.permission.SEND_SMS,this@Chapter2ActivitySMSproject,MY_PERMISSION_REQUEST_SEND_SMS)
    }
/*    override fun onRequestPermissionsResult(requestCode:Int,permissions:Array<out String>,grantResults:IntArray){
        if (requestCode==MY_PERMISSION_REQUEST_SEND_SMS)                                        *//*the result will be passed via this method. -> KO CẦN THIẾT*//*
            if (grantResults.isNotEmpty() && grantResults[0]==PackageManager.PERMISSION_GRANTED)*//*Check whether the length of grantResults>0 and = PERMISSION_GRANDTED*//*
                Toast.makeText(this@MainActivitySMSproject,"Thanks for permitting!", Toast.LENGTH_SHORT).show()
            else Toast.makeText(this@MainActivitySMSproject,"Why didn't you permit me idiot!", Toast.LENGTH_SHORT).show()
    }*/
}