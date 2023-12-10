package com.example.remotecommandpattern

fun main() {
    val remote = RemoteControl()

    val kitchenLight = Light("Kitchen")
    val wcLight = Light("WC")
    val garageDoor = GarageDoor("Main Garage")
    val stereo = Stereo("")
    val fan = Fan("Fan")

    val kitchenLightOn = LightOnCommand(kitchenLight)
    val kitchenLightOff = LightOffCommand(kitchenLight)
    val wcLightOn = LightOnCommand(wcLight)
    val wcLightOff = LightOffCommand(wcLight)
    val garageDoorOn = GarageDoorOnCommand(garageDoor)
    val garageDoorOff = GarageDoorOffCommand(garageDoor)
    val stereoOnWithCD = StereoOnWithCDCommand(stereo)
    val stereoOff = StereoOffCommand(stereo)
    val fanHigh = FanHighCommand(fan)
    val fanMedium = FanMediumCommand(fan)
    val fanLow = FanLowCommand(fan)
    val fanOff = FanOffCommand(fan)

    remote.setCommand(0, kitchenLightOn, kitchenLightOff)
    remote.setCommand(1, wcLightOn, wcLightOff)
    remote.setCommand(2, garageDoorOn, garageDoorOff)
    remote.setCommand(3, stereoOnWithCD, stereoOff)
    remote.setCommand(4, fanLow, fanOff)
    remote.setCommand(5, fanMedium, fanOff)
    remote.setCommand(6, fanHigh, fanOff)

    remote.onButtonWasPushed(0)
    remote.offButtonWasPushed(0)
    remote.cancelButtonWasPushed()

    remote.onButtonWasPushed(1)
    remote.offButtonWasPushed(1)

    remote.onButtonWasPushed(2)
    remote.offButtonWasPushed(2)

    remote.onButtonWasPushed(3)
    remote.cancelButtonWasPushed()
    remote.offButtonWasPushed(3)

    remote.onButtonWasPushed(5)
    remote.offButtonWasPushed(5)
    remote.cancelButtonWasPushed()
}