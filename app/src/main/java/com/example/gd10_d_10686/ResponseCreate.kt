package com.example.gd10_d_10686

import com.google.gson.annotations.SerializedName

class ResponseCreate (
    @SerializedName("status") val stt:Int,
    @SerializedName("error") val e:Boolean,
    @SerializedName("message") val pesan:String,
)