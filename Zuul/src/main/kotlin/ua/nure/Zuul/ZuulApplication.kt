package ua.nure.Zuul

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.netflix.zuul.EnableZuulProxy

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
class ZuulApplication

fun main(args: Array<String>) {
    runApplication<ZuulApplication>(*args)
}
