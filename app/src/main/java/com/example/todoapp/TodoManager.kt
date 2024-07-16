package com.example.todoapp

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.Instant
import java.util.Date

object TodoManager {
    private val todoList = mutableListOf<TodoData>()

    fun getAllTodo(): List<TodoData>{
        return todoList
    }
    @RequiresApi(Build.VERSION_CODES.O)
    fun addTodo(title : String){
        todoList.add(TodoData(System.currentTimeMillis().toInt(),title, Date.from(Instant.now())))
    }
    fun deleteTodo(id : Int){
        todoList.removeIf { it.id == id }
    }
}