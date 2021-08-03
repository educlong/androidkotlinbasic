package elong.models.webserviceBonus.tyZaVietcombank

class Exrate {
    private var currencyCode:String?=null
    private var currencyName:String?=null
    private var buy:String?=null
    private var transfer:String?=null
    private var sell:String?=null

    constructor(currencyCode: String?, currencyName: String?, buy: String?, transfer: String?, sell: String?) {
        this.currencyCode = currencyCode
        this.currencyName = currencyName
        this.buy = buy
        this.transfer = transfer
        this.sell = sell
    }

    constructor()

    public var CurrencyCode:String?
        get() {return currencyCode}
        set(value) {currencyCode=value}
    public var CurrencyName:String?
        get() {return currencyName}
        set(value) {currencyName=value}
    public var Buy:String?
        get() {return buy}
        set(value) {buy=value}
    public var Transfer:String?
        get() {return transfer}
        set(value) {transfer=value}
    public var Sell:String?
        get() {return sell}
        set(value) {sell=value}

    override fun toString(): String {
        return "$currencyName($currencyCode): $buy(Buy), $transfer(transfer), $sell(sell)"
    }
}