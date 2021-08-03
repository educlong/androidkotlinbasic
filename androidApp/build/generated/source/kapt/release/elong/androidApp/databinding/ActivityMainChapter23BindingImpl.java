package elong.androidApp.databinding;
import elong.androidApp.R;
import elong.androidApp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainChapter23BindingImpl extends ActivityMainChapter23Binding implements elong.androidApp.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.scrollView3, 6);
        sViewsWithIds.put(R.id.textView21, 7);
        sViewsWithIds.put(R.id.textView8, 8);
        sViewsWithIds.put(R.id.btnCheToanBo, 9);
        sViewsWithIds.put(R.id.btnCheMotPhan, 10);
        sViewsWithIds.put(R.id.btnSendData, 11);
        sViewsWithIds.put(R.id.textView10, 12);
        sViewsWithIds.put(R.id.txtAsendData, 13);
        sViewsWithIds.put(R.id.textView11, 14);
        sViewsWithIds.put(R.id.txtBsendData, 15);
        sViewsWithIds.put(R.id.txtKetQuaSendData, 16);
        sViewsWithIds.put(R.id.btnSendDataAndAnswer, 17);
        sViewsWithIds.put(R.id.textView20, 18);
        sViewsWithIds.put(R.id.txtPhoneActivity, 19);
        sViewsWithIds.put(R.id.txtMessengerActivity, 20);
        sViewsWithIds.put(R.id.btnDialActivity, 21);
        sViewsWithIds.put(R.id.btnCallActivity, 22);
        sViewsWithIds.put(R.id.btnMessengerActivity, 23);
        sViewsWithIds.put(R.id.textView200, 24);
        sViewsWithIds.put(R.id.txtFont, 25);
        sViewsWithIds.put(R.id.lvFont, 26);
        sViewsWithIds.put(R.id.lvMusic, 27);
        sViewsWithIds.put(R.id.txtUsername, 28);
        sViewsWithIds.put(R.id.txtPassword, 29);
        sViewsWithIds.put(R.id.chkSaveInforLogin, 30);
        sViewsWithIds.put(R.id.textView22, 31);
        sViewsWithIds.put(R.id.txtCodeDanhBaDatabase, 32);
        sViewsWithIds.put(R.id.txtNameDanhBaDatabase, 33);
        sViewsWithIds.put(R.id.txtPhoneDanhBaDatabase, 34);
        sViewsWithIds.put(R.id.btnAddOrUpdateDanhBa, 35);
        sViewsWithIds.put(R.id.btnDeleteDanhBa, 36);
        sViewsWithIds.put(R.id.textView220, 37);
        sViewsWithIds.put(R.id.lvDanhBaDatabase, 38);
        sViewsWithIds.put(R.id.textView23, 39);
        sViewsWithIds.put(R.id.btnReadDanhBaOfMine, 40);
        sViewsWithIds.put(R.id.btnReadMessageOfMine, 41);
        sViewsWithIds.put(R.id.svSearchSong, 42);
        sViewsWithIds.put(R.id.tabHostKaraokeDatabase, 43);
        sViewsWithIds.put(android.R.id.tabs, 44);
        sViewsWithIds.put(android.R.id.tabcontent, 45);
        sViewsWithIds.put(R.id.tabViewKaraokeListSongDatabase, 46);
        sViewsWithIds.put(R.id.lvSongListDatabse, 47);
        sViewsWithIds.put(R.id.tabViewKaraokeLikeSongDatabase, 48);
        sViewsWithIds.put(R.id.lvSongLikeDatabse, 49);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback9;
    // values
    // listeners
    // Inverse Binding Event Handlers
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

    public ActivityMainChapter23BindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 50, sIncludes, sViewsWithIds));
    }
    private ActivityMainChapter23BindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 5
            , (android.widget.Button) bindings[35]
            , (android.widget.Button) bindings[22]
            , (android.widget.Button) bindings[10]
            , (android.widget.Button) bindings[9]
            , (android.widget.Button) bindings[36]
            , (android.widget.Button) bindings[21]
            , (android.widget.Button) bindings[23]
            , (android.widget.Button) bindings[40]
            , (android.widget.Button) bindings[41]
            , (android.widget.Button) bindings[5]
            , (android.widget.Button) bindings[11]
            , (android.widget.Button) bindings[17]
            , (android.widget.CheckBox) bindings[30]
            , (android.widget.ListView) bindings[1]
            , (android.widget.ListView) bindings[38]
            , (android.widget.ListView) bindings[26]
            , (android.widget.ListView) bindings[27]
            , (android.widget.ListView) bindings[49]
            , (android.widget.ListView) bindings[47]
            , (android.widget.ScrollView) bindings[6]
            , (android.widget.SearchView) bindings[42]
            , (android.widget.TabHost) bindings[43]
            , (android.widget.LinearLayout) bindings[48]
            , (android.widget.LinearLayout) bindings[46]
            , (android.widget.FrameLayout) bindings[45]
            , (android.widget.TabWidget) bindings[44]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[18]
            , (android.widget.TextView) bindings[24]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[31]
            , (android.widget.TextView) bindings[37]
            , (android.widget.TextView) bindings[39]
            , (android.widget.TextView) bindings[8]
            , (android.widget.EditText) bindings[13]
            , (android.widget.EditText) bindings[15]
            , (android.widget.EditText) bindings[2]
            , (android.widget.EditText) bindings[32]
            , (android.widget.TextView) bindings[25]
            , (android.widget.TextView) bindings[16]
            , (android.widget.EditText) bindings[20]
            , (android.widget.EditText) bindings[3]
            , (android.widget.EditText) bindings[33]
            , (android.widget.EditText) bindings[29]
            , (android.widget.EditText) bindings[19]
            , (android.widget.EditText) bindings[4]
            , (android.widget.EditText) bindings[34]
            , (android.widget.EditText) bindings[28]
            );
        this.btnSaveContact.setTag(null);
        this.lvDanhBa.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.txtCodeContact.setTag(null);
        this.txtNameContact.setTag(null);
        this.txtPhoneContact.setTag(null);
        setRootTag(root);
        // listeners
        mCallback9 = new elong.androidApp.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
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
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setDanhbasInfor(@Nullable elong.modelView.mainActivityChapter1EventOnView.DanhBas DanhbasInfor) {
        updateRegistration(3, DanhbasInfor);
        this.mDanhbasInfor = DanhbasInfor;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.danhbasInfor);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeDanhbasInforAddSaveCodeDanhBa((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeDanhbasInforAddSavePhoneDanhBa((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeDanhbasInforAddSaveNameDanhBa((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeDanhbasInfor((elong.modelView.mainActivityChapter1EventOnView.DanhBas) object, fieldId);
            case 4 :
                return onChangeDanhbasInforDanhBas((androidx.databinding.ObservableArrayList<elong.models.chapter1_2_3_7.DanhBa>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeDanhbasInforAddSaveCodeDanhBa(androidx.databinding.ObservableField<java.lang.String> DanhbasInforAddSaveCodeDanhBa, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDanhbasInforAddSavePhoneDanhBa(androidx.databinding.ObservableField<java.lang.String> DanhbasInforAddSavePhoneDanhBa, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDanhbasInforAddSaveNameDanhBa(androidx.databinding.ObservableField<java.lang.String> DanhbasInforAddSaveNameDanhBa, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDanhbasInfor(elong.modelView.mainActivityChapter1EventOnView.DanhBas DanhbasInfor, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        else if (fieldId == BR.danhBas) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDanhbasInforDanhBas(androidx.databinding.ObservableArrayList<elong.models.chapter1_2_3_7.DanhBa> DanhbasInforDanhBas, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
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
        androidx.databinding.ObservableField<java.lang.String> danhbasInforAddSaveCodeDanhBa = null;
        androidx.databinding.ObservableField<java.lang.String> danhbasInforAddSavePhoneDanhBa = null;
        androidx.databinding.ObservableField<java.lang.String> danhbasInforAddSaveNameDanhBa = null;
        elong.modelView.mainActivityChapter1EventOnView.DanhBas danhbasInfor = mDanhbasInfor;
        java.lang.String danhbasInforAddSaveNameDanhBaGet = null;
        androidx.databinding.ObservableArrayList<elong.models.chapter1_2_3_7.DanhBa> danhbasInforDanhBas = null;
        java.lang.String danhbasInforAddSavePhoneDanhBaGet = null;
        java.lang.String danhbasInforAddSaveCodeDanhBaGet = null;

        if ((dirtyFlags & 0x3fL) != 0) {


            if ((dirtyFlags & 0x29L) != 0) {

                    if (danhbasInfor != null) {
                        // read danhbasInfor.addSaveCodeDanhBa
                        danhbasInforAddSaveCodeDanhBa = danhbasInfor.getAddSaveCodeDanhBa();
                    }
                    updateRegistration(0, danhbasInforAddSaveCodeDanhBa);


                    if (danhbasInforAddSaveCodeDanhBa != null) {
                        // read danhbasInfor.addSaveCodeDanhBa.get()
                        danhbasInforAddSaveCodeDanhBaGet = danhbasInforAddSaveCodeDanhBa.get();
                    }
            }
            if ((dirtyFlags & 0x2aL) != 0) {

                    if (danhbasInfor != null) {
                        // read danhbasInfor.addSavePhoneDanhBa
                        danhbasInforAddSavePhoneDanhBa = danhbasInfor.getAddSavePhoneDanhBa();
                    }
                    updateRegistration(1, danhbasInforAddSavePhoneDanhBa);


                    if (danhbasInforAddSavePhoneDanhBa != null) {
                        // read danhbasInfor.addSavePhoneDanhBa.get()
                        danhbasInforAddSavePhoneDanhBaGet = danhbasInforAddSavePhoneDanhBa.get();
                    }
            }
            if ((dirtyFlags & 0x2cL) != 0) {

                    if (danhbasInfor != null) {
                        // read danhbasInfor.addSaveNameDanhBa
                        danhbasInforAddSaveNameDanhBa = danhbasInfor.getAddSaveNameDanhBa();
                    }
                    updateRegistration(2, danhbasInforAddSaveNameDanhBa);


                    if (danhbasInforAddSaveNameDanhBa != null) {
                        // read danhbasInfor.addSaveNameDanhBa.get()
                        danhbasInforAddSaveNameDanhBaGet = danhbasInforAddSaveNameDanhBa.get();
                    }
            }
            if ((dirtyFlags & 0x38L) != 0) {

                    if (danhbasInfor != null) {
                        // read danhbasInfor.danhBas
                        danhbasInforDanhBas = danhbasInfor.getDanhBas();
                    }
                    updateRegistration(4, danhbasInforDanhBas);
            }
        }
        // batch finished
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            this.btnSaveContact.setOnClickListener(mCallback9);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.txtCodeContact, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, txtCodeContactandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.txtNameContact, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, txtNameContactandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.txtPhoneContact, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, txtPhoneContactandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x38L) != 0) {
            // api target 1

            elong.modelView.mainActivityChapter1EventOnView.DanhBasLvBinder.bindList(this.lvDanhBa, danhbasInforDanhBas);
        }
        if ((dirtyFlags & 0x29L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtCodeContact, danhbasInforAddSaveCodeDanhBaGet);
        }
        if ((dirtyFlags & 0x2cL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtNameContact, danhbasInforAddSaveNameDanhBaGet);
        }
        if ((dirtyFlags & 0x2aL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtPhoneContact, danhbasInforAddSavePhoneDanhBaGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // danhbasInfor
        elong.modelView.mainActivityChapter1EventOnView.DanhBas danhbasInfor = mDanhbasInfor;
        // danhbasInfor != null
        boolean danhbasInforJavaLangObjectNull = false;



        danhbasInforJavaLangObjectNull = (danhbasInfor) != (null);
        if (danhbasInforJavaLangObjectNull) {


            danhbasInfor.add();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): danhbasInfor.addSaveCodeDanhBa
        flag 1 (0x2L): danhbasInfor.addSavePhoneDanhBa
        flag 2 (0x3L): danhbasInfor.addSaveNameDanhBa
        flag 3 (0x4L): danhbasInfor
        flag 4 (0x5L): danhbasInfor.danhBas
        flag 5 (0x6L): null
    flag mapping end*/
    //end
}