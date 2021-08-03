package elong.androidApp.chapter2Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import elong.androidApp.MainActivity
import elong.androidApp.R
import elong.androidApp.databinding.ActivityChapter2SendDataBinding
import elong.modelView.mainActivityChapter23.ExplicitIntentsReceiveData
import elong.models.chapter1.Employees
import elong.models.chapter1_3.Music

class Chapter2SendDataActivity : AppCompatActivity() {      //truyền data zữa các Activity mà không quantâm kquả trả về
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chapter2_send_data)

        var intent:Intent= intent;
        var kieuBoolean:Boolean=intent.getBooleanExtra("kieu_boolean",false)    //TH1: nhận data thông thường
        var kieuChar:Char=intent.getCharExtra("kieu_char",' ')
        var kieuInt:Int=intent.getIntExtra("kieu_int",0)
        var kieuDouble:Double=intent.getDoubleExtra("kieu_double",0.0)
        /*intent đẩy data đi có hàm put, lấy data ra có hàm get: Nếu tồn tại-> lấy. Nếu k tồn tại, lấy đối số 2*/
        var kieuString:String=intent.getStringExtra("kieu_string")
        var duclongNguyen:Employees=intent.getSerializableExtra("Nhan_vien") as Employees   //nhận data kiểu đối tượng

        var bundle:Bundle=intent.getBundleExtra("truyen_bang_bundle")                       //TH2: nhận data từ bundle
        var musicBundle: Music =bundle.getSerializable("Music_In_Karaoke") as Music

        var binding:ActivityChapter2SendDataBinding=DataBindingUtil.setContentView(this@Chapter2SendDataActivity,R.layout.activity_chapter2_send_data)
        var explicitIntentsReceiveData:ExplicitIntentsReceiveData=ExplicitIntentsReceiveData("$kieuBoolean\n$kieuChar\n$kieuInt\n$kieuDouble\n" +
                "$kieuString\n$duclongNguyen\n\n${bundle.getInt("kieu_int_bundle")}\n${bundle.getDouble("kieu_double_bundle")}\n$musicBundle")
        binding.receiveData=explicitIntentsReceiveData
    }
}