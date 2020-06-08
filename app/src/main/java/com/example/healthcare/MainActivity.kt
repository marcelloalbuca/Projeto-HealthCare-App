package com.example.healthcare

import android.os.Bundle
import android.text.Editable
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var result: TextView? =null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nome = findViewById(R.id.nome) as EditText
        val dataNascimento = findViewById(R.id.dataNascimento) as EditText
        val cpf = findViewById(R.id.cpf) as EditText
        val telefone = findViewById(R.id.telefone) as EditText
        val sexo = findViewById(R.id.sexo) as EditText
        val senha = findViewById(R.id.senha) as EditText
        val email = findViewById(R.id.email) as EditText
        val buttonSalvar = findViewById(R.id.btnSalvar) as Button

        dataNascimento.addTextChangedListener(MaskEditUtil.mask(dataNascimento, MaskEditUtil.FORMAT_DATE));
        cpf.addTextChangedListener(MaskEditUtil.mask(cpf, MaskEditUtil.FORMAT_CPF));
        telefone.addTextChangedListener(MaskEditUtil.mask(telefone, MaskEditUtil.FORMAT_FONE));

        buttonSalvar.setOnClickListener {

            if (nome.getText().toString().equals("") || nome.getText().toString() == null){
                nome.setError("Favor informe o nome");
            }else{
                Toast.makeText(this,nome.text, Toast.LENGTH_LONG).show()
            }
            if (dataNascimento.getText().toString().equals("") || dataNascimento.getText().toString() == null){
                dataNascimento.setError("Favor informe a Data de Nascimento");
            }
            if (cpf.getText().toString().equals("") || cpf.getText().toString() == null){
                cpf.setError("Favor informe o CPF");
            }
            if (telefone.getText().toString().equals("") || telefone.getText().toString() == null){
                telefone.setError("Favor informe o número de telefone");
            }
            if (sexo.getText().toString().equals("") || sexo.getText().toString() == null){
                sexo.setError("Favor informe o sexo");
            }
            if (senha.getText().toString().equals("") || senha.getText().toString() == null){
                senha.setError("Favor informe uma senha");
            }
            if (email.getText().toString().equals("") || email.getText().toString() == null){
                email.setError("Favor informe o e-mail");
            }

            nome.text = Editable.Factory.getInstance().newEditable("")
            dataNascimento.text = Editable.Factory.getInstance().newEditable("")
            cpf.text = Editable.Factory.getInstance().newEditable("")
            telefone.text = Editable.Factory.getInstance().newEditable("")
            sexo.text = Editable.Factory.getInstance().newEditable("")
            senha.text = Editable.Factory.getInstance().newEditable("")

        }
    }
}
