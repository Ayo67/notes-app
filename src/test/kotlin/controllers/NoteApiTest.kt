package controllers

import models.Note
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue

class NoteApiTest {
    private  var learnKotlin: Note? = null
    private  var summerHoliday: Note? = null
    private  var codeApp: Note? = null
    private  var testApp: Note? = null
    private  var swim: Note? = null
    private  var populatedNotes: NoteApi? = NoteApi()
    private  var emptyNotes: NoteApi? = NoteApi()

    @BeforeEach

    fun setup(){
        learnKotlin = Note("Learning Kotlin", 5, "College", false)
        summerHoliday = Note ("Summer Holiday to France", 1, "Holiday", false)
        codeApp = Note ("Code App", 4, "Work", false)
        testApp = Note ("Test App", 4, "Work", false)
        swim = Note ("Swim - Pool", 4, "Hobby", false)

        // adding notes to the api
        populatedNotes!!.add(learnKotlin!!)
        populatedNotes!!.add(summerHoliday!!)
        populatedNotes!!.add(codeApp!!)
        populatedNotes!!.add(testApp!!)
        populatedNotes!!.add(swim!!)
    }

    @AfterEach
    fun tearDown(){
        learnKotlin = null
        summerHoliday = null
        codeApp = null
        testApp= null
        swim= null
        populatedNotes= null
        emptyNotes= null
    }

    @Test
    fun `adding a Note to a populated list adds to ArrayList`(){
        val newNote = Note("Study Lambdas", 1, "College", false)
        assertEquals(5, populatedNotes!!.numberOfNotes())
        assertTrue(populatedNotes!!.add(newNote))
        assertEquals(6, populatedNotes!!.numberOfNotes())
        assertEquals(newNote, populatedNotes!!.findNote(populatedNotes!!.numberOfNotes() - 1))
    }

    @Test
    fun `adding a Note to an empty list adds to ArrayList`(){
        val newNote = Note("Study Lambdas", 1, "College", false)
        assertEquals(0, emptyNotes!!.numberOfNotes())
        assertTrue(emptyNotes!!.add(newNote))
        assertEquals(1, emptyNotes!!.numberOfNotes())
        assertEquals(newNote, emptyNotes!!.findNote(emptyNotes!!.numberOfNotes() - 1))
    }



}