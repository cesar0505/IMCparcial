package com.example.imcparcial;

import androidx.appcompat.app.AppCompatActivity;

import android.app.appsearch.SearchResult;
import android.content.Intent;
import android.icu.text.IDNA;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class info extends AppCompatActivity {

    Button atras;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        atras=(Button)findViewById(R.id.btn);

        atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent( info.this,MainActivity.class);
                startActivity(i);
            }
        });



    }
}