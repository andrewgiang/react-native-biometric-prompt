package com.andrewgiang.biometric

import androidx.biometrics.BiometricConstants

class BiometricConstants {
    companion object {
        const val NOT_SUPPORTED = "NOT_SUPPORTED"
        private const val LOCKED_OUT = "LOCKED_OUT"
        private const val LOCKED_OUT_PERMANENT = "LOCKED_OUT_PERMANENT"
        private const val CANCELED = "CANCELED"
        private const val NEGATIVE_BUTTON = "NEGATIVE_BUTTON"
        private const val UNABLE_TO_PROCESS= "UNABLE_TO_PROCESS"
        private const val NO_BIOMETRICS= "NO_BIOMETRICS"
        private const val VENDOR= "VENDOR"
        private const val TIMEOUT= "TIMEOUT"
        private const val NO_SPACE = "NO_SPACE"

        fun convert(erroCode: Int): String {
            when (erroCode) {
                BiometricConstants.ERROR_NEGATIVE_BUTTON,
                BiometricConstants.ERROR_USER_CANCELED -> return NEGATIVE_BUTTON
                BiometricConstants.ERROR_UNABLE_TO_PROCESS -> return UNABLE_TO_PROCESS
                BiometricConstants.ERROR_CANCELED -> return CANCELED
                BiometricConstants.ERROR_LOCKOUT -> return LOCKED_OUT
                BiometricConstants.ERROR_LOCKOUT_PERMANENT -> return LOCKED_OUT_PERMANENT
                BiometricConstants.ERROR_NO_BIOMETRICS -> return NO_BIOMETRICS
                BiometricConstants.ERROR_VENDOR -> return VENDOR
                BiometricConstants.ERROR_TIMEOUT -> return TIMEOUT
                BiometricConstants.ERROR_NO_SPACE -> return NO_SPACE
                BiometricConstants.ERROR_HW_NOT_PRESENT -> return NOT_SUPPORTED
                BiometricConstants.ERROR_HW_UNAVAILABLE -> return NOT_SUPPORTED
            }
            return NOT_SUPPORTED
        }
    }


}