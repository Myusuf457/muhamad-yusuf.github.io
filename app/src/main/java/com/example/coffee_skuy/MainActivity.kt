package com.example.coffee_skuy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.coffee_skuy.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(HomeFragment())

        binding.bottomNavView.setOnItemSelectedListener {
            when(it.itemId) {
                R.id.id_home -> replaceFragment(HomeFragment())
                R.id.id_minum -> replaceFragment(DrinkFragment())
                R.id.id_makan -> replaceFragment(FoodFragment())
                R.id.id_trending -> replaceFragment(TrendingFragment())
                R.id.id_profile -> replaceFragment(ProfileFragment())

                else -> {
                }
            }
            true
        }
    }

    private fun replaceFragment (fragment: Fragment) {

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        fragmentTransaction.replace(R.id.content, fragment)
        fragmentTransaction.commit()
    }
}