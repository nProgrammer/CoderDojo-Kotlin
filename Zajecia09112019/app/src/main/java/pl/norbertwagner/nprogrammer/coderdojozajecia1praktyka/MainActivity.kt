package pl.norbertwagner.nprogrammer.coderdojozajecia1praktyka

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun saveBTRClick(v: View) {
        val text = NormalPlainText.text.toString()
        textView.text = text
    }
}

// Napisz aplikacje ktora wypisuje slowo od tylu ktore wpisal uzytkownik