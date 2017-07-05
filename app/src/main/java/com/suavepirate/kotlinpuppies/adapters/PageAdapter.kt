package com.suavepirate.kotlinpuppies.adapters

import android.support.v4.app.Fragment
import com.suavepirate.kotlinpuppies.models.PuppyListType
import com.suavepirate.kotlinpuppies.fragments.PuppyListFragment
import android.support.v4.app.FragmentPagerAdapter
import android.content.Context
import android.support.v4.app.FragmentManager


/**
 * Created by adunn on 7/5/17.
 */
class PageAdapter(fm: FragmentManager, private val context: Context) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        when (position) {
            0 -> return PuppyListFragment.newInstance(PuppyListType.All, context)
            1 -> return PuppyListFragment.newInstance(PuppyListType.Big, context)
            2 -> return PuppyListFragment.newInstance(PuppyListType.Small, context)
            3 -> return PuppyListFragment.newInstance(PuppyListType.LeashTrained, context)
            4 -> return PuppyListFragment.newInstance(PuppyListType.Active, context)
        }
        return PuppyListFragment.newInstance(PuppyListType.All, context)
    }

    override fun getCount(): Int {
        // Show 5 total pages.
        return 5
    }

    override fun getPageTitle(position: Int): CharSequence? {
        // return empty to show no title. Delete this line to show tab titles
        return null
        /* switch (position) {
            case 0:
                return "All";
            case 1:
                return "Big";
            case 2:
                return "Small";
            case 3:
                return "Trained";
            case 4:
                return "Active";
        }
        return null;*/
    }

}
