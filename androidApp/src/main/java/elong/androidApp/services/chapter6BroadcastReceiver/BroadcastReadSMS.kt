package elong.androidApp.services.chapter6BroadcastReceiver

import android.annotation.SuppressLint
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.telephony.SmsMessage
import android.widget.Toast
import java.text.SimpleDateFormat
import java.util.*

class BroadcastReadSMS: BroadcastReceiver() {   /*đọc tin nhắn ra thông qua 1 Bundle và pdus*/
    val SMS_EXTRA: String= "pdus"               /*android cho ta 1 từ khóa rất quan trọng đó là pdus -> dùng để lấy thông tin trong sms -> lấy SMS mới nhất*/
    val SMS_URI: String="content://sms/inbox";  /*từ khóa đọc ALL nội dung ALL SMS -> nguy hiểm*/
    val BODY:String="body"                      /*thông thường, ta ko quan tâm đọc hết SMS mà chỉ quan tâm SMS gửi tới thôi -> nên sử dụng từ khóa pdus   */
    val ADDRESS:String="address"
    @SuppressLint("SimpleDateFormat")
    override fun onReceive(context: Context?, intent: Intent?) {
        var bundle:Bundle?=intent!!.extras              /*trả về bundle trước*/
        val arrPdus = bundle!![SMS_EXTRA] as Array<*>?  /*pdus trả về 1 mảng đối tượng tin nhắn: []arrPdus -> cú pháp của google -> viết y xì*/
        /*nếu muốn lấy hết thì thay lệnh trên: SMS_EXTRA bằng SMS_URI,  mảng Array<*> trên  chưa phải là 1SMS, vì nó bị mã hóa trên đường truyền và tại đây mình zải mã nó
        * thông thường tại 1 thời điểm chỉ có 1 sms -> vì thế ta hay dùng pdus */   /*Tại 1 thời điểm có thể nhận đc nhìu sms nên phải trả về 1 mảng đối tượng.*/
        if (arrPdus != null)
            for (i in arrPdus.indices){                                 /*Vòng for chạy để lấy sms (những sms mới nhận đc TỨC THÌ) trả về 1đốiTượng mess cụThể. */
                var smsMessage=SmsMessage.createFromPdu(arrPdus[i] as ByteArray?)   /*ByteArray? arrPdus[i]: Để lấy từng fầntử ra ->zải mã ngược lại bằng byte. =>ép về mảng byte*/
                var bodyUser:String? = smsMessage.messageBody           /* ==> tất cả dữ liệu đưa về byte, mà byte đọc ko nổi -> như vậy nó phải thông qua hàm mã nhị phân*/
                var phoneUser: String? =smsMessage.originatingAddress   /*trở thành 1 chuỗi bình thường, mà thông tin chuỗi đó phải đưa về message trước -> tạo ra SmsMessage*/
                var timeUser:Long=smsMessage.timestampMillis            /* Như vậy trong SmsMessage mới có các thông tin như bodyUser, phoneUser, timeUser */
                var date:Date=Date(timeUser)                            /*phải đưa timeUser (time người gửi) về dạng đọc đc*/
                var dateFormat:String=SimpleDateFormat("HH:mm:ss:SSS").format(date)
                Toast.makeText(context,"$phoneUser:$dateFormat\n$bodyUser",Toast.LENGTH_SHORT).show()
            }           /*  Sau khi tạo 1 receiver có thể lắng nghe tin nhắn mới nhất gửi tới -> ta phải vào file manifest để đăng ký cấp các quyền cho nó (xem file manifest)*/
    }
}