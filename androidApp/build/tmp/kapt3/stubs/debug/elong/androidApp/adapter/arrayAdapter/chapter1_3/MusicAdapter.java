package elong.androidApp.adapter.arrayAdapter.chapter1_3;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0010\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0002J\u0018\u0010/\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u00100\u001a\u00020\u0006H\u0002J\"\u00101\u001a\u00020.2\u0006\u00100\u001a\u00020\u00062\b\u00102\u001a\u0004\u0018\u00010.2\u0006\u00103\u001a\u000204H\u0016J\u0010\u00105\u001a\u00020,2\u0006\u00106\u001a\u00020\u0002H\u0002J\u0010\u00107\u001a\u00020,2\u0006\u00106\u001a\u00020\u0002H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u001f\u001a\u0004\u0018\u00010 X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001c\u0010%\u001a\u0004\u0018\u00010 X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\"\"\u0004\b\'\u0010$R\u001c\u0010(\u001a\u0004\u0018\u00010 X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\"\"\u0004\b*\u0010$\u00a8\u00068"}, d2 = {"Lelong/androidApp/adapter/arrayAdapter/chapter1_3/MusicAdapter;", "Landroid/widget/ArrayAdapter;", "Lelong/models/chapter1_3/Music;", "activity", "Landroid/app/Activity;", "resource", "", "objects", "", "(Landroid/app/Activity;ILjava/util/List;)V", "getActivity", "()Landroid/app/Activity;", "setActivity", "(Landroid/app/Activity;)V", "btnDislike", "Landroid/widget/ImageButton;", "getBtnDislike", "()Landroid/widget/ImageButton;", "setBtnDislike", "(Landroid/widget/ImageButton;)V", "btnLike", "getBtnLike", "setBtnLike", "getObjects", "()Ljava/util/List;", "setObjects", "(Ljava/util/List;)V", "getResource", "()I", "setResource", "(I)V", "txtViewCodeSong", "Landroid/widget/TextView;", "getTxtViewCodeSong", "()Landroid/widget/TextView;", "setTxtViewCodeSong", "(Landroid/widget/TextView;)V", "txtViewNameSong", "getTxtViewNameSong", "setTxtViewNameSong", "txtViewSinger", "getTxtViewSinger", "setTxtViewSinger", "addControls", "", "row", "Landroid/view/View;", "addEvents", "position", "getView", "convertView", "parent", "Landroid/view/ViewGroup;", "xuLyDislike", "music", "xuLyLike", "androidApp_debug"})
public final class MusicAdapter extends android.widget.ArrayAdapter<elong.models.chapter1_3.Music> {
    @org.jetbrains.annotations.Nullable()
    private android.widget.TextView txtViewCodeSong;
    @org.jetbrains.annotations.Nullable()
    private android.widget.TextView txtViewNameSong;
    @org.jetbrains.annotations.Nullable()
    private android.widget.TextView txtViewSinger;
    @org.jetbrains.annotations.Nullable()
    private android.widget.ImageButton btnLike;
    @org.jetbrains.annotations.Nullable()
    private android.widget.ImageButton btnDislike;
    @org.jetbrains.annotations.NotNull()
    private android.app.Activity activity;
    private int resource;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<elong.models.chapter1_3.Music> objects;
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.TextView getTxtViewCodeSong() {
        return null;
    }
    
    public final void setTxtViewCodeSong(@org.jetbrains.annotations.Nullable()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.TextView getTxtViewNameSong() {
        return null;
    }
    
    public final void setTxtViewNameSong(@org.jetbrains.annotations.Nullable()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.TextView getTxtViewSinger() {
        return null;
    }
    
    public final void setTxtViewSinger(@org.jetbrains.annotations.Nullable()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.ImageButton getBtnLike() {
        return null;
    }
    
    public final void setBtnLike(@org.jetbrains.annotations.Nullable()
    android.widget.ImageButton p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.ImageButton getBtnDislike() {
        return null;
    }
    
    public final void setBtnDislike(@org.jetbrains.annotations.Nullable()
    android.widget.ImageButton p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View getView(int position, @org.jetbrains.annotations.Nullable()
    android.view.View convertView, @org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent) {
        return null;
    }
    
    private final void addControls(android.view.View row) {
    }
    
    private final void addEvents(android.view.View row, int position) {
    }
    
    /**
     * PROJECT CHƯƠNG 3: ASSETS, SHARED PREFERENCES, QUẢN LÝ DỮ LIỆU VÀ CONTENTPROVIDER ---> PROJECT CHƯƠNG 3: KARAOKE
     */
    private final void xuLyDislike(elong.models.chapter1_3.Music music) {
    }
    
    private final void xuLyLike(elong.models.chapter1_3.Music music) {
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
    public final java.util.List<elong.models.chapter1_3.Music> getObjects() {
        return null;
    }
    
    public final void setObjects(@org.jetbrains.annotations.NotNull()
    java.util.List<elong.models.chapter1_3.Music> p0) {
    }
    
    public MusicAdapter(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, int resource, @org.jetbrains.annotations.NotNull()
    java.util.List<elong.models.chapter1_3.Music> objects) {
        super(null, 0);
    }
}