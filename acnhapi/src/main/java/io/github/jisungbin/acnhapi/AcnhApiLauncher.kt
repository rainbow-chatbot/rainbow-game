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
import android.content.ContentValues
import android.database.Cursor
import android.net.Uri
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

internal class AcnhApiLauncher : ContentProvider() {
    override fun onCreate(): Boolean {
        DataStore.villagers.clear()
        DataStore.items.clear()

        CoroutineScope(Dispatchers.IO).launch {
            AcnhApi.run {
                println(getVillagers().getOrNull())
                println(getItems().getOrNull())
            }
        }
        return true
    }

    override fun query(
        uri: Uri,
        projection: Array<out String>?,
        selection: String?,
        selectionArgs: Array<out String>?,
        sortOrder: String?
    ): Cursor? = null

    override fun getType(uri: Uri): Nothing? = null

    override fun insert(uri: Uri, values: ContentValues?) = uri

    override fun delete(uri: Uri, selection: String?, selectionArgs: Array<out String>?) = 0

    override fun update(
        uri: Uri,
        values: ContentValues?,
        selection: String?,
        selectionArgs: Array<out String>?
    ) = 0
}