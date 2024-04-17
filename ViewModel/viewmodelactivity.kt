import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.yourapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    // Usando delegados para obtener una instancia del ViewModel
    private val viewModel: MainViewModel by viewModels()
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Observar los cambios en LiveData dentro del ViewModel
        viewModel.textData.observe(this) { updatedText ->
            // Actualizar la UI cuando cambien los datos
            binding.textViewExample.text = updatedText
        }

        // Evento para actualizar el texto, por ejemplo, en respuesta a la interacción del usuario
        binding.updateButton.setOnClickListener {
            viewModel.updateText("Texto actualizado")
        }
    }
}
