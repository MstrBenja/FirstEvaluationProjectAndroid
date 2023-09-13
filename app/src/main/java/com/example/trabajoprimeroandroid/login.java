package com.example.trabajoprimeroandroid;

import static java.security.AccessController.getContext;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

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

import java.security.AccessController;

public class login extends AppCompatActivity {

    // buttons
    private Button login;
    private ToggleButton cambiarModo;

    // textos
    private TextView titulo, textoCambioModo, genero, ust;
    private EditText nombres, contrasenha, correo;

    // otros
    private ScrollView disenho;
    private RadioButton opc1, opc2, opc3, opc4;
    private RadioGroup radioGroup;
    private ImageView st;

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
        genero = (TextView) findViewById(R.id.genero);
        opc1 = (RadioButton) findViewById(R.id.radioOpc1);
        opc2 = (RadioButton) findViewById(R.id.radioOpc2);
        opc3 = (RadioButton) findViewById(R.id.radioOpc3);
        opc4 = (RadioButton) findViewById(R.id.radioOpc4);
        disenho = (ScrollView) findViewById(R.id.layout);
        ust = (TextView) findViewById(R.id.ustUI);
        st = (ImageView) findViewById(R.id.st);


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

    public void cambiarModo(View view){

        if(cambiarModo.isChecked()){

            disenho.setBackgroundColor(getResources().getColor(R.color.black));
            titulo.setTextColor(getResources().getColor(R.color.white));
            textoCambioModo.setTextColor(getResources().getColor(R.color.white));
            nombres.setHintTextColor(getResources().getColor(R.color.white));
            nombres.setTextColor(getResources().getColor(R.color.white));
            contrasenha.setHintTextColor(getResources().getColor(R.color.white));
            contrasenha.setTextColor(getResources().getColor(R.color.white));
            correo.setHintTextColor(getResources().getColor(R.color.white));
            correo.setTextColor(getResources().getColor(R.color.white));
            opc1.setTextColor(getResources().getColor(R.color.white));
            opc2.setTextColor(getResources().getColor(R.color.white));
            opc3.setTextColor(getResources().getColor(R.color.white));
            opc4.setTextColor(getResources().getColor(R.color.white));
            genero.setTextColor(getResources().getColor(R.color.white));
            ust.setTextColor(getResources().getColor(R.color.white));
            int img = getResources().getIdentifier("@drawable/ustnegro", null, this.getPackageName());
            st.setImageResource(img);

        }else{

            disenho.setBackgroundColor(getResources().getColor(R.color.white));
            titulo.setTextColor(getResources().getColor(R.color.black));
            textoCambioModo.setTextColor(getResources().getColor(R.color.black));
            nombres.setHintTextColor(getResources().getColor(R.color.black));
            nombres.setTextColor(getResources().getColor(R.color.black));
            contrasenha.setHintTextColor(getResources().getColor(R.color.black));
            contrasenha.setTextColor(getResources().getColor(R.color.black));
            correo.setHintTextColor(getResources().getColor(R.color.black));
            correo.setTextColor(getResources().getColor(R.color.black));
            opc1.setTextColor(getResources().getColor(R.color.black));
            opc2.setTextColor(getResources().getColor(R.color.black));
            opc3.setTextColor(getResources().getColor(R.color.black));
            opc4.setTextColor(getResources().getColor(R.color.black));
            genero.setTextColor(getResources().getColor(R.color.black));
            ust.setTextColor(getResources().getColor(R.color.white));
            int img = getResources().getIdentifier("@drawable/santotomas", null, this.getPackageName());
            st.setImageResource(img);

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
            Intent sig = new Intent(this, menuPrincipal.class);
            startActivity(sig);
        }

    }// method

}// class