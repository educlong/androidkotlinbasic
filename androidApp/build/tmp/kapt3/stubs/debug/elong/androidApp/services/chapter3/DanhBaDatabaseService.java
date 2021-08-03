package elong.androidApp.services.chapter3;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lelong/androidApp/services/chapter3/DanhBaDatabaseService;", "", "()V", "DbService", "androidApp_debug"})
public final class DanhBaDatabaseService {
    
    public DanhBaDatabaseService() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bJ \u0010\f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0002J\u001e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bJ&\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u00a8\u0006\u0015"}, d2 = {"Lelong/androidApp/services/chapter3/DanhBaDatabaseService$DbService;", "", "()V", "addOrUpdateDanhBa", "", "database", "Landroid/database/sqlite/SQLiteDatabase;", "tableOfDb", "", "row", "Landroid/content/ContentValues;", "code", "checkCodeDanhBa", "", "codeContact", "deleteDanhBa", "", "showAllDanhBaOnListView", "sourceList", "Landroidx/databinding/ObservableArrayList;", "Lelong/models/chapter1_2_3_7/DanhBa;", "androidApp_debug"})
    public static final class DbService {
        @org.jetbrains.annotations.NotNull()
        public static final elong.androidApp.services.chapter3.DanhBaDatabaseService.DbService INSTANCE = null;
        
        public final void showAllDanhBaOnListView(@org.jetbrains.annotations.NotNull()
        android.database.sqlite.SQLiteDatabase database, @org.jetbrains.annotations.NotNull()
        java.lang.String tableOfDb, @org.jetbrains.annotations.Nullable()
        androidx.databinding.ObservableArrayList<elong.models.chapter1_2_3_7.DanhBa> sourceList) {
        }
        
        private final boolean checkCodeDanhBa(android.database.sqlite.SQLiteDatabase database, java.lang.String tableOfDb, java.lang.String codeContact) {
            return false;
        }
        
        public final long addOrUpdateDanhBa(@org.jetbrains.annotations.NotNull()
        android.database.sqlite.SQLiteDatabase database, @org.jetbrains.annotations.NotNull()
        java.lang.String tableOfDb, @org.jetbrains.annotations.NotNull()
        android.content.ContentValues row, @org.jetbrains.annotations.NotNull()
        java.lang.String code) {
            return 0L;
        }
        
        public final void deleteDanhBa(@org.jetbrains.annotations.NotNull()
        android.database.sqlite.SQLiteDatabase database, @org.jetbrains.annotations.NotNull()
        java.lang.String tableOfDb, @org.jetbrains.annotations.NotNull()
        java.lang.String code) {
        }
        
        private DbService() {
            super();
        }
    }
}