package com.example.teachpick;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

public class MateriasActivity extends AppCompatActivity {

    String materia;

    Intent intentG;
    Intent eIntent;

    Materia[] aMateriasFundamentosDeProgramacion={
            new Materia("Fundamentos de programacion", "Edgar Alejandro Tebar Nevarez", 10, 5),
            new Materia("", "Andres Chavez", 10, 6),
            new Materia("", "Fernando Vargas", 10, 7)
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
        setContentView(R.layout.activity_materias);
        //eIntent = new Intent(this, Activity.class);
        intentG = getIntent();
        materia=intentG.getStringExtra("MATERIA");
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
        Log.wtf("PROFE:", "" + profesor.getText().toString());
        //eIntent.putExtra("PROFESOR", profesor.getText().toString());
        //startActivity(eIntent);
        //finish();
    }

}