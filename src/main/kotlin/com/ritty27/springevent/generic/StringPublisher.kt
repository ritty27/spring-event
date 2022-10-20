package com.ritty27.springevent.generic

import org.springframework.context.ApplicationEventPublisher
import org.springframework.stereotype.Component

//v1
@Component
class StringPublisherV1(
    applicationEventPublisher: ApplicationEventPublisher
) : GenericPublisher<String>(applicationEventPublisher)

//v2
@Component
class StringPublisherV2(
    private val genericPublisher: GenericPublisher<String>
) {
    fun publish(message: String) {
        genericPublisher.publish(message)
    }
}