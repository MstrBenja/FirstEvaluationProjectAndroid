package com.example.trabajoprimeroandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class infoKyo extends AppCompatActivity {

    private ProgressBar barra;

    int contador = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_kyo);

        barra = (ProgressBar) findViewById(R.id.barra4);

        procesoBarra();

    }// oncreate

    public void procesoBarra(){

        final Timer t = new Timer();
        TimerTask timertask = new TimerTask() {
            @Override
            public void run() {
                contador++;
                barra.setProgress(contador);
                if(contador == 600){
                    t.cancel();
                }
            }
        };
        t.schedule(timertask, 0, 600);
        if(barra.getProgress() == 600){
            Toast.makeText(infoKyo.this, "Prueba de lectura!"+"\n"+"El tiempo acabó...Ya debiste haber leido toda la biografia", Toast.LENGTH_LONG).show();
        }
    }// method

    public void regresar(View view){

        Intent b = new Intent(this, menuPrincipal.class);
        startActivity(b);

    }//method

}// class