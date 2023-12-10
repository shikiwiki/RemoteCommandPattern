package com.example.remotecommandpattern

fun main() {
    val remote = RemoteControl()

    val kitchenLight = Light("Kitchen")
    val wcLight = Light("WC")
    val garageDoor = GarageDoor("Main Garage")
    val stereo = Stereo("")

    val kitchenLightOn = LightOnCommand(kitchenLight)
    val kitchenLightOff = LightOffCommand(kitchenLight)
    val wcLightOn = LightOnCommand(wcLight)
    val wcLightOff = LightOffCommand(wcLight)
    val garageDoorOn = GarageDoorOn(garageDoor)
    val garageDoorOff = GarageDoorOff(garageDoor)
    val stereoOnWithCDCommand = StereoOnWithCDCommand(stereo)
    val stereoOff = StereoOffCommand(stereo)

    remote.setCommand(0, kitchenLightOn, kitchenLightOff)
    remote.setCommand(1, wcLightOn, wcLightOff)
    remote.setCommand(2, garageDoorOn, garageDoorOff)
    remote.setCommand(3, stereoOnWithCDCommand, stereoOff)

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
}