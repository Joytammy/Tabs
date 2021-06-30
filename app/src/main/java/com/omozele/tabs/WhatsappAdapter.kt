package com.omozele.tabs

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.omozele.tabs.views.CallsFragment
import com.omozele.tabs.views.ChatFragment
import com.omozele.tabs.views.StatusFragment

class WhatsappAdapter(fm: FragmentManager): FragmentStatePagerAdapter(fm) {
    override fun getPageTitle(position: Int): CharSequence? {
        when(position){
            0 -> return "Chat"
            1 -> return "Status"
            2 -> return "Calls"
            else -> return "Chat"
        }
    }

    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {
        when(position){
            0 -> return ChatFragment()
            1 -> return StatusFragment()
            2 -> return CallsFragment()
            else -> return ChatFragment()
        }
    }
}