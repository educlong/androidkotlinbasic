package elong.androidApp.services.chapter8GoogleMap;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lelong/androidApp/services/chapter8GoogleMap/AddressVoChongTuiDatabaseService;", "", "()V", "DatabaseAddressVoChongTui", "androidApp_debug"})
public final class AddressVoChongTuiDatabaseService {
    
    public AddressVoChongTuiDatabaseService() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r\u00a8\u0006\u000e"}, d2 = {"Lelong/androidApp/services/chapter8GoogleMap/AddressVoChongTuiDatabaseService$DatabaseAddressVoChongTui;", "", "()V", "showAllAddressVoChongTui", "", "database", "Landroid/database/sqlite/SQLiteDatabase;", "tableOfDb", "", "sourceList", "", "Lelong/models/chapter8/VoChongTuiGMap;", "adapterList", "Lelong/androidApp/adapter/arrayAdapter/chapter8/AdapterAddressVoChongTui;", "androidApp_debug"})
    public static final class DatabaseAddressVoChongTui {
        @org.jetbrains.annotations.NotNull()
        public static final elong.androidApp.services.chapter8GoogleMap.AddressVoChongTuiDatabaseService.DatabaseAddressVoChongTui INSTANCE = null;
        
        public final void showAllAddressVoChongTui(@org.jetbrains.annotations.NotNull()
        android.database.sqlite.SQLiteDatabase database, @org.jetbrains.annotations.NotNull()
        java.lang.String tableOfDb, @org.jetbrains.annotations.NotNull()
        java.util.List<elong.models.chapter8.VoChongTuiGMap> sourceList, @org.jetbrains.annotations.NotNull()
        elong.androidApp.adapter.arrayAdapter.chapter8.AdapterAddressVoChongTui adapterList) {
        }
        
        private DatabaseAddressVoChongTui() {
            super();
        }
    }
}