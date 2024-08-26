package com.shahnoza.viewpager1.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.viewpager.widget.PagerAdapter
import com.shahnoza.viewpager1.R

class PagerAdapter(val list:ArrayList<String>,val context: Context):PagerAdapter() {
  private var layoutInflater:LayoutInflater? = null
    override fun getCount(): Int {
        return list.size-1

    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`

    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        layoutInflater = LayoutInflater.from(context)
        val view = layoutInflater!!.inflate(R.layout.item_pager,container,false)
        val textView: TextView = view.findViewById(R.id.itemI)
        textView.setText(list[position])
        container.addView(view,position)
        return view
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        val view = `object` as View
        container.removeView(view)
    }


}