/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import entidades.Hotel;
import java.util.Comparator;

/**
 *
 * @author Usuario
 */
public class Comparadores {
    public static Comparator<Hotel> ordenarPorPrecio = new Comparator<Hotel>(){
        @Override
        public int compare(Hotel t1, Hotel t2) {
            return (int)(t1.getPrecioHabitacion()-t1.getPrecioHabitacion());
        }
    };
    }
