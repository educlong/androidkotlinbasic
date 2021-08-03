package elong.models.webserviceBonus

class DanhMuc {
    private var codeDanhMuc:Int?=null
    private var nameDanhMuc:String?=null

    constructor(codeDanhMuc: Int?, nameDanhMuc: String?) {
        this.codeDanhMuc = codeDanhMuc
        this.nameDanhMuc = nameDanhMuc
    }

    constructor()
    public var CodeDanhMuc:Int?
        get() {return codeDanhMuc}
        set(value) {codeDanhMuc=value}
    public var NameDanhMuc:String?
        get() {return nameDanhMuc}
        set(value) {nameDanhMuc=value}

    override fun toString(): String {
        return "$codeDanhMuc - $nameDanhMuc"
    }
}