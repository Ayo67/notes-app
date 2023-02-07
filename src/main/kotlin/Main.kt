import java.util.Scanner

val scanner = Scanner(System.`in`)

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
    TODO("Not yet implemented")
}

fun deleteNote() {
    TODO("Not yet implemented")
}

fun updateNote() {
    TODO("Not yet implemented")
}

fun addNote() {
    println("You chose Add note")
}
fun listNote() {
    TODO("Not yet implemented")
}



