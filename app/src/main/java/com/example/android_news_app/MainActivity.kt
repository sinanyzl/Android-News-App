package com.example.android_news_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.net.Uri
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.app.ActionBar
import androidx.browser.customtabs.CustomTabsIntent
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest

class MainActivity : AppCompatActivity() {
    private lateinit var mAdapter: NewsListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//
        setContentView(R.layout.activity_main)


        supportActionBar?.displayOptions = ActionBar.DISPLAY_SHOW_CUSTOM;
        supportActionBar?.setCustomView(R.layout.action_bar_layout);


        var my_recyclerview: RecyclerView = findViewById(R.id.my_recyclerview)
        my_recyclerview.layoutManager = LinearLayoutManager(this)

        fetchData()
        mAdapter = NewsListAdapter(this)

        // linking adapter with recycler view
        my_recyclerview.adapter = mAdapter
    }
}