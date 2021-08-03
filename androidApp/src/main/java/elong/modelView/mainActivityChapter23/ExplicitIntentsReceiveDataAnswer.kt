package elong.modelView.mainActivityChapter23

import android.content.Intent
import android.view.View
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import elong.androidApp.BR
import elong.androidApp.MainActivityChapter2Chapter3

class ExplicitIntentsReceiveDataAnswer:BaseObservable { /*binding cho Chapter2SendDatanAnswerActivity. truyền data đi đến Chapter2SendDatanAnswerActivity và lắng nghe kq trả về*/
    private var resultSendDataAndAnswer:String?=null
    @get:Bindable
    public var ResultSendDataAndAnswer:String?
        get() {return resultSendDataAndAnswer}
        set(value) {resultSendDataAndAnswer=value;notifyPropertyChanged(BR.resultSendDataAndAnswer)}

    constructor(resultSendDataAndAnswer: String?) : super() {
        this.resultSendDataAndAnswer = resultSendDataAndAnswer
    }
    public fun tinhUSCLNandSendData(view:View){
        var intent:Intent= Intent(view.context,MainActivityChapter2Chapter3::class.java)
        intent!!.putExtra("ketquaUSCLN",resultSendDataAndAnswer)
        view.context.startActivity(intent)
    }
}