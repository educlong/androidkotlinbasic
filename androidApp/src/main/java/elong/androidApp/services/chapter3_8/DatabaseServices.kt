package elong.androidApp.services.chapter3_8

import android.app.Activity
import android.content.res.AssetManager
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.util.Log
import android.widget.Toast
import java.io.File
import java.io.FileOutputStream
import java.io.InputStream
import java.io.OutputStream

class DatabaseServices {
    object TuongTacSQLite{      /**Sao chép Data từ SQLite (từ file assets) vào mobile system*/
        fun copyDbToMobileSystem(dbFile: File, assetManager:AssetManager, databaseName:String, pathDatabase:String, packageDatabase:String, activity:Activity){
            if (!dbFile.exists()){                                                              /*nếu file DATABASE_NAME (ở đây là dbContact.sqlite) chưa tồn tại thì chép*/
                try {
                    copyDbToMobileSystemFromAsset(assetManager, databaseName, pathDatabase, packageDatabase)     /*hàm sao chép*/
                    Toast.makeText(activity,"Sao chép database từ assets folder vào mobile system thành công", Toast.LENGTH_SHORT).show()
                }catch (ex:Exception){
                    Toast.makeText(activity,ex.toString(), Toast.LENGTH_SHORT).show()
                }
            }
        }
        private fun copyDbToMobileSystemFromAsset(assetManager:AssetManager, databaseName:String, pathDatabase:String, packageDatabase:String){
            try {
                var myInput: InputStream = assetManager.open(databaseName)                                      /*đường dẫn đến database trống*/
                var outFileName:String=
                    copyDbToMobileSystemFromAssetPutLinkSave(databaseName,pathDatabase,packageDatabase)/*trả về đường dẫn đang lưu trữ (putLinkSave)*/
                var f: File = File(packageDatabase+pathDatabase)   /*thư mục gốc *db_path*/
                if (!f.exists())                                            /*nếu file tồn tại thì mới tạo*/
                    f.mkdir()                                               /*chưa tồn tại thì tạo thư mục f đó*/
                var myOutput: OutputStream = FileOutputStream(outFileName)  /*lấy đc file output ra(đang rỗng)*/
                val buffer = ByteArray(1024)                           /*thông thường dùng 1024, mỗi lần chỉ đọc 1024 byte thôi*/
                var length:Int
                while (myInput.read(buffer).also { length = it } > 0)                       /*đọc hết file (trong khi còn đọc đc)*/
                    myOutput.write(buffer, 0, length)  /*đọc tất cả data từ assets vào mảng mới (mảng buffer).Mỗi lần đọc xong phải lưu vào myOutput (ghi xuống CSDL)*/
                myOutput.flush()                            /*đọc xong fải đóng file*/
                myOutput.close()                            /*đọc xong fải đóng file*/
                myInput.close()                             /*đọc xong fải đóng file*/
            }catch (ex:Exception){
                Log.e("Loi_SaoChep",ex.toString())
            }
        }
        private fun copyDbToMobileSystemFromAssetPutLinkSave(databaseName:String,pathDatabase:String, packageDatabase:String):String{
            return packageDatabase+pathDatabase+databaseName /*lấy đường dẫn lưu trữ (com.elongsoftware/database/dbContact.sqlite)*/
        }   /*dataDir: trỏ đến đúng package (elong.androidApp)*/

        fun showDatabase(database: SQLiteDatabase,   /*Quy tắc để mở 1 csdl. Bước 1: mở csdl trước: database = openOrCreateDatabase(...) (xử lý tại nơi gọi hàm)*/
            tableOfDb:String, columns:Array<out String>?, selection:String?, selectionArgs:Array<out String>?, groupBy:String?, having:String?, orderBy:String?) :Cursor{
            var cursorQuery:Cursor=database!!.query(tableOfDb,columns,selection,selectionArgs,groupBy,having,orderBy)     /*Cách 1: dùng query*/
//            var cursorQuery:Cursor=database.rawQuery("select * from $tableOfDb",null)                                 /*cách 2: dùng rawquery*/
            return cursorQuery                                                                                          /*truy vấn có thể dùng 2 cách: query hoặc rawquery.*/
        }
    }
}