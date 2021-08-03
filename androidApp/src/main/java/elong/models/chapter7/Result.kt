package elong.models.chapter7

class Result {
    private var title:String?=null
    private var date:String?=null

    constructor(title: String?, date: String?) {
        this.title = title
        this.date=date
    }

    constructor()
    public var Title:String?
        get() {return title}
        set(value) {title=value}
    public var Date:String?
        get() {return date}
        set(value) {date=value}

    override fun toString(): String {
        return "${this.title}\n${this.date}"
    }
}