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
public final class Camping extends ExtraHotel{
    private int cantidadMaximaCarpas;
    private int cantidadBanios;
    private boolean restaurant;

    public Camping() {
    }

    public Camping(int cantidadMaximaCarpas, int cantidadBanios, boolean restaurant, boolean privado, double metrosCuadrados, String nombre, String direccion, String localidad, String Gerente) {
        super(privado, metrosCuadrados, nombre, direccion, localidad, Gerente);
        this.cantidadMaximaCarpas = cantidadMaximaCarpas;
        this.cantidadBanios = cantidadBanios;
        this.restaurant = restaurant;
    }

    public int getCantidadMaximaCarpas() {
        return cantidadMaximaCarpas;
    }

    public void setCantidadMaximaCarpas(int cantidadMaximaCarpas) {
        this.cantidadMaximaCarpas = cantidadMaximaCarpas;
    }

    public int getCantidadBanios() {
        return cantidadBanios;
    }

    public void setCantidadBanios(int cantidadBanios) {
        this.cantidadBanios = cantidadBanios;
    }

    public boolean isRestaurant() {
        return restaurant;
    }

    public void setRestaurant(boolean restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public String toString() {
        String resultado = "";
        if (isRestaurant()==true){
            resultado = "Si";
        }else{
            resultado = "No";
        }
        return super.toString()+", Cantidad Maxima de Carpas= " + cantidadMaximaCarpas + ", Cantidad de Baños= " + cantidadBanios + ", Restaurant= " + resultado;
    }
    
    
    
    public void cargarCamping(){
        Scanner leer = new Scanner (System.in);
        cargarExtraHotel();
        System.out.println("Ingrese la cantidad maxima de carpas");
        setCantidadMaximaCarpas(leer.nextInt());
        System.out.println("Ingrese la cantidad de baños");
        setCantidadBanios(leer.nextInt());
        System.out.println("Ingrese S si tiene restaurant y N si no tiene ");
        char opcionRestaurant = leer.next().toUpperCase().charAt(0);
        if(opcionRestaurant == 'S'){
            setRestaurant(true);
        }else{
            setRestaurant(false);
        }
    }

}
