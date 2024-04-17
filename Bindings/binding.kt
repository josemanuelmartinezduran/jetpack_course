import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.yourapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    // Propiedad para almacenar la referencia al binding
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inicializar el binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Ahora puedes usar el binding para acceder a tus vistas
        binding.textViewExample.text = "Texto actualizado con ViewBinding"
    }
}
