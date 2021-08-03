package elong.modelView.mainActivityChapter23

import android.Manifest
import android.app.Activity
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.view.View
import android.widget.Toast
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import elong.androidApp.BR
import elong.androidApp.services.chapter2ImplicitIntent.ImplicitIntent

class ImplicitIntents:BaseObservable {
    private var phoneActivity:String?=null
    private var messageActivity:String?=null
    @get:Bindable
    public var PhoneActivity:String?
        get() {return phoneActivity}
        set(value) {phoneActivity=value;notifyPropertyChanged(BR.phoneActivity)}
    @get:Bindable
    public var MessageActivity:String?
        get() {return messageActivity}
        set(value) {messageActivity=value;notifyPropertyChanged(BR.messageActivity)}
    constructor():super(){}
    private val MY_PERMISSION_REQUEST_CALL_PHONE:Int=0
    private val MY_PERMISSION_REQUEST_SEND_SMS:Int=0;
    public fun dialActivity(view:View){
        var intent= ImplicitIntent.DiallingCallingControl.diallingCalling(phoneActivity.toString(),
            Intent.ACTION_DIAL, Manifest.permission.CALL_PHONE, view.context as Activity,MY_PERMISSION_REQUEST_CALL_PHONE)
        view.context.startActivity(intent)
    }
    public fun callActivity(view: View){
        var intent= ImplicitIntent.DiallingCallingControl.diallingCalling(phoneActivity.toString(),
            Intent.ACTION_CALL, Manifest.permission.CALL_PHONE, view.context as Activity,MY_PERMISSION_REQUEST_CALL_PHONE)
        view.context.startActivity(intent)
    }
    public fun messagerActivity(view: View){
        view.context.registerReceiver(object : BroadcastReceiver() { override fun onReceive(context: Context, intent: Intent) {  //cái này chưa hiểu
            var result = resultCode
            var msg = "Đã gửi tin nhắn thành công!"
            if (result != Activity.RESULT_OK) msg = "Gửi tin nhắn thất bại!"
            Toast.makeText(view.context, msg, Toast.LENGTH_LONG).show()
        }
        }, IntentFilter("ACTION_MSG_SENT"))
        ImplicitIntent.S_M_S_Control.sMS(phoneActivity.toString(),messageActivity.toString(),
            Intent.ACTION_SEND, Manifest.permission.SEND_SMS, view.context as Activity,MY_PERMISSION_REQUEST_SEND_SMS)
    }
}