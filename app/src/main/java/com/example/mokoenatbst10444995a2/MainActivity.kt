package com.example.mokoenatbst10444995a2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    val clean = findViewById<Button>(R.id.btnClean)
    val feed = findViewById<Button>(R.id.btnFeed)
    val play = findViewById<Button>(R.id.btnPlay)
    val welcome = findViewById<EditText>(R.id.editText)
    val play = findViewById<TextView>(R.id.playTextView)
    val clean = findViewById<TextView>(R.id.cleanTextView)
    val feed =findViewById<TextView>(R.id.feedTextView)
    btnFeed.setOnClickListener { if val pet.feed ()}

    btnPlay.setOnClickListener { pet.play () }


    btnClean.setOnClickListener { pet.clean ()}


    { play.text.= "Play" ${pet.play}

    }

    { feed.text = "Feed" $(pet.feed)
    }

    { clean.text= "Clean" $(pet.clean)

    }












}