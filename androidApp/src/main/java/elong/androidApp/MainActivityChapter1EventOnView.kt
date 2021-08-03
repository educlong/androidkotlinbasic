package elong.androidApp

import android.annotation.SuppressLint
import android.app.DatePickerDialog
import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.databinding.DataBindingUtil
import elong.androidApp.databinding.ActivityMainChapter1Binding
import elong.modelView.MainActivityContact
import elong.modelView.PresenterData
import elong.modelView.mainActivityChapter1EventOnView.*
import elong.models.chapter1.Employees
import java.text.SimpleDateFormat
import java.util.*
import kotlin.reflect.typeOf
import kotlin.system.exitProcess

class MainActivityChapter1EventOnView<Data> : AppCompatActivity(), View.OnLongClickListener,
        MainActivityContact.View<Data>{// , MainActivityContact.View<Checkboxes> {
    var binding: ActivityMainChapter1Binding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_chapter1)
        binding=DataBindingUtil.setContentView(this@MainActivityChapter1EventOnView,R.layout.activity_main_chapter1)
        var presenter:PresenterData<Data> = PresenterData(this@MainActivityChapter1EventOnView)
        binding!!.presenter=presenter

        addControlsChapter1()
        addEventChapter1()
        dataBinding()
    }
    /**CHƯƠNG 1: VIEW VÀ XỬ LÝ SỰ KIỆN TRÊN VIEW*/
    private fun addControlsChapter1() {
        addControlChapter1ListViewBasicStringFile() /**ListView basic (Trường hợp này source là 1 mảng đc lấy trong strings.xml)*/
        addControlChapter1ListViewBasicArrayList()  /**ListView basic (Array List)*/
        addControlChapter1Spinner()                 /**Spinner (add thêm filemodel Employee)*/
        addControlChapter1AutoCompleteTextView()    /**AutoCompleteTextView*/
        addControlChapter1PROJECTKaraoke()          /**PROJECT CHƯƠNG 1: XỬ LÝ SỰ KIỆN TRÊN VIEW (add thêm 3 file MusicAdapter, model Music) và item_chapter1_3_music.xml*/
    }
    private fun addEventChapter1() {
        addEventChapter1ListViewBasicStringFile()   /**ListView basic (Trường hợp này source là 1 mảng đc lấy trong strings.xml)*/
        addEventChapter1ListViewBasicArrayList()    /**ListView basic (Array List)*/
        addEventChapter1Spinner()                   /**Spinner (add thêm filemodel Employee)*/
        addEventChapter1AutoCompleteTextView()      /**AutoCompleteTextView*/
    }

    var calculate:Calculate=Calculate(0,0)  /**Các công cụ xử lý sự kiện trên View*/
    private fun dataBinding() {
        binding!!.calculate=calculate
        var checkboxes:Checkboxes= Checkboxes()     /**CheckBox (add thêm file Checkboxes) và xử lý binding trong activity_main_chapter1*/
        binding!!.check=checkboxes
        var radioButtons:RadioButtons= RadioButtons()/**RadioButton and ImageView (add thêm file RadioButtons)*/
        binding!!.radiobutons=radioButtons
        var danhBas:DanhBas= DanhBas()              /**ListView advance (add thêm 3 file DanhBas, model DanhBa, DanhBasLvBinder) và item_chapter1237_lisview_advance.xml*/
        binding!!.danhbasInfor=danhBas
        var imgs:GvImages= GvImages()               /**GridView (add thêm 2 file GvImages, GvImagesBinder và item_chapter1_gridview.xml)*/
        binding!!.imgsInfor=imgs
        var dateTimePickers:DateTimePickers=DateTimePickers()   /**DatePicker and TimePicker (add thêm file DateTimePickers)*/
        binding!!.datetimes=dateTimePickers
        var musics:Musics=Musics()                  /**PROJECT CHƯƠNG 1: XỬ LÝ SỰ KIỆN TRÊN VIEW (add thêm 3 file Music, model Musics, MusicsBinder) và item_chapter1_3_music.xml*/
        binding!!.lvmusics=musics
    }
    override fun showData(data: Data) {
        if (data is String) Toast.makeText(this@MainActivityChapter1EventOnView, data, Toast.LENGTH_LONG).show()
    }


    override fun    /*Activity as Listener (biến màn hình có k/năng sinh skiện)*/   onLongClick(view:View):Boolean{        /*Button LONG CLICK*/
//        if (view.id == R.id.btnLongClick) btnLongClick!!.visibility = View.INVISIBLE
        return false
    }
    class           /*Explicit class Listener (tạo lớp độc lập có thể sinh skiện)*/ MyEventChapter1ViewAndEventOnView:View.OnClickListener,View.OnLongClickListener { //Button CLOSE
        override fun onClick(view: View) {
            if (view.id == R.id.btnExit) exitProcess(0);   //close program
        }
        override fun onLongClick(view: View): Boolean {
            return false
        }
    }
    fun             /*View Subclassing  (call this function on file XML)*/          addEventChapter1ViewAndEventOnViewXuLyChangeScreen(v: View?) {
        var btnNew: Button = object : androidx.appcompat.widget.AppCompatButton(this@MainActivityChapter1EventOnView) {
            override fun performClick(): Boolean {
                setContentView(R.layout.activity_main_chapter1)
                addControlsChapter1()
                addEventChapter1()
                return super.performClick()
            }
        }
        btnNew.text = "Back"
        btnNew.width = 100
        btnNew.height = 100
        setContentView(btnNew)
    }

    /**ListView basic (Trường hợp này source là 1 mảng đc lấy trong strings.xml)*/
    var lvDayOfWeek: ListView? = null; var sourceArrayDayOfWeek : Array<String>?=null; var adapterDayOfWeek: ArrayAdapter<String>?=null
    private fun     /*ListView basic (source là 1 Array đc lấy trong strings.xml)*/ addControlChapter1ListViewBasicStringFile(){
        lvDayOfWeek=findViewById(R.id.lvDayOfWeek)
        sourceArrayDayOfWeek=resources.getStringArray(R.array.sourceArrayDayOfWeek)
        adapterDayOfWeek = ArrayAdapter<String>(this@MainActivityChapter1EventOnView,android.R.layout.simple_list_item_1, sourceArrayDayOfWeek!!)
        lvDayOfWeek!!.adapter=adapterDayOfWeek
    }
    private fun     /*ListView basic (source là 1 Array đc lấy trong strings.xml)*/ addEventChapter1ListViewBasicStringFile(){
        lvDayOfWeek!!.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this@MainActivityChapter1EventOnView,"Đã chọn "+ sourceArrayDayOfWeek!![position],Toast.LENGTH_SHORT).show()
        }
    }

    /**ListView basic (Array List)*/
    var lvName: ListView?=null; var sourceArrayName: MutableList<String>? = null; var adapterName: ArrayAdapter<String>?=null
    var btnSave: Button? = null; var txtName: EditText? = null
    private fun     /*ListView basic (Array List)*/                                 addControlChapter1ListViewBasicArrayList(){
        btnSave = findViewById(R.id.btnSave)
        txtName = findViewById(R.id.txtName)
        lvName = findViewById(R.id.lvName)
        sourceArrayName=mutableListOf()
        adapterName=ArrayAdapter<String>(this@MainActivityChapter1EventOnView,android.R.layout.simple_list_item_1,sourceArrayName!!)
        lvName!!.adapter=adapterName
    }
    private fun     /*ListView basic (Array List)*/                                 addEventChapter1ListViewBasicArrayList(){
        btnSave!!.setOnClickListener { view -> addEventChapter1ListViewBasicArrayListDoSave() }
    }
    private fun     /*ListView basic (Array List)*/                                 addEventChapter1ListViewBasicArrayListDoSave() {
        var name: String = txtName!!.text.toString()
        sourceArrayName!!.add(name)         /*add new data*/
        adapterName!!.notifyDataSetChanged()  /*update listview*/
        txtName!!.setText("")
        txtName!!.requestFocus()
    }

    /**Spinner (add thêm filemodel Employee)*/
    var spDayOfWeek: Spinner? = null; var sourceSpinnerDayOfWeek:MutableList<String>?=null; var adapterSpinnerDayOfWeek: ArrayAdapter<String>?=null
    var lastedSpinnerSelected:Int=-1; var btnChooseSpinner: Button?=null; var txtNameSpinner: EditText?=null; var txtNumberBussinessEmployees: EditText?=null
    private fun     /*Spinner (add thêm filemodel Employee)*/                       addControlChapter1Spinner(){
        txtNameSpinner=findViewById(R.id.txtNameSpinner)
        txtNumberBussinessEmployees=findViewById(R.id.txtNumberBussinessEmployees)
        btnChooseSpinner=findViewById(R.id.btnChooseSpinner)
        spDayOfWeek = findViewById(R.id.spDayOfWeek)
        sourceSpinnerDayOfWeek=mutableListOf()
        sourceSpinnerDayOfWeek!!.add("Monday")
        sourceSpinnerDayOfWeek!!.add("Tuesday")
        sourceSpinnerDayOfWeek!!.add("Wednesday")
        sourceSpinnerDayOfWeek!!.add("Thursday")
        sourceSpinnerDayOfWeek!!.add("Friday")
        sourceSpinnerDayOfWeek!!.add("Saturday")
        sourceSpinnerDayOfWeek!!.add("Sunday")
        adapterSpinnerDayOfWeek=ArrayAdapter<String>(this@MainActivityChapter1EventOnView,android.R.layout.simple_spinner_item,sourceSpinnerDayOfWeek!!)
        adapterSpinnerDayOfWeek!!.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spDayOfWeek!!.adapter=adapterSpinnerDayOfWeek
    }
    private fun     /*Spinner (add thêm filemodel Employee)*/                       addEventChapter1Spinner(){
        spDayOfWeek!!.onItemSelectedListener=object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
//                Toast.makeText(this@MainActivityChapter1EventOnView,"Đã chọn "+sourceSpinnerDayOfWeek!!.get(position), Toast.LENGTH_SHORT).show()
                lastedSpinnerSelected=position   //đánh dấu đc vị trí đc chọn trong spinner
            }
            override fun onNothingSelected(parent: AdapterView<*>?) { }
        }
        btnChooseSpinner!!.setOnClickListener { view -> addEventChapter1SpinnerDoChooseSpinner() }
    }
    private fun     /*Spinner (add thêm filemodel Employee)*/                       addEventChapter1SpinnerDoChooseSpinner() {
        if(lastedSpinnerSelected==-1){
            Toast.makeText(this@MainActivityChapter1EventOnView,"Chưa chọn spinner ", Toast.LENGTH_SHORT).show()
            return
        }
        var employee: Employees = Employees(txtNameSpinner!!.text.toString(),
            sourceSpinnerDayOfWeek!![lastedSpinnerSelected],txtNumberBussinessEmployees!!.text.toString().toInt())
        Toast.makeText(this@MainActivityChapter1EventOnView, employee.toString(), Toast.LENGTH_SHORT).show()
    }

    /**AutoCompleteTextView*/
    var autoStateOfUSA: AutoCompleteTextView?=null; var sourceArrAutoStateOfUSA:Array<String>?=null; var adapterAutoStateOfUSA: ArrayAdapter<String>?=null
    private fun     /*AutoCompleteTextView*/                                        addControlChapter1AutoCompleteTextView(){
        autoStateOfUSA=findViewById(R.id.autoStateOfUSA)
        sourceArrAutoStateOfUSA=resources.getStringArray(R.array.arrAutoCompleteTextViewAboutStateOfUSA)
        adapterAutoStateOfUSA=ArrayAdapter(this@MainActivityChapter1EventOnView, android.R.layout.simple_list_item_1,sourceArrAutoStateOfUSA!!)
        autoStateOfUSA!!.setAdapter(adapterAutoStateOfUSA)
    }
    private fun     /*AutoCompleteTextView*/                                        addEventChapter1AutoCompleteTextView(){
        autoStateOfUSA!!.onItemSelectedListener=object:AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
//                Toast.makeText(this,"Đã chọn "+autoStateOfUSA!!.text.toString(), Toast.LENGTH_SHORT).show()
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {}
        }
    }

    /**PROJECT CHƯƠNG 1: XỬ LÝ SỰ KIỆN TRÊN VIEW (add thêm 3 file MusicAdapter, model Music) và item_chapter1_3_music.xml*/
    var tabHostMusic: TabHost?=null
    private fun     /*PROJECT CHƯƠNG 1: XỬ LÝ SỰ KIỆN TRÊN VIEW*/                   addControlChapter1PROJECTKaraoke() {
        tabHostMusic=findViewById(R.id.tabHostKaraoke)
        tabHostMusic!!.setup()
        var tabKaraokeList:TabHost.TabSpec=tabHostMusic!!.newTabSpec("tabListKara")
        var tabKaraokeLike:TabHost.TabSpec=tabHostMusic!!.newTabSpec("tabLikeKara")
        tabKaraokeList.setContent(R.id.tabViewKaraokeListSong)
        tabKaraokeLike.setContent(R.id.tabViewKaraokeLikeSong)
        tabKaraokeList.setIndicator("Song List")
        tabKaraokeLike.setIndicator("Song Like")
        tabHostMusic!!.addTab(tabKaraokeList)
        tabHostMusic!!.addTab(tabKaraokeLike)
    }

    /**Đa ngôn ngữ (xử lý trong file strings.xml)*/
}