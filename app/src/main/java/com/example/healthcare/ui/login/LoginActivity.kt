package com.example.healthcare.ui.login

import android.content.Intent
import android.graphics.Paint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.healthcare.MainActivity
import com.example.healthcare.R
import com.example.healthcare.controller.device.WifiController
import com.example.healthcare.controller.dummy.DummyLoginController
import com.example.healthcare.ui.menu.MainMennu
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity(),
    LoginPresenter.View {

    private lateinit var presenter: LoginPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        textView4.setPaintFlags(textView4.getPaintFlags() or Paint.UNDERLINE_TEXT_FLAG)

        presenter = LoginPresenter(
            this,
            WifiController(this),
            DummyLoginController()
        )

        val buttonLogin = findViewById<Button>(R.id.button_login)

        buttonLogin.setOnClickListener(){
            presenter.onLoginClicked()
        }
    }

    override fun getUserName(): String {
        val userName = findViewById<EditText>(R.id.edit_user_name)
        return userName.text.toString()
    }
    override fun getUserPassword(): String {
        val userPassword = findViewById<EditText>(R.id.edit_user_password)
        return userPassword.text.toString()
    }

    override fun showEmptyInformationWarnning() {
        Toast.makeText(this, "Nome e Senha vazios", Toast.LENGTH_LONG).show()
    }

    override fun showWifiDisabledWarning() {
        Toast.makeText(this, "Wi-fi desconectada", Toast.LENGTH_LONG).show()
    }

    override fun showUnauthentedUser() {
        Toast.makeText(this, "Crie sua conta", Toast.LENGTH_LONG).show()
    }

    override fun openHomeScreen() {
        startActivity(Intent(this, MainMennu::class.java))
    }

    fun callCadastro(view: View) {
        startActivity(Intent(this, MainActivity::class.java))
    }


}
