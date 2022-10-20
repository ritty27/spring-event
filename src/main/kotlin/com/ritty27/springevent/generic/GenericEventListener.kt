package com.ritty27.springevent.generic

import mu.KotlinLogging
import org.springframework.context.event.EventListener
import org.springframework.stereotype.Component
import java.time.LocalDateTime

@Component
class GenericEventListener {

    val logger = KotlinLogging.logger { }

    @EventListener
    fun handleEvent(event: GenericEvent<Any>) {
        logger.info { "generic consumer: ${LocalDateTime.now()}, thread: ${Thread.currentThread()}, " +
                "message: ${event.what}, message type: ${event.what.javaClass}, success: ${event.success}" }
    }
}