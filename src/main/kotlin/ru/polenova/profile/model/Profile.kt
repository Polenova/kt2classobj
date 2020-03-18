package ru.polenova.profile.model

class Profile(val id: Int, val login: String, val name: String, val surname: String, val avatar: String) {

    val userName: String
        get() = this.name + "\n" + this.surname
}