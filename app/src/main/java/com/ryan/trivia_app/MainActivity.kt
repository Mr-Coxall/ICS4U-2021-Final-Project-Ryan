/*
 * Copyright 2022 Ryan Chung Kam Chung
 *
 * This is the main activity for the app.
 */

package com.ryan.trivia_app

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ryan.trivia_app.databinding.ActivityMainBinding

/** MainActivity class. */
class MainActivity : AppCompatActivity() {
    /**
     * When the activity is created on screen.
     *
     * @param savedInstanceState
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // onClickListener to start the game
        binding.btnStart.setOnClickListener {
            startActivity(Intent(this, GameActivity::class.java))
        }
    }
}
