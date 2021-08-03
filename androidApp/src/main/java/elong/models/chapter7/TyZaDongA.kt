package elong.models.chapter7

import android.graphics.Bitmap

class TyZaDongA {
    private var type:String?=null
    private var imageurl:String?=null
    private var muatienmat:String?=null
    private var muack:String?=null
    private var bantienmat:String?=null
    private var banck:String?=null
    private var bitmapImg:Bitmap?=null

    constructor(
        type: String?,
        imageurl: String?,
        muatienmat: String?,
        muack: String?,
        bantienmat: String?,
        banck: String?,
        bitmapImg: Bitmap?
    ) {
        this.type = type
        this.imageurl = imageurl
        this.muatienmat = muatienmat
        this.muack = muack
        this.bantienmat = bantienmat
        this.banck = banck
        this.bitmapImg = bitmapImg
    }

    constructor()
    public var Type:String?
        get() {return type}
        set(value) {type=value}
    public var Imageurl:String?
        get() {return imageurl}
        set(value) {imageurl=value}
    public var Muatienmat:String?
        get() {return muatienmat}
        set(value) {muatienmat=value}
    public var Muack:String?
        get() {return muack}
        set(value) {muack=value}
    public var Bantienmat:String?
        get() {return bantienmat}
        set(value) {bantienmat=value}
    public var Banck:String?
        get() {return banck}
        set(value) {banck=value}
    public var BitmapImg:Bitmap?
        get() {return bitmapImg}
        set(value) {bitmapImg=value}
}