package elong.modelView.mainActivityChapter23

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.databinding.ObservableField
import elong.androidApp.BR

class SharedPreferencesLogin:BaseObservable {
    private var username:String?=null
    private var password:String?=null
    private var checkedSaveInfoLogin:Boolean?=null
    @get:Bindable
    public var Username:String?
        get() {return username}
        set(value) {username=value;notifyPropertyChanged(BR.username)}
    @get:Bindable
    public var Password:String?
        get() {return password}
        set(value) {password=value;notifyPropertyChanged(BR.password)}
    @get:Bindable
    public var CheckedSaveInfoLogin:Boolean?
        get() {return checkedSaveInfoLogin}
        set(value) {checkedSaveInfoLogin=value;notifyPropertyChanged(BR.checkedSaveInfoLogin)}
    constructor():super(){}
}