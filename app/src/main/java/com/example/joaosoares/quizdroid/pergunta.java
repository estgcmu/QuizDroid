package com.example.joaosoares.quizdroid;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class pergunta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pergunta);
    }

public void alerta1(View view){

    //mostrar caixa de mensagem
    AlertDialog alertDialog;
    alertDialog = new AlertDialog.Builder(this).create();
    alertDialog.setTitle("Funcionou");
    alertDialog.setMessage("Botão Alerta 1");
    alertDialog.show();

}




}