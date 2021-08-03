package elong.androidApp;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import elong.androidApp.databinding.ActivityMainChapter1BindingImpl;
import elong.androidApp.databinding.ActivityMainChapter23BindingImpl;
import elong.androidApp.databinding.ActivityMainDataBindingDemoBindingImpl;
import elong.androidApp.databinding.ItemChapter1237LisviewAdvanceBindingImpl;
import elong.androidApp.databinding.ItemChapter13MusicBindingImpl;
import elong.androidApp.databinding.ItemChapter1GridviewBindingImpl;
import elong.androidApp.databinding.ItemDatabindingBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAINCHAPTER1 = 1;

  private static final int LAYOUT_ACTIVITYMAINCHAPTER23 = 2;

  private static final int LAYOUT_ACTIVITYMAINDATABINDINGDEMO = 3;

  private static final int LAYOUT_ITEMCHAPTER1237LISVIEWADVANCE = 4;

  private static final int LAYOUT_ITEMCHAPTER13MUSIC = 5;

  private static final int LAYOUT_ITEMCHAPTER1GRIDVIEW = 6;

  private static final int LAYOUT_ITEMDATABINDING = 7;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(7);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(elong.androidApp.R.layout.activity_main_chapter1, LAYOUT_ACTIVITYMAINCHAPTER1);
    INTERNAL_LAYOUT_ID_LOOKUP.put(elong.androidApp.R.layout.activity_main_chapter_2_3, LAYOUT_ACTIVITYMAINCHAPTER23);
    INTERNAL_LAYOUT_ID_LOOKUP.put(elong.androidApp.R.layout.activity_main_data_binding_demo, LAYOUT_ACTIVITYMAINDATABINDINGDEMO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(elong.androidApp.R.layout.item_chapter1237_lisview_advance, LAYOUT_ITEMCHAPTER1237LISVIEWADVANCE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(elong.androidApp.R.layout.item_chapter1_3_music, LAYOUT_ITEMCHAPTER13MUSIC);
    INTERNAL_LAYOUT_ID_LOOKUP.put(elong.androidApp.R.layout.item_chapter1_gridview, LAYOUT_ITEMCHAPTER1GRIDVIEW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(elong.androidApp.R.layout.item_databinding, LAYOUT_ITEMDATABINDING);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAINCHAPTER1: {
          if ("layout/activity_main_chapter1_0".equals(tag)) {
            return new ActivityMainChapter1BindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main_chapter1 is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMAINCHAPTER23: {
          if ("layout/activity_main_chapter_2_3_0".equals(tag)) {
            return new ActivityMainChapter23BindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main_chapter_2_3 is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMAINDATABINDINGDEMO: {
          if ("layout/activity_main_data_binding_demo_0".equals(tag)) {
            return new ActivityMainDataBindingDemoBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main_data_binding_demo is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMCHAPTER1237LISVIEWADVANCE: {
          if ("layout/item_chapter1237_lisview_advance_0".equals(tag)) {
            return new ItemChapter1237LisviewAdvanceBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_chapter1237_lisview_advance is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMCHAPTER13MUSIC: {
          if ("layout/item_chapter1_3_music_0".equals(tag)) {
            return new ItemChapter13MusicBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_chapter1_3_music is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMCHAPTER1GRIDVIEW: {
          if ("layout/item_chapter1_gridview_0".equals(tag)) {
            return new ItemChapter1GridviewBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_chapter1_gridview is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMDATABINDING: {
          if ("layout/item_databinding_0".equals(tag)) {
            return new ItemDatabindingBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_databinding is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(42);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "a");
      sKeys.put(2, "b");
      sKeys.put(3, "c");
      sKeys.put(4, "cadd");
      sKeys.put(5, "calculate");
      sKeys.put(6, "celsius");
      sKeys.put(7, "check");
      sKeys.put(8, "codeSong");
      sKeys.put(9, "codeUser");
      sKeys.put(10, "csharp");
      sKeys.put(11, "danhBa");
      sKeys.put(12, "danhBas");
      sKeys.put(13, "danhbasInfor");
      sKeys.put(14, "fahrenheit");
      sKeys.put(15, "firstName");
      sKeys.put(16, "gvimg");
      sKeys.put(17, "header");
      sKeys.put(18, "img");
      sKeys.put(19, "imgs");
      sKeys.put(20, "imgsInfor");
      sKeys.put(21, "infor");
      sKeys.put(22, "infos");
      sKeys.put(23, "java");
      sKeys.put(24, "lastName");
      sKeys.put(25, "like");
      sKeys.put(26, "lvmusics");
      sKeys.put(27, "music");
      sKeys.put(28, "musics");
      sKeys.put(29, "nameSong");
      sKeys.put(30, "nameUser");
      sKeys.put(31, "phone");
      sKeys.put(32, "phoneUser");
      sKeys.put(33, "presenter");
      sKeys.put(34, "result");
      sKeys.put(35, "resultCheckbox");
      sKeys.put(36, "singer");
      sKeys.put(37, "temp");
      sKeys.put(38, "title");
      sKeys.put(39, "totalUser");
      sKeys.put(40, "user");
      sKeys.put(41, "users");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(7);

    static {
      sKeys.put("layout/activity_main_chapter1_0", elong.androidApp.R.layout.activity_main_chapter1);
      sKeys.put("layout/activity_main_chapter_2_3_0", elong.androidApp.R.layout.activity_main_chapter_2_3);
      sKeys.put("layout/activity_main_data_binding_demo_0", elong.androidApp.R.layout.activity_main_data_binding_demo);
      sKeys.put("layout/item_chapter1237_lisview_advance_0", elong.androidApp.R.layout.item_chapter1237_lisview_advance);
      sKeys.put("layout/item_chapter1_3_music_0", elong.androidApp.R.layout.item_chapter1_3_music);
      sKeys.put("layout/item_chapter1_gridview_0", elong.androidApp.R.layout.item_chapter1_gridview);
      sKeys.put("layout/item_databinding_0", elong.androidApp.R.layout.item_databinding);
    }
  }
}
