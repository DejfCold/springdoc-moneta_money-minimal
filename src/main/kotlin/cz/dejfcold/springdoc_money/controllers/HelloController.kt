package cz.dejfcold.springdoc_money.controllers

import cz.dejfcold.springdoc_money.api.HelloResponse
import org.javamoney.moneta.Money
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("hello")
class HelloController {
    @GetMapping
    fun get(): HelloResponse {
        return HelloResponse(
            money = Money.of(1, "EUR")
        )
    }
}