package com.example.remotecommandpattern

class GroupCommand(private vararg val commands: Command) : Command {
    override fun execute() {
        commands.forEach { c -> c.execute() }
    }

    override fun cancel() {
        commands.forEach { c -> c.cancel() }
    }
}