package com.example.clase4sept

import com.example.clase4sept.database.Tareas
import com.example.clase4sept.database.TareasDao

class TareasRepository(private val mTareasDao: TareasDao) {

   // este value va a contener todos los datos de la bdd
    val listAllTareas: List<Tareas> = mTareasDao.getAllTareasFromDb()

    //esta funcion va a insertar la info
    fun insertTareas(mTareas: Tareas) {
        mTareasDao.insertOneTareas(mTareas)
    }




}
