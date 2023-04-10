/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioguia.pkg2;

import entidades.Electrodomestico;
import entidades.Lavadora;
import entidades.Televisor;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjercicioGuia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<Electrodomestico> electro = new ArrayList<>();

        char eleccion = 0;
        do {
            System.out.println("Ingrese una de las siguientes opciones");
            System.out.println("A-Ingresar una lavadora");
            System.out.println("B-Ingresar un televisor");
            System.out.println("C-Salir");
            eleccion = leer.next().toUpperCase().charAt(0);
            switch (eleccion) {
                case 'A':
                    Lavadora lavadora = new Lavadora();
                    lavadora.crearLavadora();
                    electro.add(lavadora);
                    break;
                case 'B':
                    Televisor televisor = new Televisor();
                    televisor.crearTelevisor();
                    electro.add(televisor);

                    break;
                case 'C':
                    double precioFinalLav=0,
                     precioFinalTel=0,
                     precioFinal=0;
                    for (Electrodomestico electrodomestico : electro) {
                        if (electrodomestico instanceof Lavadora) {
                            precioFinalLav =precioFinalLav + ((Lavadora) electrodomestico).precioFinalLavadora();
                            precioFinal =precioFinal + ((Lavadora) electrodomestico).precioFinalLavadora();
                        }else if(electrodomestico instanceof Televisor){
                            precioFinalTel =precioFinalTel + ((Televisor) electrodomestico).precioFinalTelevisor();
                            precioFinal =precioFinal+((Televisor) electrodomestico).precioFinalTelevisor();
                        }
                    }
                    System.out.println("El precio Final de todas las lavadoras es "+ precioFinalLav);
                    System.out.println("El precio Final de todos los televisores es "+precioFinalTel);
                    System.out.println("El precio Final de todos los electrodomesticos es "+ precioFinal);
                    break;
            }

            System.out.println("");

        } while (eleccion != 'C');

    }

}
