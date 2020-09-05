package com.example.clase4sept.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

private const val DATE_BASE_NAME = "tareas_db"
@Database(entities = [Tareas::class ], version = 1)
abstract class TareasDataBase : RoomDatabase() {

    // aca van los dao
    abstract  fun getTareasDao(): TareasDao

    companion object {
        @Volatile
        private var INSTANCE: TareasDataBase? = null

        fun getDataBase(context: Context): TareasDataBase {
            val tempInstance =
                INSTANCE
            if(tempInstance != null) {
                return  tempInstance
            }
            synchronized(this ) {
                val instance = Room.databaseBuilder(context,
                    TareasDataBase::class.java,
                    "DATA_BASE_NAME").build()
                INSTANCE = instance
                return instance
            }
        }
    }
}