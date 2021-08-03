package elong.models.chapter1

import java.io.Serializable

class Employees : Serializable {
    private var nameEmployees:String?=null
    private var dayOfWeekEmployees:String?=null
    private var numberBussinessEmployees:Int?=null

    public var NameEmployees: String?
        get() {return nameEmployees}
        set(value) {nameEmployees=value}
    public var DayOfWeekEmployees: String?
        get() {return dayOfWeekEmployees}
        set(value) {dayOfWeekEmployees=value}
    public var NumberBussinessEmployees: Int?
        get() {return numberBussinessEmployees}
        set(value) {numberBussinessEmployees=value}
    constructor(nameEmployees: String?, dayOfWeekEmployees: String?, numberBussinessEmployees: Int?) {
        this.nameEmployees = nameEmployees
        this.dayOfWeekEmployees = dayOfWeekEmployees
        this.numberBussinessEmployees = numberBussinessEmployees
    }

    constructor()

    override fun toString(): String {
        return "name: $nameEmployees, day of week Employee: $dayOfWeekEmployees, and number Business Employee: $numberBussinessEmployees"
    }
}