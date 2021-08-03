package elong.androidApp.databinding;
import elong.androidApp.R;
import elong.androidApp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityChapter2SendDataBindingImpl extends ActivityChapter2SendDataBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    private OnClickListenerImpl mReceiveDataBackToChapter2ActivityAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener txtKetQuaSendDataIntentandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of receiveData.resultSendDataIntent
            //         is receiveData.setResultSendDataIntent((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(txtKetQuaSendDataIntent);
            // localize variables for thread safety
            // receiveData != null
            boolean receiveDataJavaLangObjectNull = false;
            // receiveData
            elong.modelView.mainActivityChapter23.ExplicitIntentsReceiveData receiveData = mReceiveData;
            // receiveData.resultSendDataIntent
            java.lang.String receiveDataResultSendDataIntent = null;



            receiveDataJavaLangObjectNull = (receiveData) != (null);
            if (receiveDataJavaLangObjectNull) {




                receiveData.setResultSendDataIntent(((java.lang.String) (callbackArg_0)));
            }
        }
    };

    public ActivityChapter2SendDataBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private ActivityChapter2SendDataBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.Button) bindings[2]
            , (android.widget.TextView) bindings[1]
            );
        this.button2.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.txtKetQuaSendDataIntent.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.receiveData == variableId) {
            setReceiveData((elong.modelView.mainActivityChapter23.ExplicitIntentsReceiveData) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setReceiveData(@Nullable elong.modelView.mainActivityChapter23.ExplicitIntentsReceiveData ReceiveData) {
        updateRegistration(0, ReceiveData);
        this.mReceiveData = ReceiveData;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.receiveData);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeReceiveData((elong.modelView.mainActivityChapter23.ExplicitIntentsReceiveData) object, fieldId);
        }
        return false;
    }
    private boolean onChangeReceiveData(elong.modelView.mainActivityChapter23.ExplicitIntentsReceiveData ReceiveData, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.resultSendDataIntent) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
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
        elong.modelView.mainActivityChapter23.ExplicitIntentsReceiveData receiveData = mReceiveData;
        android.view.View.OnClickListener receiveDataBackToChapter2ActivityAndroidViewViewOnClickListener = null;
        java.lang.String receiveDataResultSendDataIntent = null;

        if ((dirtyFlags & 0x7L) != 0) {


            if ((dirtyFlags & 0x5L) != 0) {

                    if (receiveData != null) {
                        // read receiveData::backToChapter2Activity
                        receiveDataBackToChapter2ActivityAndroidViewViewOnClickListener = (((mReceiveDataBackToChapter2ActivityAndroidViewViewOnClickListener == null) ? (mReceiveDataBackToChapter2ActivityAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mReceiveDataBackToChapter2ActivityAndroidViewViewOnClickListener).setValue(receiveData));
                    }
            }

                if (receiveData != null) {
                    // read receiveData.resultSendDataIntent
                    receiveDataResultSendDataIntent = receiveData.getResultSendDataIntent();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            this.button2.setOnClickListener(receiveDataBackToChapter2ActivityAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtKetQuaSendDataIntent, receiveDataResultSendDataIntent);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.txtKetQuaSendDataIntent, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, txtKetQuaSendDataIntentandroidTextAttrChanged);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private elong.modelView.mainActivityChapter23.ExplicitIntentsReceiveData value;
        public OnClickListenerImpl setValue(elong.modelView.mainActivityChapter23.ExplicitIntentsReceiveData value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.backToChapter2Activity(arg0); 
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): receiveData
        flag 1 (0x2L): receiveData.resultSendDataIntent
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}