package com.example.androidprofessional.usecase

import com.example.androidprofessional.di.NAME_LOCAL
import com.example.androidprofessional.di.NAME_REMOTE
import com.example.androidprofessional.model.AppState
import com.example.androidprofessional.model.data.DataModel
import com.example.androidprofessional.model.repository.IRepository
import io.reactivex.Observable
import javax.inject.Inject
import javax.inject.Named

class MainInteractor @Inject constructor (
    @Named(NAME_REMOTE) val remoteRepository: IRepository<List<DataModel>>,
    @Named(NAME_LOCAL) val localRepository: IRepository<List<DataModel>>,
) : Interactor<AppState> {

    override fun getData(word: String, fromRemoteSource: Boolean): Observable<AppState> {
        return if (fromRemoteSource) {
            remoteRepository.getData(word).map { AppState.Success(it) }
        } else {
            localRepository.getData(word).map { AppState.Success(it) }
        }
    }
}