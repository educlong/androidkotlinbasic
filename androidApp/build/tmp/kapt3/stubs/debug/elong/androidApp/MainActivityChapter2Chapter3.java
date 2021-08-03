package elong.androidApp;

import java.lang.System;

@kotlin.Suppress(names = {"DEPRECATED_IDENTITY_EQUALS"})
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0002\u0085\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010]\u001a\u00020^H\u0002J\b\u0010_\u001a\u00020^H\u0002J\b\u0010`\u001a\u00020^H\u0002J\b\u0010a\u001a\u00020^H\u0002J\b\u0010b\u001a\u00020^H\u0002J\b\u0010c\u001a\u00020^H\u0002J\b\u0010d\u001a\u00020^H\u0002J\b\u0010e\u001a\u00020^H\u0002J\b\u0010f\u001a\u00020^H\u0002J\b\u0010g\u001a\u00020^H\u0002J\b\u0010h\u001a\u00020^H\u0002J\b\u0010i\u001a\u00020^H\u0002J\b\u0010j\u001a\u00020^H\u0002J\b\u0010k\u001a\u00020^H\u0002J\b\u0010l\u001a\u00020^H\u0002J\b\u0010m\u001a\u00020^H\u0002J\u0010\u0010n\u001a\u00020^2\u0006\u0010o\u001a\u00020pH\u0002J\b\u0010q\u001a\u00020^H\u0002J\u0010\u0010r\u001a\u00020^2\u0006\u0010o\u001a\u00020pH\u0002J\b\u0010s\u001a\u00020^H\u0002J\b\u0010t\u001a\u00020^H\u0002J\b\u0010u\u001a\u00020^H\u0002J\b\u0010v\u001a\u00020^H\u0002J\b\u0010w\u001a\u00020^H\u0002J\b\u0010x\u001a\u00020^H\u0002J\b\u0010y\u001a\u00020^H\u0002J\b\u0010z\u001a\u00020^H\u0002J\b\u0010{\u001a\u00020^H\u0002J\u0012\u0010|\u001a\u00020^2\b\u0010}\u001a\u0004\u0018\u00010~H\u0014J\b\u0010\u007f\u001a\u00020^H\u0014J\t\u0010\u0080\u0001\u001a\u00020^H\u0014J\t\u0010\u0081\u0001\u001a\u00020^H\u0014J\t\u0010\u0082\u0001\u001a\u00020^H\u0014J\t\u0010\u0083\u0001\u001a\u00020^H\u0014J\t\u0010\u0084\u0001\u001a\u00020^H\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010$\u001a\u0004\u0018\u00010\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#R\u001c\u0010\'\u001a\u0004\u0018\u00010\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010!\"\u0004\b)\u0010#R\u001c\u0010*\u001a\u0004\u0018\u00010\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010!\"\u0004\b,\u0010#R\u001c\u0010-\u001a\u0004\u0018\u00010.X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001c\u00103\u001a\u0004\u0018\u000104X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001c\u00109\u001a\u0004\u0018\u000104X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u00106\"\u0004\b;\u00108R\u001a\u0010<\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u0006\"\u0004\b>\u0010\bR\u001a\u0010?\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u0006\"\u0004\bA\u0010\bR\u001a\u0010B\u001a\u00020CX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010H\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010IX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\"\u0010N\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010IX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bO\u0010K\"\u0004\bP\u0010MR\u001c\u0010Q\u001a\u0004\u0018\u00010RX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u001c\u0010W\u001a\u0004\u0018\u00010XX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\\u00a8\u0006\u0086\u0001"}, d2 = {"Lelong/androidApp/MainActivityChapter2Chapter3;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "DATABASE_NAME_CONTACT", "", "getDATABASE_NAME_CONTACT", "()Ljava/lang/String;", "setDATABASE_NAME_CONTACT", "(Ljava/lang/String;)V", "DATABASE_NAME_PROJECT", "getDATABASE_NAME_PROJECT", "setDATABASE_NAME_PROJECT", "DB_PATH_SUFFIX", "getDB_PATH_SUFFIX", "setDB_PATH_SUFFIX", "adapterFont", "Landroid/widget/ArrayAdapter;", "getAdapterFont", "()Landroid/widget/ArrayAdapter;", "setAdapterFont", "(Landroid/widget/ArrayAdapter;)V", "adapterMusic", "getAdapterMusic", "setAdapterMusic", "binding", "Lelong/androidApp/databinding/ActivityMainChapter23Binding;", "getBinding", "()Lelong/androidApp/databinding/ActivityMainChapter23Binding;", "setBinding", "(Lelong/androidApp/databinding/ActivityMainChapter23Binding;)V", "btnCheMotPhan", "Landroid/widget/Button;", "getBtnCheMotPhan", "()Landroid/widget/Button;", "setBtnCheMotPhan", "(Landroid/widget/Button;)V", "btnCheToanBo", "getBtnCheToanBo", "setBtnCheToanBo", "btnReadDanhBaOfMine", "getBtnReadDanhBaOfMine", "setBtnReadDanhBaOfMine", "btnReadMessageOfMine", "getBtnReadMessageOfMine", "setBtnReadMessageOfMine", "dbDanhBa", "Landroid/database/sqlite/SQLiteDatabase;", "getDbDanhBa", "()Landroid/database/sqlite/SQLiteDatabase;", "setDbDanhBa", "(Landroid/database/sqlite/SQLiteDatabase;)V", "lvFont", "Landroid/widget/ListView;", "getLvFont", "()Landroid/widget/ListView;", "setLvFont", "(Landroid/widget/ListView;)V", "lvMusic", "getLvMusic", "setLvMusic", "nameInformationLogin", "getNameInformationLogin", "setNameInformationLogin", "nameSaver", "getNameSaver", "setNameSaver", "sharedPreferencesLogin", "Lelong/modelView/mainActivityChapter23/SharedPreferencesLogin;", "getSharedPreferencesLogin", "()Lelong/modelView/mainActivityChapter23/SharedPreferencesLogin;", "setSharedPreferencesLogin", "(Lelong/modelView/mainActivityChapter23/SharedPreferencesLogin;)V", "sourceListFont", "", "getSourceListFont", "()Ljava/util/List;", "setSourceListFont", "(Ljava/util/List;)V", "sourceListMusic", "getSourceListMusic", "setSourceListMusic", "tabHostMusicDatabase", "Landroid/widget/TabHost;", "getTabHostMusicDatabase", "()Landroid/widget/TabHost;", "setTabHostMusicDatabase", "(Landroid/widget/TabHost;)V", "txtFont", "Landroid/widget/TextView;", "getTxtFont", "()Landroid/widget/TextView;", "setTxtFont", "(Landroid/widget/TextView;)V", "addControlChapter3AssetsAndSharedPreferencesFont", "", "addControlChapter3AssetsAndSharedPreferencesLoginSaveStatusInOnPause", "addControlChapter3AssetsAndSharedPreferencesLoginSaveStatusInOnResume", "addControlChapter3AssetsAndSharedPreferencesPlayMusic", "addControlChapter3ContentProviderReadContactAndSMSFromMobile", "addControlChapter3SQLiteCopyDatabaseFromAssetsToMobileSystem", "addControlChapter3SQLiteCopyDatabaseFromAssetsToMobileSystemProjectKaraoke", "addControlChapter3SQLiteShowDatabaseToGUIProjectKaraoke", "addControls", "addControlsChapter2", "addControlsChapter2ActivitynLifetime", "addControlsChapter3", "addEventChapter2", "addEventChapter2ActivitynLifetime", "addEventChapter3", "addEventChapter3AssetsAndSharedPreferencesFont", "addEventChapter3AssetsAndSharedPreferencesFontXuLyChangeFont", "position", "", "addEventChapter3AssetsAndSharedPreferencesLoginPlayMusic", "addEventChapter3AssetsAndSharedPreferencesLoginPlayMusicXuLyListenSong", "addEventChapter3ContentProviderReadContactAndSMSFromMobile", "addEventChapter3ContentProviderReadContactFromMobile", "addEventChapter3ContentProviderReadSMSFromMobile", "addEvents", "dataBinding", "dataBindingChapter2", "dataBindingChapter3", "dataBindingChapter3SQLite", "dataBindingChapter3SQLitePROJECT", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onPause", "onRestart", "onResume", "onStart", "onStop", "database", "androidApp_debug"})
public final class MainActivityChapter2Chapter3 extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.Nullable()
    private elong.androidApp.databinding.ActivityMainChapter23Binding binding;
    
    /**
     * Activity and lifetime of activity (Cần config trong file Manifests).Add thêm 2 Activity là (Chapter2Che1PhanActivity, activity_chapter2_che1_phan.xml) và (Chapter2CheToanBoActivity, activity_chapter2_che_toan_bo.xml)
     */
    @org.jetbrains.annotations.Nullable()
    private android.widget.Button btnCheToanBo;
    @org.jetbrains.annotations.Nullable()
    private android.widget.Button btnCheMotPhan;
    
    /**
     * Assets và Shared Preferences (Font). Add thêm thư mục assets (con của folder main) -> truy cập đến folder /font trong assets
     */
    @org.jetbrains.annotations.Nullable()
    private android.widget.TextView txtFont;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String nameSaver = "TrangThaiFont";
    @org.jetbrains.annotations.Nullable()
    private android.widget.ListView lvFont;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<java.lang.String> sourceListFont;
    @org.jetbrains.annotations.Nullable()
    private android.widget.ArrayAdapter<java.lang.String> adapterFont;
    
    /**
     * Assets và Shared Preferences (Login, lưu thông tin trạng thái đăng nhập trong onPause, và phục hồi thông tin trạng thái đăng  nhập trong onResume)
     */
    @org.jetbrains.annotations.NotNull()
    private elong.modelView.mainActivityChapter23.SharedPreferencesLogin sharedPreferencesLogin;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String nameInformationLogin = "LuuThongTinLogin";
    
    /**
     * Assets và Shared Preferences (Play Music)
     */
    @org.jetbrains.annotations.Nullable()
    private android.widget.ListView lvMusic;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<java.lang.String> sourceListMusic;
    @org.jetbrains.annotations.Nullable()
    private android.widget.ArrayAdapter<java.lang.String> adapterMusic;
    
    /**
     * Tương tác với SQLite (Đưa data lên zao diện)
     */
    @org.jetbrains.annotations.NotNull()
    private java.lang.String DB_PATH_SUFFIX = "/databases/";
    @org.jetbrains.annotations.Nullable()
    private android.database.sqlite.SQLiteDatabase dbDanhBa;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String DATABASE_NAME_CONTACT = "dbContact.sqlite";
    
    /**
     * Content Provider -> Đọc danh bạ và tin nhắn trong hệ thống bằng Content Provider. Add thêm 2 Activity là (Chapter3ContentProviderReadContact, activity_chapter3_content_provider_read_contact.xml) và (Chapter3ContentProviderReadSMS, activity_chapter3_content_provider_read_sms.xml)
     */
    @org.jetbrains.annotations.Nullable()
    private android.widget.Button btnReadDanhBaOfMine;
    @org.jetbrains.annotations.Nullable()
    private android.widget.Button btnReadMessageOfMine;
    
    /**
     * PROJECT CHƯƠNG 3: ASSETS, SHARED PREFERENCES, QUẢN LÝ DỮ LIỆU VÀ CONTENTPROVIDER
     */
    @org.jetbrains.annotations.Nullable()
    private android.widget.TabHost tabHostMusicDatabase;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String DATABASE_NAME_PROJECT = "Arirang.sqlite";
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final elong.androidApp.databinding.ActivityMainChapter23Binding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.Nullable()
    elong.androidApp.databinding.ActivityMainChapter23Binding p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void addControls() {
    }
    
    private final void addEvents() {
    }
    
    private final void dataBinding() {
    }
    
    /**
     * PHẦN XỬ LÝ CHUNG CHO CHƯƠNG 2 VÀ 3: CHƯƠNG2-> ACTIVITY,EXPLICIT INTENT & IMPLICIT INTENT và CHƯƠNG3-> ASSETS, SHARED PREFERENCES, QUẢN LÝ DỮ LIỆU VÀ CONTENTPROVIDER
     */
    @java.lang.Override()
    protected void onPause() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    /**
     * CHƯƠNG 2: ACTIVITY, EXPLICIT INTENT and IMPLICIT INTENT
     */
    private final void addControlsChapter2() {
    }
    
    private final void addEventChapter2() {
    }
    
    private final void dataBindingChapter2() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.Button getBtnCheToanBo() {
        return null;
    }
    
    public final void setBtnCheToanBo(@org.jetbrains.annotations.Nullable()
    android.widget.Button p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.Button getBtnCheMotPhan() {
        return null;
    }
    
    public final void setBtnCheMotPhan(@org.jetbrains.annotations.Nullable()
    android.widget.Button p0) {
    }
    
    private final void addControlsChapter2ActivitynLifetime() {
    }
    
    private final void addEventChapter2ActivitynLifetime() {
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    @java.lang.Override()
    protected void onRestart() {
    }
    
    @java.lang.Override()
    protected void onStop() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    /**
     * CHƯƠNG 3: ASSETS, SHARED PREFERENCES, QUẢN LÝ DỮ LIỆU VÀ CONTENTPROVIDER
     */
    private final void addControlsChapter3() {
    }
    
    private final void addEventChapter3() {
    }
    
    private final void dataBindingChapter3() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.TextView getTxtFont() {
        return null;
    }
    
    public final void setTxtFont(@org.jetbrains.annotations.Nullable()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNameSaver() {
        return null;
    }
    
    public final void setNameSaver(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.ListView getLvFont() {
        return null;
    }
    
    public final void setLvFont(@org.jetbrains.annotations.Nullable()
    android.widget.ListView p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getSourceListFont() {
        return null;
    }
    
    public final void setSourceListFont(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.ArrayAdapter<java.lang.String> getAdapterFont() {
        return null;
    }
    
    public final void setAdapterFont(@org.jetbrains.annotations.Nullable()
    android.widget.ArrayAdapter<java.lang.String> p0) {
    }
    
    private final void addControlChapter3AssetsAndSharedPreferencesFont() {
    }
    
    private final void addEventChapter3AssetsAndSharedPreferencesFont() {
    }
    
    private final void addEventChapter3AssetsAndSharedPreferencesFontXuLyChangeFont(int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final elong.modelView.mainActivityChapter23.SharedPreferencesLogin getSharedPreferencesLogin() {
        return null;
    }
    
    public final void setSharedPreferencesLogin(@org.jetbrains.annotations.NotNull()
    elong.modelView.mainActivityChapter23.SharedPreferencesLogin p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNameInformationLogin() {
        return null;
    }
    
    public final void setNameInformationLogin(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    private final void addControlChapter3AssetsAndSharedPreferencesLoginSaveStatusInOnPause() {
    }
    
    private final void addControlChapter3AssetsAndSharedPreferencesLoginSaveStatusInOnResume() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.ListView getLvMusic() {
        return null;
    }
    
    public final void setLvMusic(@org.jetbrains.annotations.Nullable()
    android.widget.ListView p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getSourceListMusic() {
        return null;
    }
    
    public final void setSourceListMusic(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.ArrayAdapter<java.lang.String> getAdapterMusic() {
        return null;
    }
    
    public final void setAdapterMusic(@org.jetbrains.annotations.Nullable()
    android.widget.ArrayAdapter<java.lang.String> p0) {
    }
    
    private final void addControlChapter3AssetsAndSharedPreferencesPlayMusic() {
    }
    
    private final void addEventChapter3AssetsAndSharedPreferencesLoginPlayMusic() {
    }
    
    private final void addEventChapter3AssetsAndSharedPreferencesLoginPlayMusicXuLyListenSong(int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDB_PATH_SUFFIX() {
        return null;
    }
    
    public final void setDB_PATH_SUFFIX(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.database.sqlite.SQLiteDatabase getDbDanhBa() {
        return null;
    }
    
    public final void setDbDanhBa(@org.jetbrains.annotations.Nullable()
    android.database.sqlite.SQLiteDatabase p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDATABASE_NAME_CONTACT() {
        return null;
    }
    
    public final void setDATABASE_NAME_CONTACT(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    /**
     * Tương tác với SQLite (Sao chép Data từ SQLite vào hệ thống)
     */
    private final void addControlChapter3SQLiteCopyDatabaseFromAssetsToMobileSystem() {
    }
    
    /**
     * Tương tác với SQLite (AddControl - Đưa data lên zao diện)
     */
    private final void dataBindingChapter3SQLite() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.Button getBtnReadDanhBaOfMine() {
        return null;
    }
    
    public final void setBtnReadDanhBaOfMine(@org.jetbrains.annotations.Nullable()
    android.widget.Button p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.Button getBtnReadMessageOfMine() {
        return null;
    }
    
    public final void setBtnReadMessageOfMine(@org.jetbrains.annotations.Nullable()
    android.widget.Button p0) {
    }
    
    private final void addControlChapter3ContentProviderReadContactAndSMSFromMobile() {
    }
    
    private final void addEventChapter3ContentProviderReadContactAndSMSFromMobile() {
    }
    
    private final void addEventChapter3ContentProviderReadContactFromMobile() {
    }
    
    private final void addEventChapter3ContentProviderReadSMSFromMobile() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.TabHost getTabHostMusicDatabase() {
        return null;
    }
    
    public final void setTabHostMusicDatabase(@org.jetbrains.annotations.Nullable()
    android.widget.TabHost p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDATABASE_NAME_PROJECT() {
        return null;
    }
    
    public final void setDATABASE_NAME_PROJECT(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    private final void addControlChapter3SQLiteShowDatabaseToGUIProjectKaraoke() {
    }
    
    private final void addControlChapter3SQLiteCopyDatabaseFromAssetsToMobileSystemProjectKaraoke() {
    }
    
    private final void dataBindingChapter3SQLitePROJECT() {
    }
    
    public MainActivityChapter2Chapter3() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lelong/androidApp/MainActivityChapter2Chapter3$database;", "", "()V", "dbKaraoke", "Landroid/database/sqlite/SQLiteDatabase;", "getDbKaraoke", "()Landroid/database/sqlite/SQLiteDatabase;", "setDbKaraoke", "(Landroid/database/sqlite/SQLiteDatabase;)V", "androidApp_debug"})
    public static final class database {
        @org.jetbrains.annotations.Nullable()
        private static android.database.sqlite.SQLiteDatabase dbKaraoke;
        @org.jetbrains.annotations.NotNull()
        public static final elong.androidApp.MainActivityChapter2Chapter3.database INSTANCE = null;
        
        @org.jetbrains.annotations.Nullable()
        public final android.database.sqlite.SQLiteDatabase getDbKaraoke() {
            return null;
        }
        
        public final void setDbKaraoke(@org.jetbrains.annotations.Nullable()
        android.database.sqlite.SQLiteDatabase p0) {
        }
        
        private database() {
            super();
        }
    }
}