package elong.modelView.mainActivityChapter4567

import android.app.Activity
import android.view.View
import android.widget.LinearLayout
import android.widget.Toast
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import elong.androidApp.BR
import elong.androidApp.MainActivityChapter4567
import elong.androidApp.R
import elong.androidApp.services.chapter5DialogAsyncTask.AsyncTaskControllers

class AsyncTaskDrawButton:BaseObservable {
    private var percent:String?=null
    private var numberButton:Int?=null
    private var progress:Int?=null
    private var layoutButtonAsyncTask:LinearLayout?=null
    @get:Bindable
    public var LayoutButtonAsyncTask:LinearLayout?
        get() {return layoutButtonAsyncTask}
        set(value) {layoutButtonAsyncTask=value;notifyPropertyChanged(BR.layoutButtonAsyncTask)}

    @get:Bindable
    public var Percent:String?
        get() {return percent}
        set(value) {percent=value;notifyPropertyChanged(BR.percent)}

    @get:Bindable
    public var Progress:Int?
        get() {return progress}
        set(value) {progress=value;notifyPropertyChanged(BR.progress)}

    @get:Bindable
    public var NumberButton:Int?
        get() {return numberButton}
        set(value) {numberButton=value;notifyPropertyChanged(BR.numberButton)}

    constructor(view: MainActivityChapter4567):super(){
        this.percent="0%"
        this.numberButton=0
        this.progress=0
        this.layoutButtonAsyncTask = view.findViewById(R.id.layoutButtonAsyncTask)
    }

    public fun drawButton(view:View){
        try {
            var drawNumberOfButtonAsyncTask: Int? = numberButton
            var btnNewAsyncTask: AsyncTaskControllers.ButtonAsyncTask = AsyncTaskControllers.ButtonAsyncTask(view.context as Activity)
            btnNewAsyncTask.execute(drawNumberOfButtonAsyncTask)    /*tạo 1 đối tượng vs lớp ButtonAsyncTask vừa tạo. Sau đó hàm execute ra lệnh kích hoạt tiểu trình này*/
        }
        catch (ex:Exception){
            Toast.makeText(view.context,ex.toString(),Toast.LENGTH_LONG).show()
        }
    }
}