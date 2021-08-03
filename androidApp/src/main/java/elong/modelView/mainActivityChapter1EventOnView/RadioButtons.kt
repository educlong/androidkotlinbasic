package elong.modelView.mainActivityChapter1EventOnView

import android.view.View
import android.widget.Toast
import androidx.databinding.BaseObservable
import androidx.databinding.ObservableField
import elong.androidApp.R

class RadioButtons:BaseObservable {
    public var radGreat: ObservableField<Boolean>? = ObservableField()
    public var radGood: ObservableField<Boolean>? = ObservableField()
    public var radBad: ObservableField<Boolean>? = ObservableField()
    public var imgPic : ObservableField<Int>? = ObservableField()
    constructor():super(){
        imgPic!!.set(R.drawable.elong)
    }
    public fun vote(view:View){
        var vote:String=""
        if(radGreat!!.get()==true) vote ="Great!"
        else if (radGood!!.get()==true) vote="Good!"
        else if(radBad!!.get()==true) vote="Bad!"
        Toast.makeText(view.context,"Đã chọn $vote", Toast.LENGTH_SHORT).show()
    }
    public fun checkedLong(){
        imgPic!!.set(R.drawable.elong)
    }
    public fun checkedNhan(){
        imgPic!!.set(R.drawable.enhann)
    }
}