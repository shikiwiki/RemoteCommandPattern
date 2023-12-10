package com.example.remotecommandpattern

class Fan(val name: String, var speed: Int = OFF) {
    companion object {
        const val HIGH = 3
        const val MEDIUM = 2
        const val LOW = 1
        const val OFF = 0
    }

    fun high() {
        speed = HIGH
    }

    fun medium() {
        speed = MEDIUM
    }

    fun low() {
        speed = LOW
    }

    fun off() {
        speed = OFF
    }
}

