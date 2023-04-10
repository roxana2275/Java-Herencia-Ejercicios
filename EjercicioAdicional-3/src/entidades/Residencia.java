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
public final class Residencia extends ExtraHotel{
    private int cantidadHabitaciones;
    private boolean descuentoGremio;
    private boolean campoDeportes;

    public Residencia() {
    }

    public Residencia(int cantidadHabitaciones, boolean descuentoGremio, boolean campoDeportes, boolean privado, double metrosCuadrados, String nombre, String direccion, String localidad, String Gerente) {
        super(privado, metrosCuadrados, nombre, direccion, localidad, Gerente);
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.descuentoGremio = descuentoGremio;
        this.campoDeportes = campoDeportes;
    }

    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(int cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public boolean isDescuentoGremio() {
        return descuentoGremio;
    }

    public void setDescuentoGremio(boolean descuentoGremio) {
        this.descuentoGremio = descuentoGremio;
    }

    public boolean isCampoDeportes() {
        return campoDeportes;
    }

    public void setCampoDeportes(boolean campoDeportes) {
        this.campoDeportes = campoDeportes;
    }
    
    public void cargarResidencia(){
        Scanner leer = new Scanner (System.in);
        cargarExtraHotel();
        
        System.out.println("Ingrese la cantidad de Habitaciones");
        setCantidadHabitaciones(leer.nextInt());
        System.out.println("Ingrese S si tiene descuento a gremio y N si no lo tiene");
        char opcionGremio = leer.next().toUpperCase().charAt(0);
        if(opcionGremio=='S'){
            setDescuentoGremio(true);
        }else{
            setDescuentoGremio(false);
        }
        
    }
}
