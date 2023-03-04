package task3

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class UnitTestTask3 {
    @Test
    fun testAction1() {
        val action = Action("Делаю лабу")
        assertEquals(action.actionName, "Doing Делаю лабу")
    }

    @Test
    fun testAction2() {
        val action = Action("Делаю лаюу")
        action.zachillsia()
        assertEquals(action.actionName, "Do nothing")
    }

    @Test
    fun testLocation1() {
        val location = Location("ИТМО")
        assertEquals(location.name, "ИТМО")
    }

    @Test
    fun testPerson1() {
        val person = Person("Анатолий")
        assertEquals(person.name, "Анатолий")
    }

    @Test
    fun testPerson2() {
        val person = Person("Анатолий")
        assertEquals(person.whatIsYourSpecies(), "I'm person")
    }

    @Test
    fun testPerson3() {
        val person = Person("Анатолий")
        person.relocate("Сербия")
        assertEquals(person.whereAreYou(), "I'm in Сербия")
    }

    @Test
    fun testPerson4() {
        val person = Person("Анатолий")
        person.doAction("Делать лабу")
        assertEquals(person.whatAreYouDoing(), "Doing Делать лабу")
    }

    @Test
    fun testPerson5() {
        val person = Person("Анатолий")
        person.doAction("Делать лабу")
        person.stopDoingAction()
        assertEquals(person.whatAreYouDoing(), "Do nothing")
    }

    @Test
    fun testPerson6() {
        val person1 = Person("Анатолий")
        val person2 = Person("Павел")
        person1.relocate("Сербия")
        person2.relocate("Сербия")
        assertTrue(person1.areYouInTheSamePlace(person2))
    }

    @Test
    fun testPerson7() {
        val person1 = Person("Анатолий")
        val person2 = Person("Павел")
        person1.relocate("Донбасс")
        person2.relocate("Сербия")
        assertFalse(person1.areYouInTheSamePlace(person2))
    }
}