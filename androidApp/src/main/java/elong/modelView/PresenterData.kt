package elong.modelView
class PresenterData<Data> { /*dùng để show data lên (sử dụng trong file xml)*/
    private var view: MainActivityContact.View<Data>?=null
    constructor(view: MainActivityContact.View<Data>?) {
        this.view = view
    }
    public fun onShowData(data: Data){  /*onShowData sẽ đc sử dụng trong Main*/
        this.view?.showData(data)
    }
}