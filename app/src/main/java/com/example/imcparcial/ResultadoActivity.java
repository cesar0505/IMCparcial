package com.example.imcparcial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultadoActivity extends AppCompatActivity {
    TextView resultado;
    String strnombre;
    Float altura,peso,lresultado;
    Button siguiente;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado2);

        siguiente=(Button)findViewById(R.id.ventana2);

        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent( ResultadoActivity.this,info.class);
                startActivity(i);
            }
        });

        resultado = (TextView) findViewById(R.id.txtResultado);

        Intent intent = getIntent();
        strnombre = intent.getStringExtra("nombre");
        altura = Float.parseFloat(intent.getStringExtra("altura"));
        peso = Float.parseFloat(intent.getStringExtra("peso"));
        lresultado= peso / (altura*altura);

        String strResultado = "Hola " + strnombre + "";
        strResultado = strResultado + "\n" + "IMC = " + lresultado.toString();



        if (lresultado<17){
            strResultado = strResultado + "\n" + "Peso muy bajo";
        }
        else if (lresultado<18.49){
            strResultado = strResultado + "\n" + "Peso bajo";
        }
        else if (lresultado<24.99){
            strResultado = strResultado + "\n" + "Peso normal";
        }
        else if (lresultado<29.99){
            strResultado = strResultado + "\n" + "Sobre peso";
        }
        else if (lresultado<34.99){
            strResultado = strResultado + "\n" + "Obesidad grado 1";
        }
        else if (lresultado<39.99){
            strResultado = strResultado + "\n" + "Obesidad grado 2";
        }
        else {
            strResultado = strResultado + "\n" + "Obesidad grado 3";
        }

        resultado.setText(strResultado);

    }





}





