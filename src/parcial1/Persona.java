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
public class Persona {

    private int numeroDocumentoIdentidad;
    private String nombres;
    private String apellidos;
    private int estracto;
    private int edad;

    public Persona() {
    }

    public Persona(int documento,String nombres, String apellidos, int estracto, int edad) {
        this.numeroDocumentoIdentidad = documento;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.estracto = estracto;
        this.edad = edad;
    }
    
    
    

    /**
     * @return the nombres
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * @param nombres the nombres to set
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return the estracto
     */
    public int getEstracto() {
        return estracto;
    }

    /**
     * @param estracto the estracto to set
     */
    public void setEstracto(int estracto) {
        this.estracto = estracto;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the documento
     */
    public int getNuemeroDocumentoIdentidad() {
        return numeroDocumentoIdentidad;
    }

    /**
     * @param documento the documento to set
     */
    public void setNumeroDocumentoIdentidad(int documento) {
        this.numeroDocumentoIdentidad = documento;
    }

}
