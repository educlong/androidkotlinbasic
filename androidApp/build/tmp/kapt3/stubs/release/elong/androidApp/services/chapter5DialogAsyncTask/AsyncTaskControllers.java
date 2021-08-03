package elong.androidApp.services.chapter5DialogAsyncTask;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0006"}, d2 = {"Lelong/androidApp/services/chapter5DialogAsyncTask/AsyncTaskControllers;", "", "()V", "ButtonAsyncTask", "LoadAlbumsAsyncTask", "LoadImageAsyncTask", "androidApp_release"})
public final class AsyncTaskControllers {
    
    public AsyncTaskControllers() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\f\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001f\u0010\u001c\u001a\u00020\u001d2\u0010\u0010\u001e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u001fH\u0002\u00a2\u0006\u0002\u0010 J\u0012\u0010!\u001a\u00020\u001d2\b\u0010\"\u001a\u0004\u0018\u00010\u0003H\u0002J\b\u0010#\u001a\u00020\u001dH\u0002J\u001f\u0010$\u001a\u00020\u001d2\u0010\u0010%\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u001fH\u0002\u00a2\u0006\u0002\u0010 J\'\u0010&\u001a\u0004\u0018\u00010\u00032\u0016\u0010\u001e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u001f\"\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0002\u0010\'J\u0012\u0010(\u001a\u00020\u001d2\b\u0010\"\u001a\u0004\u0018\u00010\u0003H\u0014J\b\u0010)\u001a\u00020\u001dH\u0014J%\u0010*\u001a\u00020\u001d2\u0016\u0010%\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u001f\"\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0002\u0010 R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u00a8\u0006+"}, d2 = {"Lelong/androidApp/services/chapter5DialogAsyncTask/AsyncTaskControllers$ButtonAsyncTask;", "Landroid/os/AsyncTask;", "", "Ljava/lang/Void;", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "getActivity", "()Landroid/app/Activity;", "setActivity", "layoutButtonAsyncTask", "Landroid/widget/LinearLayout;", "getLayoutButtonAsyncTask", "()Landroid/widget/LinearLayout;", "setLayoutButtonAsyncTask", "(Landroid/widget/LinearLayout;)V", "progressBarPercentAsyncTask", "Landroid/widget/ProgressBar;", "getProgressBarPercentAsyncTask", "()Landroid/widget/ProgressBar;", "setProgressBarPercentAsyncTask", "(Landroid/widget/ProgressBar;)V", "txtPercentAsyncTask", "Landroid/widget/TextView;", "getTxtPercentAsyncTask", "()Landroid/widget/TextView;", "setTxtPercentAsyncTask", "(Landroid/widget/TextView;)V", "buttonAsyncTaskDoInBackgroundLayZaTriInput", "", "params", "", "([Ljava/lang/Integer;)V", "buttonAsyncTaskOnPostExecuteTuDongThucHienKhiTienTrinhKetThuc", "result", "buttonAsyncTaskOnPreExecuteTuDongThucHienKhiTienTrinhBatDau", "buttonAsyncTaskOnProgressUpdateVeZaoDienThoiGianThuc", "values", "doInBackground", "([Ljava/lang/Integer;)Ljava/lang/Void;", "onPostExecute", "onPreExecute", "onProgressUpdate", "androidApp_release"})
    public static final class ButtonAsyncTask extends android.os.AsyncTask<java.lang.Integer, java.lang.Integer, java.lang.Void> {
        @org.jetbrains.annotations.Nullable()
        private android.widget.TextView txtPercentAsyncTask;
        @org.jetbrains.annotations.Nullable()
        private android.widget.LinearLayout layoutButtonAsyncTask;
        @org.jetbrains.annotations.Nullable()
        private android.widget.ProgressBar progressBarPercentAsyncTask;
        @org.jetbrains.annotations.NotNull()
        private android.app.Activity activity;
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        protected java.lang.Void doInBackground(@org.jetbrains.annotations.NotNull()
        java.lang.Integer... params) {
            return null;
        }
        
        @java.lang.Override()
        protected void onPreExecute() {
        }
        
        @java.lang.Override()
        protected void onProgressUpdate(@org.jetbrains.annotations.NotNull()
        java.lang.Integer... values) {
        }
        
        @java.lang.Override()
        protected void onPostExecute(@org.jetbrains.annotations.Nullable()
        java.lang.Void result) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.TextView getTxtPercentAsyncTask() {
            return null;
        }
        
        public final void setTxtPercentAsyncTask(@org.jetbrains.annotations.Nullable()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.LinearLayout getLayoutButtonAsyncTask() {
            return null;
        }
        
        public final void setLayoutButtonAsyncTask(@org.jetbrains.annotations.Nullable()
        android.widget.LinearLayout p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.ProgressBar getProgressBarPercentAsyncTask() {
            return null;
        }
        
        public final void setProgressBarPercentAsyncTask(@org.jetbrains.annotations.Nullable()
        android.widget.ProgressBar p0) {
        }
        
        private final void buttonAsyncTaskDoInBackgroundLayZaTriInput(java.lang.Integer[] params) {
        }
        
        private final void buttonAsyncTaskOnPreExecuteTuDongThucHienKhiTienTrinhBatDau() {
        }
        
        private final void buttonAsyncTaskOnProgressUpdateVeZaoDienThoiGianThuc(java.lang.Integer[] values) {
        }
        
        private final void buttonAsyncTaskOnPostExecuteTuDongThucHienKhiTienTrinhKetThuc(java.lang.Void result) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.app.Activity getActivity() {
            return null;
        }
        
        public final void setActivity(@org.jetbrains.annotations.NotNull()
        android.app.Activity p0) {
        }
        
        public ButtonAsyncTask(@org.jetbrains.annotations.NotNull()
        android.app.Activity activity) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\'\u0010\u0017\u001a\u0004\u0018\u00010\u00042\u0016\u0010\u0018\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u0019\"\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0002\u0010\u001aJ!\u0010\u001b\u001a\u0004\u0018\u00010\u00042\u0010\u0010\u0018\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u0019H\u0002\u00a2\u0006\u0002\u0010\u001aJ\u0012\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0004H\u0002J\b\u0010\u001f\u001a\u00020\u001dH\u0002J\u001f\u0010 \u001a\u00020\u001d2\u0010\u0010!\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00030\u0019H\u0002\u00a2\u0006\u0002\u0010\"J\u0012\u0010#\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0004H\u0014J\b\u0010$\u001a\u00020\u001dH\u0014J%\u0010%\u001a\u00020\u001d2\u0016\u0010!\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00030\u0019\"\u0004\u0018\u00010\u0003H\u0014\u00a2\u0006\u0002\u0010\"R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0007R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006&"}, d2 = {"Lelong/androidApp/services/chapter5DialogAsyncTask/AsyncTaskControllers$LoadImageAsyncTask;", "Landroid/os/AsyncTask;", "", "Ljava/lang/Void;", "Landroid/graphics/Bitmap;", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "getActivity", "()Landroid/app/Activity;", "setActivity", "dialogAsyncTask", "Landroid/app/ProgressDialog;", "getDialogAsyncTask", "()Landroid/app/ProgressDialog;", "setDialogAsyncTask", "(Landroid/app/ProgressDialog;)V", "imgLoadIMGAsyncTask", "Landroid/widget/ImageView;", "getImgLoadIMGAsyncTask", "()Landroid/widget/ImageView;", "setImgLoadIMGAsyncTask", "(Landroid/widget/ImageView;)V", "doInBackground", "params", "", "([Ljava/lang/String;)Landroid/graphics/Bitmap;", "loadImageAsyncTaskDoInBackgroundLayZaTriInput", "loadImageAsyncTaskOnPostExecuteTuDongThucHienKhiTienTrinhKetThuc", "", "result", "loadImageAsyncTaskOnPreExecuteTuDongThucHienKhiTienTrinhBatDau", "loadImageAsyncTaskOnProgressUpdateVeZaoDienThoiGianThuc", "values", "([Ljava/lang/Void;)V", "onPostExecute", "onPreExecute", "onProgressUpdate", "androidApp_release"})
    public static final class LoadImageAsyncTask extends android.os.AsyncTask<java.lang.String, java.lang.Void, android.graphics.Bitmap> {
        @org.jetbrains.annotations.Nullable()
        private android.widget.ImageView imgLoadIMGAsyncTask;
        @org.jetbrains.annotations.Nullable()
        private android.app.ProgressDialog dialogAsyncTask;
        @org.jetbrains.annotations.NotNull()
        private android.app.Activity activity;
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        protected android.graphics.Bitmap doInBackground(@org.jetbrains.annotations.NotNull()
        java.lang.String... params) {
            return null;
        }
        
        @java.lang.Override()
        protected void onPreExecute() {
        }
        
        @java.lang.Override()
        protected void onProgressUpdate(@org.jetbrains.annotations.NotNull()
        java.lang.Void... values) {
        }
        
        @java.lang.Override()
        protected void onPostExecute(@org.jetbrains.annotations.Nullable()
        android.graphics.Bitmap result) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.ImageView getImgLoadIMGAsyncTask() {
            return null;
        }
        
        public final void setImgLoadIMGAsyncTask(@org.jetbrains.annotations.Nullable()
        android.widget.ImageView p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.app.ProgressDialog getDialogAsyncTask() {
            return null;
        }
        
        public final void setDialogAsyncTask(@org.jetbrains.annotations.Nullable()
        android.app.ProgressDialog p0) {
        }
        
        private final android.graphics.Bitmap loadImageAsyncTaskDoInBackgroundLayZaTriInput(java.lang.String[] params) {
            return null;
        }
        
        private final void loadImageAsyncTaskOnPreExecuteTuDongThucHienKhiTienTrinhBatDau() {
        }
        
        private final void loadImageAsyncTaskOnProgressUpdateVeZaoDienThoiGianThuc(java.lang.Void[] values) {
        }
        
        private final void loadImageAsyncTaskOnPostExecuteTuDongThucHienKhiTienTrinhKetThuc(android.graphics.Bitmap result) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.app.Activity getActivity() {
            return null;
        }
        
        public final void setActivity(@org.jetbrains.annotations.NotNull()
        android.app.Activity p0) {
        }
        
        public LoadImageAsyncTask(@org.jetbrains.annotations.NotNull()
        android.app.Activity activity) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\'\u0010\u0017\u001a\u0004\u0018\u00010\u00042\u0016\u0010\u0018\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u0019\"\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0002\u0010\u001aJ!\u0010\u001b\u001a\u0004\u0018\u00010\u00042\u0010\u0010\u0018\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u0019H\u0002\u00a2\u0006\u0002\u0010\u001aJ\u0012\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0004H\u0002J\b\u0010\u001f\u001a\u00020\u001dH\u0002J\u001f\u0010 \u001a\u00020\u001d2\u0010\u0010!\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00030\u0019H\u0002\u00a2\u0006\u0002\u0010\"J\u0012\u0010#\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0004H\u0014J\b\u0010$\u001a\u00020\u001dH\u0014J%\u0010%\u001a\u00020\u001d2\u0016\u0010!\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00030\u0019\"\u0004\u0018\u00010\u0003H\u0014\u00a2\u0006\u0002\u0010\"R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0007R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006&"}, d2 = {"Lelong/androidApp/services/chapter5DialogAsyncTask/AsyncTaskControllers$LoadAlbumsAsyncTask;", "Landroid/os/AsyncTask;", "", "Ljava/lang/Void;", "Landroid/graphics/Bitmap;", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "getActivity", "()Landroid/app/Activity;", "setActivity", "dialogAsyncTaskAlbum", "Landroid/app/ProgressDialog;", "getDialogAsyncTaskAlbum", "()Landroid/app/ProgressDialog;", "setDialogAsyncTaskAlbum", "(Landroid/app/ProgressDialog;)V", "imgAlbumAsyncTask", "Landroid/widget/ImageView;", "getImgAlbumAsyncTask", "()Landroid/widget/ImageView;", "setImgAlbumAsyncTask", "(Landroid/widget/ImageView;)V", "doInBackground", "params", "", "([Ljava/lang/String;)Landroid/graphics/Bitmap;", "loadAlbumsAsyncTaskDoInBackgroundLayZaTriInput", "loadAlbumsAsyncTaskOnPostExecuteTuDongThucHienKhiTienTrinhKetThuc", "", "result", "loadAlbumsAsyncTaskOnPreExecuteTuDongThucHienKhiTienTrinhBatDau", "loadAlbumsAsyncTaskOnProgressUpdateVeZaoDienThoiGianThuc", "values", "([Ljava/lang/Void;)V", "onPostExecute", "onPreExecute", "onProgressUpdate", "androidApp_release"})
    public static final class LoadAlbumsAsyncTask extends android.os.AsyncTask<java.lang.String, java.lang.Void, android.graphics.Bitmap> {
        @org.jetbrains.annotations.Nullable()
        private android.widget.ImageView imgAlbumAsyncTask;
        @org.jetbrains.annotations.Nullable()
        private android.app.ProgressDialog dialogAsyncTaskAlbum;
        @org.jetbrains.annotations.NotNull()
        private android.app.Activity activity;
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        protected android.graphics.Bitmap doInBackground(@org.jetbrains.annotations.NotNull()
        java.lang.String... params) {
            return null;
        }
        
        @java.lang.Override()
        protected void onPreExecute() {
        }
        
        @java.lang.Override()
        protected void onProgressUpdate(@org.jetbrains.annotations.NotNull()
        java.lang.Void... values) {
        }
        
        @java.lang.Override()
        protected void onPostExecute(@org.jetbrains.annotations.Nullable()
        android.graphics.Bitmap result) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.ImageView getImgAlbumAsyncTask() {
            return null;
        }
        
        public final void setImgAlbumAsyncTask(@org.jetbrains.annotations.Nullable()
        android.widget.ImageView p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.app.ProgressDialog getDialogAsyncTaskAlbum() {
            return null;
        }
        
        public final void setDialogAsyncTaskAlbum(@org.jetbrains.annotations.Nullable()
        android.app.ProgressDialog p0) {
        }
        
        private final android.graphics.Bitmap loadAlbumsAsyncTaskDoInBackgroundLayZaTriInput(java.lang.String[] params) {
            return null;
        }
        
        private final void loadAlbumsAsyncTaskOnPreExecuteTuDongThucHienKhiTienTrinhBatDau() {
        }
        
        private final void loadAlbumsAsyncTaskOnProgressUpdateVeZaoDienThoiGianThuc(java.lang.Void[] values) {
        }
        
        private final void loadAlbumsAsyncTaskOnPostExecuteTuDongThucHienKhiTienTrinhKetThuc(android.graphics.Bitmap result) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.app.Activity getActivity() {
            return null;
        }
        
        public final void setActivity(@org.jetbrains.annotations.NotNull()
        android.app.Activity p0) {
        }
        
        public LoadAlbumsAsyncTask(@org.jetbrains.annotations.NotNull()
        android.app.Activity activity) {
            super();
        }
    }
}