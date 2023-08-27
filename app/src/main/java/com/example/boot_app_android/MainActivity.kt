package com.example.boot_app_android

import android.content.Intent
import android.net.Uri
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (!Settings.canDrawOverlays(this)) {
                val uri: Uri = Uri.parse("package:$packageName")
                val i = Intent(Settings.ACTION_MANAGE_OVERLAY_PERMISSION, uri)
                startActivity(i)
            }
        }
    }
}