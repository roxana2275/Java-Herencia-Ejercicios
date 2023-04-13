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
public class HotelCuatroEstrellas extends Hotel {

    protected TipoGimnasio tipoGim;
    protected String nombreRestaurant;
    protected int capacidadRestaurant;

    public HotelCuatroEstrellas() {
    }

    public HotelCuatroEstrellas(TipoGimnasio tipoGim, String nombreRestaurant, int capacidadRestaurant, int cantidadHabitaciones, int numeroCamas, int cantidadPisos, double precioHabitacion, String nombre, String direccion, String localidad, String Gerente) {
        super(cantidadHabitaciones, numeroCamas, cantidadPisos, precioHabitacion, nombre, direccion, localidad, Gerente);
        this.tipoGim = tipoGim;
        this.nombreRestaurant = nombreRestaurant;
        this.capacidadRestaurant = capacidadRestaurant;
    }

    public TipoGimnasio getTipoGim() {
        return tipoGim;
    }

    public void setTipoGim(TipoGimnasio tipoGim) {
        this.tipoGim = tipoGim;
    }

    public String getNombreRestaurant() {
        return nombreRestaurant;
    }

    public void setNombreRestaurant(String nombreRestaurant) {
        this.nombreRestaurant = nombreRestaurant;
    }

    public int getCapacidadRestaurant() {
        return capacidadRestaurant;
    }

    public void setCapacidadRestaurant(int capacidadRestaurant) {
        this.capacidadRestaurant = capacidadRestaurant;
    }

    @Override
    public String toString() {
        return super.toString()+ ", Tipo de Gimnasio= " + tipoGim + ", Nombre de Restaurant= " + nombreRestaurant + ", Capacidad del Restaurant= " + capacidadRestaurant;
    }

    
    public void cararHotelCuatroEstrellas() {
        Scanner leer = new Scanner(System.in);
        cargarHotel();
        int opcionGimansio = 0;
        do {
            System.out.println("Ingrese el tipo de Gimnasio");
            System.out.println("1-Para Gimansio tipo A");
            System.out.println("2-Para Gimansio tipo B");
            opcionGimansio = leer.nextInt();

        } while (opcionGimansio != 1 && opcionGimansio != 2);

        if (opcionGimansio == 1) {
            setTipoGim(TipoGimnasio.A);
        } else {
            setTipoGim(TipoGimnasio.B);
        }
        System.out.println("Ingrese el nombre del Restaurant");
        setNombreRestaurant(leer.next());
        System.out.println("Ingrese la capacidad del Restaurant");
        setCapacidadRestaurant(leer.nextInt());

    }

    public void precioHabCuatroEst() {
        double precioFinal = super.precioHabitacion;
        if (getCapacidadRestaurant() < 30) {
            precioFinal = precioFinal + 10;
        } else if (getCapacidadRestaurant() > 30 || getCapacidadRestaurant() < 51) {
            precioFinal = precioFinal + 30;
        } else if (getCapacidadRestaurant() > 50) {
            precioFinal = precioFinal + 50;
        }
        
        if(getTipoGim()==TipoGimnasio.A){
            precioFinal = precioFinal+50;
        }else{
            precioFinal = precioFinal+30;
        }
        
        super.setPrecioHabitacion(precioFinal);
    }

}
