package elong.androidApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import elong.androidApp.databinding.ActivityMainDataBindingDemoBinding
import elong.modelView.MainActivityContact
import elong.modelView.PresenterData
import elong.modelView.mainActivityDataBindingDemo.ListHeader
import elong.modelView.mainActivityDataBindingDemo.ListUserInfor
import elong.modelView.mainActivityDataBindingDemo.TemperatureData
import elong.modelView.mainActivityDataBindingDemo.User

class MainActivityDataBindingDemo : AppCompatActivity(),MainActivityContact.View<TemperatureData>/*implement thêm 1 View thuôc MainActivityContact để show Data*/{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main_data_binding_demo)
        var binding:ActivityMainDataBindingDemoBinding=DataBindingUtil.setContentView(this@MainActivityDataBindingDemo,R.layout.activity_main_data_binding_demo)

        var user: User = User("Paul","Long")
        binding.user=user

        var presenter:PresenterData<TemperatureData> =PresenterData(this@MainActivityDataBindingDemo)
        /*trong constructor của PresenterData phải là 1 View => do đó cần phải implement 1 cái View để chứa phương thức onShowData => implement trên class*/
        var temperatureData:TemperatureData=TemperatureData("100")
        binding.presenter=presenter /*setPresenter (lấy presenter trong file xml để set cho nó)*/
        binding.temp=temperatureData/*setTemp (lấy temp trong file xml để set cho nó)*/

        var header:ListHeader= ListHeader("Danh sách user")
        binding.header=header

        var infos:ListUserInfor=ListUserInfor()
        binding.infos=infos
    }

    override fun showData(data: TemperatureData) {  /*sự kiện sẽ đc thực hiện trong showData này, trường hợp này chỉ cần Toast lên:*/
        Toast.makeText(this@MainActivityDataBindingDemo,data.Celsius, Toast.LENGTH_LONG).show()
    }
}