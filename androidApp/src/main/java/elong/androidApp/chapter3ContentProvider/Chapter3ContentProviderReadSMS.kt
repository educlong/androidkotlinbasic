package elong.androidApp.chapter3ContentProvider

import android.Manifest
import android.content.pm.PackageManager
import android.database.Cursor
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.core.app.ActivityCompat
import elong.androidApp.R
import elong.androidApp.services.chapter3.ContentProviderServices

class Chapter3ContentProviderReadSMS : AppCompatActivity() {
    var lvReadMessageOfMine:ListView?=null; var sourceListMessageContentProvider:MutableList<String>?=null; var adapterMessageContentProvider:ArrayAdapter<String>?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chapter3_content_provider_read_sms)
        addControls()
        readAllMessageFromDevice()
    }

    private fun addControls() {
        lvReadMessageOfMine=findViewById(R.id.lvReadMessageOfMine)
        sourceListMessageContentProvider= mutableListOf()
        adapterMessageContentProvider= ArrayAdapter(this@Chapter3ContentProviderReadSMS,android.R.layout.simple_list_item_1,sourceListMessageContentProvider!!)
        lvReadMessageOfMine!!.adapter=adapterMessageContentProvider
    }

    private fun readAllMessageFromDevice() {
        try {
            var cursor: Cursor? = contentResolver.query(ContentProviderServices
                .readFromDevice.readSMS(this@Chapter3ContentProviderReadSMS),null,null,null,null)
            sourceListMessageContentProvider!!.clear()
            while (cursor!!.moveToNext())   /*trong khi còn đọc đc trong hệ thống.      Cũng thông qua index,từ index mới lấy đc id,từ id mới lấy đc thôngtin khác*/
                sourceListMessageContentProvider!!.add(cursor.getString(cursor.getColumnIndex(ContentProviderServices.readFromDevice.smsAddressColumn))+"\n" /*address*/
                        +cursor.getString(cursor.getColumnIndex(ContentProviderServices.readFromDevice.smsDateColumn))+"\n"                                  /*time*/
                        +cursor.getString(cursor.getColumnIndex(ContentProviderServices.readFromDevice.smsBodyColumn))) /*in các thông tin lấy đc ra (phone, time, body)*/
            /*Cách viết khác:
            if (cursor.getColumnIndex(ContentProviderServices.readFromDevice.smsBodyColumn)<0 || !cursor.moveToFirst())     return
            do{
                sourceListMessageContentProvider!!.add(cursor.getString(cursor.getColumnIndex(ContentProviderServices.readFromDevice.smsAddressColumn))+"\t"
                        +cursor.getString(cursor.getColumnIndex(ContentProviderServices.readFromDevice.smsDateColumn))+"\t"
                        +cursor.getString(cursor.getColumnIndex(ContentProviderServices.readFromDevice.smsBodyColumn)))
            }while (cursor!!.moveToNext())*/
            cursor.close()
        }catch (ex:Exception){
            Toast.makeText(this,ex.toString(), Toast.LENGTH_SHORT).show()
        }
        adapterMessageContentProvider!!.notifyDataSetChanged()
    }
}