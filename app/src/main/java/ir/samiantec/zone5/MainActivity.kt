package ir.samiantec.zone5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import ir.samiantec.mylibrary.Zone1Class

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnOpenZone1Demo).setOnClickListener(View.OnClickListener {
            Zone1Class().sayHello(this, "Sina")
        })
    }
}