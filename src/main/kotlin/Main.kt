import mu.KotlinLogging
import utils.ScannerInput
import java.lang.System.exit

private val logger = KotlinLogging.logger {}

fun main(args: Array<String>){
    runMenu()
}

fun mainMenu() : Int {
    return ScannerInput.readNextInt(""" 
         > ----------------------------------
         > |        NOTE KEEPER APP         |
         > ----------------------------------
         > | NOTE MENU                      |
         > |   1) Add a note                |
         > |   2) List all notes            |
         > |   3) Update a note             |
         > |   4) Delete a note             |
         > ----------------------------------
         > |   0) Exit                      |
         > ----------------------------------
         > ==>> """.trimMargin(">"))
}


fun runMenu() {
    do {
        val option = mainMenu()
        when (option) {
            1 -> addNote()
            2 -> listNote()
            3 -> updateNote()
            4 -> deleteNote()
            0 -> exitApp()
            else -> println("Invalid option entered:  ${option}")
        }
    } while (true)
}

fun exitApp() {
    println("Exiting...bye")
    exit(0)
}

fun deleteNote() {
    logger.info{ "deleteNote() function invoked"}
}

fun updateNote() {
    logger.info{ "updateNote() function invoked"}
}

fun addNote() {
    logger.info{ "addNote() function invoked"}
}
fun listNote() {
    logger.info{ "listNote() function invoked"}
}



