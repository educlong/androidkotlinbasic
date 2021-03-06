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
        addControlsChapter2()   /**CH????NG 2: ACTIVITY, EXPLICIT INTENT and IMPLICIT INTENT*/
        addControlsChapter3()   /**CH????NG 3: QU???N L?? D??? LI???U V?? CONTENTPROVIDER*/
    }
    private fun addEvents() {
        addEventChapter2()      /**CH????NG 2: ACTIVITY, EXPLICIT INTENT and IMPLICIT INTENT*/
        addEventChapter3()      /**CH????NG 3: QU???N L?? D??? LI???U V?? CONTENTPROVIDER*/
    }
    private fun dataBinding() {
        binding= DataBindingUtil.setContentView(this@MainActivityChapter2Chapter3,R.layout.activity_main_chapter_2_3)
        dataBindingChapter2()
        dataBindingChapter3()
    }
    /**PH???N X??? L?? CHUNG CHO CH????NG 2 V?? 3: CH????NG2-> ACTIVITY,EXPLICIT INTENT & IMPLICIT INTENT v?? CH????NG3-> ASSETS, SHARED PREFERENCES, QU???N L?? D??? LI???U V?? CONTENTPROVIDER*/
    override fun    /*Lifetime of activity(chapter2) and Save Status (chapter3)*/   onPause() {
        super.onPause()                                                         /**CH????NG 2: Activity and lifetime of activity*/
        Toast.makeText(this@MainActivityChapter2Chapter3, "tr???ng th??i: onPause", Toast.LENGTH_SHORT).show()
        addControlChapter3AssetsAndSharedPreferencesLoginSaveStatusInOnPause()  /**CH????NG 3: Assets v?? Shared Preferences (L??u tr???ng th??i c???a Login v??o onPause)*/
    }
    override fun    /*Lifetime of activity(chapter2) and Restore Status (chapter3)*/onResume() {
        super.onResume()                                                        /**CH????NG 2: Activity and lifetime of activity*/
        Toast.makeText(this@MainActivityChapter2Chapter3, "tr???ng th??i: onResume", Toast.LENGTH_SHORT).show()
        addControlChapter3AssetsAndSharedPreferencesLoginSaveStatusInOnResume() /**CH????NG 3: Assets v?? Shared Preferences (Ph???c h???i tr???ng th??i c???a Login v??o onResume)*/
    }

    /**CH????NG 2: ACTIVITY, EXPLICIT INTENT and IMPLICIT INTENT*/
    private fun addControlsChapter2() {
        addControlsChapter2ActivitynLifetime()      /**Activity and lifetime of activity (C???n config trong file Manifests).*/
    }
    private fun addEventChapter2() {
        addEventChapter2ActivitynLifetime()         /**Activity and lifetime of activity (C???n config trong file Manifests).*/
    }
    private fun dataBindingChapter2() {
        /**Explicit Intent (C???n config trong file Manifests).Add th??m 2 Activity l?? (Chapter2SendDataActivity, activity_chapter2_send_data.xml) v?? (Chapter2SendDatanAnswerActivity, activity_chapter2_send_data_n_answer.xml)*/
        var explicitIntents:ExplicitIntents= ExplicitIntents()  /*g???i d??? li???u ??i (x??? l?? g???i ??i trong ExplicitIntents), ph??a nh???n data x??? l?? t???i ExplicitIntentsReceiveData*/
        binding!!.explicitIntents=explicitIntents
        var explicitIntentsFeedback:Intent=intent               /*nh???n k???t qu??? tr??? v??? (x??? l?? nh???n kq tr??? v??? t???i ExplicitIntentsFeedbackData)*/
        var uscln=explicitIntentsFeedback.getStringExtra("ketquaUSCLN")
        if (uscln!=null) {
            var explicitIntentsFeedbackData: ExplicitIntentsFeedbackData = ExplicitIntentsFeedbackData("uscln${uscln.substring(uscln.indexOf("="))}")
            binding!!.explicitIntentsFeedbackData = explicitIntentsFeedbackData
        }
        /**Intent g???i ?????n c??c ???ng d???ng c???a H??H (Implicit Intent) -> Add th??m file ImplicitIntent trong services, ImplicitIntents trong modelView v?? x??? l?? service trong file services/chapter2ImplicitIntent/ImplicitIntent*/
        var implicitIntents:ImplicitIntents= ImplicitIntents()
        binding!!.implicitIntents=implicitIntents
        /**PROJECT CH????NG 2: ACTIVITY, EXPLICIT INTENT and IMPLICIT INTENT -> Add th??m Activity l?? MainActivitySMSproject, activity_chapter2_activity_sms_project.xml*/
//        var danhBas:DanhBas=DanhBas()
//        binding!!.danhbasInfor=danhBas
    }
    /**Activity and lifetime of activity (C???n config trong file Manifests).Add th??m 2 Activity l?? (Chapter2Che1PhanActivity, activity_chapter2_che1_phan.xml) v?? (Chapter2CheToanBoActivity, activity_chapter2_che_toan_bo.xml) */
    var btnCheToanBo: Button?=null; var btnCheMotPhan: Button?=null
    private fun     /*Activity and lifetime of activity - controls*/                addControlsChapter2ActivitynLifetime() {
        btnCheToanBo=findViewById(R.id.btnCheToanBo)
        btnCheMotPhan=findViewById(R.id.btnCheMotPhan)
    }
    private fun     /*Activity and lifetime of activity - events (che m??n h??nh)*/   addEventChapter2ActivitynLifetime() {
        btnCheToanBo!!.setOnClickListener { view ->      //che khu???t 1 ph???n
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
        Toast.makeText(this@MainActivityChapter2Chapter3, "tr???ng th??i: onStart", Toast.LENGTH_SHORT).show()
    }
    override fun    /*Activity and lifetime of activity*/                           onRestart() {
        super.onRestart()
        Toast.makeText(this@MainActivityChapter2Chapter3, "tr???ng th??i: onRestart", Toast.LENGTH_SHORT).show()
    }
    override fun    /*Activity and lifetime of activity*/                           onStop() {
        super.onStop()
        Toast.makeText(this@MainActivityChapter2Chapter3, "tr???ng th??i: onStop", Toast.LENGTH_SHORT).show()
    }
    override fun    /*Activity and lifetime of activity*/                           onDestroy() {
        super.onDestroy()
        Toast.makeText(this@MainActivityChapter2Chapter3, "tr???ng th??i: onDestroy", Toast.LENGTH_SHORT).show()
    }

    /**CH????NG 3: ASSETS, SHARED PREFERENCES, QU???N L?? D??? LI???U V?? CONTENTPROVIDER*/
    private fun addControlsChapter3() {
        addControlChapter3AssetsAndSharedPreferencesFont()                                      /**Assets v?? Shared Preferences (Font)*/
        addControlChapter3AssetsAndSharedPreferencesPlayMusic()                                 /**Assets v?? Shared Preferences (Play Music)*/
        addControlChapter3ContentProviderReadContactAndSMSFromMobile()                          /**Content Provider - ?????c danh b??? v?? tin nh???n trong h??? th???ng*/
        addControlChapter3SQLiteShowDatabaseToGUIProjectKaraoke()                               /**PROJECT CH????NG 3: KARAOKE (AddControl - ????a data l??n zao di???n)*/
    }
    private fun addEventChapter3() {
        addEventChapter3AssetsAndSharedPreferencesFont()                /**Assets v?? Shared Preferences (Font)*/
        addEventChapter3AssetsAndSharedPreferencesLoginPlayMusic()      /**Assets v?? Shared Preferences (Play Music)*/
        addEventChapter3ContentProviderReadContactAndSMSFromMobile()    /**Content Provider - ?????c danh b??? v?? tin nh???n trong h??? th???ng*/
    }
    private fun dataBindingChapter3() {
        /**Assets v?? Shared Preferences (Login, l??u th??ng tin tr???ng th??i ????ng nh???p trong onPause, v?? ph???c h???i th??ng tin tr???ng th??i ????ng  nh???p trong onResume). Add th??m SharedPreferencesLogin trong modelView*/
        binding!!.sharedPreferencesLogin=sharedPreferencesLogin
        /**T????ng t??c v???i SQLite*/
        dataBindingChapter3SQLite()
    }
    /**Assets v?? Shared Preferences (Font). Add th??m th?? m???c assets (con c???a folder main) -> truy c???p ?????n folder /font trong assets*/
    var txtFont: TextView?=null;var nameSaver:String="TrangThaiFont"/*?????t t??n cho SharedPreferences(t??n b???t k???).N??u ko ?????t t??n->h??? th???ng t??? ?????ng l???y t??n l?? MainActivity.xml*/
    var lvFont: ListView?=null; var sourceListFont:MutableList<String>?=null; var adapterFont: ArrayAdapter<String>?=null
    private fun     /*Assets v?? Shared Preferences (Font) - Controls*/              addControlChapter3AssetsAndSharedPreferencesFont() {
        txtFont=findViewById(R.id.txtFont)
        lvFont=findViewById(R.id.lvFont)
        sourceListFont= mutableListOf()
        adapterFont=ArrayAdapter<String>(this@MainActivityChapter2Chapter3,android.R.layout.simple_list_item_1,sourceListFont!!)
        lvFont!!.adapter=adapterFont
        AssetsSharedPreferences.AssetsControls.getResourceFromAssetFolder(assets,"font", sourceListFont!!, adapterFont!!) /*l???y danh s??ch font ????a v??o arrayList*/
        try {   /**Sau khi save t???i method addEventChapter3AssetsAndSharedPreferencesFontXuLyChangeFont, ta ph???i kh???i t???o l???i preferences ????? khi m??? l???i pm???n v???n c??n*/
        var preferences: SharedPreferences =getSharedPreferences(nameSaver, MODE_PRIVATE)
            var font:String?=preferences!!.getString("font_chu","")   /*l???y tr???c ti???p ra, ko th???y th?? tr??? v??? ""(r???ng)*/
            if (font!!.isNotEmpty())                                                /*l??c ?????u ch???y pm???n th?? ch??a ch???n font ch??? --> ph???i ????? r???ng v?? ktra c?? r???ng ko?*/
                txtFont!!.setTypeface(AssetsSharedPreferences.SharedPreferencesControl.restoreStatusInfor(assets,font)) /*n???u ko r???ng th?? setType l???i. font ??c l???y ra*/
        }catch (ex:Exception){
            Log.e("Loi_Font",ex.toString())
        }
    }
    private fun     /*Assets v?? Shared Preferences (Font) - Event*/                 addEventChapter3AssetsAndSharedPreferencesFont() {
        lvFont!!.setOnItemClickListener { parent, view, position, id -> addEventChapter3AssetsAndSharedPreferencesFontXuLyChangeFont(position) }
    }
    private fun     /*Assets v?? Shared Preferences - Event (l??u tr???ng th??i Font)*/  addEventChapter3AssetsAndSharedPreferencesFontXuLyChangeFont(position: Int) {
        txtFont!!.typeface = AssetsSharedPreferences.SharedPreferencesControl.returnFolderSavedInAssets(assets,"font",sourceListFont!!,position)  /*ch???n folder*/
        /**L??U TR???NG TH??I FONT => s??? d???ng SharedPreferences (????y l?? l???p cho ph??p l??u tr???ng th??i, ch??? l??u ??c 8 ki???u data c?? s???)*/
        var preferences: SharedPreferences =getSharedPreferences(nameSaver, MODE_PRIVATE)         /*?????is??? 1:t??n t???p tin mu???n ?????t; ?????is??? 2(MODE_PRIVATE):l??u trong h??? th???ng.*/
        /*H??m n??y ko return null.T???c l?? ta ko ??c ktra:if(preferences==null),reason:getSharedPreferences n???u c?? s??? ??c g???i, n???u ko c??->t??? ?????ng t???o m???i=>do ???? ko return null ??c*/
        var editor: SharedPreferences.Editor= AssetsSharedPreferences.SharedPreferencesControl.saveStatusInfor(preferences)   /*L??u l???i tr???ng th??i font*/
        editor.putString("font_chu","font/${sourceListFont!![position]}")   /*ch???n d??ng n??o th?? l??u d??ng ????. L??u font th?? putString. */
        editor.commit()                         /*Khi put th?? m???i ch??? ????nh d???u l??u tr??? tr???ng th??i -> c???n x??c nh???n l??u tr???. X??c nh???n l??u tr??? xu???ng file xml (l???nh n??y hay qu??n)*/
    }
    /**Assets v?? Shared Preferences (Login, l??u th??ng tin tr???ng th??i ????ng nh???p trong onPause, v?? ph???c h???i th??ng tin tr???ng th??i ????ng  nh???p trong onResume)*/
    var sharedPreferencesLogin:SharedPreferencesLogin= SharedPreferencesLogin()
    var nameInformationLogin:String="LuuThongTinLogin"/*l??u th??ng tin user,pass(k xl?? ski???n trong addEvent)*/
    private fun     /*Assets v?? Shared Preferences(Save Status). X??? l?? in onPause*/ addControlChapter3AssetsAndSharedPreferencesLoginSaveStatusInOnPause(){
        var preferences: SharedPreferences =getSharedPreferences(nameInformationLogin, MODE_PRIVATE)/*Y??u c???u: ch??? c???n nh???p th??ng tin user,pass ch??a l??m z?? c???.Tho??t pm???m v???n l??u*/
        var editor= AssetsSharedPreferences.SharedPreferencesControl.saveStatusInfor(preferences)  /*l??u tr???ng th??i login v??o h??m onPause. */
        editor.putString("User_Name",sharedPreferencesLogin.Username.toString())                                   /*onPause: g???p onPause s??? b???t ?????u v??o forgroundlife s??? T??? ?????NG L??U*/
        editor.putString("Password",sharedPreferencesLogin.Password.toString())          /*l??u tr???ng th??i password*/
        editor.putBoolean("Save_CheckBox", sharedPreferencesLogin.CheckedSaveInfoLogin == true)   /*l??u tr???ng th??i checkbox*/
        editor.commit()
    }
    private fun     /*Assets v?? Shared Preferences(Save Status). X??? l?? in onResume*/addControlChapter3AssetsAndSharedPreferencesLoginSaveStatusInOnResume(){
        var preferences: SharedPreferences =getSharedPreferences(nameInformationLogin, MODE_PRIVATE)/*onResume: PH???C H???I TR???NG TH??I, x??y ra khi b???t ?????u v?? forground lifetime*/
        var username: String? =preferences.getString("User_Name","")  /*ph???c h???i tr???ng th??i login v??o h??m onResume    ->  onResume s??? l???y th??ng tin ??c l??u ra*/
        var password:String? =preferences.getString("Password","")
        var saveChecked:Boolean?=preferences.getBoolean("Save_CheckBox",false)     /*n???u k checked th?? l???y false*/
        if (saveChecked==true){                                                                 /*n???u c?? checked tr??n zao di???n m???i ph???c h???i*/
            sharedPreferencesLogin.Username=username.toString()
            sharedPreferencesLogin.Password=password.toString()
            sharedPreferencesLogin.CheckedSaveInfoLogin=saveChecked
        }
    }
    /**Assets v?? Shared Preferences (Play Music)*/
    var lvMusic: ListView?=null; var sourceListMusic:MutableList<String>?=null; var adapterMusic: ArrayAdapter<String>?=null
    private fun     /*Assets v?? Shared Preferences (Play Music) - Control*/         addControlChapter3AssetsAndSharedPreferencesPlayMusic() {
        lvMusic=findViewById(R.id.lvMusic)
        sourceListMusic= mutableListOf()
        adapterMusic= ArrayAdapter(this@MainActivityChapter2Chapter3,android.R.layout.simple_list_item_1,sourceListMusic!!)
        lvMusic!!.adapter=adapterMusic
        AssetsSharedPreferences.AssetsControls.getResourceFromAssetFolder(assets,"music",sourceListMusic!!,adapterMusic!!)  /*L??u music v??o list*/
    }
    private fun     /*Assets v?? Shared Preferences (Play Music) - Event*/           addEventChapter3AssetsAndSharedPreferencesLoginPlayMusic() {
        lvMusic!!.setOnItemClickListener { parent, view, position, id -> addEventChapter3AssetsAndSharedPreferencesLoginPlayMusicXuLyListenSong(position) }
    }
    private fun     /*Assets v?? Shared Preferences (Play Music) - Event (play)*/    addEventChapter3AssetsAndSharedPreferencesLoginPlayMusicXuLyListenSong(position:Int){
        AssetsSharedPreferences.MediaControl.playMusicControl(afdMusic = assets.openFd("music/${sourceListMusic!![position]}"))
    }
    /**T????ng t??c v???i SQLite (????a data l??n zao di???n)*/
    var DB_PATH_SUFFIX:String="/databases/"             /*folder database c???a h??? th???ng*/
    var dbDanhBa: SQLiteDatabase?=null;     var DATABASE_NAME_CONTACT:String="dbContact.sqlite" /*SQLite*/
    /**T????ng t??c v???i SQLite (Sao ch??p Data t??? SQLite v??o h??? th???ng)*/
    private fun     /*Sao ch??p Data t??? SQLite (t??? file assets) v??o mobile system*/  addControlChapter3SQLiteCopyDatabaseFromAssetsToMobileSystem(){
        DatabaseServices.TuongTacSQLite.copyDbToMobileSystem(dbFile = getDatabasePath(DATABASE_NAME_CONTACT), assets,
            DATABASE_NAME_CONTACT, DB_PATH_SUFFIX, applicationInfo.dataDir.toString(),this@MainActivityChapter2Chapter3)
    }
    /**T????ng t??c v???i SQLite (AddControl - ????a data l??n zao di???n)*/
    private fun     /*T????ng t??c v???i SQLite (AddControl - ????a data l??n zao di???n)*/   dataBindingChapter3SQLite() {
        addControlChapter3SQLiteCopyDatabaseFromAssetsToMobileSystem()                          /**T????ng t??c v???i SQLite (Sao ch??p Data t??? SQLite v??o h??? th???ng)*/
        dbDanhBa=openOrCreateDatabase(DATABASE_NAME_CONTACT, MODE_PRIVATE,null)         /**T????ng t??c v???i SQLite (AddControl - ????a data l??n zao di???n)*/
        var danhBas:DanhBas=DanhBas(dbDanhBa)
        binding!!.danhbasInfor=danhBas
    }
    /**Content Provider -> ?????c danh b??? v?? tin nh???n trong h??? th???ng b???ng Content Provider. Add th??m 2 Activity l?? (Chapter3ContentProviderReadContact, activity_chapter3_content_provider_read_contact.xml) v?? (Chapter3ContentProviderReadSMS, activity_chapter3_content_provider_read_sms.xml)*/
    var btnReadDanhBaOfMine: Button?=null; var btnReadMessageOfMine: Button?=null
    private fun     /*Content Provider (?????c danh b??? v?? tin nh???n) - Controls*/       addControlChapter3ContentProviderReadContactAndSMSFromMobile(){
        btnReadDanhBaOfMine=findViewById(R.id.btnReadDanhBaOfMine)
        btnReadMessageOfMine=findViewById(R.id.btnReadMessageOfMine)
    }
    private fun     /*Content Provider (?????c danh b??? v?? tin nh???n) - Event*/          addEventChapter3ContentProviderReadContactAndSMSFromMobile(){
        btnReadDanhBaOfMine!!.setOnClickListener { view -> addEventChapter3ContentProviderReadContactFromMobile() }
        btnReadMessageOfMine!!.setOnClickListener { view -> addEventChapter3ContentProviderReadSMSFromMobile() }
    }
    private fun     /*Content Provider (?????c danh b???) - Event*/                      addEventChapter3ContentProviderReadContactFromMobile() {
        var intent: Intent = Intent(this@MainActivityChapter2Chapter3, Chapter3ContentProviderReadContact::class.java)
        startActivity(intent)
    }
    private fun     /*Content Provider (?????c tin nh???n) - Event*/                     addEventChapter3ContentProviderReadSMSFromMobile() {
        var intent: Intent = Intent(this@MainActivityChapter2Chapter3, Chapter3ContentProviderReadSMS::class.java)
        startActivity(intent)
    }
    /**PROJECT CH????NG 3: ASSETS, SHARED PREFERENCES, QU???N L?? D??? LI???U V?? CONTENTPROVIDER*/
    var tabHostMusicDatabase: TabHost?=null; var DATABASE_NAME_PROJECT:String="Arirang.sqlite";
    object database {
        var dbKaraoke: SQLiteDatabase? = null
    }
    private fun     /*PROJECT CH????NG 3: KARAOKE (Controls)*/                        addControlChapter3SQLiteShowDatabaseToGUIProjectKaraoke(){
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
        addControlChapter3SQLiteCopyDatabaseFromAssetsToMobileSystemProjectKaraoke()            /**PROJECT CH????NG 3: KARAOKE (Sao ch??p Data t??? SQLite v??o h??? th???ng)*/
        dataBindingChapter3SQLitePROJECT()
    }
    private fun     /*PROJECT CH????NG 3: KARAOKE (Sao ch??p SQLite v??o h??? th???ng)*/    addControlChapter3SQLiteCopyDatabaseFromAssetsToMobileSystemProjectKaraoke(){
        DatabaseServices.TuongTacSQLite.copyDbToMobileSystem(dbFile = getDatabasePath(DATABASE_NAME_PROJECT), assets,
            DATABASE_NAME_PROJECT, DB_PATH_SUFFIX, applicationInfo.dataDir.toString(),this@MainActivityChapter2Chapter3)
    }
    private fun     /*PROJECT CH????NG 3: KARAOKE (data binding)*/                    dataBindingChapter3SQLitePROJECT() {
        database.dbKaraoke=openOrCreateDatabase(DATABASE_NAME_PROJECT, MODE_PRIVATE,null)   /*m??? k???t n???i*/
        var musics:Musics=Musics(database.dbKaraoke)
        binding!!.musicsInfor=musics
    }
}