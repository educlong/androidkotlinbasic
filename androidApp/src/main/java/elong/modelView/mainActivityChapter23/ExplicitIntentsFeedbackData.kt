package elong.modelView.mainActivityChapter23

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import elong.androidApp.BR

class ExplicitIntentsFeedbackData:BaseObservable {  /*binding cho MainActivityChapter2Chapter3. data trả về từ Chapter2SendDatanAnswerActivity*/
    private var resultSendData:String?=null
    @get:Bindable
    public var ResultSendData:String?
        get() {return resultSendData}
        set(value) {resultSendData=value; notifyPropertyChanged(BR.resultSendData)}

    constructor(resultSendData: String?) : super() {
        this.resultSendData = resultSendData
    }
}