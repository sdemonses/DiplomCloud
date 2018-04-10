package ua.nure.service

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController("routes")
class RouteController {

    @GetMapping("")
    fun hello(): String {
        return "helloBeaches"
    }
}
