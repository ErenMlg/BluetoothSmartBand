package com.softcross.smartband.domain.bluetooth

sealed interface ConnectionResult {
    object ConnectionEstablished : ConnectionResult
    data class TransferSucceeded(val distance: String) : ConnectionResult
    data class Error(val message: String) : ConnectionResult
}