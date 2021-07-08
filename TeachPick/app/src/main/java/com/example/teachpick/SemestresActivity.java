package com.example.teachpick;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import spencerstudios.com.bungeelib.Bungee;

public class SemestresActivity extends AppCompatActivity {
    Intent reIntent;
    Intent rIntent;
    Intent eIntent;

    String carrera, materia;

    Semestre[] aSemestresSistemas={
            new Semestre("Semestre 1", "Fundamentos de programacion","Calculo diferencial","Matematicas discretas","Fudamentos de investigacion","Taller de etica","Taller de  administracion","","",""),
            new Semestre("Semestre 2", "Quimica general","Programacion orientada a objetos","Calculo integral","Probabilidad y estadistica","Contabilidad financiera","Algebra lineal","","",""),
            new Semestre("Semestre 3", "Estructura de Datos","Cálculo vectorial","Des. Sustentable","Física General","Investigación de operac","Cultura Emp.","","",""),
            new Semestre("Semestre 4", "Tópicos Avanz. de progr.","Ecuaciones diferenciales","Métodos numéricos","Pipios. Eléctricos y aplc. Dig.","Simulación","Fund. Bases de Datos","","",""),
            new Semestre("Semestre 5", "Fundamentos de programacion","Calculo diferencial","Matematicas discretas","Fudamentos de investigacion","Taller de etica","Taller de  administracion","","",""),
            new Semestre("Semestre 6", "Estructura de Datos","Cálculo vectorial","Des. Sustentable","Física General","Investigación de operac","Cultura Emp.","","",""),
    };

    Semestre[] aSemestresIndustrial={
            new Semestre("Semestre 1", "F programacion","Calferencial","Matematicas discretas","Fudamentos de investigacion","Taller de etica","Taller de  administracion","","",""),
            new Semestre("Semestre 2", "Qa general","Progentada a objetos","Calculo integral","Probabilidad y estadistica","Contabilidad financiera","Algebra lineal","","",""),
    };

    Semestre[] aSemestresInformatica={
            new Semestre("Semestre 1", "Fundamentos de programacion","Calculo diferencial","Matematicas discretas","Fudamentos de investigacion","Taller de etica","Taller de  administracion","","",""),

    };

    ListView lstVwSemestre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //esta parte es para hacer pantalla completa, quitar las notis pero la action bar la quitas en themes
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_semestres);
        eIntent = new Intent(this, MateriasActivity.class);
        rIntent = getIntent();

        carrera=rIntent.getStringExtra("CARRERA");

        if (rIntent ==null){
            reIntent = getIntent();
            carrera = reIntent.getStringExtra("CARRERA");
        }

        TextView txtVwSemestre=findViewById(R.id.txtVwTituloSemestres);
        txtVwSemestre.setText(carrera);
    }

    @Override
    protected void onStart() {
        super.onStart();
        lstVwSemestre=findViewById(R.id.lstVwSemestres);


        if(carrera.equals("Sistemas Computacionales")) {
            lstVwSemestre.setAdapter(new SemestreAdptador(SemestresActivity.this, R.layout.mi_lista_semestres, aSemestresSistemas));
        }
        if(carrera.equals("Industrial")) {
            lstVwSemestre.setAdapter(new SemestreAdptador(SemestresActivity.this, R.layout.mi_lista_semestres, aSemestresIndustrial));
        }
        if(carrera.equals("Informatica")) {
            lstVwSemestre.setAdapter(new SemestreAdptador(SemestresActivity.this, R.layout.mi_lista_semestres, aSemestresInformatica));
        }

    }

    @SuppressLint("ResourceType")
    public void onClickMat(View v){
        Log.wtf("", ""+v.getId());
        //if(v.getId()==2131362226) {
            eIntent.putExtra("CARRERA", carrera);
            eIntent.putExtra("MATERIA", ((TextView) v).getText().toString());
            startActivity(eIntent);
            Bungee.slideLeft(this);
            finish();
        //}
    }
    public void regresar(View v){
        Intent intent = new Intent(this, CarrerasActivity.class);
        startActivity(intent);
        Bungee.slideRight(this);
        finish();
    }

}