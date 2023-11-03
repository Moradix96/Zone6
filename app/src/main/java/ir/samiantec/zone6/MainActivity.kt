package ir.samiantec.zone6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import ir.samiantec.mylibrary.Zone2Class

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnOpenZone2Demo).setOnClickListener(View.OnClickListener {
            Zone2Class().sayHello(this, "Sina")
        })
    }
}