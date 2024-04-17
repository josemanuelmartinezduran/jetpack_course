import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class UserViewModel(userId: String) : ViewModel() {
    private val _userData = MutableLiveData<String>()
    val userData: LiveData<String> = _userData

    init {
        loadData(userId)
    }

    private fun loadData(userId: String) {
        // Simula la carga de datos. En una aplicación real, esto podría ser una llamada a una base de datos o a un servicio web.
        _userData.value = "Datos cargados para el usuario ID: $userId"
    }
}
