package com.example.healthcare

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.Button
import android.widget.EditText

class activity_detalhe_pedido : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhe_pedido)

        val tipoServico = findViewById(R.id.tipoServico) as EditText
        val enderecoServico = findViewById(R.id.enderecoServico) as EditText
        val valorServico = findViewById(R.id.valorServico) as EditText
        val btnEnviar = findViewById(R.id.btnEnviar) as Button


        btnEnviar.setOnClickListener {

            if (tipoServico.getText().toString().equals("") || tipoServico.getText().toString() == null) {
                tipoServico.setError("Favor informe o tipo de serviço");
            }
            if (enderecoServico.getText().toString().equals("") || enderecoServico.getText().toString() == null) {
                enderecoServico.setError("Favor informe o endereço do serviço ");
            }
            if (valorServico.getText().toString().equals("") || valorServico.getText().toString() == null) {
                valorServico.setError("Favor informe o valor do serviço");
            }

            tipoServico.text = Editable.Factory.getInstance().newEditable("")
            enderecoServico.text = Editable.Factory.getInstance().newEditable("")
            valorServico.text = Editable.Factory.getInstance().newEditable("")
        }
    }

    }
}