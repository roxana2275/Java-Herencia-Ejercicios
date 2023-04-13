/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public abstract class Alojamiento {
     protected String nombre;
     protected String direccion;
     protected String localidad;
     protected String Gerente;

    public Alojamiento() {
    }

    public Alojamiento(String nombre, String direccion, String localidad, String Gerente) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.localidad = localidad;
        this.Gerente = Gerente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getGerente() {
        return Gerente;
    }

    public void setGerente(String Gerente) {
        this.Gerente = Gerente;
    }

    @Override
    public String toString() {
        return "Alojamiento: " + "Nombre= " + nombre + ", Direccion= " + direccion + ", Localidad= " + localidad + ", Gerente= " + Gerente;
    }
    
    
    
    public void cargarAlojamiento(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre del alojamiento");
        setNombre(leer.nextLine());
        System.out.println("Ingrese la dirección");
        setDireccion(leer.nextLine());
        System.out.println("Ingrese la localidad");
        setLocalidad(leer.nextLine());
        System.out.println("Ingrese el nombre del gerente");
        setGerente(leer.nextLine());
    }
    
}
