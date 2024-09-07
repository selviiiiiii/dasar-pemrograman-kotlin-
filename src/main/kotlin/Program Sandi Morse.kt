fun main(args: Array<String>) {
    // split() and joinToString()
    // Morse code decoder

    // The string which we want to decode
    val s = ".. -.-. - ... --- -.-. .. .- .-.."
    println("The original message: $s")

    // The string with the decoded message
    var message = ""

    // Array definitions
    val alphabetChars = "abcdefghijklmnopqrstuvwxyz"
    val morseChars = arrayOf(
        ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-",
        ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-",
        ".--", "-..-", "-.--", "--.."
    )

    // Splitting the string into Morse characters
    val characters = s.split(" ")

    // Iterating over Morse characters
    for (morseChar in characters) {
        val index = morseChars.indexOf(morseChar)
        // Character was found
        if (index != -1) {
            message += alphabetChars[index]
        }
    }

    println("The decoded message: $message")
}
