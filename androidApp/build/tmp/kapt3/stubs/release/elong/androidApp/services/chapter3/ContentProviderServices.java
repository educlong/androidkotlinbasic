package elong.androidApp.services.chapter3;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lelong/androidApp/services/chapter3/ContentProviderServices;", "", "()V", "readFromDevice", "androidApp_release"})
public final class ContentProviderServices {
    
    public ContentProviderServices() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b\u00a8\u0006\u0017"}, d2 = {"Lelong/androidApp/services/chapter3/ContentProviderServices$readFromDevice;", "", "()V", "smsAddressColumn", "", "getSmsAddressColumn", "()Ljava/lang/String;", "setSmsAddressColumn", "(Ljava/lang/String;)V", "smsBodyColumn", "getSmsBodyColumn", "setSmsBodyColumn", "smsDateColumn", "getSmsDateColumn", "setSmsDateColumn", "smsInbox", "getSmsInbox", "setSmsInbox", "readContact", "Landroid/net/Uri;", "activity", "Landroid/app/Activity;", "readSMS", "androidApp_release"})
    public static final class readFromDevice {
        @org.jetbrains.annotations.NotNull()
        private static java.lang.String smsInbox = "content://sms/inbox";
        @org.jetbrains.annotations.NotNull()
        private static java.lang.String smsAddressColumn = "address";
        @org.jetbrains.annotations.NotNull()
        private static java.lang.String smsDateColumn = "date";
        @org.jetbrains.annotations.NotNull()
        private static java.lang.String smsBodyColumn = "body";
        @org.jetbrains.annotations.NotNull()
        public static final elong.androidApp.services.chapter3.ContentProviderServices.readFromDevice INSTANCE = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSmsInbox() {
            return null;
        }
        
        public final void setSmsInbox(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSmsAddressColumn() {
            return null;
        }
        
        public final void setSmsAddressColumn(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSmsDateColumn() {
            return null;
        }
        
        public final void setSmsDateColumn(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSmsBodyColumn() {
            return null;
        }
        
        public final void setSmsBodyColumn(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.net.Uri readSMS(@org.jetbrains.annotations.NotNull()
        android.app.Activity activity) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.net.Uri readContact(@org.jetbrains.annotations.NotNull()
        android.app.Activity activity) {
            return null;
        }
        
        private readFromDevice() {
            super();
        }
    }
}