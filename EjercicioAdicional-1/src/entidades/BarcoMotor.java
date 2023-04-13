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
public class BarcoMotor extends Barco{
    private Integer potenciaCV;

    public BarcoMotor() {
    }

 
    public BarcoMotor(Integer potenciaCV, String matricula, Double eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
    }

   

    public Integer getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(Integer potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public void cargarBarcoMotor(){
        Scanner leer = new Scanner (System.in);
        
        super.cargarBarco();
        System.out.println("Ingrese la potencia CV");
        setPotenciaCV(leer.nextInt());
        
    }
}
