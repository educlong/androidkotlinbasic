// Generated by data binding compiler. Do not edit!
package elong.androidApp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import elong.androidApp.R;
import elong.models.chapter1_3.Music;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemChapter13MusicBinding extends ViewDataBinding {
  @NonNull
  public final ImageButton btnKaraokeDislike;

  @NonNull
  public final ImageButton btnKaraokeLike;

  @NonNull
  public final TextView textView6;

  @NonNull
  public final TextView textView7;

  @NonNull
  public final TextView txtViewCodeSong;

  @NonNull
  public final TextView txtViewNameSong;

  @NonNull
  public final TextView txtViewSinger;

  @Bindable
  protected Music mMusic;

  protected ItemChapter13MusicBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageButton btnKaraokeDislike, ImageButton btnKaraokeLike, TextView textView6,
      TextView textView7, TextView txtViewCodeSong, TextView txtViewNameSong,
      TextView txtViewSinger) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnKaraokeDislike = btnKaraokeDislike;
    this.btnKaraokeLike = btnKaraokeLike;
    this.textView6 = textView6;
    this.textView7 = textView7;
    this.txtViewCodeSong = txtViewCodeSong;
    this.txtViewNameSong = txtViewNameSong;
    this.txtViewSinger = txtViewSinger;
  }

  public abstract void setMusic(@Nullable Music music);

  @Nullable
  public Music getMusic() {
    return mMusic;
  }

  @NonNull
  public static ItemChapter13MusicBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_chapter1_3_music, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemChapter13MusicBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemChapter13MusicBinding>inflateInternal(inflater, R.layout.item_chapter1_3_music, root, attachToRoot, component);
  }

  @NonNull
  public static ItemChapter13MusicBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_chapter1_3_music, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemChapter13MusicBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemChapter13MusicBinding>inflateInternal(inflater, R.layout.item_chapter1_3_music, null, false, component);
  }

  public static ItemChapter13MusicBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ItemChapter13MusicBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemChapter13MusicBinding)bind(component, view, R.layout.item_chapter1_3_music);
  }
}