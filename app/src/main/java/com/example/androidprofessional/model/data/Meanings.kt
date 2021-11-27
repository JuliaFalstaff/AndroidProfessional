package com.example.androidprofessional.model.data

import com.google.gson.annotations.SerializedName

class Meanings(
        @field:SerializedName("id") val id: Int,
        @field:SerializedName("translation") val translation: Translation?,
        @field:SerializedName("imageUrl") val imageUrl: String?,
        @field:SerializedName("transcription") val transcription: String?,
        @field:SerializedName("soundUrl") val soundUrl: String?
)