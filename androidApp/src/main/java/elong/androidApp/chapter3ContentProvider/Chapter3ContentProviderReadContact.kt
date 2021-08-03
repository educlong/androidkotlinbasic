package elong.androidApp.chapter3ContentProvider

import android.database.Cursor
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import elong.androidApp.R
import elong.androidApp.services.chapter3.ContentProviderServices
import elong.models.chapter1_2_3_7.DanhBa

class Chapter3ContentProviderReadContact : AppCompatActivity() {
    var lvReadDanhBaOfMine: ListView?=null; var sourceListDanhBaContentProvider:MutableList<String>?=null; var adapterDanhBaContentProvider: ArrayAdapter<String>?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chapter3_content_provider_read_contact)
        addControls()
        showAllContactFromDevice()                  /*hàm lấy danh bạ từ device (mobile)*/
    }

    private fun addControls() {
        lvReadDanhBaOfMine=findViewById(R.id.lvReadDanhBaOfMine)
        sourceListDanhBaContentProvider= mutableListOf()
        adapterDanhBaContentProvider= ArrayAdapter(this@Chapter3ContentProviderReadContact,android.R.layout.simple_list_item_1,sourceListDanhBaContentProvider!!)
        lvReadDanhBaOfMine!!.adapter=adapterDanhBaContentProvider
    }

    private fun showAllContactFromDevice() {        /*hàm lấy danh bạ từ device (mobile)*/
        try {
            var cursor: Cursor? = contentResolver.query(ContentProviderServices /*Trả về 1 cursor, cursor này quản lý 1 bảng dữ liệu contacts (danh bạ) của người dùng*/
                .readFromDevice.readContact(this@Chapter3ContentProviderReadContact), null, null, null, null)
            sourceListDanhBaContentProvider!!.clear()   /*phải xóa dữ liệu cũ trước kia*/
            while (cursor!!.moveToNext())   /*DISPLAY_NAME: Tạo cột tên,lấy tên trong danh bạ, getColumnIndex -> lấy columnIndex, để lấy tên trong d/bạ*/
                sourceListDanhBaContentProvider!!.add(DanhBa(cursor.getString(cursor.getColumnIndex(ContactsContract.Contacts.DISPLAY_NAME)),
                    cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER))).toString())
            cursor.close()          /*getString -> lấy dữ liệu [tên] trong danh bạ ng.dùng*/        /*Phone.NUMBER -> Tạo cột phone,lấy phone trong danh bạ*/
        }catch (ex:Exception){
            Toast.makeText(this,ex.toString(),Toast.LENGTH_SHORT).show()
        }
        adapterDanhBaContentProvider!!.notifyDataSetChanged()
    }
}