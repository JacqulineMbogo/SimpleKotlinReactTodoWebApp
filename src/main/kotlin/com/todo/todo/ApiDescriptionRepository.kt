package com.todo.todo

import com.todo.todo.entities.CallsDescriptions
import org.springframework.data.jpa.repository.JpaRepository

interface ApiDescriptionRepository : JpaRepository<CallsDescriptions, Long> {

}