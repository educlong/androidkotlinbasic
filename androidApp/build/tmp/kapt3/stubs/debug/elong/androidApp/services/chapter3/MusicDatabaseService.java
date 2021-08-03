package elong.androidApp.services.chapter3;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lelong/androidApp/services/chapter3/MusicDatabaseService;", "", "()V", "MusicService", "androidApp_debug"})
public final class MusicDatabaseService {
    
    public MusicDatabaseService() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bJ4\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\bJ.\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fJ&\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\b\u00a8\u0006\u0016"}, d2 = {"Lelong/androidApp/services/chapter3/MusicDatabaseService$MusicService;", "", "()V", "checkCodeMusic", "", "database", "Landroid/database/sqlite/SQLiteDatabase;", "tableOfDb", "", "code", "searchSong", "", "likeMusic", "", "sourceList", "Landroidx/databinding/ObservableArrayList;", "Lelong/models/chapter1_3/Music;", "searchName", "showMusicOnListView", "updateMusic", "row", "Landroid/content/ContentValues;", "androidApp_debug"})
    public static final class MusicService {
        @org.jetbrains.annotations.NotNull()
        public static final elong.androidApp.services.chapter3.MusicDatabaseService.MusicService INSTANCE = null;
        
        public final void showMusicOnListView(@org.jetbrains.annotations.NotNull()
        android.database.sqlite.SQLiteDatabase database, @org.jetbrains.annotations.NotNull()
        java.lang.String tableOfDb, int likeMusic, @org.jetbrains.annotations.Nullable()
        androidx.databinding.ObservableArrayList<elong.models.chapter1_3.Music> sourceList) {
        }
        
        public final void updateMusic(@org.jetbrains.annotations.NotNull()
        android.database.sqlite.SQLiteDatabase database, @org.jetbrains.annotations.NotNull()
        java.lang.String tableOfDb, @org.jetbrains.annotations.NotNull()
        android.content.ContentValues row, @org.jetbrains.annotations.NotNull()
        java.lang.String code) {
        }
        
        public final boolean checkCodeMusic(@org.jetbrains.annotations.NotNull()
        android.database.sqlite.SQLiteDatabase database, @org.jetbrains.annotations.NotNull()
        java.lang.String tableOfDb, @org.jetbrains.annotations.NotNull()
        java.lang.String code) {
            return false;
        }
        
        public final void searchSong(@org.jetbrains.annotations.NotNull()
        android.database.sqlite.SQLiteDatabase database, @org.jetbrains.annotations.NotNull()
        java.lang.String tableOfDb, int likeMusic, @org.jetbrains.annotations.NotNull()
        androidx.databinding.ObservableArrayList<elong.models.chapter1_3.Music> sourceList, @org.jetbrains.annotations.NotNull()
        java.lang.String searchName) {
        }
        
        private MusicService() {
            super();
        }
    }
}