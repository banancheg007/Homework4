package mylittlechat.banancheg.com.homework4

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.support.design.widget.TabLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myViewPager = pager
        val myTabs = tab

        myViewPager.adapter = MyFragmentPagerAdapter(supportFragmentManager)
        myTabs.setupWithViewPager(myViewPager)
    }
}
