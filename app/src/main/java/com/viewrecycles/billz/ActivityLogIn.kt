package com.viewrecycles.billz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.viewrecycles.billz.databinding.ActivityMainBinding

class ActivityLogIn : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        validateLogIn()

    }
    fun validateLogIn() {

        val UserName =binding. etUserName.text.toString()
        val email =binding. etEmail.text.toString()
        val password =binding. etPassword.text.toString()
        val confirmPassword =binding. etConfirmPassword.text.toString()
        var error=false


        if (UserName.isBlank()) {
            binding. tilUserName.error = "User name is required"
            error=true
        }
        if (email.isBlank()) {
            binding. tilEmail.error = "email is required"
            error=true
        }
        if (password.isBlank()) {
            binding.  tilPassword.error = "password is required"
            error=true
        }
        if (confirmPassword.isBlank()) {
            binding.  tilConfirmPassword.error = "confirm password is required"
            error=true
        }
        if (password != confirmPassword) {
            binding.  tilConfirmPassword.error = "password incorrect"
            error=true
        }

        if (!error){
            Toast.makeText(this,"$UserName $email", Toast.LENGTH_LONG).show()
        }


    }
}