package elong.modelView.mainActivityDataBindingDemo

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import elong.androidApp.BR

class User : BaseObservable{    /*BaseObservable zúp lắng nghe thuộc tính đó thay đổi, thuộc tính đổi làm zao diện đổi, zao diện đổi làm thuộc tính đổi*/
    private var firstName:String?=null
    private var lastName:String?=null
    private var phone:String?=null

    constructor(firstName: String?, lastName: String?) {
        this.firstName = firstName
        this.lastName = lastName
    }

    constructor()
    constructor(firstName: String?, lastName: String?, phone: String?) : super() {
        this.firstName = firstName
        this.lastName = lastName
        this.phone = phone
    }

    @get:Bindable /*trong java thì cần phải thêm @Bindable cho hết tất cả các phương thức get/set*/
    public var FirstName:String?
        get() {return firstName}
        set(value) {firstName=value; notifyPropertyChanged(BR.firstName)}

    @get:Bindable
    public var LastName:String?
        get() {return lastName}
        set(value) {lastName=value;notifyPropertyChanged(BR.lastName)}

    @get:Bindable
    public var Phone:String?
        get() {return phone}
        set(value) {phone=value; notifyPropertyChanged(BR.phone)}
}