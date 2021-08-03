package elong.androidApp.services.chapter6_9

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.ContentResolver
import android.content.Context
import android.content.Intent
import android.content.res.Resources
import android.graphics.BitmapFactory
import android.graphics.Color
import android.media.AudioAttributes
import android.net.Uri
import android.os.Build
import androidx.core.app.NotificationCompat
import elong.androidApp.R
import java.util.*

class NotificationController {
    object ProcessNotificaion{
        fun createNotification(activity:Context,
                               resultIntent: Intent,
                               contentTitle:String,
                               contentText:String,
                               packageName:String,
                               sound:Int,
                               notificationName:String,
                               mNotifyMgr:NotificationManager) {

            resultIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);                                                      /*B1: Cấu hình intent và tạo Pending Intent*/
            var resultPendingIntent = PendingIntent.getActivity(activity, 0, resultIntent, PendingIntent.FLAG_UPDATE_CURRENT)   /*mở 1 màn hình update lên*/
            var newSound = Uri.parse(ContentResolver.SCHEME_ANDROID_RESOURCE +"://"+ packageName+ "/" + sound) /*B2: Gán âm thanh thông báo (thư mục raw trong res)*/
//            val newSound=RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION)      /*có thể tạo âmthanh thông báo bằng cách này(âmthanh của hệthống)*/
            if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.O) {                                                         /*B3: Tạo 1 notification channel và set các thông số*/
                var notificationChannel: NotificationChannel = NotificationChannel(getNotificationID().toString(), notificationName, NotificationManager.IMPORTANCE_DEFAULT)
                notificationChannel.enableLights(true)
                notificationChannel.setShowBadge(true)          /*set chấm tròn cho icon khi có notification!*/
                notificationChannel.lightColor = Color.RED
                notificationChannel.description = notificationName
                notificationChannel.enableVibration(true)
                notificationChannel.vibrationPattern = longArrayOf(400, 400)
                notificationChannel.setSound(newSound, AudioAttributes.Builder()                                        /*B4: và kích hoạt âm thanh lên*/
                    .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION).setUsage(AudioAttributes.USAGE_NOTIFICATION).build())    //set sound ở đây
                notificationChannel.lockscreenVisibility=NotificationCompat.VISIBILITY_PUBLIC
                /*if (mNotifyMgr!!.areNotificationsEnabled() && notificationChannel.importance!=NotificationManager.IMPORTANCE_NONE)
                    try {
                        var r:Ringtone=RingtoneManager.getRingtone(activity,newSound);
                        r.play()
                    }catch (ex:Exception){
                        Log.e("LOI_SO_PHAN",ex.toString());
                    }*/
                mNotifyMgr.createNotificationChannel(notificationChannel)
            }
            var mBuilder = NotificationCompat.Builder(activity, notificationName)   /*B5: Khởitạo Builder(mBuilder), contentTitle & contentText:tiêuđề & nộidung*/
                .setSmallIcon(R.drawable.notification_icon)                         /*B6: Gán các t/fần cho Builder*/
                .setLargeIcon(BitmapFactory.decodeResource(Resources.getSystem(),android.R.mipmap.sym_def_app_icon))
                .setContentTitle(contentTitle).setContentText(contentText).setTicker("Title")
                .setContentIntent(resultPendingIntent).setSound(newSound)
                .setPriority(NotificationCompat.PRIORITY_DEFAULT).setChannelId(getNotificationID().toString())
            mNotifyMgr.notify(getNotificationID(), mBuilder.build())           /*B8: kích hoạt Notification*/
        }
        private fun getNotificationID():Int{    /*trả về các zá trị k bao zờ zống nhau ở 1 thời điểm để thay thế cho NotificationID*/
            return Date().time.toInt()          /*tránh trường hợp gọi nhiều notification nhưng chỉ có 1 notification đc hiển thị vì NotificationID trùng nhau*/
        }
    }
}