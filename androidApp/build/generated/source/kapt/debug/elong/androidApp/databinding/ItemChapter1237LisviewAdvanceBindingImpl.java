package elong.androidApp.databinding;
import elong.androidApp.R;
import elong.androidApp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemChapter1237LisviewAdvanceBindingImpl extends ItemChapter1237LisviewAdvanceBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.textView9, 7);
        sViewsWithIds.put(R.id.btnNational, 8);
        sViewsWithIds.put(R.id.editText, 9);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    private OnClickListenerImpl mDanhBaAddEventsChapter2DoDetailAndDeleteAndroidViewViewOnClickListener;
    private OnClickListenerImpl1 mDanhBaAddEventsChapter2DoCallAndroidViewViewOnClickListener;
    private OnClickListenerImpl2 mDanhBaAddEventsChapter2DoSMSAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener txtCodeDanhBaandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of ("") + (danhBa.codeUser)
            //         is danhBa.setCodeUser((java.lang.Integer) androidx.databinding.ViewDataBinding.parse(callbackArg_0, danhBa.codeUser))
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(txtCodeDanhBa);
            // localize variables for thread safety
            // ("") + (danhBa.codeUser)
            java.lang.String javaLangStringDanhBaCodeUser = null;
            // danhBa
            elong.models.chapter1_2_3_7.DanhBa danhBa = mDanhBa;
            // danhBa.codeUser
            java.lang.Integer danhBaCodeUser = null;
            // danhBa != null
            boolean danhBaJavaLangObjectNull = false;
            // androidx.databinding.ViewDataBinding.parse(callbackArg_0, danhBa.codeUser)
            int androidxDatabindingViewDataBindingParseCallbackArg0DanhBaCodeUser = 0;
            // (java.lang.Integer) androidx.databinding.ViewDataBinding.parse(callbackArg_0, danhBa.codeUser)
            java.lang.Integer javaLangIntegerAndroidxDatabindingViewDataBindingParseCallbackArg0DanhBaCodeUser = null;



            danhBaJavaLangObjectNull = (danhBa) != (null);
            if (danhBaJavaLangObjectNull) {





                danhBaCodeUser = danhBa.getCodeUser();

                androidxDatabindingViewDataBindingParseCallbackArg0DanhBaCodeUser = androidx.databinding.ViewDataBinding.parse(callbackArg_0, danhBaCodeUser);

                javaLangIntegerAndroidxDatabindingViewDataBindingParseCallbackArg0DanhBaCodeUser = ((java.lang.Integer) (androidxDatabindingViewDataBindingParseCallbackArg0DanhBaCodeUser));

                danhBa.setCodeUser(javaLangIntegerAndroidxDatabindingViewDataBindingParseCallbackArg0DanhBaCodeUser);
            }
        }
    };
    private androidx.databinding.InverseBindingListener txtNameDanhBaandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of danhBa.nameUser
            //         is danhBa.setNameUser((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(txtNameDanhBa);
            // localize variables for thread safety
            // danhBa
            elong.models.chapter1_2_3_7.DanhBa danhBa = mDanhBa;
            // danhBa != null
            boolean danhBaJavaLangObjectNull = false;
            // danhBa.nameUser
            java.lang.String danhBaNameUser = null;



            danhBaJavaLangObjectNull = (danhBa) != (null);
            if (danhBaJavaLangObjectNull) {




                danhBa.setNameUser(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener txtTelephoneNumberandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of danhBa.phoneUser
            //         is danhBa.setPhoneUser((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(txtTelephoneNumber);
            // localize variables for thread safety
            // danhBa.phoneUser
            java.lang.String danhBaPhoneUser = null;
            // danhBa
            elong.models.chapter1_2_3_7.DanhBa danhBa = mDanhBa;
            // danhBa != null
            boolean danhBaJavaLangObjectNull = false;



            danhBaJavaLangObjectNull = (danhBa) != (null);
            if (danhBaJavaLangObjectNull) {




                danhBa.setPhoneUser(((java.lang.String) (callbackArg_0)));
            }
        }
    };

    public ItemChapter1237LisviewAdvanceBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private ItemChapter1237LisviewAdvanceBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.ImageButton) bindings[4]
            , (android.widget.ImageButton) bindings[6]
            , (android.widget.ImageButton) bindings[8]
            , (android.widget.ImageButton) bindings[5]
            , (android.widget.EditText) bindings[9]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            );
        this.btnCall.setTag(null);
        this.btnDetail.setTag(null);
        this.btnSMS.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.txtCodeDanhBa.setTag(null);
        this.txtNameDanhBa.setTag(null);
        this.txtTelephoneNumber.setTag(null);
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
        if (BR.danhBa == variableId) {
            setDanhBa((elong.models.chapter1_2_3_7.DanhBa) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setDanhBa(@Nullable elong.models.chapter1_2_3_7.DanhBa DanhBa) {
        updateRegistration(0, DanhBa);
        this.mDanhBa = DanhBa;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.danhBa);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeDanhBa((elong.models.chapter1_2_3_7.DanhBa) object, fieldId);
        }
        return false;
    }
    private boolean onChangeDanhBa(elong.models.chapter1_2_3_7.DanhBa DanhBa, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.codeUser) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        else if (fieldId == BR.nameUser) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        else if (fieldId == BR.phoneUser) {
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
        java.lang.String javaLangStringDanhBaCodeUser = null;
        java.lang.String danhBaNameUser = null;
        android.view.View.OnClickListener danhBaAddEventsChapter2DoDetailAndDeleteAndroidViewViewOnClickListener = null;
        android.view.View.OnClickListener danhBaAddEventsChapter2DoCallAndroidViewViewOnClickListener = null;
        java.lang.String danhBaPhoneUser = null;
        java.lang.Integer danhBaCodeUser = null;
        elong.models.chapter1_2_3_7.DanhBa danhBa = mDanhBa;
        android.view.View.OnClickListener danhBaAddEventsChapter2DoSMSAndroidViewViewOnClickListener = null;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x15L) != 0) {

                    if (danhBa != null) {
                        // read danhBa.nameUser
                        danhBaNameUser = danhBa.getNameUser();
                    }
            }
            if ((dirtyFlags & 0x11L) != 0) {

                    if (danhBa != null) {
                        // read danhBa::addEventsChapter2DoDetailAndDelete
                        danhBaAddEventsChapter2DoDetailAndDeleteAndroidViewViewOnClickListener = (((mDanhBaAddEventsChapter2DoDetailAndDeleteAndroidViewViewOnClickListener == null) ? (mDanhBaAddEventsChapter2DoDetailAndDeleteAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mDanhBaAddEventsChapter2DoDetailAndDeleteAndroidViewViewOnClickListener).setValue(danhBa));
                        // read danhBa::addEventsChapter2DoCall
                        danhBaAddEventsChapter2DoCallAndroidViewViewOnClickListener = (((mDanhBaAddEventsChapter2DoCallAndroidViewViewOnClickListener == null) ? (mDanhBaAddEventsChapter2DoCallAndroidViewViewOnClickListener = new OnClickListenerImpl1()) : mDanhBaAddEventsChapter2DoCallAndroidViewViewOnClickListener).setValue(danhBa));
                        // read danhBa::addEventsChapter2DoSMS
                        danhBaAddEventsChapter2DoSMSAndroidViewViewOnClickListener = (((mDanhBaAddEventsChapter2DoSMSAndroidViewViewOnClickListener == null) ? (mDanhBaAddEventsChapter2DoSMSAndroidViewViewOnClickListener = new OnClickListenerImpl2()) : mDanhBaAddEventsChapter2DoSMSAndroidViewViewOnClickListener).setValue(danhBa));
                    }
            }
            if ((dirtyFlags & 0x19L) != 0) {

                    if (danhBa != null) {
                        // read danhBa.phoneUser
                        danhBaPhoneUser = danhBa.getPhoneUser();
                    }
            }
            if ((dirtyFlags & 0x13L) != 0) {

                    if (danhBa != null) {
                        // read danhBa.codeUser
                        danhBaCodeUser = danhBa.getCodeUser();
                    }


                    // read ("") + (danhBa.codeUser)
                    javaLangStringDanhBaCodeUser = ("") + (danhBaCodeUser);
            }
        }
        // batch finished
        if ((dirtyFlags & 0x11L) != 0) {
            // api target 1

            this.btnCall.setOnClickListener(danhBaAddEventsChapter2DoCallAndroidViewViewOnClickListener);
            this.btnDetail.setOnClickListener(danhBaAddEventsChapter2DoDetailAndDeleteAndroidViewViewOnClickListener);
            this.btnSMS.setOnClickListener(danhBaAddEventsChapter2DoSMSAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0x13L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtCodeDanhBa, javaLangStringDanhBaCodeUser);
        }
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.txtCodeDanhBa, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, txtCodeDanhBaandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.txtNameDanhBa, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, txtNameDanhBaandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.txtTelephoneNumber, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, txtTelephoneNumberandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x15L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtNameDanhBa, danhBaNameUser);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtTelephoneNumber, danhBaPhoneUser);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private elong.models.chapter1_2_3_7.DanhBa value;
        public OnClickListenerImpl setValue(elong.models.chapter1_2_3_7.DanhBa value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.addEventsChapter2DoDetailAndDelete(arg0); 
        }
    }
    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener{
        private elong.models.chapter1_2_3_7.DanhBa value;
        public OnClickListenerImpl1 setValue(elong.models.chapter1_2_3_7.DanhBa value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.addEventsChapter2DoCall(arg0); 
        }
    }
    public static class OnClickListenerImpl2 implements android.view.View.OnClickListener{
        private elong.models.chapter1_2_3_7.DanhBa value;
        public OnClickListenerImpl2 setValue(elong.models.chapter1_2_3_7.DanhBa value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.addEventsChapter2DoSMS(arg0); 
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): danhBa
        flag 1 (0x2L): danhBa.codeUser
        flag 2 (0x3L): danhBa.nameUser
        flag 3 (0x4L): danhBa.phoneUser
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}