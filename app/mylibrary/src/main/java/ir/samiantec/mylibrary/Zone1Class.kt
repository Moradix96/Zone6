package ir.samiantec.mylibrary

import android.content.Context
import android.content.Intent

class Zone1Class {

    fun sayHello(context: Context, name: String) {
        //return "Hello $x"
        val i = Intent(context, Zone1Activity::class.java)
        i.putExtra("name", name)
        context.startActivity(i)
    }
}