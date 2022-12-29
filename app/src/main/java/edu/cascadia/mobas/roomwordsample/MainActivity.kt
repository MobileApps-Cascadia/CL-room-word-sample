package edu.cascadia.mobas.roomwordsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import edu.cascadia.mobas.roomwordsample.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
    }
}