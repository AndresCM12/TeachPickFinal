package com.example.teachpick;

import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

public class Comentarios  {

    private String Usuario;
    private String Comentario;
    private float calificacion;

    public Comentarios(){

    }

    public Comentarios(String x, String y, float z){
        Usuario =x;
        Comentario = y;
        calificacion = z;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String usuario) {
        Usuario = usuario;
    }

    public String getComentario() {
        return Comentario;
    }

    public void setComentario(String comentario) {
        Comentario = comentario;
    }

    public float getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }
}
