package com.example.teachpick;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class CarreraAdaptador extends ArrayAdapter {

    private Context context;
    private int layout;
    private Carrera[] aCarreras;

    public CarreraAdaptador(@NonNull Context context, int resource, @NonNull Carrera[] objects){
        super(context, resource, objects);
        this.context=context;
        this.layout=resource;
        this.aCarreras=objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView==null) {
            convertView = ((Activity)context).getLayoutInflater().inflate(layout, parent, false);
        }

        TextView txtVwCarrera, txtVwMaterias, txtVwIndSat;
        txtVwCarrera=convertView.findViewById(R.id.txtVwCarrera);
        txtVwMaterias=convertView.findViewById(R.id.txtVwMaterias);
        txtVwIndSat=convertView.findViewById(R.id.txtVwIndSat);

        txtVwCarrera.setText(aCarreras[position].getCarrera());
        txtVwMaterias.setText("Total de materias: "+aCarreras[position].getMaterias()+"");
        txtVwIndSat.setText("Indice de Satisfaccion: "+aCarreras[position].getIndSat()+"");

        return convertView;
    }
}