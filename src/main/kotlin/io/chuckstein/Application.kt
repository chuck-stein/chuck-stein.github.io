package io.chuckstein

import io.chuckstein.plugins.configureRouting
import io.chuckstein.plugins.configureSerialization
import io.chuckstein.plugins.configureTemplating
import io.ktor.server.engine.*
import io.ktor.server.netty.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        configureRouting()
        configureSerialization()
        configureTemplating()
    }.start(wait = true)
}
