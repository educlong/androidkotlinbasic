package elong.modelView.mainActivityChapter1EventOnView

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.databinding.ObservableArrayList
import androidx.databinding.library.baseAdapters.BR
import elong.androidApp.R

class GvImages:BaseObservable {
    private var imgs:ObservableArrayList<GvImage>?= ObservableArrayList()
    @get:Bindable
    public var Imgs:ObservableArrayList<GvImage>?
        get()  {return imgs}
        set(value) {imgs=value;notifyPropertyChanged(BR.imgs)}
    constructor():super(){
        add(GvImage(R.drawable.activity))
        add(GvImage(R.drawable.callntd))
        add(GvImage(R.drawable.dangxuat))
        add(GvImage(R.drawable.date))
        add(GvImage(R.drawable.elong))
        add(GvImage(R.drawable.enhann))
    }
    constructor(imgs: ObservableArrayList<GvImage>?) : super() {
        this.imgs = imgs
    }
    private fun add(img:GvImage){
        imgs!!.add(img)
    }
}