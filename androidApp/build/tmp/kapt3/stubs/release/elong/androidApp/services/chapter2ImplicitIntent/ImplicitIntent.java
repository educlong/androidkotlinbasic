package elong.androidApp.services.chapter2ImplicitIntent;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0005"}, d2 = {"Lelong/androidApp/services/chapter2ImplicitIntent/ImplicitIntent;", "", "()V", "DiallingCallingControl", "S_M_S_Control", "androidApp_release"})
public final class ImplicitIntent {
    
    public ImplicitIntent() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f\u00a8\u0006\r"}, d2 = {"Lelong/androidApp/services/chapter2ImplicitIntent/ImplicitIntent$DiallingCallingControl;", "", "()V", "diallingCalling", "Landroid/content/Intent;", "phone", "", "action", "permission", "activity", "Landroid/app/Activity;", "permissionRequestServicePhone", "", "androidApp_release"})
    public static final class DiallingCallingControl {
        @org.jetbrains.annotations.NotNull()
        public static final elong.androidApp.services.chapter2ImplicitIntent.ImplicitIntent.DiallingCallingControl INSTANCE = null;
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent diallingCalling(@org.jetbrains.annotations.NotNull()
        java.lang.String phone, @org.jetbrains.annotations.NotNull()
        java.lang.String action, @org.jetbrains.annotations.NotNull()
        java.lang.String permission, @org.jetbrains.annotations.NotNull()
        android.app.Activity activity, int permissionRequestServicePhone) {
            return null;
        }
        
        private DiallingCallingControl() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J6\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r\u00a8\u0006\u000e"}, d2 = {"Lelong/androidApp/services/chapter2ImplicitIntent/ImplicitIntent$S_M_S_Control;", "", "()V", "sMS", "", "phone", "", "messsage", "action", "permission", "activity", "Landroid/app/Activity;", "permissionRequestCallPhone", "", "androidApp_release"})
    public static final class S_M_S_Control {
        @org.jetbrains.annotations.NotNull()
        public static final elong.androidApp.services.chapter2ImplicitIntent.ImplicitIntent.S_M_S_Control INSTANCE = null;
        
        public final void sMS(@org.jetbrains.annotations.NotNull()
        java.lang.String phone, @org.jetbrains.annotations.NotNull()
        java.lang.String messsage, @org.jetbrains.annotations.NotNull()
        java.lang.String action, @org.jetbrains.annotations.NotNull()
        java.lang.String permission, @org.jetbrains.annotations.NotNull()
        android.app.Activity activity, int permissionRequestCallPhone) {
        }
        
        private S_M_S_Control() {
            super();
        }
    }
}