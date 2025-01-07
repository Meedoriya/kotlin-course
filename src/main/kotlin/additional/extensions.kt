package additional

import java.io.File

fun main() {

    val file = File("textFile.txt")
    file.writeToFileAndSend()
}

fun File.writeToFileAndSend() {

    val message = "some message for file"
    createNewFile()
    writeText(message)
    println("message: \"$message\" added to file $name and send")
}