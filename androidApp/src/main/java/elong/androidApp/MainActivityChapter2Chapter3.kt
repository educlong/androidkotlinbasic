package elong.androidApp

import android.Manifest
import android.app.Activity
import android.content.*
import android.database.sqlite.SQLiteDatabase
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.*
import androidx.databinding.DataBindingUtil
import elong.androidApp.chapter2Activity.Chapter2Che1PhanActivity
import elong.androidApp.chapter2Activity.Chapter2CheToanBoActivity
import elong.androidApp.chapter2Activity.Chapter2SendDataActivity
import elong.androidApp.chapter2Activity.Chapter2SendDatanAnswerActivity
import elong.androidApp.chapter3ContentProvider.Chapter3ContentProviderReadContact
import elong.androidApp.chapter3ContentProvider.Chapter3ContentProviderReadSMS
import elong.androidApp.databinding.ActivityMainChapter23Binding
import elong.androidApp.services.chapter2ImplicitIntent.ImplicitIntent
import elong.androidApp.services.chapter3.AssetsSharedPreferences
import elong.androidApp.services.chapter3.DanhBaDatabaseService
import elong.androidApp.services.chapter3_8.DatabaseServices
import elong.androidApp.services.chapter3.MusicDatabaseService
import elong.modelView.mainActivityChapter1EventOnView.DanhBas
import elong.modelView.mainActivityChapter1EventOnView.Musics
import elong.modelView.mainActivityChapter23.ExplicitIntents
import elong.modelView.mainActivityChapter23.ExplicitIntentsFeedbackData
import elong.modelView.mainActivityChapter23.ImplicitIntents
import elong.modelView.mainActivityChapter23.SharedPreferencesLogin
import elong.models.chapter1.Employees
import elong.models.chapter1_2_3_7.DanhBa
import elong.models.chapter1_3.Music

@Suppress("DEPRECATED_IDENTITY_EQUALS")
class MainActivityChapter2Chapter3 : AppCompatActivity() {
    var binding: ActivityMainChapter23Binding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_chapter_2_3)
        addControls()
        addEvents()
        dataBinding()
    }

    private fun addControls() {
        addControlsChapter2()   /**CHƯƠNG 2: ACTIVITY, EXPLICIT INTENT and IMPLICIT INTENT*/
        addControlsChapter3()   /**CHƯƠNG 3: QUẢN LÝ DỮ LIỆU VÀ CONTENTPROVIDER*/
    }
    private fun addEvents() {
        addEventChapter2()      /**CHƯƠNG 2: ACTIVITY, EXPLICIT INTENT and IMPLICIT INTENT*/
        addEventChapter3()      /**CHƯƠNG 3: QUẢN LÝ DỮ LIỆU VÀ CONTENTPROVIDER*/
    }
    private fun dataBinding() {
        binding= DataBindingUtil.setContentView(this@MainActivityChapter2Chapter3,R.layout.activity_main_chapter_2_3)
        dataBindingChapter2()
        dataBindingChapter3()
    }
    /**PHẦN XỬ LÝ CHUNG CHO CHƯƠNG 2 VÀ 3: CHƯƠNG2-> ACTIVITY,EXPLICIT INTENT & IMPLICIT INTENT và CHƯƠNG3-> ASSETS, SHARED PREFERENCES, QUẢN LÝ DỮ LIỆU VÀ CONTENTPROVIDER*/
    override fun    /*Lifetime of activity(chapter2) and Save Status (chapter3)*/   onPause() {
        super.onPause()                                                         /**CHƯƠNG 2: Activity and lifetime of activity*/
        Toast.makeText(this@MainActivityChapter2Chapter3, "trạng thái: onPause", Toast.LENGTH_SHORT).show()
        addControlChapter3AssetsAndSharedPreferencesLoginSaveStatusInOnPause()  /**CHƯƠNG 3: Assets và Shared Preferences (Lưu trạng thái của Login vào onPause)*/
    }
    override fun    /*Lifetime of activity(chapter2) and Restore Status (chapter3)*/onResume() {
        super.onResume()                                                        /**CHƯƠNG 2: Activity and lifetime of activity*/
        Toast.makeText(this@MainActivityChapter2Chapter3, "trạng thái: onResume", Toast.LENGTH_SHORT).show()
        addControlChapter3AssetsAndSharedPreferencesLoginSaveStatusInOnResume() /**CHƯƠNG 3: Assets và Shared Preferences (Phục hồi trạng thái của Login vào onResume)*/
    }

    /**CHƯƠNG 2: ACTIVITY, EXPLICIT INTENT and IMPLICIT INTENT*/
    private fun addControlsChapter2() {
        addControlsChapter2ActivitynLifetime()      /**Activity and lifetime of activity (Cần config trong file Manifests).*/
    }
    private fun addEventChapter2() {
        addEventChapter2ActivitynLifetime()         /**Activity and lifetime of activity (Cần config trong file Manifests).*/
    }
    private fun dataBindingChapter2() {
        /**Explicit Intent (Cần config trong file Manifests).Add thêm 2 Activity là (Chapter2SendDataActivity, activity_chapter2_send_data.xml) và (Chapter2SendDatanAnswerActivity, activity_chapter2_send_data_n_answer.xml)*/
        var explicitIntents:ExplicitIntents= ExplicitIntents()  /*gửi dữ liệu đi (xử lý gửi đi trong ExplicitIntents), phía nhận data xử lý tại ExplicitIntentsReceiveData*/
        binding!!.explicitIntents=explicitIntents
        var explicitIntentsFeedback:Intent=intent               /*nhận kết quả trả về (xử lý nhận kq trả về tại ExplicitIntentsFeedbackData)*/
        var uscln=explicitIntentsFeedback.getStringExtra("ketquaUSCLN")
        if (uscln!=null) {
            var explicitIntentsFeedbackData: ExplicitIntentsFeedbackData = ExplicitIntentsFeedbackData("uscln${uscln.substring(uscln.indexOf("="))}")
            binding!!.explicitIntentsFeedbackData = explicitIntentsFeedbackData
        }
        /**Intent gọi đến các ứng dụng của HĐH (Implicit Intent) -> Add thêm file ImplicitIntent trong services, ImplicitIntents trong modelView và xử lý service trong file services/chapter2ImplicitIntent/ImplicitIntent*/
        var implicitIntents:ImplicitIntents= ImplicitIntents()
        binding!!.implicitIntents=implicitIntents
        /**PROJECT CHƯƠNG 2: ACTIVITY, EXPLICIT INTENT and IMPLICIT INTENT -> Add thêm Activity là MainActivitySMSproject, activity_chapter2_activity_sms_project.xml*/
//        var danhBas:DanhBas=DanhBas()
//        binding!!.danhbasInfor=danhBas
    }
    /**Activity and lifetime of activity (Cần config trong file Manifests).Add thêm 2 Activity là (Chapter2Che1PhanActivity, activity_chapter2_che1_phan.xml) và (Chapter2CheToanBoActivity, activity_chapter2_che_toan_bo.xml) */
    var btnCheToanBo: Button?=null; var btnCheMotPhan: Button?=null
    private fun     /*Activity and lifetime of activity - controls*/                addControlsChapter2ActivitynLifetime() {
        btnCheToanBo=findViewById(R.id.btnCheToanBo)
        btnCheMotPhan=findViewById(R.id.btnCheMotPhan)
    }
    private fun     /*Activity and lifetime of activity - events (che màn hình)*/   addEventChapter2ActivitynLifetime() {
        btnCheToanBo!!.setOnClickListener { view ->      //che khuất 1 phần
            var intent: Intent = Intent(this@MainActivityChapter2Chapter3, Chapter2CheToanBoActivity::class.java)
            startActivity(intent)
        }
        btnCheMotPhan!!.setOnClickListener { view ->
            var intent: Intent = Intent(this@MainActivityChapter2Chapter3, Chapter2Che1PhanActivity::class.java)
            startActivity(intent)
        }
    }
    override fun    /*Activity and lifetime of activity*/                           onStart() {
        super.onStart()
        Toast.makeText(this@MainActivityChapter2Chapter3, "trạng thái: onStart", Toast.LENGTH_SHORT).show()
    }
    override fun    /*Activity and lifetime of activity*/                           onRestart() {
        super.onRestart()
        Toast.makeText(this@MainActivityChapter2Chapter3, "trạng thái: onRestart", Toast.LENGTH_SHORT).show()
    }
    override fun    /*Activity and lifetime of activity*/                           onStop() {
        super.onStop()
        Toast.makeText(this@MainActivityChapter2Chapter3, "trạng thái: onStop", Toast.LENGTH_SHORT).show()
    }
    override fun    /*Activity and lifetime of activity*/                           onDestroy() {
        super.onDestroy()
        Toast.makeText(this@MainActivityChapter2Chapter3, "trạng thái: onDestroy", Toast.LENGTH_SHORT).show()
    }

    /**CHƯƠNG 3: ASSETS, SHARED PREFERENCES, QUẢN LÝ DỮ LIỆU VÀ CONTENTPROVIDER*/
    private fun addControlsChapter3() {
        addControlChapter3AssetsAndSharedPreferencesFont()                                      /**Assets và Shared Preferences (Font)*/
        addControlChapter3AssetsAndSharedPreferencesPlayMusic()                                 /**Assets và Shared Preferences (Play Music)*/
        addControlChapter3ContentProviderReadContactAndSMSFromMobile()                          /**Content Provider - Đọc danh bạ và tin nhắn trong hệ thống*/
        addControlChapter3SQLiteShowDatabaseToGUIProjectKaraoke()                               /**PROJECT CHƯƠNG 3: KARAOKE (AddControl - Đưa data lên zao diện)*/
    }
    private fun addEventChapter3() {
        addEventChapter3AssetsAndSharedPreferencesFont()                /**Assets và Shared Preferences (Font)*/
        addEventChapter3AssetsAndSharedPreferencesLoginPlayMusic()      /**Assets và Shared Preferences (Play Music)*/
        addEventChapter3ContentProviderReadContactAndSMSFromMobile()    /**Content Provider - Đọc danh bạ và tin nhắn trong hệ thống*/
    }
    private fun dataBindingChapter3() {
        /**Assets và Shared Preferences (Login, lưu thông tin trạng thái đăng nhập trong onPause, và phục hồi thông tin trạng thái đăng  nhập trong onResume). Add thêm SharedPreferencesLogin trong modelView*/
        binding!!.sharedPreferencesLogin=sharedPreferencesLogin
        /**Tương tác với SQLite*/
        dataBindingChapter3SQLite()
    }
    /**Assets và Shared Preferences (Font). Add thêm thư mục assets (con của folder main) -> truy cập đến folder /font trong assets*/
    var txtFont: TextView?=null;var nameSaver:String="TrangThaiFont"/*đặt tên cho SharedPreferences(tên bất kỳ).Nêu ko đặt tên->hệ thống tự động lấy tên là MainActivity.xml*/
    var lvFont: ListView?=null; var sourceListFont:MutableList<String>?=null; var adapterFont: ArrayAdapter<String>?=null
    private fun     /*Assets và Shared Preferences (Font) - Controls*/              addControlChapter3AssetsAndSharedPreferencesFont() {
        txtFont=findViewById(R.id.txtFont)
        lvFont=findViewById(R.id.lvFont)
        sourceListFont= mutableListOf()
        adapterFont=ArrayAdapter<String>(this@MainActivityChapter2Chapter3,android.R.layout.simple_list_item_1,sourceListFont!!)
        lvFont!!.adapter=adapterFont
        AssetsSharedPreferences.AssetsControls.getResourceFromAssetFolder(assets,"font", sourceListFont!!, adapterFont!!) /*lấy danh sách font đưa vào arrayList*/
        try {   /**Sau khi save tại method addEventChapter3AssetsAndSharedPreferencesFontXuLyChangeFont, ta phải khởi tạo lại preferences để khi mở lại pmền vẫn còn*/
        var preferences: SharedPreferences =getSharedPreferences(nameSaver, MODE_PRIVATE)
            var font:String?=preferences!!.getString("font_chu","")   /*lấy trực tiếp ra, ko thấy thì trả về ""(rỗng)*/
            if (font!!.isNotEmpty())                                                /*lúc đầu chạy pmền thì chưa chọn font chữ --> phải để rỗng và ktra có rỗng ko?*/
                txtFont!!.setTypeface(AssetsSharedPreferences.SharedPreferencesControl.restoreStatusInfor(assets,font)) /*nếu ko rỗng thì setType lại. font đc lấy ra*/
        }catch (ex:Exception){
            Log.e("Loi_Font",ex.toString())
        }
    }
    private fun     /*Assets và Shared Preferences (Font) - Event*/                 addEventChapter3AssetsAndSharedPreferencesFont() {
        lvFont!!.setOnItemClickListener { parent, view, position, id -> addEventChapter3AssetsAndSharedPreferencesFontXuLyChangeFont(position) }
    }
    private fun     /*Assets và Shared Preferences - Event (lưu trạng thái Font)*/  addEventChapter3AssetsAndSharedPreferencesFontXuLyChangeFont(position: Int) {
        txtFont!!.typeface = AssetsSharedPreferences.SharedPreferencesControl.returnFolderSavedInAssets(assets,"font",sourceListFont!!,position)  /*chọn folder*/
        /**LƯU TRẠNG THÁI FONT => sử dụng SharedPreferences (đây là lớp cho phép lưu trạng thái, chỉ lưu đc 8 kiểu data cơ sở)*/
        var preferences: SharedPreferences =getSharedPreferences(nameSaver, MODE_PRIVATE)         /*Đốisố 1:tên tập tin muốn đặt; Đốisố 2(MODE_PRIVATE):lưu trong hệ thống.*/
        /*Hàm này ko return null.Tức là ta ko đc ktra:if(preferences==null),reason:getSharedPreferences nếu có sẽ đc gọi, nếu ko có->tự động tạo mới=>do đó ko return null đc*/
        var editor: SharedPreferences.Editor= AssetsSharedPreferences.SharedPreferencesControl.saveStatusInfor(preferences)   /*Lưu lại trạng thái font*/
        editor.putString("font_chu","font/${sourceListFont!![position]}")   /*chọn dòng nào thì lưu dòng đó. Lưu font thì putString. */
        editor.commit()                         /*Khi put thì mới chỉ đánh dấu lưu trữ trạng thái -> cần xác nhận lưu trữ. Xác nhận lưu trữ xuống file xml (lệnh này hay quên)*/
    }
    /**Assets và Shared Preferences (Login, lưu thông tin trạng thái đăng nhập trong onPause, và phục hồi thông tin trạng thái đăng  nhập trong onResume)*/
    var sharedPreferencesLogin:SharedPreferencesLogin= SharedPreferencesLogin()
    var nameInformationLogin:String="LuuThongTinLogin"/*lưu thông tin user,pass(k xlý skiện trong addEvent)*/
    private fun     /*Assets và Shared Preferences(Save Status). Xử lý in onPause*/ addControlChapter3AssetsAndSharedPreferencesLoginSaveStatusInOnPause(){
        var preferences: SharedPreferences =getSharedPreferences(nameInformationLogin, MODE_PRIVATE)/*Yêu cầu: chỉ cần nhập thông tin user,pass chưa làm zì cả.Thoát pmềm vẫn lưu*/
        var editor= AssetsSharedPreferences.SharedPreferencesControl.saveStatusInfor(preferences)  /*lưu trạng thái login vào hàm onPause. */
        editor.putString("User_Name",sharedPreferencesLogin.Username.toString())                                   /*onPause: gặp onPause sẽ bắt đầu vào forgroundlife sẽ TỰ ĐỘNG LƯU*/
        editor.putString("Password",sharedPreferencesLogin.Password.toString())          /*lưu trạng thái password*/
        editor.putBoolean("Save_CheckBox", sharedPreferencesLogin.CheckedSaveInfoLogin == true)   /*lưu trạng thái checkbox*/
        editor.commit()
    }
    private fun     /*Assets và Shared Preferences(Save Status). Xử lý in onResume*/addControlChapter3AssetsAndSharedPreferencesLoginSaveStatusInOnResume(){
        var preferences: SharedPreferences =getSharedPreferences(nameInformationLogin, MODE_PRIVATE)/*onResume: PHỤC HỒI TRẠNG THÁI, xáy ra khi bắt đầu vô forground lifetime*/
        var username: String? =preferences.getString("User_Name","")  /*phục hồi trạng thái login vào hàm onResume    ->  onResume sẽ lấy thông tin đc lưu ra*/
        var password:String? =preferences.getString("Password","")
        var saveChecked:Boolean?=preferences.getBoolean("Save_CheckBox",false)     /*nếu k checked thì lấy false*/
        if (saveChecked==true){                                                                 /*nếu có checked trên zao diện mới phục hồi*/
            sharedPreferencesLogin.Username=username.toString()
            sharedPreferencesLogin.Password=password.toString()
            sharedPreferencesLogin.CheckedSaveInfoLogin=saveChecked
        }
    }
    /**Assets và Shared Preferences (Play Music)*/
    var lvMusic: ListView?=null; var sourceListMusic:MutableList<String>?=null; var adapterMusic: ArrayAdapter<String>?=null
    private fun     /*Assets và Shared Preferences (Play Music) - Control*/         addControlChapter3AssetsAndSharedPreferencesPlayMusic() {
        lvMusic=findViewById(R.id.lvMusic)
        sourceListMusic= mutableListOf()
        adapterMusic= ArrayAdapter(this@MainActivityChapter2Chapter3,android.R.layout.simple_list_item_1,sourceListMusic!!)
        lvMusic!!.adapter=adapterMusic
        AssetsSharedPreferences.AssetsControls.getResourceFromAssetFolder(assets,"music",sourceListMusic!!,adapterMusic!!)  /*Lưu music vào list*/
    }
    private fun     /*Assets và Shared Preferences (Play Music) - Event*/           addEventChapter3AssetsAndSharedPreferencesLoginPlayMusic() {
        lvMusic!!.setOnItemClickListener { parent, view, position, id -> addEventChapter3AssetsAndSharedPreferencesLoginPlayMusicXuLyListenSong(position) }
    }
    private fun     /*Assets và Shared Preferences (Play Music) - Event (play)*/    addEventChapter3AssetsAndSharedPreferencesLoginPlayMusicXuLyListenSong(position:Int){
        AssetsSharedPreferences.MediaControl.playMusicControl(afdMusic = assets.openFd("music/${sourceListMusic!![position]}"))
    }
    /**Tương tác với SQLite (Đưa data lên zao diện)*/
    var DB_PATH_SUFFIX:String="/databases/"             /*folder database của hệ thống*/
    var dbDanhBa: SQLiteDatabase?=null;     var DATABASE_NAME_CONTACT:String="dbContact.sqlite" /*SQLite*/
    /**Tương tác với SQLite (Sao chép Data từ SQLite vào hệ thống)*/
    private fun     /*Sao chép Data từ SQLite (từ file assets) vào mobile system*/  addControlChapter3SQLiteCopyDatabaseFromAssetsToMobileSystem(){
        DatabaseServices.TuongTacSQLite.copyDbToMobileSystem(dbFile = getDatabasePath(DATABASE_NAME_CONTACT), assets,
            DATABASE_NAME_CONTACT, DB_PATH_SUFFIX, applicationInfo.dataDir.toString(),this@MainActivityChapter2Chapter3)
    }
    /**Tương tác với SQLite (AddControl - Đưa data lên zao diện)*/
    private fun     /*Tương tác với SQLite (AddControl - Đưa data lên zao diện)*/   dataBindingChapter3SQLite() {
        addControlChapter3SQLiteCopyDatabaseFromAssetsToMobileSystem()                          /**Tương tác với SQLite (Sao chép Data từ SQLite vào hệ thống)*/
        dbDanhBa=openOrCreateDatabase(DATABASE_NAME_CONTACT, MODE_PRIVATE,null)         /**Tương tác với SQLite (AddControl - Đưa data lên zao diện)*/
        var danhBas:DanhBas=DanhBas(dbDanhBa)
        binding!!.danhbasInfor=danhBas
    }
    /**Content Provider -> Đọc danh bạ và tin nhắn trong hệ thống bằng Content Provider. Add thêm 2 Activity là (Chapter3ContentProviderReadContact, activity_chapter3_content_provider_read_contact.xml) và (Chapter3ContentProviderReadSMS, activity_chapter3_content_provider_read_sms.xml)*/
    var btnReadDanhBaOfMine: Button?=null; var btnReadMessageOfMine: Button?=null
    private fun     /*Content Provider (Đọc danh bạ và tin nhắn) - Controls*/       addControlChapter3ContentProviderReadContactAndSMSFromMobile(){
        btnReadDanhBaOfMine=findViewById(R.id.btnReadDanhBaOfMine)
        btnReadMessageOfMine=findViewById(R.id.btnReadMessageOfMine)
    }
    private fun     /*Content Provider (Đọc danh bạ và tin nhắn) - Event*/          addEventChapter3ContentProviderReadContactAndSMSFromMobile(){
        btnReadDanhBaOfMine!!.setOnClickListener { view -> addEventChapter3ContentProviderReadContactFromMobile() }
        btnReadMessageOfMine!!.setOnClickListener { view -> addEventChapter3ContentProviderReadSMSFromMobile() }
    }
    private fun     /*Content Provider (Đọc danh bạ) - Event*/                      addEventChapter3ContentProviderReadContactFromMobile() {
        var intent: Intent = Intent(this@MainActivityChapter2Chapter3, Chapter3ContentProviderReadContact::class.java)
        startActivity(intent)
    }
    private fun     /*Content Provider (Đọc tin nhắn) - Event*/                     addEventChapter3ContentProviderReadSMSFromMobile() {
        var intent: Intent = Intent(this@MainActivityChapter2Chapter3, Chapter3ContentProviderReadSMS::class.java)
        startActivity(intent)
    }
    /**PROJECT CHƯƠNG 3: ASSETS, SHARED PREFERENCES, QUẢN LÝ DỮ LIỆU VÀ CONTENTPROVIDER*/
    var tabHostMusicDatabase: TabHost?=null; var DATABASE_NAME_PROJECT:String="Arirang.sqlite";
    object database {
        var dbKaraoke: SQLiteDatabase? = null
    }
    private fun     /*PROJECT CHƯƠNG 3: KARAOKE (Controls)*/                        addControlChapter3SQLiteShowDatabaseToGUIProjectKaraoke(){
        tabHostMusicDatabase=findViewById(R.id.tabHostKaraokeDatabase)
        tabHostMusicDatabase!!.setup()
        var tabSongListDatabase:TabHost.TabSpec=tabHostMusicDatabase!!.newTabSpec("tabSongListDatabase")
        var tabSongLikeDatabase:TabHost.TabSpec=tabHostMusicDatabase!!.newTabSpec("tabSongLikeDatabase")
        tabSongListDatabase.setContent(R.id.tabViewKaraokeListSongDatabase)
        tabSongLikeDatabase.setContent(R.id.tabViewKaraokeLikeSongDatabase)
        tabSongListDatabase.setIndicator("Song List")
        tabSongLikeDatabase.setIndicator("Song Like")
        tabHostMusicDatabase!!.addTab(tabSongListDatabase)
        tabHostMusicDatabase!!.addTab(tabSongLikeDatabase)
        addControlChapter3SQLiteCopyDatabaseFromAssetsToMobileSystemProjectKaraoke()            /**PROJECT CHƯƠNG 3: KARAOKE (Sao chép Data từ SQLite vào hệ thống)*/
        dataBindingChapter3SQLitePROJECT()
    }
    private fun     /*PROJECT CHƯƠNG 3: KARAOKE (Sao chép SQLite vào hệ thống)*/    addControlChapter3SQLiteCopyDatabaseFromAssetsToMobileSystemProjectKaraoke(){
        DatabaseServices.TuongTacSQLite.copyDbToMobileSystem(dbFile = getDatabasePath(DATABASE_NAME_PROJECT), assets,
            DATABASE_NAME_PROJECT, DB_PATH_SUFFIX, applicationInfo.dataDir.toString(),this@MainActivityChapter2Chapter3)
    }
    private fun     /*PROJECT CHƯƠNG 3: KARAOKE (data binding)*/                    dataBindingChapter3SQLitePROJECT() {
        database.dbKaraoke=openOrCreateDatabase(DATABASE_NAME_PROJECT, MODE_PRIVATE,null)   /*mở kết nối*/
        var musics:Musics=Musics(database.dbKaraoke)
        binding!!.musicsInfor=musics
    }
}