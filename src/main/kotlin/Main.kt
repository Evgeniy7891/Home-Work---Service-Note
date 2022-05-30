fun main() {
    val serviceNotes = NoteService()
    val note1 = Notes(0, 1, "Hello", "Start", 2022, 1, 1, "www", false)
    val note2 = Notes(0, 2, "Bye", "Good", 2022, 1, 1, "www", false)
    val note3 = Notes(0, 1, "Test", "ABC", 2022, 0, 0, "www", false)
    //добавляем в коллекцию
    serviceNotes.add(note1)
    serviceNotes.add(note2)
    serviceNotes.add(note3)
    // проверяем что в коллекции три заметки
    serviceNotes.size()
    serviceNotes.print()
    println("--------------------------------------------------------------------------------")
    // редактирование текста в заметках
    //serviceNotes.edit(note2)
    //serviceNotes.print()
    println("--------------------------------------------------------------------------------")
    // получить все заметки автора
    println(serviceNotes.get(1))
    println("--------------------------------------------------------------------------------")
    // проверка удаления и восстановления
    serviceNotes.delete(3)
    serviceNotes.print()
    serviceNotes.restore(3)
    serviceNotes.print()
    println("--------------------------------------------------------------------------------")
    val serviceComments = CommentService()
    val comment1 = Comments(0, 1, 1, 2022, "Привет", "Нет", false)
    val comment2 = Comments(0, 2, 1, 2022, "Hy", "Нет", false)
    val comment3 = Comments(0, 1, 2, 2000, "Non", "нет", false)
    //добавляем в коллекцию
    serviceComments.add(comment1)
    serviceComments.add(comment2)
    serviceComments.add(comment3)
    // проверяем что в коллекции три заметки
    serviceComments.size()
    serviceComments.print()
    println("--------------------------------------------------------------------------------")
    // получения комментарий к заданной заметке
    println(serviceComments.get(1))
    println("--------------------------------------------------------------------------------")
    // проверка удаления и восстановления
    serviceComments.delete(1)
    serviceComments.delete(1) // выброс исключений
    serviceComments.restore(3) // выброс исключений
}
