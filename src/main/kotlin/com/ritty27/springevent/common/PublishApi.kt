package com.ritty27.springevent.common

import com.ritty27.springevent.basic.Publisher
import com.ritty27.springevent.generic.StringPublisherV1
import com.ritty27.springevent.generic.StringPublisherV2
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class PublishApi(
    private val publisher: Publisher,
    private val stringPublisherV1: StringPublisherV1,
    private val stringPublisherV2: StringPublisherV2,
) {
    @PostMapping("/publish")
    fun publish(@RequestParam message: String) {
        publisher.publish(message)
    }

    @PostMapping("/generic-publish/v1")
    fun genericPublishV1(@RequestParam message: String) {
        stringPublisherV1.publish(message)
    }

    @PostMapping("/generic-publish/v2")
    fun genericPublishV2(@RequestParam message: String) {
        stringPublisherV2.publish(message)
    }
}