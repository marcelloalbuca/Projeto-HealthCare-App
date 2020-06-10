package com.example.healthcare.controller

import javax.security.auth.callback.Callback

interface ILoginController {

    fun login(userName: String, userPassword: String, callback: (Boolean) -> Unit)
    fun hasUserLogged(): Boolean

}