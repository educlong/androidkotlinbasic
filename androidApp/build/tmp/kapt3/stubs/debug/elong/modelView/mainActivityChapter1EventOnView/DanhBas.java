package elong.modelView.mainActivityChapter1EventOnView;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002B\u0011\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#J\u0010\u0010 \u001a\u00020!2\u0006\u0010$\u001a\u00020\bH\u0002J\u0006\u0010%\u001a\u00020!R4\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR(\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00048G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0005R\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R\"\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018R\u0016\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lelong/modelView/mainActivityChapter1EventOnView/DanhBas;", "Landroidx/databinding/BaseObservable;", "()V", "dbDanhBa", "Landroid/database/sqlite/SQLiteDatabase;", "(Landroid/database/sqlite/SQLiteDatabase;)V", "value", "Landroidx/databinding/ObservableArrayList;", "Lelong/models/chapter1_2_3_7/DanhBa;", "DanhBas", "getDanhBas", "()Landroidx/databinding/ObservableArrayList;", "setDanhBas", "(Landroidx/databinding/ObservableArrayList;)V", "DbDanhBa", "getDbDanhBa", "()Landroid/database/sqlite/SQLiteDatabase;", "setDbDanhBa", "addSaveCodeDanhBa", "Landroidx/databinding/ObservableField;", "", "getAddSaveCodeDanhBa", "()Landroidx/databinding/ObservableField;", "setAddSaveCodeDanhBa", "(Landroidx/databinding/ObservableField;)V", "addSaveNameDanhBa", "getAddSaveNameDanhBa", "setAddSaveNameDanhBa", "addSavePhoneDanhBa", "getAddSavePhoneDanhBa", "setAddSavePhoneDanhBa", "danhBas", "add", "", "view", "Landroid/view/View;", "danhBa", "remove", "androidApp_debug"})
public final class DanhBas extends androidx.databinding.BaseObservable {
    private androidx.databinding.ObservableArrayList<elong.models.chapter1_2_3_7.DanhBa> danhBas;
    @org.jetbrains.annotations.Nullable()
    private androidx.databinding.ObservableField<java.lang.String> addSaveCodeDanhBa;
    @org.jetbrains.annotations.Nullable()
    private androidx.databinding.ObservableField<java.lang.String> addSaveNameDanhBa;
    @org.jetbrains.annotations.Nullable()
    private androidx.databinding.ObservableField<java.lang.String> addSavePhoneDanhBa;
    private android.database.sqlite.SQLiteDatabase dbDanhBa;
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.databinding.ObservableField<java.lang.String> getAddSaveCodeDanhBa() {
        return null;
    }
    
    public final void setAddSaveCodeDanhBa(@org.jetbrains.annotations.Nullable()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.databinding.ObservableField<java.lang.String> getAddSaveNameDanhBa() {
        return null;
    }
    
    public final void setAddSaveNameDanhBa(@org.jetbrains.annotations.Nullable()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.databinding.ObservableField<java.lang.String> getAddSavePhoneDanhBa() {
        return null;
    }
    
    public final void setAddSavePhoneDanhBa(@org.jetbrains.annotations.Nullable()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.databinding.Bindable()
    public final androidx.databinding.ObservableArrayList<elong.models.chapter1_2_3_7.DanhBa> getDanhBas() {
        return null;
    }
    
    public final void setDanhBas(@org.jetbrains.annotations.Nullable()
    androidx.databinding.ObservableArrayList<elong.models.chapter1_2_3_7.DanhBa> value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.databinding.Bindable()
    public final android.database.sqlite.SQLiteDatabase getDbDanhBa() {
        return null;
    }
    
    public final void setDbDanhBa(@org.jetbrains.annotations.Nullable()
    android.database.sqlite.SQLiteDatabase value) {
    }
    
    private final void add(elong.models.chapter1_2_3_7.DanhBa danhBa) {
    }
    
    public final void add(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public final void remove() {
    }
    
    public DanhBas() {
        super();
    }
    
    public DanhBas(@org.jetbrains.annotations.Nullable()
    android.database.sqlite.SQLiteDatabase dbDanhBa) {
        super();
    }
}