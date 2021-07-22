/*
 * © 2021 지성빈. all rights reserved.
 * This project license is under the MIT.
 *
 * [Util.kt] created by Ji Sungbin on 21. 7. 23. 오전 3:42.
 *
 * Please see project github repository license.
 */

package io.github.jisungbin.rainbow.util

object Util {
    fun generateUserId(room: String, name: String) =
        (room.hashCode() + name.hashCode())
            .toString().split("").shuffled()
            .take(6).joinToString("").toInt()
}
