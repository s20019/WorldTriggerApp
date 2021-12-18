package jp.ac.it_college.std.s20019.worldtriggerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import jp.ac.it_college.std.s20019.worldtriggerapp.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 常にダークテーマをOFFにする処理
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        val position = intent.getStringExtra("POSITION")
        val upperText = intent.getStringExtra("UPPER")
        val lowerText = intent.getStringExtra("LOWER")
        val imageNum = intent.getIntExtra("IMAGE", 1)

        when (imageNum) {
            1 -> binding.imageView.setImageResource(R.drawable.w_touma)
            2 -> binding.imageView.setImageResource(R.drawable.w_reiji)
            3 -> binding.imageView.setImageResource(R.drawable.w_kazama)
            4 -> binding.imageView.setImageResource(R.drawable.w_tatikawa)
            5 -> binding.imageView.setImageResource(R.drawable.w_midorikawa)
            6 -> binding.imageView.setImageResource(R.drawable.w_miwa)
            7 -> binding.imageView.setImageResource(R.drawable.w_arasiyama)
            8 -> binding.imageView.setImageResource(R.drawable.w_izumi)
            9 -> binding.imageView.setImageResource(R.drawable.w_azuma)
            10 -> binding.imageView.setImageResource(R.drawable.w_usami)
            11 -> binding.imageView.setImageResource(R.drawable.w_osamu)
        }

        binding.position.setText(position)
        binding.topText.setText(upperText)
        binding.bottomText.setText(lowerText)

        binding.button.setOnClickListener {
            finish()
        }
    }
}