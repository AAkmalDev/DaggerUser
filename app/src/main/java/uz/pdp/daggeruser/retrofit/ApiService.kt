package uz.pdp.daggeruser.retrofit

import retrofit2.http.GET
import uz.pdp.daggeruser.models.User

interface ApiService {

    @GET("users")
    suspend fun getUser():List<User>
}