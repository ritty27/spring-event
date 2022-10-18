package com.ritty27.springevent.basic

import org.springframework.context.ApplicationEvent

data class PracticeEvent(
    val message: String
) : ApplicationEvent(message)