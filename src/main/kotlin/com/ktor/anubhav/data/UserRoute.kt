package com.ktor.anubhav.data

import kotlinx.serialization.Serializable

@Serializable
data class UserRoute(
    val uid: String = "",
    val username: String = "",
    val fullname: String = "",
    val dob: String = "",
)