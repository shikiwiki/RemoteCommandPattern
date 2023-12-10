package com.example.remotecommandpattern

class GarageDoorOffCommand(private val garageDoor: GarageDoor) : Command {
    override fun execute() {
        garageDoor.off()
    }

    override fun cancel() {
        garageDoor.on()
    }
}