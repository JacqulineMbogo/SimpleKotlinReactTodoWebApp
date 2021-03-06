package com.todo.todo.controllers

import com.todo.todo.TodoRepository
import com.todo.todo.entities.Todo
import org.springframework.data.repository.findByIdOrNull
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/todos")
class TodoController(val todoRepository: TodoRepository) {

    @PostMapping
    fun newTodo(@RequestBody todo: Todo): Todo {
        return todoRepository.save(todo)
    }

    @GetMapping
    fun getTodos()  = todoRepository.findAll()

    @GetMapping("/{todoId}")
    fun getTodoId(@PathVariable("todoId") todoId: Long):Optional<Todo>  {
        return todoRepository.findById(todoId)
    }

    @PutMapping("/{todoId}")
    fun updateTodo(@PathVariable("todoId") todoId: Long, @RequestBody updatedTodo:Todo):Todo? {
        val oldTodo = todoRepository.findByIdOrNull(todoId)
        if(oldTodo == null){
            return oldTodo;
        }
        return todoRepository.save(updatedTodo)
    }

    @DeleteMapping("/{todoId}")
    fun deleteTodo(@PathVariable("todoId") todoId: Long){
      todoRepository.deleteById(todoId)
    }

}