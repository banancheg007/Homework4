package mylittlechat.banancheg.com.homework4

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class MyFragmentPagerAdapter(fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager) {
    override fun getItem(position: Int): Fragment {
        return when(position){
            0->DayFragment()
            1->MonthFragment()
            else->SignOfZodiacFragment()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when(position){
            0->return "Days"
            1->return "Month"
            else->return "Signs of zodiac"
        }
    }

    override fun getCount(): Int {
        return TABS_NUMBER
    }

    companion object {
        const val TABS_NUMBER = 3
    }

}