package elong.androidApp.services.chapter9FirebaseCloudMessage

import android.os.AsyncTask
import android.util.Log
import elong.androidApp.MainActivity
import elong.androidApp.services.chapter7_9_WebserviceBonus.ReadUrlXmlJsonGson
import java.lang.Exception


class MyFirebaseControllers {
    object ConfigIDtokenFirebase{
        val SERVER_URL:String="http://192.168.${MainActivity.LoadGeneral.txtWebServiceIPaddress!!.text.toString()}" +
                "/FirebaseCloudMessageServer/api/FirebaseCM/?token=";  //?token= chính là token đối số của phương thức saveToken (HttpPost)
    }

    class MyFirebaseIDTask: AsyncTask<String, Void, Boolean>() {    /*input là 1 đường dẫn token (string),quá trình xlý ko quan tâm,kquả trả về là Boolean*/
        override fun doInBackground(vararg params: String?): Boolean? {
            return getIDTokenAsyncTaskDoInBackgroundLayZaTriInput(params)
        }
        override fun onPreExecute() {
            super.onPreExecute()
        }
        override fun onProgressUpdate(vararg values: Void?) {
            super.onProgressUpdate(*values)
        }
        override fun onPostExecute(result: Boolean?) {
            super.onPostExecute(result)
        }

        private fun getIDTokenAsyncTaskDoInBackgroundLayZaTriInput(params: Array<out String?>): Boolean? {  /*Lưu token lấy đc từ firebase vào database riêng của mình*/
            try {   /*ở đây requestMethod của we bằng POST -> nó sẽ tự động vào phương thức post saveToken trong webservice, ở đây nó k quan tâm tên hàm, chỉ quan tâm đối số hàm*/
                return ReadUrlXmlJsonGson.U_R_L.urlXmlOrJson(ConfigIDtokenFirebase.SERVER_URL+params[0],"POST","xml").toString().contains("true")
            } catch (ex: Exception) {   /*contains("true") là đưa về boolean, để return về là thành công hay thất bại*/
                Log.e("LOI_ID_TOKEN_FIREBASE_CLOUD_MESSAGE", ex.toString())
            }
            return null
        }
    }
}