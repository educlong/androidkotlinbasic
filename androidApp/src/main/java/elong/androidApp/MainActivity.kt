package elong.androidApp

import android.animation.*
import android.app.*
import android.content.*
import android.content.res.*
import android.graphics.*
import android.graphics.drawable.*
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.*
import android.view.animation.*
import android.widget.*
import com.google.firebase.iid.FirebaseInstanceId
import com.google.firebase.messaging.FirebaseMessaging
import elong.androidApp.chapter2Activity.*
import elong.androidApp.services.chapter9FirebaseCloudMessage.MyFirebaseControllers
import java.io.*
import java.util.*
//import kotlinx.android.synthetic.main.screen_main_view1
class MainActivity : AppCompatActivity() {
    object LoadGeneral {var txtWebServiceIPaddress: EditText?=null}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addControlChapter1TabHost()
        LoadGeneral.txtWebServiceIPaddress=findViewById(R.id.txtWebServiceIPaddress)
        firebaseCloudMessage()  /**CHƯƠNG 9: FIREBASE CLOUD MESSAGE*/
    }

    /**TabHost **/
    private fun addControlChapter1TabHost(){
        var tabHost:TabHost=findViewById(R.id.tabHost)
        tabHost.setup() //gọi setup để cấu hình và tạo tabHost
        var tabChapter1View = tabHost.newTabSpec("tabChapter1View") //tạo từng tab (tabChapter1View là tên tab)
        var tabChapter23 = tabHost.newTabSpec("tabChapter23") //(tabChapter23 là tên tab)
        var tabChapter4567 = tabHost.newTabSpec("tabChapter4567") //(tabChapter4567 là tên tab)
        var tabGoogleMap = tabHost.newTabSpec("tabChapter8GoogleMap")
        var tabControls = tabHost.newTabSpec("tabContr")
        tabChapter1View.setContent(R.id.tabChapter1View) //setContent cho từng tab
        tabChapter23.setContent(R.id.tabChapter23)
        tabChapter4567.setContent(R.id.tabChapter4567)
        tabControls.setContent(R.id.tabControls)
        tabGoogleMap.setContent(R.id.tabGoogleMap)
        //tabView.setIndicator("View");                       //hiển thị chuỗi (View là tên hiển thị trên tab)
        //tabViewAndActivity.setIndicator("View n Acti");     //        (View n Acti là tên hiển thị trên tab)
        //tabActivity.setIndicator("Activity");               //           (Activity là tên hiển thị trên tab)
        tabChapter1View.setIndicator("", resources.getDrawable(R.drawable.viewnactivity)) //hiển thị hình
        tabChapter23.setIndicator("C23")
        tabChapter4567.setIndicator("C4567")
        tabGoogleMap.setIndicator("Map")
        tabControls.setIndicator("Control")
        tabHost.addTab(tabChapter1View) //addTab
        tabHost.addTab(tabChapter23)
        tabHost.addTab(tabChapter4567)
        tabHost.addTab(tabGoogleMap) //TAB HOST    (file layout)
        tabHost.addTab(tabControls)
    }
    fun goingToChapter1ViewAndEventOnView(view: View) {
        val intent = Intent(this@MainActivity, MainActivityChapter1EventOnView::class.java)
        startActivity(intent)
    }
    fun goingToChapter2ActivityIntentChapter3AssetsSharedPreferencesSQLiteContentProvider(view: View) {
        val intent = Intent(this@MainActivity, MainActivityChapter2Chapter3::class.java)
        startActivity(intent)
    }
    fun goingToChapter4MenuAnimationChapter5AsyncTaskChapter6BroadcastReceiverChapter7Webservices(view: View) {
        val intent = Intent(this@MainActivity, MainActivityChapter4567::class.java)
        startActivity(intent)
    }
    fun goingToChapter8GoogleMap(view: View) {
        val intent = Intent(this@MainActivity, MapsActivityChapter8::class.java)
        startActivity(intent)
    }
    fun goingToWebServiceBonus(view: View){
        val intent = Intent(this@MainActivity, MainActivityWebserviceAndBonus::class.java)
        startActivity(intent)
    }
    /**CHƯƠNG BỔ SUNG: PHẦN DATABINDING*/
    fun goingToDataBinding(view: View) {
        val intent=Intent(this@MainActivity, MainActivityDataBindingDemo::class.java)
        startActivity(intent)
    }

    /**CHƯƠNG 9: FIREBASE CLOUD MESSAGE (xử lý trong folder services/chapter9FirebaseCloudMessage), hiệu chỉnh trong manifest và có video hướng dẫn trên tk cá nhân Youtube*/
    private fun firebaseCloudMessage() {
        FirebaseMessaging.getInstance().subscribeToTopic("test_FCM")
        var token: String? = FirebaseInstanceId.getInstance().getToken()
        MyFirebaseControllers.MyFirebaseIDTask().execute(token)
    }


    /*  GIẢI THÍCH FIREBASE CLOUD MESAGE

    *   TRƯỜNG HỢP 1: XÂY DỰNG 1 WEBSERVICE ĐỂ SAVE TOKEN CỦA CÁC DEVICE, WEBSERVICE NÀY LÀ REMOTE DATABASE
    *
    *   Webservice: PHP, ASP.NET. Xây dựng Remote Webserver (PHP hoặc ASP.NET-C#, IIS WEBSERVER)
    *   - Bước 1: Mở SQL SERVER và tạo 1 bảng để lưu trữ token của các devices đc gửi về từ firebase (Lưu trong D:\CodDevProgTeaching\database)
    *   - Bước 2: Mở Visual Studio lên, RESTFul
    *   - IIS Webserver
    *   Có webform/winform để Push message đến client
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
    *               |                                                               Token      |     đặt app   |      (Tạo 1  |
    *               |                   __________________________________________________     |     của mình) |   Noification|
    *               |                   |                                                |-----|               |      để thông|
    *               |-----------------> |   Devices mà customer đã cài đặt app của mình  |                     |      báo cho |
    *                                   |   (smartphone, tablet, etc,...)                |<--------------------|      phía    |
    *                                   |                                                |                        client biết)|
    *                                   |________________________________________________|<-----------------------------------|
    *
    *
    *
    *
    * TRƯỜNG HỢP 2: FIREBASE CÓ SẴN GOOGLE ĐÃ CÓ SẴN APP SERVER VÀ NOTIFICATION RỒI, KO CẦN XÂY DỰNG WEBSERVICE NỮA
    *
    *   _______________________________                                     _______________________________
    *   |                             |                                     |     |     HTTP    |         |
    *   |   Notification Console GUI  |---------|             |------------>|     |_____________|         |
    *   |_____________________________|         |             | Bước 3, 4   |     |     XMPP    |         |
    *                                           |             | theo như    |     |_____________|         |
    *                                Bước 5 theo|             | lưu đồ trên |                             |
    *                                như lưu đồ |             |             |       APP SERVER            |
    *                                trên       |             |             |_____________________________|
    *                               ____________|             |__________
    *                               |                                   |
    *                               |   _____________________________   |
    *                               |-->|                           |<--|
    *                                   |   Firebase Cloud Message  |
    *                           |-------|   (1 database của google) |
    *                Bước 1,2,5 |       |___________________________|
    *                theo như   |
    *                lưu đồ trên|
    *                           |       __________________________________________________
    *                           |       |                                                |
    *                           |------>|   Devices mà customer đã cài đặt app của mình  |
    *                                   |   (smartphone, tablet, etc,...)                |
    *                                   |                                                |
    *                                   |________________________________________________|
    *
    *
    * Bước 1: Các Device đã cài đặt apps của mình sẽ gửi yêu cầu lên server firebase của google để lấy token
    *       ---> Bước này cần tạo 1 server firebase theo như video trên youtube cá nhân
    * Bước 2: Firebase trả về token chính là ID device của mỗi thiết bị mã đã cài đặt app của mình
    *       ---> Khai báo service INSTANCE_ID_EVENT trong manifest để lắng nghe token id trả về
    * Bước 3: Lưu lại toàn bộ token mà firebase gửi về cho từng device
    *       ---> Xây dựng 1 webservice để nhận và lưu id token, xử lý trong Controller của webform, FirebaseCMController : ApiController
    * Bước 4: Admin gửi Token + thông điệp (Message) lên firebase
    *       ---> Xử lý trong Views của webform, AdminFCM : System.Web.UI.Page, click vào button BtnSendThongBaoFCM_Click để gửi token và message lên firebase
    * Bước 5: Firebase sẽ push message (thông điệp từ bước 4 về thiết bị).
    *       ---> Khai báo service MESSAGING_EVENT trong manifest để lắng nghe message và token id trả về. Tạo 1 notification để thông báo cho phía client
    * */
}
