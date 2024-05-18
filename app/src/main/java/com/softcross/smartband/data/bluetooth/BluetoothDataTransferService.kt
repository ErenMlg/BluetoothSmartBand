package com.softcross.smartband.data.bluetooth

import android.bluetooth.BluetoothSocket
import com.softcross.smartband.domain.bluetooth.ConnectionResult
import com.softcross.smartband.domain.bluetooth.TransferFailedException
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import java.io.IOException

class BluetoothDataTransferService(
    private val socket: BluetoothSocket
) {
    fun listenForIncomingDistance(): Flow<ConnectionResult> {
        return flow {
            if (!socket.isConnected) {
                return@flow
            }
            val buffer = ByteArray(1024)
            while (true) {
                val byteCount = try {
                    socket.inputStream.read(buffer)
                } catch (e: IOException) {
                    throw TransferFailedException()
                }
                emit(ConnectionResult.TransferSucceeded(buffer.decodeToString(endIndex = byteCount)))
            }
        }.flowOn(Dispatchers.IO)
    }
}