package com.practicum.a5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
private const val TAG = "Lifecycle"

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG,"Его стихов пленительная сладость")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "Пройдет веков завистливую даль")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "И, внемля им, вздохнет о славе младость")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "Утешится безмолвная печаль")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "И резвая задумается радость")
    }
     }