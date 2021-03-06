package com.russellworld.notes.utilits

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.russellworld.notes.MainActivity
import com.russellworld.notes.database.DataBaseRepository

lateinit var AUTH: FirebaseAuth
lateinit var CURRENT_ID: String
lateinit var REF_DATABASE: DatabaseReference
lateinit var APP_ACTIVITY: MainActivity
const val TYPE_DATABASE = "type_database"
const val TYPE_ROOM = "type_room"
lateinit var REPOSITORY: DataBaseRepository
lateinit var EMAIL: String
lateinit var PASSWORD: String
const val TYPE_FIREBASE = "type_firebase"
const val ID_FIREBASE = "idFirebase"
const val NAME = "name"
const val TEXT = "text"