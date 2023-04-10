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
public final class Lavadora extends Electrodomestico{
    private Character carga;

    public Lavadora() {
    }

    public Lavadora(Double precio, String color, Character consumoTipo, Double peso) {
        super(precio, color, consumoTipo, peso);
        this.carga = carga;
    }

    public Character getCarga() {
        return carga;
    }

    public void setCarga(Character carga) {
        this.carga = carga;
    }

    /*
    Método crearLavadora (): este método llama a crearElectrodomestico() de la clase 
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos 
el atributo propio de la lavadora.
    */
    public void crearLavadora(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Datos para una Lavadora");
        super.crearElectrodomestico();
        char cargaLav;
        do{
            System.out.println("Ingrese el tipo de carga: F para frontal y S para Superior");
            cargaLav=leer.next().toUpperCase().charAt(0);
        }while(cargaLav!='F'&&cargaLav!='S');
        
        this.carga = cargaLav;
        
    }
    /*
    Método precioFinal(): este método será heredado y se le sumará la siguiente 
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la 
carga es menor o igual, no se incrementará el precio. Este método debe llamar al 
método padre y añadir el código necesario. Recuerda que las condiciones que hemos 
visto en la clase Electrodoméstico también deben afectar al precio
    */
    public double precioFinalLavadora(){
        double precioFinalLav = super.precioFinal();
        if(carga>30){
            precioFinalLav = precioFinalLav+500;
        }
        return precioFinalLav;
    }
    public void imprimitLavadora(){
        System.out.println("color: "+super.getColor());
        System.out.println(" consumo: "+super.getConsumoTipo());
        System.out.println(" peso: "+super.getPeso());
        if(this.getCarga()=='F'){
            System.out.println("carga: frontal");
                    }else{
            System.out.println("carga: superior");
        }
        System.out.println(precioFinalLavadora());
    }
}
