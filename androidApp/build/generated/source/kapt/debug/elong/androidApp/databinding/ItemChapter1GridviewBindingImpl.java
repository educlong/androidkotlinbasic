package elong.androidApp.databinding;
import elong.androidApp.R;
import elong.androidApp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemChapter1GridviewBindingImpl extends ItemChapter1GridviewBinding  {

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
    @NonNull
    private final android.widget.ImageView mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemChapter1GridviewBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 2, sIncludes, sViewsWithIds));
    }
    private ItemChapter1GridviewBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.ImageView) bindings[1];
        this.mboundView1.setTag(null);
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
        if (BR.gvimg == variableId) {
            setGvimg((elong.modelView.mainActivityChapter1EventOnView.GvImage) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setGvimg(@Nullable elong.modelView.mainActivityChapter1EventOnView.GvImage Gvimg) {
        updateRegistration(0, Gvimg);
        this.mGvimg = Gvimg;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.gvimg);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeGvimg((elong.modelView.mainActivityChapter1EventOnView.GvImage) object, fieldId);
        }
        return false;
    }
    private boolean onChangeGvimg(elong.modelView.mainActivityChapter1EventOnView.GvImage Gvimg, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.img) {
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
        java.lang.Integer gvimgImg = null;
        android.graphics.drawable.Drawable contextGetDrawableGvimgImg = null;
        int androidxDatabindingViewDataBindingSafeUnboxGvimgImg = 0;
        elong.modelView.mainActivityChapter1EventOnView.GvImage gvimg = mGvimg;

        if ((dirtyFlags & 0x7L) != 0) {



                if (gvimg != null) {
                    // read gvimg.img
                    gvimgImg = gvimg.getImg();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(gvimg.img)
                androidxDatabindingViewDataBindingSafeUnboxGvimgImg = androidx.databinding.ViewDataBinding.safeUnbox(gvimgImg);


                // read context.getDrawable(androidx.databinding.ViewDataBinding.safeUnbox(gvimg.img))
                contextGetDrawableGvimgImg = getRoot().getContext().getDrawable(androidxDatabindingViewDataBindingSafeUnboxGvimgImg);
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.mboundView1, contextGetDrawableGvimgImg);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): gvimg
        flag 1 (0x2L): gvimg.img
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}