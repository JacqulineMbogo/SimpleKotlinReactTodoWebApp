package com.todo.todo.entities

import javax.persistence.*

@Entity
@Table(name = "todo")
class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
     var id: Long? = null

    @Column(name = "title", nullable = false)
    var title: String? = null

    @Column(name = "completed")
    var completed: Boolean? = false
}