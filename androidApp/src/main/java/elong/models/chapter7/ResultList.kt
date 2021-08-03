package elong.models.chapter7

class ResultList {
    private var results:MutableList<Result>?=null

    constructor(results: MutableList<Result>?) {
        this.results = results
    }

    constructor()
    public var Results:MutableList<Result>?
        get() {return results}
        set(value) {results=value}

    override fun toString(): String {
        return "${this.results}"
    }
}