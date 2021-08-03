package elong.androidApp.services.chapter3_8;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lelong/androidApp/services/chapter3_8/DatabaseServices;", "", "()V", "TuongTacSQLite", "androidApp_release"})
public final class DatabaseServices {
    
    public DatabaseServices() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J6\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eJ(\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002J \u0010\u0010\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002Jg\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\n2\u0010\u0010\u0016\u001a\f\u0012\u0006\b\u0001\u0012\u00020\n\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\n2\u0010\u0010\u0019\u001a\f\u0012\u0006\b\u0001\u0012\u00020\n\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u001d\u00a8\u0006\u001e"}, d2 = {"Lelong/androidApp/services/chapter3_8/DatabaseServices$TuongTacSQLite;", "", "()V", "copyDbToMobileSystem", "", "dbFile", "Ljava/io/File;", "assetManager", "Landroid/content/res/AssetManager;", "databaseName", "", "pathDatabase", "packageDatabase", "activity", "Landroid/app/Activity;", "copyDbToMobileSystemFromAsset", "copyDbToMobileSystemFromAssetPutLinkSave", "showDatabase", "Landroid/database/Cursor;", "database", "Landroid/database/sqlite/SQLiteDatabase;", "tableOfDb", "columns", "", "selection", "selectionArgs", "groupBy", "having", "orderBy", "(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "androidApp_release"})
    public static final class TuongTacSQLite {
        @org.jetbrains.annotations.NotNull()
        public static final elong.androidApp.services.chapter3_8.DatabaseServices.TuongTacSQLite INSTANCE = null;
        
        /**
         * Sao chép Data từ SQLite (từ file assets) vào mobile system
         */
        public final void copyDbToMobileSystem(@org.jetbrains.annotations.NotNull()
        java.io.File dbFile, @org.jetbrains.annotations.NotNull()
        android.content.res.AssetManager assetManager, @org.jetbrains.annotations.NotNull()
        java.lang.String databaseName, @org.jetbrains.annotations.NotNull()
        java.lang.String pathDatabase, @org.jetbrains.annotations.NotNull()
        java.lang.String packageDatabase, @org.jetbrains.annotations.NotNull()
        android.app.Activity activity) {
        }
        
        private final void copyDbToMobileSystemFromAsset(android.content.res.AssetManager assetManager, java.lang.String databaseName, java.lang.String pathDatabase, java.lang.String packageDatabase) {
        }
        
        private final java.lang.String copyDbToMobileSystemFromAssetPutLinkSave(java.lang.String databaseName, java.lang.String pathDatabase, java.lang.String packageDatabase) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.database.Cursor showDatabase(@org.jetbrains.annotations.NotNull()
        android.database.sqlite.SQLiteDatabase database, @org.jetbrains.annotations.NotNull()
        java.lang.String tableOfDb, @org.jetbrains.annotations.Nullable()
        java.lang.String[] columns, @org.jetbrains.annotations.Nullable()
        java.lang.String selection, @org.jetbrains.annotations.Nullable()
        java.lang.String[] selectionArgs, @org.jetbrains.annotations.Nullable()
        java.lang.String groupBy, @org.jetbrains.annotations.Nullable()
        java.lang.String having, @org.jetbrains.annotations.Nullable()
        java.lang.String orderBy) {
            return null;
        }
        
        private TuongTacSQLite() {
            super();
        }
    }
}