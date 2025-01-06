package lesson_12

import java.util.Date

fun main() {

    // ad hoc(по случаю)
    // subtyping(полиморфизм включения)
    // parametric (параметрический)

    val creationDate = Date()

    val messageItem: NoteAppItem = MessageItem(
        "call sister",
        creationDate,
        "message",
        "call sister to congratulate"
    )

    val phoneItem: NoteAppItem = PhoneItem(
        "sister's number",
        creationDate,
        "message",
        9878965456
    )

    val listItem: NoteAppItem = ListItem(
        "todolist",
        creationDate,
        "message",
        listOf("wash dog", "do the cleaning", "buy new shoes")
    )

//    println(messageItem.getItemData())
//    println()
//    println(phoneItem.getItemData())
//    println()
//    println(listItem.getItemData())

    val arrayOfNotes = arrayOf<NoteAppItem>(messageItem, phoneItem, listItem)
    showAllNotes(arrayOfNotes)
}

fun showAllNotes(notes: Array<NoteAppItem>) {
    notes.forEach { println(it.getItemData()) }
}