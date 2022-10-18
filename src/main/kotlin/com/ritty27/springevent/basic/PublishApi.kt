package com.ritty27.springevent.basic

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class PublishApi(
    private val publisher: Publisher
) {
    @PostMapping("/publish")
    fun publish(@RequestParam message: String) {
        publisher.publish(message)
    }
}