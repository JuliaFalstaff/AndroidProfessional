package com.example.androidprofessional.utils

import android.content.Context
import com.google.android.exoplayer2.ExoPlayer

class ExoPlayerFactory {
    fun create(context: Context) = ExoPlayer.Builder(context).build()
}