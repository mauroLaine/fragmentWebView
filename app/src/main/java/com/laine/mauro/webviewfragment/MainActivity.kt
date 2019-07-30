package com.laine.mauro.webviewfragment

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_load.setOnClickListener {
            supportFragmentManager.beginTransaction().add(R.id.fragment_container, WebFragment()).commit()
        }
    }

    companion object {
        val WEB_VIEW_URL = "http://www.google.com"
    }
}
