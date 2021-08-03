package elong.modelView.mainActivityDataBindingDemo

import android.view.View
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import elong.androidApp.BR

class ListHeader : BaseObservable {
    private var title:String?=null

    constructor(title: String?) {
        this.title = title
    }

    constructor()

    @get:Bindable
    public var Title:String?
    get() {return title}
    set(value) {title=value;notifyPropertyChanged(BR.title)}

    public fun add(view:View){

    }
}