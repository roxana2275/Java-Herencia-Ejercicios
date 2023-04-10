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
public class Circulo implements Area,Perimetro{
    private Double radio;
    

    public Circulo() {
    }

    public Circulo(Double radio) {
        this.radio = radio;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    public void cargarCirculo(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor del radio");
        this.radio=leer.nextDouble();
    }

    @Override
    public void areaFigura() {
        double area = Area.pi*Math.pow(this.radio, 2);
        System.out.println("El area del circulo es "+area);
    }

    @Override
    public void perimetroFigura() {
        double perimetro = Area.pi*this.radio*2;
        System.out.println("El perimetro del circulo es "+perimetro);
    }
}
