package com.example.thutoapp


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button



class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        val button: Button = findViewById(R.id.button3)
        button.setOnClickListener {
            val intent = Intent(this, TakePictureActivity::class.java)
            startActivity(intent)

        }
        shareProfile.setOnClickListner {
            this.shareProfile(user: User)
        }
    }
    fun shareProfile (user : User)
    val SendIntent: Intent().apply
    {
        action = Intent.ACTION_SEND
        putExtra(Intent.EXTRA_TEXT,user.name)
        tune = "text/plain"

    }
    val shareIntent = Intent.createrChooser(sendIntent, title null)
    startActivity(shareIntent)

}}