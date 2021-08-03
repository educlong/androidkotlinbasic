package elong.modelView.mainActivityChapter1EventOnView

import android.content.ContentValues
import android.database.sqlite.SQLiteDatabase
import android.view.View
import android.widget.Toast
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.databinding.ObservableArrayList
import androidx.databinding.ObservableField
import androidx.databinding.library.baseAdapters.BR
import elong.androidApp.services.chapter3.DanhBaDatabaseService
import elong.models.chapter1_2_3_7.DanhBa
import kotlin.random.Random

class DanhBas:BaseObservable {
    private var danhBas:ObservableArrayList<DanhBa>?= ObservableArrayList()
    public var addSaveCodeDanhBa:ObservableField<String>? = ObservableField()
    public var addSaveNameDanhBa:ObservableField<String>?= ObservableField()
    public var addSavePhoneDanhBa:ObservableField<String>?= ObservableField()
    private var dbDanhBa:SQLiteDatabase?=null

    @get:Bindable
    public var DanhBas:ObservableArrayList<DanhBa>?
        get() {return danhBas}
        set(value) {danhBas=value;notifyPropertyChanged(BR.danhBas)}
    @get:Bindable
    public var DbDanhBa:SQLiteDatabase?
        get() {return dbDanhBa}
        set(value) {dbDanhBa=value}

    constructor():super(){
        var random:Random= Random
        for (count in 0 until 10){   //2 người
            var name:String=random.nextInt(255).toChar().toString()
            for(i in 0 until 4) name+=random.nextInt(255).toChar().toString()
            var phone:String="090"
            for(i in 0 until 7) phone+=random.nextInt(10)
            add(DanhBa(random.nextInt(10),name,phone))
        }
    }
    constructor(dbDanhBa:SQLiteDatabase?):super(){
        this.dbDanhBa=dbDanhBa
        DanhBaDatabaseService.DbService.showAllDanhBaOnListView(dbDanhBa!!,"Contact",danhBas)
    }
    private fun add(danhBa: DanhBa){
        danhBas!!.add(danhBa)
    }
    public fun add(view:View){
        if (addSaveCodeDanhBa!=null && addSaveNameDanhBa!=null && addSavePhoneDanhBa!=null){
            var row: ContentValues = ContentValues()
            row.put("CodeContact", addSaveCodeDanhBa!!.get().toString().toInt()) /*tên cột (mã, tên, phone) phải lấy y xì như 3 câu lệnh dưới*/
            row.put("NameContact", addSaveNameDanhBa!!.get().toString())
            row.put("PhoneContact", addSavePhoneDanhBa!!.get().toString())
            Toast.makeText(view.context,
                "Add, ret= ${DanhBaDatabaseService.DbService.addOrUpdateDanhBa(dbDanhBa!!,"Contact",row,addSaveCodeDanhBa!!.get().toString())}",
                Toast.LENGTH_SHORT).show()
            DanhBaDatabaseService.DbService.showAllDanhBaOnListView(dbDanhBa!!,"Contact",danhBas)
        }
    }
    public fun remove(){
        DanhBaDatabaseService.DbService.deleteDanhBa(dbDanhBa!!,"Contact",addSaveCodeDanhBa!!.get().toString())
        DanhBaDatabaseService.DbService.showAllDanhBaOnListView(dbDanhBa!!,"Contact",danhBas)
    }
}