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
import io.github.jisungbin.acnhapi.AcnhApi
import io.github.jisungbin.acnhapi.AcnhResult
import io.github.jisungbin.acnhapi.models.villager.Villager
import io.github.jisungbin.rainbow.databinding.ActivityMainBinding
import kotlinx.coroutines.flow.collect

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        lifecycleScope.launchWhenCreated {
            AcnhApi.instance.getVillagers().collect { result ->
                println(
                    when (result) {
                        is AcnhResult.Success -> (result.response as Villager).random()
                        is AcnhResult.Error -> result.exception.message
                    }
                )
            }
        }
    }
}
