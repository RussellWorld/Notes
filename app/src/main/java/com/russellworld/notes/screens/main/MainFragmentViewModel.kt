package com.russellworld.notes.screens.main

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.russellworld.notes.utilits.REPOSITORY

class MainFragmentViewModel(application: Application): AndroidViewModel(application) {
    val allNotes = REPOSITORY.allNotes
    fun signOut(){
        REPOSITORY.signOut()
    }
}