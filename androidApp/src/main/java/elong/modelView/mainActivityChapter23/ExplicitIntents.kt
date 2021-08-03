package elong.modelView.mainActivityChapter23

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import elong.androidApp.BR
import elong.androidApp.chapter2Activity.Chapter2SendDataActivity
import elong.androidApp.chapter2Activity.Chapter2SendDatanAnswerActivity
import elong.models.chapter1.Employees
import elong.models.chapter1_3.Music

class ExplicitIntents:BaseObservable {  /*binding cho MainActivityChapter2Chapter3*/
    private var aSendData:String?=null
    private var bSendData:String?=null
    @get:Bindable
    public var ASendData:String?
        get() {return aSendData}
        set(value) {aSendData=value; notifyPropertyChanged(BR.aSendData)}
    @get:Bindable
    public var BSendData:String?
        get() {return bSendData}
        set(value) {bSendData=value; notifyPropertyChanged(BR.bSendData)}
    constructor():super(){}
    public fun sendDataZuaCacActivity(view:View){       /*truyền data đi và ko quan tâm kết quả trả về*/
        var intent = Intent(view.context, Chapter2SendDataActivity::class.java) /*TH1: Gửi data thông thường*/
        intent.putExtra("kieu_boolean", true)           /*Gửi các kiểu data________*/
        intent.putExtra("kieu_char", 'x')               //gửi 8 loại kiểu data qua màn hình activity_activity_send_data35.xml*/
        intent.putExtra("kieu_int", 100)                //putExtra(): đóng gói data vào putExtra rồi mới gửi(tương tự nén winrar)*/
        intent.putExtra("kieu_double", 100.100)
        intent.putExtra("kieu_string", "elongsoftware") //lưu ý: kiểu string ko thuộc 8 kiểu data cơ bản*/
        var nguyenDucLong = Employees("Nguyễn Đức Long", "Thứ 5", 30) /*Gửi data kiểu đối tượng_*/
        intent.putExtra("Nhan_vien", nguyenDucLong)

        var bundle = Bundle()                                                                   /*TH2: Gửi data thông qua Bundle*/
        bundle.putInt("kieu_int_bundle", 1000) //gửi toàn bộ data vào bundle rồi gửi qua (intent chỉ quản lý bundle thôi)
        bundle.putDouble("kieu_double_bundle", 1000.1000)
        var music = Music("TPMBDN", "Thành phố mưa bay", "Đan Nguyên", true)
        bundle.putSerializable("Music_In_Karaoke", music)
        intent.putExtra("truyen_bang_bundle", bundle)
        view.context.startActivity(intent)
    }
    public fun sendDataAndAnswerUSCLN(view: View){      /*truyền data đi và có quan tâm kết quả trả về (truyền đến Chapter2SendDatanAnswerActivity)*/
        if (aSendData==null || bSendData==null) return
        var intent = Intent(view.context, Chapter2SendDatanAnswerActivity::class.java)
        var bundle = Bundle()
        intent.putExtra("truyen_ab_USCLN", bundle)
        bundle.putInt("a", aSendData.toString().toInt())
        bundle.putInt("b", bSendData.toString().toInt())
        intent.putExtra("truyen_ab_USCLN", bundle)
        view.context.startActivity(intent)
    }
}