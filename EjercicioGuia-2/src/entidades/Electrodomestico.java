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

//NO LA PUEDO HACER ABSTRACTA PORQUE SINO NO PUEDO HACER EL METODO PRECIO FINAL
public abstract class Electrodomestico {

    protected Double precio;
    protected String color;
    protected Character consumoTipo;
    protected Double peso;
    private final String[] coloresDisponibles = {"blanco", "negro", "rojo", "azul", "gris"};


    public Electrodomestico() {
        this.precio = 1000d;
        this.color = "blanco";
        this.consumoTipo = 'F';
        this.peso = 1d;
    }

    public Electrodomestico(Double precio, String color, Character consumoTipo, Double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoTipo = consumoTipo;
        this.peso = peso;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Character getConsumoTipo() {
        return consumoTipo;
    }

    public void setConsumoTipo(Character consumoTipo) {
        this.consumoTipo = consumoTipo;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }


    /*
    Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta, 
sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el 
objeto y no será visible
     */
    public Character controlarEnergia(Character letra) {
        if (letra >= 'A' && letra <= 'F') {
            return letra;
        } else {
            return 'F';
        }
    }

    /*
    Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es, 
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son 
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en 
minúsculas. Este método se invocará al crear el objeto y no será visible
     */
    public String controlarColor(String color) {
        
        for (String col : coloresDisponibles) {
            if (col.equalsIgnoreCase(color)) {
                return col;
            } else {
                this.color = "blanco";
            }
        }
        return "blanco";
    }

    /*
    Metodo crearElectrodomestico(): le pide la información al usuario y llena el 
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al 
precio se le da un valor base de $1000
     */

    public void crearElectrodomestico() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el precio del electrodomestico");
        setPrecio(leer.nextDouble());
        System.out.println("Ingrese el color");

        setColor(controlarColor(leer.next()));
        System.out.println("Ingrese el tipo de consumo A,B,C,D,E o F");
        setConsumoTipo(controlarEnergia(leer.next().charAt(0)));
        System.out.println("Ingrese el peso");
        setPeso(leer.nextDouble());

    }

    /*
    Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del 
precio. Esta es la lista de precios:LETRA PRECIO A $1000, B $800, C $600, D $500, E $300, F $100
    PESO PRECIO Entre 1 y 19 kg $100, Entre 20 y 49 kg $500, Entre 50 y 79 kg $800, Mayor que 80 kg $1000
     */
    public Double precioFinal() {
        double precioFinal = getPrecio();
        
        switch (getConsumoTipo()) {
            case 'A': case 'a':
                precioFinal=precioFinal+1000;
                break;
            case 'B':case 'b':
                precioFinal=precioFinal+800;
                break;
            case 'C':case 'c':
                precioFinal=precioFinal+600;
                break;
            case 'D':case 'd':
                precioFinal=precioFinal+500;
                break;
            case 'E':case 'e':
                precioFinal=precioFinal+300;
                break;
            case 'F':case 'f':
                precioFinal=precioFinal+100;
                break;
        }
        
        if(getPeso()>0&&getPeso()<20){
            precioFinal=precioFinal+100;
        }else if(getPeso()>=20&&getPeso()<50){
            precioFinal=precioFinal+500;
        }else if(getPeso()>=50&&getPeso()<80){
            precioFinal=precioFinal+800;
        }else if(getPeso()>=80){
            precioFinal=precioFinal+1000;
        }
        return precioFinal;
    }

}
