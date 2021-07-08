package com.example.teachpick;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ListView;
import android.widget.TextView;

import spencerstudios.com.bungeelib.Bungee;

public class ProfesorActivity extends AppCompatActivity {
    Intent rIntent;
    Intent eIntent;
    String carrera, materia;
    Comentarios[] aComentarios={
            new Comentarios("18550635", "Es buen profesor pero a veces sus exámenes son muy difíciles", (float) 8.0),
            new Comentarios("18550978", "Me gustó su clase es interesante, pero sus exámnes son demasiado para lo que te esperas", (float)6.0),
            new Comentarios("18550655", "Buen profe, lo recomiendo, aprendes muy bien con él", (float)9.0),

    };
    ListView lstVwComentarios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //esta parte es para hacer pantalla completa, quitar las notis pero la action bar la quitas en themes
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_profesor);

        eIntent = new Intent(this, MateriasActivity.class);

        rIntent = getIntent();
        rIntent.getStringExtra("PROFESOR");

        carrera = rIntent.getStringExtra("CARRERA");
        materia = rIntent.getStringExtra("MATERIA");

        TextView txtVwNP = findViewById(R.id.txtVwNCProfesor);
        TextView txtVwCA = findViewById(R.id.txtVwCalifiacion);

        txtVwNP.setText(rIntent.getStringExtra("PROFESOR"));
            txtVwCA.setText(rIntent.getStringExtra("CALIFICACION"));

    }

    @Override
    protected void onStart() {
        super.onStart();
        lstVwComentarios=findViewById(R.id.lstVwComentarios);

        lstVwComentarios.setAdapter(new ComentariosAdaptador(this, R.layout.mi_lista_comentarios, aComentarios));
    }
    public void regresar(View v){
         eIntent.putExtra("CARRERA",carrera);
         eIntent.putExtra("MATERIA",materia);
        Log.wtf("",""+materia);
        startActivity(eIntent);
        Bungee.slideRight(this);
        finish();
    }
}