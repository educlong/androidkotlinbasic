package elong.androidApp.services.chapter8GoogleMap

import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.graphics.BitmapFactory
import elong.androidApp.adapter.arrayAdapter.chapter8.AdapterAddressVoChongTui
import elong.androidApp.services.chapter3_8.DatabaseServices
import elong.models.chapter8.VoChongTuiGMap

class AddressVoChongTuiDatabaseService {
    object DatabaseAddressVoChongTui{
        fun showAllAddressVoChongTui(database: SQLiteDatabase,tableOfDb: String,sourceList: MutableList<VoChongTuiGMap>,adapterList: AdapterAddressVoChongTui){
            var cursorQuery:Cursor=
                DatabaseServices.TuongTacSQLite.showDatabase(database,tableOfDb,null,null,null,null,null,null)
            sourceList!!.clear()                /*xóa hết toàn bộ tất cả các items trong list*/
            while (cursorQuery.moveToNext()){   /*trong khi còn di chuyển đến dòng kế tiếp của csdl*/
                var bytes:ByteArray? = cursorQuery.getBlob(2)
                sourceList!!.add(VoChongTuiGMap(cursorQuery.getInt(0),cursorQuery.getString(1), /*hình đưa vào SQLite trở thành dạnh Byte,*/
                    BitmapFactory.decodeByteArray(bytes,0,bytes!!.size),  /*zờ phải đưa từ dạng Byte trở về dạng hình bình thường -> lấy cột số 2 là hình*/
                    cursorQuery.getDouble(3),cursorQuery.getDouble(4)))                         /*cột số 2 trả về 1 bitmap (là 1 hình)*/
            }
            cursorQuery.close()
            adapterList!!.notifyDataSetChanged()
        }
    }
}