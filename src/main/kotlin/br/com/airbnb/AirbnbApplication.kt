package br.com.airbnb

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AirbnbApplication

fun main(args: Array<String>) {
	runApplication<AirbnbApplication>(*args)
}
