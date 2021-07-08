package com.example.teachpick;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MateriaAdaptador extends ArrayAdapter {

    private Context context;
    private int layout;
    private Materia[] aMaterias;


    public MateriaAdaptador(@NonNull Context context, int resource, @NonNull Materia[] objects) {
        super(context, resource, objects);
        this.context=context;
        this.layout=resource;
        this.aMaterias=objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView==null){
            convertView = ((Activity)context).getLayoutInflater().inflate(layout, parent, false);
        }

        TextView txtVwProfe, txtVwCalGen, txtVwCalAlu;
        txtVwProfe=convertView.findViewById(R.id.txtVwProfe);
        txtVwCalGen=convertView.findViewById(R.id.txtVwCalGen);
        txtVwCalAlu=convertView.findViewById(R.id.txtVwCalAlu);

        txtVwProfe.setText(aMaterias[position].getProfe());
        txtVwCalGen.setText("Calificacion general: "+aMaterias[position].getCalGen());
        txtVwCalAlu.setText("Calificacion de alumnos: "+aMaterias[position].getCalAlu());

        return convertView;
    }
}