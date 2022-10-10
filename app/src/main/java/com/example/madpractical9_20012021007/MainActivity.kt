package com.example.madpractical9_20012021007

import android.Manifest
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.core.content.PermissionChecker.PERMISSION_GRANTED

class MainActivity : AppCompatActivity() {
    val SMS_PERMISSION_CODE = 110
    private fun requestSMSPermission() {
        if (ActivityCompat.shouldShowRequestPermissionRationale( this, Manifest.permission.READ_SMS)){
            ActivityCompat.requestPermissions(  this, arrayOf(Manifest.permission.READ_SMS,
            Manifest.permission. SEND_SMS ,
            Manifest.permission. RECEIVE_SMS),
                SMS_PERMISSION_CODE)
        }
    }
    private val isSMSReadPermission: Boolean
        get() = ContextCompat.checkSelfPermission( this, Manifest. permission.READ_SMS) == PackageManager.PERMISSION_GRANTED

    private val isSMSWritePermission: Boolean
        get() = ContextCompat.checkSelfPermission( this, Manifest. permission.SEND_SMS) == PackageManager.PERMISSION_GRANTED

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


}