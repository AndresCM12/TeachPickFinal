package com.example.teachpick;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class ComentariosAdaptador extends ArrayAdapter{

    private Context context;
    private int layout;
    private Comentarios aComentarios[];

    public ComentariosAdaptador(@NonNull Context context, int resource, @NonNull Comentarios[] objects){
        super(context, resource, objects);
        this.context=context;
        this.layout=resource;
        this.aComentarios=objects;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView==null) {
            convertView = ((Activity)context).getLayoutInflater().inflate(layout, parent, false);
        }

        TextView txtVwUsuario;
        TextView txtVwComentario;
        TextView txtVwCalificacion;

        txtVwUsuario = convertView.findViewById(R.id.txtVwUsuario);
        txtVwComentario = convertView.findViewById(R.id.txtVwComentario);
        txtVwCalificacion = convertView.findViewById(R.id.txtVwCali);

        txtVwUsuario.setText("Usuario: "+aComentarios[position].getUsuario()+" ");
        txtVwComentario.setText(aComentarios[position].getComentario()+" ");
        txtVwCalificacion.setText("Calificación: "+aComentarios[position].getCalificacion()+" ");

        return convertView;
    }
}
