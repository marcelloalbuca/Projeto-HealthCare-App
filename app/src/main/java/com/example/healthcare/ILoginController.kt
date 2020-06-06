package com.example.healthcare

import javax.security.auth.callback.Callback

interface ILoginController {

    fun login(userName: String, userPassword: String, callback: (Boolean) -> Unit)

}