package com.andrewgiang.biometric

import androidx.biometrics.BiometricPrompt
import androidx.fragment.app.FragmentActivity
import com.facebook.react.bridge.*

class RNBiometricPromptModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(reactContext) {


    override fun getName(): String {
        return "RNBiometricPrompt"
    }

    @ReactMethod
    fun authenticate(reason: String, promptConfig: ReadableMap, reactErrorCallback: Callback, reactSuccessCallback: Callback) {

        val activity = currentActivity

        if (activity is FragmentActivity) {
            val biometricPrompt = BiometricPrompt(activity,
                    MainExecutor(activity),
                    BiometricResultCallback(reactSuccessCallback, reactErrorCallback))

            val promptInfo = BiometricPrompInfo(reason, promptConfig).create()

            biometricPrompt.authenticate(promptInfo)
        } else {
            reactErrorCallback.invoke(BiometricConstants.NOT_SUPPORTED, "Must use androidx and change your activity to ReactFragmentActivity")
        }
    }


}