package com.tugraz.asd.modernnewsgroupapp

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    lateinit var spnTest : Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))

        spnTest = findViewById(R.id.spnTest) as Spinner

//        val dropdown = findViewById<Spinner>(R.id.spnTest)

        val items : MutableList<String> = ArrayList()

        items.add("tu-graz.at.lv-oad")
        items.add("tu-graz.at.lv-oad")
        items.add("tu-graz.at.lv-oad")

        val adapter :ArrayAdapter<String> = ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, items)


        spnTest.adapter = adapter


    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}


