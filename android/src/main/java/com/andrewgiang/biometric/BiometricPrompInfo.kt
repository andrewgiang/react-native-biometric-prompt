package com.andrewgiang.biometric

import androidx.biometrics.BiometricPrompt
import com.facebook.react.bridge.ReadableMap

class BiometricPrompInfo(title: String, promptConfig: ReadableMap) {
    companion object {
        const val KEY_NEGATIVE_TEXT = "negativeText"
        const val KEY_DESCRIPTION = "description"
        const val KEY_SUBTITLE = "subtitle"
        const val DEFAULT_NEGATIVE_TEXT = "Cancel"
    }

    val builder: BiometricPrompt.PromptInfo.Builder = BiometricPrompt.PromptInfo.Builder()
            .setTitle(title)

    init {
        if (promptConfig.hasKey(KEY_NEGATIVE_TEXT)) {
            builder.setNegativeButtonText(promptConfig.getString(KEY_NEGATIVE_TEXT))
        } else {
            builder.setNegativeButtonText(DEFAULT_NEGATIVE_TEXT)
        }

        if (promptConfig.hasKey(KEY_DESCRIPTION))
            builder.setDescription(promptConfig.getString(KEY_DESCRIPTION))

        if (promptConfig.hasKey(KEY_SUBTITLE))
            builder.setSubtitle(promptConfig.getString(KEY_SUBTITLE))

    }

    fun create(): BiometricPrompt.PromptInfo {
        return builder.build()
    }
}