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
public final class Televisor extends Electrodomestico {

    private Double resolucion;
    private Boolean sintonizadorTDT;

    public Televisor() {
    }

    public Televisor(double resolucion, boolean sintonizadorTDT, Double precio, String color, Character consumoTipo, Double peso) {
        super(precio, color, consumoTipo, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Double getResolucion() {
        return resolucion;
    }

    public void setResolucion(Double resolucion) {
        this.resolucion = resolucion;
    }

    public Boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(Boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }


    public void crearTelevisor() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Datos para un televisor");
        super.crearElectrodomestico();
        
        System.out.println("Ingrese la resolucion en pulgadas");
        this.resolucion=leer.nextDouble();
       
        char sintonizadorTDT;
        
        do{
            System.out.println("Ingrese si tiene sintonizadorTDT: S/N");
            sintonizadorTDT = leer.next().toUpperCase().charAt(0);
        }while(sintonizadorTDT!='S'&&sintonizadorTDT!='N');
        
        char respuesta = leer.next().toUpperCase().charAt(0);
        if (sintonizadorTDT == 'S') {
            this.sintonizadorTDT = true;
        } else {
            this.sintonizadorTDT = false;
        }
    }
    public double precioFinalTelevisor(){
        double precioFinalTel = super.precioFinal();
        if(getResolucion()>40){
            precioFinalTel = precioFinalTel+(precioFinalTel*0.3);
        }
        if(isSintonizadorTDT()==true){
            precioFinalTel = precioFinalTel+500;
        }
        return precioFinalTel;
    }
    
    public void imprimitTelevisor(){
        System.out.println("color: "+super.getColor());
        System.out.println(" consumo: "+super.getConsumoTipo());
        System.out.println(" peso: "+super.getPeso());
        System.out.println("resolucion: "+this.resolucion);
        if(this.isSintonizadorTDT()==true){
            System.out.println("sintonizador tdt: si");
                    }else{
             System.out.println("sintonizador tdt: no");
        }
        System.out.println(precioFinalTelevisor());
    }
}
