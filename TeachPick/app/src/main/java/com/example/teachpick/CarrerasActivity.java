package com.example.teachpick;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import spencerstudios.com.bungeelib.Bungee;

public class CarrerasActivity extends AppCompatActivity {

    Intent intent;

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
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_carreras);
        intent = new Intent(this, SemestresActivity.class);
    }

    @Override
    protected void onStart() {
        super.onStart();
        lstVwCarrera=findViewById(R.id.lstVwCarreras);

        lstVwCarrera.setAdapter(new CarreraAdaptador(this, R.layout.mi_lista_carreras, aCarreras));

        lstVwCarrera.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.wtf("", "" + position);

                    TextView carrera=(TextView)view.findViewById(R.id.txtVwCarrera);

                    intent.putExtra("CARRERA", carrera.getText().toString());
                    startActivity(intent);
                    Bungee.slideLeft(CarrerasActivity.this);
                    finish();

            }
        });
    }

}