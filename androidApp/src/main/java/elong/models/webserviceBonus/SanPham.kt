package elong.models.webserviceBonus

class SanPham {
    private var codesp:Int?=null
    private var namesp:String?=null
    private var price:Int?=null
    private var codedm:Int?=null

    constructor(codesp: Int?, namesp: String?, price: Int?, codedm: Int?) {
        this.codesp = codesp
        this.namesp = namesp
        this.price = price
        this.codedm = codedm
    }

    constructor()

    public var Codesp:Int?
        get() {return codesp}
        set(value) {codesp=value}
    public var Namesp:String?
        get() {return namesp}
        set(value) {namesp=value}
    public var Price:Int?
        get() {return price}
        set(value) {price=value}
    public var Codedm:Int?
        get() {return codedm}
        set(value) {codedm=value}

    override fun toString(): String {
        return "$codesp:$namesp,\nprice=$price, DM$codedm"
    }
}