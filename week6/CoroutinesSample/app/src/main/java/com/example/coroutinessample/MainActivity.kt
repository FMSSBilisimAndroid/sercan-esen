package com.example.coroutinessample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        CoroutineScope(Dispatchers.IO).launch {
            val answer = doNetworkCall()

            withContext(Dispatchers.Main) {
                Log.v("PATIKA", answer)
            }
        }
        infiniteLoopCall()
    }

    fun infiniteLoopCall() {
        var sayac = 0
        while (sayac <= 1000) {
            println("Sayaç: $sayac")
            sayac++
        }
    }

    suspend fun doNetworkCall(): String {
        delay(2000L)
        return "Network Answer Called"
    }
}