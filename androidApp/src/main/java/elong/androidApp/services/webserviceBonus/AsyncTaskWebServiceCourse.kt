package elong.androidApp.services.webserviceBonus

import android.annotation.SuppressLint
import android.os.AsyncTask
import android.util.Log
import elong.androidApp.MainActivity
import elong.androidApp.MainActivityWebserviceAndBonus
import elong.androidApp.services.chapter7_9_WebserviceBonus.ReadUrlXmlJsonGson
import elong.models.webserviceBonus.*
import elong.models.webserviceBonus.tyZaVietcombank.Exrate
import elong.models.webserviceBonus.tyZaVietcombank.ExrateList
import org.json.JSONArray
import org.json.JSONObject
import org.ksoap2.serialization.*
import org.w3c.dom.Document
import org.w3c.dom.Element
import org.w3c.dom.Node
import org.w3c.dom.NodeList
import java.net.URLEncoder

class AsyncTaskWebServiceCourse {

    /*______________________CÁCH 1: Tương tác Webservice SOAP_______________________*/
    object ConfigurationWebServiceSoap{
        val SERVER_URL_SOAP_SERVER:String="http://192.168.${MainActivity.LoadGeneral.txtWebServiceIPaddress!!.text.toString()}" +
                "/DanhmucSanPhamWebServiceDemo/Views/WebServiceDemo.asmx"/*server*/
        val NAME_SPACE_SOAP:String="http://www.webservicecoursedemo.com/"           /*namespace*/
        //count danh mục
        val METHOD_COUNT_DANHMUC:String="DanhMucCount"                              /*method*/
        val SOAP_ACTION_COUNT_DANHMUC:String= NAME_SPACE_SOAP+ METHOD_COUNT_DANHMUC /*SOAP action (namespace+method)*/
        //query 1 danh mục
        val METHOD_DANHMUC_DETAIL:String="DanhMucDetail"
        val PARAMETER_SOAP_DANHMUC_DETAIL:Array<String?> = arrayOf("madm")
        val SOAP_ACTION_DANHMUC_DEATAIL:String= NAME_SPACE_SOAP+ METHOD_DANHMUC_DETAIL
        //query toàn bộ danh mục
        val METHOD_DANHMUCS:String="DanhMucs"
        val SOAP_ACTION_DANHMUCS:String= NAME_SPACE_SOAP+ METHOD_DANHMUCS
        //insert/update 1 danh mục
        val METHOD_INSERT_UPDATE_DANHMUC:String="DanhMucInsertUpdate"
        val PARAMETER_SOAP_DANHMUC:Array<String?> = arrayOf("madm","tendm")
        val SOAP_ACTION_INSERT_UPDATE_DANHMUC:String= NAME_SPACE_SOAP+ METHOD_INSERT_UPDATE_DANHMUC
        //delete 1 danh mục
        val METHOD_DELETE_DANHMUC:String="DanhMucDelete"
        val PARAMETER_SOAP_DELETE_DANHMUC:Array<String?> = arrayOf("madm")
        val SOAP_ACTION_DELETE_DANHMUC:String= NAME_SPACE_SOAP+ METHOD_DELETE_DANHMUC
        //count sản phẩm theo mã sản phẩm, zá từ from đến to
        val METHOD_COUNT_SANPHAM:String="SanPhamCount"
        val PARAMETER_SOAP_COUNT_SANPHAM_AND_QUERY_SANPHAMS:Array<String?> = arrayOf("madm","fromPrice","toPrice")
        val SOAP_ACTION_COUNT_SANPHAM:String= NAME_SPACE_SOAP+ METHOD_COUNT_SANPHAM;
        //query 1 sản phẩm
        val METHOD_SANPHAM_DETAIL:String="SanPhamDetail"
        val PARAMETER_SOAP_SANPHAM_DETAIL:Array<String?> = arrayOf("masp")
        val SOAP_ACTION_SANPHAM_DETAIL:String= NAME_SPACE_SOAP+ METHOD_SANPHAM_DETAIL
        //query toàn bộ sản phẩm hay query toàn bộ sản phẩm theo mã danh mục, với zá priceFrom đến priceTo
        val METHOD_SANPHAMS:String="SanPhams"
        val SOAP_ACTION_SANPHAMS:String= NAME_SPACE_SOAP+ METHOD_SANPHAMS
        //insert/update 1 sản phẩm
        val METHOD_INSERT_UPDATE_SANPHAM:String="SanPhamInsertUpdate"
        val PARAMETER_INSERT_UPDATE_SANPHAM:Array<String?> = arrayOf("codesp","namesp","price","codedm")
        val SOAP_ACTION_INSERT_UPDATE_SANPHAM:String= NAME_SPACE_SOAP+ METHOD_INSERT_UPDATE_SANPHAM
        //delete 1 sản phẩm
        val METHOD_DELETE_SANPHAM:String="SanPhamDelete"
        val PARAMETER_DELETE_SANPHAM:Array<String?> = arrayOf("masp")
        val SOAP_ACTION_DELETE_SANPHAM:String= NAME_SPACE_SOAP+ METHOD_DELETE_SANPHAM
    }

    class   /*Đếm số lượng xem có bao nhiêu danh mục*/      DanhMucTotalTask(): AsyncTask<Void, Void, Int>(){
        override fun doInBackground(vararg params: Void?): Int? {
            try{
                var dataWebService:SoapPrimitive=ReadUrlXmlJsonGson.SOAP.querySOAPw1(null,null,
                    ConfigurationWebServiceSoap.NAME_SPACE_SOAP,ConfigurationWebServiceSoap.METHOD_COUNT_DANHMUC,ConfigurationWebServiceSoap.SERVER_URL_SOAP_SERVER,
                    ConfigurationWebServiceSoap.SOAP_ACTION_COUNT_DANHMUC) as SoapPrimitive
                return dataWebService.toString().toInt()
            }catch (ex:Exception){
                Log.e("LOI_SOAP_COUNTDANHMUC",ex.toString())
            }
            return null;
        }
        override fun onPostExecute(result: Int?) {
            super.onPostExecute(result) /*nếu có kq thì đưa lên txtTotalCategoriesWebserviceBonus, còn ko thì thông báo Lỗi trên txtTotalCategoriesWebserviceBonus*/
            if(result!=null) MainActivityWebserviceAndBonus.LoadWebserviceDanhMuc.txtTotalCategoriesWebserviceBonus!!.text = result.toInt().toString()
            else MainActivityWebserviceAndBonus.LoadWebserviceDanhMuc.txtTotalCategoriesWebserviceBonus!!.text = "Lỗi"
        }
    }
    class   /*Query 1 danh mục*/                            DanhMucDetailTask():AsyncTask<String,Void, DanhMuc>(){
        override fun doInBackground(vararg params: String?): DanhMuc? {
            try{
                var dataWebService:SoapObject=ReadUrlXmlJsonGson.SOAP.querySOAPw1(ConfigurationWebServiceSoap.PARAMETER_SOAP_DANHMUC_DETAIL,
                    params,ConfigurationWebServiceSoap.NAME_SPACE_SOAP,ConfigurationWebServiceSoap.METHOD_DANHMUC_DETAIL,
                    ConfigurationWebServiceSoap.SERVER_URL_SOAP_SERVER,ConfigurationWebServiceSoap.SOAP_ACTION_DANHMUC_DEATAIL) as SoapObject
                var danhMuc:DanhMuc= DanhMuc()
                if (dataWebService.hasProperty("MaDm"))                                     /*"MaDm" này lấy trên server (server cho zì lấy đó)*/
                    danhMuc.CodeDanhMuc=dataWebService.getPropertyAsString("MaDm").toInt()  /*"MaDm" này lấy trên server (server cho zì lấy đó)*/
                if (dataWebService.hasProperty("TenDm"))
                    danhMuc.NameDanhMuc=dataWebService.getPropertyAsString("TenDm")
                return danhMuc
            }catch (ex:Exception){
                Log.e("LOI_SOAP_DANHMUCDETAIL",ex.toString())
            }
            return null
        }
        override fun onPostExecute(result: DanhMuc?) {
            super.onPostExecute(result) /*nếu có kết quả danh mục thì đưa thông tin danh mục lên txtCategoryWebserviceBonus, còn k thì thông báo lỗi Error*/
            if (result!=null) MainActivityWebserviceAndBonus.LoadWebserviceDanhMuc.txtCategoryWebserviceBonus!!.text=result.toString()
            else MainActivityWebserviceAndBonus.LoadWebserviceDanhMuc.txtCategoryWebserviceBonus!!.text="Error"
        }
    }
    class   /*Query toàn bộ danh mục*/                      DanhMucsTask():AsyncTask<Void,Void,MutableList<DanhMuc>>(){
        override fun doInBackground(vararg params: Void?): MutableList<DanhMuc> {
            var danhMucs:MutableList<DanhMuc> = mutableListOf()
            try {
                var dataWebService:SoapObject=ReadUrlXmlJsonGson.SOAP.querySOAPw1(null,null,ConfigurationWebServiceSoap.NAME_SPACE_SOAP,
                    ConfigurationWebServiceSoap.METHOD_DANHMUCS,ConfigurationWebServiceSoap.SERVER_URL_SOAP_SERVER,
                    ConfigurationWebServiceSoap.SOAP_ACTION_DANHMUCS) as SoapObject
                for (count in 0 until dataWebService.propertyCount){
                    var dataWebServiceDanhMuc:SoapObject=dataWebService.getProperty(count) as SoapObject
                    var danhMuc:DanhMuc= DanhMuc()
                    if (dataWebServiceDanhMuc.hasProperty("MaDm"))
                        danhMuc.CodeDanhMuc=dataWebServiceDanhMuc.getPropertyAsString("MaDm").toInt()
                    if (dataWebServiceDanhMuc.hasProperty("TenDm"))
                        danhMuc.NameDanhMuc=dataWebServiceDanhMuc.getPropertyAsString("TenDm")
                    danhMucs.add(danhMuc)
                }
            }catch (ex:Exception){
                Log.e("LOI_SOAP_DANHMUCS",ex.toString())
            }
            return danhMucs
        }
        override fun onPostExecute(result: MutableList<DanhMuc>?) {
            super.onPostExecute(result)
            if (result!=null) { /*nếu có kq query toàn bộ danh mục => cập nhật lại sourceSpinner*/
                MainActivityWebserviceAndBonus.LoadWebserviceDanhMuc.sourceSpinnerCategoriesWebserviceBonus!!.clear()   /* clear toàn bộ danh sách trong spinner */
                for (count in 0 until result.size)  /* sau đó dùng for loop để cập nhật lại, đưa từng danh mục vào sourceSpinner*/
                    MainActivityWebserviceAndBonus.LoadWebserviceDanhMuc.sourceSpinnerCategoriesWebserviceBonus!!.add(result[count].toString())
                MainActivityWebserviceAndBonus.LoadWebserviceDanhMuc.adapterSpinnerCategoriesWebserviceBonus!!.notifyDataSetChanged()   /*cuối cùng cập nhật lại adapter*/
            }
            else MainActivityWebserviceAndBonus.LoadWebserviceDanhMuc.sourceSpinnerCategoriesWebserviceBonus!!.add("Errors") /*nếu có lỗi thì thông báo trên sourceSpinner*/
        }
    }
    class   /*insert/update 1 danh mục*/                    DanhMucInsertUpdateTask():AsyncTask<String,Void, Boolean>(){
        override fun doInBackground(vararg params: String?): Boolean {
            try {
                var dataWebserice:SoapPrimitive=ReadUrlXmlJsonGson.SOAP.querySOAPw1(ConfigurationWebServiceSoap.PARAMETER_SOAP_DANHMUC,
                    params, ConfigurationWebServiceSoap.NAME_SPACE_SOAP,
                    ConfigurationWebServiceSoap.METHOD_INSERT_UPDATE_DANHMUC,ConfigurationWebServiceSoap.SERVER_URL_SOAP_SERVER,
                    ConfigurationWebServiceSoap.SOAP_ACTION_INSERT_UPDATE_DANHMUC) as SoapPrimitive
                return dataWebserice.toString().toBoolean()
            }catch (ex:Exception){
                Log.e("LOI_SOAP_INSERT_UPDATE_DANHMUC",ex.toString())
            }
            return false
        }
        override fun onPostExecute(result: Boolean?) {
            super.onPostExecute(result)
            MainActivityWebserviceAndBonus.LoadWebserviceDanhMuc.txtCategoryWebserviceBonus!!.text=result.toString()    /*hiển thị kq T or F lên textview*/
        }
    }
    class   /*delete 1 danh mục*/                           DanhMucDeleteTask():AsyncTask<String,Void,Boolean>(){
        override fun doInBackground(vararg params: String?): Boolean {
            try{
                var dataWebservice:SoapPrimitive=ReadUrlXmlJsonGson.SOAP.querySOAPw1(ConfigurationWebServiceSoap.PARAMETER_SOAP_DELETE_DANHMUC,
                    params,ConfigurationWebServiceSoap.NAME_SPACE_SOAP,ConfigurationWebServiceSoap.METHOD_DELETE_DANHMUC,
                    ConfigurationWebServiceSoap.SERVER_URL_SOAP_SERVER,ConfigurationWebServiceSoap.SOAP_ACTION_DELETE_DANHMUC) as SoapPrimitive
                return dataWebservice.toString().toBoolean()
            }catch (ex:Exception){
                Log.e("LOI_SOAP_DELETE_DANHMUC",ex.toString())
            }
            return false
        }
        override fun onPostExecute(result: Boolean?) {
            super.onPostExecute(result)
            MainActivityWebserviceAndBonus.LoadWebserviceDanhMuc.txtCategoryWebserviceBonus!!.text=result.toString()    /*hiển thị kq T or F lên textview*/
        }
    }

    class   /*Đếm số lượng xem có bao nhiêu sản phẩm*/      SanPhamTotalTask():AsyncTask<String,Void,Int>(){
        override fun doInBackground(vararg params: String?): Int? {
            try{
                var dataWebservice:SoapPrimitive=ReadUrlXmlJsonGson.SOAP.querySOAPw1(ConfigurationWebServiceSoap.PARAMETER_SOAP_COUNT_SANPHAM_AND_QUERY_SANPHAMS,
                    params,ConfigurationWebServiceSoap.NAME_SPACE_SOAP,ConfigurationWebServiceSoap.METHOD_COUNT_SANPHAM,
                    ConfigurationWebServiceSoap.SERVER_URL_SOAP_SERVER,ConfigurationWebServiceSoap.SOAP_ACTION_COUNT_SANPHAM) as SoapPrimitive
                return dataWebservice.toString().toInt()
            }catch (ex:Exception){
                Log.e("LOI_SOAP_COUNTSANPHAM",ex.toString())
            }
            return null
        }
        override fun onPostExecute(result: Int?) {
            super.onPostExecute(result) /*nếu có kq thì đưa lên txtTotalProductsWebserviceBonus, còn ko thì thông báo Lỗi trên txtTotalProductsWebserviceBonus*/
            if (result!=null) MainActivityWebserviceAndBonus.LoadWebserviceSanPham.txtTotalProductsWebserviceBonus!!.text=result.toInt().toString()
            else MainActivityWebserviceAndBonus.LoadWebserviceSanPham.txtTotalProductsWebserviceBonus!!.text="Errors!"
        }
    }
    class   /*Query 1 sản phẩm*/                            SanPhamDetailTask():AsyncTask<String,Void,SanPham>(){
        override fun doInBackground(vararg params: String?): SanPham? {
            try{
                var dataWebservice:SoapObject=ReadUrlXmlJsonGson.SOAP.querySOAPw1(ConfigurationWebServiceSoap.PARAMETER_SOAP_SANPHAM_DETAIL,params,
                    ConfigurationWebServiceSoap.NAME_SPACE_SOAP,ConfigurationWebServiceSoap.METHOD_SANPHAM_DETAIL,
                    ConfigurationWebServiceSoap.SERVER_URL_SOAP_SERVER,ConfigurationWebServiceSoap.SOAP_ACTION_SANPHAM_DETAIL) as SoapObject
                var sanPham:SanPham= SanPham()
                if (dataWebservice.hasProperty("MaSp"))
                    sanPham.Codesp=dataWebservice.getPropertyAsString("MaSp").toInt()
                if (dataWebservice.hasProperty("TenSp"))
                    sanPham.Namesp=dataWebservice.getPropertyAsString("TenSp")
                if (dataWebservice.hasProperty("DonGia"))
                    sanPham.Price=dataWebservice.getPropertyAsString("DonGia").toInt()
                if (dataWebservice.hasProperty("MaDm"))
                    sanPham.Codedm=dataWebservice.getPropertyAsString("MaDm").toInt()
                return sanPham
            }catch (ex:Exception){
                Log.e("LOI_SOAP_SANPHAMDETAIL",ex.toString())
            }
            return null
        }
        override fun onPostExecute(result: SanPham?) {
            super.onPostExecute(result) /*nếu có kết quả sản phẩm thì đưa thông tin sản phẩm lên txtProductWebserviceBonus, còn k thì thông báo lỗi Error*/
            if (result!=null) MainActivityWebserviceAndBonus.LoadWebserviceSanPham.txtProductWebserviceBonus!!.text=result.toString()
            else MainActivityWebserviceAndBonus.LoadWebserviceSanPham.txtProductWebserviceBonus!!.text="Errors!"
        }
    }
    class   /*Query toàn bộ sản phẩm theo mã danh mục*/     SanPhamsTask():AsyncTask<String,Void,MutableList<SanPham>>(){
        override fun doInBackground(vararg params: String?): MutableList<SanPham> {
            var sanPhams:MutableList<SanPham> = mutableListOf()
            try {
                var dataWebservice:SoapObject=ReadUrlXmlJsonGson.SOAP.querySOAPw1(ConfigurationWebServiceSoap.PARAMETER_SOAP_COUNT_SANPHAM_AND_QUERY_SANPHAMS,
                    params,ConfigurationWebServiceSoap.NAME_SPACE_SOAP,ConfigurationWebServiceSoap.METHOD_SANPHAMS,
                    ConfigurationWebServiceSoap.SERVER_URL_SOAP_SERVER,ConfigurationWebServiceSoap.SOAP_ACTION_SANPHAMS) as SoapObject
                for (count in 0 until dataWebservice.propertyCount){
                    var dataWebserviceSanPham:SoapObject=dataWebservice.getProperty(count) as SoapObject
                    var sanPham:SanPham= SanPham()
                    if (dataWebserviceSanPham.hasProperty("MaSp"))
                        sanPham.Codesp=dataWebserviceSanPham.getPropertyAsString("MaSp").toInt()
                    if (dataWebserviceSanPham.hasProperty("TenSp"))
                        sanPham.Namesp=dataWebserviceSanPham.getPropertyAsString("TenSp")
                    if (dataWebserviceSanPham.hasProperty("DonGia"))
                        sanPham.Price=dataWebserviceSanPham.getPropertyAsString("DonGia").toInt()
                    if (dataWebserviceSanPham.hasProperty("MaDm"))
                        sanPham.Codedm=dataWebserviceSanPham.getPropertyAsString("MaDm").toInt()
                    sanPhams.add(sanPham)
                }
            }catch (ex:Exception){
                Log.e("LOI_SOAP_SANPHAMS",ex.toString())
            }
            return sanPhams
        }
        override fun onPostExecute(result: MutableList<SanPham>?) {
            super.onPostExecute(result)
            if (result!=null) {     /*nếu có kq query toàn bộ sản phẩm theo danh mục và theo khoảng zá từ fromPrice đến toPrice => cập nhật lại sourceSpinner*/
                MainActivityWebserviceAndBonus.LoadWebserviceSanPham.sourceSpinnerProductsWebserviceBonus!!.clear()  /* clear toàn bộ danh sách trong spinner */
                for (count in 0 until result.size)  /* sau đó dùng for loop để cập nhật lại, đưa từng sản phẩm vào sourceSpinner*/
                    MainActivityWebserviceAndBonus.LoadWebserviceSanPham.sourceSpinnerProductsWebserviceBonus!!.add(result[count].toString())
                MainActivityWebserviceAndBonus.LoadWebserviceSanPham.adapterSpinnerProductsWebserviceBonus!!.notifyDataSetChanged() /*cuối cùng cập nhật lại adapter*/
            }
            else MainActivityWebserviceAndBonus.LoadWebserviceSanPham.sourceSpinnerProductsWebserviceBonus!!.add("Errors")  /*nếu có lỗi thì thông báo trên sourceSpinner*/
        }
    }
    class   /*insert/update 1 sản phẩm*/                    SanPhamInsertUpdateTask():AsyncTask<String,Void,Boolean>(){
        override fun doInBackground(vararg params: String?): Boolean {
            try{
                var dataWebservice:SoapPrimitive=ReadUrlXmlJsonGson.SOAP.querySOAPw1(ConfigurationWebServiceSoap.PARAMETER_INSERT_UPDATE_SANPHAM,
                    params,ConfigurationWebServiceSoap.NAME_SPACE_SOAP,ConfigurationWebServiceSoap.METHOD_INSERT_UPDATE_SANPHAM,
                    ConfigurationWebServiceSoap.SERVER_URL_SOAP_SERVER,ConfigurationWebServiceSoap.SOAP_ACTION_INSERT_UPDATE_SANPHAM) as SoapPrimitive
                return dataWebservice.toString().toBoolean()
            }catch (ex:Exception){
                Log.e("LOI_SOAP_INSERT_UPDATE_SANPHAM",ex.toString())
            }
            return false
        }
        override fun onPostExecute(result: Boolean?) {
            super.onPostExecute(result)
            MainActivityWebserviceAndBonus.LoadWebserviceSanPham.txtProductWebserviceBonus!!.text=result.toString() /*xuất thông báo True hoặc False ra*/
        }
    }
    class   /*delete 1 sản phẩm*/                           SanPhamDeleteTask():AsyncTask<String,Void,Boolean>(){
        override fun doInBackground(vararg params: String?): Boolean {
            try {
                var dataWebservice:SoapPrimitive=ReadUrlXmlJsonGson.SOAP.querySOAPw1(ConfigurationWebServiceSoap.PARAMETER_DELETE_SANPHAM,params,
                    ConfigurationWebServiceSoap.NAME_SPACE_SOAP,ConfigurationWebServiceSoap.METHOD_DELETE_SANPHAM,
                    ConfigurationWebServiceSoap.SERVER_URL_SOAP_SERVER,ConfigurationWebServiceSoap.SOAP_ACTION_DELETE_SANPHAM) as SoapPrimitive
                return dataWebservice.toString().toBoolean()
            }catch (ex:Exception){
                Log.e("LOI_SOAP_DELETE_SANPHAM",ex.toString())
            }
            return false
        }
        override fun onPostExecute(result: Boolean?) {
            super.onPostExecute(result)
            MainActivityWebserviceAndBonus.LoadWebserviceSanPham.txtProductWebserviceBonus!!.text=result.toString() /*xuất thông báo True hoặc False ra*/
        }
    }

    /*______________________CÁCH 2: Tương tác Webservice Restful_______________________*/
    object ConfigurationWebServiceRestful{
        val SERVER_URL_JSON:String="http://192.168.${MainActivity.LoadGeneral.txtWebServiceIPaddress!!.text.toString()}/DanhmucSanPhamWebServiceDemo/api/"
        val SERVER_URL_SANPHAM:String="SanPham/";
        val SERVER_URL_DANHMUC:String="DanhMuc/";
        val SERVER_URL_CODEDM:String="?madm=";
        val SERVER_URL_FROM_PRICE:String="fromPrice=";
        val SERVER_URL_TO_PRICE:String="&toPrice=";

        val QUERY_ALL_DANHMUCS:String= SERVER_URL_JSON+ SERVER_URL_DANHMUC
        val PROPERTY_CODEDM:String="MaDm"
        val PROPERTY_NAMEDM:String="TenDm"
        fun returnDanhMuc(jsonObject: JSONObject):DanhMuc{
            var danhMuc:DanhMuc= DanhMuc()
            if (jsonObject.has(PROPERTY_CODEDM))    danhMuc.CodeDanhMuc=jsonObject.getString(PROPERTY_CODEDM).toInt()
            if (jsonObject.has(PROPERTY_NAMEDM))    danhMuc.NameDanhMuc=jsonObject.getString(PROPERTY_NAMEDM)
            return danhMuc
        }

        val QUERY_ALL_SANPHAMS:String= SERVER_URL_JSON+ SERVER_URL_SANPHAM
        val PROPERTY_CODESP:String="MaSp"
        val PROPERTY_NAMESP:String="TenSp"
        val PROPERTY_PRICESP:String="DonGia"
        fun urlRequestSanPham(params: Array<out String?>):String{   /*params[0]: madm, params[1]: fromPrice, params[2]: toPrice*/
            if (params?.get(2)!!.isEmpty())
                if (params[1]!!.isEmpty())     /*Nếu các khoảng zá đều rỗng => lấy hết sản phẩm (url+urlSanpham) theo mã dm*/
                    return if (params[0]!!.isEmpty())   QUERY_ALL_SANPHAMS      /* /DanhmucSanPhamWebServiceDemo/api/SanPham/ */
                    else    QUERY_ALL_SANPHAMS + SERVER_URL_CODEDM + params[0]  /* /DanhmucSanPhamWebServiceDemo/api/SanPham/codeDm*/
                else    /*Nếu toPrice rỗng => lấy hết sản phẩm có khoảng zá từ fromPrice đến Maximum theo mã dm*/
                    return if (params[0]!!.isEmpty())    /* /DanhmucSanPhamWebServiceDemo/api/SanPham/?fromPrice=...&toPrice=2147483647 */
                        QUERY_ALL_SANPHAMS + "?" + SERVER_URL_FROM_PRICE + params[1] + SERVER_URL_TO_PRICE+ Int.MAX_VALUE
                    else                        /* /DanhmucSanPhamWebServiceDemo/api/SanPham/?madm=...&fromPrice=...&toPrice=2147483647 */
                        QUERY_ALL_SANPHAMS + SERVER_URL_CODEDM + params[0] + "&" + SERVER_URL_FROM_PRICE + params[1] + SERVER_URL_TO_PRICE+ Int.MAX_VALUE
            else /*xử lý các Controller: SanPhams(int fromPrice, int toPrice) và SanPhams(int madm, int fromPrice, int toPrice)*/
                if (params[1]!!.isEmpty()) /*Nếu fromPrice rỗng => lấy hết sản phẩm từ 0 đến toPrice theo mã dm*/
                    return if (params[0]!!.isEmpty())      /* /DanhmucSanPhamWebServiceDemo/api/SanPham/?fromPrice=0&toPrice=... */
                        QUERY_ALL_SANPHAMS+"?"+SERVER_URL_FROM_PRICE+"0"+SERVER_URL_TO_PRICE+params[2]
                    else                            /* /DanhmucSanPhamWebServiceDemo/api/SanPham/?madm=...&fromPrice=0&toPrice=... */
                        QUERY_ALL_SANPHAMS+SERVER_URL_CODEDM+params[0]+"&"+SERVER_URL_FROM_PRICE+"0"+SERVER_URL_TO_PRICE+params[2]
                else    /*Nếu có dữ liệu khoảng zá muốn lấy => lấy hết sản phẩm từ fromPrice đến toPrice theo mã dm*/
                     return if (params[0]!!.isEmpty())      /* /DanhmucSanPhamWebServiceDemo/api/SanPham/?fromPrice=...&toPrice=... */
                        QUERY_ALL_SANPHAMS+"?"+SERVER_URL_FROM_PRICE+params[1]+SERVER_URL_TO_PRICE+params[2]
                    else                            /* /DanhmucSanPhamWebServiceDemo/api/SanPham/?madm=...&fromPrice=...&toPrice=... */
                        QUERY_ALL_SANPHAMS+SERVER_URL_CODEDM+params[0]+"&"+SERVER_URL_FROM_PRICE+params[1]+SERVER_URL_TO_PRICE+params[2]
        }
        fun returnSanPham(jsonObject:JSONObject):SanPham{   /*từ jsonObject return về 1 sản phẩm*/
            var sanPham:SanPham= SanPham()
            if (jsonObject.has(PROPERTY_CODESP))    sanPham.Codesp=jsonObject.getString(PROPERTY_CODESP).toInt()
            if (jsonObject.has(PROPERTY_NAMESP))    sanPham.Namesp=jsonObject.getString(PROPERTY_NAMESP)
            if (jsonObject.has(PROPERTY_PRICESP))   sanPham.Price=jsonObject.getString(PROPERTY_PRICESP).toInt()
            if (jsonObject.has(PROPERTY_CODEDM))    sanPham.Codedm=jsonObject.getString(PROPERTY_CODEDM).toInt()
            return sanPham
        }

        val SERVER_URL_NAMEDM:String="&namedm="

        val SERVER_URL_CODESP:String="?masp=";
        val SERVER_URL_NAMESP:String="&tensp="
        val SERVER_URL_PRICE:String="&price="
    }

    class   /*Query 1 danh mục*/                            DanhMucDetailRestfulTask():AsyncTask<String,Void, DanhMuc>(){
        override fun doInBackground(vararg params: String?): DanhMuc? {
            try{
                var jsonObject:JSONObject= JSONObject(ReadUrlXmlJsonGson.U_R_L.urlXmlOrJson(
                    ConfigurationWebServiceRestful.QUERY_ALL_DANHMUCS+params[0],"GET","json").toString())
                return ConfigurationWebServiceRestful.returnDanhMuc(jsonObject)
            }catch (ex:Exception){
                Log.e("LOI_SOAP_DANHMUCDETAIL",ex.toString())
            }
            return null
        }
        override fun onPostExecute(result: DanhMuc?) {
            super.onPostExecute(result) /*nếu có kết quả danh mục thì đưa thông tin danh mục lên txtCategoryWebserviceBonus, còn k thì thông báo lỗi Error*/
            if (result!=null) MainActivityWebserviceAndBonus.LoadWebserviceDanhMuc.txtCategoryWebserviceBonus!!.text=result.toString()
            else MainActivityWebserviceAndBonus.LoadWebserviceDanhMuc.txtCategoryWebserviceBonus!!.text="Error"
        }
    }
    class   /*Query toàn bộ danh mục*/                      DanhMucsRestfulTask():AsyncTask<Void,Void,MutableList<DanhMuc>>(){
        override fun doInBackground(vararg params: Void?): MutableList<DanhMuc>? {
            var danhMucs:MutableList<DanhMuc> = mutableListOf()
            try {
                var jsonArray:JSONArray= JSONArray(ReadUrlXmlJsonGson.U_R_L.urlXmlOrJson(
                    ConfigurationWebServiceRestful.QUERY_ALL_DANHMUCS,"GET","json").toString())
                for (count in 0 until jsonArray.length()){
                    var jsonObject:JSONObject=jsonArray.getJSONObject(count)
                    danhMucs!!.add(ConfigurationWebServiceRestful.returnDanhMuc(jsonObject))
                }
            }catch (ex:Exception){
                Log.e("LOI_SOAP_DANHMUCS",ex.toString())
            }
            return danhMucs
        }
        override fun onPostExecute(result: MutableList<DanhMuc>?) {
            super.onPostExecute(result)
            if (result!=null) { /*nếu có kq query toàn bộ danh mục => cập nhật lại sourceSpinner*/
                MainActivityWebserviceAndBonus.LoadWebserviceDanhMuc.sourceSpinnerCategoriesWebserviceBonus!!.clear()   /* clear toàn bộ danh sách trong spinner */
                for (count in 0 until result.size)  /* sau đó dùng for loop để cập nhật lại, đưa từng danh mục vào sourceSpinner*/
                    MainActivityWebserviceAndBonus.LoadWebserviceDanhMuc.sourceSpinnerCategoriesWebserviceBonus!!.add(result[count].toString())
                MainActivityWebserviceAndBonus.LoadWebserviceDanhMuc.adapterSpinnerCategoriesWebserviceBonus!!.notifyDataSetChanged()   /*cuối cùng cập nhật lại adapter*/
            }
            else MainActivityWebserviceAndBonus.LoadWebserviceDanhMuc.sourceSpinnerCategoriesWebserviceBonus!!.add("Errors") /*nếu có lỗi thì thông báo trên sourceSpinner*/
        }
    }
    class   /*insert/update 1 danh mục*/                    DanhMucInsertUpdateResfulTask():AsyncTask<String,Void, Boolean>(){
        override fun doInBackground(vararg params: String?): Boolean {
            try {
                return ReadUrlXmlJsonGson.U_R_L.urlXmlOrJson(ConfigurationWebServiceRestful.QUERY_ALL_DANHMUCS +
                        ConfigurationWebServiceRestful.SERVER_URL_CODEDM+params[0]+                     /*.../api/DanhMuc/?madm=... */
                        ConfigurationWebServiceRestful.SERVER_URL_NAMEDM+URLEncoder.encode(params[1]),  /*.../api/DanhMuc/?masp=...&namedm=... */
                    "POST","json").toString().contains("true")  /*đưa chuỗi lên server cần mã hóa bằng cách: URLEncoder.encode*/
            }catch (ex:Exception){  /*chuỗi trả về chỉ có là chuỗi "true" hoặc chuỗi "false" => dùng contains để kiểm tra xem chuỗi đó có trả về true hay k*/
                Log.e("LOI_SOAP_INSERT_UPDATE_DANHMUC",ex.toString())
            }
            return false
        }
        override fun onPostExecute(result: Boolean?) {
            super.onPostExecute(result)
            MainActivityWebserviceAndBonus.LoadWebserviceDanhMuc.txtCategoryWebserviceBonus!!.text=result.toString()    /*hiển thị kq T or F lên textview*/
        }
    }
    class   /*delete 1 danh mục*/                           DanhMucDeleteResfulTask():AsyncTask<String,Void,Boolean>(){
        override fun doInBackground(vararg params: String?): Boolean {
            try {
                return ReadUrlXmlJsonGson.U_R_L.urlXmlOrJson(ConfigurationWebServiceRestful.QUERY_ALL_DANHMUCS+
                        ConfigurationWebServiceRestful.SERVER_URL_CODEDM+params[0], "DELETE","json").toString().contains("true")
            }catch (ex:Exception){
                Log.e("LOI_SOAP_DELETE_SANPHAM",ex.toString())
            }
            return false
        }
        override fun onPostExecute(result: Boolean?) {
            super.onPostExecute(result)
            MainActivityWebserviceAndBonus.LoadWebserviceDanhMuc.txtCategoryWebserviceBonus!!.text=result.toString()    /*hiển thị kq T or F lên textview*/
        }
    }

    class   /*Query 1 sản phẩm*/                            SanPhamDetailRestfulTask():AsyncTask<String,Void,SanPham>(){
        override fun doInBackground(vararg params: String?): SanPham? {
            try{    /*params đưa vào chỉ là 1 mảng có 1 phần tử, phần tử này là mã danh mục => /DanhmucSanPhamWebServiceDemo/api/SanPham/<madm> */
                var jsonObject:JSONObject=JSONObject(ReadUrlXmlJsonGson.U_R_L.urlXmlOrJson(
                    ConfigurationWebServiceRestful.QUERY_ALL_SANPHAMS+params[0],"GET","json").toString())
                return ConfigurationWebServiceRestful.returnSanPham(jsonObject)
            }catch (ex:Exception){
                Log.e("LOI_SOAP_SANPHAMDETAIL",ex.toString())
            }
            return null
        }
        override fun onPostExecute(result: SanPham?) {
            super.onPostExecute(result) /*nếu có kết quả sản phẩm thì đưa thông tin sản phẩm lên txtProductWebserviceBonus, còn k thì thông báo lỗi Error*/
            if (result!=null) MainActivityWebserviceAndBonus.LoadWebserviceSanPham.txtProductWebserviceBonus!!.text=result.toString()
            else MainActivityWebserviceAndBonus.LoadWebserviceSanPham.txtProductWebserviceBonus!!.text="Errors!"
        }
    }
    class   /*Query toàn bộ sản phẩm theo mã danh mục*/     SanPhamsRestfulTask():AsyncTask<String,Void,MutableList<SanPham>>(){
        override fun doInBackground(vararg params: String?): MutableList<SanPham>? {
            var sanPhams:MutableList<SanPham> = mutableListOf()
            try {   /*params đưa vào sẽ là 1 mảng 3 phần tử bao gồm: madm, fromPrice, toPrice. Phần xử lý params để lấy url đc thực hiện tại urlRequestSanPham*/
                var jsonArray:JSONArray=JSONArray(ReadUrlXmlJsonGson.U_R_L.urlXmlOrJson(
                    ConfigurationWebServiceRestful.urlRequestSanPham(params),"GET","json").toString())
                for (count in 0 until jsonArray.length())
                    sanPhams!!.add(ConfigurationWebServiceRestful.returnSanPham(jsonArray.getJSONObject(count)))
            }catch (ex:Exception){
                Log.e("LOI_SOAP_SANPHAMS",ex.toString())
            }
            return sanPhams
        }
        override fun onPostExecute(result: MutableList<SanPham>?) {
            super.onPostExecute(result)
            if (result!=null) {     /*nếu có kq query toàn bộ sản phẩm theo danh mục và theo khoảng zá từ fromPrice đến toPrice => cập nhật lại sourceSpinner*/
                MainActivityWebserviceAndBonus.LoadWebserviceSanPham.sourceSpinnerProductsWebserviceBonus!!.clear() /* clear toàn bộ danh sách trong spinner */
                for (count in 0 until result.size)  /* sau đó dùng for loop để cập nhật lại, đưa từng sản phẩm vào sourceSpinner*/
                    MainActivityWebserviceAndBonus.LoadWebserviceSanPham.sourceSpinnerProductsWebserviceBonus!!.add(result[count].toString())
                MainActivityWebserviceAndBonus.LoadWebserviceSanPham.adapterSpinnerProductsWebserviceBonus!!.notifyDataSetChanged() /*cuối cùng cập nhật lại adapter*/
            }
            else MainActivityWebserviceAndBonus.LoadWebserviceSanPham.sourceSpinnerProductsWebserviceBonus!!.add("Errors")  /*nếu có lỗi thì thông báo trên sourceSpinner*/
        }
    }
    class   /*insert/update 1 sản phẩm*/                    SanPhamInsertUpdateResfulTask():AsyncTask<String,Void,Boolean>(){
        override fun doInBackground(vararg params: String?): Boolean {
            try{
                return ReadUrlXmlJsonGson.U_R_L.urlXmlOrJson(ConfigurationWebServiceRestful.QUERY_ALL_SANPHAMS+ /* .../api/SanPham/ */
                        ConfigurationWebServiceRestful.SERVER_URL_CODESP+params[0]+     /*.../api/SanPham/?masp=... */
                        ConfigurationWebServiceRestful.SERVER_URL_NAMESP+params[1]+     /*.../api/SanPham/?masp=...&tensp=... */
                        ConfigurationWebServiceRestful.SERVER_URL_PRICE+params[2]+      /*.../api/SanPham/?masp=...&tensp=...&price=... */
                        "&"+ConfigurationWebServiceRestful.SERVER_URL_CODEDM.substring( /*.../api/SanPham/?masp=...&tensp=...&price=...&madm=... */
                                ConfigurationWebServiceRestful.SERVER_URL_CODEDM.indexOf("?")+1)+params[3],
                        "POST","json").toString().contains("true")
            }catch (ex:Exception){
                Log.e("LOI_SOAP_INSERT_UPDATE_SANPHAM",ex.toString())
            }
            return false
        }
        override fun onPostExecute(result: Boolean?) {
            super.onPostExecute(result)
            MainActivityWebserviceAndBonus.LoadWebserviceSanPham.txtProductWebserviceBonus!!.text=result.toString() /*xuất thông báo True hoặc False ra*/
        }
    }
    class   /*delete 1 sản phẩm*/                           SanPhamDeleteResfulTask():AsyncTask<String,Void,Boolean>(){
        override fun doInBackground(vararg params: String?): Boolean {
            try {
                return ReadUrlXmlJsonGson.U_R_L.urlXmlOrJson(ConfigurationWebServiceRestful.QUERY_ALL_SANPHAMS+
                        ConfigurationWebServiceRestful.SERVER_URL_CODESP+params[0], "DELETE","json").toString().contains("true")
            }catch (ex:Exception){
                Log.e("LOI_SOAP_DELETE_SANPHAM",ex.toString())
            }
            return false
        }
        override fun onPostExecute(result: Boolean?) {
            super.onPostExecute(result)
            MainActivityWebserviceAndBonus.LoadWebserviceSanPham.txtProductWebserviceBonus!!.text=result.toString() /*xuất thông báo True hoặc False ra*/
        }
    }

    /*______________________BÀI: Tương tác Webservice SOAP xml (tỷ zá hối đoái ngân hàng vietcombank)_______________________*/
    object ConfigurationWebServiceVietcombank{
        val SERVER_URL_XML:String="https://portal.vietcombank.com.vn/Usercontrols/TVPortal.TyGia/pXML.aspx"
        val PROPERTY_KEY:Array<String?> = arrayOf("Content-Type")
        val PROPERTY_VALUE:Array<String?> = arrayOf("application/x-www-form-urlencoded")
        val EXRATELIST:String="ExrateList"
        val DATETIME:String="DateTime"
        val EXRATE:String="Exrate"
        val SOURCE:String="Source"
        val ATTRIBUTE_CURRENCY_CODE:String="CurrencyCode"
        val ATTRIBUTE_CURRENCY_NAME:String="CurrencyName"
        val ATTRIBUTE_BUY:String="Buy"
        val ATTRIBUTE_TRANSFER:String="Transfer"
        val ATTRIBUTE_SELL:String="Sell"
    }
    class TyZaVietcombankTask():AsyncTask<Void,Void,ExrateList>(){
        override fun doInBackground(vararg params: Void?): ExrateList? {
            var exrateList:ExrateList= ExrateList()
            try {
                var nodeList: NodeList? = ReadUrlXmlJsonGson.SOAP.querySOAPw2(ConfigurationWebServiceVietcombank.SERVER_URL_XML,"GET",
                    ConfigurationWebServiceVietcombank.PROPERTY_KEY,ConfigurationWebServiceVietcombank.PROPERTY_VALUE,ConfigurationWebServiceVietcombank.EXRATELIST)
                val element:Element= nodeList!!.item(0) as Element  /*nodeList này chỉ có 1 phần tử là ExrateList => do đó cần .item(0) để lấy ra*/
                var dateTime:String=element.getElementsByTagName(ConfigurationWebServiceVietcombank.DATETIME).item(0).textContent   /*lấy datetime ra*/
                var exrates:MutableList<Exrate> = mutableListOf()   /*lấy element nhỏ hơn trong element lớn, element nhỏ này .item(count) để lấy từng Exrate ra*/
                for (count in 0 until element.getElementsByTagName(ConfigurationWebServiceVietcombank.EXRATE).length){      /*count từ 0 cho đến hết Exrate */
                    var exrateNode:Node=element.getElementsByTagName(ConfigurationWebServiceVietcombank.EXRATE).item(count) /*lấy node từ count của Exrate ra*/
                    var currencyCode:String=exrateNode.attributes.getNamedItem(ConfigurationWebServiceVietcombank.ATTRIBUTE_CURRENCY_CODE).nodeValue/*lấy code*/
                    var currencyName:String=exrateNode.attributes.getNamedItem(ConfigurationWebServiceVietcombank.ATTRIBUTE_CURRENCY_NAME).nodeValue/*lấy name*/
                    var buy:String=exrateNode.attributes.getNamedItem(ConfigurationWebServiceVietcombank.ATTRIBUTE_BUY).nodeValue                   /*lấy buy*/
                    var transfer:String=exrateNode.attributes.getNamedItem(ConfigurationWebServiceVietcombank.ATTRIBUTE_TRANSFER).nodeValue         /*lấy transfer*/
                    var sell:String=exrateNode.attributes.getNamedItem(ConfigurationWebServiceVietcombank.ATTRIBUTE_SELL).nodeValue                 /*lấy sell*/
                    exrates.add(Exrate(currencyCode,currencyName,buy,transfer,sell))    /*add exrate này vào list exrates*/
                }
                var source:String=element.getElementsByTagName(ConfigurationWebServiceVietcombank.SOURCE).item(0).textContent       /*lấy source ra*/
                exrateList.DateTime=dateTime    /*set datetime cho exrateList*/
                exrateList.Exrates=exrates      /*set list exrates cho exrateList */
                exrateList.Source=source        /*set source cho exrateList*/
            }catch (ex:Exception){
                Log.e("ERROR_Vietcombank",ex.toString())
            }
            return exrateList
        }
        @SuppressLint("SetTextI18n")
        override fun onPostExecute(result: ExrateList?) {
            super.onPostExecute(result)
            if (result!=null){
                MainActivityWebserviceAndBonus.LoadWebserviceVietcombank.txtSourceVietcombank!!.text=result.Source
                MainActivityWebserviceAndBonus.LoadWebserviceVietcombank.txtDateTimeVietcombank!!.text="Cập nhật vào lúc: ${result.DateTime}"
                MainActivityWebserviceAndBonus.LoadWebserviceVietcombank.sourceVietcombank!!.clear()
                for (count in 0 until result.Exrates!!.size)
                    MainActivityWebserviceAndBonus.LoadWebserviceVietcombank.sourceVietcombank!!.add(result.Exrates!![count].toString())
                MainActivityWebserviceAndBonus.LoadWebserviceVietcombank.adapterVietcombank!!.notifyDataSetChanged()
            }
        }
    }
}