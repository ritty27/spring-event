package com.ritty27.springevent.generic

data class GenericEvent<T>(
    val what: T,
    var success: Boolean
)