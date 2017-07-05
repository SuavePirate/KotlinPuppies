package com.suavepirate.kotlinpuppies.adapters

import android.support.v7.widget.RecyclerView
import com.suavepirate.kotlinpuppies.models.PuppyHolder
import com.suavepirate.kotlinpuppies.R.layout.puppy_item
import android.view.LayoutInflater
import android.widget.LinearLayout
import android.view.ViewGroup
import com.suavepirate.kotlinpuppies.R
import com.suavepirate.kotlinpuppies.models.Puppy



/**
 * Created by adunn on 7/5/17.
 */

class PuppyAdapter(private val puppies: ArrayList<Puppy>) : RecyclerView.Adapter<PuppyHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PuppyHolder {
        val puppyItem = LayoutInflater.from(parent.context).inflate(R.layout.puppy_item, parent, false) as LinearLayout
        return PuppyHolder(puppyItem)
    }

    override fun onBindViewHolder(holder: PuppyHolder, position: Int) {
        holder.updateWithPuppy(puppies[position])
    }

    override fun getItemCount(): Int {
        return puppies.toArray().count();
    }

}
