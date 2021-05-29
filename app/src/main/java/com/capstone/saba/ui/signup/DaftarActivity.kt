package com.capstone.saba.ui.signup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.capstone.saba.R
import com.capstone.saba.databinding.ActivitySignupBinding
import com.capstone.saba.ui.signup.fragment.AFragment

class DaftarActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySignupBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val aFragment = AFragment()
        supportFragmentManager.beginTransaction().add(R.id.frame_container_signup, aFragment)
            .commit()

        supportActionBar?.hide()
    }
}