package elong.androidApp.databinding;
import elong.androidApp.R;
import elong.androidApp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityChapter2SendDataNAnswerBindingImpl extends ActivityChapter2SendDataNAnswerBinding  {

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
    private OnClickListenerImpl mAnswerDataTinhUSCLNandSendDataAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener txtKetQuaSendDataAndAnswerandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of answerData.resultSendDataAndAnswer
            //         is answerData.setResultSendDataAndAnswer((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(txtKetQuaSendDataAndAnswer);
            // localize variables for thread safety
            // answerData.resultSendDataAndAnswer
            java.lang.String answerDataResultSendDataAndAnswer = null;
            // answerData != null
            boolean answerDataJavaLangObjectNull = false;
            // answerData
            elong.modelView.mainActivityChapter23.ExplicitIntentsReceiveDataAnswer answerData = mAnswerData;



            answerDataJavaLangObjectNull = (answerData) != (null);
            if (answerDataJavaLangObjectNull) {




                answerData.setResultSendDataAndAnswer(((java.lang.String) (callbackArg_0)));
            }
        }
    };

    public ActivityChapter2SendDataNAnswerBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private ActivityChapter2SendDataNAnswerBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.Button) bindings[2]
            , (android.widget.TextView) bindings[1]
            );
        this.btnUSCLNsendData.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.txtKetQuaSendDataAndAnswer.setTag(null);
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
        if (BR.answerData == variableId) {
            setAnswerData((elong.modelView.mainActivityChapter23.ExplicitIntentsReceiveDataAnswer) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setAnswerData(@Nullable elong.modelView.mainActivityChapter23.ExplicitIntentsReceiveDataAnswer AnswerData) {
        updateRegistration(0, AnswerData);
        this.mAnswerData = AnswerData;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.answerData);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeAnswerData((elong.modelView.mainActivityChapter23.ExplicitIntentsReceiveDataAnswer) object, fieldId);
        }
        return false;
    }
    private boolean onChangeAnswerData(elong.modelView.mainActivityChapter23.ExplicitIntentsReceiveDataAnswer AnswerData, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.resultSendDataAndAnswer) {
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
        java.lang.String answerDataResultSendDataAndAnswer = null;
        elong.modelView.mainActivityChapter23.ExplicitIntentsReceiveDataAnswer answerData = mAnswerData;
        android.view.View.OnClickListener answerDataTinhUSCLNandSendDataAndroidViewViewOnClickListener = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (answerData != null) {
                    // read answerData.resultSendDataAndAnswer
                    answerDataResultSendDataAndAnswer = answerData.getResultSendDataAndAnswer();
                }
            if ((dirtyFlags & 0x5L) != 0) {

                    if (answerData != null) {
                        // read answerData::tinhUSCLNandSendData
                        answerDataTinhUSCLNandSendDataAndroidViewViewOnClickListener = (((mAnswerDataTinhUSCLNandSendDataAndroidViewViewOnClickListener == null) ? (mAnswerDataTinhUSCLNandSendDataAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mAnswerDataTinhUSCLNandSendDataAndroidViewViewOnClickListener).setValue(answerData));
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            this.btnUSCLNsendData.setOnClickListener(answerDataTinhUSCLNandSendDataAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtKetQuaSendDataAndAnswer, answerDataResultSendDataAndAnswer);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.txtKetQuaSendDataAndAnswer, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, txtKetQuaSendDataAndAnswerandroidTextAttrChanged);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private elong.modelView.mainActivityChapter23.ExplicitIntentsReceiveDataAnswer value;
        public OnClickListenerImpl setValue(elong.modelView.mainActivityChapter23.ExplicitIntentsReceiveDataAnswer value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.tinhUSCLNandSendData(arg0); 
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): answerData
        flag 1 (0x2L): answerData.resultSendDataAndAnswer
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}