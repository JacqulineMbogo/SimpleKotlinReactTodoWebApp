package com.todo.todo

import com.todo.todo.entities.Todo
import org.springframework.data.jpa.repository.JpaRepository

interface TodoRepository: JpaRepository<Todo, Long> {


}