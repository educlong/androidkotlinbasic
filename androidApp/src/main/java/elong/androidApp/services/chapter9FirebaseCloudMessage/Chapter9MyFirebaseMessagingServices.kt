package elong.androidApp.services.chapter9FirebaseCloudMessage

import android.app.NotificationManager
import android.content.Intent
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage
import elong.androidApp.MainActivity
import elong.androidApp.R
import elong.androidApp.services.chapter6_9.NotificationController

    /* Service này chính là BƯỚC 5 trong lưu đồ zải thích nguyên lý hoạt động của firebase   (PHÍA CLIENT - MOBILE CLIENT APP)
    * (Firebase sẽ push message (thông điệp từ bước 4)).
    *           class Chapter9MyFirebaseMessagingServices ở dưới dùng để lắng nghe message gửi về và tạo 1 notification cho phía client biết
    *   _________________________                                                                     _____________________________
    *   |                       |   Bước 4: Admin gửi Token + thông điệp (Message) lên firebase       |                           |
    *   |   Remote Database     | ------------------------------------------------------------------->|   Firebase Cloud Message  |
    *   |_______________________|                                                                     |   (1 database của google) |
    *       Bước 3: |                                                                 Bước 1:  |----->|___________________________|
    *       Ta phải |                                                               Các Device |     Bước 2:   |      Bước 5: |
    *       lưu lại |                                                               đã cài đặt |     Firebase  |      Firebase|
    *       toàn bộ |                                                               apps của   |     trả về    |      sẽ Push |
    *       Token   |                                                               mình sẽ    |     Token     |      Message |
    *       mà      |                                                               gửi yêu cầu|     (chính là |      (thông  |
    *       firebase|                                                               lên server |     ID device |       điệp   |
    *       gửi về  |                                                               firebase   |     của mỗi   |       từ     |
    *       cho từng|                                                               của google |     thiết bị  |       bước 4)|
    *       device  |                                                               để lấy     |     mà đã cài |              |
    *               |                                                               Token      |     đặt app   |              |
    *               |                   __________________________________________________     |     của mình) |              |
    *               |                   |                                                |-----|               |              |
    *               |-----------------> |   Devices mà customer đã cài đặt app của mình  |                     |              |
    *                                   |   (smartphone, tablet, etc,...)                |<--------------------|              |
    *                                   |                                                |                                    |
    *                                   |________________________________________________|<-----------------------------------|
    **/
class Chapter9MyFirebaseMessagingServices : FirebaseMessagingService() {
    override fun onMessageReceived(p0: RemoteMessage) {
        super.onMessageReceived(p0)
        if (p0.notification!=null)  displayThongbao(p0.notification!!.body)     /*nếu gửi từ server của gg xuống*/
        else displayThongbao(p0.data["body"],p0.data["title"]) /*body và title này là do bên server we định nghĩa (xem trong BtnSendThongBaoFCM_Click)*/
    }

    private fun displayThongbao(body: String?) {
        displayThongbao(body,"Google")
    }
    private fun displayThongbao(body: String?, title: String?) {
        var intent:Intent=Intent(this,MainActivity::class.java)
        var manager:NotificationManager=applicationContext.getSystemService(NOTIFICATION_SERVICE) as NotificationManager
        NotificationController.ProcessNotificaion.createNotification(this,intent, title!!,body!!,applicationContext.packageName,
            R.raw.tieng_thu_rung,"14101991","Firebase Cloud Message",manager)
    }
}