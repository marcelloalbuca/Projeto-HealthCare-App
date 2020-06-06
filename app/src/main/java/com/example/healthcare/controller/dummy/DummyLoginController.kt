package com.example.healthcare

class DummyLoginController : ILoginController {

    override fun login(userName: String, userPassword: String, callback: (Boolean) -> Unit) {

        if ("admin" == userName && userPassword == "1234") {
            callback(true)
        } else {
            callback(false)
        }
    }


}