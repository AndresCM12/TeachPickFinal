package com.example.teachpick;

public class Semestre {

    private String semestre;
    private String materia1;
    private String materia2;
    private String materia3;
    private String materia4;
    private String materia5;
    private String materia6;
    private String materia7;
    private String materia8;
    private String materia9;

    public Semestre(){

    }

    public Semestre(String semestre,
                    String materia1,
                    String materia2,
                    String materia3,
                    String materia4,
                    String materia5,
                    String materia6,
                    String materia7,
                    String materia8,
                    String materia9){

        this.semestre=semestre;
        this.materia1=materia1;
        this.materia2=materia2;
        this.materia3=materia3;
        this.materia4=materia4;
        this.materia5=materia5;
        this.materia6=materia6;
        this.materia7=materia7;
        this.materia8=materia8;
        this.materia9=materia9;

    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getMateria1() {
        return materia1;
    }

    public void setMateria1(String materia1) {
        this.materia1 = materia1;
    }

    public String getMateria2() {
        return materia2;
    }

    public void setMateria2(String materia2) {
        this.materia2 = materia2;
    }

    public String getMateria3() {
        return materia3;
    }

    public void setMateria3(String materia3) {
        this.materia3 = materia3;
    }

    public String getMateria4() {
        return materia4;
    }

    public void setMateria4(String materia4) {
        this.materia4 = materia4;
    }

    public String getMateria5() {
        return materia5;
    }

    public void setMateria5(String materia5) {
        this.materia5 = materia5;
    }

    public String getMateria6() {
        return materia6;
    }

    public void setMateria6(String materia6) {
        this.materia6 = materia6;
    }

    public String getMateria7() {
        return materia7;
    }

    public void setMateria7(String materia7) {
        this.materia7 = materia7;
    }

    public String getMateria8() {
        return materia8;
    }

    public void setMateria8(String materia8) {
        this.materia8 = materia8;
    }

    public String getMateria9() {
        return materia9;
    }

    public void setMateria9(String materia9) {
        this.materia9 = materia9;
    }
}