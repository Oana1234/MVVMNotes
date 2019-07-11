package com.example.notes.base

import android.arch.lifecycle.ViewModel
import com.example.notes.di.component.DaggerViewModelInjector
import com.example.notes.di.component.ViewModelInjector
import com.example.notes.di.module.NetworkModule
import com.example.notes.ui.post.PostViewModel
import com.example.notes.ui.post.PostListViewModel

abstract class BaseViewModel : ViewModel() {
    private val injector : ViewModelInjector = DaggerViewModelInjector
        .builder()
        .networkModule(NetworkModule)
        .build()

    init {
        inject()
    }

    private fun inject() {
        when (this) {
            is PostListViewModel -> injector.inject(this)
            is PostViewModel -> injector.inject(this)
        }
    }
}