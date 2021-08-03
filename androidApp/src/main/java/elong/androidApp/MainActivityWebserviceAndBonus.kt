package elong.androidApp

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.databinding.DataBindingUtil
import elong.androidApp.databinding.ActivityMainDataBindingDemoBinding
import elong.androidApp.services.diaglog.ShowAlertDialog
import elong.androidApp.services.webserviceBonus.AsyncTaskWebServiceCourse
import elong.modelView.MainActivityContact
import elong.modelView.PresenterData
import elong.modelView.mainActivityDataBindingDemo.TemperatureData
import elong.modelView.mainActivityDataBindingDemo.User

class MainActivityWebserviceAndBonus : AppCompatActivity(){//} , MainActivityContact.View<TemperatureData>/*implement thêm 1 View thuôc MainActivityContact để show Data*/{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_webservice_and_bonus)
//        dataBinding()
        addControlsWebServiceBonus()
        addEventsWebServiceBonus()
    }

    private fun addControlsWebServiceBonus() {
        addControlsWebServiceBonusDanhMuc()
        addControlsWebServiceBonusSanPham()
        addControlsWebServiceBonusVietcombank()
    }
    private fun addEventsWebServiceBonus() {
        addEventsWebServiceBonusDanhMuc()
        addEventsWebServiceBonusSanPham()
    }

    object LoadWebserviceDanhMuc {
        var txtTotalCategoriesWebserviceBonus:TextView?=null                    /*hiển thị tổng số danh mục*/
        var txtCategoryWebserviceBonus:TextView?=null                           /*hiển thị 1 danh mục cụ thể*/
        var sourceSpinnerCategoriesWebserviceBonus:MutableList<String>?=null    /*list danh sách danh mục đc lưu vào source*/
        var adapterSpinnerCategoriesWebserviceBonus:ArrayAdapter<String>?=null  /*adapter để hiển thị lên spinner danh sách danh mục*/
    }

    var btnDanhMucWebserviceBonus:Button?=null              /*sự kiện đếm tổng số danh mục và xuất ra 1 danh mục đc chọn*/
    var edtCodeDmWebserviceBonus:EditText?=null; var edtNameDmWebserviceBonus:EditText?=null    /*nhập mã và tên danh mục muốn insert/update hay delete*/
    var spinnerCategoriesWebserviceBonus:Spinner?=null;     /*source lưu trữ danh mục => tạo ra 1 list danh mục*/
    var lastedSpinnerCodeCategorySelected:String="-1"       /*lưu trữ vị trí spinnerDanhMục đc chọn*/
    var btnInsertUpdateDanhMucWebserviceBonus:Button?=null  /*sự kiện để insert/update 1 danh mục*/
    var btnDeleteDanhMucWebserviceBonus:Button?=null        /*sự kiện để delete 1 danh mục*/
    private fun addControlsWebServiceBonusDanhMuc() {
        /**count tổng số danh mục*/
        LoadWebserviceDanhMuc.txtTotalCategoriesWebserviceBonus=findViewById(R.id.txtTotalCategoriesWebserviceBonus)    /*hiển thị tổng số danh mục*/
        btnDanhMucWebserviceBonus=findViewById(R.id.btnDanhMucWebserviceBonus)         /*sự kiện đếm tổng số danh mục và xuất ra 1 danh mục đc chọn*/
        /**query 1 danh mục thông qua mã danh mục*/
        LoadWebserviceDanhMuc.txtCategoryWebserviceBonus=findViewById(R.id.txtCategoryWebserviceBonus)                 /*hiển thị 1 danh mục cụ thể*/
        /**query tất cả danh sách danh mục và đưa lên spinner*/
        spinnerCategoriesWebserviceBonus=findViewById(R.id.spinnerCategoriesWebserviceBonus)    /*source lưu trữ danh mục => tạo ra 1 list danh mục*/
        LoadWebserviceDanhMuc.sourceSpinnerCategoriesWebserviceBonus= mutableListOf()
        AsyncTaskWebServiceCourse.DanhMucsRestfulTask().execute()  /*tương tác webservice đổ dữ liệu danh sách danh mục từ server xuống client lên spinner*/
        LoadWebserviceDanhMuc.adapterSpinnerCategoriesWebserviceBonus=ArrayAdapter<String>(this@MainActivityWebserviceAndBonus,
            android.R.layout.simple_spinner_item,LoadWebserviceDanhMuc.sourceSpinnerCategoriesWebserviceBonus!!)   /*adapter đưa source lên spinner*/
        LoadWebserviceDanhMuc.adapterSpinnerCategoriesWebserviceBonus!!.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerCategoriesWebserviceBonus!!.adapter=LoadWebserviceDanhMuc.adapterSpinnerCategoriesWebserviceBonus          /*đưa adapter lên spinner*/
        /**insert/update 1 danh mục*/
        edtNameDmWebserviceBonus=findViewById(R.id.edtNameDmWebserviceBonus)            /*nhập mã và tên danh mục muốn insert/update hay delete*/
        edtCodeDmWebserviceBonus=findViewById(R.id.edtCodeDmWebserviceBonus)            /*nhập mã và tên danh mục muốn insert/update hay delete*/
        btnInsertUpdateDanhMucWebserviceBonus=findViewById(R.id.btnInsertUpdateDanhMucWebserviceBonus)    /*sự kiện để insert/update 1 danh mục*/
        /**delete 1 danh mục*/
        btnDeleteDanhMucWebserviceBonus=findViewById(R.id.btnDeleteDanhMucWebserviceBonus)                /*sự kiện để delete 1 danh mục*/
    }
    private fun addEventsWebServiceBonusDanhMuc() {
        spinnerCategoriesWebserviceBonus!!.onItemSelectedListener   /**query tất cả danh sách danh mục và đưa lên spinner*/ = object:AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                addEventsWebServiceBonusDanhMucProcessSpinnerCategories(parent,position)
            }override fun onNothingSelected(parent: AdapterView<*>?) { }
        }
        btnDanhMucWebserviceBonus!!.setOnClickListener              /**count tổng số danh mục và query 1 danh mục thông qua mã danh mục*/ {
            AsyncTaskWebServiceCourse.DanhMucTotalTask().execute()/*tương tác webservice đổ data tổng số sản phẩm vào txtTotalCategoriesWebserviceBonus*/
            if (lastedSpinnerCodeCategorySelected.toInt()>0)      /*nếu có chọn trên spinner danh mục => tương tác webservice đổ data info 1 Danh Mục cụ thể lên textview*/
                AsyncTaskWebServiceCourse.DanhMucDetailRestfulTask().execute(lastedSpinnerCodeCategorySelected)
        }
        btnInsertUpdateDanhMucWebserviceBonus!!.setOnClickListener  /**insert/update 1 danh mục*/   {
            if(edtCodeDmWebserviceBonus!!.text.toString().isEmpty() || edtNameDmWebserviceBonus!!.text.toString().isEmpty())
                return@setOnClickListener   /*nếu 1 trong 2 edittex này k có dữ liệu thì k đc add*/
            var arrDanhMuc:Array<String> = arrayOf(edtCodeDmWebserviceBonus!!.text.toString(),edtNameDmWebserviceBonus!!.text.toString())
            AsyncTaskWebServiceCourse.DanhMucInsertUpdateResfulTask().execute(*arrDanhMuc)    /*toán tử Spread*/ /*tương tác webservice insert/update 1 danh mục*/
            /*zải thích toán tử Spread: Khi gọi một hàm vararg (execute trên truyền vào là 1 mảng vararg),
            * => có thể truyền từng đối số một, ví dụ như asList (1, 2, 3)
            * hoặc, nếu đã có một mảng và muốn chuyển nội dung của nó vào hàm => sử dụng toán tử spread (tiền tố mảng bằng *):
            * Nó có thể được áp dụng cho một Mảng trước khi chuyển nó vào một hàm chấp nhận varargs.*/
            AsyncTaskWebServiceCourse.DanhMucsRestfulTask().execute()   /*sau khi add insert/update xong thì query gọi lại toàn bộ danh mục để cập nhật lên spinner*/
        }
        btnDeleteDanhMucWebserviceBonus!!.setOnClickListener        /**delete 1 danh mục*/  {
            addEventsWebServiceBonusDanhMucProcessDeleteCategories()
        }
    }
    /** lấy zá trị đc chọn trên spinner -> xử lý chuỗi để lấy mã danh mục ra (lastedSpinnerCodeCategorySelected) -> đưa mã danh mục đc chọn trên spinner vào editText
     *                                  -> xử lý chuỗi để lấy tên danh mục ra -> đưa tên danh mục đc chọn trên spinner vào editText
     * -> hiển thị zá trị đc chọn trên spinner lên textview chi tiết danh mục (txtCategoryWebserviceBonus)
     * -> arrSanPham lưu trữ 1 sản phẩm (lastedSpinnerCodeCategorySelected), zá SP fromPrice (edtPriceFromSpWebserviceBonus) và toPrice (edtPriceToSpWebserviceBonus)
     * -> gọi AsyncTask để đổ dữ liệu danh sách sản phẩm từ webservice lên spinner thông qua arrSanPham (lấy danh sách sản phẩm thuộc 1 mã danh mục và khoảng zá)*/
    private fun addEventsWebServiceBonusDanhMucProcessSpinnerCategories(parent: AdapterView<*>?, position: Int) {
        var valuePosition: String = parent?.getItemAtPosition(position).toString()                                           /*lấy zá trị đc chọn trên spinner*/
        lastedSpinnerCodeCategorySelected = valuePosition.substring(0, valuePosition.indexOf("-")).trim()           /*xử lý chuỗi để lấy mã danh mục ra*/
        edtCodeDmWebserviceBonus!!.setText(lastedSpinnerCodeCategorySelected)                              /*đưa mã danh mục đc chọn trên spinner vào editText*/
        edtNameDmWebserviceBonus!!.setText(valuePosition.substring(valuePosition.indexOf("-") + 1).trim())/*xử lý chuỗi để lấy tên danh mục ra*/
        LoadWebserviceDanhMuc.txtCategoryWebserviceBonus!!.text = valuePosition          /*hiển thị zá trị đc chọn trên spinner lên textview chi tiết danh mục*/
        arrSanPham = arrayOf(lastedSpinnerCodeCategorySelected,edtPriceFromSpWebserviceBonus!!.text.toString(),edtPriceToSpWebserviceBonus!!.text.toString())
        AsyncTaskWebServiceCourse.SanPhamsRestfulTask().execute(*arrSanPham)          /*tương tác webservice đổ data listSảnPhẩm thuộc 1 mãDanhMục lên spinner*/

    }
    private fun addEventsWebServiceBonusDanhMucProcessDeleteCategories() {  /*khi xóa thì phải show lên 1 dialog để hỏi user xác nhận xóa hay k, nếu yes thì cho xóa*/
        var builder=ShowAlertDialog.BuildAlert.showing(this@MainActivityWebserviceAndBonus,"Are you sure to delete DM[$lastedSpinnerCodeCategorySelected]?")
        builder.setPositiveButton("YES, certainly!", DialogInterface.OnClickListener { dialog, which ->         /*nếu có thì tiến hành xóa*/
            AsyncTaskWebServiceCourse.DanhMucDeleteResfulTask().execute(lastedSpinnerCodeCategorySelected)
            dialog.dismiss()
            AsyncTaskWebServiceCourse.DanhMucsRestfulTask().execute()   /*sau khi delete xong thì query gọi lại toàn bộ danh mục để cập nhật lên spinner*/
        })
        builder.setNegativeButton("No!", DialogInterface.OnClickListener { dialog, which -> dialog.dismiss() }) /*nếu k thì k cho xóa, k làm zì cả*/
        builder.create().show()
    }


    object LoadWebserviceSanPham {
        var txtTotalProductsWebserviceBonus:TextView?=null; var txtProductWebserviceBonus:TextView?=null    /*hiển thị tổng số sản phẩm và 1 sản phẩm theo mã và khoảng zá*/
        var sourceSpinnerProductsWebserviceBonus:MutableList<String>?=null      /*list danh sách sản phẩm đc lưu vào spinner*/
        var adapterSpinnerProductsWebserviceBonus:ArrayAdapter<String>?=null    /*adapter để hiển thị lên spinner danh sách sản phẩm*/
    }

    var btnSanPhamWebserviceBonus:Button?=null          /*sự kiện đếm tổng số sản phẩm và xuất ra 1 sản phẩm đc chọn*/
    var edtPriceFromSpWebserviceBonus:EditText?=null; var edtPriceToSpWebserviceBonus:EditText?=null;           /*nhập khoảng zá truy xuất fromPrice đến toPrice*/
    var edtCodeSpWebserviceBonus:EditText?=null; var edtNameSpWebserviceBonus:EditText?=null; var edtPriceSpWebserviceBonus:EditText?=null     /*nhập liệu 1 sản phẩm*/
    var btnInsertUpdateSanPhamWebserviceBonus:Button?=null; var btnDeleteSanPhamWebserviceBonus:Button?=null    /*sự kiện để insert/update và delete 1 sản phẩm*/
    var spinnerProductsWebserviceBonus:Spinner?=null;   /*source lưu trữ sản phẩm => tạo ra 1 list sản phẩm*/
    var arrSanPham:Array<String?> = arrayOf("","","")   /*arraySanPham bao gồm các phần tử: mã danh mục, zá fromPrice, zá toPrice -> truyền mảng này lên server.*/
    var lastedSpinnerCodeProductSelected:String="-1"    /*lưu trữ vị trí spinnerSanPham đc chọn*/
    private fun addControlsWebServiceBonusSanPham() {
        LoadWebserviceSanPham.txtTotalProductsWebserviceBonus=findViewById(R.id.txtTotalProductsWebserviceBonus)    /*hiển thị tổng số sản phẩm theo mã và khoảng zá*/
        LoadWebserviceSanPham.txtProductWebserviceBonus=findViewById(R.id.txtProductWebserviceBonus)                /*hiển thị 1 sản phẩm chi tiết theo mã và khoảng zá*/
        btnSanPhamWebserviceBonus=findViewById(R.id.btnSanPhamWebserviceBonus)                          /*sự kiện đếm tổng số sản phẩm và xuất ra 1 sản phẩm đc chọn*/
        btnInsertUpdateSanPhamWebserviceBonus=findViewById(R.id.btnInsertUpdateSanPhamWebserviceBonus)  /*sự kiện để insert/update 1 sản phẩm*/
        btnDeleteSanPhamWebserviceBonus=findViewById(R.id.btnDeleteSanPhamWebserviceBonus)              /*sự kiện để delete 1 sản phẩm*/
        edtPriceFromSpWebserviceBonus=findViewById(R.id.edtPriceFromSpWebserviceBonus)                  /*nhập khoảng zá truy xuất fromPrice*/
        edtPriceToSpWebserviceBonus=findViewById(R.id.edtPriceToSpWebserviceBonus)                      /*nhập khoảng zá truy xuất toPrice*/
        edtCodeSpWebserviceBonus=findViewById(R.id.edtCodeSpWebserviceBonus)    /*nhập liệu 1 sản phẩm*/
        edtNameSpWebserviceBonus=findViewById(R.id.edtNameSpWebserviceBonus)    /*nhập liệu 1 sản phẩm*/
        edtPriceSpWebserviceBonus=findViewById(R.id.edtPriceSpWebserviceBonus)  /*nhập liệu 1 sản phẩm*/
        spinnerProductsWebserviceBonus=findViewById(R.id.spinnerProductsWebserviceBonus)                /*source lưu trữ sản phẩm => tạo ra 1 list sản phẩm*/
        LoadWebserviceSanPham.sourceSpinnerProductsWebserviceBonus= mutableListOf()                     /*list danh sách sản phẩm đc lưu vào spinner*/
        AsyncTaskWebServiceCourse.SanPhamsRestfulTask().execute(*arrSanPham)    /*tương tác webservice đổ data ALL SảnPhẩm k phụ thuộc mãDanhMục hay price lên spinner*/
        LoadWebserviceSanPham.adapterSpinnerProductsWebserviceBonus= ArrayAdapter<String>(this@MainActivityWebserviceAndBonus,
            android.R.layout.simple_spinner_item,LoadWebserviceSanPham.sourceSpinnerProductsWebserviceBonus!!)  /*adapter đưa source lên spinner*/
        LoadWebserviceSanPham.adapterSpinnerProductsWebserviceBonus!!.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerProductsWebserviceBonus!!.adapter=LoadWebserviceSanPham.adapterSpinnerProductsWebserviceBonus    /*đưa adapter lên spinner*/
    }
    private fun addEventsWebServiceBonusSanPham() {
        spinnerProductsWebserviceBonus!!.onItemSelectedListener=object :AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                addEventsWebServiceBonusSanPhamProcessSpinnerProducts(parent,position)
            }override fun onNothingSelected(parent: AdapterView<*>?) {}
        }
        btnSanPhamWebserviceBonus!!.setOnClickListener {
            if (spinnerCategoriesWebserviceBonus!!.selectedItem!=null){   /*nếu trên spinnerCategories đc chọn, tức là lastedSpinnerCodeCategorySelected có zá trị >0 */
                arrSanPham= arrayOf(lastedSpinnerCodeCategorySelected,edtPriceFromSpWebserviceBonus!!.text.toString(),edtPriceToSpWebserviceBonus!!.text.toString())
                AsyncTaskWebServiceCourse.SanPhamTotalTask().execute(*arrSanPham)   /*tương tác webservice đổ data listSảnPhẩm theo mãDM và khoảng zá lên spinner*/
                AsyncTaskWebServiceCourse.SanPhamsRestfulTask().execute(*arrSanPham)
            }
            if (lastedSpinnerCodeProductSelected.toInt()>0)     /*nếu trên spinnerProducts đc chọn, tức là lastedSpinnerCodeProductSelected có zá trị >0 */
                AsyncTaskWebServiceCourse.SanPhamDetailRestfulTask().execute(lastedSpinnerCodeProductSelected)  /*tương tác webservice đổ data 1SảnPhẩm lên textView*/
        }
        btnInsertUpdateSanPhamWebserviceBonus!!.setOnClickListener {
            if (lastedSpinnerCodeProductSelected.toInt()<=0 || edtCodeSpWebserviceBonus!!.text.isEmpty()                /*nếu 1 trong 4 thông tin này k đc nhập */
                || edtNameSpWebserviceBonus!!.text.isEmpty() || edtPriceSpWebserviceBonus!!.text.isEmpty()) return@setOnClickListener   /*thì k insert/update đc*/
            arrSanPham = arrayOf(edtCodeSpWebserviceBonus!!.text.toString(),edtNameSpWebserviceBonus!!.text.toString(), /*đưa tất cả thông tin nhập đc vào 1 array*/
                                edtPriceSpWebserviceBonus!!.text.toString(),lastedSpinnerCodeCategorySelected)
            AsyncTaskWebServiceCourse.SanPhamInsertUpdateResfulTask().execute(*arrSanPham)      /*tương tác webservice insert/update 1 sản phẩm tử mảng array trên*/
            arrSanPham = arrayOf(lastedSpinnerCodeCategorySelected,"","")/*sau khi add insert/update xong thì query gọi lại toàn bộ sản phẩm để cập nhật lên spinner*/
            AsyncTaskWebServiceCourse.SanPhamsRestfulTask().execute(*arrSanPham)
        }
        btnDeleteSanPhamWebserviceBonus!!.setOnClickListener {
            addEventsWebServiceBonusSanPhamProcessDeleteProducts()
        }
    }
    private fun addEventsWebServiceBonusSanPhamProcessSpinnerProducts(parent: AdapterView<*>?, position: Int) {
        if (lastedSpinnerCodeCategorySelected.toInt()>0){   /*nếu trên spinnerCategories đc chọn, tức là lastedSpinnerCodeCategorySelected có zá trị >0 */
            var valuePosition:String=parent?.getItemAtPosition(position).toString()                             /*lấy zá trị đc chọn trên spinnerProduct*/
            lastedSpinnerCodeProductSelected=valuePosition.substring(0,valuePosition.indexOf(":")).trim()/*xử lý chuỗi để lấy mã sản phẩm ra.    */
            edtCodeSpWebserviceBonus!!.setText(lastedSpinnerCodeProductSelected)                     /*đưa mã sản phẩm đc chọn trên spinner vào edittext*/
            edtNameSpWebserviceBonus!!.setText(valuePosition.substring(valuePosition.indexOf(":")+1,valuePosition.indexOf(",")).trim())
            edtPriceSpWebserviceBonus!!.setText(valuePosition.substring(valuePosition.indexOf("=")+1,valuePosition.lastIndexOf(",")).trim())
            LoadWebserviceSanPham.txtProductWebserviceBonus!!.text = edtNameSpWebserviceBonus!!.text /*đưa thông tin sản phẩm (tên sản phẩm) lên textview*/
        }
    }
    private fun addEventsWebServiceBonusSanPhamProcessDeleteProducts() {    /*khi xóa thì phải show lên 1 dialog để hỏi user xác nhận xóa hay k, nếu yes thì cho xóa*/
        var builder=ShowAlertDialog.BuildAlert.showing(this@MainActivityWebserviceAndBonus,"Are you sure to delete SP[$lastedSpinnerCodeProductSelected]?")
        builder.setPositiveButton("YES,certainly!", DialogInterface.OnClickListener { dialog, which ->  /*nếu có thì tiến hành xóa*/
            AsyncTaskWebServiceCourse.SanPhamDeleteResfulTask().execute(lastedSpinnerCodeProductSelected)    /*tương tác webservice để xóa 1 sản phẩm*/
            dialog.dismiss()
            arrSanPham = arrayOf(lastedSpinnerCodeCategorySelected,"","")/*sau khi delete xong thì query gọi lại toàn bộ sản phẩm để cập nhật lên spinner*/
            AsyncTaskWebServiceCourse.SanPhamsRestfulTask().execute(*arrSanPham)
        })
        builder.setNegativeButton("No!", DialogInterface.OnClickListener { dialog, which -> dialog.dismiss() }) /*nếu k thì k cho xóa, k làm zì cả*/
        builder.create().show()
    }

    object LoadWebserviceVietcombank{
        var txtDateTimeVietcombank:TextView?=null; var txtSourceVietcombank:TextView?=null
        var sourceVietcombank:MutableList<String>? = null
        var adapterVietcombank:ArrayAdapter<String>? =null
    }
    var spinnerVietcombank:Spinner?=null
    private fun addControlsWebServiceBonusVietcombank() {
        LoadWebserviceVietcombank.txtDateTimeVietcombank=findViewById(R.id.txtDateTimeVietcombank)
        LoadWebserviceVietcombank.txtSourceVietcombank=findViewById(R.id.txtSourceVietcombank)
        spinnerVietcombank=findViewById(R.id.spinnerVietcombank)
        LoadWebserviceVietcombank.sourceVietcombank= mutableListOf()
        AsyncTaskWebServiceCourse.TyZaVietcombankTask().execute()
        LoadWebserviceVietcombank.adapterVietcombank = ArrayAdapter<String>(this@MainActivityWebserviceAndBonus,
            android.R.layout.simple_spinner_item,LoadWebserviceVietcombank.sourceVietcombank!!)
        LoadWebserviceVietcombank.adapterVietcombank!!.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerVietcombank!!.adapter=LoadWebserviceVietcombank.adapterVietcombank
    }



//    private fun dataBinding() {
//        var binding: ActivityMainDataBindingDemoBinding =
//            DataBindingUtil.setContentView(this@MainActivityWebserviceAndBonus,R.layout.activity_main_data_binding_demo)
//
//        var user: User = User("Paul","Long")
//        binding.user=user
//
//        var presenter: PresenterData<TemperatureData> = PresenterData(this@MainActivityWebserviceAndBonus)
//        /*trong constructor của PresenterData phải là 1 View => do đó cần phải implement 1 cái View để chứa phương thức onShowData => implement trên class*/
//        var temperatureData: TemperatureData = TemperatureData("100")
//        binding.presenter=presenter /*setPresenter (lấy presenter trong file xml để set cho nó)*/
//        binding.temp=temperatureData/*setTemp (lấy temp trong file xml để set cho nó)*/
//    }
//    override fun showData(data: TemperatureData) {  /*sự kiện sẽ đc thực hiện trong showData này, trường hợp này chỉ cần Toast lên:*/
//        Toast.makeText(this@MainActivityWebserviceAndBonus,data.Celsius, Toast.LENGTH_LONG).show()
//    }
}
