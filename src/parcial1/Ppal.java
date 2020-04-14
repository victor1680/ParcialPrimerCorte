/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author PCS
 */
public class Ppal {

    static ArrayList<Estudiante> estudiantes;
    static ArrayList<Programa> programas;
    static ArrayList<Matricula> matriculas;

    private static void gestionProgramas() {
        Scanner entrada = new Scanner(System.in);
        // El while será ejecutado hasta que salir sea TRUE.
        boolean salir = false;
        while (!salir) {
            // Le indicamos al usuario cuales son sus opciones:
            System.out.println(" INGRESE LA OPCIÓN ");
            System.out.println(" 1 - crear Programa ");
            System.out.println(" 2 - Listar programas ingresados");
            System.out.println(" 3 - Eliminar Programa ");
            System.out.println(" 4 - Modificar Programa ");
            System.out.println(" 0 - Salir ");

            // Obtenemos el numero ingresado por el usuario en la consola:
            int opcion = Integer.parseInt(entrada.nextLine());

            // Según el número que el usuario ingreso en la consola se ejecutará el "case" correspondiente.
            switch (opcion) {
                case 1: // "case" Ingresar nuevo Programa
                    // Instanciamos un Programa vacio (Sin atributos)
                    Programa programa = new Programa();
                    System.out.println("Ingrese Nombre del Programa:");
                    programa.setNombre(entrada.nextLine());
                    System.out.println("Ingrese valor base del Programa: ");
                    // De la misma forma, guardamos la marca
                    programa.setValorBase(entrada.nextDouble());

                    programas.add(programa);

                    // Le avisamos al usuario del Programa creado
                    System.out.println("Programa CREADO");

                    break;
                case 2: // Listar todos los programas ingresados en la lista:
                    // el for va a recorrer todos los elementos que estén almacenados en la lista.
                    for (int i = 0; i < programas.size(); i++) { // programas.size() Permite ver cuantos elementos hay guardados.
                        System.out.println("Programa: " + (i + 1));
                        // Para obtener un elemento de la lista, utilizamos .get():
                        programa = programas.get(i);

                        System.out.println("Nombre: " + programa.getNombre());
                        System.out.println("Valor base: " + programa.getValorBase());

                    }

                    break;
                case 3: // ELiminar Programa de la lista
                    System.out.println("Ingresar el nombre del Programa a eliminar: ");
                    String nombre = entrada.nextLine();

                    for (int i = 0; i < programas.size(); i++) {
                        programa = programas.get(i);
                        if (nombre.equals(programa.getNombre())) {
                            // Eliminamos un elemento de la lista utilizando .remove()
                            programas.remove(i);
                            System.out.println("Programa eliminado");
                        }
                    }

                    break;
                case 4: // Modificar Programa:
                    System.out.println(" Ingrese el nombre del Programa a modificar");
                    nombre = entrada.nextLine();
                    for (int i = 0; i < programas.size(); i++) {
                        programa = programas.get(i);
                        if (nombre.equals(programa.getNombre())) {
                            System.out.println("Nombre: " + programa.getNombre());
                            System.out.println("Valor Base: " + programa.getValorBase());

                            System.out.println("Ingrese nueva nombre: ");
                            String nombreNuevo = entrada.nextLine();
                            System.out.println("Ingrese nuevo valor Base: ");
                            double valorBaseNuevo = entrada.nextDouble();
                            programa.setNombre(nombreNuevo);
                            programa.setValorBase(valorBaseNuevo);
                        }
                    }
                    break;
                case 0:// "case" Salir del programa
                    salir = true;
                    System.out.println("Saliendo del programa");
                    break;
                default: // En caso de que el numero ingresado no corresponda a ningún "case"
                    System.out.println("Opción invalida!!!!!!!");

            }
        }
    }

    private static void gestionEstudiantes() {
        Scanner entrada = new Scanner(System.in);
        // El while será ejecutado hasta que salir sea TRUE.
        boolean salir = false;
        while (!salir) {
            // Le indicamos al usuario cuales son sus opciones:
            System.out.println(" INGRESE LA OPCIÓN ");
            System.out.println(" 1 - crear Estudiante ");
            System.out.println(" 2 - Listar Estudiantes ingresados");
            System.out.println(" 3 - Eliminar Estudiante ");
            System.out.println(" 4 - Modificar Estudiante ");
            System.out.println(" 0 - Salir ");

            // Obtenemos el numero ingresado por el usuario en la consola:
            int opcion = Integer.parseInt(entrada.nextLine());

            // Según el número que el usuario ingreso en la consola se ejecutará el "case" correspondiente.
            switch (opcion) {
                case 1: // "case" Ingresar nuevo Estudiante
                    // Instanciamos un Estudiante vacio (Sin atributos)

                    int semestre;
                    double valorCalculadoMatricula;
                    double valorDescontado;
                    double valorBase;

                    Estudiante estudiante = new Estudiante();
                    System.out.println("Ingrese Numero de documento de identidad del Estudiante:");
                    estudiante.setNumeroDocumentoIdentidad(entrada.nextInt());
                    System.out.println("Ingrese Nombre del Estudiante:");
                    estudiante.setNombres(entrada.nextLine());
                    System.out.println("Ingrese Apellido del Estudiante:");
                    estudiante.setApellidos(entrada.nextLine());

                    System.out.println("Ingrese Estracto del Estudiante:");
                    estudiante.setEstracto(entrada.nextInt());
                    System.out.println("Ingrese Edad del Estudiante:");
                    estudiante.setEdad(entrada.nextInt());

                    System.out.println("Ingrese el nombre del programa del Estudiante: ");
                    String nombrePrograma = entrada.nextLine();
                    estudiante.setPrograma(obtnerPrograma(nombrePrograma));

                    estudiantes.add(estudiante);

                    // Le avisamos al usuario del Estudiante creado
                    System.out.println("Estudiante CREADO");

                    break;
                case 2: // Listar todos los estudiantess ingresados en la lista:
                    // el for va a recorrer todos los elementos que estén almacenados en la lista.
                    for (int i = 0; i < estudiantes.size(); i++) { // estudiantess.size() Permite ver cuantos elementos hay guardados.
                        System.out.println("Estudiante: " + (i + 1));
                        // Para obtener un elemento de la lista, utilizamos .get():
                        estudiante = estudiantes.get(i);
                        System.out.println("Numero de documento de identidad del Estudiante:" + estudiante.getNuemeroDocumentoIdentidad());
                        System.out.println("Nombre del Estudiante: " + estudiante.getNombres());
                        System.out.println("Apellido del Estudiante:" + estudiante.getApellidos());
                        System.out.println("Estracto del Estudiante:" + estudiante.getEstracto());
                        System.out.println("Edad del Estudiante:" + estudiante.getEdad());
                        System.out.println("Valor base matricula del Estudiante: " + estudiante.getValorBase());
                        System.out.println("Valor Descontado Matricula del Estudiante: " + estudiante.getValorDescontado());
                        System.out.println("Valor Calculado Matricula del Estudiante: " + estudiante.getValorCalculadoMatricula());
                        System.out.println("Nombre del programa del Estudiante: " + estudiante.getPrograma().getNombre());

                    }

                    break;
                case 3: // ELiminar Estudiante de la lista
                    System.out.println("Ingresar el numero de documento del Estudiante a eliminar: ");
                    int numeroIdentidad = entrada.nextInt();

                    for (int i = 0; i < estudiantes.size(); i++) {
                        estudiante = estudiantes.get(i);
                        if (numeroIdentidad == estudiante.getNuemeroDocumentoIdentidad()) {
                            // Eliminamos un elemento de la lista utilizando .remove()
                            estudiantes.remove(i);
                            System.out.println("Estudiante eliminado");
                        }
                    }

                    break;
                case 4: // Modificar Estudiante:
                    System.out.println("Ingresar el numero de documento del Estudiante a modificar: ");
                    numeroIdentidad = entrada.nextInt();

                    for (int i = 0; i < estudiantes.size(); i++) {
                        estudiante = estudiantes.get(i);
                        if (numeroIdentidad == estudiante.getNuemeroDocumentoIdentidad()) {
                            System.out.println("Numero de documento de identidad del Estudiante:" + estudiante.getNuemeroDocumentoIdentidad());
                            System.out.println("Nombre del Estudiante: " + estudiante.getNombres());
                            System.out.println("Apellido del Estudiante:" + estudiante.getApellidos());
                            System.out.println("Estracto del Estudiante:" + estudiante.getEstracto());
                            System.out.println("Edad del Estudiante:" + estudiante.getEdad());
                            System.out.println("Valor base matricula del Estudiante: " + estudiante.getValorBase());
                            System.out.println("Valor Descontado Matricula del Estudiante: " + estudiante.getValorDescontado());
                            System.out.println("Valor Calculado Matricula del Estudiante: " + estudiante.getValorCalculadoMatricula());
                            System.out.println("Nombre del programa del Estudiante: " + estudiante.getPrograma().getNombre());
                            System.out.println("_______________________________________________________________________________________");

                            System.out.println("Ingrese Nombre del Estudiante:");
                            estudiante.setNombres(entrada.nextLine());
                            System.out.println("Ingrese Apellido del Estudiante:");
                            estudiante.setApellidos(entrada.nextLine());

                            System.out.println("Ingrese Estracto del Estudiante:");
                            estudiante.setEstracto(entrada.nextInt());
                            System.out.println("Ingrese Edad del Estudiante:");
                            estudiante.setEdad(entrada.nextInt());

                            System.out.println("Ingrese el nombre del programa del Estudiante: ");
                            nombrePrograma = entrada.nextLine();
                            estudiante.setPrograma(obtnerPrograma(nombrePrograma));

                        }
                    }
                    break;
                case 0:// "case" Salir del programa
                    salir = true;
                    System.out.println("Saliendo del programa");
                    break;
                default: // En caso de que el numero ingresado no corresponda a ningún "case"
                    System.out.println("Opción invalida!!!!!!!");

            }
        }

    }

    private static void gestionMatriculas() {
        Scanner entrada = new Scanner(System.in);
        // El while será ejecutado hasta que salir sea TRUE.
        boolean salir = false;
        while (!salir) {
            // Le indicamos al usuario cuales son sus opciones:
            System.out.println(" INGRESE LA OPCIÓN ");
            System.out.println(" 1 - Matricular Estudiante ");
            System.out.println(" 2 - Listar Estudiantes matriculados");
            System.out.println(" 3 - Total ingresos");
            System.out.println(" 0 - Salir ");

            // Obtenemos el numero ingresado por el usuario en la consola:
            int opcion = Integer.parseInt(entrada.nextLine());

            // Según el número que el usuario ingreso en la consola se ejecutará el "case" correspondiente.
            switch (opcion) {
                case 1:
                    Matricula matricula = new Matricula();
                    System.out.println("Ingresar el numero de documento del Estudiante a eliminar: ");
                    int numeroIdentidad = entrada.nextInt();
                    matricula.setEstudiante(obtenerEstudiante(numeroIdentidad));
                    double descuento = matricula.calcularDescuento();

                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 0:// "case" Salir del programa
                    salir = true;
                    System.out.println("Saliendo del programa");
                    break;

            }
        }

    }

    public static Programa obtnerPrograma(String nombre) {
        boolean encontro = false;
        Programa programa = null;
        for (int i = 0; i < programas.size(); i++) {
            programa = programas.get(i);
            if (nombre.equals(programa.getNombre())) {
                encontro = true;
                programa = programas.get(i);
            }
        }

        return programa;

    }

    private static Estudiante obtenerEstudiante(int numeroIdentidad) {

        Estudiante estudiante = null;
        for (int i = 0; i < estudiantes.size(); i++) {
            estudiante = estudiantes.get(i);
            if (numeroIdentidad == (estudiante.getNuemeroDocumentoIdentidad())) {
                estudiante = estudiantes.get(i);
            }
        }

        return estudiante;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario

        while (!salir) {

            System.out.println("1. Gestion de Programas");
            System.out.println("2. Gestion de Estudiantes");
            System.out.println("3. Gestion de matriculas");
            System.out.println("4. Salir");

            try {

                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Gestion de Programas");
                        gestionProgramas();
                        break;
                    case 2:
                        System.out.println("Gestion de Estudiantes");
                        gestionEstudiantes();
                        break;
                    case 3:
                        System.out.println("Gestion de matriculas");
                        gestionMatriculas();
                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }

        }
    }

}
