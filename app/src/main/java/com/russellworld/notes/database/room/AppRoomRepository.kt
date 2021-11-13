package com.russellworld.notes.database.room

import androidx.lifecycle.LiveData
import com.russellworld.notes.database.DataBaseRepository
import com.russellworld.notes.model.AppNote

class AppRoomRepository(private val appRoomDao: AppRoomDao) : DataBaseRepository {
    override val allNotes: LiveData<List<AppNote>>
        get() = appRoomDao.getAllNotes()

    override suspend fun insert(note: AppNote, onSuccess: () -> Unit) {
        appRoomDao.insert(note)
        onSuccess()
    }

    override suspend fun delete(note: AppNote, onSuccess: () -> Unit) {
        appRoomDao.delete(note)
        onSuccess()
    }

    override fun signOut() {
        super.signOut()
    }

}