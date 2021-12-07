package com.example.androidprofessional.model.data

import com.google.gson.annotations.SerializedName

class Meanings(
        @SerializedName(ID_MEANINGS) val id: Int,
        @SerializedName(TRANSLATION_MEANINGS) val translation: Translation?,
        @SerializedName(IMAGE_URL_MEANINGS) val imageUrl: String?,
        @SerializedName(TRANSCRIPTION_MEANINGS) val transcription: String?,
        @SerializedName(SOUND_URL_MEANINGS) val soundUrl: String?,
) {
    companion object {
        private const val ID_MEANINGS = "id"
        private const val TRANSLATION_MEANINGS = "translation"
        private const val IMAGE_URL_MEANINGS = "imageUrl"
        private const val TRANSCRIPTION_MEANINGS = "transcription"
        private const val SOUND_URL_MEANINGS = "soundUrl"
    }
}


