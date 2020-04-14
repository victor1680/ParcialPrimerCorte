/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial1;

import java.util.Scanner;

/**
 *
 * @author PCS
 */
public class Programa {

    private String nombre;
    private double valorBase;

    public Programa() {
    }

    public Programa(String nombre, double valorBase) {
        this.nombre = nombre;
        this.valorBase = valorBase;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
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
