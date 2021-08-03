package elong.models.webserviceBonus.tyZaVietcombank

class ExrateList {
    private var dateTime:String?=null
    private var exrates:MutableList<Exrate>? = mutableListOf()
    private var source:String?=null

    constructor(dateTime: String?, exrates: MutableList<Exrate>?, source: String?) {
        this.dateTime = dateTime
        this.exrates = exrates
        this.source = source
    }

    constructor()

    public var DateTime:String?
        get() {return dateTime}
        set(value) {dateTime=value}
    public var Exrates :MutableList<Exrate>?
        get() {return exrates}
        set(value) {exrates=value}
    public var Source:String?
        get() {return source}
        set(value) {source=value}
}