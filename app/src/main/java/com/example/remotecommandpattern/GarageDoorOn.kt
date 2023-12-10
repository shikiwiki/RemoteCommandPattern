package com.example.remotecommandpattern

class GarageDoorOn(private val garageDoor: GarageDoor) : Command {
    override fun execute() {
       garageDoor.on()
    }
}