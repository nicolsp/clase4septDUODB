package com.example.clase4sept.database

import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey
import org.jetbrains.annotations.NotNull

@Entity(tableName = "table_tareas")
data class Tareas(
            @PrimaryKey(autoGenerate = true)
            @NotNull
                  val id: Int,
                  val tareas: String,
            @Ignore
                  val completeTareas: Boolean)