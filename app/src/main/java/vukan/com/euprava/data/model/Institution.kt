package vukan.com.euprava.data.model

import java.util.*

data class Institution(
    val institutionID: String,
    val name: String,
    val place: String,
    val address: String,
    val workingTime: Date
)