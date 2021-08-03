package elong.androidApp.services.chapter8GoogleMap

import elong.androidApp.R
import elong.models.chapter8.VoChongTuiGMap

class FakeVoChongTuiGMap {
    object display {
        public fun listVoChongTuiGMap(): MutableList<VoChongTuiGMap> {
            var listVoChongTuiGMap: MutableList<VoChongTuiGMap> = mutableListOf()
            listVoChongTuiGMap.add(VoChongTuiGMap("Bờ biển vịnh Đà Nẵng", R.drawable.dodangyeu1, 16.073225, 108.188312))
            listVoChongTuiGMap.add(VoChongTuiGMap("Hội An, Quảng Nam", R.drawable.dodangyeu2, 15.877115, 108.326131))
            listVoChongTuiGMap.add(VoChongTuiGMap("Hiệp Đức, Quảng Nam", R.drawable.dodangyeu3, 15.559527, 108.078585))
            return listVoChongTuiGMap
        }
    }
}
