package com.example.remotecommandpattern

class GarageDoorOff(private val garageDoor: GarageDoor) : Command {
    override fun execute() {
        garageDoor.off()
    }
}