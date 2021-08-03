package elong.androidApp.services.chapter3

import android.Manifest
import android.app.Activity
import android.content.pm.PackageManager
import android.database.Cursor
import android.net.Uri
import android.provider.ContactsContract
import androidx.core.app.ActivityCompat

class ContentProviderServices {
    object readFromDevice{
        var smsInbox:String="content://sms/inbox"
        var smsAddressColumn:String="address"
        var smsDateColumn:String="date"
        var smsBodyColumn:String="body"
        fun readSMS(activity:Activity):Uri{
            if (!ActivityCompat.shouldShowRequestPermissionRationale(activity, Manifest.permission.READ_SMS))
                ActivityCompat.requestPermissions(activity, arrayOf(Manifest.permission.READ_SMS), PackageManager.PERMISSION_GRANTED)
            return Uri.parse(smsInbox)
        }
        fun readContact(activity:Activity):Uri{
            if (!ActivityCompat.shouldShowRequestPermissionRationale(activity, Manifest.permission.READ_CONTACTS))
                ActivityCompat.requestPermissions(activity, arrayOf(Manifest.permission.READ_CONTACTS), PackageManager.PERMISSION_GRANTED)
            return ContactsContract.CommonDataKinds.Phone.CONTENT_URI   /*truy xuất thông tin phần cứng. cụ thể là truy xuất lấy thông tin danh bạ người dùng*/
        }
    }
}