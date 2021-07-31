/*
 * © 2021 지성빈. all rights reserved.
 * This project license is under the MIT.
 *
 * [AcnhApiLauncher.kt] created by Ji Sungbin on 21. 7. 26. 오전 10:47.
 *
 * Please see project github repository license.
 */

package io.github.jisungbin.acnhapi

import android.content.ContentProvider
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

internal abstract class AcnhApiLauncher : ContentProvider() {
    override fun onCreate(): Boolean {
        CoroutineScope(Dispatchers.IO).launch {
            AcnhApi.run {
                println(getItems())
                println(getVillagers())
            }
        }
        return true
    }
}