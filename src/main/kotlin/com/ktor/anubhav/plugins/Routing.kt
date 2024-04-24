package com.ktor.anubhav.plugins

import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        get("/hello") {
            val username = call.parameters["user"]
            println("username: $username")
            call.respondText("Hello from $username")
        }
         post("/user/upload/") {
             println("data: ${call.parameters.names()}")
            call.respondText("Hello from")
        }
        // Static plugin. Try to access `/static/index.html`
        staticResources("/static/images", "myimages")
    }
}
