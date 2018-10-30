package com.andrewgiang.biometric

import androidx.biometrics.BiometricPrompt
import com.facebook.react.bridge.Callback

class BiometricResultCallback( private val successCallback: Callback, private val errorCallback: Callback) : BiometricPrompt.AuthenticationCallback() {

    override fun onAuthenticationError(errorCode: Int, errString: CharSequence) {
        errorCallback.invoke(BiometricConstants.convert(errorCode), errString)
    }

    override fun onAuthenticationSucceeded(result: BiometricPrompt.AuthenticationResult) {
        successCallback.invoke("Successfully authenticated.")
    }

}
