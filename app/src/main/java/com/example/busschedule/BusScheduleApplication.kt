package com.example.busschedule

import android.app.Application
import com.example.busschedule.database.AppDatabase

// The symbol ':' inherits from what is on the right-hand side
class BusScheduleApplication : Application() {
    val database: AppDatabase by lazy { AppDatabase.getDatabase(this) }
}