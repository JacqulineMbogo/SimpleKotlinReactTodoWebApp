package com.todo.todo.controllers

import com.todo.todo.ApiDescriptionRepository
import com.todo.todo.entities.CallsDescriptions
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/apis")
class ApisController(val apisRepository: ApiDescriptionRepository) {

    @PostMapping
    fun newApi(@RequestBody api: CallsDescriptions): CallsDescriptions {
        return apisRepository.save(api)
    }

    @GetMapping
    fun getApis()  = apisRepository.findAll()
}