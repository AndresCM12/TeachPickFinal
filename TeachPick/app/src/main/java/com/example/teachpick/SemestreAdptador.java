package com.example.teachpick;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class SemestreAdptador extends ArrayAdapter{

    private Context context;
    private int layout;
    private Semestre[] aSemstres;

    public SemestreAdptador(@NonNull Context context, int resource, @NonNull Semestre[] objects) {
        super(context, resource, objects);
        this.context=context;
        this.layout=resource;
        this.aSemstres=objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView==null){
            convertView = ((Activity)context).getLayoutInflater().inflate(layout, parent, false);
        }

        TextView txtVwSemestre,
                    txtVwMateria1,
                    txtVwMateria2,
                    txtVwMateria3,
                    txtVwMateria4,
                    txtVwMateria5,
                    txtVwMateria6,
                    txtVwMateria7,
                    txtVwMateria8,
                    txtVwMateria9;

        txtVwSemestre=convertView.findViewById(R.id.txtVwSemestre);
        txtVwMateria1=convertView.findViewById(R.id.txtVwMateria1);
        txtVwMateria2=convertView.findViewById(R.id.txtVwMateria2);
        txtVwMateria3=convertView.findViewById(R.id.txtVwMateria3);
        txtVwMateria4=convertView.findViewById(R.id.txtVwMateria4);
        txtVwMateria5=convertView.findViewById(R.id.txtVwMateria5);
        txtVwMateria6=convertView.findViewById(R.id.txtVwMateria6);
        txtVwMateria7=convertView.findViewById(R.id.txtVwMateria7);
        txtVwMateria8=convertView.findViewById(R.id.txtVwMateria8);
        txtVwMateria9=convertView.findViewById(R.id.txtVwMateria9);

        txtVwSemestre.setText(aSemstres[position].getSemestre());
        txtVwMateria1.setText(aSemstres[position].getMateria1());
        txtVwMateria2.setText(aSemstres[position].getMateria2());
        txtVwMateria3.setText(aSemstres[position].getMateria3());
        txtVwMateria4.setText(aSemstres[position].getMateria4());
        txtVwMateria5.setText(aSemstres[position].getMateria5());
        txtVwMateria6.setText(aSemstres[position].getMateria6());
        txtVwMateria7.setText(aSemstres[position].getMateria7());
        txtVwMateria8.setText(aSemstres[position].getMateria8());
        txtVwMateria9.setText(aSemstres[position].getMateria9());

        return convertView;
    }

}