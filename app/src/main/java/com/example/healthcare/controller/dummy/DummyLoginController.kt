package com.example.healthcare.controller.dummy

import com.example.healthcare.controller.ILoginController

class DummyLoginController : ILoginController {

    override fun login(userName: String, userPassword: String, callback: (Boolean) -> Unit) {

        if ("admin" == userName && userPassword == "1234") {
            callback(true)
        } else {
            callback(false)
        }
    }

    override fun hasUserLogged(): Boolean {
        return false
    }


}