package ru.tinkoff.allure.android

import android.os.Bundle
import androidx.annotation.Keep
import androidx.test.runner.AndroidJUnitRunner

/**
 * @author Badya on 30.03.2017.
 */

@Suppress("unused")
@Keep
open class AllureAndroidRunner : AndroidJUnitRunner() {
    override fun onCreate(arguments: Bundle) {
        arguments.putCharSequence("listener", AllureAndroidListener::class.java.name)
        super.onCreate(arguments)
    }
}
