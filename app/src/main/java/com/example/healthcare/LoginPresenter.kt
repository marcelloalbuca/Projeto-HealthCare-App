package com.example.healthcare

class LoginPresenter (
    private val view: View
)   {
    interface View {
        fun getUserName(): String
        fun getUserPassword(): String
        fun showEmptyInformationWarnning()
    }

    fun onLoginClicked(){
        val userName = view.getUserName()
        val userPassword = view.getUserPassword()

        if (userName.isEmpty() || userPassword.isEmpty()) {
            view.showEmptyInformationWarnning()
        }
    }
}