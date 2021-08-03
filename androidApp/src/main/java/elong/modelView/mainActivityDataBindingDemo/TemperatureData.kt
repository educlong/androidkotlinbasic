package elong.modelView.mainActivityDataBindingDemo

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import elong.androidApp.BR

class TemperatureData: BaseObservable {
    private var celsius:String?=null
    private var fahrenheit:String?=null

    constructor(celsius: String?, fahrenheit: String?) : super() {
        this.celsius = celsius
        this.fahrenheit = fahrenheit
    }
    constructor(celsius: String?) : super() {
        this.celsius = celsius
    }

    constructor() : super()
    @get:Bindable
    public var Celsius:String?
        get() {return celsius}
        set(value) {celsius=value; notifyPropertyChanged(BR.celsius)}   /*những phương thức nào cần lắng nghe sự thay đổi (binding 2 chiều) thì cho notify...*/
    @get:Bindable
    public var Fahrenheit:String?
        get() {return fahrenheit}
        set(value) {fahrenheit=value; notifyPropertyChanged(BR.fahrenheit)}
}