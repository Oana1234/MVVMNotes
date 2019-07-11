package com.example.notes.model.database

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.example.notes.model.Post
import com.example.notes.model.PostDao

@Database(entities = [Post::class], version = 1)
abstract class AppDatabase  : RoomDatabase() {
    abstract fun postDao() : PostDao
}