package com.ritty27.springevent.basic

import mu.KotlinLogging
import org.springframework.context.ApplicationListener
import org.springframework.stereotype.Component
import java.time.LocalDateTime

@Component
class Consumer1 : ApplicationListener<PracticeEvent> {

    val logger = KotlinLogging.logger { }

    override fun onApplicationEvent(event: PracticeEvent) {
        logger.info { "consumer1: ${LocalDateTime.now()}, message: ${event.message}" }
    }

}