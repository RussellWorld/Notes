package com.russellworld.notes.utilits

import com.russellworld.notes.MainActivity
import com.russellworld.notes.database.DataBaseRepository

lateinit var APP_ACTIVITY: MainActivity
const val TYPE_DATABASE = "type_database"
const val TYPE_ROOM = "type_room"
lateinit var REPOSITORY: DataBaseRepository
lateinit var EMAIL: String
lateinit var PASSWORD: String
const val TYPE_FIREBASE = "type_firebase"