package com.benigno.club_eden

import android.annotation.SuppressLint
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_main.wb_webview

class MainActivity : AppCompatActivity() {

    private lateinit var binding: MainActivity

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        webViewSetup()
    }

    @RequiresApi(Build.VERSION_CODES.O)
    @SuppressLint("SetJavaScriptEnabled")
    private fun webViewSetup(){
        wb_webview.webViewClient = WebViewClient()

        wb_webview.apply {
            loadUrl( "https://clubedenperu.com/")
            settings.javaScriptEnabled = true
            settings.safeBrowsingEnabled = true
        }
    }
}