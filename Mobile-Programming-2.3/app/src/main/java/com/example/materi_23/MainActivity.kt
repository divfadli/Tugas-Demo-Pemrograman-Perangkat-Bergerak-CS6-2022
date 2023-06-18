package com.example.materi_23
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun openCamp(view: View) {
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse("https://www.camping.tools/")
        startActivity(intent)
    }

    fun openCampH(view: View) {
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse("https://www.outdoorgearlab.com/topics/camping-and-hiking/best-camping-gear")
        startActivity(intent)
    }
}
