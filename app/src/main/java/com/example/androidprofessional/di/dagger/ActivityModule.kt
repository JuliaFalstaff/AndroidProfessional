package com.example.androidprofessional.di.dagger

import com.example.androidprofessional.ui.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {
    @ContributesAndroidInjector
    abstract fun contributeMainActivity(): MainActivity
}