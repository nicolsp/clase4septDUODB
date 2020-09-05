package com.example.clase4sept.database

import androidx.room.*
import com.example.clase4sept.database.Tareas

@Dao
interface TareasDao {
    //insertar un objeto en la tabla
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertOneTareas(mtareas: Tareas)

    //insertar multiples objetos tareas en la tabla
    fun insertMultiplesTareas(mtareas: Tareas)

    @Update
    fun updateOneTareas(mtareas: Tareas)

    @Delete
    fun deteleOndeTareas(mtareas: Tareas)

    //mostrar tabla en orden ascendente
    @Query("SELECT * FROM table_tareas ORDER BY id ASC")
    fun getAllTareasFromDb(): List<Tareas>

    //encontrar un elemtno por su ID
    @Query("SELECT * FROM table_tareas WHERE id =:id")
    fun getOneTareasByID(id: Int): Tareas




}