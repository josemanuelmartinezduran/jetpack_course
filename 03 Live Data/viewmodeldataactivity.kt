import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.yourapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: UserViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Supongamos que tenemos un userId
        val userId = "12345"
        val factory = UserViewModelFactory(userId)
        viewModel = ViewModelProvider(this, factory).get(UserViewModel::class.java)

        // Observar el LiveData del ViewModel
        viewModel.userData.observe(this, { userData ->
            // Actualizar la UI cuando cambien los datos
            binding.textViewExample.text = userData
        })
    }
}
