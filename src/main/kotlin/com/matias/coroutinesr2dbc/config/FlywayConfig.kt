package com.matias.coroutinesr2dbc.config

import org.flywaydb.core.Flyway
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class FlywayConfig(
    @Value("postgres.url") private val url: String,
    @Value("spring.r2dbc.username") private val username: String,
    @Value("spring.r2dbc.password") private val password: String
) {

    @Bean(initMethod = "migrate")
    fun flyway() = Flyway.configure().dataSource("jdbc:$url", username, password)
}