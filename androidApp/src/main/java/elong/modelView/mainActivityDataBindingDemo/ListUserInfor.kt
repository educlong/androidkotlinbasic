package elong.modelView.mainActivityDataBindingDemo

import android.view.View
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.databinding.ObservableArrayList
import elong.androidApp.BR
import kotlin.random.Random

class ListUserInfor : BaseObservable {
    private var users:ObservableArrayList<User>? = ObservableArrayList()
    private var totalUser:Int?=null

    @get:Bindable
    public var Users:ObservableArrayList<User>?
        get() {return users}
        set(value) {
            if (value != null) {
                users=value
            }
            notifyPropertyChanged(BR.user)
        }
    @get:Bindable
    public var TotalUser:Int?
        get() {return totalUser}
        set(value) {totalUser=value}

    constructor(users: ObservableArrayList<User>, totalUser: Int?) {
        this.users = users
        this.totalUser = totalUser
    }

    constructor(){
        totalUser=15
        var random:Random=Random
        for (count in 0 until totalUser!!){
            var phone:String="098"
            for (i in 0 until 7) phone += random.nextInt(10)
            add(User("D.","Trump $count",phone))
        }
    }
    private fun add(user:User){
        users!!.add(user)
    }

    /**Bổ sung 1 số hàm để xử lý sự kiện trên zao diện*/
    public fun add(view:View){
        var random:Random=Random
        var phone:String="098"
        for (i in 0 until 7) phone += random.nextInt(10)
        totalUser= totalUser?.plus(1)
        add(User("D.","Trump ${totalUser!!}",phone))
    }
    public fun remove(view: View){
       if (!users!!.isEmpty())
           users!!.removeAt(0)
    }
}