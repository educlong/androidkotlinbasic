package elong.androidApp.services.chapter6BroadcastReceiver

import android.app.NotificationManager
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.net.*
import android.widget.Toast
import elong.androidApp.MainActivity
import elong.androidApp.R
import elong.androidApp.services.chapter6_9.NotificationController
import java.lang.Exception

class BroadcastInManifest
    : BroadcastReceiver(){
    override fun onReceive(context: Context?, intent: Intent?) {
        try {
            var connectivityManager: ConnectivityManager = context!!.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager   /*trả về dịch vụ internet của thiết bị*/
//            var netInfor:NetworkInfo=connectivityManager.activeNetworkInfo
//            connectivityManager.registerNetworkCallback()
            if (connectivityManager.activeNetworkInfo != null) thongBaoCoInternetTrongFileManifest(context)        /*khi có dvụ internet rồi thì làm mọi thứ ok. nếu có internet:*/
        }catch (ex:Exception){
            Toast.makeText(context,ex.toString(),Toast.LENGTH_SHORT).show()
        }
    }

    private fun thongBaoCoInternetTrongFileManifest(context: Context) { /*là hàm lấy thông tin mang đi đâu đó. Chỉ có notification hoặc Toast mới sử dùng đc trong case này!*/
        var resultIntent:Intent=Intent(context,MainActivity::class.java)    /*Toast ko cho phép tương tác, notification cho phép tương tác -> dùng notification*/
        var mNotifyMgr:NotificationManager=context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        NotificationController.ProcessNotificaion.createNotification(context,resultIntent,"Thông báo","Hiện tại chưa có thông báo, chỉ có mạng",
                    context.packageName, R.raw.tieng_thu_rung,"114","Hacking..." ,mNotifyMgr)
    }
}



/*
    (val context: Context) : LiveData<Boolean>() {

    private var connectivityManager: ConnectivityManager = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

    private lateinit var connectivityManagerCallback: ConnectivityManager.NetworkCallback

    private val networkRequestBuilder: NetworkRequest.Builder = NetworkRequest.Builder()
        .addTransportType(android.net.NetworkCapabilities.TRANSPORT_CELLULAR)
        .addTransportType(android.net.NetworkCapabilities.TRANSPORT_WIFI)

    override fun onActive() {
        super.onActive()
        updateConnection()
        when {
            Build.VERSION.SDK_INT >= Build.VERSION_CODES.N -> connectivityManager.registerDefaultNetworkCallback(getConnectivityMarshmallowManagerCallback())
            Build.VERSION.SDK_INT >= Build.VERSION_CODES.M -> marshmallowNetworkAvailableRequest()
            Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP -> lollipopNetworkAvailableRequest()
            else -> {
                if (Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP) {
                    context.registerReceiver(networkReceiver, IntentFilter("android.net.conn.CONNECTIVITY_CHANGE")) // android.net.ConnectivityManager.CONNECTIVITY_ACTION
                }
            }
        }
    }

    override fun onInactive() {
        super.onInactive()
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            connectivityManager.unregisterNetworkCallback(connectivityManagerCallback)
        } else {
            context.unregisterReceiver(networkReceiver)
        }
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    private fun lollipopNetworkAvailableRequest() {
        connectivityManager.registerNetworkCallback(networkRequestBuilder.build(), getConnectivityLollipopManagerCallback())
    }

    @TargetApi(Build.VERSION_CODES.M)
    private fun marshmallowNetworkAvailableRequest() {
        connectivityManager.registerNetworkCallback(networkRequestBuilder.build(), getConnectivityMarshmallowManagerCallback())
    }

    private fun getConnectivityLollipopManagerCallback(): ConnectivityManager.NetworkCallback {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            connectivityManagerCallback = object : ConnectivityManager.NetworkCallback() {
                override fun onAvailable(network: Network?) {
                    postValue(true)
                }

                override fun onLost(network: Network?) {
                    postValue(false)
                }
            }
            return connectivityManagerCallback
        } else {
            throw IllegalAccessError("Accessing wrong API version")
        }
    }

    private fun getConnectivityMarshmallowManagerCallback(): ConnectivityManager.NetworkCallback {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            connectivityManagerCallback = object : ConnectivityManager.NetworkCallback() {
                override fun onCapabilitiesChanged(network: Network?, networkCapabilities: NetworkCapabilities?) {
                    networkCapabilities?.let { capabilities ->
                        if (capabilities.hasCapability(NetworkCapabilities.NET_CAPABILITY_INTERNET) && capabilities.hasCapability(
                                NetworkCapabilities.NET_CAPABILITY_VALIDATED
                            )
                        ) {
                            postValue(true)
                        }
                    }
                }

                override fun onLost(network: Network?) {
                    postValue(false)
                }
            }
            return connectivityManagerCallback
        } else {
            throw IllegalAccessError("Accessing wrong API version")
        }
    }

    private val networkReceiver = object : BroadcastReceiver() {
        override fun onReceive(context: Context, intent: Intent) {
            updateConnection()
        }
    }

    private fun updateConnection() {
        val activeNetwork: NetworkInfo? = connectivityManager.activeNetworkInfo
        postValue(activeNetwork?.isConnected == true)
    }
}*/
