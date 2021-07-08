package com.example.teachpick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ListView;

public class CarrerasActivity extends AppCompatActivity {

    Carrera[] aCarreras={
            new Carrera("Sistemas Computacionales", 48, 5.0),
            new Carrera("Industrial", 46, 5.2),
            new Carrera("Informatica", 44, 5.4),
            new Carrera("Diseno industrial", 42, 5.6),
            new Carrera("Administracion", 40, 5.8),
            new Carrera("Arquitectura", 38, 6.0),
            new Carrera("Gestion Empresarial", 36, 6.2)
    };

    ListView lstVwCarrera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //esta parte es para hacer pantalla completa, quitar las notis pero la action bar la quitas en themes
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_carreras);

    }

    @Override
    protected void onStart() {
        super.onStart();
        lstVwCarrera=findViewById(R.id.lstVwCarreras);

        lstVwCarrera.setAdapter(new CarreraAdaptador(this, R.layout.mi_lista_carreras, aCarreras));
    }

    public void onVer(View v){

    }

}