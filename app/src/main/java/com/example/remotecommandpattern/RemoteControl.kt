package com.example.remotecommandpattern

class RemoteControl {
    private lateinit var noCommand: Command
    private var cancelCommand = noCommand
    private var onCommands: Array<Command> = Array(10) { _ -> noCommand }
    private var offCommands: Array<Command> = Array(10) { _ -> noCommand }

    fun setCommand(slot: Int, onCommand: Command, offCommand: Command) {
        onCommands[slot] = onCommand
        offCommands[slot] = offCommand
    }

    fun onButtonWasPushed(slot: Int) {
        onCommands[slot].execute()
        cancelCommand = onCommands[slot]
    }

    fun offButtonWasPushed(slot: Int) {
        offCommands[slot].execute()
        cancelCommand = offCommands[slot]
    }

    fun cancelButtonWasPushed() {
        cancelCommand.cancel()
    }

    override fun toString(): String {
        val stringBuffer = StringBuffer()
        stringBuffer.append(".........Remote Control.........\n")
        onCommands.forEach { c -> stringBuffer.append("Slot: ${c.javaClass.name}") }
        return stringBuffer.toString()
    }
}