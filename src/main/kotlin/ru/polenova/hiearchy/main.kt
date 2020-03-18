package ru.polenova.hiearchy

import ru.polenova.hiearchy.widget.Button
import ru.polenova.hiearchy.widget.TextView

fun main() {

    val button = Button("on Click")
    button.click()
    println(button.text)
    button.text = "Don't click me"
    println(button.text)

    val textView = TextView("Another text")
    textView.click() // вызывается метод из `View`
    println(textView.text)
    textView.text = "Something bad happened"
    println(textView.text) // Something bad happened
}