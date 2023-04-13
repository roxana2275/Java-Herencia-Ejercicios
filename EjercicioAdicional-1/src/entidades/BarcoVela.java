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
public class BarcoVela extends Barco{
    protected Integer numeroVelas;

    public BarcoVela() {
    }


    public BarcoVela(Integer numeroVelas, String matricula, Double eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.numeroVelas = numeroVelas;
    }
    
    

    public Integer getNumeroVelas() {
        return numeroVelas;
    }

    public void setNumeroVelas(Integer numeroVelas) {
        this.numeroVelas = numeroVelas;
    }
    
    public void cargarBarcoVela(){
        Scanner leer = new Scanner (System.in);
        
        super.cargarBarco();
        System.out.println("Ingrese la cantidad de velas");
        setNumeroVelas(leer.nextInt());
        
    }
}
