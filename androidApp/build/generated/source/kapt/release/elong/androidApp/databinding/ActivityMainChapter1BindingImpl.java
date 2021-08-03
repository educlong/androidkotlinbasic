package elong.androidApp.databinding;
import elong.androidApp.R;
import elong.androidApp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainChapter1BindingImpl extends ActivityMainChapter1Binding implements elong.androidApp.generated.callback.OnClickListener.Listener, elong.androidApp.generated.callback.OnCheckedChangeListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.scrollView2, 22);
        sViewsWithIds.put(R.id.screenView, 23);
        sViewsWithIds.put(R.id.textView, 24);
        sViewsWithIds.put(R.id.textView2, 25);
        sViewsWithIds.put(R.id.btnChangeScreen, 26);
        sViewsWithIds.put(R.id.autoStateOfUSA, 27);
        sViewsWithIds.put(R.id.txtSpring, 28);
        sViewsWithIds.put(R.id.txtSummer, 29);
        sViewsWithIds.put(R.id.txtAutumn, 30);
        sViewsWithIds.put(R.id.txtWinter, 31);
        sViewsWithIds.put(R.id.btnLongClick, 32);
        sViewsWithIds.put(R.id.btnExit, 33);
        sViewsWithIds.put(R.id.txtDateTime, 34);
        sViewsWithIds.put(R.id.spDayOfWeek, 35);
        sViewsWithIds.put(R.id.txtNameSpinner, 36);
        sViewsWithIds.put(R.id.btnChooseSpinner, 37);
        sViewsWithIds.put(R.id.radGreat, 38);
        sViewsWithIds.put(R.id.radGood, 39);
        sViewsWithIds.put(R.id.radBad, 40);
        sViewsWithIds.put(R.id.radLong, 41);
        sViewsWithIds.put(R.id.radNhan, 42);
        sViewsWithIds.put(R.id.btnVote, 43);
        sViewsWithIds.put(R.id.txtNumberBussinessEmployees, 44);
        sViewsWithIds.put(R.id.imgPic, 45);
        sViewsWithIds.put(R.id.lvDayOfWeek, 46);
        sViewsWithIds.put(R.id.txtName, 47);
        sViewsWithIds.put(R.id.btnSave, 48);
        sViewsWithIds.put(R.id.lvName, 49);
        sViewsWithIds.put(R.id.btnDate, 50);
        sViewsWithIds.put(R.id.btnTime, 51);
        sViewsWithIds.put(R.id.tabHostKaraoke, 52);
        sViewsWithIds.put(android.R.id.tabs, 53);
        sViewsWithIds.put(android.R.id.tabcontent, 54);
        sViewsWithIds.put(R.id.tabViewKaraokeListSong, 55);
        sViewsWithIds.put(R.id.tabViewKaraokeLikeSong, 56);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final android.widget.EditText mboundView1;
    @NonNull
    private final android.widget.EditText mboundView2;
    @NonNull
    private final android.widget.ImageButton mboundView3;
    @NonNull
    private final android.widget.Button mboundView4;
    @NonNull
    private final android.widget.Button mboundView5;
    @NonNull
    private final android.widget.Button mboundView6;
    @NonNull
    private final android.widget.Button mboundView7;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    @Nullable
    private final android.widget.CompoundButton.OnCheckedChangeListener mCallback5;
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    // values
    // listeners
    private OnClickListenerImpl mCheckResultStringAndroidViewViewOnClickListener;
    private OnClickListenerImpl1 mCheckImgBtnQuitAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener chkCandroidCheckedAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of check.c
            //         is check.setC((java.lang.Boolean) callbackArg_0)
            boolean callbackArg_0 = chkC.isChecked();
            // localize variables for thread safety
            // check != null
            boolean checkJavaLangObjectNull = false;
            // check
            elong.modelView.mainActivityChapter1EventOnView.Checkboxes check = mCheck;
            // check.c
            java.lang.Boolean checkC = null;



            checkJavaLangObjectNull = (check) != (null);
            if (checkJavaLangObjectNull) {




                check.setC(((java.lang.Boolean) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener chkCaddandroidCheckedAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of check.cadd
            //         is check.setCadd((java.lang.Boolean) callbackArg_0)
            boolean callbackArg_0 = chkCadd.isChecked();
            // localize variables for thread safety
            // check != null
            boolean checkJavaLangObjectNull = false;
            // check
            elong.modelView.mainActivityChapter1EventOnView.Checkboxes check = mCheck;
            // check.cadd
            java.lang.Boolean checkCadd = null;



            checkJavaLangObjectNull = (check) != (null);
            if (checkJavaLangObjectNull) {




                check.setCadd(((java.lang.Boolean) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener chkCsharpandroidCheckedAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of check.csharp
            //         is check.setCsharp((java.lang.Boolean) callbackArg_0)
            boolean callbackArg_0 = chkCsharp.isChecked();
            // localize variables for thread safety
            // check.csharp
            java.lang.Boolean checkCsharp = null;
            // check != null
            boolean checkJavaLangObjectNull = false;
            // check
            elong.modelView.mainActivityChapter1EventOnView.Checkboxes check = mCheck;



            checkJavaLangObjectNull = (check) != (null);
            if (checkJavaLangObjectNull) {




                check.setCsharp(((java.lang.Boolean) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener chkJavaandroidCheckedAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of check.java
            //         is check.setJava((java.lang.Boolean) callbackArg_0)
            boolean callbackArg_0 = chkJava.isChecked();
            // localize variables for thread safety
            // check != null
            boolean checkJavaLangObjectNull = false;
            // check
            elong.modelView.mainActivityChapter1EventOnView.Checkboxes check = mCheck;
            // check.java
            java.lang.Boolean checkJava = null;



            checkJavaLangObjectNull = (check) != (null);
            if (checkJavaLangObjectNull) {




                check.setJava(((java.lang.Boolean) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView1androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of ("") + (calculate.a)
            //         is calculate.setA((java.lang.Integer) androidx.databinding.ViewDataBinding.parse(callbackArg_0, calculate.a))
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView1);
            // localize variables for thread safety
            // (java.lang.Integer) androidx.databinding.ViewDataBinding.parse(callbackArg_0, calculate.a)
            java.lang.Integer javaLangIntegerAndroidxDatabindingViewDataBindingParseCallbackArg0CalculateA = null;
            // androidx.databinding.ViewDataBinding.parse(callbackArg_0, calculate.a)
            int androidxDatabindingViewDataBindingParseCallbackArg0CalculateA = 0;
            // ("") + (calculate.a)
            java.lang.String javaLangStringCalculateA = null;
            // calculate != null
            boolean calculateJavaLangObjectNull = false;
            // calculate
            elong.modelView.mainActivityChapter1EventOnView.Calculate calculate = mCalculate;
            // calculate.a
            java.lang.Integer calculateA = null;



            calculateJavaLangObjectNull = (calculate) != (null);
            if (calculateJavaLangObjectNull) {





                calculateA = calculate.getA();

                androidxDatabindingViewDataBindingParseCallbackArg0CalculateA = androidx.databinding.ViewDataBinding.parse(callbackArg_0, calculateA);

                javaLangIntegerAndroidxDatabindingViewDataBindingParseCallbackArg0CalculateA = ((java.lang.Integer) (androidxDatabindingViewDataBindingParseCallbackArg0CalculateA));

                calculate.setA(javaLangIntegerAndroidxDatabindingViewDataBindingParseCallbackArg0CalculateA);
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView2androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of ("") + (calculate.b)
            //         is calculate.setB((java.lang.Integer) androidx.databinding.ViewDataBinding.parse(callbackArg_0, calculate.b))
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView2);
            // localize variables for thread safety
            // (java.lang.Integer) androidx.databinding.ViewDataBinding.parse(callbackArg_0, calculate.b)
            java.lang.Integer javaLangIntegerAndroidxDatabindingViewDataBindingParseCallbackArg0CalculateB = null;
            // androidx.databinding.ViewDataBinding.parse(callbackArg_0, calculate.b)
            int androidxDatabindingViewDataBindingParseCallbackArg0CalculateB = 0;
            // ("") + (calculate.b)
            java.lang.String javaLangStringCalculateB = null;
            // calculate != null
            boolean calculateJavaLangObjectNull = false;
            // calculate
            elong.modelView.mainActivityChapter1EventOnView.Calculate calculate = mCalculate;
            // calculate.b
            java.lang.Integer calculateB = null;



            calculateJavaLangObjectNull = (calculate) != (null);
            if (calculateJavaLangObjectNull) {





                calculateB = calculate.getB();

                androidxDatabindingViewDataBindingParseCallbackArg0CalculateB = androidx.databinding.ViewDataBinding.parse(callbackArg_0, calculateB);

                javaLangIntegerAndroidxDatabindingViewDataBindingParseCallbackArg0CalculateB = ((java.lang.Integer) (androidxDatabindingViewDataBindingParseCallbackArg0CalculateB));

                calculate.setB(javaLangIntegerAndroidxDatabindingViewDataBindingParseCallbackArg0CalculateB);
            }
        }
    };
    private androidx.databinding.InverseBindingListener txtCodeSongandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of lvmusics.addCodeSong.get()
            //         is lvmusics.addCodeSong.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(txtCodeSong);
            // localize variables for thread safety
            // lvmusics.addCodeSong.get()
            java.lang.String lvmusicsAddCodeSongGet = null;
            // lvmusics
            elong.modelView.mainActivityChapter1EventOnView.Musics lvmusics = mLvmusics;
            // lvmusics != null
            boolean lvmusicsJavaLangObjectNull = false;
            // lvmusics.addCodeSong
            androidx.databinding.ObservableField<java.lang.String> lvmusicsAddCodeSong = null;
            // lvmusics.addCodeSong != null
            boolean lvmusicsAddCodeSongJavaLangObjectNull = false;



            lvmusicsJavaLangObjectNull = (lvmusics) != (null);
            if (lvmusicsJavaLangObjectNull) {


                lvmusicsAddCodeSong = lvmusics.getAddCodeSong();

                lvmusicsAddCodeSongJavaLangObjectNull = (lvmusicsAddCodeSong) != (null);
                if (lvmusicsAddCodeSongJavaLangObjectNull) {




                    lvmusicsAddCodeSong.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener txtNameSongandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of lvmusics.addNameSong.get()
            //         is lvmusics.addNameSong.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(txtNameSong);
            // localize variables for thread safety
            // lvmusics.addNameSong != null
            boolean lvmusicsAddNameSongJavaLangObjectNull = false;
            // lvmusics
            elong.modelView.mainActivityChapter1EventOnView.Musics lvmusics = mLvmusics;
            // lvmusics != null
            boolean lvmusicsJavaLangObjectNull = false;
            // lvmusics.addNameSong
            androidx.databinding.ObservableField<java.lang.String> lvmusicsAddNameSong = null;
            // lvmusics.addNameSong.get()
            java.lang.String lvmusicsAddNameSongGet = null;



            lvmusicsJavaLangObjectNull = (lvmusics) != (null);
            if (lvmusicsJavaLangObjectNull) {


                lvmusicsAddNameSong = lvmusics.getAddNameSong();

                lvmusicsAddNameSongJavaLangObjectNull = (lvmusicsAddNameSong) != (null);
                if (lvmusicsAddNameSongJavaLangObjectNull) {




                    lvmusicsAddNameSong.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener txtSelectandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of check.resultCheckbox
            //         is check.setResultCheckbox((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(txtSelect);
            // localize variables for thread safety
            // check.resultCheckbox
            java.lang.String checkResultCheckbox = null;
            // check != null
            boolean checkJavaLangObjectNull = false;
            // check
            elong.modelView.mainActivityChapter1EventOnView.Checkboxes check = mCheck;



            checkJavaLangObjectNull = (check) != (null);
            if (checkJavaLangObjectNull) {




                check.setResultCheckbox(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener txtSingerandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of lvmusics.addSinger.get()
            //         is lvmusics.addSinger.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(txtSinger);
            // localize variables for thread safety
            // lvmusics.addSinger.get()
            java.lang.String lvmusicsAddSingerGet = null;
            // lvmusics
            elong.modelView.mainActivityChapter1EventOnView.Musics lvmusics = mLvmusics;
            // lvmusics != null
            boolean lvmusicsJavaLangObjectNull = false;
            // lvmusics.addSinger != null
            boolean lvmusicsAddSingerJavaLangObjectNull = false;
            // lvmusics.addSinger
            androidx.databinding.ObservableField<java.lang.String> lvmusicsAddSinger = null;



            lvmusicsJavaLangObjectNull = (lvmusics) != (null);
            if (lvmusicsJavaLangObjectNull) {


                lvmusicsAddSinger = lvmusics.getAddSinger();

                lvmusicsAddSingerJavaLangObjectNull = (lvmusicsAddSinger) != (null);
                if (lvmusicsAddSingerJavaLangObjectNull) {




                    lvmusicsAddSinger.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public ActivityMainChapter1BindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 57, sIncludes, sViewsWithIds));
    }
    private ActivityMainChapter1BindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 11
            , (android.widget.AutoCompleteTextView) bindings[27]
            , (android.widget.Button) bindings[17]
            , (android.widget.Button) bindings[26]
            , (android.widget.Button) bindings[37]
            , (android.widget.ImageButton) bindings[50]
            , (android.widget.Button) bindings[33]
            , (android.widget.Button) bindings[32]
            , (android.widget.Button) bindings[48]
            , (android.widget.Button) bindings[12]
            , (android.widget.ImageButton) bindings[51]
            , (android.widget.Button) bindings[43]
            , (android.widget.CheckBox) bindings[11]
            , (android.widget.CheckBox) bindings[10]
            , (android.widget.CheckBox) bindings[9]
            , (android.widget.CheckBox) bindings[8]
            , (android.widget.GridView) bindings[19]
            , (android.widget.ImageView) bindings[45]
            , (android.widget.ListView) bindings[18]
            , (android.widget.ListView) bindings[46]
            , (android.widget.ListView) bindings[49]
            , (android.widget.ListView) bindings[21]
            , (android.widget.ListView) bindings[20]
            , (android.widget.RadioButton) bindings[40]
            , (android.widget.RadioButton) bindings[39]
            , (android.widget.RadioButton) bindings[38]
            , (android.widget.RadioButton) bindings[41]
            , (android.widget.RadioButton) bindings[42]
            , (android.widget.LinearLayout) bindings[23]
            , (android.widget.ScrollView) bindings[22]
            , (android.widget.Spinner) bindings[35]
            , (android.widget.TabHost) bindings[52]
            , (android.widget.LinearLayout) bindings[56]
            , (android.widget.LinearLayout) bindings[55]
            , (android.widget.FrameLayout) bindings[54]
            , (android.widget.TabWidget) bindings[53]
            , (android.widget.TextView) bindings[24]
            , (android.widget.TextView) bindings[25]
            , (android.widget.TextView) bindings[30]
            , (android.widget.EditText) bindings[14]
            , (android.widget.TextView) bindings[34]
            , (android.widget.EditText) bindings[47]
            , (android.widget.EditText) bindings[15]
            , (android.widget.EditText) bindings[36]
            , (android.widget.EditText) bindings[44]
            , (android.widget.TextView) bindings[13]
            , (android.widget.EditText) bindings[16]
            , (android.widget.TextView) bindings[28]
            , (android.widget.TextView) bindings[29]
            , (android.widget.TextView) bindings[31]
            );
        this.btnAddSongKaraoke.setTag(null);
        this.btnSelect.setTag(null);
        this.chkC.setTag(null);
        this.chkCadd.setTag(null);
        this.chkCsharp.setTag(null);
        this.chkJava.setTag(null);
        this.gvImage.setTag(null);
        this.lvDanhBaAdvance.setTag(null);
        this.lvSongLike.setTag(null);
        this.lvSongList.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.EditText) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.EditText) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.ImageButton) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.Button) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.Button) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.Button) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (android.widget.Button) bindings[7];
        this.mboundView7.setTag(null);
        this.txtCodeSong.setTag(null);
        this.txtNameSong.setTag(null);
        this.txtSelect.setTag(null);
        this.txtSinger.setTag(null);
        setRootTag(root);
        // listeners
        mCallback2 = new elong.androidApp.generated.callback.OnClickListener(this, 2);
        mCallback1 = new elong.androidApp.generated.callback.OnClickListener(this, 1);
        mCallback6 = new elong.androidApp.generated.callback.OnClickListener(this, 6);
        mCallback5 = new elong.androidApp.generated.callback.OnCheckedChangeListener(this, 5);
        mCallback4 = new elong.androidApp.generated.callback.OnClickListener(this, 4);
        mCallback3 = new elong.androidApp.generated.callback.OnClickListener(this, 3);
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
        if (BR.presenter == variableId) {
            setPresenter((elong.modelView.PresenterData) variable);
        }
        else if (BR.danhbasInfor == variableId) {
            setDanhbasInfor((elong.modelView.mainActivityChapter1EventOnView.DanhBas) variable);
        }
        else if (BR.check == variableId) {
            setCheck((elong.modelView.mainActivityChapter1EventOnView.Checkboxes) variable);
        }
        else if (BR.imgsInfor == variableId) {
            setImgsInfor((elong.modelView.mainActivityChapter1EventOnView.GvImages) variable);
        }
        else if (BR.lvmusics == variableId) {
            setLvmusics((elong.modelView.mainActivityChapter1EventOnView.Musics) variable);
        }
        else if (BR.calculate == variableId) {
            setCalculate((elong.modelView.mainActivityChapter1EventOnView.Calculate) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setPresenter(@Nullable elong.modelView.PresenterData Presenter) {
        this.mPresenter = Presenter;
        synchronized(this) {
            mDirtyFlags |= 0x800L;
        }
        notifyPropertyChanged(BR.presenter);
        super.requestRebind();
    }
    public void setDanhbasInfor(@Nullable elong.modelView.mainActivityChapter1EventOnView.DanhBas DanhbasInfor) {
        updateRegistration(0, DanhbasInfor);
        this.mDanhbasInfor = DanhbasInfor;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.danhbasInfor);
        super.requestRebind();
    }
    public void setCheck(@Nullable elong.modelView.mainActivityChapter1EventOnView.Checkboxes Check) {
        updateRegistration(2, Check);
        this.mCheck = Check;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.check);
        super.requestRebind();
    }
    public void setImgsInfor(@Nullable elong.modelView.mainActivityChapter1EventOnView.GvImages ImgsInfor) {
        updateRegistration(7, ImgsInfor);
        this.mImgsInfor = ImgsInfor;
        synchronized(this) {
            mDirtyFlags |= 0x80L;
        }
        notifyPropertyChanged(BR.imgsInfor);
        super.requestRebind();
    }
    public void setLvmusics(@Nullable elong.modelView.mainActivityChapter1EventOnView.Musics Lvmusics) {
        updateRegistration(8, Lvmusics);
        this.mLvmusics = Lvmusics;
        synchronized(this) {
            mDirtyFlags |= 0x100L;
        }
        notifyPropertyChanged(BR.lvmusics);
        super.requestRebind();
    }
    public void setCalculate(@Nullable elong.modelView.mainActivityChapter1EventOnView.Calculate Calculate) {
        updateRegistration(9, Calculate);
        this.mCalculate = Calculate;
        synchronized(this) {
            mDirtyFlags |= 0x200L;
        }
        notifyPropertyChanged(BR.calculate);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeDanhbasInfor((elong.modelView.mainActivityChapter1EventOnView.DanhBas) object, fieldId);
            case 1 :
                return onChangeDanhbasInforDanhBas((androidx.databinding.ObservableArrayList<elong.models.chapter1_2_3_7.DanhBa>) object, fieldId);
            case 2 :
                return onChangeCheck((elong.modelView.mainActivityChapter1EventOnView.Checkboxes) object, fieldId);
            case 3 :
                return onChangeLvmusicsAddNameSong((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeImgsInforImgs((androidx.databinding.ObservableArrayList<elong.modelView.mainActivityChapter1EventOnView.GvImage>) object, fieldId);
            case 5 :
                return onChangeLvmusicsAddSinger((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 6 :
                return onChangeLvmusicsMusics((androidx.databinding.ObservableArrayList<elong.models.chapter1_3.Music>) object, fieldId);
            case 7 :
                return onChangeImgsInfor((elong.modelView.mainActivityChapter1EventOnView.GvImages) object, fieldId);
            case 8 :
                return onChangeLvmusics((elong.modelView.mainActivityChapter1EventOnView.Musics) object, fieldId);
            case 9 :
                return onChangeCalculate((elong.modelView.mainActivityChapter1EventOnView.Calculate) object, fieldId);
            case 10 :
                return onChangeLvmusicsAddCodeSong((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeDanhbasInfor(elong.modelView.mainActivityChapter1EventOnView.DanhBas DanhbasInfor, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.danhBas) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDanhbasInforDanhBas(androidx.databinding.ObservableArrayList<elong.models.chapter1_2_3_7.DanhBa> DanhbasInforDanhBas, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeCheck(elong.modelView.mainActivityChapter1EventOnView.Checkboxes Check, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        else if (fieldId == BR.java) {
            synchronized(this) {
                    mDirtyFlags |= 0x1000L;
            }
            return true;
        }
        else if (fieldId == BR.csharp) {
            synchronized(this) {
                    mDirtyFlags |= 0x2000L;
            }
            return true;
        }
        else if (fieldId == BR.cadd) {
            synchronized(this) {
                    mDirtyFlags |= 0x4000L;
            }
            return true;
        }
        else if (fieldId == BR.c) {
            synchronized(this) {
                    mDirtyFlags |= 0x8000L;
            }
            return true;
        }
        else if (fieldId == BR.resultCheckbox) {
            synchronized(this) {
                    mDirtyFlags |= 0x10000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeLvmusicsAddNameSong(androidx.databinding.ObservableField<java.lang.String> LvmusicsAddNameSong, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeImgsInforImgs(androidx.databinding.ObservableArrayList<elong.modelView.mainActivityChapter1EventOnView.GvImage> ImgsInforImgs, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeLvmusicsAddSinger(androidx.databinding.ObservableField<java.lang.String> LvmusicsAddSinger, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeLvmusicsMusics(androidx.databinding.ObservableArrayList<elong.models.chapter1_3.Music> LvmusicsMusics, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeImgsInfor(elong.modelView.mainActivityChapter1EventOnView.GvImages ImgsInfor, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        else if (fieldId == BR.imgs) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeLvmusics(elong.modelView.mainActivityChapter1EventOnView.Musics Lvmusics, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
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
    private boolean onChangeCalculate(elong.modelView.mainActivityChapter1EventOnView.Calculate Calculate, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
            }
            return true;
        }
        else if (fieldId == BR.a) {
            synchronized(this) {
                    mDirtyFlags |= 0x20000L;
            }
            return true;
        }
        else if (fieldId == BR.b) {
            synchronized(this) {
                    mDirtyFlags |= 0x40000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeLvmusicsAddCodeSong(androidx.databinding.ObservableField<java.lang.String> LvmusicsAddCodeSong, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x400L;
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
        boolean androidxDatabindingViewDataBindingSafeUnboxCheckC = false;
        elong.modelView.PresenterData<?> presenter = mPresenter;
        android.view.View.OnClickListener checkResultStringAndroidViewViewOnClickListener = null;
        java.lang.String lvmusicsAddSingerGet = null;
        java.lang.Boolean checkCadd = null;
        elong.modelView.mainActivityChapter1EventOnView.DanhBas danhbasInfor = mDanhbasInfor;
        androidx.databinding.ObservableArrayList<elong.models.chapter1_2_3_7.DanhBa> danhbasInforDanhBas = null;
        elong.modelView.mainActivityChapter1EventOnView.Checkboxes check = mCheck;
        androidx.databinding.ObservableField<java.lang.String> lvmusicsAddNameSong = null;
        android.view.View.OnClickListener checkImgBtnQuitAndroidViewViewOnClickListener = null;
        java.lang.Boolean checkJava = null;
        java.lang.String lvmusicsAddNameSongGet = null;
        java.lang.String lvmusicsAddCodeSongGet = null;
        java.lang.String javaLangStringCalculateB = null;
        java.lang.Integer calculateB = null;
        androidx.databinding.ObservableArrayList<elong.modelView.mainActivityChapter1EventOnView.GvImage> imgsInforImgs = null;
        java.lang.Boolean checkC = null;
        java.lang.String checkResultCheckbox = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxCheckJava = false;
        java.lang.Boolean checkCsharp = null;
        androidx.databinding.ObservableField<java.lang.String> lvmusicsAddSinger = null;
        androidx.databinding.ObservableArrayList<elong.models.chapter1_3.Music> lvmusicsMusics = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxCheckCsharp = false;
        java.lang.Integer calculateA = null;
        java.lang.String javaLangStringCalculateA = null;
        elong.modelView.mainActivityChapter1EventOnView.GvImages imgsInfor = mImgsInfor;
        elong.modelView.mainActivityChapter1EventOnView.Musics lvmusics = mLvmusics;
        elong.modelView.mainActivityChapter1EventOnView.Calculate calculate = mCalculate;
        androidx.databinding.ObservableField<java.lang.String> lvmusicsAddCodeSong = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxCheckCadd = false;

        if ((dirtyFlags & 0x80003L) != 0) {



                if (danhbasInfor != null) {
                    // read danhbasInfor.danhBas
                    danhbasInforDanhBas = danhbasInfor.getDanhBas();
                }
                updateRegistration(1, danhbasInforDanhBas);
        }
        if ((dirtyFlags & 0x9f004L) != 0) {


            if ((dirtyFlags & 0x80004L) != 0) {

                    if (check != null) {
                        // read check::resultString
                        checkResultStringAndroidViewViewOnClickListener = (((mCheckResultStringAndroidViewViewOnClickListener == null) ? (mCheckResultStringAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mCheckResultStringAndroidViewViewOnClickListener).setValue(check));
                        // read check::imgBtnQuit
                        checkImgBtnQuitAndroidViewViewOnClickListener = (((mCheckImgBtnQuitAndroidViewViewOnClickListener == null) ? (mCheckImgBtnQuitAndroidViewViewOnClickListener = new OnClickListenerImpl1()) : mCheckImgBtnQuitAndroidViewViewOnClickListener).setValue(check));
                    }
            }
            if ((dirtyFlags & 0x84004L) != 0) {

                    if (check != null) {
                        // read check.cadd
                        checkCadd = check.getCadd();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(check.cadd)
                    androidxDatabindingViewDataBindingSafeUnboxCheckCadd = androidx.databinding.ViewDataBinding.safeUnbox(checkCadd);
            }
            if ((dirtyFlags & 0x81004L) != 0) {

                    if (check != null) {
                        // read check.java
                        checkJava = check.getJava();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(check.java)
                    androidxDatabindingViewDataBindingSafeUnboxCheckJava = androidx.databinding.ViewDataBinding.safeUnbox(checkJava);
            }
            if ((dirtyFlags & 0x88004L) != 0) {

                    if (check != null) {
                        // read check.c
                        checkC = check.getC();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(check.c)
                    androidxDatabindingViewDataBindingSafeUnboxCheckC = androidx.databinding.ViewDataBinding.safeUnbox(checkC);
            }
            if ((dirtyFlags & 0x90004L) != 0) {

                    if (check != null) {
                        // read check.resultCheckbox
                        checkResultCheckbox = check.getResultCheckbox();
                    }
            }
            if ((dirtyFlags & 0x82004L) != 0) {

                    if (check != null) {
                        // read check.csharp
                        checkCsharp = check.getCsharp();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(check.csharp)
                    androidxDatabindingViewDataBindingSafeUnboxCheckCsharp = androidx.databinding.ViewDataBinding.safeUnbox(checkCsharp);
            }
        }
        if ((dirtyFlags & 0x80090L) != 0) {



                if (imgsInfor != null) {
                    // read imgsInfor.imgs
                    imgsInforImgs = imgsInfor.getImgs();
                }
                updateRegistration(4, imgsInforImgs);
        }
        if ((dirtyFlags & 0x80568L) != 0) {


            if ((dirtyFlags & 0x80108L) != 0) {

                    if (lvmusics != null) {
                        // read lvmusics.addNameSong
                        lvmusicsAddNameSong = lvmusics.getAddNameSong();
                    }
                    updateRegistration(3, lvmusicsAddNameSong);


                    if (lvmusicsAddNameSong != null) {
                        // read lvmusics.addNameSong.get()
                        lvmusicsAddNameSongGet = lvmusicsAddNameSong.get();
                    }
            }
            if ((dirtyFlags & 0x80120L) != 0) {

                    if (lvmusics != null) {
                        // read lvmusics.addSinger
                        lvmusicsAddSinger = lvmusics.getAddSinger();
                    }
                    updateRegistration(5, lvmusicsAddSinger);


                    if (lvmusicsAddSinger != null) {
                        // read lvmusics.addSinger.get()
                        lvmusicsAddSingerGet = lvmusicsAddSinger.get();
                    }
            }
            if ((dirtyFlags & 0x80140L) != 0) {

                    if (lvmusics != null) {
                        // read lvmusics.musics
                        lvmusicsMusics = lvmusics.getMusics();
                    }
                    updateRegistration(6, lvmusicsMusics);
            }
            if ((dirtyFlags & 0x80500L) != 0) {

                    if (lvmusics != null) {
                        // read lvmusics.addCodeSong
                        lvmusicsAddCodeSong = lvmusics.getAddCodeSong();
                    }
                    updateRegistration(10, lvmusicsAddCodeSong);


                    if (lvmusicsAddCodeSong != null) {
                        // read lvmusics.addCodeSong.get()
                        lvmusicsAddCodeSongGet = lvmusicsAddCodeSong.get();
                    }
            }
        }
        if ((dirtyFlags & 0xe0200L) != 0) {


            if ((dirtyFlags & 0xc0200L) != 0) {

                    if (calculate != null) {
                        // read calculate.b
                        calculateB = calculate.getB();
                    }


                    // read ("") + (calculate.b)
                    javaLangStringCalculateB = ("") + (calculateB);
            }
            if ((dirtyFlags & 0xa0200L) != 0) {

                    if (calculate != null) {
                        // read calculate.a
                        calculateA = calculate.getA();
                    }


                    // read ("") + (calculate.a)
                    javaLangStringCalculateA = ("") + (calculateA);
            }
        }
        // batch finished
        if ((dirtyFlags & 0x80000L) != 0) {
            // api target 1

            this.btnAddSongKaraoke.setOnClickListener(mCallback6);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.chkC, (android.widget.CompoundButton.OnCheckedChangeListener)null, chkCandroidCheckedAttrChanged);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.chkCadd, (android.widget.CompoundButton.OnCheckedChangeListener)null, chkCaddandroidCheckedAttrChanged);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.chkCsharp, (android.widget.CompoundButton.OnCheckedChangeListener)null, chkCsharpandroidCheckedAttrChanged);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.chkJava, mCallback5, chkJavaandroidCheckedAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView1, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView1androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView2, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView2androidTextAttrChanged);
            this.mboundView4.setOnClickListener(mCallback1);
            this.mboundView5.setOnClickListener(mCallback2);
            this.mboundView6.setOnClickListener(mCallback3);
            this.mboundView7.setOnClickListener(mCallback4);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.txtCodeSong, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, txtCodeSongandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.txtNameSong, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, txtNameSongandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.txtSelect, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, txtSelectandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.txtSinger, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, txtSingerandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x80004L) != 0) {
            // api target 1

            this.btnSelect.setOnClickListener(checkResultStringAndroidViewViewOnClickListener);
            this.mboundView3.setOnClickListener(checkImgBtnQuitAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0x88004L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.chkC, androidxDatabindingViewDataBindingSafeUnboxCheckC);
        }
        if ((dirtyFlags & 0x84004L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.chkCadd, androidxDatabindingViewDataBindingSafeUnboxCheckCadd);
        }
        if ((dirtyFlags & 0x82004L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.chkCsharp, androidxDatabindingViewDataBindingSafeUnboxCheckCsharp);
        }
        if ((dirtyFlags & 0x81004L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.chkJava, androidxDatabindingViewDataBindingSafeUnboxCheckJava);
        }
        if ((dirtyFlags & 0x80090L) != 0) {
            // api target 1

            elong.modelView.mainActivityChapter1EventOnView.GvImagesBinder.bindList(this.gvImage, imgsInforImgs);
        }
        if ((dirtyFlags & 0x80003L) != 0) {
            // api target 1

            elong.modelView.mainActivityChapter1EventOnView.DanhBasLvBinder.bindList(this.lvDanhBaAdvance, danhbasInforDanhBas);
        }
        if ((dirtyFlags & 0x80140L) != 0) {
            // api target 1

            elong.modelView.mainActivityChapter1EventOnView.MusicsBinder.bindList(this.lvSongLike, lvmusicsMusics);
            elong.modelView.mainActivityChapter1EventOnView.MusicsBinder.bindList(this.lvSongList, lvmusicsMusics);
        }
        if ((dirtyFlags & 0xa0200L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, javaLangStringCalculateA);
        }
        if ((dirtyFlags & 0xc0200L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, javaLangStringCalculateB);
        }
        if ((dirtyFlags & 0x80500L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtCodeSong, lvmusicsAddCodeSongGet);
        }
        if ((dirtyFlags & 0x80108L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtNameSong, lvmusicsAddNameSongGet);
        }
        if ((dirtyFlags & 0x90004L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtSelect, checkResultCheckbox);
        }
        if ((dirtyFlags & 0x80120L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtSinger, lvmusicsAddSingerGet);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private elong.modelView.mainActivityChapter1EventOnView.Checkboxes value;
        public OnClickListenerImpl setValue(elong.modelView.mainActivityChapter1EventOnView.Checkboxes value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.resultString(arg0); 
        }
    }
    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener{
        private elong.modelView.mainActivityChapter1EventOnView.Checkboxes value;
        public OnClickListenerImpl1 setValue(elong.modelView.mainActivityChapter1EventOnView.Checkboxes value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.imgBtnQuit(arg0); 
        }
    }
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // presenter != null
                boolean presenterJavaLangObjectNull = false;
                // presenter
                elong.modelView.PresenterData presenter = mPresenter;
                // calculate != null
                boolean calculateJavaLangObjectNull = false;
                // calculate.adds()
                java.lang.String calculateAdds = null;
                // calculate
                elong.modelView.mainActivityChapter1EventOnView.Calculate calculate = mCalculate;



                presenterJavaLangObjectNull = (presenter) != (null);
                if (presenterJavaLangObjectNull) {



                    calculateJavaLangObjectNull = (calculate) != (null);
                    if (calculateJavaLangObjectNull) {


                        calculateAdds = calculate.adds();

                        presenter.onShowData(calculateAdds);
                    }
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // presenter != null
                boolean presenterJavaLangObjectNull = false;
                // presenter
                elong.modelView.PresenterData presenter = mPresenter;
                // calculate.minuss()
                java.lang.String calculateMinuss = null;
                // calculate != null
                boolean calculateJavaLangObjectNull = false;
                // calculate
                elong.modelView.mainActivityChapter1EventOnView.Calculate calculate = mCalculate;



                presenterJavaLangObjectNull = (presenter) != (null);
                if (presenterJavaLangObjectNull) {



                    calculateJavaLangObjectNull = (calculate) != (null);
                    if (calculateJavaLangObjectNull) {


                        calculateMinuss = calculate.minuss();

                        presenter.onShowData(calculateMinuss);
                    }
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // lvmusics
                elong.modelView.mainActivityChapter1EventOnView.Musics lvmusics = mLvmusics;
                // lvmusics != null
                boolean lvmusicsJavaLangObjectNull = false;



                lvmusicsJavaLangObjectNull = (lvmusics) != (null);
                if (lvmusicsJavaLangObjectNull) {


                    lvmusics.add();
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // presenter != null
                boolean presenterJavaLangObjectNull = false;
                // presenter
                elong.modelView.PresenterData presenter = mPresenter;
                // calculate.divide()
                java.lang.String calculateDivide = null;
                // calculate != null
                boolean calculateJavaLangObjectNull = false;
                // calculate
                elong.modelView.mainActivityChapter1EventOnView.Calculate calculate = mCalculate;



                presenterJavaLangObjectNull = (presenter) != (null);
                if (presenterJavaLangObjectNull) {



                    calculateJavaLangObjectNull = (calculate) != (null);
                    if (calculateJavaLangObjectNull) {


                        calculateDivide = calculate.divide();

                        presenter.onShowData(calculateDivide);
                    }
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // presenter != null
                boolean presenterJavaLangObjectNull = false;
                // calculate.multi()
                java.lang.String calculateMulti = null;
                // presenter
                elong.modelView.PresenterData presenter = mPresenter;
                // calculate != null
                boolean calculateJavaLangObjectNull = false;
                // calculate
                elong.modelView.mainActivityChapter1EventOnView.Calculate calculate = mCalculate;



                presenterJavaLangObjectNull = (presenter) != (null);
                if (presenterJavaLangObjectNull) {



                    calculateJavaLangObjectNull = (calculate) != (null);
                    if (calculateJavaLangObjectNull) {


                        calculateMulti = calculate.multi();

                        presenter.onShowData(calculateMulti);
                    }
                }
                break;
            }
        }
    }
    public final void _internalCallbackOnCheckedChanged(int sourceId , android.widget.CompoundButton callbackArg_0, boolean callbackArg_1) {
        // localize variables for thread safety
        // check != null
        boolean checkJavaLangObjectNull = false;
        // check
        elong.modelView.mainActivityChapter1EventOnView.Checkboxes check = mCheck;



        checkJavaLangObjectNull = (check) != (null);
        if (checkJavaLangObjectNull) {




            check.changeJava(callbackArg_0, callbackArg_1);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): danhbasInfor
        flag 1 (0x2L): danhbasInfor.danhBas
        flag 2 (0x3L): check
        flag 3 (0x4L): lvmusics.addNameSong
        flag 4 (0x5L): imgsInfor.imgs
        flag 5 (0x6L): lvmusics.addSinger
        flag 6 (0x7L): lvmusics.musics
        flag 7 (0x8L): imgsInfor
        flag 8 (0x9L): lvmusics
        flag 9 (0xaL): calculate
        flag 10 (0xbL): lvmusics.addCodeSong
        flag 11 (0xcL): presenter
        flag 12 (0xdL): check.java
        flag 13 (0xeL): check.csharp
        flag 14 (0xfL): check.cadd
        flag 15 (0x10L): check.c
        flag 16 (0x11L): check.resultCheckbox
        flag 17 (0x12L): calculate.a
        flag 18 (0x13L): calculate.b
        flag 19 (0x14L): null
    flag mapping end*/
    //end
}