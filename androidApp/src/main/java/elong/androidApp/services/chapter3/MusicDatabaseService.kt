package elong.androidApp.services.chapter3

import android.content.ContentValues
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import androidx.databinding.ObservableArrayList
import elong.androidApp.services.chapter3_8.DatabaseServices
import elong.models.chapter1_3.Music

class MusicDatabaseService {
    object MusicService{
        fun showMusicOnListView(database: SQLiteDatabase, tableOfDb:String, likeMusic:Int, sourceList: ObservableArrayList<Music>?){
            var cursorQuery: Cursor = DatabaseServices.TuongTacSQLite.showDatabase(database,
                tableOfDb,null,"YEUTHICH=?", arrayOf(likeMusic.toString()),null,null,null)  /*lấy danh sách cột YEUTHICH=0*/
            sourceList?.clear()                /*xóa hết toàn bộ tất cả các items trong list*/
            while (cursorQuery.moveToNext())    /*trong khi còn di chuyển đến dòng kế tiếp của csdl*/
                sourceList!!.add(Music(cursorQuery.getString(0),
                    cursorQuery.getString(1),cursorQuery.getString(3),cursorQuery.getInt(5)==1))
            cursorQuery.close()
        }
        fun updateMusic(database:SQLiteDatabase, tableOfDb:String, row: ContentValues, code:String){
            database!!.update(tableOfDb,row,"MABH=?",arrayOf(code))     /*nghĩa: update row từ bảng tableOfDb khi MABH=? & MABH từ code*/
        }
        public fun checkCodeMusic(database:SQLiteDatabase,tableOfDb:String,code:String):Boolean{   /*==true -> đã tồn tại code, ==false: chưa tồn tại code*/
            return DatabaseServices.TuongTacSQLite
                .showDatabase(database,tableOfDb,null,"MABH=?", arrayOf(code),null,null,null).moveToNext()
        }
        fun searchSong(database: SQLiteDatabase, tableOfDb:String, likeMusic:Int, sourceList:ObservableArrayList<Music>, searchName:String){
            var cursorQuery:Cursor= DatabaseServices.TuongTacSQLite
                .showDatabase(database,tableOfDb,null,"TENBH=?", arrayOf(searchName),null,null,null)
            if (searchName=="") showMusicOnListView(database,tableOfDb,likeMusic,sourceList)
            sourceList!!.clear()
            while (cursorQuery.moveToNext())    /*trong khi còn di chuyển đến dòng kế tiếp của csdl*/
                sourceList!!.add(Music(cursorQuery.getString(0),
                    cursorQuery.getString(1),cursorQuery.getString(3),cursorQuery.getInt(5)==1))
            cursorQuery.close()
        }
    }
}