package com.andrewgiang.biometric

import android.content.Context
import android.os.Handler

import com.facebook.common.internal.Preconditions

import java.util.concurrent.Executor
import java.util.concurrent.RejectedExecutionException



class MainExecutor(context: Context) : Executor {
    private val mHandler: Handler

    init {
        mHandler = Preconditions.checkNotNull(Handler(context.mainLooper))
    }

    override fun execute(command: Runnable) {
        if (!mHandler.post(command)) {
            throw RejectedExecutionException(mHandler.toString() + " is shutting down")
        }
    }
}
