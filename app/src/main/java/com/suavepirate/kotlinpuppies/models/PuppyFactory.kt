package com.suavepirate.kotlinpuppies.models

import android.content.Context
import android.support.v4.content.ContextCompat
import android.graphics.drawable.Drawable



/**
 * Created by adunn on 7/5/17.
 */

class PuppyFactory(private val context: Context) {

    val puppies: ArrayList<Puppy>
        get() {
            val result = ArrayList<Puppy>()
            result.add(Puppy("Harper", getDescription(0), getDrawableByName("puppy1"), false, false, false))
            result.add(Puppy("Lucy", getDescription(1), getDrawableByName("puppy2"), false, true, false))
            result.add(Puppy("Adrian", getDescription(2), getDrawableByName("puppy3"), false, true, false))
            result.add(Puppy("Bella", getDescription(3), getDrawableByName("puppy4"), true, false, true))
            result.add(Puppy("Tildy", getDescription(4), getDrawableByName("puppy5"), true, false, false))
            result.add(Puppy("Apollo", getDescription(5), getDrawableByName("puppy6"), true, true, false))
            result.add(Puppy("Roxie", getDescription(6), getDrawableByName("puppy7"), false, false, false))
            result.add(Puppy("Junior", getDescription(7), getDrawableByName("puppy8"), true, false, true))
            result.add(Puppy("Dede", getDescription(8), getDrawableByName("puppy9"), false, true, false))
            return result
        }

    val activePuppies: ArrayList<Puppy>
        get() {
            val allPuppies = puppies
            val selectedPuppies = ArrayList<Puppy>()
            for (puppy in allPuppies) {
                if (puppy.isActive)
                    selectedPuppies.add(puppy)
            }
            return selectedPuppies
        }


    val bigPuppies: ArrayList<Puppy>
        get() {
            val allPuppies = puppies
            val selectedPuppies = ArrayList<Puppy>()
            for (puppy in allPuppies) {
                if (puppy.isFullGrown)
                    selectedPuppies.add(puppy)
            }
            return selectedPuppies
        }


    val smallPuppies: ArrayList<Puppy>
        get() {
            val allPuppies = puppies
            val selectedPuppies = ArrayList<Puppy>()
            for (puppy in allPuppies) {
                if (!puppy.isFullGrown)
                    selectedPuppies.add(puppy)
            }
            return selectedPuppies
        }

    val leashTrainedPuppies: ArrayList<Puppy>
        get() {
            val allPuppies = puppies
            val selectedPuppies = ArrayList<Puppy>()
            for (puppy in allPuppies) {
                if (puppy.isLeashTrained)
                    selectedPuppies.add(puppy)
            }
            return selectedPuppies
        }

    private fun getDescription(position: Int): String {
        when (position) {
            0 -> return "Hello.  I am called Harper.  My littermates and I traveled all the way from Georgia.  I am ready to find a forever home with someone just like you! Puppies are a lot of fun. I will provide you with hours of entertainment and a lifetime of love. I’m hoping you can teach me how to be an important part of your family. I’ll need lessons on housebreaking, chewing, and basic manners. It shouldn’t take me very long to learn everything because you will love me and be very patient."
            1 -> return "Hello, my name is Lucy and I am a fun loving little girl from Georgia.  My brother Spot and I were born in Georgia, rescued and came here on a van so we could become important members of loving families! I did have a home for about a week, but then came back here when their schedule changed.  I am looking for a home where someone will be home, more than they are out.  This is only for a short time so I can get used to things and get some puppy training in.  I am potty trained and do well with going outside to do my business.  I am also very sweet and enjoy curling up on laps."
            2 -> return "Greetings.  My name is Adrian.  My littermates and I came from Georgia to find forever homes.  Puppies are a lot of fun. I will provide you with hours of entertainment and a lifetime of love. I’m hoping you can teach me how to be an important part of your family. I’ll need lessons on housebreaking, chewing, and basic manners. It shouldn’t take me very long to learn everything because you will love me and be very patient."
            3 -> return "Hi.  I am  Bella AKA. Fiona.  I am sweet, shy and nervous. I had a home for a short while and became good friends with my human daddy.  I was nervous with the young kids in the home and would taunt my human mommy when daddy was not there.  I do love puppies and play gently and sweet with them.  I am ready for a forever home without young kids.  Older respectful kids or teenagers may be okay.  I can tell you that I love to walk in sand on a beach, although I am not too sure about big waves.  I also enjoyed my trip to Salem Willows and loved walking on the boardwalk too."
            4 -> return "Hello.  My name is Tildy and I am a super beautiful gal from Georgia. I am sweet, strong and I enjoy exploring.  I am ready to find a forever home where I can play, sleep and love.  If you are ready to adopt, I am ready to meet you."
            5 -> return "Hi.  My name is Apollo and I am a sweetheart from Georgia.  I know I am going to enjoy my forever home and family life.  We can go exploring at the beach, in the woods or just around the neighborhood.  We can watch baseball on the TV and I promise to root for your favorite team, or we can sit on the porch and watch the sun go down.  Whatever we do I will be happy that we are doing it together."
            6 -> return "Greetings.  My name is Roxie.  My brother Ian and I traveled from Georgia to find forever homes.  I am simply adorable and ready for love."
            7 -> return "Hi.  My name is Junior and I am a rescued pup from Georgia.  I am a bit shy, but my true happy personality comes right out with another dog around.  They really help me with my confidence.  I enjoy running and playing with other dogs, so if you have one that will be big points for me!  When I get to know people, I do like to be petted, but again if you have another dog, this will help me so much faster!  I really am a great boy with tons of wonderful potential.  Come in and meet me today. "
            8 -> return "Greetings.  My name is Dede  I am ready to find a forever home with someone just like you! Puppies are a lot of fun. I will provide you with hours of entertainment and a lifetime of love. I’m hoping you can teach me how to be an important part of your family. I’ll need lessons on housebreaking, chewing, and basic manners. It shouldn’t take me very long to learn everything because you will love me and be very patient."
            else -> return ""
        }
    }

    private fun getDrawableByName(name: String): Drawable {
        val resources = context.getResources()
        val resourceId = resources.getIdentifier(name, "drawable",
                context.getPackageName())
        return ContextCompat.getDrawable(context, resourceId)
    }
}
