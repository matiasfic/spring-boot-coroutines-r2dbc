package com.matias.coroutinesr2dbc

import com.matias.coroutinesr2dbc.model.Person
import com.matias.coroutinesr2dbc.repository.PersonRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class PersonService(private val personRepository: PersonRepository) {

    suspend fun findAll(name: String?) =
        if (name != null) personRepository.findByNameContains(name) else personRepository.findAll()

    suspend fun findById(id: Int) = Optional.ofNullable(personRepository.findById(id))

    suspend fun create(person: Person) = personRepository.save(person)

    suspend fun save(id: Int, person: Person) = personRepository.save(person.copy(id = id))

    suspend fun deleteById(id: Int) = personRepository.deleteById(id)
}