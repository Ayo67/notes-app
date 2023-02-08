import utils.ScannerInput
import java.lang.System.exit




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
    println("You chose Delete Note")
}

fun updateNote() {
    println("You chose Update Note")
}

fun addNote() {
    println("You chose Add note")
}
fun listNote() {
    println("You chose Delete Note")
}



