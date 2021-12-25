package com.su.cevreilcesuanalizleri.model


import com.google.gson.annotations.SerializedName

class WaterListResponce : ArrayList<WaterListResponce.WaterListResponceItem>(){
    data class WaterListResponceItem(
        @SerializedName("AnalizTarihi")
        var analizTarihi: String? = null,
        @SerializedName("IlceAdi")
        var ilceAdi: String? = null,
        @SerializedName("IlceKodu")
        var ilceKodu: Int? = null,
        @SerializedName("Noktalar")
        var noktalar: List<Noktalar?>? = null
    ) {
        data class Noktalar(
            @SerializedName("Adres")
            var adres: String? = null,
            @SerializedName("NoktaAnalizleri")
            var noktaAnalizleri: List<NoktaAnalizleri?>? = null,
            @SerializedName("NoktaKodu")
            var noktaKodu: String? = null
        ) {
            data class NoktaAnalizleri(
                @SerializedName("Birim")
                var birim: String? = null,
                @SerializedName("ParametreAdi")
                var parametreAdi: String? = null,
                @SerializedName("ParametreDegeri")
                var parametreDegeri: String? = null,
                @SerializedName("Sira")
                var sira: Int? = null,
                @SerializedName("Standart")
                var standart: String? = null
            )
        }
    }
}