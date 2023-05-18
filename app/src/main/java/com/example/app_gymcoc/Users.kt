package com.example.app_gymcoc

class Users {
    var email:String = ""
    var password:String=""
    var confirmpass:String=""
    var time_id:String=""

    constructor(email: String, password: String, confirmpass: String, time_id: String) {
        this.email = email
        this.password = password
        this.confirmpass = confirmpass
        this.time_id = time_id
    }

    constructor()
}