package elong.modelView.mainActivityChapter1EventOnView

import android.annotation.SuppressLint
import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.view.View
import android.widget.ImageButton
import android.widget.TextView
import androidx.databinding.BaseObservable
import androidx.databinding.ObservableField
import java.text.SimpleDateFormat
import java.util.*

class DateTimePickers:BaseObservable {
    public var dateTime:ObservableField<String>? = ObservableField()
    private var calendar: Calendar?=null
    @SuppressLint("SimpleDateFormat")
    var sdfDate: SimpleDateFormat = SimpleDateFormat("dd/MM/yyyy");
    @SuppressLint("SimpleDateFormat")
    var sdfTime: SimpleDateFormat = SimpleDateFormat("HH:mm:ss")
    constructor():super(){
        calendar=Calendar.getInstance()
        dateTime!!.set(sdfDate.format(calendar!!.time)+" "+sdfTime.format(calendar!!.time))
    }
    public fun date(view:View){
        var callBack = DatePickerDialog.OnDateSetListener { view, year, month, dayOfMonth ->
            calendar!!.set(Calendar.YEAR,year)
            calendar!!.set(Calendar.MONTH,month)
            calendar!!.set(Calendar.DATE,dayOfMonth)
            dateTime!!.set(sdfDate.format(calendar!!.time)+" "+sdfTime.format(calendar!!.time))
        }  /*lắng nghe sự thay đổi mà người dùng thay đổi ngày tháng năm trên zao diện*/
        var datePickerDialog = DatePickerDialog(view.context,callBack,calendar!!.get(Calendar.YEAR), calendar!!.get(Calendar.MONTH), calendar!!.get(Calendar.DATE))
        datePickerDialog.show()
    }
    public fun time(view:View){
        val callBack = TimePickerDialog.OnTimeSetListener { timePicker, hour, minute ->
            calendar!![Calendar.HOUR] = hour
            calendar!![Calendar.MINUTE] = minute
            dateTime!!.set(sdfDate.format(calendar!!.time)+" "+sdfTime.format(calendar!!.time))
        }  /*lắng nghe sự thay đổi mà người dùng thay đổi zờ phút trên zao diện*/
        val timePickerDialog = TimePickerDialog(view.context, callBack, calendar!![Calendar.HOUR], calendar!![Calendar.MINUTE], true)
        timePickerDialog.show()
    }
}