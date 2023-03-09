import controllers.NoteApi
import models.Note
import mu.KotlinLogging
import utils.ScannerInput
import utils.ScannerInput.readNextInt
import utils.ScannerInput.readNextLine
import java.lang.System.exit

private val logger = KotlinLogging.logger {}
private val noteApi =NoteApi()

fun main(args: Array<String>){
    runMenu()
}

fun mainMenu() : Int {
    return readNextInt(""" 
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
            2 -> listNotes()
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
    //logger.info{ "addNote() function invoked"}
    val noteTitle = readNextLine( "Enter a title for the note")
    val notePriority = readNextInt("Enter a priority (1-low, 2, 3, 4, 5-high): ")
    val noteCategory = readNextLine( "Enter a category for the note")
    val isAdded = noteApi.add(Note(noteTitle, notePriority, noteCategory, false))

    if(isAdded){
        println("Added Successfully")
    }else {
        println("Add Failed")
    }
}
fun listNotes() {
    //logger.info{ "listNote() function invoked"}
    println(noteApi.listAllNotes())
}



