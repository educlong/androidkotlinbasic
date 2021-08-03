package elong.androidApp.generated.callback;
public final class OnTabChangeListener implements android.widget.TabHost.OnTabChangeListener {
    final Listener mListener;
    final int mSourceId;
    public OnTabChangeListener(Listener listener, int sourceId) {
        mListener = listener;
        mSourceId = sourceId;
    }
    @Override
    public void onTabChanged(java.lang.String callbackArg_0) {
        mListener._internalCallbackOnTabChanged(mSourceId , callbackArg_0);
    }
    public interface Listener {
        void _internalCallbackOnTabChanged(int sourceId , java.lang.String callbackArg_0);
    }
}