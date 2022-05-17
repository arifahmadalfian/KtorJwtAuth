package com.arifahmadalfian

import io.ktor.server.application.*
import com.arifahmadalfian.plugins.*
//mongodb+srv://arifahmadalfian:<password>@cluster0.ejtg7.mongodb.net/?retryWrites=true&w=majority
fun main(args: Array<String>): Unit =
    io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused") // application.conf references the main function. This annotation prevents the IDE from marking it as unused.
fun Application.module() {
    configureRouting()
    configureSerialization()
    configureMonitoring()
    configureSecurity()
}
