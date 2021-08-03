package elong.androidApp.services.chapter3;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0006"}, d2 = {"Lelong/androidApp/services/chapter3/AssetsSharedPreferences;", "", "()V", "AssetsControls", "MediaControl", "SharedPreferencesControl", "androidApp_release"})
public final class AssetsSharedPreferences {
    
    public AssetsSharedPreferences() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J2\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\f\u00a8\u0006\r"}, d2 = {"Lelong/androidApp/services/chapter3/AssetsSharedPreferences$AssetsControls;", "", "()V", "getResourceFromAssetFolder", "", "assetManager", "Landroid/content/res/AssetManager;", "pathFolder", "", "sourceList", "", "adapterSource", "Landroid/widget/ArrayAdapter;", "androidApp_release"})
    public static final class AssetsControls {
        @org.jetbrains.annotations.NotNull()
        public static final elong.androidApp.services.chapter3.AssetsSharedPreferences.AssetsControls INSTANCE = null;
        
        public final void getResourceFromAssetFolder(@org.jetbrains.annotations.NotNull()
        android.content.res.AssetManager assetManager, @org.jetbrains.annotations.NotNull()
        java.lang.String pathFolder, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> sourceList, @org.jetbrains.annotations.NotNull()
        android.widget.ArrayAdapter<java.lang.String> adapterSource) {
        }
        
        private AssetsControls() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ,\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\f2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012\u00a8\u0006\u0013"}, d2 = {"Lelong/androidApp/services/chapter3/AssetsSharedPreferences$SharedPreferencesControl;", "", "()V", "restoreStatusInfor", "Landroid/graphics/Typeface;", "assetManager", "Landroid/content/res/AssetManager;", "keyPre", "", "returnFolderSavedInAssets", "pathFolder", "sourceList", "", "position", "", "saveStatusInfor", "Landroid/content/SharedPreferences$Editor;", "preferences", "Landroid/content/SharedPreferences;", "androidApp_release"})
    public static final class SharedPreferencesControl {
        @org.jetbrains.annotations.NotNull()
        public static final elong.androidApp.services.chapter3.AssetsSharedPreferences.SharedPreferencesControl INSTANCE = null;
        
        @org.jetbrains.annotations.NotNull()
        public final android.graphics.Typeface returnFolderSavedInAssets(@org.jetbrains.annotations.NotNull()
        android.content.res.AssetManager assetManager, @org.jetbrains.annotations.NotNull()
        java.lang.String pathFolder, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> sourceList, int position) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.SharedPreferences.Editor saveStatusInfor(@org.jetbrains.annotations.NotNull()
        android.content.SharedPreferences preferences) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.graphics.Typeface restoreStatusInfor(@org.jetbrains.annotations.NotNull()
        android.content.res.AssetManager assetManager, @org.jetbrains.annotations.NotNull()
        java.lang.String keyPre) {
            return null;
        }
        
        private SharedPreferencesControl() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lelong/androidApp/services/chapter3/AssetsSharedPreferences$MediaControl;", "", "()V", "playMusicControl", "", "afdMusic", "Landroid/content/res/AssetFileDescriptor;", "androidApp_release"})
    public static final class MediaControl {
        @org.jetbrains.annotations.NotNull()
        public static final elong.androidApp.services.chapter3.AssetsSharedPreferences.MediaControl INSTANCE = null;
        
        public final void playMusicControl(@org.jetbrains.annotations.NotNull()
        android.content.res.AssetFileDescriptor afdMusic) {
        }
        
        private MediaControl() {
            super();
        }
    }
}