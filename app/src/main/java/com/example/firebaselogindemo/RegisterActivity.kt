package com.example.firebaselogindemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.firebaselogindemo.databinding.ActivityLoginBinding

class RegisterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.text = "Registrieren"
        binding.tvToRegister.visibility= View.INVISIBLE
    }
}