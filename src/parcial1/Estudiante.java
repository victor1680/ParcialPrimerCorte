/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial1;

/**
 *
 * @author PCS
 */
public class Estudiante extends Persona {

    private Programa programa;
    private int semestre;
    private double valorCalculadoMatricula;
    private double valorDescontado;
    private double valorBase;

    public Estudiante() {
    }

    public Estudiante(Programa programa, int semestre, double valorCalculadoMatricula, double valorDescontado, double valorBase) {
        this.programa = programa;
        this.semestre = semestre;
        this.valorCalculadoMatricula = valorCalculadoMatricula;
        this.valorDescontado = valorDescontado;
        this.valorBase = valorBase;
    }

    /**
     * @return the programa
     */
    public Programa getPrograma() {
        return programa;
    }

    /**
     * @param programa the programa to set
     */
    public void setPrograma(Programa programa) {
        this.programa = programa;
    }

    /**
     * @return the semestre
     */
    public int getSemestre() {
        return semestre;
    }

    /**
     * @param semestre the semestre to set
     */
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    /**
     * @return the valorCalculadoMatricula
     */
    public double getValorCalculadoMatricula() {
        return valorCalculadoMatricula;
    }

    /**
     * @param valorCalculadoMatricula the valorCalculadoMatricula to set
     */
    public void setValorCalculadoMatricula(double valorCalculadoMatricula) {
        this.valorCalculadoMatricula = valorCalculadoMatricula;
    }

    /**
     * @return the valorDescontado
     */
    public double getValorDescontado() {
        return valorDescontado;
    }

    /**
     * @param valorDescontado the valorDescontado to set
     */
    public void setValorDescontado(double valorDescontado) {
        this.valorDescontado = valorDescontado;
    }

    /**
     * @return the valorBase
     */
    public double getValorBase() {
        return valorBase;
    }

    /**
     * @param valorBase the valorBase to set
     */
    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }

}
