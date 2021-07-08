package com.example.teachpick;

public class Carrera {

    private String carrera;
    private int materias;
    private double indSat;

    public Carrera(){

    }

    public Carrera(String carrera, int materias, double indSat){
        this.carrera = carrera;
        this.materias = materias;
        this.indSat = indSat;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getMaterias() {
        return materias;
    }

    public void setMaterias(int materias) {
        this.materias = materias;
    }

    public double getIndSat() {
        return indSat;
    }

    public void setIndSat(double indSat) {
        this.indSat = indSat;
    }
}