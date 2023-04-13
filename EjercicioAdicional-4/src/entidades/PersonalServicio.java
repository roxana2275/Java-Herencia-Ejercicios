/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import enumeraciones.EstadoCivil;
import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public final class PersonalServicio extends Empleado {

    private String seccion;

    private String[] secciones = {"Biblioteca", "Decanato", "Secretaria"};

    public PersonalServicio() {
    }

    public PersonalServicio(LocalDate fechaIngreso, int numeroDespacho, String nombre, String apellido, int documento, EstadoCivil estCiv) {
        super(fechaIngreso, numeroDespacho, nombre, apellido, documento, estCiv);
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String[] getSecciones() {
        return secciones;
    }

    public void setSecciones(String[] secciones) {
        this.secciones = secciones;
    }

    public void cargarPersonalServicio() {
        Scanner leer = new Scanner(System.in);
        
        cargarEmpleado();
        System.out.println("Ingrese una de las siguientes opciones");
        for (int i = 0; i < secciones.length; i++) {
            System.out.println((i+1)+"-"+getSecciones()[i]);
        }
        int auxSecciones = leer.nextInt();
        setSeccion(getSecciones()[auxSecciones-1]);
    }

}
