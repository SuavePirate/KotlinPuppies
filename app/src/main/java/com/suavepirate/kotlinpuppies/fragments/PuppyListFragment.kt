package com.suavepirate.kotlinpuppies.fragments

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.suavepirate.kotlinpuppies.R
import com.suavepirate.kotlinpuppies.adapters.PuppyAdapter
import com.suavepirate.kotlinpuppies.models.Puppy
import com.suavepirate.kotlinpuppies.models.PuppyFactory
import com.suavepirate.kotlinpuppies.models.PuppyListType



class PuppyListFragment(passedContext: Context) : Fragment(){

    val puppyFactory : PuppyFactory = PuppyFactory(passedContext)
    val ARG_LIST_TYPE = "LIST_TYPE"
    val passThroughContext : Context = passedContext


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val rootView = inflater!!.inflate(R.layout.fragment_main, container, false)
        val recyclerView = rootView.findViewById<RecyclerView>(R.id.puppyRecyclerView) as RecyclerView
        val listType = this.arguments.getSerializable(ARG_LIST_TYPE) as PuppyListType
        var puppies = ArrayList<Puppy>()
        when (listType) {
            PuppyListType.All -> puppies = puppyFactory.puppies
            PuppyListType.Active -> puppies = puppyFactory.activePuppies
            PuppyListType.LeashTrained -> puppies = puppyFactory.leashTrainedPuppies
            PuppyListType.Big -> puppies = puppyFactory.bigPuppies
            PuppyListType.Small -> puppies = puppyFactory.smallPuppies
        }

        recyclerView.adapter = PuppyAdapter(puppies)
        recyclerView.layoutManager = LinearLayoutManager(passThroughContext)
        return rootView
    }

    companion object {
        val ARG_LIST_TYPE = "LIST_TYPE"

        fun newInstance(listType: PuppyListType, context: Context): PuppyListFragment {
            val fragment = PuppyListFragment(context)
            val args = Bundle()
            args.putSerializable(ARG_LIST_TYPE, listType)
            fragment.arguments = args
            return fragment
        }
    }


}