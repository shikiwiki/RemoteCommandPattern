package com.example.remotecommandpattern

interface Command {
    fun execute() {}
    fun cancel() {}
}
