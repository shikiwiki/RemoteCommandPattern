package com.example.remotecommandpattern

class FanMediumCommand(private val fan: Fan, private var prevSpeed: Int = 0) : Command {
    override fun execute() {
        prevSpeed = fan.speed
        fan.medium()
    }

    override fun cancel() {
        when(prevSpeed) {
            Fan.HIGH -> fan.high()
            Fan.MEDIUM -> fan.medium()
            Fan.LOW -> fan.low()
            else -> fan.off()
        }
    }
}