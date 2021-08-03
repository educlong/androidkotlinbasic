package elong.modelView.mainActivityChapter1EventOnView

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.databinding.library.baseAdapters.BR

class GvImage:BaseObservable {
    private var img:Int?=null
    @get:Bindable
    public var Img:Int?
        get() {return img}
        set(value) {img=value;notifyPropertyChanged(BR.img)}
    constructor():super(){}
    constructor(img: Int?) : super() {
        this.img = img
    }
}