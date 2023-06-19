package com.i.healthybackend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HealthyBackendApplication

fun main(args: Array<String>) {
    runApplication<HealthyBackendApplication>(*args)
}
