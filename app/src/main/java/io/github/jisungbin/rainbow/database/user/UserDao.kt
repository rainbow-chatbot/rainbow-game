/*
 * © 2021 지성빈. all rights reserved.
 * This project license is under the MIT.
 *
 * [UserDao.kt] created by Ji Sungbin on 21. 7. 26. 오전 11:02.
 *
 * Please see project github repository license.
 */

package io.github.jisungbin.rainbow.database.user

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface UserDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun update(user: User)

    @Delete
    suspend fun delete(user: User)

    @Query("SELECT * FROM User WHERE name = :sender")
    suspend fun getUserFromNameOrNull(sender: String): User?
}