package ua.nure.service

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer

@SpringBootApplication
@EnableEurekaServer
@EnableResourceServer
class ServiceApplication

fun main(args: Array<String>) {
    runApplication<ServiceApplication>(*args)
}
