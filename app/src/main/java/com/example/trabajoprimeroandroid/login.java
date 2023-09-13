package com.example.trabajoprimeroandroid;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.ToggleButton;

import org.w3c.dom.Text;

public class login extends AppCompatActivity {

    // buttons
    private Button login;
    private ToggleButton cambiarModo;

    // textos
    private TextView titulo, textoCambioModo;
    private EditText nombres, contrasenha, correo;

    // otros
    private ScrollView disenho;
    private RadioButton opc1, opc2, opc3, opc4;
    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // button
        login = (Button) findViewById(R.id.iniciarSesionUI);

        // textos
        titulo = (TextView) findViewById(R.id.titulo);
        textoCambioModo = (TextView) findViewById(R.id.textoCambioDeModo);
        nombres = (EditText) findViewById(R.id.nombresUI);
        contrasenha = (EditText) findViewById(R.id.passwordUI);
        correo = (EditText) findViewById(R.id.correoUI);
        cambiarModo = (ToggleButton) findViewById(R.id.cambiarModoUI);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        opc1 = (RadioButton) findViewById(R.id.radioOpc1);
        opc2 = (RadioButton) findViewById(R.id.radioOpc2);
        opc3 = (RadioButton) findViewById(R.id.radioOpc3);
        opc4 = (RadioButton) findViewById(R.id.radioOpc4);


        cambiarModo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cambiarModo(view);
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                verificarLogin();
            }
        });


    }// oncreate


    //public void cambiarRegistro(){
    //    Intent sig = new Intent(this, register.class);
    //    starActivity(sig);
    //} // method

    public void cambiarModo(View view){

        if(cambiarModo.isChecked()){


            titulo.setTextColor(getResources().getColor(R.color.white));
            textoCambioModo.setTextColor(getResources().getColor(R.color.white));
            nombres.setHintTextColor(getResources().getColor(R.color.white));
            contrasenha.setHintTextColor(getResources().getColor(R.color.white));
            correo.setTextColor(getResources().getColor(R.color.white));

        }else{


            titulo.setTextColor(getResources().getColor(R.color.black));
            textoCambioModo.setTextColor(getResources().getColor(R.color.black));
            nombres.setHintTextColor(getResources().getColor(R.color.black));
            contrasenha.setHintTextColor(getResources().getColor(R.color.black));
            correo.setTextColor(getResources().getColor(R.color.black));
        }

    }// method

    public void verificarLogin(){

        if(nombres.getText().toString().isEmpty() || correo.getText().toString().isEmpty() || contrasenha.getText().toString().isEmpty()){

            AlertDialog.Builder mensaje = new AlertDialog.Builder(login.this);
            mensaje.setCancelable(true);
            mensaje.setTitle("ERROR");
            mensaje.setMessage("Tienes que rellenar todo!!");
            mensaje.show();

        }else{
            //Intent sig = new Intent(this, menuPrincipal.class);
            //starActivity(sig);
        }

    }

}// class