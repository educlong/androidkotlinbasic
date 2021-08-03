package elong.androidApp.services.webserviceBonus;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0018\u0018\u00002\u00020\u0001:\u0016\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0019"}, d2 = {"Lelong/androidApp/services/webserviceBonus/AsyncTaskWebServiceCourse;", "", "()V", "ConfigurationWebServiceRestful", "ConfigurationWebServiceSoap", "ConfigurationWebServiceVietcombank", "DanhMucDeleteResfulTask", "DanhMucDeleteTask", "DanhMucDetailRestfulTask", "DanhMucDetailTask", "DanhMucInsertUpdateResfulTask", "DanhMucInsertUpdateTask", "DanhMucTotalTask", "DanhMucsRestfulTask", "DanhMucsTask", "SanPhamDeleteResfulTask", "SanPhamDeleteTask", "SanPhamDetailRestfulTask", "SanPhamDetailTask", "SanPhamInsertUpdateResfulTask", "SanPhamInsertUpdateTask", "SanPhamTotalTask", "SanPhamsRestfulTask", "SanPhamsTask", "TyZaVietcombankTask", "androidApp_release"})
public final class AsyncTaskWebServiceCourse {
    
    public AsyncTaskWebServiceCourse() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\u0011\n\u0002\b&\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0006R\u0014\u0010\u0019\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0006R\u001b\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u001c\u00a2\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u001c\u00a2\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b!\u0010\u001eR\u001b\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u001c\u00a2\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b#\u0010\u001eR\u001b\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u001c\u00a2\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b%\u0010\u001eR\u001b\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u001c\u00a2\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\'\u0010\u001eR\u001b\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u001c\u00a2\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b)\u0010\u001eR\u001b\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u001c\u00a2\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b+\u0010\u001eR\u0011\u0010,\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\u0006R\u0014\u0010.\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010\u0006R\u0014\u00100\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010\u0006R\u0014\u00102\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010\u0006R\u0014\u00104\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010\u0006R\u0014\u00106\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010\u0006R\u0014\u00108\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010\u0006R\u0014\u0010:\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010\u0006R\u0014\u0010<\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u0010\u0006R\u0014\u0010>\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u0010\u0006R\u0014\u0010@\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u0010\u0006\u00a8\u0006B"}, d2 = {"Lelong/androidApp/services/webserviceBonus/AsyncTaskWebServiceCourse$ConfigurationWebServiceSoap;", "", "()V", "METHOD_COUNT_DANHMUC", "", "getMETHOD_COUNT_DANHMUC", "()Ljava/lang/String;", "METHOD_COUNT_SANPHAM", "getMETHOD_COUNT_SANPHAM", "METHOD_DANHMUCS", "getMETHOD_DANHMUCS", "METHOD_DANHMUC_DETAIL", "getMETHOD_DANHMUC_DETAIL", "METHOD_DELETE_DANHMUC", "getMETHOD_DELETE_DANHMUC", "METHOD_DELETE_SANPHAM", "getMETHOD_DELETE_SANPHAM", "METHOD_INSERT_UPDATE_DANHMUC", "getMETHOD_INSERT_UPDATE_DANHMUC", "METHOD_INSERT_UPDATE_SANPHAM", "getMETHOD_INSERT_UPDATE_SANPHAM", "METHOD_SANPHAMS", "getMETHOD_SANPHAMS", "METHOD_SANPHAM_DETAIL", "getMETHOD_SANPHAM_DETAIL", "NAME_SPACE_SOAP", "getNAME_SPACE_SOAP", "PARAMETER_DELETE_SANPHAM", "", "getPARAMETER_DELETE_SANPHAM", "()[Ljava/lang/String;", "[Ljava/lang/String;", "PARAMETER_INSERT_UPDATE_SANPHAM", "getPARAMETER_INSERT_UPDATE_SANPHAM", "PARAMETER_SOAP_COUNT_SANPHAM_AND_QUERY_SANPHAMS", "getPARAMETER_SOAP_COUNT_SANPHAM_AND_QUERY_SANPHAMS", "PARAMETER_SOAP_DANHMUC", "getPARAMETER_SOAP_DANHMUC", "PARAMETER_SOAP_DANHMUC_DETAIL", "getPARAMETER_SOAP_DANHMUC_DETAIL", "PARAMETER_SOAP_DELETE_DANHMUC", "getPARAMETER_SOAP_DELETE_DANHMUC", "PARAMETER_SOAP_SANPHAM_DETAIL", "getPARAMETER_SOAP_SANPHAM_DETAIL", "SERVER_URL_SOAP_SERVER", "getSERVER_URL_SOAP_SERVER", "SOAP_ACTION_COUNT_DANHMUC", "getSOAP_ACTION_COUNT_DANHMUC", "SOAP_ACTION_COUNT_SANPHAM", "getSOAP_ACTION_COUNT_SANPHAM", "SOAP_ACTION_DANHMUCS", "getSOAP_ACTION_DANHMUCS", "SOAP_ACTION_DANHMUC_DEATAIL", "getSOAP_ACTION_DANHMUC_DEATAIL", "SOAP_ACTION_DELETE_DANHMUC", "getSOAP_ACTION_DELETE_DANHMUC", "SOAP_ACTION_DELETE_SANPHAM", "getSOAP_ACTION_DELETE_SANPHAM", "SOAP_ACTION_INSERT_UPDATE_DANHMUC", "getSOAP_ACTION_INSERT_UPDATE_DANHMUC", "SOAP_ACTION_INSERT_UPDATE_SANPHAM", "getSOAP_ACTION_INSERT_UPDATE_SANPHAM", "SOAP_ACTION_SANPHAMS", "getSOAP_ACTION_SANPHAMS", "SOAP_ACTION_SANPHAM_DETAIL", "getSOAP_ACTION_SANPHAM_DETAIL", "androidApp_release"})
    public static final class ConfigurationWebServiceSoap {
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String SERVER_URL_SOAP_SERVER = null;
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String NAME_SPACE_SOAP = "http://www.webservicecoursedemo.com/";
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String METHOD_COUNT_DANHMUC = "DanhMucCount";
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String SOAP_ACTION_COUNT_DANHMUC = null;
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String METHOD_DANHMUC_DETAIL = "DanhMucDetail";
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String[] PARAMETER_SOAP_DANHMUC_DETAIL = {"madm"};
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String SOAP_ACTION_DANHMUC_DEATAIL = null;
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String METHOD_DANHMUCS = "DanhMucs";
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String SOAP_ACTION_DANHMUCS = null;
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String METHOD_INSERT_UPDATE_DANHMUC = "DanhMucInsertUpdate";
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String[] PARAMETER_SOAP_DANHMUC = {"madm", "tendm"};
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String SOAP_ACTION_INSERT_UPDATE_DANHMUC = null;
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String METHOD_DELETE_DANHMUC = "DanhMucDelete";
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String[] PARAMETER_SOAP_DELETE_DANHMUC = {"madm"};
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String SOAP_ACTION_DELETE_DANHMUC = null;
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String METHOD_COUNT_SANPHAM = "SanPhamCount";
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String[] PARAMETER_SOAP_COUNT_SANPHAM_AND_QUERY_SANPHAMS = {"madm", "fromPrice", "toPrice"};
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String SOAP_ACTION_COUNT_SANPHAM = null;
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String METHOD_SANPHAM_DETAIL = "SanPhamDetail";
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String[] PARAMETER_SOAP_SANPHAM_DETAIL = {"masp"};
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String SOAP_ACTION_SANPHAM_DETAIL = null;
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String METHOD_SANPHAMS = "SanPhams";
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String SOAP_ACTION_SANPHAMS = null;
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String METHOD_INSERT_UPDATE_SANPHAM = "SanPhamInsertUpdate";
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String[] PARAMETER_INSERT_UPDATE_SANPHAM = {"codesp", "namesp", "price", "codedm"};
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String SOAP_ACTION_INSERT_UPDATE_SANPHAM = null;
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String METHOD_DELETE_SANPHAM = "SanPhamDelete";
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String[] PARAMETER_DELETE_SANPHAM = {"masp"};
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String SOAP_ACTION_DELETE_SANPHAM = null;
        @org.jetbrains.annotations.NotNull()
        public static final elong.androidApp.services.webserviceBonus.AsyncTaskWebServiceCourse.ConfigurationWebServiceSoap INSTANCE = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSERVER_URL_SOAP_SERVER() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getNAME_SPACE_SOAP() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getMETHOD_COUNT_DANHMUC() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSOAP_ACTION_COUNT_DANHMUC() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getMETHOD_DANHMUC_DETAIL() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String[] getPARAMETER_SOAP_DANHMUC_DETAIL() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSOAP_ACTION_DANHMUC_DEATAIL() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getMETHOD_DANHMUCS() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSOAP_ACTION_DANHMUCS() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getMETHOD_INSERT_UPDATE_DANHMUC() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String[] getPARAMETER_SOAP_DANHMUC() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSOAP_ACTION_INSERT_UPDATE_DANHMUC() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getMETHOD_DELETE_DANHMUC() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String[] getPARAMETER_SOAP_DELETE_DANHMUC() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSOAP_ACTION_DELETE_DANHMUC() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getMETHOD_COUNT_SANPHAM() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String[] getPARAMETER_SOAP_COUNT_SANPHAM_AND_QUERY_SANPHAMS() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSOAP_ACTION_COUNT_SANPHAM() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getMETHOD_SANPHAM_DETAIL() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String[] getPARAMETER_SOAP_SANPHAM_DETAIL() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSOAP_ACTION_SANPHAM_DETAIL() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getMETHOD_SANPHAMS() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSOAP_ACTION_SANPHAMS() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getMETHOD_INSERT_UPDATE_SANPHAM() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String[] getPARAMETER_INSERT_UPDATE_SANPHAM() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSOAP_ACTION_INSERT_UPDATE_SANPHAM() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getMETHOD_DELETE_SANPHAM() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String[] getPARAMETER_DELETE_SANPHAM() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSOAP_ACTION_DELETE_SANPHAM() {
            return null;
        }
        
        private ConfigurationWebServiceSoap() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\'\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u0007\"\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0002\u0010\bJ\u0017\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u0014\u00a2\u0006\u0002\u0010\f\u00a8\u0006\r"}, d2 = {"Lelong/androidApp/services/webserviceBonus/AsyncTaskWebServiceCourse$DanhMucTotalTask;", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "", "()V", "doInBackground", "params", "", "([Ljava/lang/Void;)Ljava/lang/Integer;", "onPostExecute", "", "result", "(Ljava/lang/Integer;)V", "androidApp_release"})
    public static final class DanhMucTotalTask extends android.os.AsyncTask<java.lang.Void, java.lang.Void, java.lang.Integer> {
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        protected java.lang.Integer doInBackground(@org.jetbrains.annotations.NotNull()
        java.lang.Void... params) {
            return null;
        }
        
        @java.lang.Override()
        protected void onPostExecute(@org.jetbrains.annotations.Nullable()
        java.lang.Integer result) {
        }
        
        public DanhMucTotalTask() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0005\u00a2\u0006\u0002\u0010\u0005J\'\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0016\u0010\u0007\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\b\"\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0002\u0010\tJ\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0014\u00a8\u0006\r"}, d2 = {"Lelong/androidApp/services/webserviceBonus/AsyncTaskWebServiceCourse$DanhMucDetailTask;", "Landroid/os/AsyncTask;", "", "Ljava/lang/Void;", "Lelong/models/webserviceBonus/DanhMuc;", "()V", "doInBackground", "params", "", "([Ljava/lang/String;)Lelong/models/webserviceBonus/DanhMuc;", "onPostExecute", "", "result", "androidApp_release"})
    public static final class DanhMucDetailTask extends android.os.AsyncTask<java.lang.String, java.lang.Void, elong.models.webserviceBonus.DanhMuc> {
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        protected elong.models.webserviceBonus.DanhMuc doInBackground(@org.jetbrains.annotations.NotNull()
        java.lang.String... params) {
            return null;
        }
        
        @java.lang.Override()
        protected void onPostExecute(@org.jetbrains.annotations.Nullable()
        elong.models.webserviceBonus.DanhMuc result) {
        }
        
        public DanhMucDetailTask() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0005J+\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0016\u0010\u0007\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\b\"\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0002\u0010\tJ\u0018\u0010\n\u001a\u00020\u000b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u0014\u00a8\u0006\r"}, d2 = {"Lelong/androidApp/services/webserviceBonus/AsyncTaskWebServiceCourse$DanhMucsTask;", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "", "Lelong/models/webserviceBonus/DanhMuc;", "()V", "doInBackground", "params", "", "([Ljava/lang/Void;)Ljava/util/List;", "onPostExecute", "", "result", "androidApp_release"})
    public static final class DanhMucsTask extends android.os.AsyncTask<java.lang.Void, java.lang.Void, java.util.List<elong.models.webserviceBonus.DanhMuc>> {
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        protected java.util.List<elong.models.webserviceBonus.DanhMuc> doInBackground(@org.jetbrains.annotations.NotNull()
        java.lang.Void... params) {
            return null;
        }
        
        @java.lang.Override()
        protected void onPostExecute(@org.jetbrains.annotations.Nullable()
        java.util.List<elong.models.webserviceBonus.DanhMuc> result) {
        }
        
        public DanhMucsTask() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0005\u00a2\u0006\u0002\u0010\u0005J%\u0010\u0006\u001a\u00020\u00042\u0016\u0010\u0007\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\b\"\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0002\u0010\tJ\u0017\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0014\u00a2\u0006\u0002\u0010\r\u00a8\u0006\u000e"}, d2 = {"Lelong/androidApp/services/webserviceBonus/AsyncTaskWebServiceCourse$DanhMucInsertUpdateTask;", "Landroid/os/AsyncTask;", "", "Ljava/lang/Void;", "", "()V", "doInBackground", "params", "", "([Ljava/lang/String;)Ljava/lang/Boolean;", "onPostExecute", "", "result", "(Ljava/lang/Boolean;)V", "androidApp_release"})
    public static final class DanhMucInsertUpdateTask extends android.os.AsyncTask<java.lang.String, java.lang.Void, java.lang.Boolean> {
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        protected java.lang.Boolean doInBackground(@org.jetbrains.annotations.NotNull()
        java.lang.String... params) {
            return null;
        }
        
        @java.lang.Override()
        protected void onPostExecute(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean result) {
        }
        
        public DanhMucInsertUpdateTask() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0005\u00a2\u0006\u0002\u0010\u0005J%\u0010\u0006\u001a\u00020\u00042\u0016\u0010\u0007\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\b\"\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0002\u0010\tJ\u0017\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0014\u00a2\u0006\u0002\u0010\r\u00a8\u0006\u000e"}, d2 = {"Lelong/androidApp/services/webserviceBonus/AsyncTaskWebServiceCourse$DanhMucDeleteTask;", "Landroid/os/AsyncTask;", "", "Ljava/lang/Void;", "", "()V", "doInBackground", "params", "", "([Ljava/lang/String;)Ljava/lang/Boolean;", "onPostExecute", "", "result", "(Ljava/lang/Boolean;)V", "androidApp_release"})
    public static final class DanhMucDeleteTask extends android.os.AsyncTask<java.lang.String, java.lang.Void, java.lang.Boolean> {
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        protected java.lang.Boolean doInBackground(@org.jetbrains.annotations.NotNull()
        java.lang.String... params) {
            return null;
        }
        
        @java.lang.Override()
        protected void onPostExecute(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean result) {
        }
        
        public DanhMucDeleteTask() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0005\u00a2\u0006\u0002\u0010\u0005J\'\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0016\u0010\u0007\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\b\"\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0002\u0010\tJ\u0017\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0014\u00a2\u0006\u0002\u0010\r\u00a8\u0006\u000e"}, d2 = {"Lelong/androidApp/services/webserviceBonus/AsyncTaskWebServiceCourse$SanPhamTotalTask;", "Landroid/os/AsyncTask;", "", "Ljava/lang/Void;", "", "()V", "doInBackground", "params", "", "([Ljava/lang/String;)Ljava/lang/Integer;", "onPostExecute", "", "result", "(Ljava/lang/Integer;)V", "androidApp_release"})
    public static final class SanPhamTotalTask extends android.os.AsyncTask<java.lang.String, java.lang.Void, java.lang.Integer> {
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        protected java.lang.Integer doInBackground(@org.jetbrains.annotations.NotNull()
        java.lang.String... params) {
            return null;
        }
        
        @java.lang.Override()
        protected void onPostExecute(@org.jetbrains.annotations.Nullable()
        java.lang.Integer result) {
        }
        
        public SanPhamTotalTask() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0005\u00a2\u0006\u0002\u0010\u0005J\'\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0016\u0010\u0007\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\b\"\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0002\u0010\tJ\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0014\u00a8\u0006\r"}, d2 = {"Lelong/androidApp/services/webserviceBonus/AsyncTaskWebServiceCourse$SanPhamDetailTask;", "Landroid/os/AsyncTask;", "", "Ljava/lang/Void;", "Lelong/models/webserviceBonus/SanPham;", "()V", "doInBackground", "params", "", "([Ljava/lang/String;)Lelong/models/webserviceBonus/SanPham;", "onPostExecute", "", "result", "androidApp_release"})
    public static final class SanPhamDetailTask extends android.os.AsyncTask<java.lang.String, java.lang.Void, elong.models.webserviceBonus.SanPham> {
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        protected elong.models.webserviceBonus.SanPham doInBackground(@org.jetbrains.annotations.NotNull()
        java.lang.String... params) {
            return null;
        }
        
        @java.lang.Override()
        protected void onPostExecute(@org.jetbrains.annotations.Nullable()
        elong.models.webserviceBonus.SanPham result) {
        }
        
        public SanPhamDetailTask() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001B\u0005\u00a2\u0006\u0002\u0010\u0006J+\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\t\"\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0002\u0010\nJ\u0018\u0010\u000b\u001a\u00020\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0014\u00a8\u0006\u000e"}, d2 = {"Lelong/androidApp/services/webserviceBonus/AsyncTaskWebServiceCourse$SanPhamsTask;", "Landroid/os/AsyncTask;", "", "Ljava/lang/Void;", "", "Lelong/models/webserviceBonus/SanPham;", "()V", "doInBackground", "params", "", "([Ljava/lang/String;)Ljava/util/List;", "onPostExecute", "", "result", "androidApp_release"})
    public static final class SanPhamsTask extends android.os.AsyncTask<java.lang.String, java.lang.Void, java.util.List<elong.models.webserviceBonus.SanPham>> {
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        protected java.util.List<elong.models.webserviceBonus.SanPham> doInBackground(@org.jetbrains.annotations.NotNull()
        java.lang.String... params) {
            return null;
        }
        
        @java.lang.Override()
        protected void onPostExecute(@org.jetbrains.annotations.Nullable()
        java.util.List<elong.models.webserviceBonus.SanPham> result) {
        }
        
        public SanPhamsTask() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0005\u00a2\u0006\u0002\u0010\u0005J%\u0010\u0006\u001a\u00020\u00042\u0016\u0010\u0007\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\b\"\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0002\u0010\tJ\u0017\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0014\u00a2\u0006\u0002\u0010\r\u00a8\u0006\u000e"}, d2 = {"Lelong/androidApp/services/webserviceBonus/AsyncTaskWebServiceCourse$SanPhamInsertUpdateTask;", "Landroid/os/AsyncTask;", "", "Ljava/lang/Void;", "", "()V", "doInBackground", "params", "", "([Ljava/lang/String;)Ljava/lang/Boolean;", "onPostExecute", "", "result", "(Ljava/lang/Boolean;)V", "androidApp_release"})
    public static final class SanPhamInsertUpdateTask extends android.os.AsyncTask<java.lang.String, java.lang.Void, java.lang.Boolean> {
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        protected java.lang.Boolean doInBackground(@org.jetbrains.annotations.NotNull()
        java.lang.String... params) {
            return null;
        }
        
        @java.lang.Override()
        protected void onPostExecute(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean result) {
        }
        
        public SanPhamInsertUpdateTask() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0005\u00a2\u0006\u0002\u0010\u0005J%\u0010\u0006\u001a\u00020\u00042\u0016\u0010\u0007\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\b\"\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0002\u0010\tJ\u0017\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0014\u00a2\u0006\u0002\u0010\r\u00a8\u0006\u000e"}, d2 = {"Lelong/androidApp/services/webserviceBonus/AsyncTaskWebServiceCourse$SanPhamDeleteTask;", "Landroid/os/AsyncTask;", "", "Ljava/lang/Void;", "", "()V", "doInBackground", "params", "", "([Ljava/lang/String;)Ljava/lang/Boolean;", "onPostExecute", "", "result", "(Ljava/lang/Boolean;)V", "androidApp_release"})
    public static final class SanPhamDeleteTask extends android.os.AsyncTask<java.lang.String, java.lang.Void, java.lang.Boolean> {
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        protected java.lang.Boolean doInBackground(@org.jetbrains.annotations.NotNull()
        java.lang.String... params) {
            return null;
        }
        
        @java.lang.Override()
        protected void onPostExecute(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean result) {
        }
        
        public SanPhamDeleteTask() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020*J\u000e\u0010+\u001a\u00020,2\u0006\u0010)\u001a\u00020*J\u001d\u0010-\u001a\u00020\u00042\u0010\u0010.\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040/\u00a2\u0006\u0002\u00100R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0011\u0010\u000f\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0011\u0010\u0011\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0006R\u0014\u0010\u0019\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0006R\u0011\u0010\u001b\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0006R\u0014\u0010\u001d\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0006R\u0014\u0010\u001f\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0006R\u0014\u0010!\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0006R\u0014\u0010#\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0006R\u0014\u0010%\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0006\u00a8\u00061"}, d2 = {"Lelong/androidApp/services/webserviceBonus/AsyncTaskWebServiceCourse$ConfigurationWebServiceRestful;", "", "()V", "PROPERTY_CODEDM", "", "getPROPERTY_CODEDM", "()Ljava/lang/String;", "PROPERTY_CODESP", "getPROPERTY_CODESP", "PROPERTY_NAMEDM", "getPROPERTY_NAMEDM", "PROPERTY_NAMESP", "getPROPERTY_NAMESP", "PROPERTY_PRICESP", "getPROPERTY_PRICESP", "QUERY_ALL_DANHMUCS", "getQUERY_ALL_DANHMUCS", "QUERY_ALL_SANPHAMS", "getQUERY_ALL_SANPHAMS", "SERVER_URL_CODEDM", "getSERVER_URL_CODEDM", "SERVER_URL_CODESP", "getSERVER_URL_CODESP", "SERVER_URL_DANHMUC", "getSERVER_URL_DANHMUC", "SERVER_URL_FROM_PRICE", "getSERVER_URL_FROM_PRICE", "SERVER_URL_JSON", "getSERVER_URL_JSON", "SERVER_URL_NAMEDM", "getSERVER_URL_NAMEDM", "SERVER_URL_NAMESP", "getSERVER_URL_NAMESP", "SERVER_URL_PRICE", "getSERVER_URL_PRICE", "SERVER_URL_SANPHAM", "getSERVER_URL_SANPHAM", "SERVER_URL_TO_PRICE", "getSERVER_URL_TO_PRICE", "returnDanhMuc", "Lelong/models/webserviceBonus/DanhMuc;", "jsonObject", "Lorg/json/JSONObject;", "returnSanPham", "Lelong/models/webserviceBonus/SanPham;", "urlRequestSanPham", "params", "", "([Ljava/lang/String;)Ljava/lang/String;", "androidApp_release"})
    public static final class ConfigurationWebServiceRestful {
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String SERVER_URL_JSON = null;
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String SERVER_URL_SANPHAM = "SanPham/";
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String SERVER_URL_DANHMUC = "DanhMuc/";
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String SERVER_URL_CODEDM = "?madm=";
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String SERVER_URL_FROM_PRICE = "fromPrice=";
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String SERVER_URL_TO_PRICE = "&toPrice=";
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String QUERY_ALL_DANHMUCS = null;
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String PROPERTY_CODEDM = "MaDm";
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String PROPERTY_NAMEDM = "TenDm";
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String QUERY_ALL_SANPHAMS = null;
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String PROPERTY_CODESP = "MaSp";
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String PROPERTY_NAMESP = "TenSp";
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String PROPERTY_PRICESP = "DonGia";
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String SERVER_URL_NAMEDM = "&namedm=";
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String SERVER_URL_CODESP = "?masp=";
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String SERVER_URL_NAMESP = "&tensp=";
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String SERVER_URL_PRICE = "&price=";
        @org.jetbrains.annotations.NotNull()
        public static final elong.androidApp.services.webserviceBonus.AsyncTaskWebServiceCourse.ConfigurationWebServiceRestful INSTANCE = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSERVER_URL_JSON() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSERVER_URL_SANPHAM() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSERVER_URL_DANHMUC() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSERVER_URL_CODEDM() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSERVER_URL_FROM_PRICE() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSERVER_URL_TO_PRICE() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getQUERY_ALL_DANHMUCS() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPROPERTY_CODEDM() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPROPERTY_NAMEDM() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final elong.models.webserviceBonus.DanhMuc returnDanhMuc(@org.jetbrains.annotations.NotNull()
        org.json.JSONObject jsonObject) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getQUERY_ALL_SANPHAMS() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPROPERTY_CODESP() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPROPERTY_NAMESP() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPROPERTY_PRICESP() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String urlRequestSanPham(@org.jetbrains.annotations.NotNull()
        java.lang.String[] params) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final elong.models.webserviceBonus.SanPham returnSanPham(@org.jetbrains.annotations.NotNull()
        org.json.JSONObject jsonObject) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSERVER_URL_NAMEDM() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSERVER_URL_CODESP() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSERVER_URL_NAMESP() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSERVER_URL_PRICE() {
            return null;
        }
        
        private ConfigurationWebServiceRestful() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0005\u00a2\u0006\u0002\u0010\u0005J\'\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0016\u0010\u0007\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\b\"\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0002\u0010\tJ\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0014\u00a8\u0006\r"}, d2 = {"Lelong/androidApp/services/webserviceBonus/AsyncTaskWebServiceCourse$DanhMucDetailRestfulTask;", "Landroid/os/AsyncTask;", "", "Ljava/lang/Void;", "Lelong/models/webserviceBonus/DanhMuc;", "()V", "doInBackground", "params", "", "([Ljava/lang/String;)Lelong/models/webserviceBonus/DanhMuc;", "onPostExecute", "", "result", "androidApp_release"})
    public static final class DanhMucDetailRestfulTask extends android.os.AsyncTask<java.lang.String, java.lang.Void, elong.models.webserviceBonus.DanhMuc> {
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        protected elong.models.webserviceBonus.DanhMuc doInBackground(@org.jetbrains.annotations.NotNull()
        java.lang.String... params) {
            return null;
        }
        
        @java.lang.Override()
        protected void onPostExecute(@org.jetbrains.annotations.Nullable()
        elong.models.webserviceBonus.DanhMuc result) {
        }
        
        public DanhMucDetailRestfulTask() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0005J-\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0016\u0010\u0007\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\b\"\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0002\u0010\tJ\u0018\u0010\n\u001a\u00020\u000b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u0014\u00a8\u0006\r"}, d2 = {"Lelong/androidApp/services/webserviceBonus/AsyncTaskWebServiceCourse$DanhMucsRestfulTask;", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "", "Lelong/models/webserviceBonus/DanhMuc;", "()V", "doInBackground", "params", "", "([Ljava/lang/Void;)Ljava/util/List;", "onPostExecute", "", "result", "androidApp_release"})
    public static final class DanhMucsRestfulTask extends android.os.AsyncTask<java.lang.Void, java.lang.Void, java.util.List<elong.models.webserviceBonus.DanhMuc>> {
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        protected java.util.List<elong.models.webserviceBonus.DanhMuc> doInBackground(@org.jetbrains.annotations.NotNull()
        java.lang.Void... params) {
            return null;
        }
        
        @java.lang.Override()
        protected void onPostExecute(@org.jetbrains.annotations.Nullable()
        java.util.List<elong.models.webserviceBonus.DanhMuc> result) {
        }
        
        public DanhMucsRestfulTask() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0005\u00a2\u0006\u0002\u0010\u0005J%\u0010\u0006\u001a\u00020\u00042\u0016\u0010\u0007\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\b\"\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0002\u0010\tJ\u0017\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0014\u00a2\u0006\u0002\u0010\r\u00a8\u0006\u000e"}, d2 = {"Lelong/androidApp/services/webserviceBonus/AsyncTaskWebServiceCourse$DanhMucInsertUpdateResfulTask;", "Landroid/os/AsyncTask;", "", "Ljava/lang/Void;", "", "()V", "doInBackground", "params", "", "([Ljava/lang/String;)Ljava/lang/Boolean;", "onPostExecute", "", "result", "(Ljava/lang/Boolean;)V", "androidApp_release"})
    public static final class DanhMucInsertUpdateResfulTask extends android.os.AsyncTask<java.lang.String, java.lang.Void, java.lang.Boolean> {
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        protected java.lang.Boolean doInBackground(@org.jetbrains.annotations.NotNull()
        java.lang.String... params) {
            return null;
        }
        
        @java.lang.Override()
        protected void onPostExecute(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean result) {
        }
        
        public DanhMucInsertUpdateResfulTask() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0005\u00a2\u0006\u0002\u0010\u0005J%\u0010\u0006\u001a\u00020\u00042\u0016\u0010\u0007\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\b\"\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0002\u0010\tJ\u0017\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0014\u00a2\u0006\u0002\u0010\r\u00a8\u0006\u000e"}, d2 = {"Lelong/androidApp/services/webserviceBonus/AsyncTaskWebServiceCourse$DanhMucDeleteResfulTask;", "Landroid/os/AsyncTask;", "", "Ljava/lang/Void;", "", "()V", "doInBackground", "params", "", "([Ljava/lang/String;)Ljava/lang/Boolean;", "onPostExecute", "", "result", "(Ljava/lang/Boolean;)V", "androidApp_release"})
    public static final class DanhMucDeleteResfulTask extends android.os.AsyncTask<java.lang.String, java.lang.Void, java.lang.Boolean> {
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        protected java.lang.Boolean doInBackground(@org.jetbrains.annotations.NotNull()
        java.lang.String... params) {
            return null;
        }
        
        @java.lang.Override()
        protected void onPostExecute(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean result) {
        }
        
        public DanhMucDeleteResfulTask() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0005\u00a2\u0006\u0002\u0010\u0005J\'\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0016\u0010\u0007\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\b\"\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0002\u0010\tJ\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0014\u00a8\u0006\r"}, d2 = {"Lelong/androidApp/services/webserviceBonus/AsyncTaskWebServiceCourse$SanPhamDetailRestfulTask;", "Landroid/os/AsyncTask;", "", "Ljava/lang/Void;", "Lelong/models/webserviceBonus/SanPham;", "()V", "doInBackground", "params", "", "([Ljava/lang/String;)Lelong/models/webserviceBonus/SanPham;", "onPostExecute", "", "result", "androidApp_release"})
    public static final class SanPhamDetailRestfulTask extends android.os.AsyncTask<java.lang.String, java.lang.Void, elong.models.webserviceBonus.SanPham> {
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        protected elong.models.webserviceBonus.SanPham doInBackground(@org.jetbrains.annotations.NotNull()
        java.lang.String... params) {
            return null;
        }
        
        @java.lang.Override()
        protected void onPostExecute(@org.jetbrains.annotations.Nullable()
        elong.models.webserviceBonus.SanPham result) {
        }
        
        public SanPhamDetailRestfulTask() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001B\u0005\u00a2\u0006\u0002\u0010\u0006J-\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\t\"\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0002\u0010\nJ\u0018\u0010\u000b\u001a\u00020\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0014\u00a8\u0006\u000e"}, d2 = {"Lelong/androidApp/services/webserviceBonus/AsyncTaskWebServiceCourse$SanPhamsRestfulTask;", "Landroid/os/AsyncTask;", "", "Ljava/lang/Void;", "", "Lelong/models/webserviceBonus/SanPham;", "()V", "doInBackground", "params", "", "([Ljava/lang/String;)Ljava/util/List;", "onPostExecute", "", "result", "androidApp_release"})
    public static final class SanPhamsRestfulTask extends android.os.AsyncTask<java.lang.String, java.lang.Void, java.util.List<elong.models.webserviceBonus.SanPham>> {
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        protected java.util.List<elong.models.webserviceBonus.SanPham> doInBackground(@org.jetbrains.annotations.NotNull()
        java.lang.String... params) {
            return null;
        }
        
        @java.lang.Override()
        protected void onPostExecute(@org.jetbrains.annotations.Nullable()
        java.util.List<elong.models.webserviceBonus.SanPham> result) {
        }
        
        public SanPhamsRestfulTask() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0005\u00a2\u0006\u0002\u0010\u0005J%\u0010\u0006\u001a\u00020\u00042\u0016\u0010\u0007\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\b\"\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0002\u0010\tJ\u0017\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0014\u00a2\u0006\u0002\u0010\r\u00a8\u0006\u000e"}, d2 = {"Lelong/androidApp/services/webserviceBonus/AsyncTaskWebServiceCourse$SanPhamInsertUpdateResfulTask;", "Landroid/os/AsyncTask;", "", "Ljava/lang/Void;", "", "()V", "doInBackground", "params", "", "([Ljava/lang/String;)Ljava/lang/Boolean;", "onPostExecute", "", "result", "(Ljava/lang/Boolean;)V", "androidApp_release"})
    public static final class SanPhamInsertUpdateResfulTask extends android.os.AsyncTask<java.lang.String, java.lang.Void, java.lang.Boolean> {
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        protected java.lang.Boolean doInBackground(@org.jetbrains.annotations.NotNull()
        java.lang.String... params) {
            return null;
        }
        
        @java.lang.Override()
        protected void onPostExecute(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean result) {
        }
        
        public SanPhamInsertUpdateResfulTask() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0005\u00a2\u0006\u0002\u0010\u0005J%\u0010\u0006\u001a\u00020\u00042\u0016\u0010\u0007\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\b\"\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0002\u0010\tJ\u0017\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0014\u00a2\u0006\u0002\u0010\r\u00a8\u0006\u000e"}, d2 = {"Lelong/androidApp/services/webserviceBonus/AsyncTaskWebServiceCourse$SanPhamDeleteResfulTask;", "Landroid/os/AsyncTask;", "", "Ljava/lang/Void;", "", "()V", "doInBackground", "params", "", "([Ljava/lang/String;)Ljava/lang/Boolean;", "onPostExecute", "", "result", "(Ljava/lang/Boolean;)V", "androidApp_release"})
    public static final class SanPhamDeleteResfulTask extends android.os.AsyncTask<java.lang.String, java.lang.Void, java.lang.Boolean> {
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        protected java.lang.Boolean doInBackground(@org.jetbrains.annotations.NotNull()
        java.lang.String... params) {
            return null;
        }
        
        @java.lang.Override()
        protected void onPostExecute(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean result) {
        }
        
        public SanPhamDeleteResfulTask() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u0011\n\u0002\b\n\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0006R\u001b\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0016\u00a2\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0016\u00a2\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001b\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0006R\u0014\u0010\u001e\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0006\u00a8\u0006 "}, d2 = {"Lelong/androidApp/services/webserviceBonus/AsyncTaskWebServiceCourse$ConfigurationWebServiceVietcombank;", "", "()V", "ATTRIBUTE_BUY", "", "getATTRIBUTE_BUY", "()Ljava/lang/String;", "ATTRIBUTE_CURRENCY_CODE", "getATTRIBUTE_CURRENCY_CODE", "ATTRIBUTE_CURRENCY_NAME", "getATTRIBUTE_CURRENCY_NAME", "ATTRIBUTE_SELL", "getATTRIBUTE_SELL", "ATTRIBUTE_TRANSFER", "getATTRIBUTE_TRANSFER", "DATETIME", "getDATETIME", "EXRATE", "getEXRATE", "EXRATELIST", "getEXRATELIST", "PROPERTY_KEY", "", "getPROPERTY_KEY", "()[Ljava/lang/String;", "[Ljava/lang/String;", "PROPERTY_VALUE", "getPROPERTY_VALUE", "SERVER_URL_XML", "getSERVER_URL_XML", "SOURCE", "getSOURCE", "androidApp_release"})
    public static final class ConfigurationWebServiceVietcombank {
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String SERVER_URL_XML = "https://portal.vietcombank.com.vn/Usercontrols/TVPortal.TyGia/pXML.aspx";
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String[] PROPERTY_KEY = {"Content-Type"};
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String[] PROPERTY_VALUE = {"application/x-www-form-urlencoded"};
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String EXRATELIST = "ExrateList";
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String DATETIME = "DateTime";
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String EXRATE = "Exrate";
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String SOURCE = "Source";
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String ATTRIBUTE_CURRENCY_CODE = "CurrencyCode";
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String ATTRIBUTE_CURRENCY_NAME = "CurrencyName";
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String ATTRIBUTE_BUY = "Buy";
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String ATTRIBUTE_TRANSFER = "Transfer";
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String ATTRIBUTE_SELL = "Sell";
        @org.jetbrains.annotations.NotNull()
        public static final elong.androidApp.services.webserviceBonus.AsyncTaskWebServiceCourse.ConfigurationWebServiceVietcombank INSTANCE = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSERVER_URL_XML() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String[] getPROPERTY_KEY() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String[] getPROPERTY_VALUE() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getEXRATELIST() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDATETIME() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getEXRATE() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSOURCE() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getATTRIBUTE_CURRENCY_CODE() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getATTRIBUTE_CURRENCY_NAME() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getATTRIBUTE_BUY() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getATTRIBUTE_TRANSFER() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getATTRIBUTE_SELL() {
            return null;
        }
        
        private ConfigurationWebServiceVietcombank() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\'\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u0007\"\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0002\u0010\bJ\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u0015\u00a8\u0006\f"}, d2 = {"Lelong/androidApp/services/webserviceBonus/AsyncTaskWebServiceCourse$TyZaVietcombankTask;", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "Lelong/models/webserviceBonus/tyZaVietcombank/ExrateList;", "()V", "doInBackground", "params", "", "([Ljava/lang/Void;)Lelong/models/webserviceBonus/tyZaVietcombank/ExrateList;", "onPostExecute", "", "result", "androidApp_release"})
    public static final class TyZaVietcombankTask extends android.os.AsyncTask<java.lang.Void, java.lang.Void, elong.models.webserviceBonus.tyZaVietcombank.ExrateList> {
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        protected elong.models.webserviceBonus.tyZaVietcombank.ExrateList doInBackground(@org.jetbrains.annotations.NotNull()
        java.lang.Void... params) {
            return null;
        }
        
        @android.annotation.SuppressLint(value = {"SetTextI18n"})
        @java.lang.Override()
        protected void onPostExecute(@org.jetbrains.annotations.Nullable()
        elong.models.webserviceBonus.tyZaVietcombank.ExrateList result) {
        }
        
        public TyZaVietcombankTask() {
            super();
        }
    }
}