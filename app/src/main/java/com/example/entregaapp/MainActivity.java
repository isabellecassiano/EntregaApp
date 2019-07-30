package com.example.entregaapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void vaiPraSegundaActivity(View view) {
        Intent intent = new Intent(this, SegundaActivity.class);
        Bundle bundle = new Bundle();
        TextView nomeInicio = findViewById(R.id.nomeID);
        bundle.putString("nameField", nomeInicio.getText().toString());
        intent.putExtras(bundle);
        //TOAST
        //NOTIFICACAO
        startActivity(intent);
    }
}

