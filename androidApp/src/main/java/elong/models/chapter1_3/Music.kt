package elong.models.chapter1_3

import android.content.ContentValues
import android.view.View
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.databinding.ObservableField
import androidx.databinding.library.baseAdapters.BR
import elong.androidApp.MainActivityChapter2Chapter3
import elong.androidApp.services.chapter3.MusicDatabaseService
import java.io.Serializable

class Music : Serializable, BaseObservable{
    private var codeSong:String?=null
    private var nameSong:String?=null
    private var singer:String?=null
    private var like:Boolean?=null
    public var clickLike:ObservableField<Int>?=ObservableField()
    public var clickDislike:ObservableField<Int>?=ObservableField()
    @get:Bindable
    public var CodeSong: String?
        get() {return codeSong}
        set(value) {codeSong=value;notifyPropertyChanged(BR.codeSong)}
    @get:Bindable
    public var NameSong: String?
        get() {return nameSong}
        set(value) {nameSong=value;notifyPropertyChanged(BR.nameSong)}
    @get:Bindable
    public var Singer: String?
        get() {return singer}
        set(value) {singer=value;notifyPropertyChanged(BR.singer)}
    @get:Bindable
    public var Like: Boolean?
        get() {return like}
        set(value) {like=value;notifyPropertyChanged(BR.like)}

    constructor(codeSong: String?, nameSong: String?, singer: String?, like: Boolean?) {
        this.codeSong = codeSong
        this.nameSong = nameSong
        this.singer = singer
        this.like = like
    }
    constructor(codeSong: String?, nameSong: String?, singer: String?) {
        this.codeSong = codeSong
        this.nameSong = nameSong
        this.singer = singer
        this.like = false
    }

    constructor(like:Boolean):super(){
        this.like=like
    }

    public fun diplay(){
        this.like = (this.like==false)  //like: true -> false, false->true
        if(this.like==true){            //ban đầu false, nhấn vào thì chuyển sang true, true thì hiển thị dislike, k hiển thị like
            clickDislike!!.set(View.VISIBLE)
            clickLike!!.set(View.INVISIBLE)
            if (MusicDatabaseService.MusicService.checkCodeMusic(MainActivityChapter2Chapter3.database.dbKaraoke!!,"ArirangSongList",codeSong.toString())){
                var row: ContentValues = ContentValues()  /*sử dụng ContentProvider -> chỉnh sửa cái nào thì put cái đó, như vậy:*/
                row.put("YEUTHICH",1)                   /*sửa cột YEUTHICH=1*/
                MusicDatabaseService.MusicService.updateMusic(MainActivityChapter2Chapter3.database.dbKaraoke!!,"ArirangSongList",row,codeSong.toString())
            }
        }
        else{
            clickLike!!.set(View.VISIBLE)
            clickDislike!!.set(View.INVISIBLE)
            if (MusicDatabaseService.MusicService.checkCodeMusic(MainActivityChapter2Chapter3.database.dbKaraoke!!,"ArirangSongList",codeSong.toString())){
                var row:ContentValues= ContentValues()  /*sử dụng ContentProvider -> chỉnh sửa cái nào thì put cái đó, như vậy:*/
                row.put("YEUTHICH",0)                   /*sửa cột YEUTHICH=0*/
                MusicDatabaseService.MusicService.updateMusic(MainActivityChapter2Chapter3.database.dbKaraoke!!,"ArirangSongList",row,codeSong.toString())
            }
        }
    }
    override fun toString(): String {
        return "Music(codeSong=$codeSong, nameSong=$nameSong, singer=$singer, like=$like)"
    }
}