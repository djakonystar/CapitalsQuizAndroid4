package uz.texnopos.capitalsquizapp

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import uz.texnopos.capitalsquizapp.data.Constants
import uz.texnopos.capitalsquizapp.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sharedPreferences = getSharedPreferences(Constants.PREFS_NAME, Context.MODE_PRIVATE)

        val result: Int = intent.getIntExtra("result", -1)
        val count = intent.getIntExtra("questions_count", -1)

        val name: String = sharedPreferences.getString("username", "") ?: "Unknown"

        binding.tvResult?.text = getString(R.string.result_text, name, count, result)

        binding.btnRestart?.setOnClickListener {
            val intent = Intent(this, GameActivity::class.java)
            startActivity(intent)
            finish()
        }

        binding.btnQuit?.setOnClickListener {
            finish()
        }
    }
}
