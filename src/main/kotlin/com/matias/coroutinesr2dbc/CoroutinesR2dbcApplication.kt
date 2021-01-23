package com.matias.coroutinesr2dbc

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CoroutinesR2dbcApplication

fun main(args: Array<String>) {
    runApplication<CoroutinesR2dbcApplication>(*args)
}
