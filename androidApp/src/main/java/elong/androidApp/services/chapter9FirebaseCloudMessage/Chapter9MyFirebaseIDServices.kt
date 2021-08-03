package elong.androidApp.services.chapter9FirebaseCloudMessage

import com.google.firebase.iid.FirebaseInstanceId
import com.google.firebase.iid.FirebaseInstanceIdService

    /* Service này chính là BƯỚC 2 trong lưu đồ zải thích nguyên lý hoạt động của firebase
    * BƯỚC 1: Các devices đã cài đặt app của mình sẽ gửi yêu cầu lên server firebase cảu google để lấy Token ==> Đã tạo 1 server firebase theo như video trên youtube cá nhân
    * BƯỚC 2: Firebase trả về token (chính là ID device của mỗi thiết bị mà đã cài đặt app của mình).
    *           class Chapter9MyFirebaseIDServices ở dưới dùng để lấy token id gửi về và save vào database.
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
class Chapter9MyFirebaseIDServices : FirebaseInstanceIdService() {      /*Phải lấy id trước, lấy message sau*/
    override fun onTokenRefresh() {     /*hàm này chỉ chạy 1 lần, do đó khi chạy xong bị vấn đề zì đó ko lưu đc,    onTokenRefresh là lấy token*/
        super.onTokenRefresh()          /*lần khác chạy nó ko nhảy vào, ta ko cách nào lấy đc, do đó ta phải có 1 cơ chế khác để lưu ở ngoài*/
        var token: String? = FirebaseInstanceId.getInstance().token     /*token này là token từ server firebase gửi về*/
        saveTokenIntoMyDatabase(token)  /*tạo hàm để lưu token vào csdl riêng*/
    }

    private fun saveTokenIntoMyDatabase(token:String?) {       /*tự động lưu vào csdl -> cần phải có 1 đa tiến trình asynctask ở ngoài, tại vì nó k liên tục nhảy vào*/
        MyFirebaseControllers.MyFirebaseIDTask().execute(token)/*token refresh để lấy token khi đã chạy rồi,do đó we phải lưu ở nơi khác nữa->cần có 1 asynctask ở ngoài*/
    }
}