package com.github.novotnyr.drink

import java.io.Serializable
import java.util.*

data class Drink(val id: UUID = UUID.randomUUID()) : Serializable