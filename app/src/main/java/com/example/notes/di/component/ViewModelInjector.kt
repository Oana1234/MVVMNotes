package com.example.notes.di.component

import com.example.notes.di.module.NetworkModule
import com.example.notes.ui.post.PostViewModel
import com.example.notes.ui.post.PostListViewModel
import dagger.Component
import javax.inject.Singleton

@Component( modules = [NetworkModule::class])
@Singleton
interface ViewModelInjector {

    fun inject(postListViewModel: PostListViewModel)

    fun inject(postViewModel: PostViewModel)

    @Component.Builder
    interface Builder {

        fun build(): ViewModelInjector

        fun networkModule(networkModule: NetworkModule): Builder
    }
}