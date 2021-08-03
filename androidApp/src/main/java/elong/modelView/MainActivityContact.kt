package elong.modelView
interface MainActivityContact { /*Contact: tiếp xúc*/   /*implement trong Main, mục đích gán sự kiện cho zao diện trong phần binding*/
    public interface Presenter<Data>{   /* khai báo các inner interface là Presenter và View*/
        fun onShowData(data:Data)
    }
    public interface View<Data>{
        fun showData(data: Data)
    }
}