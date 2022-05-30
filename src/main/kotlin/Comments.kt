class Comments (
    id: Int, // id комментария
    ownerId: Int, // id заметки
    val fromId: Int, // id автора комментария
    val date: Int, // дата
    text: String, // текс комментария
    val guid: String, // id от повторного комментария
    stateDelete: Boolean // метка об удалении
) : Elements(id, stateDelete, text, ownerId) {
    override fun toString(): String {
        return "Comment(id=$id ownerId=$ownerId fromId=$fromId date=$date text=$text guid=$guid stateDelete=$stateDelete)"
    }
}
