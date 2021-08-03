package elong.androidApp

import android.app.ProgressDialog
import android.content.pm.PackageManager
import android.database.sqlite.SQLiteDatabase
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.google.android.gms.maps.CameraUpdateFactory

import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.Marker
import com.google.android.gms.maps.model.MarkerOptions
import elong.androidApp.adapter.arrayAdapter.chapter8.AdapterAddressVoChongTui
import elong.androidApp.adapter.gMapInfoWindowAdapter.chapter8.AdapterVoChongTuiGMap
import elong.androidApp.services.chapter3_8.DatabaseServices
import elong.androidApp.services.diaglog.ShowProgressWebserviceDialog
import elong.androidApp.services.chapter8GoogleMap.AddressVoChongTuiDatabaseService
import elong.androidApp.services.chapter8GoogleMap.FakeVoChongTuiGMap
import elong.models.chapter8.VoChongTuiGMap
import java.util.*

/**chuột phải zô package androidApp -> New -> Google Map Activity -> đặt tên -> enter */
/** Bước 1: -> tự động tạo ra 3 file (2 file Main .java và xml, và 1 file google_maps_api.xml trong res/values/) -> open file google_maps_api.xml ra, copy API_Code*/
class MapsActivityChapter8 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps_chapter_8)
        addControls()
        addEvents()
    }
    private fun addControls() {
        addControlChapter8GoogleMap()                   /**GOOGLEMAP THÀNH 1 PHẦN CỦA APP (hướngdẫn tạo MapActivity ở trên,bao gồm xửlý api,layout & strings.xml)*/
        addControlChapter8CustomeGoogleMap()            /**Custome GoogleMap khi click vào listview (Thêm: model, adapter cho GMap, layout & FakeVoChongTuiGMap*/
        addControlChapter8AddressVoChongTuiGoogleMap()  /**PROJECT CHƯƠNG 8: SỔ TAY ĐỊA CHỈ VỢ CHỒNG TUI (ĐỊNH ĐƯỜNG ĐI): (Thêm: adapter và layout)*/
    }
    private fun addEvents() {
        addEventsChapter8DisplayGoogleMap()             /**GOOGLEMAP THÀNH 1 PHẦN CỦA APP (hướngdẫn tạo MapActivity ở trên,bao gồm xửlý api,layout & strings.xml)*/
    }

    /**PHẦN DÙNG CHUNG:*/
    private lateinit var mMap: GoogleMap        /*variable để lấy ggmap ra*/
    private val LOCATION_PERMISSION_REQUEST = 1
    override fun /*cho phép hiển thị vị trí hiện tại trên gmap*/onRequestPermissionsResult(requestCode:Int,permissions:Array<out String>,grantResults:IntArray) {
        if (requestCode==LOCATION_PERMISSION_REQUEST)
            if (grantResults.contains(PackageManager.PERMISSION_GRANTED))
                mMap.isMyLocationEnabled=true
            else
                Toast.makeText(this,"User has not granted location access permission",Toast.LENGTH_SHORT).show()
    }

    /**GOOGLEMAP THÀNH 1 PHẦN CỦA APP (hướng dẫn tạo Map activity ở trên, bao gồm xử lý lấy api và đổi layout trong file xml, add thêm trong strings.xml)*/
    var progressDialog:ProgressDialog?=null     /*đưa ra câu thông báo nếu chưa tải đc GGMAP*/
    var spGoogleMapType:Spinner?=null; var sourceListTypeGoogleMap:MutableList<String>?=null; var adapterTypeGoogleMap:ArrayAdapter<String>?=null
    private fun     /*addControl -> SPINNER and Display GOOGLE MAP*/                addControlChapter8GoogleMap() {
        addControlChapter8ForSpinnerAndProgressDialog()
        addControlChapter8DisplayGoogleMap()
    }
    private fun     /*addControl -> SPINNER để chọn chế độ hiển thị*/               addControlChapter8ForSpinnerAndProgressDialog() {
        spGoogleMapType=findViewById(R.id.spGoogleMapType)
        sourceListTypeGoogleMap= mutableListOf()
        sourceListTypeGoogleMap!!.addAll(resources.getStringArray(R.array.arrGgMapDisplayMode))
        adapterTypeGoogleMap=ArrayAdapter(this@MapsActivityChapter8,android.R.layout.simple_spinner_item,sourceListTypeGoogleMap!!)
        adapterTypeGoogleMap!!.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spGoogleMapType!!.adapter=adapterTypeGoogleMap
        progressDialog= ShowProgressWebserviceDialog.Dialogs.showing(this@MapsActivityChapter8,"Google Map")
        progressDialog!!.show()
    }
    private fun     /**PHẦN DÙNG CHUNG*//*addControl -> khởi tạo zá trị GOOGLE MAP*/addControlChapter8DisplayGoogleMap() {
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager.findFragmentById(R.id.map) as SupportMapFragment   /*lệnh lấy ggmap ra*/
        mapFragment.getMapAsync { googleMap ->  /*khởi tạo ggmap và hiển thị vị trí hiện tại trên google map*/
            if (googleMap != null) {            /*mapFragment.getMapAsync: lấy cái fragment trong file xml ra, fragment này có id=map*/
                mMap = googleMap                /*Khởi tạo google map*/
                mMap.setOnMapLoadedCallback {   /*skiện ktra GGMAP đã tải xong chưa?*/
                    progressDialog!!.dismiss()  /*Tải xong rồi thì tắt câu thông báo đi*/
                    addControlChapter8GetLocationAccess()         /*hiển thị vị trí hiện tại trên google map*/
                    addEventsChapter8HienThiHinhAnhVoChongTuiGMap()
                    addEventsChapter8HienThiHinhAnhAddressVoChongTuiGMap()
                }
            }
        }
    }
    private fun     /*addControl -> Lấy vị trí hiện tại trên gmap và hiển thị lên*/ addControlChapter8GetLocationAccess(){/*hiển thị vị trí hiện tại trên google map*/
        if (ContextCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED)
            ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.ACCESS_FINE_LOCATION),LOCATION_PERMISSION_REQUEST)
        else mMap.isMyLocationEnabled = true    /*cho phép lấy vị trí hiện tại*/
            /*mMap.setOnMyLocationChangeListener { location ->        //lắng nghe sự thay đổi vị trí hiện tại
                var loc: LatLng = LatLng(location.latitude, location.longitude)     //và tạo ra 1 biến để lắng nghe vị trí hiện tại của thiết bị
                if (mMap != null) {
                    mMap.clear()
                    var mMaker: Marker = mMap.addMarker(MarkerOptions().position(loc).title("Marker in Hamilton"))     //marker là biểu tượng vị trí
                    mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(loc, 14.0f))     //ở đây là zoom đến 14 (khả năng zoom từ 0-18)
                }
            }*/
    }
    private fun     /*addEvent -> XỬ LÝ CHỌN CHẾ ĐỘ HIỂN THỊ TRÊN SPINNER CHO GMAP*/addEventsChapter8DisplayGoogleMap() {
        spGoogleMapType!!.onItemSelectedListener=object :AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                addEventsChapter8XuLyChangeMapDisplayType(position)
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }
    }
    private fun     /*addEvent -> XỬ LÝ CHỌN CHẾ ĐỘ HIỂN THỊ TRÊN SPINNER CHO GMAP*/addEventsChapter8XuLyChangeMapDisplayType(position: Int) {
        when (position){
            0 -> mMap.mapType=GoogleMap.MAP_TYPE_NORMAL
            1 -> mMap.mapType=GoogleMap.MAP_TYPE_SATELLITE
            2 -> mMap.mapType=GoogleMap.MAP_TYPE_TERRAIN
            3 -> mMap.mapType=GoogleMap.MAP_TYPE_HYBRID
            else -> mMap.mapType=GoogleMap.MAP_TYPE_NONE
        }
    }

    /**Custome GoogleMap khi click vào listview (Thêm: file model, adapter cho GMap, layout item_chapter8_vochongtui_gmap.xml, file FakeVoChongTuiGMap để zả lập data)*/
    var lvVoChongTuiGMap:ListView?=null; var sourceListVoChongTuiGMap:MutableList<VoChongTuiGMap>?=null; var adapterVoChongTuiGMap:ArrayAdapter<VoChongTuiGMap>?=null
    private fun     /*addControl -> Listview*/                                      addControlChapter8CustomeGoogleMap() {
        lvVoChongTuiGMap=findViewById(R.id.lvVoChongTuiGMap)
        sourceListVoChongTuiGMap= FakeVoChongTuiGMap.display.listVoChongTuiGMap()
        adapterVoChongTuiGMap=ArrayAdapter(this,android.R.layout.simple_list_item_1,sourceListVoChongTuiGMap!!)
        lvVoChongTuiGMap!!.adapter=adapterVoChongTuiGMap
    }
    private fun     /*addEvent -> đc gọi trong addControlChapter8DisplayGoogleMap*/ addEventsChapter8HienThiHinhAnhVoChongTuiGMap() {
        lvVoChongTuiGMap!!.setOnItemClickListener { parent, view, position, id -> addEventChapter8ListView(position,sourceListVoChongTuiGMap!!) }
    }
    private fun     /**PHẦN DÙNG CHUNG*//*addEvent -> thay đổi vị trí trên gmap*/   addEventChapter8ListView(viTri:Int,listVkCkTuiGMap:MutableList<VoChongTuiGMap>){
        var voChongTuiGMap:VoChongTuiGMap = listVkCkTuiGMap!![viTri]
        val location:LatLng = LatLng(voChongTuiGMap.ViDoVoChongTuiGMap!!, voChongTuiGMap.KinhDoVoChongTuiGMap!!)
        var marker:Marker = mMap.addMarker(MarkerOptions().position(location).title(voChongTuiGMap.NameVoChongTuiGMap))
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(location,17.5f))
        mMap.setInfoWindowAdapter(AdapterVoChongTuiGMap(this,voChongTuiGMap))
        marker.showInfoWindow()
    }

    /**PROJECT CHƯƠNG 8: SỔ TAY ĐỊA CHỈ VỢ CHỒNG TUI (ĐỊNH ĐƯỜNG ĐI): (Add thêm: file adapter cho listview, layout item_chapter8_vochongtui_listview_for_gmap.xml)*/
    var lvSoTayAddressVkCkGGMap:ListView?=null;var sourceListAddressVkCkGGMap:MutableList<VoChongTuiGMap>?=null;var adapterAddressVkCkGGMap:AdapterAddressVoChongTui?=null
    var dbAddressVkCkGGMap:SQLiteDatabase?=null; var DB_NAME_ADDRESS_VKCK_GGMAP:String="dbSoTayVkCk.sqlite"; var DB_PATH_SUFFIX_ADDRESS_VKCK_GGMAP:String="/databases/"
    private fun     /*addControl -> Add thêm file AddressVoChongTuiDatabaseService*/addControlChapter8AddressVoChongTuiGoogleMap(){
        lvSoTayAddressVkCkGGMap=findViewById(R.id.lvSoTayAddressVkCkGGMap)
        sourceListAddressVkCkGGMap= mutableListOf()
        adapterAddressVkCkGGMap=AdapterAddressVoChongTui(this@MapsActivityChapter8,R.layout.item_chapter8_vochongtui_listview_for_gmap,sourceListAddressVkCkGGMap!!)
        lvSoTayAddressVkCkGGMap!!.adapter=adapterAddressVkCkGGMap
        DatabaseServices.TuongTacSQLite.copyDbToMobileSystem(dbFile = getDatabasePath(DB_NAME_ADDRESS_VKCK_GGMAP), assets,  /*Sao chép Data từ SQLite (từ file assets)*/
            DB_NAME_ADDRESS_VKCK_GGMAP, DB_PATH_SUFFIX_ADDRESS_VKCK_GGMAP, applicationInfo.dataDir.toString(),this@MapsActivityChapter8)  /* vào mobile system*/
        dbAddressVkCkGGMap=openOrCreateDatabase(DB_NAME_ADDRESS_VKCK_GGMAP, MODE_PRIVATE,null)                              /*Đưa data lên zao diện - control */
        AddressVoChongTuiDatabaseService.DatabaseAddressVoChongTui.showAllAddressVoChongTui(dbAddressVkCkGGMap!!,"AddressVkCk",         /*(show to Listview)*/
            sourceListAddressVkCkGGMap!!,adapterAddressVkCkGGMap!!)
    }
    private fun     /*addEvent -> đc gọi trong addControlChapter8DisplayGoogleMap*/ addEventsChapter8HienThiHinhAnhAddressVoChongTuiGMap(){
        lvSoTayAddressVkCkGGMap!!.setOnItemClickListener { parent, view, position, id ->  addEventChapter8ListView(position, sourceListAddressVkCkGGMap!!)}
    }
}