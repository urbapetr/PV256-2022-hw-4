package cz.muni.fi.pv256.hw4

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // TODO
        // 1. init live data
        // 2. start observing for count values and update counter accordingly
        // 3. set onClickListeners for buttons

        val decrementBtn = findViewById<Button>(R.id.decrement)
        decrementBtn.setOnClickListener {
            // TODO
        }

        val incrementBtn = findViewById<Button>(R.id.increment)
        incrementBtn.setOnClickListener {
            // TODO
        }
    }
}
