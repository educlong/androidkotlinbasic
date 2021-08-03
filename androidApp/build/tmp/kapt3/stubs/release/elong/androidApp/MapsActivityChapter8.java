package elong.androidApp;

import java.lang.System;

/**
 * Bước 1: -> tự động tạo ra 3 file (2 file Main .java và xml, và 1 file google_maps_api.xml trong res/values/) -> open file google_maps_api.xml ra, copy API_Code
 */
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010G\u001a\u00020HH\u0002J\b\u0010I\u001a\u00020HH\u0002J\b\u0010J\u001a\u00020HH\u0002J\b\u0010K\u001a\u00020HH\u0002J\b\u0010L\u001a\u00020HH\u0002J\b\u0010M\u001a\u00020HH\u0002J\b\u0010N\u001a\u00020HH\u0002J\u001e\u0010O\u001a\u00020H2\u0006\u0010P\u001a\u00020\r2\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u001b06H\u0002J\b\u0010R\u001a\u00020HH\u0002J\b\u0010S\u001a\u00020HH\u0002J\b\u0010T\u001a\u00020HH\u0002J\b\u0010U\u001a\u00020HH\u0002J\u0010\u0010V\u001a\u00020H2\u0006\u0010W\u001a\u00020\rH\u0002J\u0012\u0010X\u001a\u00020H2\b\u0010Y\u001a\u0004\u0018\u00010ZH\u0014J-\u0010[\u001a\u00020H2\u0006\u0010\\\u001a\u00020\r2\u000e\u0010]\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040^2\u0006\u0010_\u001a\u00020`H\u0016\u00a2\u0006\u0002\u0010aR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u000e\u0010\f\u001a\u00020\rX\u0082D\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010$\u001a\u0004\u0018\u00010%X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R\u001c\u0010*\u001a\u0004\u0018\u00010%X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\'\"\u0004\b,\u0010)R\u000e\u0010-\u001a\u00020.X\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010/\u001a\u0004\u0018\u000100X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u00105\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u000106X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010;\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u000106X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u00108\"\u0004\b=\u0010:R\"\u0010>\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u000106X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u00108\"\u0004\b@\u0010:R\u001c\u0010A\u001a\u0004\u0018\u00010BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010D\"\u0004\bE\u0010F\u00a8\u0006b"}, d2 = {"Lelong/androidApp/MapsActivityChapter8;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "DB_NAME_ADDRESS_VKCK_GGMAP", "", "getDB_NAME_ADDRESS_VKCK_GGMAP", "()Ljava/lang/String;", "setDB_NAME_ADDRESS_VKCK_GGMAP", "(Ljava/lang/String;)V", "DB_PATH_SUFFIX_ADDRESS_VKCK_GGMAP", "getDB_PATH_SUFFIX_ADDRESS_VKCK_GGMAP", "setDB_PATH_SUFFIX_ADDRESS_VKCK_GGMAP", "LOCATION_PERMISSION_REQUEST", "", "adapterAddressVkCkGGMap", "Lelong/androidApp/adapter/arrayAdapter/chapter8/AdapterAddressVoChongTui;", "getAdapterAddressVkCkGGMap", "()Lelong/androidApp/adapter/arrayAdapter/chapter8/AdapterAddressVoChongTui;", "setAdapterAddressVkCkGGMap", "(Lelong/androidApp/adapter/arrayAdapter/chapter8/AdapterAddressVoChongTui;)V", "adapterTypeGoogleMap", "Landroid/widget/ArrayAdapter;", "getAdapterTypeGoogleMap", "()Landroid/widget/ArrayAdapter;", "setAdapterTypeGoogleMap", "(Landroid/widget/ArrayAdapter;)V", "adapterVoChongTuiGMap", "Lelong/models/chapter8/VoChongTuiGMap;", "getAdapterVoChongTuiGMap", "setAdapterVoChongTuiGMap", "dbAddressVkCkGGMap", "Landroid/database/sqlite/SQLiteDatabase;", "getDbAddressVkCkGGMap", "()Landroid/database/sqlite/SQLiteDatabase;", "setDbAddressVkCkGGMap", "(Landroid/database/sqlite/SQLiteDatabase;)V", "lvSoTayAddressVkCkGGMap", "Landroid/widget/ListView;", "getLvSoTayAddressVkCkGGMap", "()Landroid/widget/ListView;", "setLvSoTayAddressVkCkGGMap", "(Landroid/widget/ListView;)V", "lvVoChongTuiGMap", "getLvVoChongTuiGMap", "setLvVoChongTuiGMap", "mMap", "Lcom/google/android/gms/maps/GoogleMap;", "progressDialog", "Landroid/app/ProgressDialog;", "getProgressDialog", "()Landroid/app/ProgressDialog;", "setProgressDialog", "(Landroid/app/ProgressDialog;)V", "sourceListAddressVkCkGGMap", "", "getSourceListAddressVkCkGGMap", "()Ljava/util/List;", "setSourceListAddressVkCkGGMap", "(Ljava/util/List;)V", "sourceListTypeGoogleMap", "getSourceListTypeGoogleMap", "setSourceListTypeGoogleMap", "sourceListVoChongTuiGMap", "getSourceListVoChongTuiGMap", "setSourceListVoChongTuiGMap", "spGoogleMapType", "Landroid/widget/Spinner;", "getSpGoogleMapType", "()Landroid/widget/Spinner;", "setSpGoogleMapType", "(Landroid/widget/Spinner;)V", "addControlChapter8AddressVoChongTuiGoogleMap", "", "addControlChapter8CustomeGoogleMap", "addControlChapter8DisplayGoogleMap", "addControlChapter8ForSpinnerAndProgressDialog", "addControlChapter8GetLocationAccess", "addControlChapter8GoogleMap", "addControls", "addEventChapter8ListView", "viTri", "listVkCkTuiGMap", "addEvents", "addEventsChapter8DisplayGoogleMap", "addEventsChapter8HienThiHinhAnhAddressVoChongTuiGMap", "addEventsChapter8HienThiHinhAnhVoChongTuiGMap", "addEventsChapter8XuLyChangeMapDisplayType", "position", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onRequestPermissionsResult", "requestCode", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "androidApp_release"})
public final class MapsActivityChapter8 extends androidx.appcompat.app.AppCompatActivity {
    
    /**
     * PHẦN DÙNG CHUNG:
     */
    private com.google.android.gms.maps.GoogleMap mMap;
    private final int LOCATION_PERMISSION_REQUEST = 1;
    
    /**
     * GOOGLEMAP THÀNH 1 PHẦN CỦA APP (hướng dẫn tạo Map activity ở trên, bao gồm xử lý lấy api và đổi layout trong file xml, add thêm trong strings.xml)
     */
    @org.jetbrains.annotations.Nullable()
    private android.app.ProgressDialog progressDialog;
    @org.jetbrains.annotations.Nullable()
    private android.widget.Spinner spGoogleMapType;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<java.lang.String> sourceListTypeGoogleMap;
    @org.jetbrains.annotations.Nullable()
    private android.widget.ArrayAdapter<java.lang.String> adapterTypeGoogleMap;
    
    /**
     * Custome GoogleMap khi click vào listview (Thêm: file model, adapter cho GMap, layout item_chapter8_vochongtui_gmap.xml, file FakeVoChongTuiGMap để zả lập data)
     */
    @org.jetbrains.annotations.Nullable()
    private android.widget.ListView lvVoChongTuiGMap;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<elong.models.chapter8.VoChongTuiGMap> sourceListVoChongTuiGMap;
    @org.jetbrains.annotations.Nullable()
    private android.widget.ArrayAdapter<elong.models.chapter8.VoChongTuiGMap> adapterVoChongTuiGMap;
    
    /**
     * PROJECT CHƯƠNG 8: SỔ TAY ĐỊA CHỈ VỢ CHỒNG TUI (ĐỊNH ĐƯỜNG ĐI): (Add thêm: file adapter cho listview, layout item_chapter8_vochongtui_listview_for_gmap.xml)
     */
    @org.jetbrains.annotations.Nullable()
    private android.widget.ListView lvSoTayAddressVkCkGGMap;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<elong.models.chapter8.VoChongTuiGMap> sourceListAddressVkCkGGMap;
    @org.jetbrains.annotations.Nullable()
    private elong.androidApp.adapter.arrayAdapter.chapter8.AdapterAddressVoChongTui adapterAddressVkCkGGMap;
    @org.jetbrains.annotations.Nullable()
    private android.database.sqlite.SQLiteDatabase dbAddressVkCkGGMap;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String DB_NAME_ADDRESS_VKCK_GGMAP = "dbSoTayVkCk.sqlite";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String DB_PATH_SUFFIX_ADDRESS_VKCK_GGMAP = "/databases/";
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void addControls() {
    }
    
    private final void addEvents() {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.app.ProgressDialog getProgressDialog() {
        return null;
    }
    
    public final void setProgressDialog(@org.jetbrains.annotations.Nullable()
    android.app.ProgressDialog p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.Spinner getSpGoogleMapType() {
        return null;
    }
    
    public final void setSpGoogleMapType(@org.jetbrains.annotations.Nullable()
    android.widget.Spinner p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getSourceListTypeGoogleMap() {
        return null;
    }
    
    public final void setSourceListTypeGoogleMap(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.ArrayAdapter<java.lang.String> getAdapterTypeGoogleMap() {
        return null;
    }
    
    public final void setAdapterTypeGoogleMap(@org.jetbrains.annotations.Nullable()
    android.widget.ArrayAdapter<java.lang.String> p0) {
    }
    
    private final void addControlChapter8GoogleMap() {
    }
    
    private final void addControlChapter8ForSpinnerAndProgressDialog() {
    }
    
    /**
     * PHẦN DÙNG CHUNG
     */
    private final void addControlChapter8DisplayGoogleMap() {
    }
    
    private final void addControlChapter8GetLocationAccess() {
    }
    
    private final void addEventsChapter8DisplayGoogleMap() {
    }
    
    private final void addEventsChapter8XuLyChangeMapDisplayType(int position) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.ListView getLvVoChongTuiGMap() {
        return null;
    }
    
    public final void setLvVoChongTuiGMap(@org.jetbrains.annotations.Nullable()
    android.widget.ListView p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<elong.models.chapter8.VoChongTuiGMap> getSourceListVoChongTuiGMap() {
        return null;
    }
    
    public final void setSourceListVoChongTuiGMap(@org.jetbrains.annotations.Nullable()
    java.util.List<elong.models.chapter8.VoChongTuiGMap> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.ArrayAdapter<elong.models.chapter8.VoChongTuiGMap> getAdapterVoChongTuiGMap() {
        return null;
    }
    
    public final void setAdapterVoChongTuiGMap(@org.jetbrains.annotations.Nullable()
    android.widget.ArrayAdapter<elong.models.chapter8.VoChongTuiGMap> p0) {
    }
    
    private final void addControlChapter8CustomeGoogleMap() {
    }
    
    private final void addEventsChapter8HienThiHinhAnhVoChongTuiGMap() {
    }
    
    /**
     * PHẦN DÙNG CHUNG
     */
    private final void addEventChapter8ListView(int viTri, java.util.List<elong.models.chapter8.VoChongTuiGMap> listVkCkTuiGMap) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.ListView getLvSoTayAddressVkCkGGMap() {
        return null;
    }
    
    public final void setLvSoTayAddressVkCkGGMap(@org.jetbrains.annotations.Nullable()
    android.widget.ListView p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<elong.models.chapter8.VoChongTuiGMap> getSourceListAddressVkCkGGMap() {
        return null;
    }
    
    public final void setSourceListAddressVkCkGGMap(@org.jetbrains.annotations.Nullable()
    java.util.List<elong.models.chapter8.VoChongTuiGMap> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final elong.androidApp.adapter.arrayAdapter.chapter8.AdapterAddressVoChongTui getAdapterAddressVkCkGGMap() {
        return null;
    }
    
    public final void setAdapterAddressVkCkGGMap(@org.jetbrains.annotations.Nullable()
    elong.androidApp.adapter.arrayAdapter.chapter8.AdapterAddressVoChongTui p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.database.sqlite.SQLiteDatabase getDbAddressVkCkGGMap() {
        return null;
    }
    
    public final void setDbAddressVkCkGGMap(@org.jetbrains.annotations.Nullable()
    android.database.sqlite.SQLiteDatabase p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDB_NAME_ADDRESS_VKCK_GGMAP() {
        return null;
    }
    
    public final void setDB_NAME_ADDRESS_VKCK_GGMAP(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDB_PATH_SUFFIX_ADDRESS_VKCK_GGMAP() {
        return null;
    }
    
    public final void setDB_PATH_SUFFIX_ADDRESS_VKCK_GGMAP(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    private final void addControlChapter8AddressVoChongTuiGoogleMap() {
    }
    
    private final void addEventsChapter8HienThiHinhAnhAddressVoChongTuiGMap() {
    }
    
    public MapsActivityChapter8() {
        super();
    }
}