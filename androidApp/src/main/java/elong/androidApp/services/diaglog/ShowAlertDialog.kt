package elong.androidApp.services.diaglog

import android.app.Activity
import android.app.AlertDialog

class ShowAlertDialog {
    object BuildAlert{
        fun showing(activity: Activity, message:String):AlertDialog.Builder{
            var builder:AlertDialog.Builder=AlertDialog.Builder(activity)
            builder.setTitle("Thông báo")
            builder.setMessage(message)
            return builder
        }
    }
}