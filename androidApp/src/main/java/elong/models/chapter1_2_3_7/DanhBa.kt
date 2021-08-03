package elong.models.chapter1_2_3_7

import android.Manifest
import android.app.Activity
import android.content.Intent
import android.view.View
import android.widget.Toast
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.databinding.ObservableField
import androidx.databinding.library.baseAdapters.BR
import elong.androidApp.MainActivityChapter2Chapter3
import elong.androidApp.chapter2Activity.Chapter2ActivitySMSproject
import elong.androidApp.services.chapter2ImplicitIntent.ImplicitIntent
import java.io.Serializable

class DanhBa : Serializable,BaseObservable {
    private var codeUser:Int?=null
    private var nameUser:String?=null
    private var phoneUser:String?=null
    @get:Bindable
    public var CodeUser: Int?
        get() {return codeUser}
        set(value) {codeUser=value;notifyPropertyChanged(BR.codeUser)}
    @get:Bindable
    public var NameUser: String?
        get() {return nameUser}
        set(value) {nameUser=value;notifyPropertyChanged(BR.nameUser)}
    @get:Bindable
    public var PhoneUser: String?
        get() {return phoneUser}
        set(value) {phoneUser=value;notifyPropertyChanged(BR.phoneUser)}

    constructor(codeUser: Int?, nameUser: String?, phoneUser: String?) {
        this.codeUser = codeUser
        this.nameUser = nameUser
        this.phoneUser = phoneUser
    }

    constructor(nameUser: String?, phoneUser: String?) {
        this.nameUser = nameUser
        this.phoneUser = phoneUser
    }

    constructor()

    override fun toString(): String {
        return "code: $codeUser, name: $nameUser, phone: $phoneUser"
    }
    private val MY_PERMISSION_REQUEST_CALL_PHONE:Int=0;
    public fun addEventsChapter2DoCall(view:View){
        var intent= ImplicitIntent.DiallingCallingControl.diallingCalling(this.phoneUser.toString(), Intent.ACTION_CALL,
                    Manifest.permission.CALL_PHONE, view.context as Activity,MY_PERMISSION_REQUEST_CALL_PHONE)
        view.context.startActivity(intent)
    }
    public fun addEventsChapter2DoSMS(view:View){
        Toast.makeText(view.context,this.phoneUser.toString(),Toast.LENGTH_SHORT).show()
        var intent:Intent= Intent(view.context,Chapter2ActivitySMSproject::class.java)
        intent.putExtra("danh_ba",DanhBa(this.codeUser,this.nameUser,this.phoneUser))
        view.context.startActivity(intent)
    }
    public fun addEventsChapter2DoDetailAndDelete(view: View){
        Toast.makeText(view.context,toString(),Toast.LENGTH_SHORT).show()
    }
}