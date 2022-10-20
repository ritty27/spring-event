package com.ritty27.springevent.annotation

import com.ritty27.springevent.basic.PracticeEvent
import mu.KotlinLogging
import org.springframework.context.event.EventListener
import org.springframework.stereotype.Component
import java.time.LocalDateTime

@Component
class AnnotationDrivenEventListener {

    val logger = KotlinLogging.logger { }

    // since spring 4.2
    @EventListener
    fun handleContextStart(event: PracticeEvent) {
        logger.info { "annotation consumer: ${LocalDateTime.now()}, message: ${event}, thread: ${Thread.currentThread()}" }
    }
}