package com.example.remotecommandpattern

class StereoOffCommand(private val stereo: Stereo) : Command {
    override fun execute() {
        stereo.off()
    }
}