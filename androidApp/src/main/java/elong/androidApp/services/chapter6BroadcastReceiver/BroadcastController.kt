package elong.androidApp.services.chapter6BroadcastReceiver

import android.app.Activity
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.net.ConnectivityManager
import android.widget.Button
import android.widget.Toast

class BroadcastController {
    object Receiver{
        fun wifiReciver(activity:Activity,btnLogin:Button):BroadcastReceiver{/*khai báo 1 BroadcastReceiver.*/    /*wifiReciver thực ra là 1 sự kiện variable as listener*/
            return object:BroadcastReceiver(){  /*Override hàm onReceive tự động lắngnghe(lắngnghe cái zì?trong onResume). Sau khi ra lệnh lắngnghe tại onResume, onPause*/
                override fun onReceive(context:Context?,intent:Intent?) {  /*thì mọi kq khi lắng nghe đc sẽ nhảy vào onReceive. Như vậy,mọi kếtquả ta sẽ lấy trong intent*/
                    var connectivityManager:ConnectivityManager=context!!.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
                    if (connectivityManager.activeNetworkInfo!=null){/*ConnectivityManager trả về dịch vụ internet của thiết bị. khi có dvụ internet rồi thì làm ok*/
                        btnLogin.isEnabled=true                      /*activeNetwork là permission xem có internet hay chưa. Có internet==> hiển thị Button đăng nhập.*/
                        Toast.makeText(activity,"Internet đã có :)",Toast.LENGTH_SHORT).show()
                    }   /*CONNECTIVITY_SERVICE có thể trả về activeNetworkInfo để check internet có hay k, =null tức là k có internet*/
                    else{
                        btnLogin.isEnabled=false                   /*Không có internet thì ẩn button đăng nhập*/
                        Toast.makeText(activity,"Chưa có internet :(",Toast.LENGTH_SHORT).show()
                    }
                }
            }
        }
        fun registerWifiReceiverOnResume():IntentFilter{ /*Nên đăng ký và gỡ bỏ broadcastreceiver ở đâu?: Đăng ký trong sự kiện onResume. Hủy trong sự kiện onPause.*/
            return IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION) /*lắng nghe trong onResume: lắng nghe cái zì??->cần có 1 bộ lọc (Filter)-> tạo 1 IntentFilter.*/
            /*intentFilter.addAction()*/    /*ta có thể thêm nhiều lắng nghe khác bằng phương thức này-> càng add nhiều càng tốn pin*/
            /*intentFilter là tạo bộ lọc. Ở đây ta chỉ lắng nghe có internet(wifi) hay ko thôi (đã đăng ký trong file Manifest)*/
        }
    }
}