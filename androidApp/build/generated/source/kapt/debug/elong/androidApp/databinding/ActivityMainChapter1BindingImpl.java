package elong.androidApp.databinding;
import elong.androidApp.R;
import elong.androidApp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainChapter1BindingImpl extends ActivityMainChapter1Binding implements elong.androidApp.generated.callback.OnClickListener.Listener, elong.androidApp.generated.callback.OnTabChangeListener.Listener, elong.androidApp.generated.callback.OnCheckedChangeListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.scrollView2, 33);
        sViewsWithIds.put(R.id.screenView, 34);
        sViewsWithIds.put(R.id.textView, 35);
        sViewsWithIds.put(R.id.textView2, 36);
        sViewsWithIds.put(R.id.btnChangeScreen, 37);
        sViewsWithIds.put(R.id.autoStateOfUSA, 38);
        sViewsWithIds.put(R.id.txtSpring, 39);
        sViewsWithIds.put(R.id.txtSummer, 40);
        sViewsWithIds.put(R.id.txtAutumn, 41);
        sViewsWithIds.put(R.id.txtWinter, 42);
        sViewsWithIds.put(R.id.btnLongClick, 43);
        sViewsWithIds.put(R.id.btnExit, 44);
        sViewsWithIds.put(R.id.spDayOfWeek, 45);
        sViewsWithIds.put(R.id.txtNameSpinner, 46);
        sViewsWithIds.put(R.id.btnChooseSpinner, 47);
        sViewsWithIds.put(R.id.txtNumberBussinessEmployees, 48);
        sViewsWithIds.put(R.id.lvDayOfWeek, 49);
        sViewsWithIds.put(R.id.txtName, 50);
        sViewsWithIds.put(R.id.btnSave, 51);
        sViewsWithIds.put(R.id.lvName, 52);
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
    private final android.widget.ImageView mboundView21;
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
    private final android.widget.TabHost.OnTabChangeListener mCallback9;
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    @Nullable
    private final android.view.View.OnClickListener mCallback8;
    @Nullable
    private final android.widget.CompoundButton.OnCheckedChangeListener mCallback7;
    @Nullable
    private final android.widget.CompoundButton.OnCheckedChangeListener mCallback6;
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    // values
    // listeners
    private OnClickListenerImpl mCheckImgBtnQuitAndroidViewViewOnClickListener;
    private OnClickListenerImpl1 mRadiobutonsVoteAndroidViewViewOnClickListener;
    private OnClickListenerImpl2 mDatetimesTimeAndroidViewViewOnClickListener;
    private OnClickListenerImpl3 mDatetimesDateAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener chkCandroidCheckedAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of check.c.get()
            //         is check.c.set((java.lang.Boolean) callbackArg_0)
            boolean callbackArg_0 = chkC.isChecked();
            // localize variables for thread safety
            // check != null
            boolean checkJavaLangObjectNull = false;
            // check.c.get()
            java.lang.Boolean checkCGet = null;
            // check
            elong.modelView.mainActivityChapter1EventOnView.Checkboxes check = mCheck;
            // check.c != null
            boolean checkCJavaLangObjectNull = false;
            // check.c
            androidx.databinding.ObservableField<java.lang.Boolean> checkC = null;



            checkJavaLangObjectNull = (check) != (null);
            if (checkJavaLangObjectNull) {


                checkC = check.getC();

                checkCJavaLangObjectNull = (checkC) != (null);
                if (checkCJavaLangObjectNull) {




                    checkC.set(((java.lang.Boolean) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener chkCaddandroidCheckedAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of check.cadd.get()
            //         is check.cadd.set((java.lang.Boolean) callbackArg_0)
            boolean callbackArg_0 = chkCadd.isChecked();
            // localize variables for thread safety
            // check.cadd.get()
            java.lang.Boolean checkCaddGet = null;
            // check != null
            boolean checkJavaLangObjectNull = false;
            // check
            elong.modelView.mainActivityChapter1EventOnView.Checkboxes check = mCheck;
            // check.cadd
            androidx.databinding.ObservableField<java.lang.Boolean> checkCadd = null;
            // check.cadd != null
            boolean checkCaddJavaLangObjectNull = false;



            checkJavaLangObjectNull = (check) != (null);
            if (checkJavaLangObjectNull) {


                checkCadd = check.getCadd();

                checkCaddJavaLangObjectNull = (checkCadd) != (null);
                if (checkCaddJavaLangObjectNull) {




                    checkCadd.set(((java.lang.Boolean) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener chkCsharpandroidCheckedAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of check.csharp.get()
            //         is check.csharp.set((java.lang.Boolean) callbackArg_0)
            boolean callbackArg_0 = chkCsharp.isChecked();
            // localize variables for thread safety
            // check.csharp != null
            boolean checkCsharpJavaLangObjectNull = false;
            // check.csharp
            androidx.databinding.ObservableField<java.lang.Boolean> checkCsharp = null;
            // check.csharp.get()
            java.lang.Boolean checkCsharpGet = null;
            // check != null
            boolean checkJavaLangObjectNull = false;
            // check
            elong.modelView.mainActivityChapter1EventOnView.Checkboxes check = mCheck;



            checkJavaLangObjectNull = (check) != (null);
            if (checkJavaLangObjectNull) {


                checkCsharp = check.getCsharp();

                checkCsharpJavaLangObjectNull = (checkCsharp) != (null);
                if (checkCsharpJavaLangObjectNull) {




                    checkCsharp.set(((java.lang.Boolean) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener chkJavaandroidCheckedAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of check.java.get()
            //         is check.java.set((java.lang.Boolean) callbackArg_0)
            boolean callbackArg_0 = chkJava.isChecked();
            // localize variables for thread safety
            // check.java != null
            boolean checkJavaJavaLangObjectNull = false;
            // check.java.get()
            java.lang.Boolean checkJavaGet = null;
            // check != null
            boolean checkJavaLangObjectNull = false;
            // check
            elong.modelView.mainActivityChapter1EventOnView.Checkboxes check = mCheck;
            // check.java
            androidx.databinding.ObservableField<java.lang.Boolean> checkJava = null;



            checkJavaLangObjectNull = (check) != (null);
            if (checkJavaLangObjectNull) {


                checkJava = check.getJava();

                checkJavaJavaLangObjectNull = (checkJava) != (null);
                if (checkJavaJavaLangObjectNull) {




                    checkJava.set(((java.lang.Boolean) (callbackArg_0)));
                }
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
    private androidx.databinding.InverseBindingListener radBadandroidCheckedAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of radiobutons.radBad.get()
            //         is radiobutons.radBad.set((java.lang.Boolean) callbackArg_0)
            boolean callbackArg_0 = radBad.isChecked();
            // localize variables for thread safety
            // radiobutons.radBad != null
            boolean radiobutonsRadBadJavaLangObjectNull = false;
            // radiobutons.radBad
            androidx.databinding.ObservableField<java.lang.Boolean> radiobutonsRadBad = null;
            // radiobutons != null
            boolean radiobutonsJavaLangObjectNull = false;
            // radiobutons
            elong.modelView.mainActivityChapter1EventOnView.RadioButtons radiobutons = mRadiobutons;
            // radiobutons.radBad.get()
            java.lang.Boolean radiobutonsRadBadGet = null;



            radiobutonsJavaLangObjectNull = (radiobutons) != (null);
            if (radiobutonsJavaLangObjectNull) {


                radiobutonsRadBad = radiobutons.getRadBad();

                radiobutonsRadBadJavaLangObjectNull = (radiobutonsRadBad) != (null);
                if (radiobutonsRadBadJavaLangObjectNull) {




                    radiobutonsRadBad.set(((java.lang.Boolean) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener radGoodandroidCheckedAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of radiobutons.radGood.get()
            //         is radiobutons.radGood.set((java.lang.Boolean) callbackArg_0)
            boolean callbackArg_0 = radGood.isChecked();
            // localize variables for thread safety
            // radiobutons.radGood.get()
            java.lang.Boolean radiobutonsRadGoodGet = null;
            // radiobutons != null
            boolean radiobutonsJavaLangObjectNull = false;
            // radiobutons.radGood
            androidx.databinding.ObservableField<java.lang.Boolean> radiobutonsRadGood = null;
            // radiobutons.radGood != null
            boolean radiobutonsRadGoodJavaLangObjectNull = false;
            // radiobutons
            elong.modelView.mainActivityChapter1EventOnView.RadioButtons radiobutons = mRadiobutons;



            radiobutonsJavaLangObjectNull = (radiobutons) != (null);
            if (radiobutonsJavaLangObjectNull) {


                radiobutonsRadGood = radiobutons.getRadGood();

                radiobutonsRadGoodJavaLangObjectNull = (radiobutonsRadGood) != (null);
                if (radiobutonsRadGoodJavaLangObjectNull) {




                    radiobutonsRadGood.set(((java.lang.Boolean) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener radGreatandroidCheckedAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of radiobutons.radGreat.get()
            //         is radiobutons.radGreat.set((java.lang.Boolean) callbackArg_0)
            boolean callbackArg_0 = radGreat.isChecked();
            // localize variables for thread safety
            // radiobutons != null
            boolean radiobutonsJavaLangObjectNull = false;
            // radiobutons.radGreat.get()
            java.lang.Boolean radiobutonsRadGreatGet = null;
            // radiobutons.radGreat != null
            boolean radiobutonsRadGreatJavaLangObjectNull = false;
            // radiobutons
            elong.modelView.mainActivityChapter1EventOnView.RadioButtons radiobutons = mRadiobutons;
            // radiobutons.radGreat
            androidx.databinding.ObservableField<java.lang.Boolean> radiobutonsRadGreat = null;



            radiobutonsJavaLangObjectNull = (radiobutons) != (null);
            if (radiobutonsJavaLangObjectNull) {


                radiobutonsRadGreat = radiobutons.getRadGreat();

                radiobutonsRadGreatJavaLangObjectNull = (radiobutonsRadGreat) != (null);
                if (radiobutonsRadGreatJavaLangObjectNull) {




                    radiobutonsRadGreat.set(((java.lang.Boolean) (callbackArg_0)));
                }
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
            // Inverse of check.resultCheckbox.get()
            //         is check.resultCheckbox.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(txtSelect);
            // localize variables for thread safety
            // check.resultCheckbox
            androidx.databinding.ObservableField<java.lang.String> checkResultCheckbox = null;
            // check.resultCheckbox.get()
            java.lang.String checkResultCheckboxGet = null;
            // check != null
            boolean checkJavaLangObjectNull = false;
            // check.resultCheckbox != null
            boolean checkResultCheckboxJavaLangObjectNull = false;
            // check
            elong.modelView.mainActivityChapter1EventOnView.Checkboxes check = mCheck;



            checkJavaLangObjectNull = (check) != (null);
            if (checkJavaLangObjectNull) {


                checkResultCheckbox = check.getResultCheckbox();

                checkResultCheckboxJavaLangObjectNull = (checkResultCheckbox) != (null);
                if (checkResultCheckboxJavaLangObjectNull) {




                    checkResultCheckbox.set(((java.lang.String) (callbackArg_0)));
                }
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
        super(bindingComponent, root, 23
            , (android.widget.AutoCompleteTextView) bindings[38]
            , (android.widget.Button) bindings[27]
            , (android.widget.Button) bindings[37]
            , (android.widget.Button) bindings[47]
            , (android.widget.ImageButton) bindings[22]
            , (android.widget.Button) bindings[44]
            , (android.widget.Button) bindings[43]
            , (android.widget.Button) bindings[51]
            , (android.widget.Button) bindings[12]
            , (android.widget.ImageButton) bindings[23]
            , (android.widget.Button) bindings[20]
            , (android.widget.CheckBox) bindings[11]
            , (android.widget.CheckBox) bindings[10]
            , (android.widget.CheckBox) bindings[9]
            , (android.widget.CheckBox) bindings[8]
            , (android.widget.GridView) bindings[29]
            , (android.widget.ListView) bindings[28]
            , (android.widget.ListView) bindings[49]
            , (android.widget.ListView) bindings[52]
            , (android.widget.Spinner) bindings[32]
            , (android.widget.Spinner) bindings[31]
            , (android.widget.RadioButton) bindings[17]
            , (android.widget.RadioButton) bindings[16]
            , (android.widget.RadioButton) bindings[15]
            , (android.widget.RadioButton) bindings[18]
            , (android.widget.RadioButton) bindings[19]
            , (android.widget.LinearLayout) bindings[34]
            , (android.widget.ScrollView) bindings[33]
            , (android.widget.Spinner) bindings[45]
            , (android.widget.TabHost) bindings[30]
            , (android.widget.LinearLayout) bindings[56]
            , (android.widget.LinearLayout) bindings[55]
            , (android.widget.FrameLayout) bindings[54]
            , (android.widget.TabWidget) bindings[53]
            , (android.widget.TextView) bindings[35]
            , (android.widget.TextView) bindings[36]
            , (android.widget.TextView) bindings[41]
            , (android.widget.EditText) bindings[24]
            , (android.widget.TextView) bindings[13]
            , (android.widget.EditText) bindings[50]
            , (android.widget.EditText) bindings[25]
            , (android.widget.EditText) bindings[46]
            , (android.widget.EditText) bindings[48]
            , (android.widget.TextView) bindings[14]
            , (android.widget.EditText) bindings[26]
            , (android.widget.TextView) bindings[39]
            , (android.widget.TextView) bindings[40]
            , (android.widget.TextView) bindings[42]
            );
        this.btnAddSongKaraoke.setTag(null);
        this.btnDate.setTag(null);
        this.btnSelect.setTag(null);
        this.btnTime.setTag(null);
        this.btnVote.setTag(null);
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
        this.mboundView21 = (android.widget.ImageView) bindings[21];
        this.mboundView21.setTag(null);
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
        this.radBad.setTag(null);
        this.radGood.setTag(null);
        this.radGreat.setTag(null);
        this.radLong.setTag(null);
        this.radNhan.setTag(null);
        this.tabHostKaraoke.setTag(null);
        this.txtCodeSong.setTag(null);
        this.txtDateTime.setTag(null);
        this.txtNameSong.setTag(null);
        this.txtSelect.setTag(null);
        this.txtSinger.setTag(null);
        setRootTag(root);
        // listeners
        mCallback2 = new elong.androidApp.generated.callback.OnClickListener(this, 2);
        mCallback9 = new elong.androidApp.generated.callback.OnTabChangeListener(this, 9);
        mCallback1 = new elong.androidApp.generated.callback.OnClickListener(this, 1);
        mCallback8 = new elong.androidApp.generated.callback.OnClickListener(this, 8);
        mCallback7 = new elong.androidApp.generated.callback.OnCheckedChangeListener(this, 7);
        mCallback6 = new elong.androidApp.generated.callback.OnCheckedChangeListener(this, 6);
        mCallback5 = new elong.androidApp.generated.callback.OnClickListener(this, 5);
        mCallback4 = new elong.androidApp.generated.callback.OnClickListener(this, 4);
        mCallback3 = new elong.androidApp.generated.callback.OnClickListener(this, 3);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4000000L;
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
        else if (BR.radiobutons == variableId) {
            setRadiobutons((elong.modelView.mainActivityChapter1EventOnView.RadioButtons) variable);
        }
        else if (BR.datetimes == variableId) {
            setDatetimes((elong.modelView.mainActivityChapter1EventOnView.DateTimePickers) variable);
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
            mDirtyFlags |= 0x800000L;
        }
        notifyPropertyChanged(BR.presenter);
        super.requestRebind();
    }
    public void setDanhbasInfor(@Nullable elong.modelView.mainActivityChapter1EventOnView.DanhBas DanhbasInfor) {
        updateRegistration(2, DanhbasInfor);
        this.mDanhbasInfor = DanhbasInfor;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.danhbasInfor);
        super.requestRebind();
    }
    public void setCheck(@Nullable elong.modelView.mainActivityChapter1EventOnView.Checkboxes Check) {
        updateRegistration(4, Check);
        this.mCheck = Check;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.check);
        super.requestRebind();
    }
    public void setRadiobutons(@Nullable elong.modelView.mainActivityChapter1EventOnView.RadioButtons Radiobutons) {
        updateRegistration(6, Radiobutons);
        this.mRadiobutons = Radiobutons;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.radiobutons);
        super.requestRebind();
    }
    public void setDatetimes(@Nullable elong.modelView.mainActivityChapter1EventOnView.DateTimePickers Datetimes) {
        updateRegistration(12, Datetimes);
        this.mDatetimes = Datetimes;
        synchronized(this) {
            mDirtyFlags |= 0x1000L;
        }
        notifyPropertyChanged(BR.datetimes);
        super.requestRebind();
    }
    public void setImgsInfor(@Nullable elong.modelView.mainActivityChapter1EventOnView.GvImages ImgsInfor) {
        updateRegistration(18, ImgsInfor);
        this.mImgsInfor = ImgsInfor;
        synchronized(this) {
            mDirtyFlags |= 0x40000L;
        }
        notifyPropertyChanged(BR.imgsInfor);
        super.requestRebind();
    }
    public void setLvmusics(@Nullable elong.modelView.mainActivityChapter1EventOnView.Musics Lvmusics) {
        updateRegistration(19, Lvmusics);
        this.mLvmusics = Lvmusics;
        synchronized(this) {
            mDirtyFlags |= 0x80000L;
        }
        notifyPropertyChanged(BR.lvmusics);
        super.requestRebind();
    }
    public void setCalculate(@Nullable elong.modelView.mainActivityChapter1EventOnView.Calculate Calculate) {
        updateRegistration(21, Calculate);
        this.mCalculate = Calculate;
        synchronized(this) {
            mDirtyFlags |= 0x200000L;
        }
        notifyPropertyChanged(BR.calculate);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeRadiobutonsRadBad((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeCheckCadd((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeDanhbasInfor((elong.modelView.mainActivityChapter1EventOnView.DanhBas) object, fieldId);
            case 3 :
                return onChangeDanhbasInforDanhBas((androidx.databinding.ObservableArrayList<elong.models.chapter1_2_3_7.DanhBa>) object, fieldId);
            case 4 :
                return onChangeCheck((elong.modelView.mainActivityChapter1EventOnView.Checkboxes) object, fieldId);
            case 5 :
                return onChangeDatetimesDateTime((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 6 :
                return onChangeRadiobutons((elong.modelView.mainActivityChapter1EventOnView.RadioButtons) object, fieldId);
            case 7 :
                return onChangeLvmusicsAddNameSong((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 8 :
                return onChangeCheckJava((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 9 :
                return onChangeImgsInforImgs((androidx.databinding.ObservableArrayList<elong.modelView.mainActivityChapter1EventOnView.GvImage>) object, fieldId);
            case 10 :
                return onChangeCheckC((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 11 :
                return onChangeCheckResultCheckbox((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 12 :
                return onChangeDatetimes((elong.modelView.mainActivityChapter1EventOnView.DateTimePickers) object, fieldId);
            case 13 :
                return onChangeCheckCsharp((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 14 :
                return onChangeLvmusicsAddSinger((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 15 :
                return onChangeLvmusicsMusics((androidx.databinding.ObservableArrayList<elong.models.chapter1_3.Music>) object, fieldId);
            case 16 :
                return onChangeRadiobutonsRadGreat((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 17 :
                return onChangeRadiobutonsImgPic((androidx.databinding.ObservableField<java.lang.Integer>) object, fieldId);
            case 18 :
                return onChangeImgsInfor((elong.modelView.mainActivityChapter1EventOnView.GvImages) object, fieldId);
            case 19 :
                return onChangeLvmusics((elong.modelView.mainActivityChapter1EventOnView.Musics) object, fieldId);
            case 20 :
                return onChangeRadiobutonsRadGood((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 21 :
                return onChangeCalculate((elong.modelView.mainActivityChapter1EventOnView.Calculate) object, fieldId);
            case 22 :
                return onChangeLvmusicsAddCodeSong((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeRadiobutonsRadBad(androidx.databinding.ObservableField<java.lang.Boolean> RadiobutonsRadBad, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeCheckCadd(androidx.databinding.ObservableField<java.lang.Boolean> CheckCadd, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDanhbasInfor(elong.modelView.mainActivityChapter1EventOnView.DanhBas DanhbasInfor, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
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
    private boolean onChangeDanhbasInforDanhBas(androidx.databinding.ObservableArrayList<elong.models.chapter1_2_3_7.DanhBa> DanhbasInforDanhBas, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeCheck(elong.modelView.mainActivityChapter1EventOnView.Checkboxes Check, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDatetimesDateTime(androidx.databinding.ObservableField<java.lang.String> DatetimesDateTime, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeRadiobutons(elong.modelView.mainActivityChapter1EventOnView.RadioButtons Radiobutons, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeLvmusicsAddNameSong(androidx.databinding.ObservableField<java.lang.String> LvmusicsAddNameSong, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeCheckJava(androidx.databinding.ObservableField<java.lang.Boolean> CheckJava, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeImgsInforImgs(androidx.databinding.ObservableArrayList<elong.modelView.mainActivityChapter1EventOnView.GvImage> ImgsInforImgs, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeCheckC(androidx.databinding.ObservableField<java.lang.Boolean> CheckC, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x400L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeCheckResultCheckbox(androidx.databinding.ObservableField<java.lang.String> CheckResultCheckbox, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x800L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDatetimes(elong.modelView.mainActivityChapter1EventOnView.DateTimePickers Datetimes, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeCheckCsharp(androidx.databinding.ObservableField<java.lang.Boolean> CheckCsharp, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeLvmusicsAddSinger(androidx.databinding.ObservableField<java.lang.String> LvmusicsAddSinger, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeLvmusicsMusics(androidx.databinding.ObservableArrayList<elong.models.chapter1_3.Music> LvmusicsMusics, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeRadiobutonsRadGreat(androidx.databinding.ObservableField<java.lang.Boolean> RadiobutonsRadGreat, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeRadiobutonsImgPic(androidx.databinding.ObservableField<java.lang.Integer> RadiobutonsImgPic, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeImgsInfor(elong.modelView.mainActivityChapter1EventOnView.GvImages ImgsInfor, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40000L;
            }
            return true;
        }
        else if (fieldId == BR.imgs) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeLvmusics(elong.modelView.mainActivityChapter1EventOnView.Musics Lvmusics, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80000L;
            }
            return true;
        }
        else if (fieldId == BR.musics) {
            synchronized(this) {
                    mDirtyFlags |= 0x8000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeRadiobutonsRadGood(androidx.databinding.ObservableField<java.lang.Boolean> RadiobutonsRadGood, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeCalculate(elong.modelView.mainActivityChapter1EventOnView.Calculate Calculate, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x200000L;
            }
            return true;
        }
        else if (fieldId == BR.a) {
            synchronized(this) {
                    mDirtyFlags |= 0x1000000L;
            }
            return true;
        }
        else if (fieldId == BR.b) {
            synchronized(this) {
                    mDirtyFlags |= 0x2000000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeLvmusicsAddCodeSong(androidx.databinding.ObservableField<java.lang.String> LvmusicsAddCodeSong, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x400000L;
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
        java.lang.Boolean checkCGet = null;
        elong.modelView.PresenterData<?> presenter = mPresenter;
        androidx.databinding.ObservableField<java.lang.Boolean> radiobutonsRadBad = null;
        int androidxDatabindingViewDataBindingSafeUnboxRadiobutonsImgPicGet = 0;
        java.lang.String lvmusicsAddSingerGet = null;
        java.lang.Boolean checkCsharpGet = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxRadiobutonsRadBadGet = false;
        androidx.databinding.ObservableField<java.lang.Boolean> checkCadd = null;
        elong.modelView.mainActivityChapter1EventOnView.DanhBas danhbasInfor = mDanhbasInfor;
        java.lang.Boolean radiobutonsRadGoodGet = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxCheckCsharpGet = false;
        androidx.databinding.ObservableArrayList<elong.models.chapter1_2_3_7.DanhBa> danhbasInforDanhBas = null;
        elong.modelView.mainActivityChapter1EventOnView.Checkboxes check = mCheck;
        java.lang.Boolean radiobutonsRadBadGet = null;
        java.lang.Integer radiobutonsImgPicGet = null;
        androidx.databinding.ObservableField<java.lang.String> datetimesDateTime = null;
        java.lang.Boolean checkCaddGet = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxCheckCGet = false;
        elong.modelView.mainActivityChapter1EventOnView.RadioButtons radiobutons = mRadiobutons;
        boolean androidxDatabindingViewDataBindingSafeUnboxRadiobutonsRadGreatGet = false;
        androidx.databinding.ObservableField<java.lang.String> lvmusicsAddNameSong = null;
        android.view.View.OnClickListener checkImgBtnQuitAndroidViewViewOnClickListener = null;
        androidx.databinding.ObservableField<java.lang.Boolean> checkJava = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxCheckCaddGet = false;
        java.lang.String lvmusicsAddNameSongGet = null;
        java.lang.String lvmusicsAddCodeSongGet = null;
        java.lang.Boolean radiobutonsRadGreatGet = null;
        android.view.View.OnClickListener radiobutonsVoteAndroidViewViewOnClickListener = null;
        java.lang.String javaLangStringCalculateB = null;
        java.lang.Integer calculateB = null;
        androidx.databinding.ObservableArrayList<elong.modelView.mainActivityChapter1EventOnView.GvImage> imgsInforImgs = null;
        androidx.databinding.ObservableField<java.lang.Boolean> checkC = null;
        androidx.databinding.ObservableField<java.lang.String> checkResultCheckbox = null;
        elong.modelView.mainActivityChapter1EventOnView.DateTimePickers datetimes = mDatetimes;
        androidx.databinding.ObservableField<java.lang.Boolean> checkCsharp = null;
        androidx.databinding.ObservableField<java.lang.String> lvmusicsAddSinger = null;
        androidx.databinding.ObservableArrayList<elong.models.chapter1_3.Music> lvmusicsMusics = null;
        androidx.databinding.ObservableField<java.lang.Boolean> radiobutonsRadGreat = null;
        java.lang.Boolean checkJavaGet = null;
        androidx.databinding.ObservableField<java.lang.Integer> radiobutonsImgPic = null;
        java.lang.Integer calculateA = null;
        android.graphics.drawable.Drawable contextGetDrawableRadiobutonsImgPic = null;
        java.lang.String checkResultCheckboxGet = null;
        android.view.View.OnClickListener datetimesTimeAndroidViewViewOnClickListener = null;
        java.lang.String javaLangStringCalculateA = null;
        elong.modelView.mainActivityChapter1EventOnView.GvImages imgsInfor = mImgsInfor;
        android.view.View.OnClickListener datetimesDateAndroidViewViewOnClickListener = null;
        elong.modelView.mainActivityChapter1EventOnView.Musics lvmusics = mLvmusics;
        androidx.databinding.ObservableField<java.lang.Boolean> radiobutonsRadGood = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxRadiobutonsRadGoodGet = false;
        elong.modelView.mainActivityChapter1EventOnView.Calculate calculate = mCalculate;
        androidx.databinding.ObservableField<java.lang.String> lvmusicsAddCodeSong = null;
        java.lang.String datetimesDateTimeGet = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxCheckJavaGet = false;

        if ((dirtyFlags & 0x400000cL) != 0) {



                if (danhbasInfor != null) {
                    // read danhbasInfor.danhBas
                    danhbasInforDanhBas = danhbasInfor.getDanhBas();
                }
                updateRegistration(3, danhbasInforDanhBas);
        }
        if ((dirtyFlags & 0x4002d12L) != 0) {


            if ((dirtyFlags & 0x4000012L) != 0) {

                    if (check != null) {
                        // read check.cadd
                        checkCadd = check.getCadd();
                    }
                    updateRegistration(1, checkCadd);


                    if (checkCadd != null) {
                        // read check.cadd.get()
                        checkCaddGet = checkCadd.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(check.cadd.get())
                    androidxDatabindingViewDataBindingSafeUnboxCheckCaddGet = androidx.databinding.ViewDataBinding.safeUnbox(checkCaddGet);
            }
            if ((dirtyFlags & 0x4000010L) != 0) {

                    if (check != null) {
                        // read check::imgBtnQuit
                        checkImgBtnQuitAndroidViewViewOnClickListener = (((mCheckImgBtnQuitAndroidViewViewOnClickListener == null) ? (mCheckImgBtnQuitAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mCheckImgBtnQuitAndroidViewViewOnClickListener).setValue(check));
                    }
            }
            if ((dirtyFlags & 0x4000110L) != 0) {

                    if (check != null) {
                        // read check.java
                        checkJava = check.getJava();
                    }
                    updateRegistration(8, checkJava);


                    if (checkJava != null) {
                        // read check.java.get()
                        checkJavaGet = checkJava.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(check.java.get())
                    androidxDatabindingViewDataBindingSafeUnboxCheckJavaGet = androidx.databinding.ViewDataBinding.safeUnbox(checkJavaGet);
            }
            if ((dirtyFlags & 0x4000410L) != 0) {

                    if (check != null) {
                        // read check.c
                        checkC = check.getC();
                    }
                    updateRegistration(10, checkC);


                    if (checkC != null) {
                        // read check.c.get()
                        checkCGet = checkC.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(check.c.get())
                    androidxDatabindingViewDataBindingSafeUnboxCheckCGet = androidx.databinding.ViewDataBinding.safeUnbox(checkCGet);
            }
            if ((dirtyFlags & 0x4000810L) != 0) {

                    if (check != null) {
                        // read check.resultCheckbox
                        checkResultCheckbox = check.getResultCheckbox();
                    }
                    updateRegistration(11, checkResultCheckbox);


                    if (checkResultCheckbox != null) {
                        // read check.resultCheckbox.get()
                        checkResultCheckboxGet = checkResultCheckbox.get();
                    }
            }
            if ((dirtyFlags & 0x4002010L) != 0) {

                    if (check != null) {
                        // read check.csharp
                        checkCsharp = check.getCsharp();
                    }
                    updateRegistration(13, checkCsharp);


                    if (checkCsharp != null) {
                        // read check.csharp.get()
                        checkCsharpGet = checkCsharp.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(check.csharp.get())
                    androidxDatabindingViewDataBindingSafeUnboxCheckCsharpGet = androidx.databinding.ViewDataBinding.safeUnbox(checkCsharpGet);
            }
        }
        if ((dirtyFlags & 0x4130041L) != 0) {


            if ((dirtyFlags & 0x4000041L) != 0) {

                    if (radiobutons != null) {
                        // read radiobutons.radBad
                        radiobutonsRadBad = radiobutons.getRadBad();
                    }
                    updateRegistration(0, radiobutonsRadBad);


                    if (radiobutonsRadBad != null) {
                        // read radiobutons.radBad.get()
                        radiobutonsRadBadGet = radiobutonsRadBad.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(radiobutons.radBad.get())
                    androidxDatabindingViewDataBindingSafeUnboxRadiobutonsRadBadGet = androidx.databinding.ViewDataBinding.safeUnbox(radiobutonsRadBadGet);
            }
            if ((dirtyFlags & 0x4000040L) != 0) {

                    if (radiobutons != null) {
                        // read radiobutons::vote
                        radiobutonsVoteAndroidViewViewOnClickListener = (((mRadiobutonsVoteAndroidViewViewOnClickListener == null) ? (mRadiobutonsVoteAndroidViewViewOnClickListener = new OnClickListenerImpl1()) : mRadiobutonsVoteAndroidViewViewOnClickListener).setValue(radiobutons));
                    }
            }
            if ((dirtyFlags & 0x4010040L) != 0) {

                    if (radiobutons != null) {
                        // read radiobutons.radGreat
                        radiobutonsRadGreat = radiobutons.getRadGreat();
                    }
                    updateRegistration(16, radiobutonsRadGreat);


                    if (radiobutonsRadGreat != null) {
                        // read radiobutons.radGreat.get()
                        radiobutonsRadGreatGet = radiobutonsRadGreat.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(radiobutons.radGreat.get())
                    androidxDatabindingViewDataBindingSafeUnboxRadiobutonsRadGreatGet = androidx.databinding.ViewDataBinding.safeUnbox(radiobutonsRadGreatGet);
            }
            if ((dirtyFlags & 0x4020040L) != 0) {

                    if (radiobutons != null) {
                        // read radiobutons.imgPic
                        radiobutonsImgPic = radiobutons.getImgPic();
                    }
                    updateRegistration(17, radiobutonsImgPic);


                    if (radiobutonsImgPic != null) {
                        // read radiobutons.imgPic.get()
                        radiobutonsImgPicGet = radiobutonsImgPic.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(radiobutons.imgPic.get())
                    androidxDatabindingViewDataBindingSafeUnboxRadiobutonsImgPicGet = androidx.databinding.ViewDataBinding.safeUnbox(radiobutonsImgPicGet);


                    // read context.getDrawable(androidx.databinding.ViewDataBinding.safeUnbox(radiobutons.imgPic.get()))
                    contextGetDrawableRadiobutonsImgPic = getRoot().getContext().getDrawable(androidxDatabindingViewDataBindingSafeUnboxRadiobutonsImgPicGet);
            }
            if ((dirtyFlags & 0x4100040L) != 0) {

                    if (radiobutons != null) {
                        // read radiobutons.radGood
                        radiobutonsRadGood = radiobutons.getRadGood();
                    }
                    updateRegistration(20, radiobutonsRadGood);


                    if (radiobutonsRadGood != null) {
                        // read radiobutons.radGood.get()
                        radiobutonsRadGoodGet = radiobutonsRadGood.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(radiobutons.radGood.get())
                    androidxDatabindingViewDataBindingSafeUnboxRadiobutonsRadGoodGet = androidx.databinding.ViewDataBinding.safeUnbox(radiobutonsRadGoodGet);
            }
        }
        if ((dirtyFlags & 0x4001020L) != 0) {



                if (datetimes != null) {
                    // read datetimes.dateTime
                    datetimesDateTime = datetimes.getDateTime();
                }
                updateRegistration(5, datetimesDateTime);


                if (datetimesDateTime != null) {
                    // read datetimes.dateTime.get()
                    datetimesDateTimeGet = datetimesDateTime.get();
                }
            if ((dirtyFlags & 0x4001000L) != 0) {

                    if (datetimes != null) {
                        // read datetimes::time
                        datetimesTimeAndroidViewViewOnClickListener = (((mDatetimesTimeAndroidViewViewOnClickListener == null) ? (mDatetimesTimeAndroidViewViewOnClickListener = new OnClickListenerImpl2()) : mDatetimesTimeAndroidViewViewOnClickListener).setValue(datetimes));
                        // read datetimes::date
                        datetimesDateAndroidViewViewOnClickListener = (((mDatetimesDateAndroidViewViewOnClickListener == null) ? (mDatetimesDateAndroidViewViewOnClickListener = new OnClickListenerImpl3()) : mDatetimesDateAndroidViewViewOnClickListener).setValue(datetimes));
                    }
            }
        }
        if ((dirtyFlags & 0x4040200L) != 0) {



                if (imgsInfor != null) {
                    // read imgsInfor.imgs
                    imgsInforImgs = imgsInfor.getImgs();
                }
                updateRegistration(9, imgsInforImgs);
        }
        if ((dirtyFlags & 0x448c080L) != 0) {


            if ((dirtyFlags & 0x4080080L) != 0) {

                    if (lvmusics != null) {
                        // read lvmusics.addNameSong
                        lvmusicsAddNameSong = lvmusics.getAddNameSong();
                    }
                    updateRegistration(7, lvmusicsAddNameSong);


                    if (lvmusicsAddNameSong != null) {
                        // read lvmusics.addNameSong.get()
                        lvmusicsAddNameSongGet = lvmusicsAddNameSong.get();
                    }
            }
            if ((dirtyFlags & 0x4084000L) != 0) {

                    if (lvmusics != null) {
                        // read lvmusics.addSinger
                        lvmusicsAddSinger = lvmusics.getAddSinger();
                    }
                    updateRegistration(14, lvmusicsAddSinger);


                    if (lvmusicsAddSinger != null) {
                        // read lvmusics.addSinger.get()
                        lvmusicsAddSingerGet = lvmusicsAddSinger.get();
                    }
            }
            if ((dirtyFlags & 0x4088000L) != 0) {

                    if (lvmusics != null) {
                        // read lvmusics.musics
                        lvmusicsMusics = lvmusics.getMusics();
                    }
                    updateRegistration(15, lvmusicsMusics);
            }
            if ((dirtyFlags & 0x4480000L) != 0) {

                    if (lvmusics != null) {
                        // read lvmusics.addCodeSong
                        lvmusicsAddCodeSong = lvmusics.getAddCodeSong();
                    }
                    updateRegistration(22, lvmusicsAddCodeSong);


                    if (lvmusicsAddCodeSong != null) {
                        // read lvmusics.addCodeSong.get()
                        lvmusicsAddCodeSongGet = lvmusicsAddCodeSong.get();
                    }
            }
        }
        if ((dirtyFlags & 0x7200000L) != 0) {


            if ((dirtyFlags & 0x6200000L) != 0) {

                    if (calculate != null) {
                        // read calculate.b
                        calculateB = calculate.getB();
                    }


                    // read ("") + (calculate.b)
                    javaLangStringCalculateB = ("") + (calculateB);
            }
            if ((dirtyFlags & 0x5200000L) != 0) {

                    if (calculate != null) {
                        // read calculate.a
                        calculateA = calculate.getA();
                    }


                    // read ("") + (calculate.a)
                    javaLangStringCalculateA = ("") + (calculateA);
            }
        }
        // batch finished
        if ((dirtyFlags & 0x4000000L) != 0) {
            // api target 1

            this.btnAddSongKaraoke.setOnClickListener(mCallback8);
            this.btnSelect.setOnClickListener(mCallback5);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.chkC, (android.widget.CompoundButton.OnCheckedChangeListener)null, chkCandroidCheckedAttrChanged);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.chkCadd, (android.widget.CompoundButton.OnCheckedChangeListener)null, chkCaddandroidCheckedAttrChanged);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.chkCsharp, (android.widget.CompoundButton.OnCheckedChangeListener)null, chkCsharpandroidCheckedAttrChanged);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.chkJava, (android.widget.CompoundButton.OnCheckedChangeListener)null, chkJavaandroidCheckedAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView1, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView1androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView2, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView2androidTextAttrChanged);
            this.mboundView4.setOnClickListener(mCallback1);
            this.mboundView5.setOnClickListener(mCallback2);
            this.mboundView6.setOnClickListener(mCallback3);
            this.mboundView7.setOnClickListener(mCallback4);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.radBad, (android.widget.CompoundButton.OnCheckedChangeListener)null, radBadandroidCheckedAttrChanged);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.radGood, (android.widget.CompoundButton.OnCheckedChangeListener)null, radGoodandroidCheckedAttrChanged);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.radGreat, (android.widget.CompoundButton.OnCheckedChangeListener)null, radGreatandroidCheckedAttrChanged);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.radLong, mCallback6, (androidx.databinding.InverseBindingListener)null);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.radNhan, mCallback7, (androidx.databinding.InverseBindingListener)null);
            androidx.databinding.adapters.TabHostBindingAdapter.setListeners(this.tabHostKaraoke, mCallback9, (androidx.databinding.InverseBindingListener)null);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.txtCodeSong, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, txtCodeSongandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.txtNameSong, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, txtNameSongandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.txtSelect, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, txtSelectandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.txtSinger, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, txtSingerandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x4001000L) != 0) {
            // api target 1

            this.btnDate.setOnClickListener(datetimesDateAndroidViewViewOnClickListener);
            this.btnTime.setOnClickListener(datetimesTimeAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0x4000040L) != 0) {
            // api target 1

            this.btnVote.setOnClickListener(radiobutonsVoteAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0x4000410L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.chkC, androidxDatabindingViewDataBindingSafeUnboxCheckCGet);
        }
        if ((dirtyFlags & 0x4000012L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.chkCadd, androidxDatabindingViewDataBindingSafeUnboxCheckCaddGet);
        }
        if ((dirtyFlags & 0x4002010L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.chkCsharp, androidxDatabindingViewDataBindingSafeUnboxCheckCsharpGet);
        }
        if ((dirtyFlags & 0x4000110L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.chkJava, androidxDatabindingViewDataBindingSafeUnboxCheckJavaGet);
        }
        if ((dirtyFlags & 0x4040200L) != 0) {
            // api target 1

            elong.modelView.mainActivityChapter1EventOnView.GvImagesBinder.bindList(this.gvImage, imgsInforImgs);
        }
        if ((dirtyFlags & 0x400000cL) != 0) {
            // api target 1

            elong.modelView.mainActivityChapter1EventOnView.DanhBasLvBinder.bindList(this.lvDanhBaAdvance, danhbasInforDanhBas);
        }
        if ((dirtyFlags & 0x4088000L) != 0) {
            // api target 1

            elong.modelView.mainActivityChapter1EventOnView.MusicsBinder.bindListLike(this.lvSongLike, lvmusicsMusics);
            elong.modelView.mainActivityChapter1EventOnView.MusicsBinder.bindList(this.lvSongList, lvmusicsMusics);
        }
        if ((dirtyFlags & 0x5200000L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, javaLangStringCalculateA);
        }
        if ((dirtyFlags & 0x6200000L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, javaLangStringCalculateB);
        }
        if ((dirtyFlags & 0x4020040L) != 0) {
            // api target 1

            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.mboundView21, contextGetDrawableRadiobutonsImgPic);
        }
        if ((dirtyFlags & 0x4000010L) != 0) {
            // api target 1

            this.mboundView3.setOnClickListener(checkImgBtnQuitAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0x4000041L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.radBad, androidxDatabindingViewDataBindingSafeUnboxRadiobutonsRadBadGet);
        }
        if ((dirtyFlags & 0x4100040L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.radGood, androidxDatabindingViewDataBindingSafeUnboxRadiobutonsRadGoodGet);
        }
        if ((dirtyFlags & 0x4010040L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.radGreat, androidxDatabindingViewDataBindingSafeUnboxRadiobutonsRadGreatGet);
        }
        if ((dirtyFlags & 0x4480000L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtCodeSong, lvmusicsAddCodeSongGet);
        }
        if ((dirtyFlags & 0x4001020L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtDateTime, datetimesDateTimeGet);
        }
        if ((dirtyFlags & 0x4080080L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtNameSong, lvmusicsAddNameSongGet);
        }
        if ((dirtyFlags & 0x4000810L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtSelect, checkResultCheckboxGet);
        }
        if ((dirtyFlags & 0x4084000L) != 0) {
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
            this.value.imgBtnQuit(arg0); 
        }
    }
    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener{
        private elong.modelView.mainActivityChapter1EventOnView.RadioButtons value;
        public OnClickListenerImpl1 setValue(elong.modelView.mainActivityChapter1EventOnView.RadioButtons value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.vote(arg0); 
        }
    }
    public static class OnClickListenerImpl2 implements android.view.View.OnClickListener{
        private elong.modelView.mainActivityChapter1EventOnView.DateTimePickers value;
        public OnClickListenerImpl2 setValue(elong.modelView.mainActivityChapter1EventOnView.DateTimePickers value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.time(arg0); 
        }
    }
    public static class OnClickListenerImpl3 implements android.view.View.OnClickListener{
        private elong.modelView.mainActivityChapter1EventOnView.DateTimePickers value;
        public OnClickListenerImpl3 setValue(elong.modelView.mainActivityChapter1EventOnView.DateTimePickers value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.date(arg0); 
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
            case 8: {
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
            case 5: {
                // localize variables for thread safety
                // check != null
                boolean checkJavaLangObjectNull = false;
                // check
                elong.modelView.mainActivityChapter1EventOnView.Checkboxes check = mCheck;



                checkJavaLangObjectNull = (check) != (null);
                if (checkJavaLangObjectNull) {


                    check.getResults();
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
    public final void _internalCallbackOnTabChanged(int sourceId , java.lang.String callbackArg_0) {
        // localize variables for thread safety
        // lvmusics
        elong.modelView.mainActivityChapter1EventOnView.Musics lvmusics = mLvmusics;
        // lvmusics != null
        boolean lvmusicsJavaLangObjectNull = false;



        lvmusicsJavaLangObjectNull = (lvmusics) != (null);
        if (lvmusicsJavaLangObjectNull) {



            lvmusics.tabChange(callbackArg_0);
        }
    }
    public final void _internalCallbackOnCheckedChanged(int sourceId , android.widget.CompoundButton callbackArg_0, boolean callbackArg_1) {
        switch(sourceId) {
            case 7: {
                // localize variables for thread safety
                // radiobutons != null
                boolean radiobutonsJavaLangObjectNull = false;
                // radiobutons
                elong.modelView.mainActivityChapter1EventOnView.RadioButtons radiobutons = mRadiobutons;


                if (callbackArg_1) {



                    radiobutonsJavaLangObjectNull = (radiobutons) != (null);
                    if (radiobutonsJavaLangObjectNull) {


                        radiobutons.checkedNhan();
                    }
                }
                else {
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // radiobutons != null
                boolean radiobutonsJavaLangObjectNull = false;
                // radiobutons
                elong.modelView.mainActivityChapter1EventOnView.RadioButtons radiobutons = mRadiobutons;


                if (callbackArg_1) {



                    radiobutonsJavaLangObjectNull = (radiobutons) != (null);
                    if (radiobutonsJavaLangObjectNull) {


                        radiobutons.checkedLong();
                    }
                }
                else {
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): radiobutons.radBad
        flag 1 (0x2L): check.cadd
        flag 2 (0x3L): danhbasInfor
        flag 3 (0x4L): danhbasInfor.danhBas
        flag 4 (0x5L): check
        flag 5 (0x6L): datetimes.dateTime
        flag 6 (0x7L): radiobutons
        flag 7 (0x8L): lvmusics.addNameSong
        flag 8 (0x9L): check.java
        flag 9 (0xaL): imgsInfor.imgs
        flag 10 (0xbL): check.c
        flag 11 (0xcL): check.resultCheckbox
        flag 12 (0xdL): datetimes
        flag 13 (0xeL): check.csharp
        flag 14 (0xfL): lvmusics.addSinger
        flag 15 (0x10L): lvmusics.musics
        flag 16 (0x11L): radiobutons.radGreat
        flag 17 (0x12L): radiobutons.imgPic
        flag 18 (0x13L): imgsInfor
        flag 19 (0x14L): lvmusics
        flag 20 (0x15L): radiobutons.radGood
        flag 21 (0x16L): calculate
        flag 22 (0x17L): lvmusics.addCodeSong
        flag 23 (0x18L): presenter
        flag 24 (0x19L): calculate.a
        flag 25 (0x1aL): calculate.b
        flag 26 (0x1bL): null
    flag mapping end*/
    //end
}