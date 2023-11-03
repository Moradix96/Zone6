package ir.samiantec.mylibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Zone1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zone1)

        findViewById<TextView>(R.id.tv).text = "Hello " + intent.getStringExtra("name")
    }
}