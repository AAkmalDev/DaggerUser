package uz.pdp.daggeruser.repository

import uz.pdp.daggeruser.retrofit.ApiService
import javax.inject.Inject

class UserRemoteDataSource @Inject constructor(private var apiService: ApiService) {
    suspend fun getUsers() = apiService.getUser()
}