/*
 Realizar un sistema de consulta que le permite al usuario consultar por diferentes criterios: 
• todos los alojamientos.
• todos los hoteles de más caro a más barato.
• todos los campings con restaurante
• todos las residencias que tienen descuento. 
 */
package servicios;

import entidades.Alojamiento;
import entidades.Camping;
import entidades.Hotel;
import entidades.HotelCincoEstrellas;
import entidades.HotelCuatroEstrellas;
import entidades.Residencia;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import utilidades.Comparadores;

/**
 *
 * @author Usuario
 */
public class AlojamientoServicios {

    private ArrayList<Alojamiento> alojamientos = new ArrayList<>();

    public AlojamientoServicios() {
        this.alojamientos = alojamientos;
    }

    public void menuPrincipal() {
        Scanner leer = new Scanner(System.in);

        int opcionMenuPrincipal = 0;
        do {
            System.out.println("Menu Principal");
            System.out.println("1-Cargar Alojamiento");
            System.out.println("2-Consultar todos los alojamientos");
            System.out.println("3-Consultar Hoteles de Mayora Menor Valor por Habitación");
            System.out.println("4-Consultar Campings con Restaurant");
            System.out.println("5-Consultar Residencias con Descuento");
            System.out.println("9-Salir");
            opcionMenuPrincipal = leer.nextInt();
            switch (opcionMenuPrincipal) {
                case 1:
                    menuCarga();
                    break;
                case 2:
                    mostrarAlojamiento();
                    break;
                case 3:
                    ordenarHoteles();
                    break;
                case 4:
                    campingConRestaurant();
                    break;
                case 5:
                    residenciaConDescuento();
                    break;
                case 9:
                    System.out.println("Muchas gracias");
                    break;
                default:
                    System.out.println("Opción no valida");
                    break;
            }
        } while (opcionMenuPrincipal != 9);

    }

    public void menuCarga() {
        Scanner leer = new Scanner(System.in);
        int opcionMenuCarga = 0;
        do {
            System.out.println("Menu Carga Alojamiento");
            System.out.println("1-Camping");
            System.out.println("2-Cargar Residencia");
            System.out.println("3-Cargar Hotel 4 estrellas");
            System.out.println("4-Cargar Hotel 5 estrellas");
            System.out.println("9-Salir");
            opcionMenuCarga = leer.nextInt();
            switch (opcionMenuCarga) {
                case 1:
                    Camping camping = new Camping();
                    camping.cargarCamping();
                    alojamientos.add(camping);
                    break;
                case 2:
                    Residencia residencia = new Residencia();
                    residencia.cargarResidencia();
                    alojamientos.add(residencia);
                    break;
                case 3:
                    HotelCuatroEstrellas hotelCuatroEstrellas = new HotelCuatroEstrellas();
                    hotelCuatroEstrellas.cararHotelCuatroEstrellas();
                    alojamientos.add(hotelCuatroEstrellas);
                    break;
                case 4:
                    HotelCincoEstrellas hotelCincoEstrellas = new HotelCincoEstrellas();
                    hotelCincoEstrellas.cargarHotelCincoEstrellas();
                    alojamientos.add(hotelCincoEstrellas);
                    break;
                case 9:
                    break;
                default:
                    System.out.println("Opción no valida");
                    break;
            }

        } while (opcionMenuCarga != 9);

    }

    public void mostrarAlojamiento() {
        for (Alojamiento alojamiento : alojamientos) {
            if (alojamiento instanceof Camping) {
                System.out.println(alojamiento.toString());
            } else if (alojamiento instanceof Residencia) {
                System.out.println(alojamiento.toString());
            } else if (alojamiento instanceof HotelCincoEstrellas) {
                System.out.println(alojamiento.toString());
            } else if (alojamiento instanceof HotelCuatroEstrellas) {
                System.out.println(alojamiento.toString());
            }
        }
    }

    public void ordenarHoteles() {
        ArrayList<Hotel> hoteles = new ArrayList<>();
        for (Alojamiento alojamiento : alojamientos) {
            if (alojamiento instanceof Hotel) {
                hoteles.add((Hotel) alojamiento);
                Collections.sort(hoteles, Comparadores.ordenarPorPrecio);
            }
        }
        for (Hotel hotele : hoteles) {
            System.out.print(hoteles.toString());
            System.out.println(hotele.getPrecioHabitacion());
        }
    }

    public void campingConRestaurant() {
        int contador = 0;
        for (Alojamiento alojamiento : alojamientos) {
            if (alojamiento instanceof Camping) {
                if (((Camping) alojamiento).isRestaurant() == true) {
                    contador = contador+1;
                    System.out.println(alojamiento.toString());
                } else {
                    if(contador==0){
                        System.out.println("No hay Camping con Restaurant");

                    }
                }
            }
        }
    }

    public void residenciaConDescuento() {
        int contador = 0;
        for (Alojamiento alojamiento : alojamientos) {
            if (alojamiento instanceof Residencia) {
                if (((Residencia) alojamiento).isDescuentoGremio() == true) {
                    contador = contador+1;
                    System.out.println(alojamiento.toString());
                } else {
                    if(contador ==0){
                        System.out.println("No hay Residencias con descuento");
                    }
                }
            }
        }
    }

}
