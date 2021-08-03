package elong.androidApp.adapter.arrayAdapter.chapter1_3

import android.app.Activity
import android.content.ContentValues
import android.view.*
import android.widget.*
import elong.androidApp.MainActivityChapter2Chapter3
import elong.androidApp.R
import elong.androidApp.services.chapter3.MusicDatabaseService
import elong.models.chapter1_3.Music

class MusicAdapter(var activity: Activity, var resource: Int, var objects: MutableList<Music>) : ArrayAdapter<Music>(activity, resource, objects) {
    var txtViewCodeSong: TextView?=null
    var txtViewNameSong: TextView?=null
    var txtViewSinger: TextView?=null
    var btnLike: ImageButton?=null
    var btnDislike: ImageButton?=null
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var inflater:LayoutInflater= this.activity!!.layoutInflater
        var row:View=inflater.inflate(this.resource,null)
        addControls(row)
        addEvents(row,position)
        return row
    }

    private fun addControls(row: View) {
        txtViewCodeSong=row.findViewById(R.id.txtViewCodeSong)
        txtViewNameSong=row.findViewById(R.id.txtViewNameSong)
        txtViewSinger=row.findViewById(R.id.txtViewSinger)
        btnLike=row.findViewById(R.id.btnKaraokeLike)
        btnDislike=row.findViewById(R.id.btnKaraokeDislike)
    }
    private fun addEvents(row: View, position: Int) {
        val music: Music?=this.objects[position]
        txtViewCodeSong!!.text=music!!.CodeSong
        txtViewNameSong!!.text=music!!.NameSong
        txtViewSinger!!.text=music!!.Singer
        if (music.Like==true){
            btnLike!!.visibility= View.INVISIBLE
            btnDislike!!.visibility= View.VISIBLE
        }
        else{
            btnLike!!.visibility= View.VISIBLE
            btnDislike!!.visibility= View.INVISIBLE
        }
        btnLike!!.setOnClickListener {      view -> music.Like=true;  xuLyLike(music)}
        btnDislike!!.setOnClickListener {   view -> music.Like=false; xuLyDislike(music) }
    }

    /**PROJECT CHƯƠNG 3: ASSETS, SHARED PREFERENCES, QUẢN LÝ DỮ LIỆU VÀ CONTENTPROVIDER ---> PROJECT CHƯƠNG 3: KARAOKE*/
    private fun xuLyDislike(music: Music) {     /*hàm xlý cho PROJECT Chương 3: KARAOKE NÂNG CAO (Tương tác DATABASE)*/
        var row:ContentValues= ContentValues()  /*sử dụng ContentProvider -> chỉnh sửa cái nào thì put cái đó, như vậy:*/
        row.put("YEUTHICH",0)                   /*sửa cột YEUTHICH=1*/
        MusicDatabaseService.MusicService.updateMusic(MainActivityChapter2Chapter3.database.dbKaraoke!!,"ArirangSongList",row,music.CodeSong.toString())
    }   /*lệnh trên update thay đổi thông tin lưu xuống CSDL*/
    private fun xuLyLike(music: Music) {        /*hàm xlý cho PROJECT Chương 3: KARAOKE NÂNG CAO (Tương tác DATABASE)*/
        var row:ContentValues= ContentValues()  /*sử dụng ContentProvider -> chỉnh sửa cái nào thì put cái đó, như vậy:*/
        row.put("YEUTHICH",1)                   /*sửa cột YEUTHICH=0*/
        MusicDatabaseService.MusicService.updateMusic(MainActivityChapter2Chapter3.database.dbKaraoke!!,"ArirangSongList",row,music.CodeSong.toString())
    }
}