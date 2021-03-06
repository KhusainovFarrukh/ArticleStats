package khusainov.farrukh.communityapp.vm.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import khusainov.farrukh.communityapp.data.model.User
import khusainov.farrukh.communityapp.data.repository.Repository
import kotlinx.coroutines.launch
import retrofit2.Response

/**
 *Created by FarrukhKhusainov on 3/5/21 2:58 PM
 **/

//TODO add userId to constructor
class UserViewModel(userId: String, repository: Repository) : ViewModel() {

    private val _responseUser = MutableLiveData<Response<User>>()
    private val _isLoading = MutableLiveData<Boolean>()

    val responseUser : LiveData<Response<User>> = _responseUser
    val isLoading : LiveData<Boolean> = _isLoading

    init {
        viewModelScope.launch {
            _isLoading.postValue(true)

            _responseUser.postValue(repository.getUserById(userId))

            _isLoading.postValue(false)
        }
    }
}