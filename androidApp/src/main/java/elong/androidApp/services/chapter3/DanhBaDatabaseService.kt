package elong.androidApp.services.chapter3

import android.content.ContentValues
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import androidx.databinding.ObservableArrayList
import elong.androidApp.services.chapter3_8.DatabaseServices
import elong.models.chapter1_2_3_7.DanhBa

class DanhBaDatabaseService {
    object DbService{
        fun showAllDanhBaOnListView(database:SQLiteDatabase, tableOfDb:String, sourceList: ObservableArrayList<DanhBa>?){
            var cursorQuery:Cursor=
                DatabaseServices.TuongTacSQLite.showDatabase(database,tableOfDb,null,null,null,null,null,null)
            sourceList?.clear()    /*xóa hết toàn bộ tất cả các items trong list*/
            while (cursorQuery.moveToNext())    /*trong khi còn di chuyển đến dòng kế tiếp của csdl*/
                sourceList!!.add(DanhBa(cursorQuery.getInt(0),cursorQuery.getString(1),cursorQuery.getString(2)))
            cursorQuery.close()
        }
        private fun checkCodeDanhBa(database:SQLiteDatabase,tableOfDb:String,codeContact:String):Boolean{   /*==true -> đã tồn tại code, ==false: chưa tồn tại code*/
            return DatabaseServices.TuongTacSQLite
                .showDatabase(database,tableOfDb,null,"CodeContact=?", arrayOf(codeContact),null,null,null).moveToNext()
        }
        fun addOrUpdateDanhBa(database:SQLiteDatabase, tableOfDb:String, row:ContentValues, code:String):Long{
            if (checkCodeDanhBa(database,tableOfDb,code)){                      /*nếu check code có (=true) -> update */
                database!!.update(tableOfDb,row,"CodeContact=?",arrayOf(code))/*nghĩa: update row từ bảng tableOfDb khi CodeContact=? & CodeContact từ code*/
                return -1       /*nếu đối số thứ 3 có nhiều dấu ? thì mảng trong đối số thứ 4 có chừng đó phần tử*/
            }
            else return database!!.insert(tableOfDb,null,row)      /*nếu check code k có -> add mới*/
        }
        fun deleteDanhBa(database:SQLiteDatabase, tableOfDb:String, code:String){
            if (!checkCodeDanhBa(database,tableOfDb,code))  return
            database!!.delete(tableOfDb,"CodeContact=?", arrayOf(code))
        }
    }
}