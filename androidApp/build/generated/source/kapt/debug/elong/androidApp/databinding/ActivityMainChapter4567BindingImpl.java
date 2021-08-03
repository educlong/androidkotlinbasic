package elong.androidApp.databinding;
import elong.androidApp.R;
import elong.androidApp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainChapter4567BindingImpl extends ActivityMainChapter4567Binding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.scrollView, 5);
        sViewsWithIds.put(R.id.txtMenuColor, 6);
        sViewsWithIds.put(R.id.btnPaulContextMenu, 7);
        sViewsWithIds.put(R.id.btnDucContextMenu, 8);
        sViewsWithIds.put(R.id.btnLongContextMenu, 9);
        sViewsWithIds.put(R.id.btnHamiltonContextMenu, 10);
        sViewsWithIds.put(R.id.btnWest1stContextMenu, 11);
        sViewsWithIds.put(R.id.lvStateOfUSA, 12);
        sViewsWithIds.put(R.id.btnXoayScreenAnimation, 13);
        sViewsWithIds.put(R.id.btnXoay3sCloseAnimation, 14);
        sViewsWithIds.put(R.id.btnXoayControlAnimation, 15);
        sViewsWithIds.put(R.id.btnStartAnimation, 16);
        sViewsWithIds.put(R.id.btnStopAnimation, 17);
        sViewsWithIds.put(R.id.imgAnimation, 18);
        sViewsWithIds.put(R.id.txtScoreGameBallAnimation, 19);
        sViewsWithIds.put(R.id.btnScoreGameBallAnimation, 20);
        sViewsWithIds.put(R.id.layoutGameBallAnimation, 21);
        sViewsWithIds.put(R.id.textView12, 22);
        sViewsWithIds.put(R.id.textView13, 23);
        sViewsWithIds.put(R.id.btnLoadIMGAsyncTask, 24);
        sViewsWithIds.put(R.id.layoutButtonAsyncTask, 25);
        sViewsWithIds.put(R.id.textView24, 26);
        sViewsWithIds.put(R.id.imgLoadIMGAsyncTask, 27);
        sViewsWithIds.put(R.id.textView16, 28);
        sViewsWithIds.put(R.id.txtGotoAlbumAsyncTask, 29);
        sViewsWithIds.put(R.id.imgAlbumAsyncTask, 30);
        sViewsWithIds.put(R.id.chkAutoAlbumAsyncTask, 31);
        sViewsWithIds.put(R.id.btnFirstAlbumAsyncTask, 32);
        sViewsWithIds.put(R.id.btnPreviousAlbumAsyncTask, 33);
        sViewsWithIds.put(R.id.btnNextAlbumAsyncTask, 34);
        sViewsWithIds.put(R.id.btnLastAlbumAsyncTask, 35);
        sViewsWithIds.put(R.id.btnGotoAlbumAsyncTask, 36);
        sViewsWithIds.put(R.id.textView15, 37);
        sViewsWithIds.put(R.id.editText2, 38);
        sViewsWithIds.put(R.id.editText3, 39);
        sViewsWithIds.put(R.id.btnLoginBroadcastReceiver, 40);
        sViewsWithIds.put(R.id.btnCreateNotification, 41);
        sViewsWithIds.put(R.id.btnCloseNotification, 42);
        sViewsWithIds.put(R.id.textView17, 43);
        sViewsWithIds.put(R.id.txtWebServiceKSOAPdoC, 44);
        sViewsWithIds.put(R.id.btnWebServiceKSOAPdoF, 45);
        sViewsWithIds.put(R.id.txtWebServiceKSOAPdoF, 46);
        sViewsWithIds.put(R.id.textView27, 47);
        sViewsWithIds.put(R.id.txtWebServiceKSOAPcodeContact, 48);
        sViewsWithIds.put(R.id.btnWebServiceKSOAPDetail, 49);
        sViewsWithIds.put(R.id.txtWebServiceKSOAPDetail, 50);
        sViewsWithIds.put(R.id.textView28, 51);
        sViewsWithIds.put(R.id.btnWebServiceKSOAPListContact, 52);
        sViewsWithIds.put(R.id.lvWebServiceKSOAPListContact, 53);
        sViewsWithIds.put(R.id.textView25, 54);
        sViewsWithIds.put(R.id.lvWebServiceJSONListInforPerson, 55);
        sViewsWithIds.put(R.id.textView26, 56);
        sViewsWithIds.put(R.id.txtWebServiceGSONKeyWord, 57);
        sViewsWithIds.put(R.id.btnWebServiceGSONSearch, 58);
        sViewsWithIds.put(R.id.lvWebServiceGSONSearch, 59);
        sViewsWithIds.put(R.id.textView29, 60);
        sViewsWithIds.put(R.id.lvTyZaHoiDoaiNHDongA_JSON, 61);
    }
    // views
    // variables
    // values
    // listeners
    private OnClickListenerImpl mDrawButtonsDrawButtonAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener txtNumberButtonAsyncTaskandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of ("") + (drawButtons.numberButton)
            //         is drawButtons.setNumberButton((java.lang.Integer) androidx.databinding.ViewDataBinding.parse(callbackArg_0, drawButtons.numberButton))
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(txtNumberButtonAsyncTask);
            // localize variables for thread safety
            // drawButtons.numberButton
            java.lang.Integer drawButtonsNumberButton = null;
            // drawButtons
            elong.modelView.mainActivityChapter4567.AsyncTaskDrawButton drawButtons = mDrawButtons;
            // drawButtons != null
            boolean drawButtonsJavaLangObjectNull = false;
            // androidx.databinding.ViewDataBinding.parse(callbackArg_0, drawButtons.numberButton)
            int androidxDatabindingViewDataBindingParseCallbackArg0DrawButtonsNumberButton = 0;
            // ("") + (drawButtons.numberButton)
            java.lang.String javaLangStringDrawButtonsNumberButton = null;
            // (java.lang.Integer) androidx.databinding.ViewDataBinding.parse(callbackArg_0, drawButtons.numberButton)
            java.lang.Integer javaLangIntegerAndroidxDatabindingViewDataBindingParseCallbackArg0DrawButtonsNumberButton = null;



            drawButtonsJavaLangObjectNull = (drawButtons) != (null);
            if (drawButtonsJavaLangObjectNull) {





                drawButtonsNumberButton = drawButtons.getNumberButton();

                androidxDatabindingViewDataBindingParseCallbackArg0DrawButtonsNumberButton = androidx.databinding.ViewDataBinding.parse(callbackArg_0, drawButtonsNumberButton);

                javaLangIntegerAndroidxDatabindingViewDataBindingParseCallbackArg0DrawButtonsNumberButton = ((java.lang.Integer) (androidxDatabindingViewDataBindingParseCallbackArg0DrawButtonsNumberButton));

                drawButtons.setNumberButton(javaLangIntegerAndroidxDatabindingViewDataBindingParseCallbackArg0DrawButtonsNumberButton);
            }
        }
    };
    private androidx.databinding.InverseBindingListener txtPercentAsyncTaskandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of drawButtons.percent
            //         is drawButtons.setPercent((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(txtPercentAsyncTask);
            // localize variables for thread safety
            // drawButtons.percent
            java.lang.String drawButtonsPercent = null;
            // drawButtons
            elong.modelView.mainActivityChapter4567.AsyncTaskDrawButton drawButtons = mDrawButtons;
            // drawButtons != null
            boolean drawButtonsJavaLangObjectNull = false;



            drawButtonsJavaLangObjectNull = (drawButtons) != (null);
            if (drawButtonsJavaLangObjectNull) {




                drawButtons.setPercent(((java.lang.String) (callbackArg_0)));
            }
        }
    };

    public ActivityMainChapter4567BindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 62, sIncludes, sViewsWithIds));
    }
    private ActivityMainChapter4567BindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.Button) bindings[42]
            , (android.widget.Button) bindings[41]
            , (android.widget.Button) bindings[2]
            , (android.widget.Button) bindings[8]
            , (android.widget.ImageButton) bindings[32]
            , (android.widget.ImageButton) bindings[36]
            , (android.widget.Button) bindings[10]
            , (android.widget.ImageButton) bindings[35]
            , (android.widget.Button) bindings[24]
            , (android.widget.Button) bindings[40]
            , (android.widget.Button) bindings[9]
            , (android.widget.ImageButton) bindings[34]
            , (android.widget.Button) bindings[7]
            , (android.widget.ImageButton) bindings[33]
            , (android.widget.Button) bindings[20]
            , (android.widget.Button) bindings[16]
            , (android.widget.Button) bindings[17]
            , (android.widget.Button) bindings[58]
            , (android.widget.Button) bindings[49]
            , (android.widget.Button) bindings[52]
            , (android.widget.Button) bindings[45]
            , (android.widget.Button) bindings[11]
            , (android.widget.Button) bindings[14]
            , (android.widget.Button) bindings[15]
            , (android.widget.Button) bindings[13]
            , (android.widget.CheckBox) bindings[31]
            , (android.widget.EditText) bindings[38]
            , (android.widget.EditText) bindings[39]
            , (android.widget.ImageView) bindings[30]
            , (android.widget.ImageView) bindings[18]
            , (android.widget.ImageView) bindings[27]
            , (android.widget.LinearLayout) bindings[25]
            , (android.widget.LinearLayout) bindings[21]
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.ListView) bindings[12]
            , (android.widget.ListView) bindings[61]
            , (android.widget.ListView) bindings[59]
            , (android.widget.ListView) bindings[55]
            , (android.widget.ListView) bindings[53]
            , (android.widget.ProgressBar) bindings[3]
            , (android.widget.ScrollView) bindings[5]
            , (android.widget.TextView) bindings[22]
            , (android.widget.TextView) bindings[23]
            , (android.widget.TextView) bindings[37]
            , (android.widget.TextView) bindings[28]
            , (android.widget.TextView) bindings[43]
            , (android.widget.TextView) bindings[26]
            , (android.widget.TextView) bindings[54]
            , (android.widget.TextView) bindings[56]
            , (android.widget.TextView) bindings[47]
            , (android.widget.TextView) bindings[51]
            , (android.widget.TextView) bindings[60]
            , (android.widget.EditText) bindings[29]
            , (android.widget.TextView) bindings[6]
            , (android.widget.EditText) bindings[1]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[19]
            , (android.widget.EditText) bindings[57]
            , (android.widget.TextView) bindings[50]
            , (android.widget.EditText) bindings[48]
            , (android.widget.EditText) bindings[44]
            , (android.widget.TextView) bindings[46]
            );
        this.btnDrawButtonAsyncTask.setTag(null);
        this.layoutScreenTab4.setTag(null);
        this.progressBarPercentAsyncTask.setTag(null);
        this.txtNumberButtonAsyncTask.setTag(null);
        this.txtPercentAsyncTask.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
        if (BR.drawButtons == variableId) {
            setDrawButtons((elong.modelView.mainActivityChapter4567.AsyncTaskDrawButton) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setDrawButtons(@Nullable elong.modelView.mainActivityChapter4567.AsyncTaskDrawButton DrawButtons) {
        updateRegistration(0, DrawButtons);
        this.mDrawButtons = DrawButtons;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.drawButtons);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeDrawButtons((elong.modelView.mainActivityChapter4567.AsyncTaskDrawButton) object, fieldId);
        }
        return false;
    }
    private boolean onChangeDrawButtons(elong.modelView.mainActivityChapter4567.AsyncTaskDrawButton DrawButtons, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.numberButton) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        else if (fieldId == BR.progress) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        else if (fieldId == BR.percent) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
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
        java.lang.Integer drawButtonsProgress = null;
        elong.modelView.mainActivityChapter4567.AsyncTaskDrawButton drawButtons = mDrawButtons;
        java.lang.Integer drawButtonsNumberButton = null;
        java.lang.String javaLangStringDrawButtonsNumberButton = null;
        android.view.View.OnClickListener drawButtonsDrawButtonAndroidViewViewOnClickListener = null;
        int androidxDatabindingViewDataBindingSafeUnboxDrawButtonsProgress = 0;
        java.lang.String drawButtonsPercent = null;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x15L) != 0) {

                    if (drawButtons != null) {
                        // read drawButtons.progress
                        drawButtonsProgress = drawButtons.getProgress();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(drawButtons.progress)
                    androidxDatabindingViewDataBindingSafeUnboxDrawButtonsProgress = androidx.databinding.ViewDataBinding.safeUnbox(drawButtonsProgress);
            }
            if ((dirtyFlags & 0x13L) != 0) {

                    if (drawButtons != null) {
                        // read drawButtons.numberButton
                        drawButtonsNumberButton = drawButtons.getNumberButton();
                    }


                    // read ("") + (drawButtons.numberButton)
                    javaLangStringDrawButtonsNumberButton = ("") + (drawButtonsNumberButton);
            }
            if ((dirtyFlags & 0x11L) != 0) {

                    if (drawButtons != null) {
                        // read drawButtons::drawButton
                        drawButtonsDrawButtonAndroidViewViewOnClickListener = (((mDrawButtonsDrawButtonAndroidViewViewOnClickListener == null) ? (mDrawButtonsDrawButtonAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mDrawButtonsDrawButtonAndroidViewViewOnClickListener).setValue(drawButtons));
                    }
            }
            if ((dirtyFlags & 0x19L) != 0) {

                    if (drawButtons != null) {
                        // read drawButtons.percent
                        drawButtonsPercent = drawButtons.getPercent();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x11L) != 0) {
            // api target 1

            this.btnDrawButtonAsyncTask.setOnClickListener(drawButtonsDrawButtonAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0x15L) != 0) {
            // api target 1

            this.progressBarPercentAsyncTask.setProgress(androidxDatabindingViewDataBindingSafeUnboxDrawButtonsProgress);
        }
        if ((dirtyFlags & 0x13L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtNumberButtonAsyncTask, javaLangStringDrawButtonsNumberButton);
        }
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.txtNumberButtonAsyncTask, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, txtNumberButtonAsyncTaskandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.txtPercentAsyncTask, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, txtPercentAsyncTaskandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtPercentAsyncTask, drawButtonsPercent);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private elong.modelView.mainActivityChapter4567.AsyncTaskDrawButton value;
        public OnClickListenerImpl setValue(elong.modelView.mainActivityChapter4567.AsyncTaskDrawButton value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.drawButton(arg0); 
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): drawButtons
        flag 1 (0x2L): drawButtons.numberButton
        flag 2 (0x3L): drawButtons.progress
        flag 3 (0x4L): drawButtons.percent
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}