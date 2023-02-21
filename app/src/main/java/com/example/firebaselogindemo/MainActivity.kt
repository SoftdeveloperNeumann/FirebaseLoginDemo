package com.example.firebaselogindemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.firebaselogindemo.databinding.ActivityMainBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var auth: FirebaseAuth
    private var user : FirebaseUser? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        auth = FirebaseAuth.getInstance()
        user = auth.currentUser

        if(user == null){
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }else{
            Toast.makeText(this, "Du bist angemeldet", Toast.LENGTH_SHORT).show()
            binding.btnLogout.setOnClickListener {
                auth.signOut()
                if(auth.currentUser == null){
                    Toast.makeText(this, "erfolgreich abgemeldet", Toast.LENGTH_SHORT).show()
                    startActivity(Intent(this, LoginActivity::class.java))
                    finish()
                }
            }
        }
    }
}