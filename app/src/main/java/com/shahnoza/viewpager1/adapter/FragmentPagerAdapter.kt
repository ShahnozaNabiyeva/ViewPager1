package com.shahnoza.viewpager1.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.shahnoza.viewpager1.FirstFragment

class FragmentPagerAdapter(fm:FragmentManager,val list: List<User>):
    androidx.fragment.app.FragmentPagerAdapter(fm,
    BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT){




    override fun getCount(): Int {

        return list.size

    }

    override fun getItem(position: Int): Fragment {

        return FirstFragment.newInstance(list[position].name!!,list[position].imageUrl!!)
    }
}