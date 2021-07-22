/*
 * © 2021 지성빈. all rights reserved.
 * This project license is under the MIT.
 *
 * [MainActivity.kt] created by Ji Sungbin on 21. 7. 22. 오후 10:34.
 *
 * Please see project github repository license.
 */

package io.github.jisungbin.rainbow

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import io.github.jisungbin.rainbow.databinding.ActivityMainBinding
import io.github.jisungbin.rainbow.user.getNewUser

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        lifecycleScope.launchWhenCreated {
            println(getNewUser())
        }
    }
}
