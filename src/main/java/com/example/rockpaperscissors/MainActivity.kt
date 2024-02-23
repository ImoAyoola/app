package com.example.rockpaperscissors

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var rockButton: Button
    private lateinit var paperButton: Button
    private lateinit var scissorsButton : Button
    private lateinit var playAgain: Button

    private lateinit var playerText: TextView
    private lateinit var droidText: TextView
    private lateinit var winText: TextView

    private var gameInSession: Boolean = true

    private fun checkScissorsWin() : Boolean {
        if(playerChoice == scissors && droidChoice == paper){
                return true
            }
        }
        return false
    }
    private fun checkForWin() : Boolean {
        if(()) {
            return true
        } else if (()){
            return true
        } else if (()){
            return true
        } else if (()){
            return true
        }
    }

    while(gameInSession)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

