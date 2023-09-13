package com.example.trabajoprimeroandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class menuPrincipal extends AppCompatActivity {

    // texto
    private TextView comentarioValorar;

    // buttons
    private Button botonValorar;
    private ImageButton btn1, btn2, btn3, btn4;

    // otro
    private RatingBar valorar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);

        valorar = (RatingBar) findViewById(R.id.valorar);
        botonValorar = (Button) findViewById(R.id.valorarUI);
        btn1 = (ImageButton) findViewById(R.id.jinButton);
        btn2 = (ImageButton) findViewById(R.id.terryButton);
        btn3 = (ImageButton) findViewById(R.id.ryuButton);
        btn4 = (ImageButton) findViewById(R.id.kyoButton);

        botonValorar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                verificarValoracion();
            }
        });

    }// oncreate

    public void verificarValoracion(){

        float cantidad = 0;
        cantidad = valorar.getRating();
        if (cantidad >= 1 || cantidad <= 2){
            cantidad = Math.round(cantidad);
            Toast.makeText(menuPrincipal.this, "Puf... una baja calidad... pero igual gracias por esas estrellas...", Toast.LENGTH_SHORT).show();
        }else if (cantidad == 3){
            Toast.makeText(menuPrincipal.this, "ojalá hubiesen sido más :/... ¡pero gracias por las "+cantidad+" estrellas!", Toast.LENGTH_SHORT).show();
        } else if (cantidad >= 4 || cantidad <= 5) {
            Toast.makeText(menuPrincipal.this, "GRACIAS POR ESAS "+cantidad+" ERES GOD", Toast.LENGTH_SHORT).show();
        }
    }// method

    public void infoBoton1(View v){
        //Intent infoJin = new Intent(this, infoJin.class);
        //startActivity(infoJin);
    }

    public void infoBoton2(View v){
        //Intent infoTerry = new Intent(this, infoTerry.class);
        //startActivity(infoTerry);
    }

    public void infoBoton3(View v){
        //Intent infoRyu = new Intent(this, infoRyu.class);
        //startActivity(infoRyu);
    }

    public void infoBoton4(View v){
        //Intent infoKyo = new Intent(this, infoKyo.class);
        //startActivity(infoKyo);
    }

}// class