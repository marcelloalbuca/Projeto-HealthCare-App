package com.example.healthcare

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity(), LoginPresenter.View {

    private lateinit var presenter: LoginPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        presenter = LoginPresenter(this)

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

}
