class Notes(
    id: Int, // id заметки
    ownerId: Int, // id владельца
    var title: String, // заголовок
    text: String, // текс
    val date: Int, // дата
    var comments: Int, // кол-во комментариев
    var readComments: Int, // кол-во прочитанных комментариев
    val viewUrl: String, // адрес
    stateDelete: Boolean // метка об удалении
) : Elements(id, stateDelete, text, ownerId) {
    override fun toString(): String {
        return "Note(id=$id ownerId=$ownerId title='$title' text=$text  date=$date, comments=$comments, readComments=$readComments, viewUrl='$viewUrl' stateDelete=$stateDelete )"
    }
}
