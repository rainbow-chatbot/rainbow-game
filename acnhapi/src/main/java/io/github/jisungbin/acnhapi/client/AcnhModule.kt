/*
 * © 2021 지성빈. all rights reserved.
 * This project license is under the MIT.
 *
 * [AcnhModule.kt] created by Ji Sungbin on 21. 7. 22. 오후 11:58.
 *
 * Please see project github repository license.
 */

package io.github.jisungbin.acnhapi.client

import io.github.jisungbin.acnhapi.repo.AcnhRepo
import io.github.jisungbin.acnhapi.repo.AcnhRepoImpl
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

internal object AcnhModule {
    private const val BaseUrl = "https://acnhapi.com"

    private fun provideHttpLoggingInterceptor() = HttpLoggingInterceptor().apply {
        level = HttpLoggingInterceptor.Level.BODY
    }

    private fun getInterceptor(vararg interceptors: Interceptor): OkHttpClient {
        val builder = OkHttpClient.Builder()
        for (interceptor in interceptors) builder.addInterceptor(interceptor)
        return builder.build()
    }

    private fun provideRetrofit() = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .client(getInterceptor(provideHttpLoggingInterceptor()))
        .baseUrl(BaseUrl)
        .build()

    fun provideRepo(): AcnhRepo = AcnhRepoImpl(provideRetrofit())
}
