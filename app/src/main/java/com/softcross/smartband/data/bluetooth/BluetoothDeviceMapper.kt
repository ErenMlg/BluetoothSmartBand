package com.softcross.smartband.data.bluetooth

import android.annotation.SuppressLint
import android.bluetooth.BluetoothDevice
import com.softcross.smartband.domain.bluetooth.BluetoothDeviceDomain

@SuppressLint("MissingPermission")
fun BluetoothDevice.toBluetoothDeviceDomain(): BluetoothDeviceDomain {
    return BluetoothDeviceDomain(
        name = name,
        adress = address
    )
}