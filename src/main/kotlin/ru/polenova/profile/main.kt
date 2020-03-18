package ru.polenova.profile

import ru.polenova.profile.model.Profile

fun main(){
    val user = Profile(123, "login", "vasya", "pupkin", "1")
    println(user.userName)
}