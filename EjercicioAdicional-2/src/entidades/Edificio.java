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
public abstract class Edificio {
    protected double ancho, alto, largo;
    
        public Edificio() {
    }

    public Edificio(double ancho, double alto, double largo) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }
    public void cargarEdificio(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el alta");
        setAlto(leer.nextDouble());
        System.out.println("Ingrese el ancho");
        setAncho(leer.nextDouble());
        System.out.println("Ingrese el largo");
        setLargo(leer.nextDouble());
    }
    public abstract void calcularSuperficie(double ancho, double largo);
    public abstract void calcularVoluman(double ancho, double largo, double alto);
}
