/*
 * © 2021 지성빈. all rights reserved.
 * This project license is under the MIT.
 *
 * [DatabaseStore.kt] created by Ji Sungbin on 21. 7. 26. 오전 11:17.
 *
 * Please see project github repository license.
 */

package io.github.jisungbin.rainbow.database

import io.github.jisungbin.rainbow.database.user.User

@Suppress("ObjectPropertyName")
object DatabaseStore {
    private val _user = mutableListOf<User>()
    private val user: List<User> get() = _user

    fun addUser(user: User) {
        _user.add(user)
    }

    fun getUserByNameOrNull(sender: String) = user.firstOrNull { it.name == sender }
}