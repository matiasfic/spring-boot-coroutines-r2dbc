package com.matias.coroutinesr2dbc.controller

import com.matias.coroutinesr2dbc.PersonService
import com.matias.coroutinesr2dbc.model.Person
import com.matias.coroutinesr2dbc.repository.PersonRepository
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("persons")
class PersonController(private val personService: PersonService) {

    @GetMapping
    suspend fun findAll(@RequestParam name: String?) = personService.findAll(name)

    @GetMapping("{id}")
    suspend fun findById(@PathVariable id: Int) = ResponseEntity.of(personService.findById(id))

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    suspend fun create(@RequestBody person: Person) = personService.create(person)

    @PutMapping("{id}")
    suspend fun save(
        @PathVariable id: Int,
        @RequestBody person: Person
    ) = personService.save(id, person)

    @DeleteMapping("{id}")
    suspend fun delete(@PathVariable id: Int) = personService.deleteById(id)
}