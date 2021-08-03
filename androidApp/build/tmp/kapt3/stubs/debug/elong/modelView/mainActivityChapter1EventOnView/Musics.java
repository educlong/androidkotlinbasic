package elong.modelView.mainActivityChapter1EventOnView;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002B\u0011\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0005J\u0006\u0010 \u001a\u00020!J\u000e\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\fJ\u000e\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020\u0014J\u000e\u0010%\u001a\u00020!2\u0006\u0010$\u001a\u00020\u0014R(\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00048G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0005R4\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R\"\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lelong/modelView/mainActivityChapter1EventOnView/Musics;", "Landroidx/databinding/BaseObservable;", "()V", "dbKaraoke", "Landroid/database/sqlite/SQLiteDatabase;", "(Landroid/database/sqlite/SQLiteDatabase;)V", "value", "DbKaraoke", "getDbKaraoke", "()Landroid/database/sqlite/SQLiteDatabase;", "setDbKaraoke", "Landroidx/databinding/ObservableArrayList;", "Lelong/models/chapter1_3/Music;", "Musics", "getMusics", "()Landroidx/databinding/ObservableArrayList;", "setMusics", "(Landroidx/databinding/ObservableArrayList;)V", "addCodeSong", "Landroidx/databinding/ObservableField;", "", "getAddCodeSong", "()Landroidx/databinding/ObservableField;", "setAddCodeSong", "(Landroidx/databinding/ObservableField;)V", "addNameSong", "getAddNameSong", "setAddNameSong", "addSinger", "getAddSinger", "setAddSinger", "musics", "add", "", "music", "tabChange", "s", "tabChangeDatabase", "androidApp_debug"})
public class Musics extends androidx.databinding.BaseObservable {
    private androidx.databinding.ObservableArrayList<elong.models.chapter1_3.Music> musics;
    private android.database.sqlite.SQLiteDatabase dbKaraoke;
    @org.jetbrains.annotations.Nullable()
    private androidx.databinding.ObservableField<java.lang.String> addCodeSong;
    @org.jetbrains.annotations.Nullable()
    private androidx.databinding.ObservableField<java.lang.String> addNameSong;
    @org.jetbrains.annotations.Nullable()
    private androidx.databinding.ObservableField<java.lang.String> addSinger;
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.databinding.ObservableField<java.lang.String> getAddCodeSong() {
        return null;
    }
    
    public final void setAddCodeSong(@org.jetbrains.annotations.Nullable()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.databinding.ObservableField<java.lang.String> getAddNameSong() {
        return null;
    }
    
    public final void setAddNameSong(@org.jetbrains.annotations.Nullable()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.databinding.ObservableField<java.lang.String> getAddSinger() {
        return null;
    }
    
    public final void setAddSinger(@org.jetbrains.annotations.Nullable()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.databinding.Bindable()
    public final androidx.databinding.ObservableArrayList<elong.models.chapter1_3.Music> getMusics() {
        return null;
    }
    
    public final void setMusics(@org.jetbrains.annotations.Nullable()
    androidx.databinding.ObservableArrayList<elong.models.chapter1_3.Music> value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.databinding.Bindable()
    public final android.database.sqlite.SQLiteDatabase getDbKaraoke() {
        return null;
    }
    
    public final void setDbKaraoke(@org.jetbrains.annotations.Nullable()
    android.database.sqlite.SQLiteDatabase value) {
    }
    
    public final void add(@org.jetbrains.annotations.NotNull()
    elong.models.chapter1_3.Music music) {
    }
    
    public final void add() {
    }
    
    public final void tabChange(@org.jetbrains.annotations.NotNull()
    java.lang.String s) {
    }
    
    public final void tabChangeDatabase(@org.jetbrains.annotations.NotNull()
    java.lang.String s) {
    }
    
    public Musics() {
        super();
    }
    
    public Musics(@org.jetbrains.annotations.Nullable()
    android.database.sqlite.SQLiteDatabase dbKaraoke) {
        super();
    }
}