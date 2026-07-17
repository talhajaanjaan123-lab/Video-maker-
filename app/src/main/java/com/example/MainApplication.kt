package com.example

import android.app.Application
import com.example.api.RetrofitClient
import com.example.repository.Repository

class MainApplication : Application() {

    lateinit var repository: Repository

    override fun onCreate() {
        super.onCreate()
        repository = Repository(RetrofitClient.api)
    }
}
