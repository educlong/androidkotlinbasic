package elong.androidApp.services.chapter6_9;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lelong/androidApp/services/chapter6_9/NotificationController;", "", "()V", "ProcessNotificaion", "androidApp_release"})
public final class NotificationController {
    
    public NotificationController() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002JN\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012\u00a8\u0006\u0013"}, d2 = {"Lelong/androidApp/services/chapter6_9/NotificationController$ProcessNotificaion;", "", "()V", "createNotification", "", "activity", "Landroid/content/Context;", "resultIntent", "Landroid/content/Intent;", "contentTitle", "", "contentText", "packageName", "sound", "", "notificationId", "notificationName", "mNotifyMgr", "Landroid/app/NotificationManager;", "androidApp_release"})
    public static final class ProcessNotificaion {
        @org.jetbrains.annotations.NotNull()
        public static final elong.androidApp.services.chapter6_9.NotificationController.ProcessNotificaion INSTANCE = null;
        
        public final void createNotification(@org.jetbrains.annotations.NotNull()
        android.content.Context activity, @org.jetbrains.annotations.NotNull()
        android.content.Intent resultIntent, @org.jetbrains.annotations.NotNull()
        java.lang.String contentTitle, @org.jetbrains.annotations.NotNull()
        java.lang.String contentText, @org.jetbrains.annotations.NotNull()
        java.lang.String packageName, int sound, @org.jetbrains.annotations.NotNull()
        java.lang.String notificationId, @org.jetbrains.annotations.NotNull()
        java.lang.String notificationName, @org.jetbrains.annotations.NotNull()
        android.app.NotificationManager mNotifyMgr) {
        }
        
        private ProcessNotificaion() {
            super();
        }
    }
}