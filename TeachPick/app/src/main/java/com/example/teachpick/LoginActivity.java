package com.example.teachpick;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import spencerstudios.com.bungeelib.Bungee;

public class LoginActivity extends AppCompatActivity {
    TextView txtVwUser, txtVwPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //esta parte es para hacer pantalla completa, quitar las notis pero la action bar la quitas en themes
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_log);

        txtVwUser =  findViewById(R.id.txtVwUsername);
        txtVwPass = findViewById(R.id.txtVwPass);

    }

    public void btnIniciarSesion(View v){

        Log.wtf("Btn","funciona");
        Intent intent = new Intent(this, CarrerasActivity.class);
        startActivity(intent);
        Bungee.slideLeft(this);
    }

    public void txtVwOc(View v){
        Intent intent = new Intent(this, RecuperarCuentaActivity.class);
        startActivity(intent);
        Bungee.slideLeft(this);
        Log.wtf("txtVwOc","funciona");
        finish();

    }

    public void txtVwCc(View v){
        Intent intent = new Intent(this, CrearCuentaActivity.class);
        startActivity(intent);
        Bungee.slideLeft(this);
        Log.wtf("txtVwCc","funciona");
        finish();

    }

    public void alertaLogin(){

        final Dialog dlgMiCuadroDialogo = new Dialog(this);
        dlgMiCuadroDialogo.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        //asignamos el layout
        dlgMiCuadroDialogo.setContentView(R.layout.alerta);
        //vincular widgets
        Button ok;
        ok = dlgMiCuadroDialogo.findViewById(R.id.btnOk);

        //agregamos el onlick del boton de la alerta
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dlgMiCuadroDialogo.cancel();
            }
        });
        dlgMiCuadroDialogo.show();
    }
}