package elong.modelView.mainActivityChapter1EventOnView

import android.view.View
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import elong.androidApp.BR

class Calculate : BaseObservable {
    private var a:Int?=null
    private var b:Int?=null
    private var result:String?=null

    constructor(a: Int?, b: Int?) : super() {
        this.a = a
        this.b = b
        result="No answer"
    }

    constructor() : super()

    @get:Bindable
    public var A:Int?
        get() {return a}
        set(value) {a=value;notifyPropertyChanged(BR.a)}

    @get:Bindable
    public var B:Int?
        get() {return b}
        set(value) {b=value;notifyPropertyChanged(BR.b)}

    @get:Bindable
    public var Result:String?
        get() {return result}
        set(value) {result=value}


    public fun adds():String{
        if (a!=null && b!=null)
            result= "Tổng=${a!! + b!!}"
        return result.toString()
    }
    public fun minuss():String{
        if (a!=null && b!=null)
            result= "Hiệu=${a!!-b!!}"
        return result.toString()
    }
    public fun multi():String{
        if (a!=null && b!=null)
            result= "Tích=${a!! * b!!}"
        return result.toString()
    }
    public fun divide():String{
        if (a!=null && b!=null)
            result = if(b!=0) "Thương=${a!!*1.0/b!!}" else "Không thể chia cho 0"
        return result.toString()
    }

    override fun toString(): String {
        return result.toString()
    }
}