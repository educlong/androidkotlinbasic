package elong.androidApp;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import elong.androidApp.databinding.ActivityChapter2SendDataBindingImpl;
import elong.androidApp.databinding.ActivityChapter2SendDataNAnswerBindingImpl;
import elong.androidApp.databinding.ActivityMainChapter1BindingImpl;
import elong.androidApp.databinding.ActivityMainChapter23BindingImpl;
import elong.androidApp.databinding.ActivityMainChapter4567BindingImpl;
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
  private static final int LAYOUT_ACTIVITYCHAPTER2SENDDATA = 1;

  private static final int LAYOUT_ACTIVITYCHAPTER2SENDDATANANSWER = 2;

  private static final int LAYOUT_ACTIVITYMAINCHAPTER1 = 3;

  private static final int LAYOUT_ACTIVITYMAINCHAPTER23 = 4;

  private static final int LAYOUT_ACTIVITYMAINCHAPTER4567 = 5;

  private static final int LAYOUT_ACTIVITYMAINDATABINDINGDEMO = 6;

  private static final int LAYOUT_ITEMCHAPTER1237LISVIEWADVANCE = 7;

  private static final int LAYOUT_ITEMCHAPTER13MUSIC = 8;

  private static final int LAYOUT_ITEMCHAPTER1GRIDVIEW = 9;

  private static final int LAYOUT_ITEMDATABINDING = 10;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(10);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(elong.androidApp.R.layout.activity_chapter2_send_data, LAYOUT_ACTIVITYCHAPTER2SENDDATA);
    INTERNAL_LAYOUT_ID_LOOKUP.put(elong.androidApp.R.layout.activity_chapter2_send_data_n_answer, LAYOUT_ACTIVITYCHAPTER2SENDDATANANSWER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(elong.androidApp.R.layout.activity_main_chapter1, LAYOUT_ACTIVITYMAINCHAPTER1);
    INTERNAL_LAYOUT_ID_LOOKUP.put(elong.androidApp.R.layout.activity_main_chapter_2_3, LAYOUT_ACTIVITYMAINCHAPTER23);
    INTERNAL_LAYOUT_ID_LOOKUP.put(elong.androidApp.R.layout.activity_main_chapter_4567, LAYOUT_ACTIVITYMAINCHAPTER4567);
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
        case  LAYOUT_ACTIVITYCHAPTER2SENDDATA: {
          if ("layout/activity_chapter2_send_data_0".equals(tag)) {
            return new ActivityChapter2SendDataBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_chapter2_send_data is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYCHAPTER2SENDDATANANSWER: {
          if ("layout/activity_chapter2_send_data_n_answer_0".equals(tag)) {
            return new ActivityChapter2SendDataNAnswerBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_chapter2_send_data_n_answer is invalid. Received: " + tag);
        }
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
        case  LAYOUT_ACTIVITYMAINCHAPTER4567: {
          if ("layout/activity_main_chapter_4567_0".equals(tag)) {
            return new ActivityMainChapter4567BindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main_chapter_4567 is invalid. Received: " + tag);
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
    static final SparseArray<String> sKeys = new SparseArray<String>(63);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "a");
      sKeys.put(2, "aSendData");
      sKeys.put(3, "answerData");
      sKeys.put(4, "b");
      sKeys.put(5, "bSendData");
      sKeys.put(6, "calculate");
      sKeys.put(7, "celsius");
      sKeys.put(8, "check");
      sKeys.put(9, "checkedSaveInfoLogin");
      sKeys.put(10, "codeSong");
      sKeys.put(11, "codeUser");
      sKeys.put(12, "danhBa");
      sKeys.put(13, "danhBas");
      sKeys.put(14, "danhbasInfor");
      sKeys.put(15, "datetimes");
      sKeys.put(16, "dbDanhBa");
      sKeys.put(17, "dbKaraoke");
      sKeys.put(18, "drawButtons");
      sKeys.put(19, "explicitIntents");
      sKeys.put(20, "explicitIntentsFeedbackData");
      sKeys.put(21, "fahrenheit");
      sKeys.put(22, "firstName");
      sKeys.put(23, "gvimg");
      sKeys.put(24, "header");
      sKeys.put(25, "img");
      sKeys.put(26, "imgs");
      sKeys.put(27, "imgsInfor");
      sKeys.put(28, "implicitIntents");
      sKeys.put(29, "infor");
      sKeys.put(30, "infos");
      sKeys.put(31, "lastName");
      sKeys.put(32, "layoutButtonAsyncTask");
      sKeys.put(33, "like");
      sKeys.put(34, "lvmusics");
      sKeys.put(35, "messageActivity");
      sKeys.put(36, "music");
      sKeys.put(37, "musics");
      sKeys.put(38, "musicsInfor");
      sKeys.put(39, "nameSong");
      sKeys.put(40, "nameUser");
      sKeys.put(41, "numberButton");
      sKeys.put(42, "password");
      sKeys.put(43, "percent");
      sKeys.put(44, "phone");
      sKeys.put(45, "phoneActivity");
      sKeys.put(46, "phoneUser");
      sKeys.put(47, "presenter");
      sKeys.put(48, "progress");
      sKeys.put(49, "radiobutons");
      sKeys.put(50, "receiveData");
      sKeys.put(51, "result");
      sKeys.put(52, "resultSendData");
      sKeys.put(53, "resultSendDataAndAnswer");
      sKeys.put(54, "resultSendDataIntent");
      sKeys.put(55, "sharedPreferencesLogin");
      sKeys.put(56, "singer");
      sKeys.put(57, "temp");
      sKeys.put(58, "title");
      sKeys.put(59, "totalUser");
      sKeys.put(60, "user");
      sKeys.put(61, "username");
      sKeys.put(62, "users");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(10);

    static {
      sKeys.put("layout/activity_chapter2_send_data_0", elong.androidApp.R.layout.activity_chapter2_send_data);
      sKeys.put("layout/activity_chapter2_send_data_n_answer_0", elong.androidApp.R.layout.activity_chapter2_send_data_n_answer);
      sKeys.put("layout/activity_main_chapter1_0", elong.androidApp.R.layout.activity_main_chapter1);
      sKeys.put("layout/activity_main_chapter_2_3_0", elong.androidApp.R.layout.activity_main_chapter_2_3);
      sKeys.put("layout/activity_main_chapter_4567_0", elong.androidApp.R.layout.activity_main_chapter_4567);
      sKeys.put("layout/activity_main_data_binding_demo_0", elong.androidApp.R.layout.activity_main_data_binding_demo);
      sKeys.put("layout/item_chapter1237_lisview_advance_0", elong.androidApp.R.layout.item_chapter1237_lisview_advance);
      sKeys.put("layout/item_chapter1_3_music_0", elong.androidApp.R.layout.item_chapter1_3_music);
      sKeys.put("layout/item_chapter1_gridview_0", elong.androidApp.R.layout.item_chapter1_gridview);
      sKeys.put("layout/item_databinding_0", elong.androidApp.R.layout.item_databinding);
    }
  }
}
