/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioadicional.pkg2;

import entidades.Edificio;
import entidades.EdificioOficina;
import entidades.Polideportivo;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class EjercicioAdicional2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Edificio> edificios = new ArrayList<>();
        
        for (int i = 0; i < 2; i++) {
            Polideportivo polideportivo = new Polideportivo();
            polideportivo.cargarPolideportivo();
            edificios.add(polideportivo);
            
        }
        for (int i = 0; i < 2; i++) {
            EdificioOficina edificioOficina = new EdificioOficina();
            edificioOficina.cargarEdificioOficina();
            edificios.add(edificioOficina);
            
        }  
        for (Edificio edificio : edificios) {
            if(edificio instanceof Polideportivo){
                edificio.calcularSuperficie(edificio.getAncho(), edificio.getLargo());
                edificio.calcularVoluman(edificio.getAncho(),edificio.getLargo(),edificio.getAlto());
                if (((Polideportivo) edificio).isTechado()==true){
                    System.out.println("El Polideportivo "+((Polideportivo) edificio).getNombre()+" es techado");
                }else{
                    System.out.println("El Polideportivo "+((Polideportivo) edificio).getNombre()+" no es techado");
                }
                
            }else if(edificio instanceof EdificioOficina){
                edificio.calcularSuperficie(edificio.getAncho(), edificio.getLargo());
                edificio.calcularVoluman(edificio.getAncho(),edificio.getLargo(),edificio.getAlto());
                ((EdificioOficina) edificio).cantPersonas();
            }
            
            
        }
        }

    
}
