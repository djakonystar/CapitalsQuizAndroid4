package uz.texnopos.capitalsquizapp

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.widget.addTextChangedListener
import uz.texnopos.capitalsquizapp.data.Constants
import uz.texnopos.capitalsquizapp.databinding.ActivityStartBinding

class StartActivity : AppCompatActivity() {
    private lateinit var binding: ActivityStartBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStartBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sharedPreferences = getSharedPreferences(Constants.PREFS_NAME, Context.MODE_PRIVATE)

        binding.etName.addTextChangedListener {
            binding.tilName.isErrorEnabled = false
        }

        binding.btnStart.setOnClickListener {
            val name = binding.etName.text.toString()

            if (name.isEmpty() || name.isBlank()) {
                binding.tilName.error = getString(R.string.error_required)
            } else {
                sharedPreferences.edit().putString("username", name).apply()
                val intent = Intent(this, GameActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
    }

    private fun getName(): String {
        return binding.etName.text.toString()
    }
}
