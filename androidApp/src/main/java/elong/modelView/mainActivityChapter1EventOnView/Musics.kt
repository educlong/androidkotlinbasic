package elong.modelView.mainActivityChapter1EventOnView

import android.database.sqlite.SQLiteDatabase
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.databinding.ObservableArrayList
import androidx.databinding.ObservableField
import androidx.databinding.library.baseAdapters.BR
import elong.androidApp.MainActivityChapter1EventOnView
import elong.androidApp.R
import elong.androidApp.services.chapter3.MusicDatabaseService
import elong.models.chapter1_3.Music

open class Musics :BaseObservable {
    private var musics:ObservableArrayList<Music>? = ObservableArrayList()
    private var dbKaraoke: SQLiteDatabase? = null
    public var addCodeSong:ObservableField<String>? = ObservableField()
    public var addNameSong:ObservableField<String>? = ObservableField()
    public var addSinger:ObservableField<String>? = ObservableField()

    @get:Bindable
    public var Musics:ObservableArrayList<Music>?
        get() {return musics}
        set(value) {musics=value;notifyPropertyChanged(BR.musics)}
    @get:Bindable
    public var DbKaraoke:SQLiteDatabase?
        get() {return dbKaraoke}
        set(value) {dbKaraoke=value}

    constructor():super(){
        add(Music("BH1","Đường xa ướt mưa","Đức Huy",false))
    }

    constructor(dbKaraoke: SQLiteDatabase?) : super() {
        this.dbKaraoke = dbKaraoke
        MusicDatabaseService.MusicService.showMusicOnListView(dbKaraoke!!,"ArirangSongList",0,musics)
    }

    public fun add(music: Music){
        musics!!.add(music)
    }
    public fun add(){   /*thực hiện trong xml*/
        if (addCodeSong!=null && addCodeSong!=null && addSinger!=null)
            add(Music("BH${addCodeSong!!.get()}", addNameSong!!.get(), addSinger!!.get(),false))
    }
    public fun tabChange(s:String){
        if (s.equals("tabListKara",true)){
            var musics: ObservableArrayList<Music>? = this.musics
            this.musics?.clear()
            for (music in musics!!)
                if (music.Like == false)
                    add(music)
        }
        if (s.equals("tabLikeKara",true)){
            var musics: ObservableArrayList<Music>? = this.musics
            this.musics?.clear()
            for (music in musics!!)
                if (music.Like == true)
                    add(music)
        }
    }
    public fun tabChangeDatabase(s:String){
        if (s.equals("tabSongListDatabase",true)){
            MusicDatabaseService.MusicService.showMusicOnListView(dbKaraoke!!,"ArirangSongList",0,musics)
        }
        if (s.equals("tabSongLikeDatabase",true)){
            MusicDatabaseService.MusicService.showMusicOnListView(dbKaraoke!!,"ArirangSongList",1,musics)
        }
    }
}