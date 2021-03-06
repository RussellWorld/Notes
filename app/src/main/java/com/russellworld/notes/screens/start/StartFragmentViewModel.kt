package com.russellworld.notes.screens.start

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.russellworld.notes.database.firebase.AppFirebaseRepository
import com.russellworld.notes.database.room.AppRoomDatabase
import com.russellworld.notes.database.room.AppRoomRepository
import com.russellworld.notes.utilits.REPOSITORY
import com.russellworld.notes.utilits.TYPE_FIREBASE
import com.russellworld.notes.utilits.TYPE_ROOM
import com.russellworld.notes.utilits.showToast

class StartFragmentViewModel(application: Application) : AndroidViewModel(application) {
    private val mContext = application

    fun initDatabase(type: String, onSuccess: () -> Unit) {
        when (type) {
            TYPE_ROOM -> {
                val dao = AppRoomDatabase.getInstance(mContext).getAppRoomDao()
                REPOSITORY = AppRoomRepository(dao)
                onSuccess()
            }
            TYPE_FIREBASE -> {
                REPOSITORY = AppFirebaseRepository()
                REPOSITORY.connectToDatabase({ onSuccess() }, { showToast(it) })
            }
        }
    }
}