package elong.androidApp.databinding;
import elong.androidApp.R;
import elong.androidApp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemChapter13MusicBindingImpl extends ItemChapter13MusicBinding implements elong.androidApp.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.textView7, 6);
        sViewsWithIds.put(R.id.textView6, 7);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback8;
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener txtViewCodeSongandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of music.codeSong
            //         is music.setCodeSong((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(txtViewCodeSong);
            // localize variables for thread safety
            // music
            elong.models.chapter1_3.Music music = mMusic;
            // music != null
            boolean musicJavaLangObjectNull = false;
            // music.codeSong
            java.lang.String musicCodeSong = null;



            musicJavaLangObjectNull = (music) != (null);
            if (musicJavaLangObjectNull) {




                music.setCodeSong(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener txtViewNameSongandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of music.nameSong
            //         is music.setNameSong((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(txtViewNameSong);
            // localize variables for thread safety
            // music
            elong.models.chapter1_3.Music music = mMusic;
            // music != null
            boolean musicJavaLangObjectNull = false;
            // music.nameSong
            java.lang.String musicNameSong = null;



            musicJavaLangObjectNull = (music) != (null);
            if (musicJavaLangObjectNull) {




                music.setNameSong(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener txtViewSingerandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of music.singer
            //         is music.setSinger((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(txtViewSinger);
            // localize variables for thread safety
            // music.singer
            java.lang.String musicSinger = null;
            // music
            elong.models.chapter1_3.Music music = mMusic;
            // music != null
            boolean musicJavaLangObjectNull = false;



            musicJavaLangObjectNull = (music) != (null);
            if (musicJavaLangObjectNull) {




                music.setSinger(((java.lang.String) (callbackArg_0)));
            }
        }
    };

    public ItemChapter13MusicBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private ItemChapter13MusicBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (android.widget.ImageButton) bindings[5]
            , (android.widget.ImageButton) bindings[4]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            );
        this.btnKaraokeDislike.setTag(null);
        this.btnKaraokeLike.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.txtViewCodeSong.setTag(null);
        this.txtViewNameSong.setTag(null);
        this.txtViewSinger.setTag(null);
        setRootTag(root);
        // listeners
        mCallback8 = new elong.androidApp.generated.callback.OnClickListener(this, 2);
        mCallback7 = new elong.androidApp.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x40L;
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
        if (BR.music == variableId) {
            setMusic((elong.models.chapter1_3.Music) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMusic(@Nullable elong.models.chapter1_3.Music Music) {
        updateRegistration(1, Music);
        this.mMusic = Music;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.music);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeMusicClickLike((androidx.databinding.ObservableField<java.lang.Integer>) object, fieldId);
            case 1 :
                return onChangeMusic((elong.models.chapter1_3.Music) object, fieldId);
            case 2 :
                return onChangeMusicClickDislike((androidx.databinding.ObservableField<java.lang.Integer>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeMusicClickLike(androidx.databinding.ObservableField<java.lang.Integer> MusicClickLike, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeMusic(elong.models.chapter1_3.Music Music, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        else if (fieldId == BR.codeSong) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        else if (fieldId == BR.nameSong) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        else if (fieldId == BR.singer) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeMusicClickDislike(androidx.databinding.ObservableField<java.lang.Integer> MusicClickDislike, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
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
        androidx.databinding.ObservableField<java.lang.Integer> musicClickLike = null;
        java.lang.String musicCodeSong = null;
        java.lang.Integer musicClickLikeGet = null;
        java.lang.String musicNameSong = null;
        int androidxDatabindingViewDataBindingSafeUnboxMusicClickDislikeGet = 0;
        elong.models.chapter1_3.Music music = mMusic;
        androidx.databinding.ObservableField<java.lang.Integer> musicClickDislike = null;
        int androidxDatabindingViewDataBindingSafeUnboxMusicClickLikeGet = 0;
        java.lang.String musicSinger = null;
        java.lang.Integer musicClickDislikeGet = null;

        if ((dirtyFlags & 0x7fL) != 0) {


            if ((dirtyFlags & 0x43L) != 0) {

                    if (music != null) {
                        // read music.clickLike
                        musicClickLike = music.getClickLike();
                    }
                    updateRegistration(0, musicClickLike);


                    if (musicClickLike != null) {
                        // read music.clickLike.get()
                        musicClickLikeGet = musicClickLike.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(music.clickLike.get())
                    androidxDatabindingViewDataBindingSafeUnboxMusicClickLikeGet = androidx.databinding.ViewDataBinding.safeUnbox(musicClickLikeGet);
            }
            if ((dirtyFlags & 0x4aL) != 0) {

                    if (music != null) {
                        // read music.codeSong
                        musicCodeSong = music.getCodeSong();
                    }
            }
            if ((dirtyFlags & 0x52L) != 0) {

                    if (music != null) {
                        // read music.nameSong
                        musicNameSong = music.getNameSong();
                    }
            }
            if ((dirtyFlags & 0x46L) != 0) {

                    if (music != null) {
                        // read music.clickDislike
                        musicClickDislike = music.getClickDislike();
                    }
                    updateRegistration(2, musicClickDislike);


                    if (musicClickDislike != null) {
                        // read music.clickDislike.get()
                        musicClickDislikeGet = musicClickDislike.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(music.clickDislike.get())
                    androidxDatabindingViewDataBindingSafeUnboxMusicClickDislikeGet = androidx.databinding.ViewDataBinding.safeUnbox(musicClickDislikeGet);
            }
            if ((dirtyFlags & 0x62L) != 0) {

                    if (music != null) {
                        // read music.singer
                        musicSinger = music.getSinger();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x40L) != 0) {
            // api target 1

            this.btnKaraokeDislike.setOnClickListener(mCallback8);
            this.btnKaraokeLike.setOnClickListener(mCallback7);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.txtViewCodeSong, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, txtViewCodeSongandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.txtViewNameSong, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, txtViewNameSongandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.txtViewSinger, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, txtViewSingerandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x46L) != 0) {
            // api target 1

            this.btnKaraokeDislike.setVisibility(androidxDatabindingViewDataBindingSafeUnboxMusicClickDislikeGet);
        }
        if ((dirtyFlags & 0x43L) != 0) {
            // api target 1

            this.btnKaraokeLike.setVisibility(androidxDatabindingViewDataBindingSafeUnboxMusicClickLikeGet);
        }
        if ((dirtyFlags & 0x4aL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtViewCodeSong, musicCodeSong);
        }
        if ((dirtyFlags & 0x52L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtViewNameSong, musicNameSong);
        }
        if ((dirtyFlags & 0x62L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtViewSinger, musicSinger);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // music
                elong.models.chapter1_3.Music music = mMusic;
                // music != null
                boolean musicJavaLangObjectNull = false;



                musicJavaLangObjectNull = (music) != (null);
                if (musicJavaLangObjectNull) {


                    music.diplay();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // music
                elong.models.chapter1_3.Music music = mMusic;
                // music != null
                boolean musicJavaLangObjectNull = false;



                musicJavaLangObjectNull = (music) != (null);
                if (musicJavaLangObjectNull) {


                    music.diplay();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): music.clickLike
        flag 1 (0x2L): music
        flag 2 (0x3L): music.clickDislike
        flag 3 (0x4L): music.codeSong
        flag 4 (0x5L): music.nameSong
        flag 5 (0x6L): music.singer
        flag 6 (0x7L): null
    flag mapping end*/
    //end
}