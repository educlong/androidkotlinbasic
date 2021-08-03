package elong.models.chapter8

import android.graphics.Bitmap

class VoChongTuiGMap {
    private var codeVoChongTuiGMap:Int?=null
    private var nameVoChongTuiGMap:String?=null
    private var imageVoChongTuiGMap:Int?=null
    private var bitmapVoChongTuiGMap:Bitmap?=null
    private var kinhDoVoChongTuiGMap:Double?=null
    private var viDoVoChongTuiGMap:Double?=null


    constructor()
    constructor(
        nameVoChongTuiGMap: String?,
        imageVoChongTuiGMap: Int?,
        viDoVoChongTuiGMap: Double?,
        kinhDoVoChongTuiGMap: Double?
    ) {
        this.nameVoChongTuiGMap = nameVoChongTuiGMap
        this.imageVoChongTuiGMap = imageVoChongTuiGMap
        this.kinhDoVoChongTuiGMap = kinhDoVoChongTuiGMap
        this.viDoVoChongTuiGMap = viDoVoChongTuiGMap
    }

    constructor(
        codeVoChongTuiGMap: Int?,
        nameVoChongTuiGMap: String?,
        bitmapVoChongTuiGMap: Bitmap?,
        viDoVoChongTuiGMap: Double?,
        kinhDoVoChongTuiGMap: Double?
    ) {
        this.codeVoChongTuiGMap = codeVoChongTuiGMap
        this.nameVoChongTuiGMap = nameVoChongTuiGMap
        this.bitmapVoChongTuiGMap = bitmapVoChongTuiGMap
        this.kinhDoVoChongTuiGMap = kinhDoVoChongTuiGMap
        this.viDoVoChongTuiGMap = viDoVoChongTuiGMap
    }

    public var CodeVoChongTuiGMap:Int?
        get() {return codeVoChongTuiGMap}
        set(value) {codeVoChongTuiGMap=value}
    public var NameVoChongTuiGMap:String?
        get() {return nameVoChongTuiGMap}
        set(value) {nameVoChongTuiGMap=value}
    public var ImageVoChongTuiGMap:Int?
        get() {return imageVoChongTuiGMap}
        set(value) {imageVoChongTuiGMap=value}
    public var BitmapVoChongTuiGMap:Bitmap?
        get() {return bitmapVoChongTuiGMap}
        set(value) {bitmapVoChongTuiGMap=value}
    public var KinhDoVoChongTuiGMap:Double?
        get() {return kinhDoVoChongTuiGMap}
        set(value) {kinhDoVoChongTuiGMap=value}
    public var ViDoVoChongTuiGMap:Double?
        get() {return viDoVoChongTuiGMap}
        set(value) {viDoVoChongTuiGMap=value}

    override fun toString(): String {
        return "${this.nameVoChongTuiGMap}"
    }
}