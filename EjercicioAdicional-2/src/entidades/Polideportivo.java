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
public final class Polideportivo extends Edificio{
    private String nombre;
    private boolean techado;

    public Polideportivo() {
    }

    public Polideportivo(String nombre, boolean techado, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.techado = techado;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isTechado() {
        return techado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTechado(boolean techado) {
        this.techado = techado;
    }
    
    public void cargarPolideportivo(){
        System.out.println("CARGAR DATOS DE POLIDEPORTIVO");
        System.out.println("");
        Scanner leer = new Scanner (System.in);
        cargarEdificio();
        System.out.println("Ingrese el nombre del Polideportivo");
        setNombre(leer.nextLine());
        System.out.println("Ingrese S si es techado y N si no lo es");
        char eleccionTecho = leer.next().toUpperCase().charAt(0);
        if(eleccionTecho =='S'){
            this.techado = true;
        }else{
            this.techado = false;
        }
    }

    @Override
    public void calcularSuperficie(double ancho, double largo) {
        double superficie = ancho*largo;
        System.out.println("La superfcicie total es "+superficie);
    }

    @Override
    public void calcularVoluman(double ancho, double largo, double alto) {
        double volumen = ancho*largo*alto;
        System.out.println("El volumen total es "+volumen);
    }
    
}
