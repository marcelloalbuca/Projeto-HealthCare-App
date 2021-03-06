package com.example.healthcare.ui.login

import com.example.healthcare.controller.ILoginController
import com.example.healthcare.controller.IWifiController


class LoginPresenter (
    private val view: View,
    private val wifiController: IWifiController,
    private val loginController: ILoginController
)   {
    interface View {
        fun getUserName(): String
        fun getUserPassword(): String
        fun showEmptyInformationWarnning()
        fun showWifiDisabledWarning()
        fun showUnauthentedUser()
        fun openHomeScreen()

    }

    fun init() {
        if (loginController.hasUserLogged()){
            view.openHomeScreen()
        }
    }

    fun onLoginClicked(){
        val userName = view.getUserName()
        val userPassword = view.getUserPassword()

        if (userName.isEmpty() || userPassword.isEmpty()) {
            view.showEmptyInformationWarnning()
            return;
        }

        if (!wifiController.isWifiEnabled()) {
            view.showWifiDisabledWarning()
            return
        }

        loginController.login(userName, userPassword, callback = { isUserLogged ->
            if (isUserLogged) {
                view.openHomeScreen()
            }else{
                view.showUnauthentedUser()
            }
        })


    }


}