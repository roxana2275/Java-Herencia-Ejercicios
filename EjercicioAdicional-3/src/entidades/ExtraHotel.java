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
public abstract class ExtraHotel extends Alojamiento{
    protected boolean privado;
    protected double metrosCuadrados;

    public ExtraHotel() {
    }

    public ExtraHotel(boolean privado, double metrosCuadrados, String nombre, String direccion, String localidad, String Gerente) {
        super(nombre, direccion, localidad, Gerente);
        this.privado = privado;
        this.metrosCuadrados = metrosCuadrados;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    @Override
    public String toString() {
        String resultado = "";
        if (isPrivado()==true){
            resultado = "Si";
        }else{
            resultado = "No";
        }
        return "Privado= " + resultado + ", Metros Cuadrados= " + metrosCuadrados;
    }
    
    
    
    public void cargarExtraHotel(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese S si tiene privado y N si no lo tiene");
        char opcionPrivado = leer.next().toUpperCase().charAt(0);
        if(opcionPrivado=='S'){
            setPrivado(true);
        }else{
            setPrivado(false);
        }
        System.out.println("Ingrese la cantidad de metros cuadrados");
        setMetrosCuadrados(leer.nextDouble());
        
    }
    
}
