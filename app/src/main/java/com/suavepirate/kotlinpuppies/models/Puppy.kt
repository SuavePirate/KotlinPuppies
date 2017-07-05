package com.suavepirate.kotlinpuppies.models


import android.graphics.drawable.Drawable

/**
 * Created by adunn on 6/15/17.

 * Data model for a Puppy
 */

class Puppy(var name: String, var description: String, var imageFile: Drawable, var isFullGrown: Boolean, var isLeashTrained: Boolean, var isActive: Boolean)
