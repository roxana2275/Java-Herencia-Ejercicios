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
public class BarcoLujo extends BarcoMotor{
        private Integer numeroCamarotes;

    public BarcoLujo() {
    }


    public BarcoLujo(Integer numeroCamarotes, Integer potenciaCV, String matricula, Double eslora, int anioFabricacion) {
        super(potenciaCV, matricula, eslora, anioFabricacion);
        this.numeroCamarotes = numeroCamarotes;
    }
    

    
    public Integer getNumeroCamarotes() {
        return numeroCamarotes;
    }

    public void setNumeroCamarotes(Integer numeroCamarotes) {
        this.numeroCamarotes = numeroCamarotes;
    }
    
    public void cargarBarcoLujo(){
        Scanner leer = new Scanner (System.in);
        
        super.cargarBarcoMotor();
        System.out.println("Ingrese la cantidad de camarotes");
        setNumeroCamarotes(leer.nextInt());
        
    }
    
}
