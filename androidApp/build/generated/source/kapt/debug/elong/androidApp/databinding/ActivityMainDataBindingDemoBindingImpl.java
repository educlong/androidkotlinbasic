package elong.androidApp.databinding;
import elong.androidApp.R;
import elong.androidApp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainDataBindingDemoBindingImpl extends ActivityMainDataBindingDemoBinding implements elong.androidApp.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.button3, 10);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final android.widget.EditText mboundView1;
    @NonNull
    private final android.widget.EditText mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.EditText mboundView4;
    @NonNull
    private final android.widget.Button mboundView5;
    @NonNull
    private final android.widget.Button mboundView6;
    @NonNull
    private final android.widget.Button mboundView7;
    @NonNull
    private final android.widget.TextView mboundView8;
    @NonNull
    private final android.widget.Spinner mboundView9;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback14;
    // values
    // listeners
    private OnClickListenerImpl mInfosAddAndroidViewViewOnClickListener;
    private OnClickListenerImpl1 mInfosRemoveAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener mboundView3androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of temp.celsius
            //         is temp.setCelsius((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView3);
            // localize variables for thread safety
            // temp
            elong.modelView.mainActivityDataBindingDemo.TemperatureData temp = mTemp;
            // temp.celsius
            java.lang.String tempCelsius = null;
            // temp != null
            boolean tempJavaLangObjectNull = false;



            tempJavaLangObjectNull = (temp) != (null);
            if (tempJavaLangObjectNull) {




                temp.setCelsius(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView4androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of temp.celsius
            //         is temp.setCelsius((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView4);
            // localize variables for thread safety
            // temp
            elong.modelView.mainActivityDataBindingDemo.TemperatureData temp = mTemp;
            // temp.celsius
            java.lang.String tempCelsius = null;
            // temp != null
            boolean tempJavaLangObjectNull = false;



            tempJavaLangObjectNull = (temp) != (null);
            if (tempJavaLangObjectNull) {




                temp.setCelsius(((java.lang.String) (callbackArg_0)));
            }
        }
    };

    public ActivityMainDataBindingDemoBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private ActivityMainDataBindingDemoBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 5
            , (android.widget.Button) bindings[10]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.EditText) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.EditText) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.EditText) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.Button) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.Button) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (android.widget.Button) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView8 = (android.widget.TextView) bindings[8];
        this.mboundView8.setTag(null);
        this.mboundView9 = (android.widget.Spinner) bindings[9];
        this.mboundView9.setTag(null);
        setRootTag(root);
        // listeners
        mCallback14 = new elong.androidApp.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x400L;
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
        if (BR.user == variableId) {
            setUser((elong.modelView.mainActivityDataBindingDemo.User) variable);
        }
        else if (BR.header == variableId) {
            setHeader((elong.modelView.mainActivityDataBindingDemo.ListHeader) variable);
        }
        else if (BR.temp == variableId) {
            setTemp((elong.modelView.mainActivityDataBindingDemo.TemperatureData) variable);
        }
        else if (BR.infos == variableId) {
            setInfos((elong.modelView.mainActivityDataBindingDemo.ListUserInfor) variable);
        }
        else if (BR.presenter == variableId) {
            setPresenter((elong.modelView.PresenterData) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setUser(@Nullable elong.modelView.mainActivityDataBindingDemo.User User) {
        updateRegistration(0, User);
        this.mUser = User;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.user);
        super.requestRebind();
    }
    public void setHeader(@Nullable elong.modelView.mainActivityDataBindingDemo.ListHeader Header) {
        updateRegistration(1, Header);
        this.mHeader = Header;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.header);
        super.requestRebind();
    }
    public void setTemp(@Nullable elong.modelView.mainActivityDataBindingDemo.TemperatureData Temp) {
        updateRegistration(2, Temp);
        this.mTemp = Temp;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.temp);
        super.requestRebind();
    }
    public void setInfos(@Nullable elong.modelView.mainActivityDataBindingDemo.ListUserInfor Infos) {
        updateRegistration(3, Infos);
        this.mInfos = Infos;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.infos);
        super.requestRebind();
    }
    public void setPresenter(@Nullable elong.modelView.PresenterData Presenter) {
        this.mPresenter = Presenter;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.presenter);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeUser((elong.modelView.mainActivityDataBindingDemo.User) object, fieldId);
            case 1 :
                return onChangeHeader((elong.modelView.mainActivityDataBindingDemo.ListHeader) object, fieldId);
            case 2 :
                return onChangeTemp((elong.modelView.mainActivityDataBindingDemo.TemperatureData) object, fieldId);
            case 3 :
                return onChangeInfos((elong.modelView.mainActivityDataBindingDemo.ListUserInfor) object, fieldId);
            case 4 :
                return onChangeInfosUsers((androidx.databinding.ObservableArrayList<elong.modelView.mainActivityDataBindingDemo.User>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeUser(elong.modelView.mainActivityDataBindingDemo.User User, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.firstName) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        else if (fieldId == BR.lastName) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeHeader(elong.modelView.mainActivityDataBindingDemo.ListHeader Header, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        else if (fieldId == BR.title) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeTemp(elong.modelView.mainActivityDataBindingDemo.TemperatureData Temp, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        else if (fieldId == BR.celsius) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeInfos(elong.modelView.mainActivityDataBindingDemo.ListUserInfor Infos, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        else if (fieldId == BR.users) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeInfosUsers(androidx.databinding.ObservableArrayList<elong.modelView.mainActivityDataBindingDemo.User> InfosUsers, int fieldId) {
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
        java.lang.String userFirstName = null;
        elong.modelView.mainActivityDataBindingDemo.User user = mUser;
        elong.modelView.mainActivityDataBindingDemo.ListHeader header = mHeader;
        java.lang.String userLastName = null;
        elong.modelView.mainActivityDataBindingDemo.TemperatureData temp = mTemp;
        elong.modelView.mainActivityDataBindingDemo.ListUserInfor infos = mInfos;
        java.lang.String tempCelsius = null;
        android.view.View.OnClickListener infosAddAndroidViewViewOnClickListener = null;
        android.view.View.OnClickListener infosRemoveAndroidViewViewOnClickListener = null;
        java.lang.String headerTitle = null;
        elong.modelView.PresenterData<?> presenter = mPresenter;
        androidx.databinding.ObservableArrayList<elong.modelView.mainActivityDataBindingDemo.User> infosUsers = null;

        if ((dirtyFlags & 0x4c1L) != 0) {


            if ((dirtyFlags & 0x441L) != 0) {

                    if (user != null) {
                        // read user.firstName
                        userFirstName = user.getFirstName();
                    }
            }
            if ((dirtyFlags & 0x481L) != 0) {

                    if (user != null) {
                        // read user.lastName
                        userLastName = user.getLastName();
                    }
            }
        }
        if ((dirtyFlags & 0x502L) != 0) {



                if (header != null) {
                    // read header.title
                    headerTitle = header.getTitle();
                }
        }
        if ((dirtyFlags & 0x604L) != 0) {



                if (temp != null) {
                    // read temp.celsius
                    tempCelsius = temp.getCelsius();
                }
        }
        if ((dirtyFlags & 0x418L) != 0) {


            if ((dirtyFlags & 0x408L) != 0) {

                    if (infos != null) {
                        // read infos::add
                        infosAddAndroidViewViewOnClickListener = (((mInfosAddAndroidViewViewOnClickListener == null) ? (mInfosAddAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mInfosAddAndroidViewViewOnClickListener).setValue(infos));
                        // read infos::remove
                        infosRemoveAndroidViewViewOnClickListener = (((mInfosRemoveAndroidViewViewOnClickListener == null) ? (mInfosRemoveAndroidViewViewOnClickListener = new OnClickListenerImpl1()) : mInfosRemoveAndroidViewViewOnClickListener).setValue(infos));
                    }
            }

                if (infos != null) {
                    // read infos.users
                    infosUsers = infos.getUsers();
                }
                updateRegistration(4, infosUsers);
        }
        // batch finished
        if ((dirtyFlags & 0x441L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, userFirstName);
        }
        if ((dirtyFlags & 0x481L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, userLastName);
        }
        if ((dirtyFlags & 0x604L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, tempCelsius);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, tempCelsius);
        }
        if ((dirtyFlags & 0x400L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView3, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView3androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView4, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView4androidTextAttrChanged);
            this.mboundView5.setOnClickListener(mCallback14);
        }
        if ((dirtyFlags & 0x408L) != 0) {
            // api target 1

            this.mboundView6.setOnClickListener(infosAddAndroidViewViewOnClickListener);
            this.mboundView7.setOnClickListener(infosRemoveAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0x502L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView8, headerTitle);
        }
        if ((dirtyFlags & 0x418L) != 0) {
            // api target 1

            elong.modelView.mainActivityDataBindingDemo.adapter.ListBinder.bindList(this.mboundView9, infosUsers);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private elong.modelView.mainActivityDataBindingDemo.ListUserInfor value;
        public OnClickListenerImpl setValue(elong.modelView.mainActivityDataBindingDemo.ListUserInfor value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.add(arg0); 
        }
    }
    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener{
        private elong.modelView.mainActivityDataBindingDemo.ListUserInfor value;
        public OnClickListenerImpl1 setValue(elong.modelView.mainActivityDataBindingDemo.ListUserInfor value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.remove(arg0); 
        }
    }
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // presenter != null
        boolean presenterJavaLangObjectNull = false;
        // presenter
        elong.modelView.PresenterData presenter = mPresenter;
        // temp
        elong.modelView.mainActivityDataBindingDemo.TemperatureData temp = mTemp;



        presenterJavaLangObjectNull = (presenter) != (null);
        if (presenterJavaLangObjectNull) {



            presenter.onShowData(temp);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): user
        flag 1 (0x2L): header
        flag 2 (0x3L): temp
        flag 3 (0x4L): infos
        flag 4 (0x5L): infos.users
        flag 5 (0x6L): presenter
        flag 6 (0x7L): user.firstName
        flag 7 (0x8L): user.lastName
        flag 8 (0x9L): header.title
        flag 9 (0xaL): temp.celsius
        flag 10 (0xbL): null
    flag mapping end*/
    //end
}