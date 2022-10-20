package com.ritty27.springevent.generic

import mu.KotlinLogging
import org.springframework.context.ApplicationEventPublisher
import org.springframework.stereotype.Component
import java.time.LocalDateTime

@Component
class GenericPublisher<T>(
    private val applicationEventPublisher: ApplicationEventPublisher
) {

    val logger = KotlinLogging.logger { }

    fun publish(message: T) {
        val event = GenericEvent(message, true)
        logger.info { "generic publisher: ${LocalDateTime.now()}, message: ${event}, thread: ${Thread.currentThread()}" }

        applicationEventPublisher.publishEvent(event)
    }
}

