package elong.androidApp

import android.animation.Animator
import android.animation.AnimatorInflater
import android.animation.ObjectAnimator
import android.app.NotificationManager
import android.app.ProgressDialog
import android.content.BroadcastReceiver
import android.content.Intent
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Typeface
import android.graphics.drawable.AnimationDrawable
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.*
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.*
import androidx.databinding.DataBindingUtil
import elong.androidApp.adapter.arrayAdapter.chapter1_2_3_7.DanhBaAdapter
import elong.androidApp.adapter.arrayAdapter.chapter7.AdapterTyZaDongA
import elong.androidApp.chapter6BroadcastNotification.Chapter6NotificationUpdateVersion
import elong.androidApp.databinding.ActivityMainChapter4567Binding
import elong.androidApp.services.chapter5DialogAsyncTask.AsyncTaskControllers
import elong.androidApp.services.diaglog.ShowProgressDialog
import elong.androidApp.services.chapter6BroadcastReceiver.BroadcastController
import elong.androidApp.services.chapter6_9.NotificationController
import elong.androidApp.services.chapter7Webservice.AsyncTaskWebServices
import elong.androidApp.services.diaglog.ShowProgressWebserviceDialog
import elong.modelView.mainActivityChapter4567.AsyncTaskDrawButton
import elong.models.chapter1_2_3_7.DanhBa
import elong.models.chapter7.InforPerson
import elong.models.chapter7.Result
import elong.models.chapter7.TyZaDongA
import java.util.*
import kotlin.random.Random

class MainActivityChapter4567 : AppCompatActivity() {
//    var binding: ActivityMainChapter4567Binding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_chapter_4567)
        addControls()
        addEvents()
        dataBinding()
    }
    private fun addControls() {
        addControlChapter4()    /**CHƯƠNG 4: MENU, CONTROL SEARCH AND ANIMATION*/
        addControlChapter5()    /**CHƯƠNG 5: ASYNCTASK - LẬP TRÌNH ĐA TIẾN TRÌNH TRONG ANDROID*/
        addControlChapter6()    /**CHƯƠNG 6: BROADCAST RECEIVER*/
        addControlChapter7()    /**CHƯƠNG 7: TƯƠNG TÁC WEBSERVICES (cấp quyền internet trong manifest và sử dụng đa tiến trình)*/
    }
    private fun addEvents() {
        addEventsChapter4()     /**CHƯƠNG 4: MENU, CONTROL SEARCH AND ANIMATION*/
        addEventsChapter5()     /**CHƯƠNG 5: ASYNCTASK - LẬP TRÌNH ĐA TIẾN TRÌNH TRONG ANDROID*/
        addEventsChapter6()     /**CHƯƠNG 6: BROADCAST RECEIVER*/
        addEventsChapter7()     /**CHƯƠNG 7: TƯƠNG TÁC WEBSERVICES (cấp quyền internet trong manifest và sử dụng đa tiến trình)*/
    }
    private fun dataBinding() {
//        binding=DataBindingUtil.setContentView(this@MainActivityChapter4567,R.layout.activity_main_chapter_4567)
        dataBindingChapter5()
    }

    /**CHƯƠNG 4: MENU, CONTROL SEARCH AND ANIMATION*/
    /**Phần chung cho Option Menu và Menu Search View - Controls */
    override fun    /*Phần chung cho Option Menu và Menu Search View - Controls */  onCreateOptionsMenu(menu: Menu?): Boolean { /*Bước 1: Tạo file menu_main.xml.*/
        var inflater: MenuInflater =menuInflater                                      /*Bước 2: gọi lệnh khởi tạo menu từ xml (là bước này)*/
        addControlChapter4OnOptionsItemSelectedOptionMenu(inflater, menu)           /*inflater nạp từ file vật lý (menu_main.xml) lên bộ nhớ của mobile*/
        addControlChapter4OnOptionsItemSelectedMenuSearchView(inflater, menu)
        return super.onCreateOptionsMenu(menu)
    }

    /**CHƯƠNG 4: MENU, CONTROL SEARCH AND ANIMATION*/
    private fun addControlChapter4() {
        addControlChapter4OptionMenu()                      /**Option Menu (add thêm file menu/chapter4_menu_main.xml)*/
        addControlChapter4ContextMenu()                     /**Context Menu (add thêm file menu/chapter4_contextmenu_main.xml) */
        addControlChapter4MenuSearchView()                  /**Menu Search View (add thêm file menu/chapter4_menu_search_main.xml.xml)*/
        addControlChapter4AnimationXoayControlsAndScreen()  /**Animation Xoay Controls and Screen  (add thêm 3 file xml trong anim)*/
        addControlChapter4AnimationHoatHinhMinions()        /**Animation Hiệu ứng hoạt hình Minions (add thêm file drawable/chapter4_animation_minions_effect.xml)*/
        addControlsChapter4PROJECTAnimationGameBanBong()    /**PROJECT CHƯƠNG 4: MENU, CONTROL SEARCH AND ANIMATION -> GAME BẮN BÓNG*/
    }
    private fun addEventsChapter4() {
        addEventsChapter4ContextMenu()                      /**Context Menu (add thêm file menu/chapter4_contextmenu_main.xml) */
        addEventsChapter4AnimationXoayControlsAndScreen()   /**Animation Xoay Controls and Screen  (add thêm 3 file xml trong anim)*/
        addEventsChapter4AnimationHoatHinhMinions()         /**Animation Hiệu ứng hoạt hình Minions (add thêm file drawable/chapter4_animation_minions_effect.xml)*/
        addEventsChapter4PROJECTAnimationGameBanBong()      /**PROJECT CHƯƠNG 4: MENU, CONTROL SEARCH AND ANIMATION -> GAME BẮN BÓNG*/

    }
    /**Option Menu (add thêm file menu/chapter4_menu_main.xml)*/
    var txtMenuColor: TextView?=null
    private fun     /*Option Menu - Control for control on GUI)*/                   addControlChapter4OptionMenu() {
        txtMenuColor=findViewById(R.id.txtMenuColor)
    }
    private fun     /*Option Menu - Control for Option menu*/                       addControlChapter4OnOptionsItemSelectedOptionMenu(inflater: MenuInflater, menu: Menu?){
        inflater.inflate(R.menu.chapter4_menu_main,menu)     /*nạp file chapter4_contextmenu_main.xml lên bộ nhớ của mobile*/
    }
    override fun    /*Option Menu - Event (xử lý sự kiện Option Menu)*/             onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId==R.id.mnuBlue)  txtMenuColor!!.setBackgroundColor(Color.BLUE)   /*MenuItem item: item ta đang chọn. Nếu menu nhiều quá thì dùng switch*/
        if (item.itemId==R.id.mnuRed)  txtMenuColor!!.setBackgroundColor(Color.RED)
        if (item.itemId==R.id.mnuGreen)  txtMenuColor!!.setBackgroundColor(Color.GREEN)
        if (item.itemId==R.id.mnuYellow)  txtMenuColor!!.setBackgroundColor(Color.YELLOW)
        return super.onOptionsItemSelected(item)
    }
    /**Context Menu (add thêm file menu/chapter4_contextmenu_main.xml)*/
    var btnPaulContextMenu: Button?=null; var btnDucContextMenu: Button?=null;        /*ContextMenu đc chia sẻ cho nhiều control, vậy biết controls nào đang chọn?*/
    var btnLongContextMenu: Button?=null; var btnHamiltonContextMenu: Button?=null;   /*nhiệm vụ của btnlastedSelected là lưu lại control cuối cùng đang chọn */
    var btnWest1stContextMenu: Button?=null; var btnlastedSelected: Button?=null;         /*để tương tác với CONTEXT MENU*/
    private fun     /*Context Menu - Control*/                                      addControlChapter4ContextMenu() {
        btnPaulContextMenu=findViewById(R.id.btnPaulContextMenu)
        btnDucContextMenu=findViewById(R.id.btnDucContextMenu)
        btnLongContextMenu=findViewById(R.id.btnLongContextMenu)
        btnHamiltonContextMenu=findViewById(R.id.btnHamiltonContextMenu)
        btnWest1stContextMenu=findViewById(R.id.btnWest1stContextMenu)
        addControlChapter4ContextMenuRegisterForContextMenu()
    }
    private fun     /*Context Menu - Control (registerForContextMenu)*/             addControlChapter4ContextMenuRegisterForContextMenu() {
        registerForContextMenu(btnPaulContextMenu)
        registerForContextMenu(btnDucContextMenu)
        registerForContextMenu(btnLongContextMenu)
        registerForContextMenu(btnHamiltonContextMenu)
        registerForContextMenu(btnWest1stContextMenu)
    }
    override fun    /*Context Menu - Control for Context menu*/                     onCreateContextMenu(menu: ContextMenu?, v: View?, menuInfo: ContextMenu.ContextMenuInfo?){
        var inflater: MenuInflater =menuInflater
        inflater.inflate(R.menu.chapter4_contextmenu_main,menu)     /*nạp file contextmenu_main.xml lên bộ nhớ của mobile*/
        super.onCreateContextMenu(menu, v, menuInfo)
    }
    private fun     /*Context Menu - Event (xử lý sự kiện cho các Controls)*/       addEventsChapter4ContextMenu() {
        btnPaulContextMenu!!.setOnClickListener { view -> btnlastedSelected=btnPaulContextMenu }    /*các skiện này dùng để chia sẻ skiện ContextMenu (on click)*/
        btnDucContextMenu!!.setOnClickListener { view -> btnlastedSelected=btnDucContextMenu }
        btnLongContextMenu!!.setOnClickListener { view -> btnlastedSelected=btnLongContextMenu }
        btnHamiltonContextMenu!!.setOnClickListener { view -> btnlastedSelected=btnHamiltonContextMenu }
        btnWest1stContextMenu!!.setOnClickListener { view -> btnlastedSelected=btnWest1stContextMenu }
        btnPaulContextMenu!!.setOnLongClickListener { view -> btnlastedSelected=btnPaulContextMenu; false }/*share skiện ContextMenu (On Long Click)*/
        btnDucContextMenu!!.setOnLongClickListener { view -> btnlastedSelected=btnDucContextMenu; false }
        btnLongContextMenu!!.setOnLongClickListener { view -> btnlastedSelected=btnLongContextMenu; false }
        btnHamiltonContextMenu!!.setOnLongClickListener { view -> btnlastedSelected=btnHamiltonContextMenu; false }
        btnWest1stContextMenu!!.setOnLongClickListener { view -> btnlastedSelected=btnWest1stContextMenu; false }
    }
    override fun    /*Context Menu - Event (xử lý sự kiện cho Context Menu)*/       onContextItemSelected(item: MenuItem):Boolean {/*cả 5 controls dưới đều chia sẻ skiện*/
        if (item.itemId==R.id.mnuBold)              btnlastedSelected!!.setTypeface(null, Typeface.BOLD)
        else if (item.itemId==R.id.mnuItalic)       btnlastedSelected!!.setTypeface(null, Typeface.ITALIC)
        else if (item.itemId==R.id.mnuUnderline)    btnlastedSelected!!.paintFlags = btnlastedSelected!!.paintFlags or Paint.UNDERLINE_TEXT_FLAG
        else if (item.itemId==R.id.mnuRedWord)      btnlastedSelected!!.setTextColor(Color.RED)
        else if (item.itemId==R.id.mnuDeleteControl)btnlastedSelected!!.visibility= View.INVISIBLE
        return super.onContextItemSelected(item)
    }
    /**Menu Search View - Menu Điều khiển tìm kiếm (add thêm file menu/chapter4_menu_search_main.xml)*/
    var lvStateOfUSA: ListView?=null; var sourceListStateOfUSA:MutableList<String>?=null; var adapterStateOfUSA: ArrayAdapter<String>?=null
    private fun     /*Menu Search View - Control*/                                  addControlChapter4MenuSearchView() {
        lvStateOfUSA=findViewById(R.id.lvStateOfUSA)
        sourceListStateOfUSA= mutableListOf()
        sourceListStateOfUSA!!.addAll(resources.getStringArray(R.array.arrAutoCompleteTextViewAboutStateOfUSA))
        adapterStateOfUSA= ArrayAdapter(this@MainActivityChapter4567,android.R.layout.simple_list_item_1,sourceListStateOfUSA!!)
        lvStateOfUSA!!.adapter=adapterStateOfUSA
    }
    private fun     /*Menu Search View - Control for menu search view*/             addControlChapter4OnOptionsItemSelectedMenuSearchView(inflater: MenuInflater, menu: Menu?){
        inflater.inflate(R.menu.chapter4_menu_search_main,menu)
        var mnuSearch: MenuItem? = menu?.findItem(R.id.mnuSearch)
        var searchView: SearchView = mnuSearch?.actionView as SearchView
        addEventChapter4OnOptionsItemSelectedMenuSearchView(searchView)
    }
    private fun     /*Menu Search View - Events for menu search view*/              addEventChapter4OnOptionsItemSelectedMenuSearchView(searchView: SearchView) {
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String?): Boolean { return false }
            override fun onQueryTextChange(newText: String?): Boolean { adapterStateOfUSA?.filter?.filter(newText); return false }
        })
    }
    /**Animation Xoay Controls and Screen (add 3file trong anim: chapter4_xoaycontrolanimation.xml, chapter4_xoayscreenanimation.xml và chapter4_xoay3scloseanimation.xml)*/
    var btnXoayControlAnimation: Button?=null; var btnXoayScreenAnimation: Button?=null; var btnXoay3sCloseAnimation: Button?=null; var layoutScreenTab4: LinearLayout?=null
    private fun     /*Animation Xoay Controls and Screen - Controls*/               addControlChapter4AnimationXoayControlsAndScreen() {
        btnXoayControlAnimation=findViewById(R.id.btnXoayControlAnimation)
        btnXoayScreenAnimation=findViewById(R.id.btnXoayScreenAnimation)
        btnXoay3sCloseAnimation=findViewById(R.id.btnXoay3sCloseAnimation)
        layoutScreenTab4=findViewById(R.id.layoutScreenTab4)
    }
    private fun     /*Animation Xoay Controls and Screen - Events*/                 addEventsChapter4AnimationXoayControlsAndScreen() {
        btnXoayControlAnimation!!.setOnClickListener { view -> addEventsChapter4AnimationXoayControlAnimation() }
        btnXoayScreenAnimation!!.setOnClickListener { view -> addEventsChapter4AnimationXoayScreenAnimation() }
        btnXoay3sCloseAnimation!!.setOnClickListener { view -> addEventsChapter4AnimationXoay3sAfterThatClosingAnimation() }
    }
    private fun     /*Animation Xoay Controls and Screen - Events xoay control*/    addEventsChapter4AnimationXoayControlAnimation() {  /*khởi tạo animation, đsố 1: màn hình sử dụng animation này, đsố 2: id của animation mà ta đặt tên*/
        animation= AnimationUtils.loadAnimation(this@MainActivityChapter4567,R.anim.chapter4_xoaycontrolanimation)
        btnXoayControlAnimation!!.startAnimation(animation)
    }
    private fun     /*Animation Xoay Controls and Screen - Events xoay screen*/     addEventsChapter4AnimationXoayScreenAnimation() {
        animation= AnimationUtils.loadAnimation(this@MainActivityChapter4567,R.anim.chapter4_xoayscreenanimation)
        layoutScreenTab4!!.startAnimation(animation)
    }
    private fun     /*Animation Xoay Controls and Screen - Events xoay 3s close*/   addEventsChapter4AnimationXoay3sAfterThatClosingAnimation() {
        animation= AnimationUtils.loadAnimation(this@MainActivityChapter4567,R.anim.chapter4_xoay3scloseanimation)
        btnXoay3sCloseAnimation!!.startAnimation(animation)
        addEventsChapter4AnimationXoay3sAfterThatClosingAnimationEventItself()
    }
    private fun     /*Animation Xoay Controls and Screen - Events xoay 3s close*/   addEventsChapter4AnimationXoay3sAfterThatClosingAnimationEventItself() {
        animation!!.setAnimationListener(object : Animation.AnimationListener{  /*ngay bản thân animation có sẵn event*/
            override fun onAnimationStart(animation: Animation?) {}             /*thông qua AnimationListener ta sẽ biết đc khi nào nó bắt đầu - kết thúc - lặp lại*/
            override fun onAnimationEnd(animation: Animation?) {finish()}       /*hiệu ứng kết thúc sẽ tắt fần mềm*/
            override fun onAnimationRepeat(animation: Animation?) {}
        })
    }
    /**Animation Hiệu ứng hoạt hình Minions (add thêm file drawable/chapter4_animation_minions_effect.xml)*/
    var animation: Animation?=null; var numberOfanimationDrawable:Int?=null          /*đánh dấu hình animation khi stop draw*/
    var btnStartAnimation: Button?=null; var btnStopAnimation: Button?=null; var imgAnimation: ImageView?=null; var animationDrawable: AnimationDrawable?=null
    private fun     /*Animation Hiệu ứng hoạt hình Minions - Controls*/             addControlChapter4AnimationHoatHinhMinions() {
        btnStartAnimation=findViewById(R.id.btnStartAnimation)
        btnStopAnimation=findViewById(R.id.btnStopAnimation)
        imgAnimation=findViewById(R.id.imgAnimation)
        imgAnimation!!.setBackgroundResource(R.drawable.chapter4_animation_minions_effect)  /*truyền file minions_effect.xml vào*/
        animationDrawable=imgAnimation!!.background as AnimationDrawable
    }
    private fun     /*Animation Hiệu ứng hoạt hình Minions - Events*/               addEventsChapter4AnimationHoatHinhMinions() {
        btnStartAnimation!!.setOnClickListener { view -> animationDrawable!!.start() }  /*màn hình chạy hiệu ứng hoạt hình. Bắt đầu chạy hiệu ứng hoạt hình*/
        btnStopAnimation!!.setOnClickListener { view -> animationDrawable!!.stop() }    /*màn hình dừng hiệu ứng hoạt hình. Stop chạy hiệu ứng hoạt hình*/
    }
    /**PROJECT CHƯƠNG 4: MENU, CONTROL SEARCH AND ANIMATION -> GAME BẮN BÓNG  (add thêm file animator/chapter4_project_game_ball_animation.xml)*/
    var scoreGameBallAnimation:Int=0; var rdGameBallAnimation: Random?=null
    var txtScoreGameBallAnimation: TextView?=null; var btnStartGameBallAnimation: Button?=null; var layoutGameBallAnimation: LinearLayout?=null
    var paramsGameBallAnimation: ViewGroup.LayoutParams?=null; var objectAnimatorGameBall: ObjectAnimator?=null   /*mục đích để truy xuất file game_ball_animation.xml*/
    private fun     /*PROJECT CHƯƠNG 4 -> GAME BẮN BÓNG (Controls)*/                addControlsChapter4PROJECTAnimationGameBanBong() {
        txtScoreGameBallAnimation=findViewById(R.id.txtScoreGameBallAnimation)
        btnStartGameBallAnimation=findViewById(R.id.btnScoreGameBallAnimation)
        layoutGameBallAnimation=findViewById(R.id.layoutGameBallAnimation)
        rdGameBallAnimation= Random
        paramsGameBallAnimation= ViewGroup.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT)/*code lạ(params config các control#)*/
    }
    private fun     /*PROJECT CHƯƠNG 4 -> GAME BẮN BÓNG (Events)*/                  addEventsChapter4PROJECTAnimationGameBanBong() {
        btnStartGameBallAnimation!!.setOnClickListener { view -> addEventsChapter4PROJECTAnimationGameBanBongPlayGame() }
    }
    private fun     /*PROJECT CHƯƠNG 4 -> GAME BẮN BÓNG (Events) -> Play Game*/     addEventsChapter4PROJECTAnimationGameBanBongPlayGame() {
        for(count in 0..rdGameBallAnimation!!.nextInt(5)){                                                /*xây dựng ngẫu nhiên rdGameBallAnimation=6 bóng chạy ra*/
            addEventsChapter4PROJECTAnimationGameBanBongPlayGameXuLy1BallProcessAmin()
        }
    }
    private fun     /*PROJECT CHƯƠNG 4 -> GAME BẮN BÓNG -> xử lý 1 trái bóng*/      addEventsChapter4PROJECTAnimationGameBanBongPlayGameXuLy1BallProcessAmin() {
        var imgBall: ImageView =addEventsChapter4PROJECTAnimationGameBanBongPlayGameGetImageViewGameBall()    /*vẽ 1 trái bóng*/
        imgBall.background=addEventsChapter4PROJECTAnimationGameBanBongPlayGameGetDrawableGameBall()        /*tự động lấy ngẫu nhiên 1 trái bóng*/
        objectAnimatorGameBall=addControlChapter4PROJECTAnimationGameBanBongPlayGamePutImgToView()          /*Đưa 1 trái bóng vẽ đc ra lên 1 view (LinearLayout)*/
        addControlChapter4PROJECTAnimationGameBanBongPlayGameSetItsEffect(imgBall)                          /* và set hiệu ứng cho nó*/
        addEventsChapter4PROJECTAnimationGameBanBongPlayGameGetScore(imgBall)       /*nếu bóng đang chạy lơ lửng trên màn hình, mà ta nhấn vào (tức là có điểm)*/
        addEventsChapter4PROJECTAnimationGameBanBongPlayGameGAMEOVER()              /*Xử lý GAME OVER*/
        objectAnimatorGameBall!!.start()
    }
    private fun                     /*vẽ 1 trái bóng*/                              addEventsChapter4PROJECTAnimationGameBanBongPlayGameGetImageViewGameBall(): ImageView {
        var img: ImageView = ImageView(this@MainActivityChapter4567)
        img.x=rdGameBallAnimation!!.nextInt(500).toFloat()
        return img
    }
    private fun         /*tự động lấy ngẫu nhiên 1 trái bóng*/                      addEventsChapter4PROJECTAnimationGameBanBongPlayGameGetDrawableGameBall(): Drawable?{
        var draw: Drawable?=null                                   /*tự động lấy ngẫu nhiên các trái bóng*/
        var getImg:Int=rdGameBallAnimation!!.nextInt(7)     /*hàm này chưa hiển thị lên zaodiện mà chỉ đ/dạng h/ảnh*/
        when(getImg){
            0 -> draw=resources.getDrawable(R.drawable.ball_001)
            1 -> draw=resources.getDrawable(R.drawable.ball_002)
            2 -> draw=resources.getDrawable(R.drawable.ball_003)
            3 -> draw=resources.getDrawable(R.drawable.ball_004)
            4 -> draw=resources.getDrawable(R.drawable.ball_005)
            5 -> draw=resources.getDrawable(R.drawable.ball_006)
            6 -> draw=resources.getDrawable(R.drawable.ball_007)
            7 -> draw=resources.getDrawable(R.drawable.ball_008)
            else -> draw=resources.getDrawable(R.drawable.ball_009)
        }
        return draw
    }
    private fun     /*Đưa 1 bóng lên 1 view, để lấy đc Animation từ file animator*/ addControlChapter4PROJECTAnimationGameBanBongPlayGamePutImgToView(): ObjectAnimator {
        return AnimatorInflater.loadAnimator(this@MainActivityChapter4567,R.animator.chapter4_project_game_ball_animation) as ObjectAnimator/*lưu vào objectAnimatorGameBall*/
    }
    private fun                 /* và set hiệu ứng cho nó*/                         addControlChapter4PROJECTAnimationGameBanBongPlayGameSetItsEffect(imgBall: ImageView){
        objectAnimatorGameBall!!.duration=rdGameBallAnimation!!.nextLong(3500)+7000   /*sau đó set ngẫu nhiên để hiệu ứng chạy lung tung*/
        objectAnimatorGameBall!!.target=imgBall         /*chỉnh sửa luôn Duration trong file animator để thay đổi time xuất hiện ball và gán hiệu ứng cho hình ảnh đó*/
        layoutGameBallAnimation!!.addView(imgBall,paramsGameBallAnimation)  /*khi một ball xhiện thì phải add vào view*/
    }
    private fun     /*nếu bóng đang lơ lửng trên màn hình, nhấn vào là có điểm*/    addEventsChapter4PROJECTAnimationGameBanBongPlayGameGetScore(imgBall: ImageView){
        imgBall!!.setOnClickListener { view -> layoutGameBallAnimation!!.removeView(view)                               /*-> có điểm thì remove layout đó đi*/
            txtScoreGameBallAnimation!!.text="Score: ${scoreGameBallAnimation++}"}   /* vào điểm tăng lên 1*/
    }
    private fun                 /*GAME OVER Processing*/                            addEventsChapter4PROJECTAnimationGameBanBongPlayGameGAMEOVER() {
        objectAnimatorGameBall!!.addListener(object: Animator.AnimatorListener{
            override fun onAnimationStart(animator: Animator?){}
            override fun onAnimationEnd(animator: Animator?){addEventsChapter4PROJECTAnimationGameBanBongPlayGameGAMEOVERAnimationEnd(animator)}
            override fun onAnimationCancel(animator: Animator?) {}
            override fun onAnimationRepeat(animator: Animator?) {}
        })
    }
    private fun         /*GAME OVER Processing - AnimationEnd*/                     addEventsChapter4PROJECTAnimationGameBanBongPlayGameGAMEOVERAnimationEnd(anim: Animator?){
        layoutGameBallAnimation!!.removeView((anim as ObjectAnimator).target as View)  /*GAMEOVER xóa layout*/
//        if(layoutGameBallAnimation!!.childCount !=1) {
//            scoreGameBallAnimation=0
//            txtScoreGameBallAnimation!!.text = "Score :$scoreGameBallAnimation. GAME OVER"
//        }
    }




    /**CHƯƠNG 5: ASYNCTASK - LẬP TRÌNH ĐA TIẾN TRÌNH TRONG ANDROID*/
    private fun addControlChapter5() {
        addControlChapter5LoadImagesFromInternet()      /**kỹ thuật lập trình đa tuyến với AsyncTask (loading hình ảnh từ Internet)--> user-permission manifest internet*/
        addControlChapter5PROJECTAlbums()               /**PROJECT CHƯƠNG 5: ASYNCTASK - LẬP TRÌNH ĐA TIẾN TRÌNH TRONG ANDROID -> XÂY DỰNG ALBUMS*/
    }
    private fun addEventsChapter5() {
        addEventChapter5LoadImagesFromInternet()        /**kỹ thuật lập trình đa tuyến với AsyncTask (loading hình ảnh từ Internet)--> user-permission manifest internet*/
        addEventChapter5PROJECTAlbums()                 /**PROJECT CHƯƠNG 5: ASYNCTASK - LẬP TRÌNH ĐA TIẾN TRÌNH TRONG ANDROID -> XÂY DỰNG ALBUMS*/
    }
    private fun dataBindingChapter5() {
        DrawButton.asyncTaskDrawButton=AsyncTaskDrawButton(this)        /**Vẽ zao diện thời zan thực (Vẽ button), add thêm AsyncTaskDrawButton*/
//        DataBindingUtil.setContentView<ActivityMainChapter4567Binding>(this@MainActivityChapter4567,R.layout.activity_main_chapter_4567).drawButtons=DrawButton.asyncTaskDrawButton
    }
    /**Vẽ zao diện thời zan thực (Vẽ button)*/
    object DrawButton{
        var asyncTaskDrawButton:AsyncTaskDrawButton?=null
    }
    /**kỹ thuật lập trình đa tuyến với AsyncTask (loading hình ảnh từ Internet)     -->     khai báo user-permission trong manifest cho phép connect to internet*/
    object LoadImgAndShowDialog{
        var imgLoadIMGAsyncTask: ImageView?=null
        var dialogAsyncTask: ProgressDialog?=null       /*trường hợp tải hình dùng ProgressDialog vì ko biết khi nào tải xong*/
    }
    var btnLoadIMGAsyncTask: Button?=null
    object LinkInternet{
        var asyncTask1:String="https://images.giaoducthoidai.vn/Uploaded/thuyvt/2019-10-31/ngoctrinh51572423107231301246873crop15724237122011649225014_VKNC.jpg"
        var asyncTask2:String="https://ilarge.lisimg.com/image/12008022/1118full-ngoc-trinh.jpg"
        var asyncTask3:String="https://iv1.lisimg.com/image/15729736/600full-ngoc-trinh.jpg"
        var asyncTask4:String="https://cdn.newsapi.com.au/image/v1/216a189802d1dfa5e0747e98e196851e"
        var asyncTask5:String="https://tidurdotcom.files.wordpress.com/2016/12/ngoc-trinh-khoe-ve-sexy-1resize-ngoisao-vn.jpg?w=580"
        var asyncTask6:String="https://i-giaitri.vnecdn.net/2019/04/20/ngoc-trinh-1-1555735592_680x0.jpeg"
        var asyncTask7:String="https://live.staticflickr.com/6202/6081929534_6bd75db84d_b.jpg"
    }
    var listImageAsyncTask:MutableList<String>?=null
    var rdImageAsyncTask: Random = Random  /*kỹ thuật lập trình đa tuyến với AsyncTask (loading hình ảnh từ Internet)*/
    private fun     /*Loading Images từ Internet - Controls*/                       addControlChapter5LoadImagesFromInternet(){
        btnLoadIMGAsyncTask=findViewById(R.id.btnLoadIMGAsyncTask)
        LoadImgAndShowDialog.imgLoadIMGAsyncTask=findViewById(R.id.imgLoadIMGAsyncTask)
        addControlChapter5LoadImagesFromInternetCallingDialogAsyncTask()
        addControlChapter5LoadImagesFromInternetAddLinkImageToList()
    }
    private fun     /*Loading Images từ Internet - Controls Calling ProgressDialog*/addControlChapter5LoadImagesFromInternetCallingDialogAsyncTask() {
        LoadImgAndShowDialog.dialogAsyncTask= ShowProgressDialog.Dialogs.showing(this@MainActivityChapter4567,"Images")
    }
    private fun     /*Loading Images từ Internet - Controls Add Link Image to List*/addControlChapter5LoadImagesFromInternetAddLinkImageToList() {
        listImageAsyncTask= mutableListOf()
        listImageAsyncTask!!.add(LinkInternet.asyncTask1);  listImageAsyncTask!!.add(LinkInternet.asyncTask2); listImageAsyncTask!!.add(LinkInternet.asyncTask3)
        listImageAsyncTask!!.add(LinkInternet.asyncTask4); listImageAsyncTask!!.add(LinkInternet.asyncTask5)
        listImageAsyncTask!!.add(LinkInternet.asyncTask6); listImageAsyncTask!!.add(LinkInternet.asyncTask7)
    }
    private fun     /*Loading Images từ Internet - Events*/                         addEventChapter5LoadImagesFromInternet(){
        btnLoadIMGAsyncTask!!.setOnClickListener { view -> addEventChapter5LoadImagesFromInternetXuLyLoadIMGAsyncTask() }
    }
    private fun     /*Loading Images từ Internet - Events (Calling AsyncTask)*/     addEventChapter5LoadImagesFromInternetXuLyLoadIMGAsyncTask() {
        var count:Int=rdImageAsyncTask!!.nextInt(6)                 /*lấy 7 đường link (7 hình) trên (chạy từ 0 -> 6)*/
        var loadImageAsyncTask: AsyncTaskControllers.LoadImageAsyncTask= AsyncTaskControllers.LoadImageAsyncTask(this@MainActivityChapter4567)
        loadImageAsyncTask.execute(listImageAsyncTask!!.get(count))       /*lấy ngẫu nhiên 1 trong 7 hình (link trên) ra    -->     loading hình ảnh từ internet*/
    }
    /**PROJECT CHƯƠNG 5: ASYNCTASK - LẬP TRÌNH ĐA TIẾN TRÌNH TRONG ANDROID -> XÂY DỰNG ALBUMS*/
    var chkAutoAlbumAsyncTask: CheckBox?=null; var btnFirstAlbumAsyncTask: ImageButton?=null; var btnLastAlbumAsyncTask: ImageButton?=null
    var btnNextAlbumAsyncTask: ImageButton?=null; var btnPreviousAlbumAsyncTask: ImageButton?=null; var btnGotoAlbumAsyncTask: ImageButton?=null
    var txtGotoAlbumAsyncTask: EditText?=null /*Ta phải có tập các hình ảnh của 1 album nào đó ->phải biết đc số lượng phầntử*/
    object LinkAlbums{
        var imgAlbumAsyncTask: ImageView?=null
        var dialogAsyncTaskAlbum: ProgressDialog?=null
    }                       /*-> lấy vị trí nào thì ta gán vị trí đó -> cần phải khai báo 1 biến để cho biết vị trí (currentPosition)*/
    var currentPosition:Int=0                    /*currentPosition  ->   biến để cho biết vị trí: auto làm thì ta sẽ cho biến này =0, chạy lên thì lấy hình first (số 0)*/
    var albumAsyncTask:MutableList<String>?=null /*Sau đó ta có 1 MutableList(chính là album). Khi ta làm thực tế ->sẽ có mô tả (hình của ai,tên hình,địa điểm,..)*/
    /*-> phải mô hình hóa trong lớp models (Mã album,tên album,tác zả,time,địa điểm,...)Trong case này ta chỉ lấy link hình thôi nên chỉ cần MutableList< String>.*/
    var timerAlbumAsyncTask: Timer?=null         /*cái này dùng để yêu cầu sau khoảng time ? thì phải làm TimerTask 1lần*/   /*Timer ra lệnh cho TimerTask,*/
    var timerTaskAlbumAsyncTask: TimerTask?=null /*làm công việc định zờ chạy đa tiến trình.*/    /*nhưng mà công việc đc timer ra lệnh thì lại nằm trong timerTask*/
    private fun     /*PROJECT Albums từ Internet - Controls*/                       addControlChapter5PROJECTAlbums(){
        LinkAlbums.imgAlbumAsyncTask=findViewById(R.id.imgAlbumAsyncTask)
        chkAutoAlbumAsyncTask=findViewById(R.id.chkAutoAlbumAsyncTask)
        btnFirstAlbumAsyncTask=findViewById(R.id.btnFirstAlbumAsyncTask)
        btnLastAlbumAsyncTask=findViewById(R.id.btnLastAlbumAsyncTask)
        btnNextAlbumAsyncTask=findViewById(R.id.btnNextAlbumAsyncTask)
        btnPreviousAlbumAsyncTask=findViewById(R.id.btnPreviousAlbumAsyncTask)
        btnGotoAlbumAsyncTask=findViewById(R.id.btnGotoAlbumAsyncTask)
        txtGotoAlbumAsyncTask=findViewById(R.id.txtGotoAlbumAsyncTask)
        addControlChapter5PROJECTAlbumsAddImageIntoAlbumCallingDialogAsyncTask()
        addControlChapter5PROJECTAlbumsAddImageIntoAlbum()                          /*album này sẽ thay đổi theo time và add hình vào album*/
        add_CONTROL_AND_EVENT_Chapter5PROJECTAlbumsCallingAsyncTask()    /*Gọi AsyncTask load hình*/
    }
    private fun     /*PROJECT Albums từ Internet - Controls Calling ProgressDialog*/addControlChapter5PROJECTAlbumsAddImageIntoAlbumCallingDialogAsyncTask() {
        LinkAlbums.dialogAsyncTaskAlbum= ShowProgressDialog.Dialogs.showing(this@MainActivityChapter4567,"Images")
    }
    private fun     /*PROJECT Albums từ Internet - Controls Add Link Image to List*/addControlChapter5PROJECTAlbumsAddImageIntoAlbum() {
        albumAsyncTask= mutableListOf()
        albumAsyncTask!!.add("https://cdn.haynhat.com/wp-content/uploads/2013/05/HAYNHAT.COM____8961598563478956537586jkafhjkfhadsklfjsfkj-1.jpg")
        albumAsyncTask!!.add("https://cdn.haynhat.com/wp-content/uploads/2013/05/HAYNHAT.COM____8961598563478956537586jkafhjkfhadsklfjsfkj-2.jpg")
        albumAsyncTask!!.add("https://cdn.haynhat.com/wp-content/uploads/2013/05/HAYNHAT.COM____8961598563478956537586jkafhjkfhadsklfjsfkj-3.jpg")
        albumAsyncTask!!.add("https://cdn.haynhat.com/wp-content/uploads/2013/05/HAYNHAT.COM____8961598563478956537586jkafhjkfhadsklfjsfkj-4.jpg")
        albumAsyncTask!!.add("https://cdn.haynhat.com/wp-content/uploads/2013/05/HAYNHAT.COM____8961598563478956537586jkafhjkfhadsklfjsfkj-5.jpg")
        albumAsyncTask!!.add("https://cdn.haynhat.com/wp-content/uploads/2013/05/HAYNHAT.COM____8961598563478956537586jkafhjkfhadsklfjsfkj-6.jpg")
        albumAsyncTask!!.add("https://cdn.haynhat.com/wp-content/uploads/2013/05/HAYNHAT.COM____8961598563478956537586jkafhjkfhadsklfjsfkj-7.jpg")
        albumAsyncTask!!.add("https://cdn.haynhat.com/wp-content/uploads/2013/05/HAYNHAT.COM____8961598563478956537586jkafhjkfhadsklfjsfkj-8.jpg")
        albumAsyncTask!!.add("https://cdn.haynhat.com/wp-content/uploads/2013/05/HAYNHAT.COM____8961598563478956537586jkafhjkfhadsklfjsfkj-9.jpg")
        albumAsyncTask!!.add("https://cdn.haynhat.com/wp-content/uploads/2013/05/HAYNHAT.COM____8961598563478956537586jkafhjkfhadsklfjsfkj-10.jpg")
        albumAsyncTask!!.add("https://cdn.haynhat.com/wp-content/uploads/2013/05/HAYNHAT.COM____8961598563478956537586jkafhjkfhadsklfjsfkj-11.jpg")
        albumAsyncTask!!.add("https://cdn.haynhat.com/wp-content/uploads/2013/05/HAYNHAT.COM____8961598563478956537586jkafhjkfhadsklfjsfkj-12.jpg")
        albumAsyncTask!!.add("https://genk.mediacdn.vn/DlBlzccccccccccccE5CT3hqq3xN9o/Image/2013/10/ok-IMG_0807-892fc.jpg")
        albumAsyncTask!!.add("https://genk.mediacdn.vn/DlBlzccccccccccccE5CT3hqq3xN9o/Image/2013/10/ok-IMG_0808-892fc.jpg")
        albumAsyncTask!!.add("https://genk.mediacdn.vn/DlBlzccccccccccccE5CT3hqq3xN9o/Image/2013/10/ok-IMG_0809-892fc.jpg")
        albumAsyncTask!!.add("https://genk.mediacdn.vn/DlBlzccccccccccccE5CT3hqq3xN9o/Image/2013/10/ok-IMG_0812-892fc.jpg")
        albumAsyncTask!!.add("https://genk.mediacdn.vn/DlBlzccccccccccccE5CT3hqq3xN9o/Image/2013/10/ok-IMG_0814-892fc.jpg")
        albumAsyncTask!!.add("https://genk.mediacdn.vn/DlBlzccccccccccccE5CT3hqq3xN9o/Image/2013/10/ok-IMG_0816-892fc.jpg")
        albumAsyncTask!!.add("https://genk.mediacdn.vn/DlBlzccccccccccccE5CT3hqq3xN9o/Image/2013/10/ok-IMG_0819-892fc.jpg")
        albumAsyncTask!!.add("https://genk.mediacdn.vn/DlBlzccccccccccccE5CT3hqq3xN9o/Image/2013/10/ok-IMG_0830-892fc.jpg")
        albumAsyncTask!!.add("https://media.ngoisao.vn/resize_580/news/2016/05/11/ngoc-trinh-style-nang-tien-caresize-ngoisao.vn.stamp2.jpg")
        albumAsyncTask!!.add("https://media.ngoisao.vn/resize_580/news/2016/05/11/ngoc-trinh-style-nang-tien-ca-1resize-ngoisao.vn.stamp2.jpg")
        albumAsyncTask!!.add("https://media.ngoisao.vn/resize_580/news/2016/05/11/ngoc-trinh-style-nang-tien-ca-2resize-ngoisao.vn.stamp2.jpg")
        albumAsyncTask!!.add("https://media.ngoisao.vn/resize_580/news/2016/05/11/ngoc-trinh-style-nang-tien-ca-3resize-ngoisao.vn.stamp2.jpg")
        albumAsyncTask!!.add("https://media.ngoisao.vn/resize_580/news/2016/05/11/ngoc-trinh-style-nang-tien-ca-4resize-ngoisao.vn.stamp2.jpg")
        albumAsyncTask!!.add("https://media.ngoisao.vn/resize_580/news/2016/05/11/ngoc-trinh-style-nang-tien-ca-6resize-ngoisao.vn.stamp2.jpg")
        albumAsyncTask!!.add("https://media.ngoisao.vn/resize_580/news/2016/05/11/ngoc-trinh-style-nang-tien-ca-8resize-ngoisao.vn.stamp2.jpg")
        albumAsyncTask!!.add("https://media.ngoisao.vn/resize_580/news/2016/05/11/ngoc-trinh-style-nang-tien-ca-12resize-ngoisao.vn.stamp2.jpg")
        albumAsyncTask!!.add("https://media.ngoisao.vn/resize_580/news/2016/05/11/ngoc-trinh-style-nang-tien-ca-13resize-ngoisao.vn.stamp2.jpg")
        albumAsyncTask!!.add("https://media.ngoisao.vn/resize_580/news/2016/05/11/ngoc-trinh-style-nang-tien-ca-14resize-ngoisao.vn.stamp2.jpg")
        albumAsyncTask!!.add("https://petrotimes.vn/stores/news_dataimages/thanhhuyen/102013/14/11/ngoc_trinh_oc_ngan.jpg")
        albumAsyncTask!!.add("https://petrotimes.vn/stores/news_dataimages/thanhhuyen/102013/14/11/1393050_379767425487411_1294407075_n.jpg")
        albumAsyncTask!!.add("https://ss-images.saostar.vn/w800/2019/08/30/5942162/ngtrinh1.jpg")
        albumAsyncTask!!.add("https://ss-images.saostar.vn/w800/2019/08/30/5942162/ngtrinh2.jpg")
        albumAsyncTask!!.add("https://media.ex-cdn.com/EXP/media.giadinhvietnam.com/files/news/2015/12/14/1498972149.jpg")
        albumAsyncTask!!.add("https://media.ex-cdn.com/EXP/media.giadinhvietnam.com/files/news/2015/12/14/1498972151.jpg")
        albumAsyncTask!!.add("https://media.ex-cdn.com/EXP/media.giadinhvietnam.com/files/news/2015/12/14/1498972153.jpg")
        albumAsyncTask!!.add("https://media.ex-cdn.com/EXP/media.giadinhvietnam.com/files/news/2015/12/14/1498972156.jpg")
        albumAsyncTask!!.add("https://media.ex-cdn.com/EXP/media.giadinhvietnam.com/files/news/2015/12/14/1498972158.jpg")
        albumAsyncTask!!.add("https://media.ex-cdn.com/EXP/media.giadinhvietnam.com/files/news/2015/12/14/1498972160.jpg")
        albumAsyncTask!!.add("https://i.vietgiaitri.com/2013/1/21/ngoc-trinh-lan-dau-dong-phim-da-khoe-than-tao-bao-931cf9.jpg")
        albumAsyncTask!!.add("https://i.vietgiaitri.com/2013/1/21/ngoc-trinh-lan-dau-dong-phim-da-khoe-than-tao-bao-84166e.jpg")
        albumAsyncTask!!.add("https://i.vietgiaitri.com/2013/1/21/ngoc-trinh-lan-dau-dong-phim-da-khoe-than-tao-bao-286f12.jpg")
        albumAsyncTask!!.add("https://i.vietgiaitri.com/2013/1/21/ngoc-trinh-lan-dau-dong-phim-da-khoe-than-tao-bao-f15d31.jpg")
        albumAsyncTask!!.add("https://i.vietgiaitri.com/2013/1/21/ngoc-trinh-lan-dau-dong-phim-da-khoe-than-tao-bao-c5a31b.jpg")
        albumAsyncTask!!.add("https://i.vietgiaitri.com/2013/1/21/ngoc-trinh-lan-dau-dong-phim-da-khoe-than-tao-bao-de809c.jpg")
        albumAsyncTask!!.add("https://i.vietgiaitri.com/2013/1/21/ngoc-trinh-lan-dau-dong-phim-da-khoe-than-tao-bao-15d021.jpg")
        albumAsyncTask!!.add("https://i.vietgiaitri.com/2013/1/21/ngoc-trinh-lan-dau-dong-phim-da-khoe-than-tao-bao-dc5d4e.jpg")
        albumAsyncTask!!.add("https://media-cdn.laodong.vn/Storage/NewsPortal/2019/3/6/660835/Photo-1-154168116972.jpg")
        albumAsyncTask!!.add("https://media-cdn.laodong.vn/Storage/newsportal/2019/3/6/660835/Bi-Vu-Khac-Tiep-Tiet.jpg")
        albumAsyncTask!!.add("https://media-cdn.laodong.vn/Storage/newsportal/2019/3/6/660835/Vu-Khac-Tiep-Bat-Ngo.jpg")
        albumAsyncTask!!.add("https://i0.wp.com/i1264.photobucket.com/albums/jj484/iamxeko/Ngoc-Trinh-Vietnam-Model-Uoneo-04.jpg")
        albumAsyncTask!!.add("https://i1.wp.com/i1264.photobucket.com/albums/jj484/iamxeko/Ngoc-Trinh-Vietnam-Model-Uoneo-05.jpg")
        albumAsyncTask!!.add("https://i2.wp.com/i1264.photobucket.com/albums/jj484/iamxeko/Ngoc-Trinh-Vietnam-Model-Uoneo-07.jpg")
        albumAsyncTask!!.add("https://i1.wp.com/i1264.photobucket.com/albums/jj484/iamxeko/Ngoc-Trinh-Vietnam-Model-Uoneo-08.jpg")
        albumAsyncTask!!.add("https://i1.wp.com/i1264.photobucket.com/albums/jj484/iamxeko/Ngoc-Trinh-Vietnam-Model-Uoneo-09.jpg")
        albumAsyncTask!!.add("https://i1.wp.com/i1264.photobucket.com/albums/jj484/iamxeko/Ngoc-Trinh-Vietnam-Model-Uoneo-10.jpg")
        albumAsyncTask!!.add("https://i0.wp.com/i1264.photobucket.com/albums/jj484/iamxeko/Ngoc-Trinh-Vietnam-Model-Uoneo-11.jpg")
        albumAsyncTask!!.add("https://i0.wp.com/i1264.photobucket.com/albums/jj484/iamxeko/Ngoc-Trinh-Vietnam-Model-Uoneo-12.jpg")
        albumAsyncTask!!.add("https://i2.wp.com/i1264.photobucket.com/albums/jj484/iamxeko/Ngoc-Trinh-Vietnam-Model-Uoneo-13.jpg")
        albumAsyncTask!!.add("https://i0.wp.com/i1264.photobucket.com/albums/jj484/iamxeko/Ngoc-Trinh-Vietnam-Model-Uoneo-14.jpg")
        albumAsyncTask!!.add("https://i0.wp.com/i1264.photobucket.com/albums/jj484/iamxeko/Ngoc-Trinh-Vietnam-Model-Uoneo-15.jpg")
        albumAsyncTask!!.add("https://i0.wp.com/i1264.photobucket.com/albums/jj484/iamxeko/Ngoc-Trinh-Vietnam-Model-Uoneo-16.jpg")
        albumAsyncTask!!.add("https://i0.wp.com/i1264.photobucket.com/albums/jj484/iamxeko/Ngoc-Trinh-Vietnam-Model-Uoneo-17.jpg")
        albumAsyncTask!!.add("https://i1.wp.com/i1264.photobucket.com/albums/jj484/iamxeko/Ngoc-Trinh-Vietnam-Model-Uoneo-18.jpg")
        albumAsyncTask!!.add("https://i0.wp.com/i1264.photobucket.com/albums/jj484/iamxeko/Ngoc-Trinh-Vietnam-Model-Uoneo-20.jpg")
        albumAsyncTask!!.add("https://i0.wp.com/i1264.photobucket.com/albums/jj484/iamxeko/Ngoc-Trinh-Vietnam-Model-Uoneo-21.jpg")
        albumAsyncTask!!.add("https://vcdn-ngoisao.vnecdn.net/2019/09/08/trinh-6556-1567903368.jpg")
        albumAsyncTask!!.add("https://ss-images.saostar.vn/wp1000/pc/1611019886023/ngoc-trinh-10.jpg")
        albumAsyncTask!!.add("https://ss-images.saostar.vn/wp1000/pc/1611019886023/ngoc-trinh-2.jpg")
        albumAsyncTask!!.add("https://ss-images.saostar.vn/wp1000/pc/1611019886023/ngoc-tronh-8.jpg")
        albumAsyncTask!!.add("https://ss-images.saostar.vn/wp1000/pc/1611019886023/ngoc-trinh-3.jpg")
        albumAsyncTask!!.add("https://ss-images.saostar.vn/wp1000/pc/1611019886023/ngoc-trinh-4.jpg")
        albumAsyncTask!!.add("https://ss-images.saostar.vn/wp1000/pc/1611019886023/ngoc-trinh-5.jpg")
        albumAsyncTask!!.add("https://ss-images.saostar.vn/wp1000/pc/1611019886023/ngoc-trinh-1.jpg")
        albumAsyncTask!!.add("https://ss-images.saostar.vn/wp1000/pc/1611019886023/ngoc-trinh-9.jpg")
    }
    private fun     /*PROJECT Albums - CONTROL AND EVENTS (Calling AsyncTask)*/     add_CONTROL_AND_EVENT_Chapter5PROJECTAlbumsCallingAsyncTask() {
        if (currentPosition==albumAsyncTask!!.size-1) currentPosition=-1
        var loadAlbumsAsyncTask: AsyncTaskControllers.LoadAlbumsAsyncTask= AsyncTaskControllers.LoadAlbumsAsyncTask(this@MainActivityChapter4567)
        loadAlbumsAsyncTask.execute(albumAsyncTask!![++currentPosition])      /*đưa vào hình tiếp theo (thứ currentPosition)*/
    }
    private fun     /*PROJECT Albums từ Internet - Events*/                         addEventChapter5PROJECTAlbums() {
        chkAutoAlbumAsyncTask!!.setOnCheckedChangeListener { buttonView, isChecked -> addEventChapter5PROJECTAlbumsDisplayAutoImage(isChecked) }
        btnNextAlbumAsyncTask!!.setOnClickListener { view -> addEventChapter5PROJECTAlbumsDisplayNextImage() }
        btnPreviousAlbumAsyncTask!!.setOnClickListener { view -> addEventChapter5PROJECTAlbumsDisplayPreviousImage() }
        btnLastAlbumAsyncTask!!.setOnClickListener { view -> addEventChapter5PROJECTAlbumsDisplayLastImage() }
        btnFirstAlbumAsyncTask!!.setOnClickListener { view -> addEventChapter5PROJECTAlbumsDisplayFirstImage() }
        btnGotoAlbumAsyncTask!!.setOnClickListener { view -> addEventChapter5PROJECTAlbumsDisplayGoToImage() }
    }
    private fun     /*PROJECT Albums từ Internet - Events-Checked (auto load img)*/ addEventChapter5PROJECTAlbumsDisplayAutoImage(checked: Boolean) {   /*Ta phải có tập các hình ảnh của 1 album nào đó -> ta phải biết đc số lượng phầntử*/
        if(checked){  /*-> lấy vịtrí nào thì gán vịtrí đó-> cần phải khai báo currentPosition để biết vịtrí. checked là 1biến để biết đc checked này có đc checked hay ko*/
            btnFirstAlbumAsyncTask!!.isEnabled=false     /*Mặc định là auto -> như vậy ta phải có 1 tiến trình để lấy zề.*/
            btnLastAlbumAsyncTask!!.isEnabled=false      /*nếu đc checked cho phép tự động thì ta ko cho phép nhấn nữa (ẩn các nút nhấn đi)*/
            btnPreviousAlbumAsyncTask!!.isEnabled=false
            btnNextAlbumAsyncTask!!.isEnabled=false
            btnGotoAlbumAsyncTask!!.isEnabled=false
            addEventChapter5PROJECTAlbumsDisplayAutoImageStartTimerTask()   /*start timer task - bắt đầu chạy hình*/
        }
        else{           /*nếu ko đc checked thì cho phép hiện các nút nhấn trở lại và ko cho phép auto chạy hình*/
            btnFirstAlbumAsyncTask!!.isEnabled=true
            btnLastAlbumAsyncTask!!.isEnabled=true
            btnPreviousAlbumAsyncTask!!.isEnabled=true
            btnNextAlbumAsyncTask!!.isEnabled=true
            btnGotoAlbumAsyncTask!!.isEnabled=true
            addEventChapter5PROJECTAlbumsDisplayAutoImageStopTimerTask()    /*stop timer task - ngừng tự động chạy hình*/
        }
    }
    private fun     /*PROJECT Albums từ Internet - Events-Checked(Start TimerTask)*/addEventChapter5PROJECTAlbumsDisplayAutoImageStartTimerTask() {
        timerTaskAlbumAsyncTask= object : TimerTask() {                          /*nó cũng là 1 đa tiến trình, nhưng đa tiến trình có thể định zờ*/
            override fun run() {                                                 /*ở đây muốn định zờ,lấy hình zề & hiển thị lên zao diện ->nó phải có tương tác zao diện*/
                runOnUiThread {                                                  /*do đó nó phải có thêm runOnUiThread (nghĩa là: cập nhật zao diện trong tiến trình)*/
                    add_CONTROL_AND_EVENT_Chapter5PROJECTAlbumsCallingAsyncTask()/*runOnUiThread   ->  cho phép ta vẽ hình đó trên zao diện trong tiến trình*/
                }   /*trong định zờ timerTask lại gọi 1 tiến trình khác. Tiến trình timerTask có khả năng chạy đa tiến trình định zờ, nhưng bản thân nó k tự động làm đc.*/
            }
        }
        addEventChapter5PROJECTAlbumsDisplayAutoImageStartTimerTaskShowing()    /*như vậy ta phải thông qua 1 timer định zờ cho nó*/
    }
    private fun     /*PROJECT Albums từ Internet - Events-Checked(Show TimerTask)*/ addEventChapter5PROJECTAlbumsDisplayAutoImageStartTimerTaskShowing() {
        timerAlbumAsyncTask= Timer()
        timerAlbumAsyncTask!!.schedule(timerTaskAlbumAsyncTask,0,3000)  /*đsố1: timerTask, đsố2: time chờ, đsố3: time để tự động lặp lại 1 lần (millisecond)*/
    }
    private fun     /*PROJECT Albums từ Internet - Events-Checked(Stop TimerTask)*/ addEventChapter5PROJECTAlbumsDisplayAutoImageStopTimerTask() {
        if (timerAlbumAsyncTask!=null) timerAlbumAsyncTask!!.cancel()   /*tắt timertask, ngừng tự động chạy hình*/
    }
    private fun     /*PROJECT Albums từ Internet - Events - Next Image*/            addEventChapter5PROJECTAlbumsDisplayNextImage() {
        add_CONTROL_AND_EVENT_Chapter5PROJECTAlbumsCallingAsyncTask()
    }
    private fun     /*PROJECT Albums từ Internet - Events - Previous Image*/        addEventChapter5PROJECTAlbumsDisplayPreviousImage() {
        currentPosition-=2
        if (currentPosition==-2) currentPosition=albumAsyncTask!!.size-2
        add_CONTROL_AND_EVENT_Chapter5PROJECTAlbumsCallingAsyncTask()
    }
    private fun     /*PROJECT Albums từ Internet - Events - Last Image*/            addEventChapter5PROJECTAlbumsDisplayLastImage() {
        currentPosition=albumAsyncTask!!.size-2
        add_CONTROL_AND_EVENT_Chapter5PROJECTAlbumsCallingAsyncTask()
    }
    private fun     /*PROJECT Albums từ Internet - Events - First Image*/           addEventChapter5PROJECTAlbumsDisplayFirstImage() {
        currentPosition=albumAsyncTask!!.size-1
        add_CONTROL_AND_EVENT_Chapter5PROJECTAlbumsCallingAsyncTask()
    }
    private fun     /*PROJECT Albums từ Internet - Events - Go to an Image*/        addEventChapter5PROJECTAlbumsDisplayGoToImage() {
        currentPosition=txtGotoAlbumAsyncTask!!.text.toString().toInt()-1
        if (currentPosition<-1) currentPosition=-1
        if (currentPosition>albumAsyncTask!!.size-2) currentPosition=albumAsyncTask!!.size-2
        add_CONTROL_AND_EVENT_Chapter5PROJECTAlbumsCallingAsyncTask()
    }




    /**CHƯƠNG 6: BROADCAST RECEIVER*/
    /*Nên đăng ký và hủy bỏ broadcast receiver trong ứng dụng ở đâu? -> nên đăng ký trong sự kiện onResume, và hủy bỏ trong sự kiện onPause, because:
    * Broadcast receiver sẽ đọc liên tục -> tốn pin, mà trong onresume thì mới cho phép tương tác với user, do đó nên lắng nghe trong onresume,
    * còn khi vào onpause thì user ko tương tác nữa, k tương tác nữa thì k lắng nghe -> do đó đký broadcast receiver trong onresume và hủy trong onpause
    * Chú ý: broadcast receiver khi đký bằng coding thì chỉ tồn tại với application thôi, tức là khi tắt ứng dụng thì broadcast receiver này cũng tắt luôn, cụ thể:*/
    private fun addControlChapter6(){
        addControlChapter6CheckInternetAndWifi()    /**Check Internet and Wifi --> Tự động lắng nghe Internet trong Device*/
        addControlChapter6Notification()            /**NOTIFICATION (tạo thư mục raw trong res và đưa file âm thanh cho Notifiaction Sound vào đó*/
    }
    private fun addEventsChapter6(){
        addEventsChapter6Notification()             /**NOTIFICATION (tạo thư mục raw trong res và đưa file âm thanh cho Notifiaction Sound vào đó*/
    }

    /**Check Internet and Wifi --> Tự động lắng nghe Internet trong Device (hỏi xem ứng dụng này có internet hay k?). Nếu có thì cho phép đăng nhập (Login)*/
    var btnLoginBroadcastReceiver: Button?=null      /*wifiReceiver là Cài đặt và sử dụng Receiver trong chương trình*/
    var wifiReceiver: BroadcastReceiver?=null        /*khai báo 1 BroadcastReceiver*/
    private fun     /*Check Internet & Wifi -> Controls*/                           addControlChapter6CheckInternetAndWifi() {
        btnLoginBroadcastReceiver=findViewById(R.id.btnLoginBroadcastReceiver)
        wifiReceiver= BroadcastController.Receiver.wifiReciver(this@MainActivityChapter4567,btnLoginBroadcastReceiver!!)    /*khaibáo 1 BroadcastReceiver*/
    }
    override fun    /*Events - Đký tự động lắngnghe trạng thái wifi trong onResume*/onResume() {   /*Nên đăng ký và gỡ bỏ broadcastreceiver ở đâu?: Đăng ký trong sự kiện onResume. Hủy trong sự kiện onPause. */
        super.onResume()        /*Tại vì broadcastreceiver sẽ đọc và lắng nghe liên tục -> tốn pin. => như vậy mới lắng nghe và hủy bỏ như trên*/
        registerReceiver(wifiReceiver, BroadcastController.Receiver.registerWifiReceiverOnResume())  /*Ra lệnh lắng nghe Broadcast (đsố1: Broadcast, đsố2: bộ lọc)*/
    }
    override fun    /*Events - Hủy tự động lắngnghe trạng thái wifi trong onResume*/onPause() {    /*BroadcastReceiver khi đăngký bằng coding chỉ tồntại cùng với Application (Nếu ứng dụng tắt thì BroadcastReceiver cũng tắt)*/
        super.onPause()
        if (wifiReceiver!=null) unregisterReceiver(wifiReceiver)    /*nếu internet đang còn? => bỏ lắng nghe (dẹp)*/
    }
    /**NOTIFICATION (tạo thư mục raw trong res và đưa file âm thanh cho Notifiaction Sound vào đó*/
    var btnCreateNotification: Button?=null; var btnCloseNotification: Button?=null; var notificationId:String="113"/*notificationId:mỗi thông báo có 1 mã (-> đặt đại 113)*/
    var mNotifyMgr: NotificationManager?=null                /*dùng để kích hoạt notification thông qua NotificationManager*/
    private fun     /*NOTIFICATION -> Controls*/                                    addControlChapter6Notification() {
        btnCreateNotification=findViewById(R.id.btnCreateNotification)
        btnCloseNotification=findViewById(R.id.btnCloseNotification)
    }
    private fun     /*NOTIFICATION -> Events*/                                      addEventsChapter6Notification() {
        btnCreateNotification!!.setOnClickListener { view -> addEventsChapter6CreateNotification() }
        btnCloseNotification!!.setOnClickListener { view -> addEventsChapter6CloseNotification() }
    }
    private fun     /*NOTIFICATION -> Events (Tạo và khởi động Notification)*/      addEventsChapter6CreateNotification() { /* Gets an instance of the NotificationManager service. Thông qua lệnh dưới để lấy Notification ra*/
        val resultIntent = Intent(this, Chapter6NotificationUpdateVersion::class.java) //tạo intent mở đến activity mới
//        val resultIntent = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com/"))  //tạo intent gọi đến 1 browser
        mNotifyMgr = applicationContext.getSystemService(NOTIFICATION_SERVICE) as NotificationManager   /*B7: Kích hoạt Notification thông qua NotificationManager*/
        NotificationController.ProcessNotificaion.createNotification(this@MainActivityChapter4567,
            resultIntent,
            "Có thông báo",
            "Mời bạn nhấn để cập nhật version",
            applicationContext.packageName,
            R.raw.tieng_thu_rung,
            getString(R.string.app_name),
            mNotifyMgr!!);
    }
    private fun     /*NOTIFICATION -> Events (đóng (clear) Notification)*/          addEventsChapter6CloseNotification() {
        mNotifyMgr=getSystemService(NOTIFICATION_SERVICE) as NotificationManager
        mNotifyMgr!!.cancel(notificationId.toInt())   /*gọi Notification và cancel đi, ngoài ra có lệnh: */    /*mNotifyMgr!!.cancelAll()*/   /*->xóa hết tất cả Notification*/
    }
    /**Định nghĩa BroadcastReceiver trong file Manifest -> Lắng nghe Internet nhưng đưa nó trở về dạng service -> k cần chạy phầnmềm lên vẫn hiểu -> các phầnmềm hack*/
    /*phần này tạo 1 file riêng trong chapter6BroadcastReceiver/BroadcastInManifest (đây là phần mềm chạy ngầm) -> cái này là chạy ngầm nên k cần zao diện (google đã bỏ)*/
    /**PROJECT CHƯƠNG 6: ĐỌC TRỘM TIN NHẮN THÔNG QUA BROADCAST RECEIVER (có đăng ký trong Manifest và xử lý trong .services.chapter6BroadcastReceiver.BroadcastReadSMS)*/




    /**CHƯƠNG 7: TƯƠNG TÁC WEBSERVICES (cấp quyền internet trong manifest và sử dụng đa tiến trình)*/
    private fun addControlChapter7(){
        addControlChapter7DungChung()               /**Variable dùng chung*/
        addControlChapter7KSoapApiDangCoSo()        /**Tương tác Webservice KSOAP API Dạng cơ sở (trả về SOAP PRIMITIVE DATA) (add thêm independencies và repositories) */
        addControlChapter7KSoapApiDangObject()      /**Tương tác Webservice KSOAP API Dạng đối tượng (trả về SOAP OBJECT DATA) (mở visual studio lên, tạo 1 web service)*/
        addControlChapter7KSoapApiDangListObject()  /**Tương tác Webservice KSOAP API Dạng list đối tượng (trả về SOAP LIST OBJECT DATA) (visual studio, tạo webservice)*/
        addControlChapter7JSONNguyenThuy()          /**Tương tác Webservice dạng JSON Nguyên thủy, ngoặc nhọn {}-> JSON Object; [] -> JSON Array*/
        addControlChapter7GSON()                    /**Tương tác Webservice dạng GSON, {}-> JSON Object (quản lý 1 đối tượng); [] -> JSON Array (quản lý tập đối tượng).*/
        addControlChapter7BankDONGA()               /**PROJECT CHƯƠNG 7: TƯƠNG TÁC WEBSERVICES -> Tỷ zá hối đoái ngân hàng Đông Á (JSON)*/
    }
    private fun addEventsChapter7(){
        addEventsChapter7KSoapApiDangCoSo()         /**Tương tác Webservice KSOAP API Dạng cơ sở (trả về SOAP PRIMITIVE DATA) (add thêm independencies và repositories) */
        addEventChapter7KSoapApiDangObject()        /**Tương tác Webservice KSOAP API Dạng đối tượng (trả về SOAP OBJECT DATA) (mở visual studio lên, tạo 1 web service)*/
        addEventChapter7KSoapApiDangListObject()    /**Tương tác Webservice KSOAP API Dạng list đối tượng (trả về SOAP LIST OBJECT DATA) (visual studio, tạo webservice)*/
        addEventChapter7GSON()                      /**Tương tác Webservice dạng GSON, {}-> JSON Object (quản lý 1 đối tượng); [] -> JSON Array (quản lý tập đối tượng).*/
    }

    /**Variable dùng chung*/
    object LoadGeneral { var progressDialogWebServer: ProgressDialog? =null}
    private fun     /*WEBSERVICES -> Controls phần dùng chung*/                     addControlChapter7DungChung() {
        LoadGeneral.progressDialogWebServer= ShowProgressWebserviceDialog.Dialogs.showing(this@MainActivityChapter4567, "Web service")
    }

    /**Tương tác Webservice KSOAP API Dạng cơ sở (trả về SOAP PRIMITIVE DATA) (add thêm thư viện independencies và repositories trong build.gradle.kts) */
    object LoadDoF{ var txtWebServiceKSOAPdoF: TextView?=null }
    var txtWebServiceKSOAPdoC: EditText?=null; var btnWebServiceKSOAPdoF: Button?=null;
    private fun     /*WEBSERVICES -> Controls KSOAP API Dạng cơ sở PRIMITIVE DATA*/ addControlChapter7KSoapApiDangCoSo() {
        txtWebServiceKSOAPdoC=findViewById(R.id.txtWebServiceKSOAPdoC)
        LoadDoF.txtWebServiceKSOAPdoF=findViewById(R.id.txtWebServiceKSOAPdoF)
        btnWebServiceKSOAPdoF=findViewById(R.id.btnWebServiceKSOAPdoF)
    }
    private fun     /*WEBSERVICES -> Events KSOAP API Dạng cơ sở PRIMITIVE DATA*/   addEventsChapter7KSoapApiDangCoSo() {
        btnWebServiceKSOAPdoF!!.setOnClickListener { view -> addEventsChapter7KSoapApiDangCoSoXuLyConvertFromDoCToDoF() }
    }
    private fun     /*WEBSERVICES -> Events KSOAP API Dạng cơ sở PRIMITIVE DATA*/   addEventsChapter7KSoapApiDangCoSoXuLyConvertFromDoCToDoF() {
        var celsius:String=txtWebServiceKSOAPdoC!!.text.toString() /*để làm đatiếntrình->ta nên fân nhóm ra: cấu hình (server,namespace,các method,các SOAP option,...)*/
        var doCToDoFTask= AsyncTaskWebServices.KsoapPrimitiveDataConvertCToFDegree()     /*-> tạo 1 class AsyncTaskWebServices để cấu hình các nhóm trên*/
        doCToDoFTask.execute(celsius)                                                   /* sau đó khi xử lý ta sẽ làm trong doInBackground ==> sử dụng đa tiến trình*/
    }
    /**Tương tác Webservice KSOAP API Dạng đối tượng (trả về SOAP OBJECT DATA) (mở visual studio lên, tạo 1 web service, file visual này là file web service)*/
    object LoadDetail{var txtWebServiceKSOAPDetail: TextView?=null}; var txtWebServiceKSOAPcodeContact: EditText?=null; var btnWebServiceKSOAPDetail: Button?=null
    private fun     /*WEBSERVICES -> Controls KSOAP API Dạng OBJECT DATA*/          addControlChapter7KSoapApiDangObject(){
        LoadDetail.txtWebServiceKSOAPDetail=findViewById(R.id.txtWebServiceKSOAPDetail)
        txtWebServiceKSOAPcodeContact=findViewById(R.id.txtWebServiceKSOAPcodeContact)
        btnWebServiceKSOAPDetail=findViewById(R.id.btnWebServiceKSOAPDetail)
    }
    private fun     /*WEBSERVICES -> Events KSOAP API Dạng OBJECT DATA*/            addEventChapter7KSoapApiDangObject(){
        btnWebServiceKSOAPDetail!!.setOnClickListener { view -> addEventChapter7KSoapApiDangObjectXuLyDisplayInformationDetailContact() }
    }
    private fun     /*WEBSERVICES -> Events KSOAP API Dạng OBJECT DATA*/            addEventChapter7KSoapApiDangObjectXuLyDisplayInformationDetailContact() {
        AsyncTaskWebServices.KsoapObjectDataDetailContactTask().execute(txtWebServiceKSOAPcodeContact!!.text.toString().toInt())
    }
    /**Tương tác Webservice KSOAP API Dạng list đối tượng (trả về SOAP LIST OBJECT DATA) (mở visual studio lên, tạo 1 web service)*/
    var btnWebServiceKSOAPListContact: Button?=null; var lvWebServiceKSOAPListContact: ListView?=null; var sourceWebServiceKSOAPListContact:MutableList<DanhBa>?=null
    object LoadListDetail{var adapterWebServiceKSOAPListContact: DanhBaAdapter?=null}
    private fun     /*WEBSERVICES -> Controls KSOAP API Dạng LIST OBJECT DATA*/     addControlChapter7KSoapApiDangListObject(){
        btnWebServiceKSOAPListContact=findViewById(R.id.btnWebServiceKSOAPListContact)
        lvWebServiceKSOAPListContact=findViewById(R.id.lvWebServiceKSOAPListContact)
        sourceWebServiceKSOAPListContact= mutableListOf()
        LoadListDetail.adapterWebServiceKSOAPListContact=
            DanhBaAdapter(this@MainActivityChapter4567, R.layout.item_chapter1237_lisview_advance,sourceWebServiceKSOAPListContact!!)
        lvWebServiceKSOAPListContact!!.adapter=LoadListDetail.adapterWebServiceKSOAPListContact
    }
    private fun     /*WEBSERVICES -> Events KSOAP API Dạng LIST OBJECT DATA*/       addEventChapter7KSoapApiDangListObject(){
        btnWebServiceKSOAPListContact!!.setOnClickListener { view -> AsyncTaskWebServices.KsoapListObjectDataDetailContactTask().execute() }  /*ko có đốisố truyền vào*/
    }
    /**Tương tác Webservice dạng JSON Nguyên thủy, ngoặc nhọn {}-> JSON Object (quản lý 1 đối tượng). Ngoặc vuông [] -> JSON Array (quản lý tập đối tượng).*/
    var lvWebServiceJSONListInforPerson: ListView?=null; var sourceListInformationPerson: MutableList<InforPerson>?=null;
    object LoadListJSONNguyenThuy{var adapterListInformationPerson: ArrayAdapter<InforPerson>?=null}
    private fun     /*WEBSERVICES -> Controls JSON Nguyên Thủy*/                    addControlChapter7JSONNguyenThuy(){
        lvWebServiceJSONListInforPerson=findViewById(R.id.lvWebServiceJSONListInforPerson)
        sourceListInformationPerson= mutableListOf()
        LoadListJSONNguyenThuy.adapterListInformationPerson= ArrayAdapter(this@MainActivityChapter4567, android.R.layout.simple_list_item_1,sourceListInformationPerson!!)
        lvWebServiceJSONListInforPerson!!.adapter=LoadListJSONNguyenThuy.adapterListInformationPerson
        addControlChapter7JSONNguyenThuyExcuse()
    }
    private fun     /*WEBSERVICES -> Controls JSON Nguyên Thủy Excuse*/             addControlChapter7JSONNguyenThuyExcuse() {
        AsyncTaskWebServices.JSONNguyenThuyListPersonTask().execute()
    }
    /**Tương tác Webservice dạng GSON, ngoặc nhọn {}-> JSON Object (quản lý 1 đối tượng). Ngoặc vuông [] -> JSON Array (quản lý tập đối tượng).*/
    var btnWebServiceGSONSearch: Button?=null; var lvWebServiceGSONSearch: ListView?=null;
    var sourceListContactsWebServiceGSONSearch:MutableList<Result>?=null;  var txtWebServiceGSONKeyWord: EditText?=null
    object LoadListGSON{var adapterListContactWebServiceGSONSearch: ArrayAdapter<Result>?=null}
    private fun     /*WEBSERVICES -> Controls GSON*/                                addControlChapter7GSON(){
        txtWebServiceGSONKeyWord=findViewById(R.id.txtWebServiceGSONKeyWord)
        btnWebServiceGSONSearch=findViewById(R.id.btnWebServiceGSONSearch)
        lvWebServiceGSONSearch=findViewById(R.id.lvWebServiceGSONSearch)
        sourceListContactsWebServiceGSONSearch= mutableListOf()
        LoadListGSON.adapterListContactWebServiceGSONSearch=
            ArrayAdapter(this@MainActivityChapter4567,android.R.layout.simple_list_item_1,sourceListContactsWebServiceGSONSearch!!)
        lvWebServiceGSONSearch!!.adapter=LoadListGSON.adapterListContactWebServiceGSONSearch
        addControlChapter7GSONExcuse()
    }
    private fun     /*WEBSERVICES -> Controls GSON Excuse*/                         addControlChapter7GSONExcuse() {
        AsyncTaskWebServices.GSONContactTask().execute("")
    }
    private fun     /*WEBSERVICES -> Event GSON Excuse*/                            addEventChapter7GSON(){
        btnWebServiceGSONSearch!!.setOnClickListener { view -> AsyncTaskWebServices.GSONContactTask().execute(txtWebServiceGSONKeyWord!!.text.toString()) }
    }
    /**PROJECT CHƯƠNG 7: TƯƠNG TÁC WEBSERVICES -> Tỷ zá hối đoái ngân hàng Đông Á (JSON) (có file model và adapter, xử lý trong package chapter7Webservice)*/
    var lvTyZaHoiDoaiNHDongA_JSON: ListView?=null; var sourceListTyZaHoiDoaiNHDongA_JSON:MutableList<TyZaDongA>?=null
    object LoadJSONDongA{var adapterTyZaHoiDoaiNHDongA_JSON: AdapterTyZaDongA?=null}
    private fun     /*PROJECT CHƯƠNG 7: WEBSERVICES -> Controls JSON DongABank*/    addControlChapter7BankDONGA(){
        lvTyZaHoiDoaiNHDongA_JSON=findViewById(R.id.lvTyZaHoiDoaiNHDongA_JSON)
        sourceListTyZaHoiDoaiNHDongA_JSON= mutableListOf()
        LoadJSONDongA.adapterTyZaHoiDoaiNHDongA_JSON=
            AdapterTyZaDongA(this@MainActivityChapter4567,R.layout.item_chapter7_tygiadonga,sourceListTyZaHoiDoaiNHDongA_JSON!!)
        lvTyZaHoiDoaiNHDongA_JSON!!.adapter=LoadJSONDongA.adapterTyZaHoiDoaiNHDongA_JSON
        addControlChapter7BankDONGAExcuse()
    }
    private fun     /*PROJECT CHƯƠNG 7: WEBSERVICES -> Controls JSON DongABank*/    addControlChapter7BankDONGAExcuse(){
        AsyncTaskWebServices.TyZaDongAJsonTask().execute()
    }
}