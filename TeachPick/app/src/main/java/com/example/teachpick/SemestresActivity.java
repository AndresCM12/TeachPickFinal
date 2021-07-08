package com.example.teachpick;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class SemestresActivity extends AppCompatActivity {

    Intent rIntent;
    Intent eIntent;

    String carrera, materia;

    Semestre[] aSemestresSistemas={
            new Semestre("Semestre 1", "Fundamentos de programacion","Calculo diferencial","Matematicas discretas","Fudamentos de investigacion","Taller de etica","Taller de  administracion","","",""),
            new Semestre("Semestre 2", "Quimica general","Programacion orientada a objetos","Calculo integral","Probabilidad y estadistica","Contabilidad financiera","Algebra lineal","","",""),
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
        setContentView(R.layout.activity_semestres);
        eIntent = new Intent(this, MateriasActivity.class);
        rIntent = getIntent();
        carrera=rIntent.getStringExtra("CARRERA");
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
            finish();
        //}
    }

}