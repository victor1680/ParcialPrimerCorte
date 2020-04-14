/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial1;

import java.util.Date;

/**
 *
 * @author PCS
 */
public class Matricula {

    private double valorMatricula;
    private Date fecha;
    private Estudiante estudiante;

    public Matricula() {
        this.fecha = new Date();
    }

    public Matricula(double valorMatricula, Date fecha, Estudiante estudiante) {
        this.valorMatricula = valorMatricula;
        this.fecha = new Date();
        this.estudiante = estudiante;
    }

    double calcularDescuento() {
        double descuentoPorEstracto = 0;
        double descuentoPorSemestre = 0;
        double descuentoNeto = 0;

        if (getEstudiante().getEstracto() <= 2) {
            descuentoPorEstracto = getEstudiante().getPrograma().getValorBase() * 0.10;
        } else if (getEstudiante().getEstracto() <= 4) {
            descuentoPorEstracto = getEstudiante().getPrograma().getValorBase() * 0.06;
        } else {
            descuentoPorEstracto = getEstudiante().getPrograma().getValorBase() * 0.02;
        }

        if (getEstudiante().getSemestre() < 4) {
            descuentoPorSemestre = getEstudiante().getPrograma().getValorBase() * 0.20;
        } else if (getEstudiante().getEstracto() < 8) {
            descuentoPorSemestre = getEstudiante().getPrograma().getValorBase() * 0.10;
        } else {
            descuentoPorSemestre = getEstudiante().getPrograma().getValorBase() * 0.05;
        }

        if (descuentoPorEstracto > descuentoPorSemestre) {
            descuentoNeto = descuentoPorEstracto;
        } else {
            descuentoNeto = descuentoPorSemestre;
        }

        if ("AMBIENTAL".equals(getEstudiante().getPrograma().getNombre()) || "SISTEMAS".equals(getEstudiante().getPrograma().getNombre())) {
            descuentoNeto = descuentoNeto + descuentoNeto * 0.2;
        }
        return descuentoNeto;
    }

    /**
     * @return the valorMatricula
     */
    public double getValorMatricula() {
        return valorMatricula;
    }

    /**
     * @param valorMatricula the valorMatricula to set
     */
    public void setValorMatricula(double valorMatricula) {
        this.valorMatricula = valorMatricula;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the estudiante
     */
    public Estudiante getEstudiante() {
        return estudiante;
    }

    /**
     * @param estudiante the estudiante to set
     */
    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

}
