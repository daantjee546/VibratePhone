package com.example.vibratephone

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Context.VIBRATOR_SERVICE
import androidx.core.content.ContextCompat.getSystemService
import android.os.Vibrator
import androidx.core.app.ComponentActivity.ExtraData
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.view.View


class MainActivity : AppCompatActivity() {
    

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun vibrator(view: View)
    {
        val vibe = this.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
        for (i in 40 downTo 0 step 1) {
            if (vibe.hasVibrator()) {
                vibe.vibrate(250)
            }
            Thread.sleep(250)
        }
    }
}
