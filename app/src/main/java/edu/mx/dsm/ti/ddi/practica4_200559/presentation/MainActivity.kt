package edu.mx.dsm.ti.ddi.practica4_200559.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import edu.mx.dsm.ti.ddi.practica4_200559.R
import edu.mx.dsm.ti.ddi.practica4_200559.presentation.MainFragment
import edu.mx.dsm.ti.ddi.practica4_200559.presentation.Screen1Fragment

class MainActivity : AppCompatActivity() {

    private lateinit var viewPager: ViewPager
    private lateinit var pagerAdapter: FragmentPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager = findViewById(R.id.view_pager)
        pagerAdapter = ScreenPagerAdapter(supportFragmentManager)
        viewPager.adapter = pagerAdapter
    }

    inner class ScreenPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

        override fun getCount(): Int {
            return 3
        }

        override fun getItem(position: Int): Fragment {
            return when (position) {
                0 -> MainFragment()
                1 -> Screen1Fragment()
                2 -> Screen2Fragment()
                else -> MainFragment()
            }
        }
    }
}
