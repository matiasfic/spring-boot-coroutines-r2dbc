package com.matias.coroutinesr2dbc.repository

import com.matias.coroutinesr2dbc.model.Person
import kotlinx.coroutines.flow.Flow
import org.springframework.data.r2dbc.repository.Query
import org.springframework.data.repository.kotlin.CoroutineCrudRepository

interface PersonRepository : CoroutineCrudRepository<Person, Int> {
    suspend fun findByNameContains(name: String): Flow<Person>
}