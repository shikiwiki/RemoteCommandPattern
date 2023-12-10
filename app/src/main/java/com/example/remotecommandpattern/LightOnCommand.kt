package com.example.remotecommandpattern

class LightOnCommand(private val light: Light) : Command {
    override fun execute() {
        light.on()
    }

    override fun cancel() {
        light.off()
    }
}