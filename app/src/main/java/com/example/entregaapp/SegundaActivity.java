package com.example.entregaapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        //ALERTDIALOG

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String nomeNovo = bundle.getString("nameField");
        TextView nome2 = findViewById(R.id.resultadoID);
        nome2.setText(nomeNovo);
    }

}