package elong.androidApp.adapter.arrayAdapter.chapter7;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0018\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u00062\u0006\u00101\u001a\u000202H\u0002J\u0018\u00103\u001a\u00020/2\u0006\u00100\u001a\u00020\u00062\u0006\u00101\u001a\u000202H\u0002J\"\u00104\u001a\u0002022\u0006\u00100\u001a\u00020\u00062\b\u00105\u001a\u0004\u0018\u0001022\u0006\u00106\u001a\u000207H\u0017R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010\"\u001a\u0004\u0018\u00010\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!R\u001c\u0010%\u001a\u0004\u0018\u00010\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001f\"\u0004\b\'\u0010!R\u001c\u0010(\u001a\u0004\u0018\u00010\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001f\"\u0004\b*\u0010!R\u001c\u0010+\u001a\u0004\u0018\u00010\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u001f\"\u0004\b-\u0010!\u00a8\u00068"}, d2 = {"Lelong/androidApp/adapter/arrayAdapter/chapter7/AdapterTyZaDongA;", "Landroid/widget/ArrayAdapter;", "Lelong/models/chapter7/TyZaDongA;", "activity", "Landroid/app/Activity;", "resource", "", "objects", "", "(Landroid/app/Activity;ILjava/util/List;)V", "getActivity", "()Landroid/app/Activity;", "setActivity", "(Landroid/app/Activity;)V", "imgCountryTyZaJSON", "Landroid/widget/ImageView;", "getImgCountryTyZaJSON", "()Landroid/widget/ImageView;", "setImgCountryTyZaJSON", "(Landroid/widget/ImageView;)V", "getObjects", "()Ljava/util/List;", "setObjects", "(Ljava/util/List;)V", "getResource", "()I", "setResource", "(I)V", "txtBanChuyenKhoanTyZaJSON", "Landroid/widget/TextView;", "getTxtBanChuyenKhoanTyZaJSON", "()Landroid/widget/TextView;", "setTxtBanChuyenKhoanTyZaJSON", "(Landroid/widget/TextView;)V", "txtBanTienMatTyZaJSON", "getTxtBanTienMatTyZaJSON", "setTxtBanTienMatTyZaJSON", "txtCountryTyZaJSON", "getTxtCountryTyZaJSON", "setTxtCountryTyZaJSON", "txtMuaChuyenKhoanTyZaJSON", "getTxtMuaChuyenKhoanTyZaJSON", "setTxtMuaChuyenKhoanTyZaJSON", "txtMuaTienMatTyZaJSON", "getTxtMuaTienMatTyZaJSON", "setTxtMuaTienMatTyZaJSON", "addControls", "", "position", "row", "Landroid/view/View;", "addEvents", "getView", "convertView", "parent", "Landroid/view/ViewGroup;", "androidApp_release"})
public final class AdapterTyZaDongA extends android.widget.ArrayAdapter<elong.models.chapter7.TyZaDongA> {
    @org.jetbrains.annotations.Nullable()
    private android.widget.ImageView imgCountryTyZaJSON;
    @org.jetbrains.annotations.Nullable()
    private android.widget.TextView txtCountryTyZaJSON;
    @org.jetbrains.annotations.Nullable()
    private android.widget.TextView txtMuaTienMatTyZaJSON;
    @org.jetbrains.annotations.Nullable()
    private android.widget.TextView txtMuaChuyenKhoanTyZaJSON;
    @org.jetbrains.annotations.Nullable()
    private android.widget.TextView txtBanTienMatTyZaJSON;
    @org.jetbrains.annotations.Nullable()
    private android.widget.TextView txtBanChuyenKhoanTyZaJSON;
    @org.jetbrains.annotations.NotNull()
    private android.app.Activity activity;
    private int resource;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<elong.models.chapter7.TyZaDongA> objects;
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.ImageView getImgCountryTyZaJSON() {
        return null;
    }
    
    public final void setImgCountryTyZaJSON(@org.jetbrains.annotations.Nullable()
    android.widget.ImageView p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.TextView getTxtCountryTyZaJSON() {
        return null;
    }
    
    public final void setTxtCountryTyZaJSON(@org.jetbrains.annotations.Nullable()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.TextView getTxtMuaTienMatTyZaJSON() {
        return null;
    }
    
    public final void setTxtMuaTienMatTyZaJSON(@org.jetbrains.annotations.Nullable()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.TextView getTxtMuaChuyenKhoanTyZaJSON() {
        return null;
    }
    
    public final void setTxtMuaChuyenKhoanTyZaJSON(@org.jetbrains.annotations.Nullable()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.TextView getTxtBanTienMatTyZaJSON() {
        return null;
    }
    
    public final void setTxtBanTienMatTyZaJSON(@org.jetbrains.annotations.Nullable()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.TextView getTxtBanChuyenKhoanTyZaJSON() {
        return null;
    }
    
    public final void setTxtBanChuyenKhoanTyZaJSON(@org.jetbrains.annotations.Nullable()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"ViewHolder"})
    @java.lang.Override()
    public android.view.View getView(int position, @org.jetbrains.annotations.Nullable()
    android.view.View convertView, @org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent) {
        return null;
    }
    
    private final void addControls(int position, android.view.View row) {
    }
    
    private final void addEvents(int position, android.view.View row) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Activity getActivity() {
        return null;
    }
    
    public final void setActivity(@org.jetbrains.annotations.NotNull()
    android.app.Activity p0) {
    }
    
    public final int getResource() {
        return 0;
    }
    
    public final void setResource(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<elong.models.chapter7.TyZaDongA> getObjects() {
        return null;
    }
    
    public final void setObjects(@org.jetbrains.annotations.NotNull()
    java.util.List<elong.models.chapter7.TyZaDongA> p0) {
    }
    
    public AdapterTyZaDongA(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, int resource, @org.jetbrains.annotations.NotNull()
    java.util.List<elong.models.chapter7.TyZaDongA> objects) {
        super(null, 0);
    }
}