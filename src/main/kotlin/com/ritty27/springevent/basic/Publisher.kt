package com.ritty27.springevent.basic

import org.springframework.context.ApplicationEventPublisher
import org.springframework.stereotype.Component

@Component
class Publisher(
    private val applicationEventPublisher: ApplicationEventPublisher
) {

    fun publish(message: String) {
        val event = PracticeEvent(message)
        applicationEventPublisher.publishEvent(event)
    }
}

