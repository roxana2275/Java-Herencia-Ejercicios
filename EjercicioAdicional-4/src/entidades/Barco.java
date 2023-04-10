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
public class Barco {
    protected String matricula;
    protected Double eslora;
    protected int anioFabricacion;

    public Barco() {
    }

    public Barco(String matricula, Double eslora, int anioFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Double getEslora() {
        return eslora;
    }

    public void setEslora(Double eslora) {
        this.eslora = eslora;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }
    
    public void cargarBarco(){
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese la matricula");
        setMatricula(leer.next());
        System.out.println("Engrese en metros el eslora");
        setEslora(leer.nextDouble());
        System.out.println("Ingrese el año de fabricación");
        setAnioFabricacion(leer.nextInt());
    }
    

}
