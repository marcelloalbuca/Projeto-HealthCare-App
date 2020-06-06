package com.example.healthcare

import android.content.Context
import android.net.wifi.WifiManager
import com.example.healthcare.controller.IWifiController

class WifiController
    (
    private val context: Context
) : IWifiController {
    override fun isWifiEnabled(): Boolean {
       val wifiManager: WifiManager = context.getSystemService(Context.WIFI_SERVICE) as WifiManager
        return wifiManager.isWifiEnabled
    }
}