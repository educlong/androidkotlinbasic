package elong.androidApp.services.chapter6BroadcastReceiver;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0017R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006\u00a8\u0006\u0013"}, d2 = {"Lelong/androidApp/services/chapter6BroadcastReceiver/BroadcastReadSMS;", "Landroid/content/BroadcastReceiver;", "()V", "ADDRESS", "", "getADDRESS", "()Ljava/lang/String;", "BODY", "getBODY", "SMS_EXTRA", "getSMS_EXTRA", "SMS_URI", "getSMS_URI", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "androidApp_debug"})
public final class BroadcastReadSMS extends android.content.BroadcastReceiver {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String SMS_EXTRA = "pdus";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String SMS_URI = "content://sms/inbox";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String BODY = "body";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String ADDRESS = "address";
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSMS_EXTRA() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSMS_URI() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBODY() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getADDRESS() {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    @java.lang.Override()
    public void onReceive(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.content.Intent intent) {
    }
    
    public BroadcastReadSMS() {
        super();
    }
}