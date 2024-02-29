package com.example.rockpaperscissors

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var playerMove: String = ""
    private var droidMove: String = ""

    private lateinit var rockButton: Button
    private lateinit var paperButton: Button
    private lateinit var scissorsButton : Button
    private lateinit var playAgain: Button

    private lateinit var playerText: TextView
    private lateinit var droidText: TextView
    private lateinit var winText: TextView

    private var gameInSession: Boolean = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rockButton = findViewById(R.id.rockButton)
        scissorsButton = findViewById(R.id.scissorsButton)
        paperButton = findViewById(R.id.paperButton)
        playAgain = findViewById(R.id.playAgain)
    }

    private fun checkScissorsWin() : Boolean {
        if(playerMove == "scissors" && droidMove == "paper"){
            return true
        }else if(playerMove == "paper" && droidMove == "scissors"){
            return true
        }
        return false
    }

    private fun checkRockWin() : Boolean {
        if (playerMove == "rock" && droidMove == "scissors") {
            return true
        } else if (playerMove == "scissors" && droidMove == "rock"){
            return true
        }
        return false
    }

    private fun checkPaperWin() : Boolean {
        if(playerMove == "paper" && droidMove == "rock"){
            return true
        }else if(playerMove == "rock" && droidMove == "paper"){
            return true
        }
        return false
    }


    private fun checkForWin() : Boolean {
        if(checkScissorsWin()) {
            return true
        } else if (checkRockWin()){
            return true
        } else if (checkPaperWin()){
            return true
        }

        return false
    }

    fun


    while(gameInSession)



}

