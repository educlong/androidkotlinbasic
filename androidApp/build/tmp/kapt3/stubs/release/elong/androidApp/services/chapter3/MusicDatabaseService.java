package elong.androidApp.services.chapter3;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lelong/androidApp/services/chapter3/MusicDatabaseService;", "", "()V", "MusicService", "androidApp_release"})
public final class MusicDatabaseService {
    
    public MusicDatabaseService() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J<\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bJ4\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fJ&\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\b\u00a8\u0006\u0016"}, d2 = {"Lelong/androidApp/services/chapter3/MusicDatabaseService$MusicService;", "", "()V", "searchSong", "", "database", "Landroid/database/sqlite/SQLiteDatabase;", "tableOfDb", "", "likeMusic", "", "sourceList", "", "Lelong/models/chapter1_3/Music;", "adapterList", "Lelong/androidApp/adapter/arrayAdapter/chapter1_3/MusicAdapter;", "searchName", "showMusicOnListView", "updateMusic", "row", "Landroid/content/ContentValues;", "code", "androidApp_release"})
    public static final class MusicService {
        @org.jetbrains.annotations.NotNull()
        public static final elong.androidApp.services.chapter3.MusicDatabaseService.MusicService INSTANCE = null;
        
        public final void showMusicOnListView(@org.jetbrains.annotations.NotNull()
        android.database.sqlite.SQLiteDatabase database, @org.jetbrains.annotations.NotNull()
        java.lang.String tableOfDb, int likeMusic, @org.jetbrains.annotations.NotNull()
        java.util.List<elong.models.chapter1_3.Music> sourceList, @org.jetbrains.annotations.NotNull()
        elong.androidApp.adapter.arrayAdapter.chapter1_3.MusicAdapter adapterList) {
        }
        
        public final void updateMusic(@org.jetbrains.annotations.NotNull()
        android.database.sqlite.SQLiteDatabase database, @org.jetbrains.annotations.NotNull()
        java.lang.String tableOfDb, @org.jetbrains.annotations.NotNull()
        android.content.ContentValues row, @org.jetbrains.annotations.NotNull()
        java.lang.String code) {
        }
        
        public final void searchSong(@org.jetbrains.annotations.NotNull()
        android.database.sqlite.SQLiteDatabase database, @org.jetbrains.annotations.NotNull()
        java.lang.String tableOfDb, int likeMusic, @org.jetbrains.annotations.NotNull()
        java.util.List<elong.models.chapter1_3.Music> sourceList, @org.jetbrains.annotations.NotNull()
        elong.androidApp.adapter.arrayAdapter.chapter1_3.MusicAdapter adapterList, @org.jetbrains.annotations.NotNull()
        java.lang.String searchName) {
        }
        
        private MusicService() {
            super();
        }
    }
}