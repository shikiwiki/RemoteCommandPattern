package com.example.remotecommandpattern

class LightOffCommand(private val light: Light) : Command {
    override fun execute() {
        light.off()
    }

    override fun cancel() {
        light.on()
    }
}