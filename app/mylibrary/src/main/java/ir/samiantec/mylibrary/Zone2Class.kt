package ir.samiantec.mylibrary

import android.content.Context
import android.content.Intent

class Zone2Class {

    fun sayHello(context: Context, name: String) {
        //return "Hello $x"
        val i = Intent(context, Zone2Activity::class.java)
        i.putExtra("name", name)
        context.startActivity(i)
    }
}