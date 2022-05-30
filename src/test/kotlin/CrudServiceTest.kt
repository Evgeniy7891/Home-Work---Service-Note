import org.junit.Test
import org.junit.Assert.*

class CrudServiceTest {

    @Test
    fun addNoteTest() {
        val test = NoteService()
        val result = test.add(Notes(0, 1, "1", "1", 1, 1, 1, "1", false))
        assertTrue(result == 1)
    }

    @Test(expected = ErrorAbsenceElementException::class)
    fun deleteTestException() {
        val test = NoteService()
        test.add(Notes(0, 1, "1", "1", 1, 1, 1, "1", true))
        test.delete(1)
    }

    @Test
    fun deleteTestComment() {
        val test = CommentService()
        test.add(Comments(0, 1, 1, 1, "1", "1", false))
        val result = test.delete(1)
        assertEquals("Успешно удаленно", result)
    }

    @Test(expected = ErrorAbsenceElementException::class)
    fun editTestException() {
        val test = NoteService()
        val testNote = Notes(0, 1, "1", "1", 1, 1, 1, "1", true)
        test.edit(testNote)
    }

    @Test
    fun restoreTestComment() {
        val test = CommentService()
        test.add(Comments(1, 1, 1, 1, "1", "1", true))
        val result = test.restore(1)
        assertEquals("Востоновленно", result)
    }

    @Test(expected = ErrorAbsenceElementException::class)
    fun restoreTestNoteException() {
        val test = CommentService()
        test.add(Comments(1, 1, 1, 1, "1", "1", false))
        test.restore(1)
    }

    @Test
    fun getTestNote() {
        val test = NoteService()
        test.add(Notes(1, 2, "3", "3", 1, 1, 1, "w", false))
        test.add(Notes(1, 2, "3", "3", 1, 1, 1, "w", true))
        test.add(Notes(1, 2, "3", "3", 1, 1, 1, "w", false))
        val result = test.get(2).size
        assertTrue(result == 2)
    }
}