package com.me.bui.samplekotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toastMe(view: View) {
        Toast.makeText(this, "Toast me!", Toast.LENGTH_LONG).show()
    }

    fun countMe(view: View) {
        var count = Integer.parseInt(textView.text.toString())
        count ++
        textView.text = count.toString()
    }

    fun randomMe(view: View) {
        val intentRandom = Intent(this, SecondActivity::class.java)
        var count = Integer.parseInt(textView.text.toString())
        intentRandom.putExtra(SecondActivity.TOTAL_COUNT, count)
        startActivity(intentRandom)
    }
}
