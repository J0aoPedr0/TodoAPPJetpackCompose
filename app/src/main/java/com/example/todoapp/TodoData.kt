package com.example.todoapp

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.Instant
import java.util.Date

data class TodoData(
    var id: Int,
    var title: String,
    var createdAt: Date
)
