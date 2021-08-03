package elong.androidApp.services.chapter2ImplicitIntent

import android.app.Activity
import android.app.PendingIntent
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.telephony.SmsManager
import androidx.core.app.ActivityCompat

class ImplicitIntent {
    object DiallingCallingControl {
        fun diallingCalling(phone:String, action:String, permission:String, activity: Activity, permissionRequestServicePhone:Int) : Intent {
            var uri = Uri.parse("tel:" + phone) /*cú pháp y xì, kể cả "tel"*/
            var intent = Intent(action)                 /*INTENT ko tường minh*/
            intent.data = uri
            if (ActivityCompat.checkSelfPermission(activity,permission) != PackageManager.PERMISSION_GRANTED) {
                if (!ActivityCompat.shouldShowRequestPermissionRationale(activity, permission)) /*check if the user has denied the permission*/
                /*a pop up will appear asking for required permission, i.e: allow or deny (mở cửa sổ lên yêu cầu cấp quyền, allow or deny)*/
                    ActivityCompat.requestPermissions(activity, arrayOf(permission),permissionRequestServicePhone)
            }
            return intent
        }
    }
    object S_M_S_Control{
        fun sMS(phone:String, messsage:String, action:String, permission:String, activity: Activity, permissionRequestCallPhone:Int) {
            if (ActivityCompat.checkSelfPermission(activity,permission)!=PackageManager.PERMISSION_GRANTED)/*check if permission isnt cấp phát*/
                if (!ActivityCompat.shouldShowRequestPermissionRationale(activity,permission))   /*check if the user has denied the permission*/
                /*a pop up will appear asking for required permission, i.e: allow or deny (mở cửa sổ lên yêu cầu cấp quyền, allow or deny)*/
                    ActivityCompat.requestPermissions(activity, arrayOf(permission),permissionRequestCallPhone)
            val sms = SmsManager.getDefault()                                           //tạo 1 sms
            var msgSent = Intent(action)                                    //có thể viết bằng 2 cách này
            var pendingMsgSent=PendingIntent.getBroadcast(activity,0,msgSent,0)//khai báo pendingintent để kiểm tra kết quả: đây là 1 intent delay
            sms.sendTextMessage(phone, null, messsage + "", pendingMsgSent, null)
        }
    }
}

//override fun    /*Implicit Intent - events (send message and call)*/            onRequestPermissionsResult(requestCode:Int,permissions:Array<out String>,grantResults:IntArray){
//    if (requestCode==MY_PERMISSION_REQUEST_SEND_SMS)                                        /*the result will be passed via this method.  -> KO CẦN THIẾT METHOD NÀY*/
//        if (grantResults.isNotEmpty() && grantResults[0]==PackageManager.PERMISSION_GRANTED)/*Check whether the length of grantResults>0 and = PERMISSION_GRANDTED*/
//            Toast.makeText(this@MainActivity,"Thanks for permitting!", Toast.LENGTH_SHORT).show()
//        else Toast.makeText(this@MainActivity,"Why didn't you permit me idiot!", Toast.LENGTH_SHORT).show()
//    if (requestCode==MY_PERMISSION_REQUEST_CALL_PHONE)                                       /*the result will be passed via this method.*/
//        if (grantResults.isNotEmpty() && grantResults[0]==PackageManager.PERMISSION_GRANTED)/*Check whether the length of grantResults>0 and = PERMISSION_GRANDTED*/
//            Toast.makeText(this@MainActivity,"Thanks for permitting!", Toast.LENGTH_SHORT).show()
//        else Toast.makeText(this@MainActivity,"Why didn't you permit me idiot!", Toast.LENGTH_SHORT).show()
//}