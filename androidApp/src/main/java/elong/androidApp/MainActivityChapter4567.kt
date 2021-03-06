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
        addControlChapter4()    /**CH????NG 4: MENU, CONTROL SEARCH AND ANIMATION*/
        addControlChapter5()    /**CH????NG 5: ASYNCTASK - L???P TR??NH ??A TI???N TR??NH TRONG ANDROID*/
        addControlChapter6()    /**CH????NG 6: BROADCAST RECEIVER*/
        addControlChapter7()    /**CH????NG 7: T????NG T??C WEBSERVICES (c???p quy???n internet trong manifest v?? s??? d???ng ??a ti???n tr??nh)*/
    }
    private fun addEvents() {
        addEventsChapter4()     /**CH????NG 4: MENU, CONTROL SEARCH AND ANIMATION*/
        addEventsChapter5()     /**CH????NG 5: ASYNCTASK - L???P TR??NH ??A TI???N TR??NH TRONG ANDROID*/
        addEventsChapter6()     /**CH????NG 6: BROADCAST RECEIVER*/
        addEventsChapter7()     /**CH????NG 7: T????NG T??C WEBSERVICES (c???p quy???n internet trong manifest v?? s??? d???ng ??a ti???n tr??nh)*/
    }
    private fun dataBinding() {
//        binding=DataBindingUtil.setContentView(this@MainActivityChapter4567,R.layout.activity_main_chapter_4567)
        dataBindingChapter5()
    }

    /**CH????NG 4: MENU, CONTROL SEARCH AND ANIMATION*/
    /**Ph???n chung cho Option Menu v?? Menu Search View - Controls */
    override fun    /*Ph???n chung cho Option Menu v?? Menu Search View - Controls */  onCreateOptionsMenu(menu: Menu?): Boolean { /*B?????c 1: T???o file menu_main.xml.*/
        var inflater: MenuInflater =menuInflater                                      /*B?????c 2: g???i l???nh kh???i t???o menu t??? xml (l?? b?????c n??y)*/
        addControlChapter4OnOptionsItemSelectedOptionMenu(inflater, menu)           /*inflater n???p t??? file v???t l?? (menu_main.xml) l??n b??? nh??? c???a mobile*/
        addControlChapter4OnOptionsItemSelectedMenuSearchView(inflater, menu)
        return super.onCreateOptionsMenu(menu)
    }

    /**CH????NG 4: MENU, CONTROL SEARCH AND ANIMATION*/
    private fun addControlChapter4() {
        addControlChapter4OptionMenu()                      /**Option Menu (add th??m file menu/chapter4_menu_main.xml)*/
        addControlChapter4ContextMenu()                     /**Context Menu (add th??m file menu/chapter4_contextmenu_main.xml) */
        addControlChapter4MenuSearchView()                  /**Menu Search View (add th??m file menu/chapter4_menu_search_main.xml.xml)*/
        addControlChapter4AnimationXoayControlsAndScreen()  /**Animation Xoay Controls and Screen  (add th??m 3 file xml trong anim)*/
        addControlChapter4AnimationHoatHinhMinions()        /**Animation Hi???u ???ng ho???t h??nh Minions (add th??m file drawable/chapter4_animation_minions_effect.xml)*/
        addControlsChapter4PROJECTAnimationGameBanBong()    /**PROJECT CH????NG 4: MENU, CONTROL SEARCH AND ANIMATION -> GAME B???N B??NG*/
    }
    private fun addEventsChapter4() {
        addEventsChapter4ContextMenu()                      /**Context Menu (add th??m file menu/chapter4_contextmenu_main.xml) */
        addEventsChapter4AnimationXoayControlsAndScreen()   /**Animation Xoay Controls and Screen  (add th??m 3 file xml trong anim)*/
        addEventsChapter4AnimationHoatHinhMinions()         /**Animation Hi???u ???ng ho???t h??nh Minions (add th??m file drawable/chapter4_animation_minions_effect.xml)*/
        addEventsChapter4PROJECTAnimationGameBanBong()      /**PROJECT CH????NG 4: MENU, CONTROL SEARCH AND ANIMATION -> GAME B???N B??NG*/

    }
    /**Option Menu (add th??m file menu/chapter4_menu_main.xml)*/
    var txtMenuColor: TextView?=null
    private fun     /*Option Menu - Control for control on GUI)*/                   addControlChapter4OptionMenu() {
        txtMenuColor=findViewById(R.id.txtMenuColor)
    }
    private fun     /*Option Menu - Control for Option menu*/                       addControlChapter4OnOptionsItemSelectedOptionMenu(inflater: MenuInflater, menu: Menu?){
        inflater.inflate(R.menu.chapter4_menu_main,menu)     /*n???p file chapter4_contextmenu_main.xml l??n b??? nh??? c???a mobile*/
    }
    override fun    /*Option Menu - Event (x??? l?? s??? ki???n Option Menu)*/             onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId==R.id.mnuBlue)  txtMenuColor!!.setBackgroundColor(Color.BLUE)   /*MenuItem item: item ta ??ang ch???n. N???u menu nhi???u qu?? th?? d??ng switch*/
        if (item.itemId==R.id.mnuRed)  txtMenuColor!!.setBackgroundColor(Color.RED)
        if (item.itemId==R.id.mnuGreen)  txtMenuColor!!.setBackgroundColor(Color.GREEN)
        if (item.itemId==R.id.mnuYellow)  txtMenuColor!!.setBackgroundColor(Color.YELLOW)
        return super.onOptionsItemSelected(item)
    }
    /**Context Menu (add th??m file menu/chapter4_contextmenu_main.xml)*/
    var btnPaulContextMenu: Button?=null; var btnDucContextMenu: Button?=null;        /*ContextMenu ??c chia s??? cho nhi???u control, v???y bi???t controls n??o ??ang ch???n?*/
    var btnLongContextMenu: Button?=null; var btnHamiltonContextMenu: Button?=null;   /*nhi???m v??? c???a btnlastedSelected l?? l??u l???i control cu???i c??ng ??ang ch???n */
    var btnWest1stContextMenu: Button?=null; var btnlastedSelected: Button?=null;         /*????? t????ng t??c v???i CONTEXT MENU*/
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
        inflater.inflate(R.menu.chapter4_contextmenu_main,menu)     /*n???p file contextmenu_main.xml l??n b??? nh??? c???a mobile*/
        super.onCreateContextMenu(menu, v, menuInfo)
    }
    private fun     /*Context Menu - Event (x??? l?? s??? ki???n cho c??c Controls)*/       addEventsChapter4ContextMenu() {
        btnPaulContextMenu!!.setOnClickListener { view -> btnlastedSelected=btnPaulContextMenu }    /*c??c ski???n n??y d??ng ????? chia s??? ski???n ContextMenu (on click)*/
        btnDucContextMenu!!.setOnClickListener { view -> btnlastedSelected=btnDucContextMenu }
        btnLongContextMenu!!.setOnClickListener { view -> btnlastedSelected=btnLongContextMenu }
        btnHamiltonContextMenu!!.setOnClickListener { view -> btnlastedSelected=btnHamiltonContextMenu }
        btnWest1stContextMenu!!.setOnClickListener { view -> btnlastedSelected=btnWest1stContextMenu }
        btnPaulContextMenu!!.setOnLongClickListener { view -> btnlastedSelected=btnPaulContextMenu; false }/*share ski???n ContextMenu (On Long Click)*/
        btnDucContextMenu!!.setOnLongClickListener { view -> btnlastedSelected=btnDucContextMenu; false }
        btnLongContextMenu!!.setOnLongClickListener { view -> btnlastedSelected=btnLongContextMenu; false }
        btnHamiltonContextMenu!!.setOnLongClickListener { view -> btnlastedSelected=btnHamiltonContextMenu; false }
        btnWest1stContextMenu!!.setOnLongClickListener { view -> btnlastedSelected=btnWest1stContextMenu; false }
    }
    override fun    /*Context Menu - Event (x??? l?? s??? ki???n cho Context Menu)*/       onContextItemSelected(item: MenuItem):Boolean {/*c??? 5 controls d?????i ?????u chia s??? ski???n*/
        if (item.itemId==R.id.mnuBold)              btnlastedSelected!!.setTypeface(null, Typeface.BOLD)
        else if (item.itemId==R.id.mnuItalic)       btnlastedSelected!!.setTypeface(null, Typeface.ITALIC)
        else if (item.itemId==R.id.mnuUnderline)    btnlastedSelected!!.paintFlags = btnlastedSelected!!.paintFlags or Paint.UNDERLINE_TEXT_FLAG
        else if (item.itemId==R.id.mnuRedWord)      btnlastedSelected!!.setTextColor(Color.RED)
        else if (item.itemId==R.id.mnuDeleteControl)btnlastedSelected!!.visibility= View.INVISIBLE
        return super.onContextItemSelected(item)
    }
    /**Menu Search View - Menu ??i???u khi???n t??m ki???m (add th??m file menu/chapter4_menu_search_main.xml)*/
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
    /**Animation Xoay Controls and Screen (add 3file trong anim: chapter4_xoaycontrolanimation.xml, chapter4_xoayscreenanimation.xml v?? chapter4_xoay3scloseanimation.xml)*/
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
    private fun     /*Animation Xoay Controls and Screen - Events xoay control*/    addEventsChapter4AnimationXoayControlAnimation() {  /*kh???i t???o animation, ??s??? 1: m??n h??nh s??? d???ng animation n??y, ??s??? 2: id c???a animation m?? ta ?????t t??n*/
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
        animation!!.setAnimationListener(object : Animation.AnimationListener{  /*ngay b???n th??n animation c?? s???n event*/
            override fun onAnimationStart(animation: Animation?) {}             /*th??ng qua AnimationListener ta s??? bi???t ??c khi n??o n?? b???t ?????u - k???t th??c - l???p l???i*/
            override fun onAnimationEnd(animation: Animation?) {finish()}       /*hi???u ???ng k???t th??c s??? t???t f???n m???m*/
            override fun onAnimationRepeat(animation: Animation?) {}
        })
    }
    /**Animation Hi???u ???ng ho???t h??nh Minions (add th??m file drawable/chapter4_animation_minions_effect.xml)*/
    var animation: Animation?=null; var numberOfanimationDrawable:Int?=null          /*????nh d???u h??nh animation khi stop draw*/
    var btnStartAnimation: Button?=null; var btnStopAnimation: Button?=null; var imgAnimation: ImageView?=null; var animationDrawable: AnimationDrawable?=null
    private fun     /*Animation Hi???u ???ng ho???t h??nh Minions - Controls*/             addControlChapter4AnimationHoatHinhMinions() {
        btnStartAnimation=findViewById(R.id.btnStartAnimation)
        btnStopAnimation=findViewById(R.id.btnStopAnimation)
        imgAnimation=findViewById(R.id.imgAnimation)
        imgAnimation!!.setBackgroundResource(R.drawable.chapter4_animation_minions_effect)  /*truy???n file minions_effect.xml v??o*/
        animationDrawable=imgAnimation!!.background as AnimationDrawable
    }
    private fun     /*Animation Hi???u ???ng ho???t h??nh Minions - Events*/               addEventsChapter4AnimationHoatHinhMinions() {
        btnStartAnimation!!.setOnClickListener { view -> animationDrawable!!.start() }  /*m??n h??nh ch???y hi???u ???ng ho???t h??nh. B???t ?????u ch???y hi???u ???ng ho???t h??nh*/
        btnStopAnimation!!.setOnClickListener { view -> animationDrawable!!.stop() }    /*m??n h??nh d???ng hi???u ???ng ho???t h??nh. Stop ch???y hi???u ???ng ho???t h??nh*/
    }
    /**PROJECT CH????NG 4: MENU, CONTROL SEARCH AND ANIMATION -> GAME B???N B??NG  (add th??m file animator/chapter4_project_game_ball_animation.xml)*/
    var scoreGameBallAnimation:Int=0; var rdGameBallAnimation: Random?=null
    var txtScoreGameBallAnimation: TextView?=null; var btnStartGameBallAnimation: Button?=null; var layoutGameBallAnimation: LinearLayout?=null
    var paramsGameBallAnimation: ViewGroup.LayoutParams?=null; var objectAnimatorGameBall: ObjectAnimator?=null   /*m???c ????ch ????? truy xu???t file game_ball_animation.xml*/
    private fun     /*PROJECT CH????NG 4 -> GAME B???N B??NG (Controls)*/                addControlsChapter4PROJECTAnimationGameBanBong() {
        txtScoreGameBallAnimation=findViewById(R.id.txtScoreGameBallAnimation)
        btnStartGameBallAnimation=findViewById(R.id.btnScoreGameBallAnimation)
        layoutGameBallAnimation=findViewById(R.id.layoutGameBallAnimation)
        rdGameBallAnimation= Random
        paramsGameBallAnimation= ViewGroup.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT)/*code l???(params config c??c control#)*/
    }
    private fun     /*PROJECT CH????NG 4 -> GAME B???N B??NG (Events)*/                  addEventsChapter4PROJECTAnimationGameBanBong() {
        btnStartGameBallAnimation!!.setOnClickListener { view -> addEventsChapter4PROJECTAnimationGameBanBongPlayGame() }
    }
    private fun     /*PROJECT CH????NG 4 -> GAME B???N B??NG (Events) -> Play Game*/     addEventsChapter4PROJECTAnimationGameBanBongPlayGame() {
        for(count in 0..rdGameBallAnimation!!.nextInt(5)){                                                /*x??y d???ng ng???u nhi??n rdGameBallAnimation=6 b??ng ch???y ra*/
            addEventsChapter4PROJECTAnimationGameBanBongPlayGameXuLy1BallProcessAmin()
        }
    }
    private fun     /*PROJECT CH????NG 4 -> GAME B???N B??NG -> x??? l?? 1 tr??i b??ng*/      addEventsChapter4PROJECTAnimationGameBanBongPlayGameXuLy1BallProcessAmin() {
        var imgBall: ImageView =addEventsChapter4PROJECTAnimationGameBanBongPlayGameGetImageViewGameBall()    /*v??? 1 tr??i b??ng*/
        imgBall.background=addEventsChapter4PROJECTAnimationGameBanBongPlayGameGetDrawableGameBall()        /*t??? ?????ng l???y ng???u nhi??n 1 tr??i b??ng*/
        objectAnimatorGameBall=addControlChapter4PROJECTAnimationGameBanBongPlayGamePutImgToView()          /*????a 1 tr??i b??ng v??? ??c ra l??n 1 view (LinearLayout)*/
        addControlChapter4PROJECTAnimationGameBanBongPlayGameSetItsEffect(imgBall)                          /* v?? set hi???u ???ng cho n??*/
        addEventsChapter4PROJECTAnimationGameBanBongPlayGameGetScore(imgBall)       /*n???u b??ng ??ang ch???y l?? l???ng tr??n m??n h??nh, m?? ta nh???n v??o (t???c l?? c?? ??i???m)*/
        addEventsChapter4PROJECTAnimationGameBanBongPlayGameGAMEOVER()              /*X??? l?? GAME OVER*/
        objectAnimatorGameBall!!.start()
    }
    private fun                     /*v??? 1 tr??i b??ng*/                              addEventsChapter4PROJECTAnimationGameBanBongPlayGameGetImageViewGameBall(): ImageView {
        var img: ImageView = ImageView(this@MainActivityChapter4567)
        img.x=rdGameBallAnimation!!.nextInt(500).toFloat()
        return img
    }
    private fun         /*t??? ?????ng l???y ng???u nhi??n 1 tr??i b??ng*/                      addEventsChapter4PROJECTAnimationGameBanBongPlayGameGetDrawableGameBall(): Drawable?{
        var draw: Drawable?=null                                   /*t??? ?????ng l???y ng???u nhi??n c??c tr??i b??ng*/
        var getImg:Int=rdGameBallAnimation!!.nextInt(7)     /*h??m n??y ch??a hi???n th??? l??n zaodi???n m?? ch??? ??/d???ng h/???nh*/
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
    private fun     /*????a 1 b??ng l??n 1 view, ????? l???y ??c Animation t??? file animator*/ addControlChapter4PROJECTAnimationGameBanBongPlayGamePutImgToView(): ObjectAnimator {
        return AnimatorInflater.loadAnimator(this@MainActivityChapter4567,R.animator.chapter4_project_game_ball_animation) as ObjectAnimator/*l??u v??o objectAnimatorGameBall*/
    }
    private fun                 /* v?? set hi???u ???ng cho n??*/                         addControlChapter4PROJECTAnimationGameBanBongPlayGameSetItsEffect(imgBall: ImageView){
        objectAnimatorGameBall!!.duration=rdGameBallAnimation!!.nextLong(3500)+7000   /*sau ???? set ng???u nhi??n ????? hi???u ???ng ch???y lung tung*/
        objectAnimatorGameBall!!.target=imgBall         /*ch???nh s???a lu??n Duration trong file animator ????? thay ?????i time xu???t hi???n ball v?? g??n hi???u ???ng cho h??nh ???nh ????*/
        layoutGameBallAnimation!!.addView(imgBall,paramsGameBallAnimation)  /*khi m???t ball xhi???n th?? ph???i add v??o view*/
    }
    private fun     /*n???u b??ng ??ang l?? l???ng tr??n m??n h??nh, nh???n v??o l?? c?? ??i???m*/    addEventsChapter4PROJECTAnimationGameBanBongPlayGameGetScore(imgBall: ImageView){
        imgBall!!.setOnClickListener { view -> layoutGameBallAnimation!!.removeView(view)                               /*-> c?? ??i???m th?? remove layout ???? ??i*/
            txtScoreGameBallAnimation!!.text="Score: ${scoreGameBallAnimation++}"}   /* v??o ??i???m t??ng l??n 1*/
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
        layoutGameBallAnimation!!.removeView((anim as ObjectAnimator).target as View)  /*GAMEOVER x??a layout*/
//        if(layoutGameBallAnimation!!.childCount !=1) {
//            scoreGameBallAnimation=0
//            txtScoreGameBallAnimation!!.text = "Score :$scoreGameBallAnimation. GAME OVER"
//        }
    }




    /**CH????NG 5: ASYNCTASK - L???P TR??NH ??A TI???N TR??NH TRONG ANDROID*/
    private fun addControlChapter5() {
        addControlChapter5LoadImagesFromInternet()      /**k??? thu???t l???p tr??nh ??a tuy???n v???i AsyncTask (loading h??nh ???nh t??? Internet)--> user-permission manifest internet*/
        addControlChapter5PROJECTAlbums()               /**PROJECT CH????NG 5: ASYNCTASK - L???P TR??NH ??A TI???N TR??NH TRONG ANDROID -> X??Y D???NG ALBUMS*/
    }
    private fun addEventsChapter5() {
        addEventChapter5LoadImagesFromInternet()        /**k??? thu???t l???p tr??nh ??a tuy???n v???i AsyncTask (loading h??nh ???nh t??? Internet)--> user-permission manifest internet*/
        addEventChapter5PROJECTAlbums()                 /**PROJECT CH????NG 5: ASYNCTASK - L???P TR??NH ??A TI???N TR??NH TRONG ANDROID -> X??Y D???NG ALBUMS*/
    }
    private fun dataBindingChapter5() {
        DrawButton.asyncTaskDrawButton=AsyncTaskDrawButton(this)        /**V??? zao di???n th???i zan th???c (V??? button), add th??m AsyncTaskDrawButton*/
//        DataBindingUtil.setContentView<ActivityMainChapter4567Binding>(this@MainActivityChapter4567,R.layout.activity_main_chapter_4567).drawButtons=DrawButton.asyncTaskDrawButton
    }
    /**V??? zao di???n th???i zan th???c (V??? button)*/
    object DrawButton{
        var asyncTaskDrawButton:AsyncTaskDrawButton?=null
    }
    /**k??? thu???t l???p tr??nh ??a tuy???n v???i AsyncTask (loading h??nh ???nh t??? Internet)     -->     khai b??o user-permission trong manifest cho ph??p connect to internet*/
    object LoadImgAndShowDialog{
        var imgLoadIMGAsyncTask: ImageView?=null
        var dialogAsyncTask: ProgressDialog?=null       /*tr?????ng h???p t???i h??nh d??ng ProgressDialog v?? ko bi???t khi n??o t???i xong*/
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
    var rdImageAsyncTask: Random = Random  /*k??? thu???t l???p tr??nh ??a tuy???n v???i AsyncTask (loading h??nh ???nh t??? Internet)*/
    private fun     /*Loading Images t??? Internet - Controls*/                       addControlChapter5LoadImagesFromInternet(){
        btnLoadIMGAsyncTask=findViewById(R.id.btnLoadIMGAsyncTask)
        LoadImgAndShowDialog.imgLoadIMGAsyncTask=findViewById(R.id.imgLoadIMGAsyncTask)
        addControlChapter5LoadImagesFromInternetCallingDialogAsyncTask()
        addControlChapter5LoadImagesFromInternetAddLinkImageToList()
    }
    private fun     /*Loading Images t??? Internet - Controls Calling ProgressDialog*/addControlChapter5LoadImagesFromInternetCallingDialogAsyncTask() {
        LoadImgAndShowDialog.dialogAsyncTask= ShowProgressDialog.Dialogs.showing(this@MainActivityChapter4567,"Images")
    }
    private fun     /*Loading Images t??? Internet - Controls Add Link Image to List*/addControlChapter5LoadImagesFromInternetAddLinkImageToList() {
        listImageAsyncTask= mutableListOf()
        listImageAsyncTask!!.add(LinkInternet.asyncTask1);  listImageAsyncTask!!.add(LinkInternet.asyncTask2); listImageAsyncTask!!.add(LinkInternet.asyncTask3)
        listImageAsyncTask!!.add(LinkInternet.asyncTask4); listImageAsyncTask!!.add(LinkInternet.asyncTask5)
        listImageAsyncTask!!.add(LinkInternet.asyncTask6); listImageAsyncTask!!.add(LinkInternet.asyncTask7)
    }
    private fun     /*Loading Images t??? Internet - Events*/                         addEventChapter5LoadImagesFromInternet(){
        btnLoadIMGAsyncTask!!.setOnClickListener { view -> addEventChapter5LoadImagesFromInternetXuLyLoadIMGAsyncTask() }
    }
    private fun     /*Loading Images t??? Internet - Events (Calling AsyncTask)*/     addEventChapter5LoadImagesFromInternetXuLyLoadIMGAsyncTask() {
        var count:Int=rdImageAsyncTask!!.nextInt(6)                 /*l???y 7 ???????ng link (7 h??nh) tr??n (ch???y t??? 0 -> 6)*/
        var loadImageAsyncTask: AsyncTaskControllers.LoadImageAsyncTask= AsyncTaskControllers.LoadImageAsyncTask(this@MainActivityChapter4567)
        loadImageAsyncTask.execute(listImageAsyncTask!!.get(count))       /*l???y ng???u nhi??n 1 trong 7 h??nh (link tr??n) ra    -->     loading h??nh ???nh t??? internet*/
    }
    /**PROJECT CH????NG 5: ASYNCTASK - L???P TR??NH ??A TI???N TR??NH TRONG ANDROID -> X??Y D???NG ALBUMS*/
    var chkAutoAlbumAsyncTask: CheckBox?=null; var btnFirstAlbumAsyncTask: ImageButton?=null; var btnLastAlbumAsyncTask: ImageButton?=null
    var btnNextAlbumAsyncTask: ImageButton?=null; var btnPreviousAlbumAsyncTask: ImageButton?=null; var btnGotoAlbumAsyncTask: ImageButton?=null
    var txtGotoAlbumAsyncTask: EditText?=null /*Ta ph???i c?? t???p c??c h??nh ???nh c???a 1 album n??o ???? ->ph???i bi???t ??c s??? l?????ng ph???nt???*/
    object LinkAlbums{
        var imgAlbumAsyncTask: ImageView?=null
        var dialogAsyncTaskAlbum: ProgressDialog?=null
    }                       /*-> l???y v??? tr?? n??o th?? ta g??n v??? tr?? ???? -> c???n ph???i khai b??o 1 bi???n ????? cho bi???t v??? tr?? (currentPosition)*/
    var currentPosition:Int=0                    /*currentPosition  ->   bi???n ????? cho bi???t v??? tr??: auto l??m th?? ta s??? cho bi???n n??y =0, ch???y l??n th?? l???y h??nh first (s??? 0)*/
    var albumAsyncTask:MutableList<String>?=null /*Sau ???? ta c?? 1 MutableList(ch??nh l?? album). Khi ta l??m th???c t??? ->s??? c?? m?? t??? (h??nh c???a ai,t??n h??nh,?????a ??i???m,..)*/
    /*-> ph???i m?? h??nh h??a trong l???p models (M?? album,t??n album,t??c z???,time,?????a ??i???m,...)Trong case n??y ta ch??? l???y link h??nh th??i n??n ch??? c???n MutableList< String>.*/
    var timerAlbumAsyncTask: Timer?=null         /*c??i n??y d??ng ????? y??u c???u sau kho???ng time ? th?? ph???i l??m TimerTask 1l???n*/   /*Timer ra l???nh cho TimerTask,*/
    var timerTaskAlbumAsyncTask: TimerTask?=null /*l??m c??ng vi???c ?????nh z??? ch???y ??a ti???n tr??nh.*/    /*nh??ng m?? c??ng vi???c ??c timer ra l???nh th?? l???i n???m trong timerTask*/
    private fun     /*PROJECT Albums t??? Internet - Controls*/                       addControlChapter5PROJECTAlbums(){
        LinkAlbums.imgAlbumAsyncTask=findViewById(R.id.imgAlbumAsyncTask)
        chkAutoAlbumAsyncTask=findViewById(R.id.chkAutoAlbumAsyncTask)
        btnFirstAlbumAsyncTask=findViewById(R.id.btnFirstAlbumAsyncTask)
        btnLastAlbumAsyncTask=findViewById(R.id.btnLastAlbumAsyncTask)
        btnNextAlbumAsyncTask=findViewById(R.id.btnNextAlbumAsyncTask)
        btnPreviousAlbumAsyncTask=findViewById(R.id.btnPreviousAlbumAsyncTask)
        btnGotoAlbumAsyncTask=findViewById(R.id.btnGotoAlbumAsyncTask)
        txtGotoAlbumAsyncTask=findViewById(R.id.txtGotoAlbumAsyncTask)
        addControlChapter5PROJECTAlbumsAddImageIntoAlbumCallingDialogAsyncTask()
        addControlChapter5PROJECTAlbumsAddImageIntoAlbum()                          /*album n??y s??? thay ?????i theo time v?? add h??nh v??o album*/
        add_CONTROL_AND_EVENT_Chapter5PROJECTAlbumsCallingAsyncTask()    /*G???i AsyncTask load h??nh*/
    }
    private fun     /*PROJECT Albums t??? Internet - Controls Calling ProgressDialog*/addControlChapter5PROJECTAlbumsAddImageIntoAlbumCallingDialogAsyncTask() {
        LinkAlbums.dialogAsyncTaskAlbum= ShowProgressDialog.Dialogs.showing(this@MainActivityChapter4567,"Images")
    }
    private fun     /*PROJECT Albums t??? Internet - Controls Add Link Image to List*/addControlChapter5PROJECTAlbumsAddImageIntoAlbum() {
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
        loadAlbumsAsyncTask.execute(albumAsyncTask!![++currentPosition])      /*????a v??o h??nh ti???p theo (th??? currentPosition)*/
    }
    private fun     /*PROJECT Albums t??? Internet - Events*/                         addEventChapter5PROJECTAlbums() {
        chkAutoAlbumAsyncTask!!.setOnCheckedChangeListener { buttonView, isChecked -> addEventChapter5PROJECTAlbumsDisplayAutoImage(isChecked) }
        btnNextAlbumAsyncTask!!.setOnClickListener { view -> addEventChapter5PROJECTAlbumsDisplayNextImage() }
        btnPreviousAlbumAsyncTask!!.setOnClickListener { view -> addEventChapter5PROJECTAlbumsDisplayPreviousImage() }
        btnLastAlbumAsyncTask!!.setOnClickListener { view -> addEventChapter5PROJECTAlbumsDisplayLastImage() }
        btnFirstAlbumAsyncTask!!.setOnClickListener { view -> addEventChapter5PROJECTAlbumsDisplayFirstImage() }
        btnGotoAlbumAsyncTask!!.setOnClickListener { view -> addEventChapter5PROJECTAlbumsDisplayGoToImage() }
    }
    private fun     /*PROJECT Albums t??? Internet - Events-Checked (auto load img)*/ addEventChapter5PROJECTAlbumsDisplayAutoImage(checked: Boolean) {   /*Ta ph???i c?? t???p c??c h??nh ???nh c???a 1 album n??o ???? -> ta ph???i bi???t ??c s??? l?????ng ph???nt???*/
        if(checked){  /*-> l???y v???tr?? n??o th?? g??n v???tr?? ????-> c???n ph???i khai b??o currentPosition ????? bi???t v???tr??. checked l?? 1bi???n ????? bi???t ??c checked n??y c?? ??c checked hay ko*/
            btnFirstAlbumAsyncTask!!.isEnabled=false     /*M???c ?????nh l?? auto -> nh?? v???y ta ph???i c?? 1 ti???n tr??nh ????? l???y z???.*/
            btnLastAlbumAsyncTask!!.isEnabled=false      /*n???u ??c checked cho ph??p t??? ?????ng th?? ta ko cho ph??p nh???n n???a (???n c??c n??t nh???n ??i)*/
            btnPreviousAlbumAsyncTask!!.isEnabled=false
            btnNextAlbumAsyncTask!!.isEnabled=false
            btnGotoAlbumAsyncTask!!.isEnabled=false
            addEventChapter5PROJECTAlbumsDisplayAutoImageStartTimerTask()   /*start timer task - b???t ?????u ch???y h??nh*/
        }
        else{           /*n???u ko ??c checked th?? cho ph??p hi???n c??c n??t nh???n tr??? l???i v?? ko cho ph??p auto ch???y h??nh*/
            btnFirstAlbumAsyncTask!!.isEnabled=true
            btnLastAlbumAsyncTask!!.isEnabled=true
            btnPreviousAlbumAsyncTask!!.isEnabled=true
            btnNextAlbumAsyncTask!!.isEnabled=true
            btnGotoAlbumAsyncTask!!.isEnabled=true
            addEventChapter5PROJECTAlbumsDisplayAutoImageStopTimerTask()    /*stop timer task - ng???ng t??? ?????ng ch???y h??nh*/
        }
    }
    private fun     /*PROJECT Albums t??? Internet - Events-Checked(Start TimerTask)*/addEventChapter5PROJECTAlbumsDisplayAutoImageStartTimerTask() {
        timerTaskAlbumAsyncTask= object : TimerTask() {                          /*n?? c??ng l?? 1 ??a ti???n tr??nh, nh??ng ??a ti???n tr??nh c?? th??? ?????nh z???*/
            override fun run() {                                                 /*??? ????y mu???n ?????nh z???,l???y h??nh z??? & hi???n th??? l??n zao di???n ->n?? ph???i c?? t????ng t??c zao di???n*/
                runOnUiThread {                                                  /*do ???? n?? ph???i c?? th??m runOnUiThread (ngh??a l??: c???p nh???t zao di???n trong ti???n tr??nh)*/
                    add_CONTROL_AND_EVENT_Chapter5PROJECTAlbumsCallingAsyncTask()/*runOnUiThread   ->  cho ph??p ta v??? h??nh ???? tr??n zao di???n trong ti???n tr??nh*/
                }   /*trong ?????nh z??? timerTask l???i g???i 1 ti???n tr??nh kh??c. Ti???n tr??nh timerTask c?? kh??? n??ng ch???y ??a ti???n tr??nh ?????nh z???, nh??ng b???n th??n n?? k t??? ?????ng l??m ??c.*/
            }
        }
        addEventChapter5PROJECTAlbumsDisplayAutoImageStartTimerTaskShowing()    /*nh?? v???y ta ph???i th??ng qua 1 timer ?????nh z??? cho n??*/
    }
    private fun     /*PROJECT Albums t??? Internet - Events-Checked(Show TimerTask)*/ addEventChapter5PROJECTAlbumsDisplayAutoImageStartTimerTaskShowing() {
        timerAlbumAsyncTask= Timer()
        timerAlbumAsyncTask!!.schedule(timerTaskAlbumAsyncTask,0,3000)  /*??s???1: timerTask, ??s???2: time ch???, ??s???3: time ????? t??? ?????ng l???p l???i 1 l???n (millisecond)*/
    }
    private fun     /*PROJECT Albums t??? Internet - Events-Checked(Stop TimerTask)*/ addEventChapter5PROJECTAlbumsDisplayAutoImageStopTimerTask() {
        if (timerAlbumAsyncTask!=null) timerAlbumAsyncTask!!.cancel()   /*t???t timertask, ng???ng t??? ?????ng ch???y h??nh*/
    }
    private fun     /*PROJECT Albums t??? Internet - Events - Next Image*/            addEventChapter5PROJECTAlbumsDisplayNextImage() {
        add_CONTROL_AND_EVENT_Chapter5PROJECTAlbumsCallingAsyncTask()
    }
    private fun     /*PROJECT Albums t??? Internet - Events - Previous Image*/        addEventChapter5PROJECTAlbumsDisplayPreviousImage() {
        currentPosition-=2
        if (currentPosition==-2) currentPosition=albumAsyncTask!!.size-2
        add_CONTROL_AND_EVENT_Chapter5PROJECTAlbumsCallingAsyncTask()
    }
    private fun     /*PROJECT Albums t??? Internet - Events - Last Image*/            addEventChapter5PROJECTAlbumsDisplayLastImage() {
        currentPosition=albumAsyncTask!!.size-2
        add_CONTROL_AND_EVENT_Chapter5PROJECTAlbumsCallingAsyncTask()
    }
    private fun     /*PROJECT Albums t??? Internet - Events - First Image*/           addEventChapter5PROJECTAlbumsDisplayFirstImage() {
        currentPosition=albumAsyncTask!!.size-1
        add_CONTROL_AND_EVENT_Chapter5PROJECTAlbumsCallingAsyncTask()
    }
    private fun     /*PROJECT Albums t??? Internet - Events - Go to an Image*/        addEventChapter5PROJECTAlbumsDisplayGoToImage() {
        currentPosition=txtGotoAlbumAsyncTask!!.text.toString().toInt()-1
        if (currentPosition<-1) currentPosition=-1
        if (currentPosition>albumAsyncTask!!.size-2) currentPosition=albumAsyncTask!!.size-2
        add_CONTROL_AND_EVENT_Chapter5PROJECTAlbumsCallingAsyncTask()
    }




    /**CH????NG 6: BROADCAST RECEIVER*/
    /*N??n ????ng k?? v?? h???y b??? broadcast receiver trong ???ng d???ng ??? ????u? -> n??n ????ng k?? trong s??? ki???n onResume, v?? h???y b??? trong s??? ki???n onPause, because:
    * Broadcast receiver s??? ?????c li??n t???c -> t???n pin, m?? trong onresume th?? m???i cho ph??p t????ng t??c v???i user, do ???? n??n l???ng nghe trong onresume,
    * c??n khi v??o onpause th?? user ko t????ng t??c n???a, k t????ng t??c n???a th?? k l???ng nghe -> do ???? ??k?? broadcast receiver trong onresume v?? h???y trong onpause
    * Ch?? ??: broadcast receiver khi ??k?? b???ng coding th?? ch??? t???n t???i v???i application th??i, t???c l?? khi t???t ???ng d???ng th?? broadcast receiver n??y c??ng t???t lu??n, c??? th???:*/
    private fun addControlChapter6(){
        addControlChapter6CheckInternetAndWifi()    /**Check Internet and Wifi --> T??? ?????ng l???ng nghe Internet trong Device*/
        addControlChapter6Notification()            /**NOTIFICATION (t???o th?? m???c raw trong res v?? ????a file ??m thanh cho Notifiaction Sound v??o ????*/
    }
    private fun addEventsChapter6(){
        addEventsChapter6Notification()             /**NOTIFICATION (t???o th?? m???c raw trong res v?? ????a file ??m thanh cho Notifiaction Sound v??o ????*/
    }

    /**Check Internet and Wifi --> T??? ?????ng l???ng nghe Internet trong Device (h???i xem ???ng d???ng n??y c?? internet hay k?). N???u c?? th?? cho ph??p ????ng nh???p (Login)*/
    var btnLoginBroadcastReceiver: Button?=null      /*wifiReceiver l?? C??i ?????t v?? s??? d???ng Receiver trong ch????ng tr??nh*/
    var wifiReceiver: BroadcastReceiver?=null        /*khai b??o 1 BroadcastReceiver*/
    private fun     /*Check Internet & Wifi -> Controls*/                           addControlChapter6CheckInternetAndWifi() {
        btnLoginBroadcastReceiver=findViewById(R.id.btnLoginBroadcastReceiver)
        wifiReceiver= BroadcastController.Receiver.wifiReciver(this@MainActivityChapter4567,btnLoginBroadcastReceiver!!)    /*khaib??o 1 BroadcastReceiver*/
    }
    override fun    /*Events - ??k?? t??? ?????ng l???ngnghe tr???ng th??i wifi trong onResume*/onResume() {   /*N??n ????ng k?? v?? g??? b??? broadcastreceiver ??? ????u?: ????ng k?? trong s??? ki???n onResume. H???y trong s??? ki???n onPause. */
        super.onResume()        /*T???i v?? broadcastreceiver s??? ?????c v?? l???ng nghe li??n t???c -> t???n pin. => nh?? v???y m???i l???ng nghe v?? h???y b??? nh?? tr??n*/
        registerReceiver(wifiReceiver, BroadcastController.Receiver.registerWifiReceiverOnResume())  /*Ra l???nh l???ng nghe Broadcast (??s???1: Broadcast, ??s???2: b??? l???c)*/
    }
    override fun    /*Events - H???y t??? ?????ng l???ngnghe tr???ng th??i wifi trong onResume*/onPause() {    /*BroadcastReceiver khi ????ngk?? b???ng coding ch??? t???nt???i c??ng v???i Application (N???u ???ng d???ng t???t th?? BroadcastReceiver c??ng t???t)*/
        super.onPause()
        if (wifiReceiver!=null) unregisterReceiver(wifiReceiver)    /*n???u internet ??ang c??n? => b??? l???ng nghe (d???p)*/
    }
    /**NOTIFICATION (t???o th?? m???c raw trong res v?? ????a file ??m thanh cho Notifiaction Sound v??o ????*/
    var btnCreateNotification: Button?=null; var btnCloseNotification: Button?=null; var notificationId:String="113"/*notificationId:m???i th??ng b??o c?? 1 m?? (-> ?????t ?????i 113)*/
    var mNotifyMgr: NotificationManager?=null                /*d??ng ????? k??ch ho???t notification th??ng qua NotificationManager*/
    private fun     /*NOTIFICATION -> Controls*/                                    addControlChapter6Notification() {
        btnCreateNotification=findViewById(R.id.btnCreateNotification)
        btnCloseNotification=findViewById(R.id.btnCloseNotification)
    }
    private fun     /*NOTIFICATION -> Events*/                                      addEventsChapter6Notification() {
        btnCreateNotification!!.setOnClickListener { view -> addEventsChapter6CreateNotification() }
        btnCloseNotification!!.setOnClickListener { view -> addEventsChapter6CloseNotification() }
    }
    private fun     /*NOTIFICATION -> Events (T???o v?? kh???i ?????ng Notification)*/      addEventsChapter6CreateNotification() { /* Gets an instance of the NotificationManager service. Th??ng qua l???nh d?????i ????? l???y Notification ra*/
        val resultIntent = Intent(this, Chapter6NotificationUpdateVersion::class.java) //t???o intent m??? ?????n activity m???i
//        val resultIntent = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com/"))  //t???o intent g???i ?????n 1 browser
        mNotifyMgr = applicationContext.getSystemService(NOTIFICATION_SERVICE) as NotificationManager   /*B7: K??ch ho???t Notification th??ng qua NotificationManager*/
        NotificationController.ProcessNotificaion.createNotification(this@MainActivityChapter4567,
            resultIntent,
            "C?? th??ng b??o",
            "M???i b???n nh???n ????? c???p nh???t version",
            applicationContext.packageName,
            R.raw.tieng_thu_rung,
            getString(R.string.app_name),
            mNotifyMgr!!);
    }
    private fun     /*NOTIFICATION -> Events (????ng (clear) Notification)*/          addEventsChapter6CloseNotification() {
        mNotifyMgr=getSystemService(NOTIFICATION_SERVICE) as NotificationManager
        mNotifyMgr!!.cancel(notificationId.toInt())   /*g???i Notification v?? cancel ??i, ngo??i ra c?? l???nh: */    /*mNotifyMgr!!.cancelAll()*/   /*->x??a h???t t???t c??? Notification*/
    }
    /**?????nh ngh??a BroadcastReceiver trong file Manifest -> L???ng nghe Internet nh??ng ????a n?? tr??? v??? d???ng service -> k c???n ch???y ph???nm???m l??n v???n hi???u -> c??c ph???nm???m hack*/
    /*ph???n n??y t???o 1 file ri??ng trong chapter6BroadcastReceiver/BroadcastInManifest (????y l?? ph???n m???m ch???y ng???m) -> c??i n??y l?? ch???y ng???m n??n k c???n zao di???n (google ???? b???)*/
    /**PROJECT CH????NG 6: ?????C TR???M TIN NH???N TH??NG QUA BROADCAST RECEIVER (c?? ????ng k?? trong Manifest v?? x??? l?? trong .services.chapter6BroadcastReceiver.BroadcastReadSMS)*/




    /**CH????NG 7: T????NG T??C WEBSERVICES (c???p quy???n internet trong manifest v?? s??? d???ng ??a ti???n tr??nh)*/
    private fun addControlChapter7(){
        addControlChapter7DungChung()               /**Variable d??ng chung*/
        addControlChapter7KSoapApiDangCoSo()        /**T????ng t??c Webservice KSOAP API D???ng c?? s??? (tr??? v??? SOAP PRIMITIVE DATA) (add th??m independencies v?? repositories) */
        addControlChapter7KSoapApiDangObject()      /**T????ng t??c Webservice KSOAP API D???ng ?????i t?????ng (tr??? v??? SOAP OBJECT DATA) (m??? visual studio l??n, t???o 1 web service)*/
        addControlChapter7KSoapApiDangListObject()  /**T????ng t??c Webservice KSOAP API D???ng list ?????i t?????ng (tr??? v??? SOAP LIST OBJECT DATA) (visual studio, t???o webservice)*/
        addControlChapter7JSONNguyenThuy()          /**T????ng t??c Webservice d???ng JSON Nguy??n th???y, ngo???c nh???n {}-> JSON Object; [] -> JSON Array*/
        addControlChapter7GSON()                    /**T????ng t??c Webservice d???ng GSON, {}-> JSON Object (qu???n l?? 1 ?????i t?????ng); [] -> JSON Array (qu???n l?? t???p ?????i t?????ng).*/
        addControlChapter7BankDONGA()               /**PROJECT CH????NG 7: T????NG T??C WEBSERVICES -> T??? z?? h???i ??o??i ng??n h??ng ????ng ?? (JSON)*/
    }
    private fun addEventsChapter7(){
        addEventsChapter7KSoapApiDangCoSo()         /**T????ng t??c Webservice KSOAP API D???ng c?? s??? (tr??? v??? SOAP PRIMITIVE DATA) (add th??m independencies v?? repositories) */
        addEventChapter7KSoapApiDangObject()        /**T????ng t??c Webservice KSOAP API D???ng ?????i t?????ng (tr??? v??? SOAP OBJECT DATA) (m??? visual studio l??n, t???o 1 web service)*/
        addEventChapter7KSoapApiDangListObject()    /**T????ng t??c Webservice KSOAP API D???ng list ?????i t?????ng (tr??? v??? SOAP LIST OBJECT DATA) (visual studio, t???o webservice)*/
        addEventChapter7GSON()                      /**T????ng t??c Webservice d???ng GSON, {}-> JSON Object (qu???n l?? 1 ?????i t?????ng); [] -> JSON Array (qu???n l?? t???p ?????i t?????ng).*/
    }

    /**Variable d??ng chung*/
    object LoadGeneral { var progressDialogWebServer: ProgressDialog? =null}
    private fun     /*WEBSERVICES -> Controls ph???n d??ng chung*/                     addControlChapter7DungChung() {
        LoadGeneral.progressDialogWebServer= ShowProgressWebserviceDialog.Dialogs.showing(this@MainActivityChapter4567, "Web service")
    }

    /**T????ng t??c Webservice KSOAP API D???ng c?? s??? (tr??? v??? SOAP PRIMITIVE DATA) (add th??m th?? vi???n independencies v?? repositories trong build.gradle.kts) */
    object LoadDoF{ var txtWebServiceKSOAPdoF: TextView?=null }
    var txtWebServiceKSOAPdoC: EditText?=null; var btnWebServiceKSOAPdoF: Button?=null;
    private fun     /*WEBSERVICES -> Controls KSOAP API D???ng c?? s??? PRIMITIVE DATA*/ addControlChapter7KSoapApiDangCoSo() {
        txtWebServiceKSOAPdoC=findViewById(R.id.txtWebServiceKSOAPdoC)
        LoadDoF.txtWebServiceKSOAPdoF=findViewById(R.id.txtWebServiceKSOAPdoF)
        btnWebServiceKSOAPdoF=findViewById(R.id.btnWebServiceKSOAPdoF)
    }
    private fun     /*WEBSERVICES -> Events KSOAP API D???ng c?? s??? PRIMITIVE DATA*/   addEventsChapter7KSoapApiDangCoSo() {
        btnWebServiceKSOAPdoF!!.setOnClickListener { view -> addEventsChapter7KSoapApiDangCoSoXuLyConvertFromDoCToDoF() }
    }
    private fun     /*WEBSERVICES -> Events KSOAP API D???ng c?? s??? PRIMITIVE DATA*/   addEventsChapter7KSoapApiDangCoSoXuLyConvertFromDoCToDoF() {
        var celsius:String=txtWebServiceKSOAPdoC!!.text.toString() /*????? l??m ??ati???ntr??nh->ta n??n f??n nh??m ra: c???u h??nh (server,namespace,c??c method,c??c SOAP option,...)*/
        var doCToDoFTask= AsyncTaskWebServices.KsoapPrimitiveDataConvertCToFDegree()     /*-> t???o 1 class AsyncTaskWebServices ????? c???u h??nh c??c nh??m tr??n*/
        doCToDoFTask.execute(celsius)                                                   /* sau ???? khi x??? l?? ta s??? l??m trong doInBackground ==> s??? d???ng ??a ti???n tr??nh*/
    }
    /**T????ng t??c Webservice KSOAP API D???ng ?????i t?????ng (tr??? v??? SOAP OBJECT DATA) (m??? visual studio l??n, t???o 1 web service, file visual n??y l?? file web service)*/
    object LoadDetail{var txtWebServiceKSOAPDetail: TextView?=null}; var txtWebServiceKSOAPcodeContact: EditText?=null; var btnWebServiceKSOAPDetail: Button?=null
    private fun     /*WEBSERVICES -> Controls KSOAP API D???ng OBJECT DATA*/          addControlChapter7KSoapApiDangObject(){
        LoadDetail.txtWebServiceKSOAPDetail=findViewById(R.id.txtWebServiceKSOAPDetail)
        txtWebServiceKSOAPcodeContact=findViewById(R.id.txtWebServiceKSOAPcodeContact)
        btnWebServiceKSOAPDetail=findViewById(R.id.btnWebServiceKSOAPDetail)
    }
    private fun     /*WEBSERVICES -> Events KSOAP API D???ng OBJECT DATA*/            addEventChapter7KSoapApiDangObject(){
        btnWebServiceKSOAPDetail!!.setOnClickListener { view -> addEventChapter7KSoapApiDangObjectXuLyDisplayInformationDetailContact() }
    }
    private fun     /*WEBSERVICES -> Events KSOAP API D???ng OBJECT DATA*/            addEventChapter7KSoapApiDangObjectXuLyDisplayInformationDetailContact() {
        AsyncTaskWebServices.KsoapObjectDataDetailContactTask().execute(txtWebServiceKSOAPcodeContact!!.text.toString().toInt())
    }
    /**T????ng t??c Webservice KSOAP API D???ng list ?????i t?????ng (tr??? v??? SOAP LIST OBJECT DATA) (m??? visual studio l??n, t???o 1 web service)*/
    var btnWebServiceKSOAPListContact: Button?=null; var lvWebServiceKSOAPListContact: ListView?=null; var sourceWebServiceKSOAPListContact:MutableList<DanhBa>?=null
    object LoadListDetail{var adapterWebServiceKSOAPListContact: DanhBaAdapter?=null}
    private fun     /*WEBSERVICES -> Controls KSOAP API D???ng LIST OBJECT DATA*/     addControlChapter7KSoapApiDangListObject(){
        btnWebServiceKSOAPListContact=findViewById(R.id.btnWebServiceKSOAPListContact)
        lvWebServiceKSOAPListContact=findViewById(R.id.lvWebServiceKSOAPListContact)
        sourceWebServiceKSOAPListContact= mutableListOf()
        LoadListDetail.adapterWebServiceKSOAPListContact=
            DanhBaAdapter(this@MainActivityChapter4567, R.layout.item_chapter1237_lisview_advance,sourceWebServiceKSOAPListContact!!)
        lvWebServiceKSOAPListContact!!.adapter=LoadListDetail.adapterWebServiceKSOAPListContact
    }
    private fun     /*WEBSERVICES -> Events KSOAP API D???ng LIST OBJECT DATA*/       addEventChapter7KSoapApiDangListObject(){
        btnWebServiceKSOAPListContact!!.setOnClickListener { view -> AsyncTaskWebServices.KsoapListObjectDataDetailContactTask().execute() }  /*ko c?? ?????is??? truy???n v??o*/
    }
    /**T????ng t??c Webservice d???ng JSON Nguy??n th???y, ngo???c nh???n {}-> JSON Object (qu???n l?? 1 ?????i t?????ng). Ngo???c vu??ng [] -> JSON Array (qu???n l?? t???p ?????i t?????ng).*/
    var lvWebServiceJSONListInforPerson: ListView?=null; var sourceListInformationPerson: MutableList<InforPerson>?=null;
    object LoadListJSONNguyenThuy{var adapterListInformationPerson: ArrayAdapter<InforPerson>?=null}
    private fun     /*WEBSERVICES -> Controls JSON Nguy??n Th???y*/                    addControlChapter7JSONNguyenThuy(){
        lvWebServiceJSONListInforPerson=findViewById(R.id.lvWebServiceJSONListInforPerson)
        sourceListInformationPerson= mutableListOf()
        LoadListJSONNguyenThuy.adapterListInformationPerson= ArrayAdapter(this@MainActivityChapter4567, android.R.layout.simple_list_item_1,sourceListInformationPerson!!)
        lvWebServiceJSONListInforPerson!!.adapter=LoadListJSONNguyenThuy.adapterListInformationPerson
        addControlChapter7JSONNguyenThuyExcuse()
    }
    private fun     /*WEBSERVICES -> Controls JSON Nguy??n Th???y Excuse*/             addControlChapter7JSONNguyenThuyExcuse() {
        AsyncTaskWebServices.JSONNguyenThuyListPersonTask().execute()
    }
    /**T????ng t??c Webservice d???ng GSON, ngo???c nh???n {}-> JSON Object (qu???n l?? 1 ?????i t?????ng). Ngo???c vu??ng [] -> JSON Array (qu???n l?? t???p ?????i t?????ng).*/
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
    /**PROJECT CH????NG 7: T????NG T??C WEBSERVICES -> T??? z?? h???i ??o??i ng??n h??ng ????ng ?? (JSON) (c?? file model v?? adapter, x??? l?? trong package chapter7Webservice)*/
    var lvTyZaHoiDoaiNHDongA_JSON: ListView?=null; var sourceListTyZaHoiDoaiNHDongA_JSON:MutableList<TyZaDongA>?=null
    object LoadJSONDongA{var adapterTyZaHoiDoaiNHDongA_JSON: AdapterTyZaDongA?=null}
    private fun     /*PROJECT CH????NG 7: WEBSERVICES -> Controls JSON DongABank*/    addControlChapter7BankDONGA(){
        lvTyZaHoiDoaiNHDongA_JSON=findViewById(R.id.lvTyZaHoiDoaiNHDongA_JSON)
        sourceListTyZaHoiDoaiNHDongA_JSON= mutableListOf()
        LoadJSONDongA.adapterTyZaHoiDoaiNHDongA_JSON=
            AdapterTyZaDongA(this@MainActivityChapter4567,R.layout.item_chapter7_tygiadonga,sourceListTyZaHoiDoaiNHDongA_JSON!!)
        lvTyZaHoiDoaiNHDongA_JSON!!.adapter=LoadJSONDongA.adapterTyZaHoiDoaiNHDongA_JSON
        addControlChapter7BankDONGAExcuse()
    }
    private fun     /*PROJECT CH????NG 7: WEBSERVICES -> Controls JSON DongABank*/    addControlChapter7BankDONGAExcuse(){
        AsyncTaskWebServices.TyZaDongAJsonTask().execute()
    }
}