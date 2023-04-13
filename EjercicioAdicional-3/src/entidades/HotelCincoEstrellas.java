/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import enumeraciones.TipoGimnasio;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public final class HotelCincoEstrellas extends HotelCuatroEstrellas {
    private boolean salonConferencia;
    private int cantidadSwits;
    private int cantidadLimusinas;

    public HotelCincoEstrellas() {
    }

    public HotelCincoEstrellas(boolean salonConferencia, int cantidadSwits, int cantidadLimusinas, TipoGimnasio tipoGim, String nombreRestaurant, int capacidadRestaurant, int cantidadHabitaciones, int numeroCamas, int cantidadPisos, double precioHabitacion, String nombre, String direccion, String localidad, String Gerente) {
        super(tipoGim, nombreRestaurant, capacidadRestaurant, cantidadHabitaciones, numeroCamas, cantidadPisos, precioHabitacion, nombre, direccion, localidad, Gerente);
        this.salonConferencia = salonConferencia;
        this.cantidadSwits = cantidadSwits;
        this.cantidadLimusinas = cantidadLimusinas;
    }

    public boolean isSalonConferencia() {
        return salonConferencia;
    }

    public void setSalonConferencia(boolean salonConferencia) {
        this.salonConferencia = salonConferencia;
    }

    public int getCantidadSwits() {
        return cantidadSwits;
    }

    public void setCantidadSwits(int cantidadSwits) {
        this.cantidadSwits = cantidadSwits;
    }

    public int getCantidadLimusinas() {
        return cantidadLimusinas;
    }

    public void setCantidadLimusinas(int cantidadLimusinas) {
        this.cantidadLimusinas = cantidadLimusinas;
    }

    @Override
    public String toString() {
        String resultado = "";
        if(isSalonConferencia()==true){
            resultado = "Si";
        }else{
            resultado = "No";
        }
        return super.toString()+", salonConferencia=" + resultado + ", Cantidad de Swits= " + cantidadSwits + ", Cantidad de Limusinas=" + cantidadLimusinas;
    }
    
    
    
    public void cargarHotelCincoEstrellas(){
        Scanner leer = new Scanner (System.in);
        cararHotelCuatroEstrellas();
        System.out.println("Ingrese S si tiene salón de conferencia o N si no lo tiene");
        char opcionSalon = leer.next().toUpperCase().charAt(0);
        if(opcionSalon=='S'){
            setSalonConferencia(true);
        }else{
            setSalonConferencia(false);
        }
        System.out.println("Ingrese la cantidad de limusinas");
        setCantidadLimusinas(leer.nextInt());
        System.out.println("Ingrese la cantidad de Swits");
        setCantidadSwits(leer.nextInt());
    }
    public void precioHabCuatroEst() {
        super.precioHabCuatroEst();
        double precioFinal = super.getPrecioHabitacion();
        precioFinal = precioFinal+getCantidadLimusinas()*15;
        super.setPrecioHabitacion(precioFinal);
    }
}
