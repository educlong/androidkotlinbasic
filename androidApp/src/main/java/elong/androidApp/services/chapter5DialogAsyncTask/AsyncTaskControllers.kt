package elong.androidApp.services.chapter5DialogAsyncTask

import android.app.Activity
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.AsyncTask
import android.os.SystemClock
import android.util.Log
import android.widget.*
import elong.androidApp.MainActivity
import elong.androidApp.MainActivityChapter4567
import java.io.InputStream
import java.net.URL
import kotlin.random.Random

class AsyncTaskControllers {
    class ButtonAsyncTask(var activity:Activity) : AsyncTask<Int, Int, Void>(){                /*khi nào dữ liệu lớn thì tách lớp AsyncTask này ra ngoài*/
        /*ĐSố 1 (Input) số drawNumberOfButtonAsyncTask        : vẽ bao nhiêu buttton  -> kiểu Integer (tại hàm doInBackground)
         *ĐSố 2 (xlý,hiển thị cập nhật zaodiện,chạy PHẦN TRĂM): cập nhật time thực    -> kiểu Integer (tại hàm onProgressUpdate)
         *ĐSố 3 (kquả trả về sau khi thực hiện tiến trình này): ta ko quan tâm -> ko dùng -> để Void  (tại hàm onPostExecute)*/
        override fun doInBackground(vararg params: Int?): Void? {
            buttonAsyncTaskDoInBackgroundLayZaTriInput(params)
            return null
        }
        override fun onPreExecute() {
            super.onPreExecute()
            buttonAsyncTaskOnPreExecuteTuDongThucHienKhiTienTrinhBatDau()
        }
        override fun onProgressUpdate(vararg values: Int?) {
            super.onProgressUpdate(*values)
            buttonAsyncTaskOnProgressUpdateVeZaoDienThoiGianThuc(values)
        }
        override fun onPostExecute(result: Void?) {
            super.onPostExecute(result)
            buttonAsyncTaskOnPostExecuteTuDongThucHienKhiTienTrinhKetThuc(result)
        }
        var asyncTask=MainActivityChapter4567.DrawButton.asyncTaskDrawButton
        private fun     /*HÀM LẤY ZÁTRỊ INPUT-> ở đây input chỉ có 1 fầntử là drawN...*/buttonAsyncTaskDoInBackgroundLayZaTriInput(params: Array<out Int?>) {
            var drawNumberOfButtonAsyncTask: Int? =params[0]          /*ta chỉ truyền vào 1 đối số là drawNumberOfButtonAsyncTask nên parameterList này chỉ có 1 phầntử*/
            var rdDrawButtonAsyncTask:Random=Random   /*đốisố truyền vào là 1 parameterList->truyền mấy đốisố cũg ok. Input chỉ có 1 phần tử nên truyền vào là ptử số 0*/
            for (count in 0 until drawNumberOfButtonAsyncTask!!){                        /*random: vẽ ngẫu nhiên*/
                var percentAsyncTask:Int=count*100/drawNumberOfButtonAsyncTask      /*vẽ đến đâu thì cột phần trăm đến đó*/
                var valueAsyncTask:Int=rdDrawButtonAsyncTask.nextInt(500)     /*lấy zá trị ngẫu nhiên trong đoạn 500*/
                publishProgress(percentAsyncTask,valueAsyncTask)                    /*2 záTrị muốn đưa qua hàm onProgressUpdate*/
                SystemClock.sleep(500)  /*để nhìn thấy rõ hơn ta có thể delay từng bước vẽ (zá trị tính bằng ms)*/
            }   /*mặc dù doInBackground có percentAsyncTask & valueAsyncTask nhưng nó ko đc phép cập nhật zao diện ở đây*/
        }   /*Muốn cập nhật zao diện thì phải đẩy tất cả các zá trị trong nó sang hàm onProgressUpdate. Muốn đẩy zá trị thì phải thông qua lệnh publishProgress()*/
        private fun     /*HÀM TỰ ĐỘNG THỰC HIỆN KHI TIẾN TRÌNH BẮT ĐẦU*/                buttonAsyncTaskOnPreExecuteTuDongThucHienKhiTienTrinhBatDau() {
            asyncTask?.LayoutButtonAsyncTask!!.removeAllViews()        /*xóa tất cả control đi (xóa dữ liệu cũ đi)*/
            asyncTask?.Progress =0        /*cho chạy phần trăm loading bắt đầu từ 0%*/
            asyncTask?.Percent ="${0}%"
        }
        private fun     /*HÀM VẼ ZAO DIỆN*/                                             buttonAsyncTaskOnProgressUpdateVeZaoDienThoiGianThuc(values: Array<out Int?>) {
            var percentAsyncTask: Int? =values[0]   /*tại doInBackground truyền 2 đối số nên values = 2. lấy ra 2 đối số từ doInBackground gửi qua để vẽ zao diện*/
            var valueAsyncTask:Int?=values[1]       /*trong doInBackground truyền thứ tự ra sao thì lấy thứ tự y xì*/
            asyncTask?.Progress = percentAsyncTask!!     /*đưa phần trăm lên zao diện*/
            asyncTask?.Percent ="$percentAsyncTask%" /*sau đó đưa zátrị lên zao diện, câu lệnh dưới tạo ra 1 layout,đối số 1:width;đối số 2:height của layout đó*/
            var paramsAsyncTask:LinearLayout.LayoutParams=LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.WRAP_CONTENT)
            var btnAfterDrawAsyncTask:Button=Button(this.activity) /*tạo 1 button, và vẽ lên zao diện bằng time thực -> đưa button này lên layout*/
            btnAfterDrawAsyncTask.layoutParams=paramsAsyncTask     /*cho phép đưa button này lên layout vừa mới tạo, layout này là layout chứa button*/
            btnAfterDrawAsyncTask!!.text=valueAsyncTask.toString() /*đặt tên cho button(biến value kiểu int->có tostring), layout layoutButtonAsyncTask chứa layout này*/
            asyncTask?.LayoutButtonAsyncTask?.addView(btnAfterDrawAsyncTask) /*add button lên layout*/
        }
        private fun     /*HÀM TỰ ĐỘNG THỰC HIỆN KHI TIẾN TRÌNH KẾT THÚC*/               buttonAsyncTaskOnPostExecuteTuDongThucHienKhiTienTrinhKetThuc(result: Void?){
            asyncTask?.Progress = 100        /*khi tiến trình kết thúc thì phần trăm loading bằng 100%*/
            asyncTask?.Percent ="${100}%"
        }
    }

    class LoadImageAsyncTask(var activity: Activity) : AsyncTask<String,Void,Bitmap>(){
        /* Truyền vào 1 đường link -> đối số 1 kiểu chuỗi
         * Tải hình về từ Internet nên không biết quá trình thực thi như thế nào! -> đối số 2 kiểu Void
         * Kết quả trả về là 1 cái hình -> đối số 3 kiểu Bitmap */
        override fun doInBackground(vararg params: String?): Bitmap? {
            return loadImageAsyncTaskDoInBackgroundLayZaTriInput(params)
        }
        override fun onPreExecute() {
            super.onPreExecute()
            loadImageAsyncTaskOnPreExecuteTuDongThucHienKhiTienTrinhBatDau()
        }
        override fun onProgressUpdate(vararg values: Void?) {
            super.onProgressUpdate(*values)
            loadImageAsyncTaskOnProgressUpdateVeZaoDienThoiGianThuc(values)
        }
        override fun onPostExecute(result: Bitmap?) {
            super.onPostExecute(result)     /*KẾT THÚC TẢI -> kquả ra 1 cái hình*/
            loadImageAsyncTaskOnPostExecuteTuDongThucHienKhiTienTrinhKetThuc(result)
        }
        var imgLoadIMGAsyncTask=MainActivityChapter4567.LoadImgAndShowDialog.imgLoadIMGAsyncTask
        var dialogAsyncTask=MainActivityChapter4567.LoadImgAndShowDialog.dialogAsyncTask       /*trường hợp tải hình dùng ProgressDialog vì ko biết khi nào tải xong*/
        private fun     /*HÀM LẤY ZÁTRỊ INPUT-> ở đây input chỉ có 1 fầntử là linkI...*/loadImageAsyncTaskDoInBackgroundLayZaTriInput(params:Array<out String?>):Bitmap?{
            try {       /*kết nối internet phải có đa tiến trình -> bắt buộc phải có try- catch*/
                var linkInternetAsyncTask: String? =params[0]   /*search hàm để lấy hình trên internet về: gõ từ khóa "get image from internet android" -> hàm dưới*/
                return BitmapFactory.decodeStream(URL(linkInternetAsyncTask).content as InputStream)    /*return về 1 kiểu Bitmap*/
            }catch (ex:Exception){
                Log.e("Loi_Da_TienTrinh_Connecting_Internet",ex.toString())
            }
            return null
        }
        private fun     /*HÀM TỰ ĐỘNG THỰC HIỆN KHI TIẾN TRÌNH BẮT ĐẦU ->show announce*/loadImageAsyncTaskOnPreExecuteTuDongThucHienKhiTienTrinhBatDau() {
            dialogAsyncTask!!.show()    /*Bắt đầu tải thì hiển thị câu thông báo lên*/
        }
        private fun     /*HÀM VẼ ZAO DIỆN (ko quan tâm vì đối sô truyền vào là Void)*/  loadImageAsyncTaskOnProgressUpdateVeZaoDienThoiGianThuc(values:Array<out Void?>){}
        private fun     /*HÀM TỰ ĐỘNG THỰC HIỆN KHI TIẾN TRÌNH KẾT THÚC -> kq ra 1 img*/loadImageAsyncTaskOnPostExecuteTuDongThucHienKhiTienTrinhKetThuc(result:Bitmap?){
            imgLoadIMGAsyncTask!!.setImageBitmap(result)        /*KẾT THÚC TẢI -> kquả sau khi tải xong là ra 1 cái hình*/
            dialogAsyncTask!!.dismiss()/*Ở đây, thường dùng dismiss*/ /*sau khi hiển thị hình phải đóng cửa số đó lại. ở đây có 2 hàm có thể sử dụng đc: dismiss và cancel*/
        }   /*dismiss có thể tái sử dụng lại vòng đời của nó (tức là nó ẩn đi thôi nhưng vẫn dùng đc. Cancel là tắt đi,muốn dùng phải khởi tạo lại (cancle mạnh hơn)*/
    }

    class LoadAlbumsAsyncTask(var activity:Activity): AsyncTask<String,Void,Bitmap>(){
        override fun doInBackground(vararg params: String?): Bitmap? {
            return loadAlbumsAsyncTaskDoInBackgroundLayZaTriInput(params)
        }
        override fun onPreExecute() {
            super.onPreExecute()
            loadAlbumsAsyncTaskOnPreExecuteTuDongThucHienKhiTienTrinhBatDau()
        }
        override fun onProgressUpdate(vararg values: Void?) {
            super.onProgressUpdate(*values)
            loadAlbumsAsyncTaskOnProgressUpdateVeZaoDienThoiGianThuc(values)
        }
        override fun onPostExecute(result: Bitmap?) {
            super.onPostExecute(result)     /*KẾT THÚC TẢI -> kquả ra 1 cái hình*/
            loadAlbumsAsyncTaskOnPostExecuteTuDongThucHienKhiTienTrinhKetThuc(result)
        }
        var imgAlbumAsyncTask=MainActivityChapter4567.LinkAlbums.imgAlbumAsyncTask
        var dialogAsyncTaskAlbum=MainActivityChapter4567.LinkAlbums.dialogAsyncTaskAlbum
        private fun     /*HÀM LẤY ZÁTRỊ INPUT-> ở đây input chỉ có 1 fầntử là linkA...*/loadAlbumsAsyncTaskDoInBackgroundLayZaTriInput(params:Array<out String?>):Bitmap?{
            try {       /*kết nối internet trong AsyncTask bắt buộc phải có try-catch*/
                var linkAlbumAsyncTask:String?=params[0]
                return BitmapFactory.decodeStream(URL(linkAlbumAsyncTask).content as InputStream)/*bitmapAlbumAsyncTask này phải là những hình có dung lượng nhỏ (<1Mb)*/
            }catch (ex:Exception){
                Log.e("Lỗi_Chi_Tiết_Đa_Tiến_Trình_Project_Album_AsyncTask",ex.toString())
            }
            return null
        }
        private fun     /*HÀM TỰ ĐỘNG THỰC HIỆN KHI TIẾN TRÌNH BẮT ĐẦU ->show announce*/loadAlbumsAsyncTaskOnPreExecuteTuDongThucHienKhiTienTrinhBatDau() {
            dialogAsyncTaskAlbum!!.show()             /*hiển thị cửa sổ thông báo lên khi chưa tải đc hình*/
        }
        private fun     /*HÀM VẼ ZAO DIỆN (ko quan tâm vì đối sô truyền vào là Void)*/  loadAlbumsAsyncTaskOnProgressUpdateVeZaoDienThoiGianThuc(values: Array<out Void?>) {}
        private fun     /*HÀM TỰ ĐỘNG THỰC HIỆN KHI TIẾN TRÌNH KẾT THÚC -> kq ra 1 img*/loadAlbumsAsyncTaskOnPostExecuteTuDongThucHienKhiTienTrinhKetThuc(result: Bitmap?) {
            imgAlbumAsyncTask!!.setImageBitmap(result)
            dialogAsyncTaskAlbum!!.dismiss()
        }

    }
}