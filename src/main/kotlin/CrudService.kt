open class CrudService<T : Elements> {
    val recordElements = mutableListOf<T>()
    var generatedId = 1

    fun add(name: T): Int {
        name.id = generatedId++
        recordElements.add(name)
        return recordElements.last().id
    }

    fun delete(id: Int): String {
        for ((index, value) in recordElements.withIndex()) if (value.id == id && value.stateDelete == false) {
            value.stateDelete = true
            return "Успешно удаленно"
        }
        throw ErrorAbsenceElementException("Невозможно выполнить удаление")
    }

    fun edit(name: T) {
        if (name.stateDelete == false) {
            name.text = readLine().toString()
        } else {
            throw ErrorAbsenceElementException("Ошибка редактирования")
        }
    }

    fun restore(id: Int): String {
        for ((index, value) in recordElements.withIndex()) if (value.id == id && value.stateDelete == true) {
            value.stateDelete = false
            return "Востоновленно"
        }
        throw ErrorAbsenceElementException("Невозможно востоновить")
    }

    // получить все заметки автора или все комментарии к заданной заметке
    fun get(ownerId: Int): MutableList<T> {
        val result = mutableListOf<T>()
        for (element in recordElements) {
            if (ownerId == element.ownerId && element.stateDelete == false) {
                result.add(element)
            }
        }
        return result
    }

    fun size() {
        println(recordElements.size)
    }

    fun print() {
        for (element in recordElements) {
            if (element.stateDelete == false) {
                println(element)
            }
        }
    }
}