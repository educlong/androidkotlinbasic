package elong.models.chapter7

class InforPerson {
    private var name: String?=null
    private var country: String?=null
    private var city:String?=null

    constructor(name: String?, country: String?, city: String?) {
        this.name = name
        this.country = country
        this.city = city
    }

    constructor()
    public var Name:String?
        get() {return name}
        set(value) {name=value}
    public var Country:String?
        get() {return country}
        set(value) {country=value}
    public var City:String?
        get() {return city}
        set(value) {city=value}

    override fun toString(): String {
        return "${this.name}: ${this.city} -> ${this.country}"
    }
}