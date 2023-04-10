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
public abstract class Hotel extends Alojamiento{
     protected int cantidadHabitaciones;
     protected int numeroCamas;
     protected int cantidadPisos;
     protected double precioHabitacion;

    public Hotel() {
    }

    public Hotel(int cantidadHabitaciones, int numeroCamas, int cantidadPisos, double precioHabitacion, String nombre, String direccion, String localidad, String Gerente) {
        super(nombre, direccion, localidad, Gerente);
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.numeroCamas = numeroCamas;
        this.cantidadPisos = cantidadPisos;
        this.precioHabitacion = precioHabitacion;
    }

    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(int cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public int getNumeroCamas() {
        return numeroCamas;
    }

    public void setNumeroCamas(int numeroCamas) {
        this.numeroCamas = numeroCamas;
    }

    public int getCantidadPisos() {
        return cantidadPisos;
    }

    public void setCantidadPisos(int cantidadPisos) {
        this.cantidadPisos = cantidadPisos;
    }

    public double getPrecioHabitacion() {
        return precioHabitacion;
    }

    public void setPrecioHabitacion(double precioHabitacion) {
        this.precioHabitacion = precioHabitacion;
    }
    
    public void cargarHotel(){
        Scanner leer = new Scanner (System.in);
        cargarAlojamiento();
        System.out.println("Ingrese la cantidad de Habitaciones");
        setCantidadHabitaciones(leer.nextInt());
        System.out.println("Ingrese la cantidad de Pisos");
        setCantidadPisos(leer.nextInt());
        setPrecioHabitacion(50+getNumeroCamas());
        
        
    }

}
