package com.example.thutoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.thutoapp.core.android.UserAdapter
import com.example.thutoapp.core.model.User
import com.google.firebase.firestore.FirebaseFirestore

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        val firebaseFirestore = FirebaseFirestore.getInstance()
        firebaseFirestore.collection("users")
        
            

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val users = ArrayList<User>()

        users.add(User(name = "mpumelelo",roleName = "student", profileUrl = "http://Github.com/mpumelelo-dev"))
        users.add(User(name = "Spume",roleName = "learner", profileUrl = "http://Github.com/mpumelelo-dev"))
        val adapter = UserAdapter(users)
        recyclerView.adapter = adapter

        val button : Button = findViewById(R.id.button2)
        button.setOnClickListener{
            val intent = Intent (this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }


    }



