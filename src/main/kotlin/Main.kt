import java.lang.System.exit
import java.util.*

val scanner = Scanner(System.`in`)

fun main(args: Array<String>){
    runMenu()
}

fun mainMenu() : Int {
    println("")
    println("--------------------")
    println("NOTE KEEPER APP")
    println("--------------------")
    println("NOTE MENU")
    println("  1) Add a note")
    println("  2) List all notes")
    println("  3) Update a note")
    println("  4) Delete a note")
    println("-------------------")
    println("  0 Exit")
    println("-------------------")
    println("==>> ")
    return scanner.nextInt()
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
            else -> println("Invalid option entered:" + option)
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



