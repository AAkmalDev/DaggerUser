package uz.pdp.daggeruser.repository

import androidx.lifecycle.MutableLiveData
import uz.pdp.daggeruser.models.User
import javax.inject.Inject

class UserViewModel @Inject constructor(private val userRepository: UserRepository) {
    fun getUserRepository():MutableLiveData<List<User>>{
        return userRepository.getAllUser()
    }
}