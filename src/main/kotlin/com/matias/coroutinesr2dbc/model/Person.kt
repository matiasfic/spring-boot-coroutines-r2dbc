package com.matias.coroutinesr2dbc.model

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import java.util.*

@Table
data class Person(
    @Id val id: Int? = null,
    val name: String,
    val age: Int
)