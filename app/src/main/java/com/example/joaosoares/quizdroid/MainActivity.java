package com.example.joaosoares.quizdroid;

import android.content.Intent;
//import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //iniciar nova activity
    public void pergunta(View view) {
        Intent i = new Intent(this, Pergunta_activity.class);
        startActivity(i);

        }

        //if(v.getId() == R.id.ver_button)
        //{
        //   Intent i = new Intent(MainActivity.this, Ver.class);
        //  startActivity(i);

        //}



        //public void alertaNormal (View view){

        //mostrar caixa de mensagem
        //AlertDialog alertDialog;
        //alertDialog = new AlertDialog.Builder(this).create();
        //alertDialog.setTitle("Funcionou");
        //alertDialog.setMessage("Botão Alerta 1");
        //alertDialog.show();

        //}
        /** Called when the user clicks the Send button */


    }

