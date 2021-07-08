package com.example.teachpick;

public class Materia {

    private String materia;
    private String profe;
    private int calGen;
    private int calAlu;

    public Materia(){

    }

    public Materia(String materia, String profe, int calGen, int calAlu){
        this.materia=materia;
        this.profe=profe;
        this.calGen=calGen;
        this.calAlu=calAlu;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getProfe() {
        return profe;
    }

    public void setProfe(String profe) {
        this.profe = profe;
    }

    public int getCalGen() {
        return calGen;
    }

    public void setCalGen(int calGen) {
        this.calGen = calGen;
    }

    public int getCalAlu() {
        return calAlu;
    }

    public void setCalAlu(int calAlu) {
        this.calAlu = calAlu;
    }
}