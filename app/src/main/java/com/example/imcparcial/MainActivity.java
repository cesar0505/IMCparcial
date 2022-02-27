package com.example.imcparcial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText nombre,altura,peso;
    Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        nombre= (EditText) findViewById(R.id.txtNombre);
        altura=(EditText) findViewById(R.id.txtAltura);
        peso=(EditText) findViewById(R.id.txtPeso);
        boton=(Button) findViewById(R.id.btnAceptar);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrarelresultado();
            }
        });
    }
    public void mostrarelresultado(){
        Intent intent = new Intent(this,ResultadoActivity.class);
        intent.putExtra("nombre",nombre.getText().toString());
        intent.putExtra("altura",altura.getText().toString());
        intent.putExtra("peso",peso.getText().toString());
        startActivity(intent);

    }

}