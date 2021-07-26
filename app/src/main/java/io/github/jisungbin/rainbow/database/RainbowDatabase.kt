/*
 * © 2021 지성빈. all rights reserved.
 * This project license is under the MIT.
 *
 * [RainbowDatabasae.kt] created by Ji Sungbin on 21. 7. 26. 오전 11:02.
 *
 * Please see project github repository license.
 */

package io.github.jisungbin.rainbow.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import io.github.jisungbin.rainbow.database.user.User
import io.github.jisungbin.rainbow.database.user.UserDao

@Database(entities = [User::class], version = 1)
abstract class RainbowDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao

    companion object {
        @Suppress("ObjectPropertyName")
        private lateinit var _instance: RainbowDatabase

        fun instance(context: Context): RainbowDatabase {
            if (!::_instance.isInitialized) {
                _instance = synchronized(RainbowDatabase::class) {
                    Room.databaseBuilder(
                        context,
                        RainbowDatabase::class.java,
                        "users.db"
                    ).fallbackToDestructiveMigration()
                        .build()
                }
            }
            return _instance
        }
    }
}