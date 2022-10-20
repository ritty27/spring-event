package com.ritty27.springevent.basic

import mu.KotlinLogging
import org.springframework.context.ApplicationEventPublisher
import org.springframework.stereotype.Component
import java.time.LocalDateTime

@Component
class Publisher(
    private val applicationEventPublisher: ApplicationEventPublisher
) {

    val logger = KotlinLogging.logger { }

    fun publish(message: String) {
        val event = PracticeEvent(message)
        logger.info { "producer: ${LocalDateTime.now()}, message: ${event.message}, thread: ${Thread.currentThread()}" }

        applicationEventPublisher.publishEvent(event)
    }
}

