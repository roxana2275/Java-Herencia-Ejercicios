/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioguia.pkg4;

import entidades.Circulo;
import entidades.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjercicioGuia4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int eleccion = 0;
        do {
            System.out.println("Elija una de las siguientes opciones");
            System.out.println("1-calcular el area de un circulo");
            System.out.println("2-calcular el perimetro de un circulo");
            System.out.println("3-clacular el area de un rectangulo");
            System.out.println("4-calcular el perimetro de un rectangulo");
            System.out.println("5-Salir");
            eleccion = leer.nextInt();
            Circulo circulo = new Circulo();
            Rectangulo rectangulo = new Rectangulo();
            switch (eleccion) {
                case 1:
                    circulo.cargarCirculo();
                    circulo.areaFigura();
                    break;
                case 2:
                    circulo.cargarCirculo();
                    circulo.areaFigura();
                    break;
                case 3:
                    rectangulo.cargarRectangulo();
                    rectangulo.areaFigura();
                    break;
                case 4:
                    rectangulo.cargarRectangulo();
                    rectangulo.perimetroFigura();
                    break;
                case 5:
                    System.out.println("Hasta pronto");
                    break;

            }

        } while (eleccion != 5);
    }

}
