package com.example.remotecommandpattern

class GarageDoorOnCommand(private val garageDoor: GarageDoor) : Command {
    override fun execute() {
       garageDoor.on()
    }

    override fun cancel() {
        garageDoor.off()
    }
}