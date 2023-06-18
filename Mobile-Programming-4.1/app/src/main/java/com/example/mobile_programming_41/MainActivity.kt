package com.example.mobile_programming_41

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun displayToast(message: String?) {
        Toast.makeText(applicationContext, message, Toast.LENGTH_SHORT).show()
    }

    fun showTent(view: View?){
        displayToast(getString(R.string.tent_order_message))
    }
    fun showSb(view: View?){
        displayToast(getString(R.string.sb_order_message))
    }
    fun showMattress(view: View?){
        displayToast(getString(R.string.mattress_order_message))
    }
}