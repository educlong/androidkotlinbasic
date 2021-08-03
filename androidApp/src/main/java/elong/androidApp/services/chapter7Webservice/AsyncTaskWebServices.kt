package elong.androidApp.services.chapter7Webservice

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.AsyncTask
import android.util.Log
import elong.models.chapter1_2_3_7.DanhBa
import elong.models.chapter7.InforPerson
import org.json.JSONArray
import org.ksoap2.serialization.*
import com.google.gson.*
import elong.androidApp.MainActivity
import elong.androidApp.MainActivityChapter4567
import elong.androidApp.services.chapter7_9_WebserviceBonus.ReadUrlXmlJsonGson
import elong.models.chapter7.Result
import elong.models.chapter7.ResultList
import elong.models.chapter7.TyZaDongA
import org.json.JSONObject
import java.net.URLEncoder

class AsyncTaskWebServices {
    object ConfigurationWebServiceKsoapPrimitiveData{
        val SERVER_URL_KSOAP_PRIMITIVE_DATA:String="https://www.w3schools.com/xml/tempconvert.asmx"                                 /*server*/
        val NAME_SPACE_KSOAP_PRIMITIVE_DATA:String="https://www.w3schools.com/xml/"                                                 /*namespace*/
        val METHOD_C_TO_F_KSOAP_PRIMITIVE_DATA:String="CelsiusToFahrenheit"                                                         /*method*/
        val PARAMETER_CELSIUS_KSOAP_PRIMITIVE_DATA:Array<String?> = arrayOf("Celsius")                                              /*param (đối số của hàm)*/
        val SOAP_ACTION_C_TO_F_KSOAP_PRIMITIVE_DATA:String= NAME_SPACE_KSOAP_PRIMITIVE_DATA+ METHOD_C_TO_F_KSOAP_PRIMITIVE_DATA     /*SOAP action (namespace+method)*/
    }
    class /*WEBSERVICES -> Events KSOAP API Dạng cơ sở PRIMITIVE DATA*/     KsoapPrimitiveDataConvertCToFDegree() : AsyncTask<String, Void, String>(){
        override fun doInBackground(vararg params: String?): String? {      /*input (server cho) là kiểu string, quá trình xlý ko biết->kiểu Void, kquả trả về là kiểu string*/
            return ksoapPrimitiveDataDoInBackgroundLayZaTriInput(params)
        }
        override fun onPreExecute() {
            super.onPreExecute()
            ksoapPrimitiveDataOnPreExecuteTuDongThucHienKhiTienTrinhBatDau()
        }
        override fun onProgressUpdate(vararg values: Void?) {
            super.onProgressUpdate(*values)
        }
        override fun onPostExecute(result: String?) {
            super.onPostExecute(result)
            ksoapPrimitiveDataOnPostExecuteTuDongThucHienKhiTienTrinhKetThuc(result)
        }

        private fun     /*HÀM LẤY ZÁTRỊ INPUT-> ở đây input chỉ có 1 fầntử là celsi...*/ksoapPrimitiveDataDoInBackgroundLayZaTriInput(params: Array<out String?>): String? {
            try {
                var dataWebService = ReadUrlXmlJsonGson.SOAP.querySOAPw1(ConfigurationWebServiceKsoapPrimitiveData.PARAMETER_CELSIUS_KSOAP_PRIMITIVE_DATA,params,
                    ConfigurationWebServiceKsoapPrimitiveData.NAME_SPACE_KSOAP_PRIMITIVE_DATA,ConfigurationWebServiceKsoapPrimitiveData.METHOD_C_TO_F_KSOAP_PRIMITIVE_DATA,
                    ConfigurationWebServiceKsoapPrimitiveData.SERVER_URL_KSOAP_PRIMITIVE_DATA,ConfigurationWebServiceKsoapPrimitiveData.SOAP_ACTION_C_TO_F_KSOAP_PRIMITIVE_DATA)
                    as SoapPrimitive
                return dataWebService.toString()
            } catch (ex: Exception) {
                Log.e("LOI_KSOAP_API_PRIMITIVE_DATA", ex.toString())
            }
            return null
        }
        private fun     /*HÀM TỰ ĐỘNG THỰC HIỆN KHI TIẾN TRÌNH BẮT ĐẦU*/                ksoapPrimitiveDataOnPreExecuteTuDongThucHienKhiTienTrinhBatDau() {
            MainActivityChapter4567.LoadDoF.txtWebServiceKSOAPdoF!!.text=""
            MainActivityChapter4567.LoadGeneral.progressDialogWebServer!!.show()
        }
        private fun     /*HÀM TỰ ĐỘNG THỰC HIỆN KHI TIẾN TRÌNH KẾT THÚC*/               ksoapPrimitiveDataOnPostExecuteTuDongThucHienKhiTienTrinhKetThuc(result: String?){
            MainActivityChapter4567.LoadDoF.txtWebServiceKSOAPdoF!!.text=result
            MainActivityChapter4567.LoadGeneral.progressDialogWebServer!!.dismiss()
        }
    }

    object ConfigurationWebServiceKsoapObjectData{
        val SERVER_URL_KSOAP_OBJECT_DATA:String="http://192.168.${MainActivity.LoadGeneral.txtWebServiceIPaddress!!.text.toString()}" +
                "/WebserviceDemoAndroidKotkin/androidkotlinservices.asmx"/*server*/
        val NAME_SPACE_KSOAP_OBJECT_DATA:String="http://elong.ca/"                                                                 /*namespace*/
        val METHOD_GET_DETAIL_KSOAP_OBJECT_DATA:String="GetDetail"                                                                 /*method*/
        val PARAMETER_CODECONTACT_DETAIL_KSOAP_OBJECT_DATA:Array<String?> = arrayOf("code")                                        /*param (đối số của hàm)*/
        val SOAP_ACTION_GET_DETAIL_KSOAP_OBJECT_DATA:String= NAME_SPACE_KSOAP_OBJECT_DATA+ METHOD_GET_DETAIL_KSOAP_OBJECT_DATA     /*SOAP action (namespace+method)*/
    }
    class /*WEBSERVICES -> Events KSOAP API Dạng cơ sở OBJECT DATA*/        KsoapObjectDataDetailContactTask():AsyncTask<Int,Void,DanhBa>(){
        override fun doInBackground(vararg params: Int?): DanhBa? {         /*input là code (kiểu int -> phải dùng Integer), kquả trả về là 1 Contact (Danh Bạ)*/
            return ksoapObjectDataDoInBackgroundLayZaTriInput(params)
        }
        override fun onPreExecute() {
            super.onPreExecute()
            ksoapObjectDataOnPreExecuteTuDongThucHienKhiTienTrinhBatDau()
        }
        override fun onProgressUpdate(vararg values: Void?) {
            super.onProgressUpdate(*values)
        }
        override fun onPostExecute(result: DanhBa?) {
            super.onPostExecute(result)
            ksoapObjectDataOnPostExecuteTuDongThucHienKhiTienTrinhKetThuc(result)
        }

        private fun     /*HÀM LẤY ZÁTRỊ INPUT-> ở đây input chỉ có 1 fầntử là celsi...*/ksoapObjectDataDoInBackgroundLayZaTriInput(params: Array<out Int?>): DanhBa? {
            try {
                var dataWebServiceSoapObject:SoapObject=ReadUrlXmlJsonGson.SOAP.querySOAPw1(ConfigurationWebServiceKsoapObjectData.PARAMETER_CODECONTACT_DETAIL_KSOAP_OBJECT_DATA,
                    params,ConfigurationWebServiceKsoapObjectData.NAME_SPACE_KSOAP_OBJECT_DATA,ConfigurationWebServiceKsoapObjectData.METHOD_GET_DETAIL_KSOAP_OBJECT_DATA,
                    ConfigurationWebServiceKsoapObjectData.SERVER_URL_KSOAP_OBJECT_DATA,ConfigurationWebServiceKsoapObjectData.SOAP_ACTION_GET_DETAIL_KSOAP_OBJECT_DATA)
                    as SoapObject
                var danhBa:DanhBa= DanhBa()
                if (dataWebServiceSoapObject.hasProperty("Code"))                                   /*"Code" này lấy trên server (server cho zì lấy đó)*/
                    danhBa.CodeUser= dataWebServiceSoapObject.getPropertyAsString("Code").toInt()   /*"Code" này lấy trên server (server cho zì lấy đó)*/
                if (dataWebServiceSoapObject.hasProperty("Name"))                                   /*Tương tự,...*/
                    danhBa.NameUser=dataWebServiceSoapObject.getPropertyAsString("Name")
                if (dataWebServiceSoapObject.hasProperty("Phone"))
                    danhBa.PhoneUser=dataWebServiceSoapObject.getPropertyAsString("Phone")
                return danhBa
            }catch (ex:Exception){
                Log.e("LOI_KSOAP_API_OBJECT_DATA",ex.toString())
            }
            return null
        }
        private fun     /*HÀM TỰ ĐỘNG THỰC HIỆN KHI TIẾN TRÌNH BẮT ĐẦU*/                ksoapObjectDataOnPreExecuteTuDongThucHienKhiTienTrinhBatDau() {
            MainActivityChapter4567.LoadDetail.txtWebServiceKSOAPDetail!!.text=""
            MainActivityChapter4567.LoadGeneral.progressDialogWebServer!!.show()
        }
        private fun     /*HÀM TỰ ĐỘNG THỰC HIỆN KHI TIẾN TRÌNH KẾT THÚC*/               ksoapObjectDataOnPostExecuteTuDongThucHienKhiTienTrinhKetThuc(result: DanhBa?) {
            MainActivityChapter4567.LoadDetail.txtWebServiceKSOAPDetail!!.text=result.toString()
            MainActivityChapter4567.LoadGeneral.progressDialogWebServer!!.dismiss()
        }

    }

    object ConfigurationWebServiceKsoapListObjectData{
        val SERVER_URL_KSOAP_LIST_OBJECT_DATA:String="http://192.168.${MainActivity.LoadGeneral.txtWebServiceIPaddress!!.text.toString()}" +
                "/WebserviceDemoAndroidKotkin/androidkotlinservices.asmx"/*server*/
        val NAME_SPACE_KSOAP_LIST_OBJECT_DATA:String="http://elong.ca/"                                                                 /*namespace*/
        val METHOD_GET_DETAIL_KSOAP_LIST_OBJECT_DATA:String="Lay5Contact"                                                                 /*method*/
        val SOAP_ACTION_GET_DETAIL_KSOAP_LIST_OBJECT_DATA:String= NAME_SPACE_KSOAP_LIST_OBJECT_DATA+ METHOD_GET_DETAIL_KSOAP_LIST_OBJECT_DATA
    }
    class /*WEBSERVICES -> Events KSOAP API Dạng cơ sở LIST OBJECT DATA*/   KsoapListObjectDataDetailContactTask():AsyncTask<Void, Void, MutableList<DanhBa>>(){
        override fun doInBackground(vararg params: Void?): MutableList<DanhBa>? {   /*input: k có input đầu vào, kquả trả về là 1 List Contact (List Danh Bạ)*/
            return ksoapListObjectDataInput(params)
        }
        override fun onPreExecute() {
            super.onPreExecute()
            ksoapListObjectDataOnPreExecuteTuDongThucHienKhiTienTrinhBatDau()
        }
        override fun onPostExecute(result: MutableList<DanhBa>?) {
            super.onPostExecute(result)
            ksoapListObjectDataThucHienKhiTienTrinhKetThuc(result)
        }

        private fun     /*HÀM LẤY ZÁTRỊ INPUT-> ở đây k có input truyền vào*/           ksoapListObjectDataInput(params: Array<out Void?>): MutableList<DanhBa>? {
            var danhBas:MutableList<DanhBa> = mutableListOf()
            try {
                var dataWebServiceSoapListObject:SoapObject= ReadUrlXmlJsonGson.SOAP.querySOAPw1(null,null,
                    ConfigurationWebServiceKsoapListObjectData.NAME_SPACE_KSOAP_LIST_OBJECT_DATA,
                    ConfigurationWebServiceKsoapListObjectData.METHOD_GET_DETAIL_KSOAP_LIST_OBJECT_DATA,
                    ConfigurationWebServiceKsoapListObjectData.SERVER_URL_KSOAP_LIST_OBJECT_DATA,
                    ConfigurationWebServiceKsoapListObjectData.SOAP_ACTION_GET_DETAIL_KSOAP_LIST_OBJECT_DATA) as SoapObject
                for (count in 0 until dataWebServiceSoapListObject.propertyCount) {             /*.getPropertyCount(): trả về tập các đối tượng nằm trong đối tượng này*/
                    var dataWebServiceSoapObject: SoapObject = dataWebServiceSoapListObject.getProperty(count) as SoapObject       /*trả về 1 đối tượng*/
                    var danhBa: DanhBa = DanhBa()
                    if (dataWebServiceSoapObject.hasProperty("Code"))                                     /*"Code" này lấy trên server (server cho zì lấy đó)*/
                        danhBa.CodeUser = dataWebServiceSoapObject.getPropertyAsString("Code").toInt()    /*"Code" này lấy trên server (server cho zì lấy đó)*/
                    if (dataWebServiceSoapObject.hasProperty("Name"))                                     /*Tương tự,...*/
                        danhBa.NameUser = dataWebServiceSoapObject.getPropertyAsString("Name")
                    if (dataWebServiceSoapObject.hasProperty("Phone"))
                        danhBa.PhoneUser = dataWebServiceSoapObject.getPropertyAsString("Phone")
                    danhBas.add(danhBa)     /*sau khi chạy if xong ta sẽ lấy đc danhBa*/
                }
            }catch (ex:Exception){
                Log.e("LOI_KSOAP_API_LIST_OBJECT_DATA",ex.toString())
            }
            return danhBas
        }
        private fun     /*HÀM TỰ ĐỘNG THỰC HIỆN KHI TIẾN TRÌNH BẮT ĐẦU*/                ksoapListObjectDataOnPreExecuteTuDongThucHienKhiTienTrinhBatDau(){
            MainActivityChapter4567.LoadListDetail.adapterWebServiceKSOAPListContact!!.clear()
            MainActivityChapter4567.LoadGeneral.progressDialogWebServer!!.show()
        }
        private fun     /*HÀM TỰ ĐỘNG THỰC HIỆN KHI TIẾN TRÌNH KẾT THÚC*/               ksoapListObjectDataThucHienKhiTienTrinhKetThuc(result: MutableList<DanhBa>?) {
            MainActivityChapter4567.LoadListDetail.adapterWebServiceKSOAPListContact!!.addAll(result!!)
            MainActivityChapter4567.LoadGeneral.progressDialogWebServer!!.dismiss()
        }
    }

    object ConfigurationWebServiceJSONNguyenThuy{
        val SERVER_URL_JSON_NGUYENTHUY:String="https://www.w3schools.com/js/customers_mysql.php"
        val PROPERTY1_JSON_NGUYENTHUY:String="Name"
        val PROPERTY2_JSON_NGUYENTHUY:String="City"
        val PROPERTY3_JSON_NGUYENTHUY:String="Country"
    }
    class /*WEBSERVICES -> Events JSON NGUYEN THUY*/                        JSONNguyenThuyListPersonTask() : AsyncTask<Void,Void,MutableList<InforPerson>>(){
        override fun doInBackground(vararg params: Void?): MutableList<InforPerson>? {
            return jSONObjectDataInput(params) //ngoài cùng là 1 ngoặc vuông -> JSON Array
        }
        override fun onPreExecute() {
            super.onPreExecute()
            jSONObjectDataOnPreExecute()
        }
        override fun onPostExecute(result: MutableList<InforPerson>?) {
            super.onPostExecute(result)
            jSONObjectDataTienTrinhKetThuc(result)
        }

        private fun     /*HÀM LẤY ZÁTRỊ INPUT-> ở đây k có input truyền vào*/           jSONObjectDataInput(params: Array<out Void?>): MutableList<InforPerson>? {
            var persons:MutableList<InforPerson>?= mutableListOf()
            try {   /*làm zì thì làm, có internet thì phải có try-catch.*/          /*Định dạng mở đóng [] -> JSONArray*/
                var jsonArray:JSONArray= JSONArray(
                    ReadUrlXmlJsonGson.U_R_L.urlXmlOrJson(ConfigurationWebServiceJSONNguyenThuy.SERVER_URL_JSON_NGUYENTHUY,"GET","json").toString())
                for (i in 0 until jsonArray.length()){                          /*ở đây 1 JSONArray có nhiều JSONObject-> ta có vòng for*/
                    var jsonObject =jsonArray.getJSONObject(i)                  /*thông qua JSONObject này ta lấy đc mọi thứ*/
                    var person:InforPerson= InforPerson()
                    if (jsonObject.has(ConfigurationWebServiceJSONNguyenThuy.PROPERTY1_JSON_NGUYENTHUY))    /*ktra xem jsonObject có thuộc tính này ko? có thì set vào*/
                        person.Name=jsonObject.getString(ConfigurationWebServiceJSONNguyenThuy.PROPERTY1_JSON_NGUYENTHUY)
                    if (jsonObject.has(ConfigurationWebServiceJSONNguyenThuy.PROPERTY2_JSON_NGUYENTHUY))    /*tương tự*/
                        person.City=jsonObject.getString(ConfigurationWebServiceJSONNguyenThuy.PROPERTY2_JSON_NGUYENTHUY)
                    if (jsonObject.has(ConfigurationWebServiceJSONNguyenThuy.PROPERTY3_JSON_NGUYENTHUY))    /*tương tự*/
                        person.Country=jsonObject.getString(ConfigurationWebServiceJSONNguyenThuy.PROPERTY3_JSON_NGUYENTHUY)
                    persons!!.add(person)                           /*add vào danh sách. Vậy, nó sẽ trả về 1 list persons.  persons này sẽ return về hàm onPostExecute*/
                }
            }catch (ex:Exception){
                Log.e("LOI_JSON_NGUYEN_THUY", ex.toString())
            }
            return persons
        }
        private fun     /*HÀM TỰ ĐỘNG THỰC HIỆN KHI TIẾN TRÌNH BẮT ĐẦU*/                jSONObjectDataOnPreExecute() {
            MainActivityChapter4567.LoadListJSONNguyenThuy.adapterListInformationPerson!!.clear()
            MainActivityChapter4567.LoadGeneral.progressDialogWebServer!!.show()
        }
        private fun     /*HÀM TỰ ĐỘNG THỰC HIỆN KHI TIẾN TRÌNH KẾT THÚC*/               jSONObjectDataTienTrinhKetThuc(result: MutableList<InforPerson>?) {
            MainActivityChapter4567.LoadListJSONNguyenThuy.adapterListInformationPerson!!.clear()
            MainActivityChapter4567.LoadListJSONNguyenThuy.adapterListInformationPerson!!.addAll(result!!)
            MainActivityChapter4567.LoadGeneral.progressDialogWebServer!!.dismiss()
        }
    }

    object ConfigurationWebServiceGSON{
        val SERVER_API:String="https://searchv7.expertrec.com/v6/search/ccdb9cb6-5380-11e8-a8e3-12b6486824f4/?q=";
        val SERVER_PAGES:String="&page=0&size=5"
    }
    class /*WEBSERVICES -> Events JSON DANG GSON*/                          GSONContactTask():AsyncTask<String,Void,MutableList<Result>>(){
        override fun doInBackground(vararg params: String?): MutableList<Result>? {
            return gSonObjectDataInput(params)
        }
        override fun onPreExecute() {
            super.onPreExecute()
            gSonObjectDataOnPreExecute()
        }
        override fun onPostExecute(result: MutableList<Result>?) {
            super.onPostExecute(result)
            gSonObjectDataTienTrinhKetThuc(result)
        }
        private fun     /*HÀM LẤY ZÁTRỊ INPUT-> ở đây k có input truyền vào*/           gSonObjectDataInput(params: Array<out String?>): MutableList<Result>? {
            var results:MutableList<Result>?= mutableListOf()
            try {               /*URLEncoder: khi gõ dấu tiếng việt-> cần mã hóa về mã xml để code hiểu*/
                var keyword:String = ConfigurationWebServiceGSON.SERVER_API + URLEncoder.encode(params[0],"UTF-8") + ConfigurationWebServiceGSON.SERVER_PAGES
                var resultsListData:ResultList = Gson().fromJson(ReadUrlXmlJsonGson.U_R_L.urlGSON(keyword),ResultList::class.java)
                results = resultsListData.Results
            }catch (ex:Exception){
                Log.e("LOI_GSON",ex.toString())
            }
            return results
        }
        private fun gSonObjectDataOnPreExecute() {
            MainActivityChapter4567.LoadListGSON.adapterListContactWebServiceGSONSearch!!.clear()
            MainActivityChapter4567.LoadGeneral.progressDialogWebServer!!.show()
        }
        private fun gSonObjectDataTienTrinhKetThuc(result: MutableList<Result>?) {
            MainActivityChapter4567.LoadListGSON.adapterListContactWebServiceGSONSearch!!.clear()
            MainActivityChapter4567.LoadListGSON.adapterListContactWebServiceGSONSearch!!.addAll(result!!)
            MainActivityChapter4567.LoadGeneral.progressDialogWebServer!!.dismiss()
        }
    }

    object ConfigurationWebServiceJSONDongABank{
        val SERVER_API="https://www.dongabank.com.vn/exchange/export"
        val LIST_EXCHANGE="items"
        val TYPE="type"
        val IMAGE_URL="imageurl"
        val MUA_TIEN_MAT="muatienmat"
        val MUA_CHUYEN_KHOAN="muack"
        val BAN_TIEN_MAT="bantienmat"
        val BAN_CHUYEN_KHOAN="banck"
    }
    class TyZaDongAJsonTask():AsyncTask<Void,Void,MutableList<TyZaDongA>>(){
        override fun doInBackground(vararg params: Void?): MutableList<TyZaDongA>? {
            return jSONDongAObjectDataInput(params)
        }
        override fun onPreExecute() {
            super.onPreExecute()
            jSONDongAObjectDataOnPreExecute()
        }
        override fun onPostExecute(result: MutableList<TyZaDongA>?) {
            super.onPostExecute(result)
            jSONDongAObjectDataTienTrinhKetThuc(result)
        }

        private fun jSONDongAObjectDataInput(params: Array<out Void?>): MutableList<TyZaDongA>? {
            var listTyZaDongA:MutableList<TyZaDongA>? = mutableListOf() /*định dạng mở đống [] thì sẽ trả về 1 JSONArray. Định dạng mở đống {} thì trả về JSONObject*/
            try {       /* Ở ĐÂY ĐÔNG Á CHẶN 2 ĐỊNH DẠNG TRÊN BẰNG DẤU () -> Cần chỉnh bỏ định dạng (bỏ dấu () của Đông Á)*/
                var jsonUrl:String=
                    ReadUrlXmlJsonGson.U_R_L.urlXmlOrJson(ConfigurationWebServiceJSONDongABank.SERVER_API,"GET","json").toString()
                    .replace("(","").replace(")","")    /*lấy chuỗi stringBuilder ra và replace 2 dấu (), thay thế bằng chuỗi rỗng*/
                var jsonObject:JSONObject= JSONObject(jsonUrl)                             /*link server nếu bỏ 2 dấu () sẽ trở thành JSONObject*/
                var jsonArray:JSONArray = jsonObject.getJSONArray(ConfigurationWebServiceJSONDongABank.LIST_EXCHANGE) /*bên trong JSONObject(items)sẽ là cácJSONArray*/
                for (i in 0 until jsonArray.length()){
                    var jsonTyZaObject:JSONObject=jsonArray.getJSONObject(i)
                    var itemExchangeDongA:TyZaDongA= TyZaDongA()
                    if (jsonTyZaObject.has(ConfigurationWebServiceJSONDongABank.TYPE))
                        itemExchangeDongA.Type=jsonTyZaObject.getString(ConfigurationWebServiceJSONDongABank.TYPE)
                    if (jsonTyZaObject.has(ConfigurationWebServiceJSONDongABank.IMAGE_URL)){    /*Đông Á chặn ko cho người dùng lấy link bằng các dấu \. */
                        itemExchangeDongA.Imageurl=jsonTyZaObject.getString(ConfigurationWebServiceJSONDongABank.IMAGE_URL) /*Vậy, ta cần loại bỏ hết các dấu \*/
                        /*Sau khi zải mã và lấy đc link image của Đông Á -> cần chuyển đổi từ link hình (String) sang hình ảnh (Bitmap) bằng 2 câu lệnh dưới*/
                        var bitmap:Bitmap=BitmapFactory.decodeStream(
                            ReadUrlXmlJsonGson.U_R_L.changeLinkToXmlOrJson(itemExchangeDongA.Imageurl.toString(),"GET","json").inputStream)
                        itemExchangeDongA.BitmapImg=bitmap
                    }
                    if (jsonTyZaObject.has(ConfigurationWebServiceJSONDongABank.MUA_TIEN_MAT))
                        itemExchangeDongA.Muatienmat=jsonTyZaObject.getString(ConfigurationWebServiceJSONDongABank.MUA_TIEN_MAT)
                    if (jsonTyZaObject.has(ConfigurationWebServiceJSONDongABank.MUA_CHUYEN_KHOAN))
                        itemExchangeDongA.Muack=jsonTyZaObject.getString(ConfigurationWebServiceJSONDongABank.MUA_CHUYEN_KHOAN)
                    if (jsonTyZaObject.has(ConfigurationWebServiceJSONDongABank.BAN_TIEN_MAT))
                        itemExchangeDongA.Bantienmat=jsonTyZaObject.getString(ConfigurationWebServiceJSONDongABank.BAN_TIEN_MAT)
                    if (jsonTyZaObject.has(ConfigurationWebServiceJSONDongABank.BAN_CHUYEN_KHOAN))
                        itemExchangeDongA.Banck=jsonTyZaObject.getString(ConfigurationWebServiceJSONDongABank.BAN_CHUYEN_KHOAN)
                    listTyZaDongA!!.add(itemExchangeDongA)
                }
            }catch (ex:Exception){
                Log.e("LOI_JSON_DongA_Bank",ex.toString())
            }
            return listTyZaDongA
        }
        private fun jSONDongAObjectDataOnPreExecute() {
            MainActivityChapter4567.LoadJSONDongA.adapterTyZaHoiDoaiNHDongA_JSON!!.clear()
            MainActivityChapter4567.LoadGeneral.progressDialogWebServer!!.show()
        }
        private fun jSONDongAObjectDataTienTrinhKetThuc(result: MutableList<TyZaDongA>?) {
            MainActivityChapter4567.LoadJSONDongA.adapterTyZaHoiDoaiNHDongA_JSON!!.clear()
            MainActivityChapter4567.LoadJSONDongA.adapterTyZaHoiDoaiNHDongA_JSON!!.addAll(result!!)
            MainActivityChapter4567.LoadGeneral.progressDialogWebServer!!.dismiss()
        }
    }
}