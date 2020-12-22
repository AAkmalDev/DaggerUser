package uz.pdp.daggeruser.repository

import androidx.lifecycle.MutableLiveData
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import uz.pdp.daggeruser.models.User
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UserRepository @Inject constructor(private val userRemoteDataSource: UserRemoteDataSource) {
    val mutableLiveData = MutableLiveData<List<User>>()

    init {
        loadUser()
    }

    private fun loadUser() {
        GlobalScope.launch {
            mutableLiveData.postValue(userRemoteDataSource.getUsers())
        }
    }
    fun getAllUser():MutableLiveData<List<User>>{
        return mutableLiveData
    }
}