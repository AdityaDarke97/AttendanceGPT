package com.mdwc.attendancetracker.models

import java.util.UUID

data class Subject(
    val id: String = UUID.randomUUID().toString(),
    val name: String
)