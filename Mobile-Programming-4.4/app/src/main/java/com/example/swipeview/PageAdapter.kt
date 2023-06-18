package com.example.swipeview

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class PageAdapter(fm:FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
        return 3;
    }

    override fun getItem(position: Int): Fragment {
        return when(position) {
            1 -> Fragment2()
            2 -> Fragment3()
            else -> Fragment1()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position) {
            1 -> "Tab 2"
            2 -> "Tab 3"
            else -> "Tab 1"
        }
        return super.getPageTitle(position)
    }

}
