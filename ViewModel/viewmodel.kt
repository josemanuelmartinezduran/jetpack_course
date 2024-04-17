import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    // LiveData es un contenedor observable de datos que resiste a cambios de configuración.
    private val _textData = MutableLiveData<String>("Hola ViewModel")
    val textData: LiveData<String> = _textData

    // Método para actualizar los datos
    fun updateText(newText: String) {
        _textData.value = newText
    }
}
