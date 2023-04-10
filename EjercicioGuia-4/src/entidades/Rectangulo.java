/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import calculoFormas.Area;
import calculoFormas.Perimetro;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Rectangulo implements Area, Perimetro{
    private Double ladoA;
    private Double ladoB;

    public Rectangulo() {
    }

    public Rectangulo(Double ladoA, Double ladoB) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    public Double getLadoA() {
        return ladoA;
    }

    public void setLadoA(Double ladoA) {
        this.ladoA = ladoA;
    }

    public Double getLadoB() {
        return ladoB;
    }

    public void setLadoB(Double ladoB) {
        this.ladoB = ladoB;
    }
    
    public void cargarRectangulo(){
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese el valor del lado A");
        this.ladoA=leer.nextDouble();
        System.out.println("Ingrese el valor del lado B");
        this.ladoB=leer.nextDouble();
    }

    @Override
    public void areaFigura() {
        double area = this.ladoA*this.ladoB;
        System.out.println("El area del rectangulo es "+area);
    }

    @Override
    public void perimetroFigura() {
        double perimetro = (this.ladoA+this.ladoB)*2;
        System.out.println("El perimetro del rectangulo es "+perimetro);
    }
}
