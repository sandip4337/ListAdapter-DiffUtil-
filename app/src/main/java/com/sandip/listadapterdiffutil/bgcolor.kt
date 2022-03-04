package com.sandip.listadapterdiffutil

import android.graphics.drawable.Drawable

object bgcolor{
    private val bg = arrayOf(
        R.drawable.item_blue,
        R.drawable.item_green,
        R.drawable.item_red,
        R.drawable.item_yellow
    )
    var bgindex = 0

    fun getIcon(): Int {
        bgindex = (0..(bg.size)-1).random()
        return bg[bgindex]
    }

}