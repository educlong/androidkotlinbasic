package elong.models.chapter1_3;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B/\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tB%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\nB\u000f\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\u000bJ\u0006\u0010(\u001a\u00020)J\b\u0010*\u001a\u00020\u0004H\u0016R(\u0010\r\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u00048G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R(\u0010\u0012\u001a\u0004\u0018\u00010\b2\b\u0010\f\u001a\u0004\u0018\u00010\b8G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R(\u0010\u0017\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u00048G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u0019\u0010\u0011R(\u0010\u001a\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u00048G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001b\u0010\u000f\"\u0004\b\u001c\u0010\u0011R\"\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010$\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\'R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"}, d2 = {"Lelong/models/chapter1_3/Music;", "Ljava/io/Serializable;", "Landroidx/databinding/BaseObservable;", "codeSong", "", "nameSong", "singer", "like", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "(Z)V", "value", "CodeSong", "getCodeSong", "()Ljava/lang/String;", "setCodeSong", "(Ljava/lang/String;)V", "Like", "getLike", "()Ljava/lang/Boolean;", "setLike", "(Ljava/lang/Boolean;)V", "NameSong", "getNameSong", "setNameSong", "Singer", "getSinger", "setSinger", "clickDislike", "Landroidx/databinding/ObservableField;", "", "getClickDislike", "()Landroidx/databinding/ObservableField;", "setClickDislike", "(Landroidx/databinding/ObservableField;)V", "clickLike", "getClickLike", "setClickLike", "Ljava/lang/Boolean;", "diplay", "", "toString", "androidApp_debug"})
public final class Music extends androidx.databinding.BaseObservable implements java.io.Serializable {
    private java.lang.String codeSong;
    private java.lang.String nameSong;
    private java.lang.String singer;
    private java.lang.Boolean like;
    @org.jetbrains.annotations.Nullable()
    private androidx.databinding.ObservableField<java.lang.Integer> clickLike;
    @org.jetbrains.annotations.Nullable()
    private androidx.databinding.ObservableField<java.lang.Integer> clickDislike;
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.databinding.ObservableField<java.lang.Integer> getClickLike() {
        return null;
    }
    
    public final void setClickLike(@org.jetbrains.annotations.Nullable()
    androidx.databinding.ObservableField<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.databinding.ObservableField<java.lang.Integer> getClickDislike() {
        return null;
    }
    
    public final void setClickDislike(@org.jetbrains.annotations.Nullable()
    androidx.databinding.ObservableField<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.databinding.Bindable()
    public final java.lang.String getCodeSong() {
        return null;
    }
    
    public final void setCodeSong(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.databinding.Bindable()
    public final java.lang.String getNameSong() {
        return null;
    }
    
    public final void setNameSong(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.databinding.Bindable()
    public final java.lang.String getSinger() {
        return null;
    }
    
    public final void setSinger(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.databinding.Bindable()
    public final java.lang.Boolean getLike() {
        return null;
    }
    
    public final void setLike(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean value) {
    }
    
    public final void diplay() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public Music(@org.jetbrains.annotations.Nullable()
    java.lang.String codeSong, @org.jetbrains.annotations.Nullable()
    java.lang.String nameSong, @org.jetbrains.annotations.Nullable()
    java.lang.String singer, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean like) {
        super();
    }
    
    public Music(@org.jetbrains.annotations.Nullable()
    java.lang.String codeSong, @org.jetbrains.annotations.Nullable()
    java.lang.String nameSong, @org.jetbrains.annotations.Nullable()
    java.lang.String singer) {
        super();
    }
    
    public Music(boolean like) {
        super();
    }
}