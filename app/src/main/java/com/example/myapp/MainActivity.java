package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends DebugActivity implements View.OnClickListener {
    private Button btnEnviar;
    private Button botaoContador;
    private TextView textView;
    private TextView textoContador;
    private EditText editText;
    private int cont=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEnviar = (Button) findViewById(R.id.botaoEnviar);
        btnEnviar.setOnClickListener(this);

        botaoContador = (Button) findViewById(R.id.botaoContador);
        botaoContador.setOnClickListener(this);



        getSupportActionBar().setTitle("Aula 2 - Tópicos");
    }

    @Override

    public void onClick(View view){
        if(view.getId()==R.id.botaoEnviar){
            textView = (TextView) findViewById(R.id.textView);
            editText = (EditText) findViewById(R.id.editText);

            textView.setText(editText.getText());

            Context context = getApplicationContext();
            CharSequence text = editText.getText();
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();

        }
        else{
            if(view.getId()==R.id.botaoContador){
                textoContador = (TextView) findViewById(R.id.textoContador);
                cont++;
                textoContador.setText(cont+"");
            }
        }

    }
}