package com.example.teachpick;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import spencerstudios.com.bungeelib.Bungee;

public class CrearCuentaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //esta parte es para hacer pantalla completa, quitar las notis pero la action bar la quitas en themes
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_crear_cuenta);
    }


    public void crearCuenta(View v){
        alertaCrearCuenta();
    }

    public void regresar(View v){
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
        Bungee.slideRight(this);
        finish();
    }

    public void alertaCrearCuenta(){

        final Dialog dlgMiCuadroDialogo = new Dialog(this);
        dlgMiCuadroDialogo.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        //asignamos el layout
        dlgMiCuadroDialogo.setContentView(R.layout.alerta_crear_cuenta);
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