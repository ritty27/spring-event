package com.ritty27.springevent.basic

import mu.KotlinLogging
import org.slf4j.LoggerFactory
import org.springframework.context.ApplicationListener
import org.springframework.stereotype.Component
import java.time.LocalDateTime

@Component
class Consumer2 : ApplicationListener<PracticeEvent> {

    val logger = KotlinLogging.logger { }

    override fun onApplicationEvent(event: PracticeEvent) {
        logger.info { "consumer2: ${LocalDateTime.now()}, message: ${event.message}, thread: ${Thread.currentThread()}" }
    }

}