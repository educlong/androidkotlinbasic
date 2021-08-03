package elong.androidApp.services.chapter7_9_WebserviceBonus

import android.util.Log
import org.ksoap2.SoapEnvelope
import org.ksoap2.serialization.*
import org.ksoap2.transport.HttpTransportSE
import org.w3c.dom.Document
import org.w3c.dom.NodeList
import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL
import javax.xml.parsers.DocumentBuilderFactory

class ReadUrlXmlJsonGson {
    object U_R_L{
        var httpURLConnection:HttpURLConnection?=null
        var url: URL?=null
        fun urlXmlOrJson(urlLink:String,requestMethod:String,xmlOrJson:String):StringBuilder{    /*inputStreamReader: để đọc data (mở luồng đọc dữ liệu từ url)*/
            var inputStreamReader= InputStreamReader(changeLinkToXmlOrJson(urlLink,requestMethod,xmlOrJson).inputStream,"UTF-8")
            var bufferedReader: BufferedReader = BufferedReader(inputStreamReader)/*đọc file,lấy data từ internet->ko dùng nối chuỗi dấu +,mà phải thông qua*/
            var stringBuilder: StringBuilder = StringBuilder()              /*BufferedReader đọc. Sau khi lấy đc list chuỗi, ta sẽ đọc liên tục, trả về chuỗi*/
            var line:String? = bufferedReader.readLine()     /*lệnh readLine để đọc từng dòng và trả về StringBuilder*/
            while (line!=null){                              /*đọc khi nào hết (=null) thì ko đọc nữa*/
                stringBuilder.append(line)
                line=bufferedReader.readLine()          /*đọc tiếp dòng kế tiếp. Kết thúc vòng while ta sẽ lấy đc 1 build trong này, như vậy ta có*/
            }   /*Định dạng mở đống [] thì sẽ trả về 1 JSONArray. Còn nếu định dạng mở đống {} -> trả về JSONObject*/
            return stringBuilder
        }
        fun urlGSON(urlLink:String):InputStreamReader{
            var url:URL = URL(urlLink)
            var inputStreamReader:InputStreamReader= InputStreamReader(url.openStream(),"UTF-8")
            return inputStreamReader
        }

        fun changeLinkToXmlOrJson(urlString:String, requestMethod:String,xmlOrJson:String):HttpURLConnection{ /*Đông Á chặn ko cho người dùng lấy link bằng các dấu \.*/
            url = URL(urlString) /*Vậy,cần loại bỏ hết các dấu \. Đầu tiên:lấy link server, mở connection & gọi method GET (3lệnh này đã lấy từ trước,zờ gọi lại)*/
            httpURLConnection = url!!.openConnection() as HttpURLConnection         /*mở connection. Khai báo 1 InputStreamReader rồi mới đưa vào BufferedReader*/
            httpURLConnection!!.requestMethod=requestMethod                         /*Sau khi mở connection, -> lấy phương thức GET*/
            /*Lệnh dưới sử dụng HttpRequester của FireFox. Sau đó copy link server trên vào URL của HttpRequester -> nhấn GET */
            httpURLConnection!!.setRequestProperty("Content-type", "application/$xmlOrJson; charset=utf-8")   /*-> Copy thông tin tại mục Content-type vào lệnh này*/
            httpURLConnection!!.setRequestProperty("User-Agent","Mozilla/5.0 ( compatible ) ")          /*loại bỏ các phương thức mà Đông Á chặn, ko cho lấy link*/
            httpURLConnection!!.setRequestProperty("Accept", "*/*")  /*lệnh này ra lệnh chỉ lấy dấu / trong link img*/
            return httpURLConnection as HttpURLConnection
        }
    }
    object SOAP{
        //query SOAP (way1)
        fun querySOAPw1(paramServer: Array<String?>?, paramClient: Array<out Any?>?, namespace:String, method:String, server:String, soapAction:String): Any? {
            try {
                var request: SoapObject = SoapObject(namespace,method)      /*-> truyền namespace và method vào và đưa đối tượng lên server*/
                if (paramClient!=null || paramServer!=null)
                    for (count in paramClient!!.indices)
                        request.addProperty(paramServer?.get(count),paramClient[count])
                var envelope= SoapSerializationEnvelope(SoapEnvelope.VER11) /*tạo Envelope*/
                envelope.dotNet=true                                        /*VER11 và .dotNet=true vì cái này của Microsoft.*/
                envelope.setOutputSoapObject(request)                       /*gán request cho envelope.  */
                var marshalFloat:MarshalFloat=MarshalFloat()    /*trong các data truyền qua lại zữa client và server,nếu nó có kiểu số thực thì dùng MarshalFloat, kể cả double*/
                var marshalDate:MarshalDate= MarshalDate()      /*nếu có truyền số thực mà ngày tháng năm -> dùng marshalDate*/
                marshalFloat.register(envelope)
                marshalDate.register(envelope)
                var httpTransportSE= HttpTransportSE(server)   /*tương tác trên server thông qua httpTransport (tạo loại kết nối (đường dẫn) lên server)*/
                /*gọi lệnh thực hiện hàm(hàm này đã thực sự xử lý trên Server rồi). Lệnh dưới chạy lâu I',vì nó phải gửi lên server,server xử lý & nó sẽ lấy*/
                httpTransportSE.call(soapAction,envelope)      /* kết quả trả về-> 3 công đoạn chờ (lấy kết quả sau khi xử lý):*/
                return envelope.response    /*dữ liệu đơn=>trả về SoapPrimitive. Kiểu đốitượng nhiều thôngsố hay List =>trả SoapObject*/
            }catch (ex:Exception){
                Log.e("LOI_KSOAP_API_OBJECT_DATA",ex.toString())
            }
            return null
        }
        //query SOAP (way2) -> urlLink bị lỗi
        fun querySOAPw2(urlLink:String,method:String, propertyKey:Array<String?>?, propertyValue:Array<String?>?, tagName:String): NodeList? {
            try {
                var url: URL = URL(urlLink)
                var httpURLConnection: HttpURLConnection = url.openConnection() as HttpURLConnection    /*mở kết nối lên server để lấy data về*/
                httpURLConnection.requestMethod = method
                if (propertyKey != null || propertyValue != null)
                    for (count in propertyKey!!.indices)
                        httpURLConnection.setRequestProperty(propertyKey[count], propertyValue?.get(count))
                return DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(httpURLConnection.inputStream).getElementsByTagName(tagName)
            }catch (ex:Exception){  /*httpURLConnection.inputStream chính là response mà server trả về, kq là 1 chuỗi có dạng xml*/
                Log.e("LOI_KSOAP_API_OBJECT_DATA",ex.toString())
            }
            return null
        }
    }
}