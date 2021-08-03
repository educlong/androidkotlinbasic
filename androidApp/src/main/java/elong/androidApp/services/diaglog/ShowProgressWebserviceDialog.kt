package elong.androidApp.services.diaglog

import android.app.Activity
import android.app.ProgressDialog

class ShowProgressWebserviceDialog {
    object Dialogs{
        fun showing(activity: Activity,whatLoading:String):ProgressDialog{
            var dialog=ProgressDialog(activity)
            dialog!!.setTitle("Thông báo $whatLoading")
            dialog!!.setMessage("Load $whatLoading...! Please waiting!...")
            dialog!!.setCanceledOnTouchOutside(false)                  /*mục đích của hàm ni: nhấn ra ngoài thì ko tắt màn hình ni*/
            return dialog
        }
    }
}