package com.vs.chronometer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.vs.chronometer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setupChronometer()
    }

    private fun setupChronometer() {
        binding.chronometer.apply {
            base = SystemClock.elapsedRealtime()
        }
    }

    fun startTimer(view: View) {
        setupChronometer()
        binding.chronometer.start()
    }


    fun stopTimer(view: View) {
        binding.chronometer.stop()
        Toast.makeText(this,"Timer stopped!",Toast.LENGTH_SHORT).show()
        setupChronometer()
    }

}