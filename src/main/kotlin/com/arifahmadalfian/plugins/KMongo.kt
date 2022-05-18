package com.arifahmadalfian.plugins

import io.ktor.server.application.*
import org.litote.kmongo.coroutine.coroutine
import org.litote.kmongo.reactivestreams.KMongo

fun Application.configureKMongo() {
    val mongoPw = System.getenv("MONGO_PW")
    val dbName = "ktor-auth"
    val db = KMongo.createClient(
        connectionString = "mongodb+srv://arifahmadalfian:$mongoPw@cluster0.jnehk.mongodb.net/?retryWrites=true&w=majority"
    ).coroutine
        .getDatabase(dbName)
}