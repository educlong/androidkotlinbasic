package elong.androidApp.chapter2Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import elong.androidApp.MainActivityChapter2Chapter3
import elong.androidApp.R
import elong.androidApp.databinding.ActivityChapter2SendDataNAnswerBinding
import elong.modelView.mainActivityChapter23.ExplicitIntentsReceiveDataAnswer

class Chapter2SendDatanAnswerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chapter2_send_data_n_answer)

        var intentAnswer:Intent=intent
        val bundle = intentAnswer!!.getBundleExtra("truyen_ab_USCLN")
        var a:Int=bundle.getInt("a",-1)
        var b:Int=bundle.getInt("b",-1)
        var uscln:Int=tinhUSCLNandSendData(a,b)

        var binding:ActivityChapter2SendDataNAnswerBinding=
            DataBindingUtil.setContentView(this@Chapter2SendDatanAnswerActivity,R.layout.activity_chapter2_send_data_n_answer)
        var explicitIntentsReceiveDataAnswer:ExplicitIntentsReceiveDataAnswer=ExplicitIntentsReceiveDataAnswer("USCLN($a,$b)=$uscln")
        binding.answerData=explicitIntentsReceiveDataAnswer
    }
    private fun tinhUSCLNandSendData(a:Int,b:Int):Int {
        var min:Int=Math.min(a, b)
        var uSCLN:Int=1
        for(count in min downTo 1)
            if (a % count==0 && b % count==0){
                uSCLN=count
                break
            }
        return uSCLN
    }
}