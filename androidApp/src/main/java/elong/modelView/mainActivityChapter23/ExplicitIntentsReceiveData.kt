package elong.modelView.mainActivityChapter23

import android.content.Intent
import android.view.View
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import elong.androidApp.BR
import elong.androidApp.MainActivity

class ExplicitIntentsReceiveData:BaseObservable {   /*binding cho Chapter2SendDataActivity. truyền data đi đến Chapter2SendDataActivity mà k cần lắng nghe kq trả về*/
    private var resultSendDataIntent:String?=null
    @get:Bindable
    public var ResultSendDataIntent:String?
        get() {return resultSendDataIntent}
        set(value) {resultSendDataIntent=value;notifyPropertyChanged(BR.resultSendDataIntent)}
    constructor(resultSendDataIntent: String?) : super() {
        this.resultSendDataIntent = resultSendDataIntent
    }
    public fun backToChapter2Activity(view: View) {
        var intent: Intent = Intent(view.context, MainActivity::class.java)
        view.context.startActivity(intent)
    }
}