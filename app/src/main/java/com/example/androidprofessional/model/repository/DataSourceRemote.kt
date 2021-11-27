package com.example.androidprofessional.model.repository

import com.example.androidprofessional.model.data.DataModel
import com.example.androidprofessional.model.retrofit.RetrofitImpl
import com.example.androidprofessional.view.Contract
import io.reactivex.Observable

class DataSourceRemote(private val remoteProvider: RetrofitImpl = RetrofitImpl()) : Contract.DataSource<List<DataModel>> {
    override fun getData(word: String): Observable<List<DataModel>> = remoteProvider.getData(word)
}