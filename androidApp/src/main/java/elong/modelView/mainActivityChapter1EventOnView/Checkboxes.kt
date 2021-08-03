package elong.modelView.mainActivityChapter1EventOnView

import android.view.View
import android.widget.CompoundButton
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.databinding.ObservableField
import androidx.databinding.library.baseAdapters.BR
import kotlin.system.exitProcess

class Checkboxes:BaseObservable {
    public  var java:ObservableField<Boolean>?= ObservableField()
    public  var c:ObservableField<Boolean>?=ObservableField()
    public  var cadd:ObservableField<Boolean>?=ObservableField()
    public  var csharp:ObservableField<Boolean>?=ObservableField()
    public var resultCheckbox:ObservableField<String>?=ObservableField()
    constructor():super(){}
    public fun getResults(){
        var result:String=""
        if (java!!.get()==true) result+="Java. "
        if (c!!.get()==true) result+="C. "
        if (cadd!!.get()==true) result+="C++. "
        if (csharp!!.get()==true) result+="C#. "
        if(resultCheckbox==null)
            resultCheckbox!!.set("")
        resultCheckbox!!.set(result)
    }
    public fun imgBtnQuit(view: View){
        exitProcess(0)
    }
}