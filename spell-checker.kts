#!/usr/bin/env kscript

var file :File

for (arg in args) {
    file = File(arg)
    if(file.exists()) {
        sentFileToEchantAndReturnResult(file)
    } else {
      print("File $arg not found")
    }        
}

fun sentFileToEchantAndReturnResult(val file: File) :String {
    val processBuilder = ProcessBuilder("enchant", "-L", file.getAbsolutePath())
}
