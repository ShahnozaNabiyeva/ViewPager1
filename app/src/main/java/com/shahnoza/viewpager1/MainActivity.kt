package com.shahnoza.viewpager1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.viewpager.widget.ViewPager
import com.shahnoza.viewpager1.adapter.FragmentPagerAdapter
import com.shahnoza.viewpager1.adapter.PagerAdapter
import com.shahnoza.viewpager1.adapter.User
import com.shahnoza.viewpager1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var viewPager:ViewPager
    lateinit var list: ArrayList<String>
    lateinit var list2:ArrayList<User>
    lateinit var pagerAdapter: PagerAdapter
    lateinit var fragmentPagerAdapter: FragmentPagerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewPager = findViewById(R.id.myViewPager)
        list=ArrayList()
        list2=ArrayList()
        list.add("Shahnoza")
        list.add("Fragrant")
        pagerAdapter = PagerAdapter(list,this)
        list2.add(User("Shahnoza","https://storage.kun.uz/source/thumbnails/_medium/7/nQOjIed8GxqA0TgQDRG0Cyd5tVtZBwqE_medium.jpg"))
        list2.add(User("Fragrant","https://storage.kun.uz/source/thumbnails/_medium/7/9UA1uQqtVq0fYas_ZPL7PegSXpCjcTk2_medium.jpg"))

        fragmentPagerAdapter= FragmentPagerAdapter(supportFragmentManager,list2)
        viewPager.adapter = pagerAdapter


    }
}