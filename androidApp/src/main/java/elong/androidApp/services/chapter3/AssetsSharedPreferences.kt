package elong.androidApp.services.chapter3

import android.content.SharedPreferences
import android.content.res.AssetFileDescriptor
import android.content.res.AssetManager
import android.graphics.Typeface
import android.media.MediaPlayer
import android.util.Log
import android.widget.ArrayAdapter
import java.util.*

class AssetsSharedPreferences {
    object AssetsControls{                  /*chủ yếu assets có kiểu string (lấy tên file) -> assetManager:AssetManager: lấy toàn bộ tài nguyên trong thư mục assets*/
        fun getResourceFromAssetFolder(assetManager:AssetManager,pathFolder:String,sourceList:MutableList<String>,adapterSource:ArrayAdapter<String>){/**Save data into list*/
            try {
                var arrcName = assetManager.list(pathFolder)        /*list trả về tập tin trong assets (tậptin pathFolder)*/
                sourceList!!.addAll(Arrays.asList(*arrcName))       /*sau khi có mảng arrcName,thì sẽ đưa tất cả vào sourceList*/
                adapterSource!!.notifyDataSetChanged()              /*lúc này arrcName sẽ là 1 collection. Thay vì dùng vòng for add từng fầntử*/
            }catch (ex:Exception){
                Log.e("Loi_Asset_$pathFolder",ex.toString())
            }
        }
    }
    object SharedPreferencesControl{
        fun returnFolderSavedInAssets(assetManager:AssetManager,pathFolder:String,sourceList:MutableList<String>,position:Int):Typeface{ /**đi đến folder đc chọn in assets*/
            return Typeface.createFromAsset(assetManager,pathFolder+"/${sourceList!![position]}")   /*"pathFolder/..." trả về đường dẫn đúng assets đến tập tin font*/
        }
        fun saveStatusInfor(preferences:SharedPreferences):SharedPreferences.Editor{                                                    /**Lưu lại trạng thái*/
            return preferences.edit()                       /*edit(): return 1 editor. Muốn lưu trữ,phải có editor. Mục đích:cho phép lưu data xuống file(cụ thể file xml)*/
        }
        fun restoreStatusInfor(assetManager:AssetManager,keyPre:String):Typeface{                                                      /**Phục hồi lại trạng thái*/
            return Typeface.createFromAsset(assetManager,keyPre)   /*createFromAsset   ->   keyPre: là trạng tháo đc chọn trước đó (lưu trong editor.commit)*/
        }
    }
    object MediaControl{
        fun playMusicControl(afdMusic: AssetFileDescriptor){
            try {
                var mediaPlayer: MediaPlayer = MediaPlayer()
                mediaPlayer.setDataSource(afdMusic.fileDescriptor,afdMusic.startOffset,afdMusic.length) /*Đối số 1: File muốn play, Đối số 2: Vị trí bắt đầu start (bytes)*/
                mediaPlayer.prepare()      /*Chuẩn bị play file.*/                                      /*Đối số 3: Chiều dài file sẽ play (bytes)*/
                mediaPlayer.start()        /*Chạy file*/
            }catch (ex:Exception){
                Log.e("Loi_MUSIC",ex.toString())
            }
        }
    }
}