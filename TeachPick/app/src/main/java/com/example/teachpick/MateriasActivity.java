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

public class MateriasActivity extends AppCompatActivity {

    String materia, carrera;

    Intent intentG;
    Intent aIntent;
    Intent rIntent;
    Intent reIntent;
    Intent eIntent;

    Materia[] aMateriasFundamentosDeProgramacion={
            new Materia("Fundamentos de programacion", "Edgar Alejandro Tebar Nevarez", 10, 9),
            new Materia("", "Andres Chavez", 10, 10),
            new Materia("", "Héctor Órozco", 5, 7),
            new Materia("", "Juan Pérez", 8, 4),
            new Materia("", "César Gonzales", 9, 5),
            new Materia("", "Nidia Gonzales", 6, 6),
            new Materia("", "Dora Gomez ", 5, 7),
    };

    Materia[] aMateriasCalculoDiferencial={
            new Materia("Calculo diferencial", "Andres Chavez", 9, 5),
            new Materia("", "Edgar Alejandro Tebar Nevarez", 9, 6),
            new Materia("", "Fernando Vargas", 9, 7)
    };

    Materia[] aMateriasMatematicasDiscretas={
            new Materia("REDES DE COMPUTADORAS", "Fernando Vargas", 8, 5)
    };

    ListView lstVwMateria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        //esta parte es para hacer pantalla completa, quitar las notis pero la action bar la quitas en themes
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_materias);
        rIntent = getIntent();
        carrera=rIntent.getStringExtra("CARRERA");
        if(rIntent==null){
            reIntent = getIntent();
            carrera = reIntent.getStringExtra("CARRERA");
        }
        aIntent = new Intent(this, SemestresActivity.class);

        eIntent = new Intent(this, ProfesorActivity.class);
        intentG = getIntent();
        materia=intentG.getStringExtra("MATERIA");

        if(intentG==null){
            reIntent = getIntent();
            materia = reIntent.getStringExtra("MATERIA");
        }

        TextView txtVwTituloM=findViewById(R.id.txtVwTituloMateria);
        txtVwTituloM.setText(materia);
    }

    @Override
    protected void onStart() {
        super.onStart();
        lstVwMateria=findViewById(R.id.lstVwMaterias);

        if(materia.equals("Fundamentos de programacion")) {
            lstVwMateria.setAdapter(new MateriaAdaptador(MateriasActivity.this, R.layout.mi_lista_materias, aMateriasFundamentosDeProgramacion));
        }

        if(materia.equals("Calculo diferencial")){
            lstVwMateria.setAdapter(new MateriaAdaptador(MateriasActivity.this, R.layout.mi_lista_materias, aMateriasCalculoDiferencial));
        }

        if(materia.equals("Calculo diferencial")){
            lstVwMateria.setAdapter(new MateriaAdaptador(MateriasActivity.this, R.layout.mi_lista_materias, aMateriasMatematicasDiscretas));
        }
    }

    public void onClickProfe(View v){
        TextView profesor=(TextView)v.findViewById(R.id.txtVwProfe);
        TextView calificacion=(TextView)v.findViewById(R.id.txtVwCalAlu);
        Log.wtf("PROFE:", "" + profesor.getText().toString());
        eIntent.putExtra("PROFESOR", profesor.getText().toString());
        eIntent.putExtra("CALIFICACION",calificacion.getText().toString());
        eIntent.putExtra("CARRERA",carrera);
        eIntent.putExtra("MATERIA",materia);
        startActivity(eIntent);
        Bungee.slideLeft(this);
        finish();
    }

    public void regresar(View v){
       aIntent.putExtra("CARRERA", carrera);
        Log.wtf("",""+carrera);
        startActivity(aIntent);

        Bungee.slideRight(this);
        finish();
    }

}