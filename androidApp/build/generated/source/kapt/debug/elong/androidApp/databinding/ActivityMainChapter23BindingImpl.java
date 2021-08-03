package elong.androidApp.databinding;
import elong.androidApp.R;
import elong.androidApp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainChapter23BindingImpl extends ActivityMainChapter23Binding implements elong.androidApp.generated.callback.OnTabChangeListener.Listener, elong.androidApp.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.scrollView3, 28);
        sViewsWithIds.put(R.id.textView21, 29);
        sViewsWithIds.put(R.id.textView8, 30);
        sViewsWithIds.put(R.id.btnCheToanBo, 31);
        sViewsWithIds.put(R.id.btnCheMotPhan, 32);
        sViewsWithIds.put(R.id.textView10, 33);
        sViewsWithIds.put(R.id.textView11, 34);
        sViewsWithIds.put(R.id.textView20, 35);
        sViewsWithIds.put(R.id.textView200, 36);
        sViewsWithIds.put(R.id.txtFont, 37);
        sViewsWithIds.put(R.id.lvFont, 38);
        sViewsWithIds.put(R.id.lvMusic, 39);
        sViewsWithIds.put(R.id.textView22, 40);
        sViewsWithIds.put(R.id.textView220, 41);
        sViewsWithIds.put(R.id.textView23, 42);
        sViewsWithIds.put(R.id.btnReadDanhBaOfMine, 43);
        sViewsWithIds.put(R.id.btnReadMessageOfMine, 44);
        sViewsWithIds.put(R.id.svSearchSong, 45);
        sViewsWithIds.put(android.R.id.tabs, 46);
        sViewsWithIds.put(android.R.id.tabcontent, 47);
        sViewsWithIds.put(R.id.tabViewKaraokeListSongDatabase, 48);
        sViewsWithIds.put(R.id.tabViewKaraokeLikeSongDatabase, 49);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    @Nullable
    private final android.widget.TabHost.OnTabChangeListener mCallback13;
    @Nullable
    private final android.view.View.OnClickListener mCallback12;
    // values
    // listeners
    private OnClickListenerImpl mDanhbasInforAddAndroidViewViewOnClickListener;
    private OnClickListenerImpl1 mExplicitIntentsSendDataZuaCacActivityAndroidViewViewOnClickListener;
    private OnClickListenerImpl2 mImplicitIntentsCallActivityAndroidViewViewOnClickListener;
    private OnClickListenerImpl3 mImplicitIntentsDialActivityAndroidViewViewOnClickListener;
    private OnClickListenerImpl4 mImplicitIntentsMessagerActivityAndroidViewViewOnClickListener;
    private OnClickListenerImpl5 mExplicitIntentsSendDataAndAnswerUSCLNAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener chkSaveInforLoginandroidCheckedAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of sharedPreferencesLogin.checkedSaveInfoLogin
            //         is sharedPreferencesLogin.setCheckedSaveInfoLogin((java.lang.Boolean) callbackArg_0)
            boolean callbackArg_0 = chkSaveInforLogin.isChecked();
            // localize variables for thread safety
            // sharedPreferencesLogin.checkedSaveInfoLogin
            java.lang.Boolean sharedPreferencesLoginCheckedSaveInfoLogin = null;
            // sharedPreferencesLogin != null
            boolean sharedPreferencesLoginJavaLangObjectNull = false;
            // sharedPreferencesLogin
            elong.modelView.mainActivityChapter23.SharedPreferencesLogin sharedPreferencesLogin = mSharedPreferencesLogin;



            sharedPreferencesLoginJavaLangObjectNull = (sharedPreferencesLogin) != (null);
            if (sharedPreferencesLoginJavaLangObjectNull) {




                sharedPreferencesLogin.setCheckedSaveInfoLogin(((java.lang.Boolean) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener txtAsendDataandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of explicitIntents.aSendData
            //         is explicitIntents.setASendData((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(txtAsendData);
            // localize variables for thread safety
            // explicitIntents
            elong.modelView.mainActivityChapter23.ExplicitIntents explicitIntents = mExplicitIntents;
            // explicitIntents != null
            boolean explicitIntentsJavaLangObjectNull = false;
            // explicitIntents.aSendData
            java.lang.String explicitIntentsASendData = null;



            explicitIntentsJavaLangObjectNull = (explicitIntents) != (null);
            if (explicitIntentsJavaLangObjectNull) {




                explicitIntents.setASendData(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener txtBsendDataandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of explicitIntents.bSendData
            //         is explicitIntents.setBSendData((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(txtBsendData);
            // localize variables for thread safety
            // explicitIntents
            elong.modelView.mainActivityChapter23.ExplicitIntents explicitIntents = mExplicitIntents;
            // explicitIntents != null
            boolean explicitIntentsJavaLangObjectNull = false;
            // explicitIntents.bSendData
            java.lang.String explicitIntentsBSendData = null;



            explicitIntentsJavaLangObjectNull = (explicitIntents) != (null);
            if (explicitIntentsJavaLangObjectNull) {




                explicitIntents.setBSendData(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener txtCodeContactandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of danhbasInfor.addSaveCodeDanhBa.get()
            //         is danhbasInfor.addSaveCodeDanhBa.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(txtCodeContact);
            // localize variables for thread safety
            // danhbasInfor
            elong.modelView.mainActivityChapter1EventOnView.DanhBas danhbasInfor = mDanhbasInfor;
            // danhbasInfor.addSaveCodeDanhBa != null
            boolean danhbasInforAddSaveCodeDanhBaJavaLangObjectNull = false;
            // danhbasInfor.addSaveCodeDanhBa.get()
            java.lang.String danhbasInforAddSaveCodeDanhBaGet = null;
            // danhbasInfor.addSaveCodeDanhBa
            androidx.databinding.ObservableField<java.lang.String> danhbasInforAddSaveCodeDanhBa = null;
            // danhbasInfor != null
            boolean danhbasInforJavaLangObjectNull = false;



            danhbasInforJavaLangObjectNull = (danhbasInfor) != (null);
            if (danhbasInforJavaLangObjectNull) {


                danhbasInforAddSaveCodeDanhBa = danhbasInfor.getAddSaveCodeDanhBa();

                danhbasInforAddSaveCodeDanhBaJavaLangObjectNull = (danhbasInforAddSaveCodeDanhBa) != (null);
                if (danhbasInforAddSaveCodeDanhBaJavaLangObjectNull) {




                    danhbasInforAddSaveCodeDanhBa.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener txtCodeDanhBaDatabaseandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of danhbasInfor.addSaveCodeDanhBa.get()
            //         is danhbasInfor.addSaveCodeDanhBa.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(txtCodeDanhBaDatabase);
            // localize variables for thread safety
            // danhbasInfor
            elong.modelView.mainActivityChapter1EventOnView.DanhBas danhbasInfor = mDanhbasInfor;
            // danhbasInfor.addSaveCodeDanhBa != null
            boolean danhbasInforAddSaveCodeDanhBaJavaLangObjectNull = false;
            // danhbasInfor.addSaveCodeDanhBa.get()
            java.lang.String danhbasInforAddSaveCodeDanhBaGet = null;
            // danhbasInfor.addSaveCodeDanhBa
            androidx.databinding.ObservableField<java.lang.String> danhbasInforAddSaveCodeDanhBa = null;
            // danhbasInfor != null
            boolean danhbasInforJavaLangObjectNull = false;



            danhbasInforJavaLangObjectNull = (danhbasInfor) != (null);
            if (danhbasInforJavaLangObjectNull) {


                danhbasInforAddSaveCodeDanhBa = danhbasInfor.getAddSaveCodeDanhBa();

                danhbasInforAddSaveCodeDanhBaJavaLangObjectNull = (danhbasInforAddSaveCodeDanhBa) != (null);
                if (danhbasInforAddSaveCodeDanhBaJavaLangObjectNull) {




                    danhbasInforAddSaveCodeDanhBa.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener txtKetQuaSendDataandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of explicitIntentsFeedbackData.resultSendData
            //         is explicitIntentsFeedbackData.setResultSendData((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(txtKetQuaSendData);
            // localize variables for thread safety
            // explicitIntentsFeedbackData.resultSendData
            java.lang.String explicitIntentsFeedbackDataResultSendData = null;
            // explicitIntentsFeedbackData
            elong.modelView.mainActivityChapter23.ExplicitIntentsFeedbackData explicitIntentsFeedbackData = mExplicitIntentsFeedbackData;
            // explicitIntentsFeedbackData != null
            boolean explicitIntentsFeedbackDataJavaLangObjectNull = false;



            explicitIntentsFeedbackDataJavaLangObjectNull = (explicitIntentsFeedbackData) != (null);
            if (explicitIntentsFeedbackDataJavaLangObjectNull) {




                explicitIntentsFeedbackData.setResultSendData(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener txtMessengerActivityandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of implicitIntents.messageActivity
            //         is implicitIntents.setMessageActivity((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(txtMessengerActivity);
            // localize variables for thread safety
            // implicitIntents.messageActivity
            java.lang.String implicitIntentsMessageActivity = null;
            // implicitIntents != null
            boolean implicitIntentsJavaLangObjectNull = false;
            // implicitIntents
            elong.modelView.mainActivityChapter23.ImplicitIntents implicitIntents = mImplicitIntents;



            implicitIntentsJavaLangObjectNull = (implicitIntents) != (null);
            if (implicitIntentsJavaLangObjectNull) {




                implicitIntents.setMessageActivity(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener txtNameContactandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of danhbasInfor.addSaveNameDanhBa.get()
            //         is danhbasInfor.addSaveNameDanhBa.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(txtNameContact);
            // localize variables for thread safety
            // danhbasInfor
            elong.modelView.mainActivityChapter1EventOnView.DanhBas danhbasInfor = mDanhbasInfor;
            // danhbasInfor.addSaveNameDanhBa.get()
            java.lang.String danhbasInforAddSaveNameDanhBaGet = null;
            // danhbasInfor.addSaveNameDanhBa != null
            boolean danhbasInforAddSaveNameDanhBaJavaLangObjectNull = false;
            // danhbasInfor.addSaveNameDanhBa
            androidx.databinding.ObservableField<java.lang.String> danhbasInforAddSaveNameDanhBa = null;
            // danhbasInfor != null
            boolean danhbasInforJavaLangObjectNull = false;



            danhbasInforJavaLangObjectNull = (danhbasInfor) != (null);
            if (danhbasInforJavaLangObjectNull) {


                danhbasInforAddSaveNameDanhBa = danhbasInfor.getAddSaveNameDanhBa();

                danhbasInforAddSaveNameDanhBaJavaLangObjectNull = (danhbasInforAddSaveNameDanhBa) != (null);
                if (danhbasInforAddSaveNameDanhBaJavaLangObjectNull) {




                    danhbasInforAddSaveNameDanhBa.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener txtNameDanhBaDatabaseandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of danhbasInfor.addSaveNameDanhBa.get()
            //         is danhbasInfor.addSaveNameDanhBa.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(txtNameDanhBaDatabase);
            // localize variables for thread safety
            // danhbasInfor
            elong.modelView.mainActivityChapter1EventOnView.DanhBas danhbasInfor = mDanhbasInfor;
            // danhbasInfor.addSaveNameDanhBa.get()
            java.lang.String danhbasInforAddSaveNameDanhBaGet = null;
            // danhbasInfor.addSaveNameDanhBa != null
            boolean danhbasInforAddSaveNameDanhBaJavaLangObjectNull = false;
            // danhbasInfor.addSaveNameDanhBa
            androidx.databinding.ObservableField<java.lang.String> danhbasInforAddSaveNameDanhBa = null;
            // danhbasInfor != null
            boolean danhbasInforJavaLangObjectNull = false;



            danhbasInforJavaLangObjectNull = (danhbasInfor) != (null);
            if (danhbasInforJavaLangObjectNull) {


                danhbasInforAddSaveNameDanhBa = danhbasInfor.getAddSaveNameDanhBa();

                danhbasInforAddSaveNameDanhBaJavaLangObjectNull = (danhbasInforAddSaveNameDanhBa) != (null);
                if (danhbasInforAddSaveNameDanhBaJavaLangObjectNull) {




                    danhbasInforAddSaveNameDanhBa.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener txtPasswordandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of sharedPreferencesLogin.password
            //         is sharedPreferencesLogin.setPassword((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(txtPassword);
            // localize variables for thread safety
            // sharedPreferencesLogin.password
            java.lang.String sharedPreferencesLoginPassword = null;
            // sharedPreferencesLogin != null
            boolean sharedPreferencesLoginJavaLangObjectNull = false;
            // sharedPreferencesLogin
            elong.modelView.mainActivityChapter23.SharedPreferencesLogin sharedPreferencesLogin = mSharedPreferencesLogin;



            sharedPreferencesLoginJavaLangObjectNull = (sharedPreferencesLogin) != (null);
            if (sharedPreferencesLoginJavaLangObjectNull) {




                sharedPreferencesLogin.setPassword(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener txtPhoneActivityandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of implicitIntents.phoneActivity
            //         is implicitIntents.setPhoneActivity((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(txtPhoneActivity);
            // localize variables for thread safety
            // implicitIntents.phoneActivity
            java.lang.String implicitIntentsPhoneActivity = null;
            // implicitIntents != null
            boolean implicitIntentsJavaLangObjectNull = false;
            // implicitIntents
            elong.modelView.mainActivityChapter23.ImplicitIntents implicitIntents = mImplicitIntents;



            implicitIntentsJavaLangObjectNull = (implicitIntents) != (null);
            if (implicitIntentsJavaLangObjectNull) {




                implicitIntents.setPhoneActivity(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener txtPhoneContactandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of danhbasInfor.addSavePhoneDanhBa.get()
            //         is danhbasInfor.addSavePhoneDanhBa.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(txtPhoneContact);
            // localize variables for thread safety
            // danhbasInfor
            elong.modelView.mainActivityChapter1EventOnView.DanhBas danhbasInfor = mDanhbasInfor;
            // danhbasInfor.addSavePhoneDanhBa != null
            boolean danhbasInforAddSavePhoneDanhBaJavaLangObjectNull = false;
            // danhbasInfor.addSavePhoneDanhBa
            androidx.databinding.ObservableField<java.lang.String> danhbasInforAddSavePhoneDanhBa = null;
            // danhbasInfor != null
            boolean danhbasInforJavaLangObjectNull = false;
            // danhbasInfor.addSavePhoneDanhBa.get()
            java.lang.String danhbasInforAddSavePhoneDanhBaGet = null;



            danhbasInforJavaLangObjectNull = (danhbasInfor) != (null);
            if (danhbasInforJavaLangObjectNull) {


                danhbasInforAddSavePhoneDanhBa = danhbasInfor.getAddSavePhoneDanhBa();

                danhbasInforAddSavePhoneDanhBaJavaLangObjectNull = (danhbasInforAddSavePhoneDanhBa) != (null);
                if (danhbasInforAddSavePhoneDanhBaJavaLangObjectNull) {




                    danhbasInforAddSavePhoneDanhBa.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener txtPhoneDanhBaDatabaseandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of danhbasInfor.addSavePhoneDanhBa.get()
            //         is danhbasInfor.addSavePhoneDanhBa.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(txtPhoneDanhBaDatabase);
            // localize variables for thread safety
            // danhbasInfor
            elong.modelView.mainActivityChapter1EventOnView.DanhBas danhbasInfor = mDanhbasInfor;
            // danhbasInfor.addSavePhoneDanhBa != null
            boolean danhbasInforAddSavePhoneDanhBaJavaLangObjectNull = false;
            // danhbasInfor.addSavePhoneDanhBa
            androidx.databinding.ObservableField<java.lang.String> danhbasInforAddSavePhoneDanhBa = null;
            // danhbasInfor != null
            boolean danhbasInforJavaLangObjectNull = false;
            // danhbasInfor.addSavePhoneDanhBa.get()
            java.lang.String danhbasInforAddSavePhoneDanhBaGet = null;



            danhbasInforJavaLangObjectNull = (danhbasInfor) != (null);
            if (danhbasInforJavaLangObjectNull) {


                danhbasInforAddSavePhoneDanhBa = danhbasInfor.getAddSavePhoneDanhBa();

                danhbasInforAddSavePhoneDanhBaJavaLangObjectNull = (danhbasInforAddSavePhoneDanhBa) != (null);
                if (danhbasInforAddSavePhoneDanhBaJavaLangObjectNull) {




                    danhbasInforAddSavePhoneDanhBa.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener txtUsernameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of sharedPreferencesLogin.username
            //         is sharedPreferencesLogin.setUsername((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(txtUsername);
            // localize variables for thread safety
            // sharedPreferencesLogin != null
            boolean sharedPreferencesLoginJavaLangObjectNull = false;
            // sharedPreferencesLogin.username
            java.lang.String sharedPreferencesLoginUsername = null;
            // sharedPreferencesLogin
            elong.modelView.mainActivityChapter23.SharedPreferencesLogin sharedPreferencesLogin = mSharedPreferencesLogin;



            sharedPreferencesLoginJavaLangObjectNull = (sharedPreferencesLogin) != (null);
            if (sharedPreferencesLoginJavaLangObjectNull) {




                sharedPreferencesLogin.setUsername(((java.lang.String) (callbackArg_0)));
            }
        }
    };

    public ActivityMainChapter23BindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 50, sIncludes, sViewsWithIds));
    }
    private ActivityMainChapter23BindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 11
            , (android.widget.Button) bindings[22]
            , (android.widget.Button) bindings[14]
            , (android.widget.Button) bindings[32]
            , (android.widget.Button) bindings[31]
            , (android.widget.Button) bindings[23]
            , (android.widget.Button) bindings[13]
            , (android.widget.Button) bindings[15]
            , (android.widget.Button) bindings[43]
            , (android.widget.Button) bindings[44]
            , (android.widget.Button) bindings[5]
            , (android.widget.Button) bindings[6]
            , (android.widget.Button) bindings[10]
            , (android.widget.CheckBox) bindings[18]
            , (android.widget.Spinner) bindings[1]
            , (android.widget.ListView) bindings[24]
            , (android.widget.ListView) bindings[38]
            , (android.widget.ListView) bindings[39]
            , (android.widget.Spinner) bindings[27]
            , (android.widget.Spinner) bindings[26]
            , (android.widget.ScrollView) bindings[28]
            , (android.widget.SearchView) bindings[45]
            , (android.widget.TabHost) bindings[25]
            , (android.widget.LinearLayout) bindings[49]
            , (android.widget.LinearLayout) bindings[48]
            , (android.widget.FrameLayout) bindings[47]
            , (android.widget.TabWidget) bindings[46]
            , (android.widget.TextView) bindings[33]
            , (android.widget.TextView) bindings[34]
            , (android.widget.TextView) bindings[35]
            , (android.widget.TextView) bindings[36]
            , (android.widget.TextView) bindings[29]
            , (android.widget.TextView) bindings[40]
            , (android.widget.TextView) bindings[41]
            , (android.widget.TextView) bindings[42]
            , (android.widget.TextView) bindings[30]
            , (android.widget.EditText) bindings[7]
            , (android.widget.EditText) bindings[8]
            , (android.widget.EditText) bindings[2]
            , (android.widget.EditText) bindings[19]
            , (android.widget.TextView) bindings[37]
            , (android.widget.TextView) bindings[9]
            , (android.widget.EditText) bindings[12]
            , (android.widget.EditText) bindings[3]
            , (android.widget.EditText) bindings[20]
            , (android.widget.EditText) bindings[17]
            , (android.widget.EditText) bindings[11]
            , (android.widget.EditText) bindings[4]
            , (android.widget.EditText) bindings[21]
            , (android.widget.EditText) bindings[16]
            );
        this.btnAddOrUpdateDanhBa.setTag(null);
        this.btnCallActivity.setTag(null);
        this.btnDeleteDanhBa.setTag(null);
        this.btnDialActivity.setTag(null);
        this.btnMessengerActivity.setTag(null);
        this.btnSaveContact.setTag(null);
        this.btnSendData.setTag(null);
        this.btnSendDataAndAnswer.setTag(null);
        this.chkSaveInforLogin.setTag(null);
        this.lvDanhBa.setTag(null);
        this.lvDanhBaDatabase.setTag(null);
        this.lvSongLikeDatabse.setTag(null);
        this.lvSongListDatabse.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tabHostKaraokeDatabase.setTag(null);
        this.txtAsendData.setTag(null);
        this.txtBsendData.setTag(null);
        this.txtCodeContact.setTag(null);
        this.txtCodeDanhBaDatabase.setTag(null);
        this.txtKetQuaSendData.setTag(null);
        this.txtMessengerActivity.setTag(null);
        this.txtNameContact.setTag(null);
        this.txtNameDanhBaDatabase.setTag(null);
        this.txtPassword.setTag(null);
        this.txtPhoneActivity.setTag(null);
        this.txtPhoneContact.setTag(null);
        this.txtPhoneDanhBaDatabase.setTag(null);
        this.txtUsername.setTag(null);
        setRootTag(root);
        // listeners
        mCallback13 = new elong.androidApp.generated.callback.OnTabChangeListener(this, 2);
        mCallback12 = new elong.androidApp.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x80000L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.danhbasInfor == variableId) {
            setDanhbasInfor((elong.modelView.mainActivityChapter1EventOnView.DanhBas) variable);
        }
        else if (BR.explicitIntents == variableId) {
            setExplicitIntents((elong.modelView.mainActivityChapter23.ExplicitIntents) variable);
        }
        else if (BR.explicitIntentsFeedbackData == variableId) {
            setExplicitIntentsFeedbackData((elong.modelView.mainActivityChapter23.ExplicitIntentsFeedbackData) variable);
        }
        else if (BR.sharedPreferencesLogin == variableId) {
            setSharedPreferencesLogin((elong.modelView.mainActivityChapter23.SharedPreferencesLogin) variable);
        }
        else if (BR.musicsInfor == variableId) {
            setMusicsInfor((elong.modelView.mainActivityChapter1EventOnView.Musics) variable);
        }
        else if (BR.implicitIntents == variableId) {
            setImplicitIntents((elong.modelView.mainActivityChapter23.ImplicitIntents) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setDanhbasInfor(@Nullable elong.modelView.mainActivityChapter1EventOnView.DanhBas DanhbasInfor) {
        updateRegistration(1, DanhbasInfor);
        this.mDanhbasInfor = DanhbasInfor;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.danhbasInfor);
        super.requestRebind();
    }
    public void setExplicitIntents(@Nullable elong.modelView.mainActivityChapter23.ExplicitIntents ExplicitIntents) {
        updateRegistration(2, ExplicitIntents);
        this.mExplicitIntents = ExplicitIntents;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.explicitIntents);
        super.requestRebind();
    }
    public void setExplicitIntentsFeedbackData(@Nullable elong.modelView.mainActivityChapter23.ExplicitIntentsFeedbackData ExplicitIntentsFeedbackData) {
        updateRegistration(4, ExplicitIntentsFeedbackData);
        this.mExplicitIntentsFeedbackData = ExplicitIntentsFeedbackData;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.explicitIntentsFeedbackData);
        super.requestRebind();
    }
    public void setSharedPreferencesLogin(@Nullable elong.modelView.mainActivityChapter23.SharedPreferencesLogin SharedPreferencesLogin) {
        updateRegistration(5, SharedPreferencesLogin);
        this.mSharedPreferencesLogin = SharedPreferencesLogin;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.sharedPreferencesLogin);
        super.requestRebind();
    }
    public void setMusicsInfor(@Nullable elong.modelView.mainActivityChapter1EventOnView.Musics MusicsInfor) {
        updateRegistration(9, MusicsInfor);
        this.mMusicsInfor = MusicsInfor;
        synchronized(this) {
            mDirtyFlags |= 0x200L;
        }
        notifyPropertyChanged(BR.musicsInfor);
        super.requestRebind();
    }
    public void setImplicitIntents(@Nullable elong.modelView.mainActivityChapter23.ImplicitIntents ImplicitIntents) {
        updateRegistration(10, ImplicitIntents);
        this.mImplicitIntents = ImplicitIntents;
        synchronized(this) {
            mDirtyFlags |= 0x400L;
        }
        notifyPropertyChanged(BR.implicitIntents);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeDanhbasInforAddSavePhoneDanhBa((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeDanhbasInfor((elong.modelView.mainActivityChapter1EventOnView.DanhBas) object, fieldId);
            case 2 :
                return onChangeExplicitIntents((elong.modelView.mainActivityChapter23.ExplicitIntents) object, fieldId);
            case 3 :
                return onChangeDanhbasInforDanhBas((androidx.databinding.ObservableArrayList<elong.models.chapter1_2_3_7.DanhBa>) object, fieldId);
            case 4 :
                return onChangeExplicitIntentsFeedbackData((elong.modelView.mainActivityChapter23.ExplicitIntentsFeedbackData) object, fieldId);
            case 5 :
                return onChangeSharedPreferencesLogin((elong.modelView.mainActivityChapter23.SharedPreferencesLogin) object, fieldId);
            case 6 :
                return onChangeMusicsInforMusics((androidx.databinding.ObservableArrayList<elong.models.chapter1_3.Music>) object, fieldId);
            case 7 :
                return onChangeDanhbasInforAddSaveCodeDanhBa((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 8 :
                return onChangeDanhbasInforAddSaveNameDanhBa((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 9 :
                return onChangeMusicsInfor((elong.modelView.mainActivityChapter1EventOnView.Musics) object, fieldId);
            case 10 :
                return onChangeImplicitIntents((elong.modelView.mainActivityChapter23.ImplicitIntents) object, fieldId);
        }
        return false;
    }
    private boolean onChangeDanhbasInforAddSavePhoneDanhBa(androidx.databinding.ObservableField<java.lang.String> DanhbasInforAddSavePhoneDanhBa, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDanhbasInfor(elong.modelView.mainActivityChapter1EventOnView.DanhBas DanhbasInfor, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        else if (fieldId == BR.danhBas) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeExplicitIntents(elong.modelView.mainActivityChapter23.ExplicitIntents ExplicitIntents, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        else if (fieldId == BR.aSendData) {
            synchronized(this) {
                    mDirtyFlags |= 0x800L;
            }
            return true;
        }
        else if (fieldId == BR.bSendData) {
            synchronized(this) {
                    mDirtyFlags |= 0x1000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDanhbasInforDanhBas(androidx.databinding.ObservableArrayList<elong.models.chapter1_2_3_7.DanhBa> DanhbasInforDanhBas, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeExplicitIntentsFeedbackData(elong.modelView.mainActivityChapter23.ExplicitIntentsFeedbackData ExplicitIntentsFeedbackData, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        else if (fieldId == BR.resultSendData) {
            synchronized(this) {
                    mDirtyFlags |= 0x2000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeSharedPreferencesLogin(elong.modelView.mainActivityChapter23.SharedPreferencesLogin SharedPreferencesLogin, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        else if (fieldId == BR.username) {
            synchronized(this) {
                    mDirtyFlags |= 0x4000L;
            }
            return true;
        }
        else if (fieldId == BR.password) {
            synchronized(this) {
                    mDirtyFlags |= 0x8000L;
            }
            return true;
        }
        else if (fieldId == BR.checkedSaveInfoLogin) {
            synchronized(this) {
                    mDirtyFlags |= 0x10000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeMusicsInforMusics(androidx.databinding.ObservableArrayList<elong.models.chapter1_3.Music> MusicsInforMusics, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDanhbasInforAddSaveCodeDanhBa(androidx.databinding.ObservableField<java.lang.String> DanhbasInforAddSaveCodeDanhBa, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDanhbasInforAddSaveNameDanhBa(androidx.databinding.ObservableField<java.lang.String> DanhbasInforAddSaveNameDanhBa, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeMusicsInfor(elong.modelView.mainActivityChapter1EventOnView.Musics MusicsInfor, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
            }
            return true;
        }
        else if (fieldId == BR.musics) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeImplicitIntents(elong.modelView.mainActivityChapter23.ImplicitIntents ImplicitIntents, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x400L;
            }
            return true;
        }
        else if (fieldId == BR.phoneActivity) {
            synchronized(this) {
                    mDirtyFlags |= 0x20000L;
            }
            return true;
        }
        else if (fieldId == BR.messageActivity) {
            synchronized(this) {
                    mDirtyFlags |= 0x40000L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String sharedPreferencesLoginUsername = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxSharedPreferencesLoginCheckedSaveInfoLogin = false;
        android.view.View.OnClickListener danhbasInforAddAndroidViewViewOnClickListener = null;
        androidx.databinding.ObservableField<java.lang.String> danhbasInforAddSavePhoneDanhBa = null;
        android.view.View.OnClickListener explicitIntentsSendDataZuaCacActivityAndroidViewViewOnClickListener = null;
        elong.modelView.mainActivityChapter1EventOnView.DanhBas danhbasInfor = mDanhbasInfor;
        elong.modelView.mainActivityChapter23.ExplicitIntents explicitIntents = mExplicitIntents;
        androidx.databinding.ObservableArrayList<elong.models.chapter1_2_3_7.DanhBa> danhbasInforDanhBas = null;
        java.lang.String danhbasInforAddSavePhoneDanhBaGet = null;
        java.lang.String explicitIntentsBSendData = null;
        elong.modelView.mainActivityChapter23.ExplicitIntentsFeedbackData explicitIntentsFeedbackData = mExplicitIntentsFeedbackData;
        elong.modelView.mainActivityChapter23.SharedPreferencesLogin sharedPreferencesLogin = mSharedPreferencesLogin;
        androidx.databinding.ObservableArrayList<elong.models.chapter1_3.Music> musicsInforMusics = null;
        java.lang.String explicitIntentsFeedbackDataResultSendData = null;
        android.view.View.OnClickListener implicitIntentsCallActivityAndroidViewViewOnClickListener = null;
        androidx.databinding.ObservableField<java.lang.String> danhbasInforAddSaveCodeDanhBa = null;
        android.view.View.OnClickListener implicitIntentsDialActivityAndroidViewViewOnClickListener = null;
        java.lang.String sharedPreferencesLoginPassword = null;
        java.lang.String implicitIntentsMessageActivity = null;
        androidx.databinding.ObservableField<java.lang.String> danhbasInforAddSaveNameDanhBa = null;
        elong.modelView.mainActivityChapter1EventOnView.Musics musicsInfor = mMusicsInfor;
        java.lang.String danhbasInforAddSaveNameDanhBaGet = null;
        elong.modelView.mainActivityChapter23.ImplicitIntents implicitIntents = mImplicitIntents;
        java.lang.String danhbasInforAddSaveCodeDanhBaGet = null;
        java.lang.Boolean sharedPreferencesLoginCheckedSaveInfoLogin = null;
        java.lang.String implicitIntentsPhoneActivity = null;
        android.view.View.OnClickListener implicitIntentsMessagerActivityAndroidViewViewOnClickListener = null;
        android.view.View.OnClickListener explicitIntentsSendDataAndAnswerUSCLNAndroidViewViewOnClickListener = null;
        java.lang.String explicitIntentsASendData = null;

        if ((dirtyFlags & 0x8018bL) != 0) {


            if ((dirtyFlags & 0x80002L) != 0) {

                    if (danhbasInfor != null) {
                        // read danhbasInfor::add
                        danhbasInforAddAndroidViewViewOnClickListener = (((mDanhbasInforAddAndroidViewViewOnClickListener == null) ? (mDanhbasInforAddAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mDanhbasInforAddAndroidViewViewOnClickListener).setValue(danhbasInfor));
                    }
            }
            if ((dirtyFlags & 0x80003L) != 0) {

                    if (danhbasInfor != null) {
                        // read danhbasInfor.addSavePhoneDanhBa
                        danhbasInforAddSavePhoneDanhBa = danhbasInfor.getAddSavePhoneDanhBa();
                    }
                    updateRegistration(0, danhbasInforAddSavePhoneDanhBa);


                    if (danhbasInforAddSavePhoneDanhBa != null) {
                        // read danhbasInfor.addSavePhoneDanhBa.get()
                        danhbasInforAddSavePhoneDanhBaGet = danhbasInforAddSavePhoneDanhBa.get();
                    }
            }
            if ((dirtyFlags & 0x8000aL) != 0) {

                    if (danhbasInfor != null) {
                        // read danhbasInfor.danhBas
                        danhbasInforDanhBas = danhbasInfor.getDanhBas();
                    }
                    updateRegistration(3, danhbasInforDanhBas);
            }
            if ((dirtyFlags & 0x80082L) != 0) {

                    if (danhbasInfor != null) {
                        // read danhbasInfor.addSaveCodeDanhBa
                        danhbasInforAddSaveCodeDanhBa = danhbasInfor.getAddSaveCodeDanhBa();
                    }
                    updateRegistration(7, danhbasInforAddSaveCodeDanhBa);


                    if (danhbasInforAddSaveCodeDanhBa != null) {
                        // read danhbasInfor.addSaveCodeDanhBa.get()
                        danhbasInforAddSaveCodeDanhBaGet = danhbasInforAddSaveCodeDanhBa.get();
                    }
            }
            if ((dirtyFlags & 0x80102L) != 0) {

                    if (danhbasInfor != null) {
                        // read danhbasInfor.addSaveNameDanhBa
                        danhbasInforAddSaveNameDanhBa = danhbasInfor.getAddSaveNameDanhBa();
                    }
                    updateRegistration(8, danhbasInforAddSaveNameDanhBa);


                    if (danhbasInforAddSaveNameDanhBa != null) {
                        // read danhbasInfor.addSaveNameDanhBa.get()
                        danhbasInforAddSaveNameDanhBaGet = danhbasInforAddSaveNameDanhBa.get();
                    }
            }
        }
        if ((dirtyFlags & 0x81804L) != 0) {


            if ((dirtyFlags & 0x80004L) != 0) {

                    if (explicitIntents != null) {
                        // read explicitIntents::sendDataZuaCacActivity
                        explicitIntentsSendDataZuaCacActivityAndroidViewViewOnClickListener = (((mExplicitIntentsSendDataZuaCacActivityAndroidViewViewOnClickListener == null) ? (mExplicitIntentsSendDataZuaCacActivityAndroidViewViewOnClickListener = new OnClickListenerImpl1()) : mExplicitIntentsSendDataZuaCacActivityAndroidViewViewOnClickListener).setValue(explicitIntents));
                        // read explicitIntents::sendDataAndAnswerUSCLN
                        explicitIntentsSendDataAndAnswerUSCLNAndroidViewViewOnClickListener = (((mExplicitIntentsSendDataAndAnswerUSCLNAndroidViewViewOnClickListener == null) ? (mExplicitIntentsSendDataAndAnswerUSCLNAndroidViewViewOnClickListener = new OnClickListenerImpl5()) : mExplicitIntentsSendDataAndAnswerUSCLNAndroidViewViewOnClickListener).setValue(explicitIntents));
                    }
            }
            if ((dirtyFlags & 0x81004L) != 0) {

                    if (explicitIntents != null) {
                        // read explicitIntents.bSendData
                        explicitIntentsBSendData = explicitIntents.getBSendData();
                    }
            }
            if ((dirtyFlags & 0x80804L) != 0) {

                    if (explicitIntents != null) {
                        // read explicitIntents.aSendData
                        explicitIntentsASendData = explicitIntents.getASendData();
                    }
            }
        }
        if ((dirtyFlags & 0x82010L) != 0) {



                if (explicitIntentsFeedbackData != null) {
                    // read explicitIntentsFeedbackData.resultSendData
                    explicitIntentsFeedbackDataResultSendData = explicitIntentsFeedbackData.getResultSendData();
                }
        }
        if ((dirtyFlags & 0x9c020L) != 0) {


            if ((dirtyFlags & 0x84020L) != 0) {

                    if (sharedPreferencesLogin != null) {
                        // read sharedPreferencesLogin.username
                        sharedPreferencesLoginUsername = sharedPreferencesLogin.getUsername();
                    }
            }
            if ((dirtyFlags & 0x88020L) != 0) {

                    if (sharedPreferencesLogin != null) {
                        // read sharedPreferencesLogin.password
                        sharedPreferencesLoginPassword = sharedPreferencesLogin.getPassword();
                    }
            }
            if ((dirtyFlags & 0x90020L) != 0) {

                    if (sharedPreferencesLogin != null) {
                        // read sharedPreferencesLogin.checkedSaveInfoLogin
                        sharedPreferencesLoginCheckedSaveInfoLogin = sharedPreferencesLogin.getCheckedSaveInfoLogin();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(sharedPreferencesLogin.checkedSaveInfoLogin)
                    androidxDatabindingViewDataBindingSafeUnboxSharedPreferencesLoginCheckedSaveInfoLogin = androidx.databinding.ViewDataBinding.safeUnbox(sharedPreferencesLoginCheckedSaveInfoLogin);
            }
        }
        if ((dirtyFlags & 0x80240L) != 0) {



                if (musicsInfor != null) {
                    // read musicsInfor.musics
                    musicsInforMusics = musicsInfor.getMusics();
                }
                updateRegistration(6, musicsInforMusics);
        }
        if ((dirtyFlags & 0xe0400L) != 0) {


            if ((dirtyFlags & 0x80400L) != 0) {

                    if (implicitIntents != null) {
                        // read implicitIntents::callActivity
                        implicitIntentsCallActivityAndroidViewViewOnClickListener = (((mImplicitIntentsCallActivityAndroidViewViewOnClickListener == null) ? (mImplicitIntentsCallActivityAndroidViewViewOnClickListener = new OnClickListenerImpl2()) : mImplicitIntentsCallActivityAndroidViewViewOnClickListener).setValue(implicitIntents));
                        // read implicitIntents::dialActivity
                        implicitIntentsDialActivityAndroidViewViewOnClickListener = (((mImplicitIntentsDialActivityAndroidViewViewOnClickListener == null) ? (mImplicitIntentsDialActivityAndroidViewViewOnClickListener = new OnClickListenerImpl3()) : mImplicitIntentsDialActivityAndroidViewViewOnClickListener).setValue(implicitIntents));
                        // read implicitIntents::messagerActivity
                        implicitIntentsMessagerActivityAndroidViewViewOnClickListener = (((mImplicitIntentsMessagerActivityAndroidViewViewOnClickListener == null) ? (mImplicitIntentsMessagerActivityAndroidViewViewOnClickListener = new OnClickListenerImpl4()) : mImplicitIntentsMessagerActivityAndroidViewViewOnClickListener).setValue(implicitIntents));
                    }
            }
            if ((dirtyFlags & 0xc0400L) != 0) {

                    if (implicitIntents != null) {
                        // read implicitIntents.messageActivity
                        implicitIntentsMessageActivity = implicitIntents.getMessageActivity();
                    }
            }
            if ((dirtyFlags & 0xa0400L) != 0) {

                    if (implicitIntents != null) {
                        // read implicitIntents.phoneActivity
                        implicitIntentsPhoneActivity = implicitIntents.getPhoneActivity();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x80002L) != 0) {
            // api target 1

            this.btnAddOrUpdateDanhBa.setOnClickListener(danhbasInforAddAndroidViewViewOnClickListener);
            this.btnSaveContact.setOnClickListener(danhbasInforAddAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0x80400L) != 0) {
            // api target 1

            this.btnCallActivity.setOnClickListener(implicitIntentsCallActivityAndroidViewViewOnClickListener);
            this.btnDialActivity.setOnClickListener(implicitIntentsDialActivityAndroidViewViewOnClickListener);
            this.btnMessengerActivity.setOnClickListener(implicitIntentsMessagerActivityAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0x80000L) != 0) {
            // api target 1

            this.btnDeleteDanhBa.setOnClickListener(mCallback12);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.chkSaveInforLogin, (android.widget.CompoundButton.OnCheckedChangeListener)null, chkSaveInforLoginandroidCheckedAttrChanged);
            androidx.databinding.adapters.TabHostBindingAdapter.setListeners(this.tabHostKaraokeDatabase, mCallback13, (androidx.databinding.InverseBindingListener)null);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.txtAsendData, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, txtAsendDataandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.txtBsendData, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, txtBsendDataandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.txtCodeContact, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, txtCodeContactandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.txtCodeDanhBaDatabase, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, txtCodeDanhBaDatabaseandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.txtKetQuaSendData, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, txtKetQuaSendDataandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.txtMessengerActivity, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, txtMessengerActivityandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.txtNameContact, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, txtNameContactandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.txtNameDanhBaDatabase, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, txtNameDanhBaDatabaseandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.txtPassword, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, txtPasswordandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.txtPhoneActivity, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, txtPhoneActivityandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.txtPhoneContact, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, txtPhoneContactandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.txtPhoneDanhBaDatabase, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, txtPhoneDanhBaDatabaseandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.txtUsername, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, txtUsernameandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x80004L) != 0) {
            // api target 1

            this.btnSendData.setOnClickListener(explicitIntentsSendDataZuaCacActivityAndroidViewViewOnClickListener);
            this.btnSendDataAndAnswer.setOnClickListener(explicitIntentsSendDataAndAnswerUSCLNAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0x90020L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.chkSaveInforLogin, androidxDatabindingViewDataBindingSafeUnboxSharedPreferencesLoginCheckedSaveInfoLogin);
        }
        if ((dirtyFlags & 0x8000aL) != 0) {
            // api target 1

            elong.modelView.mainActivityChapter1EventOnView.DanhBasLvBinder.bindLítSpinner(this.lvDanhBa, danhbasInforDanhBas);
            elong.modelView.mainActivityChapter1EventOnView.DanhBasLvBinder.bindList(this.lvDanhBaDatabase, danhbasInforDanhBas);
        }
        if ((dirtyFlags & 0x80240L) != 0) {
            // api target 1

            elong.modelView.mainActivityChapter1EventOnView.MusicsBinder.bindListLike(this.lvSongLikeDatabse, musicsInforMusics);
            elong.modelView.mainActivityChapter1EventOnView.MusicsBinder.bindList(this.lvSongListDatabse, musicsInforMusics);
        }
        if ((dirtyFlags & 0x80804L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtAsendData, explicitIntentsASendData);
        }
        if ((dirtyFlags & 0x81004L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtBsendData, explicitIntentsBSendData);
        }
        if ((dirtyFlags & 0x80082L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtCodeContact, danhbasInforAddSaveCodeDanhBaGet);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtCodeDanhBaDatabase, danhbasInforAddSaveCodeDanhBaGet);
        }
        if ((dirtyFlags & 0x82010L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtKetQuaSendData, explicitIntentsFeedbackDataResultSendData);
        }
        if ((dirtyFlags & 0xc0400L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtMessengerActivity, implicitIntentsMessageActivity);
        }
        if ((dirtyFlags & 0x80102L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtNameContact, danhbasInforAddSaveNameDanhBaGet);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtNameDanhBaDatabase, danhbasInforAddSaveNameDanhBaGet);
        }
        if ((dirtyFlags & 0x88020L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtPassword, sharedPreferencesLoginPassword);
        }
        if ((dirtyFlags & 0xa0400L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtPhoneActivity, implicitIntentsPhoneActivity);
        }
        if ((dirtyFlags & 0x80003L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtPhoneContact, danhbasInforAddSavePhoneDanhBaGet);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtPhoneDanhBaDatabase, danhbasInforAddSavePhoneDanhBaGet);
        }
        if ((dirtyFlags & 0x84020L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtUsername, sharedPreferencesLoginUsername);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private elong.modelView.mainActivityChapter1EventOnView.DanhBas value;
        public OnClickListenerImpl setValue(elong.modelView.mainActivityChapter1EventOnView.DanhBas value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.add(arg0); 
        }
    }
    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener{
        private elong.modelView.mainActivityChapter23.ExplicitIntents value;
        public OnClickListenerImpl1 setValue(elong.modelView.mainActivityChapter23.ExplicitIntents value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.sendDataZuaCacActivity(arg0); 
        }
    }
    public static class OnClickListenerImpl2 implements android.view.View.OnClickListener{
        private elong.modelView.mainActivityChapter23.ImplicitIntents value;
        public OnClickListenerImpl2 setValue(elong.modelView.mainActivityChapter23.ImplicitIntents value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.callActivity(arg0); 
        }
    }
    public static class OnClickListenerImpl3 implements android.view.View.OnClickListener{
        private elong.modelView.mainActivityChapter23.ImplicitIntents value;
        public OnClickListenerImpl3 setValue(elong.modelView.mainActivityChapter23.ImplicitIntents value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.dialActivity(arg0); 
        }
    }
    public static class OnClickListenerImpl4 implements android.view.View.OnClickListener{
        private elong.modelView.mainActivityChapter23.ImplicitIntents value;
        public OnClickListenerImpl4 setValue(elong.modelView.mainActivityChapter23.ImplicitIntents value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.messagerActivity(arg0); 
        }
    }
    public static class OnClickListenerImpl5 implements android.view.View.OnClickListener{
        private elong.modelView.mainActivityChapter23.ExplicitIntents value;
        public OnClickListenerImpl5 setValue(elong.modelView.mainActivityChapter23.ExplicitIntents value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.sendDataAndAnswerUSCLN(arg0); 
        }
    }
    // callback impls
    public final void _internalCallbackOnTabChanged(int sourceId , java.lang.String callbackArg_0) {
        // localize variables for thread safety
        // musicsInfor != null
        boolean musicsInforJavaLangObjectNull = false;
        // musicsInfor
        elong.modelView.mainActivityChapter1EventOnView.Musics musicsInfor = mMusicsInfor;



        musicsInforJavaLangObjectNull = (musicsInfor) != (null);
        if (musicsInforJavaLangObjectNull) {



            musicsInfor.tabChangeDatabase(callbackArg_0);
        }
    }
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // danhbasInfor
        elong.modelView.mainActivityChapter1EventOnView.DanhBas danhbasInfor = mDanhbasInfor;
        // danhbasInfor != null
        boolean danhbasInforJavaLangObjectNull = false;



        danhbasInforJavaLangObjectNull = (danhbasInfor) != (null);
        if (danhbasInforJavaLangObjectNull) {


            danhbasInfor.remove();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): danhbasInfor.addSavePhoneDanhBa
        flag 1 (0x2L): danhbasInfor
        flag 2 (0x3L): explicitIntents
        flag 3 (0x4L): danhbasInfor.danhBas
        flag 4 (0x5L): explicitIntentsFeedbackData
        flag 5 (0x6L): sharedPreferencesLogin
        flag 6 (0x7L): musicsInfor.musics
        flag 7 (0x8L): danhbasInfor.addSaveCodeDanhBa
        flag 8 (0x9L): danhbasInfor.addSaveNameDanhBa
        flag 9 (0xaL): musicsInfor
        flag 10 (0xbL): implicitIntents
        flag 11 (0xcL): explicitIntents.aSendData
        flag 12 (0xdL): explicitIntents.bSendData
        flag 13 (0xeL): explicitIntentsFeedbackData.resultSendData
        flag 14 (0xfL): sharedPreferencesLogin.username
        flag 15 (0x10L): sharedPreferencesLogin.password
        flag 16 (0x11L): sharedPreferencesLogin.checkedSaveInfoLogin
        flag 17 (0x12L): implicitIntents.phoneActivity
        flag 18 (0x13L): implicitIntents.messageActivity
        flag 19 (0x14L): null
    flag mapping end*/
    //end
}