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
public final class Cliente {
    private String nombre;
    private Integer dni;

    public Cliente() {
    }

    public Cliente(String nombre, Integer dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }
    
    public void cargarCliente(){
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese el nombre completo del cliente");
        setNombre(leer.nextLine());
        System.out.println("Ingrese el DNI");
        setDni(leer.nextInt());
    }
}
