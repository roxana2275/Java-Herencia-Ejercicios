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
public final class EdificioOficina extends Edificio {
    public int numeroOficinas;
    public int personasPorOficina;
    public int numeroPisos;

    public EdificioOficina() {
    }

    public EdificioOficina(int numeroOficinas, int personasPorOficina, int numeroPisos, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.numeroOficinas = numeroOficinas;
        this.personasPorOficina = personasPorOficina;
        this.numeroPisos = numeroPisos;
    }

    public int getNumeroOficinas() {
        return numeroOficinas;
    }

    public void setNumeroOficinas(int numeroOficinas) {
        this.numeroOficinas = numeroOficinas;
    }

    public int getPersonasPorOficina() {
        return personasPorOficina;
    }

    public void setPersonasPorOficina(int personasPorOficina) {
        this.personasPorOficina = personasPorOficina;
    }

    public int getNumeroPisos() {
        return numeroPisos;
    }

    public void setNumeroPisos(int numeroPisos) {
        this.numeroPisos = numeroPisos;
    }
    
    public void cargarEdificioOficina(){
        System.out.println("CARGAR DATOS DE EDIFICIO DE OFICINAS");
        System.out.println("");
        Scanner leer = new Scanner (System.in);
        cargarEdificio();
        System.out.println("Ingrese el numero de oficinas");
        this.numeroOficinas = leer.nextInt();
        System.out.println("Ingrese el numero de pisos");
        this.numeroPisos = leer.nextInt();
        System.out.println("Ingrese el numero de personas por oficina");
        this.personasPorOficina = leer.nextInt();
    }
    /*
    De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el 
usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso 
(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre 
cuantas personas entrarían en un piso y cuantas en todo el edificio
    */
    public void cantPersonas(){
        int cantidadPersonas = this.numeroOficinas*this.numeroPisos*this.personasPorOficina;
        System.out.println("La capacidad total de empleados es "+cantidadPersonas);
        
    }
    

    @Override
    public void calcularSuperficie(double ancho, double largo) {
        double superficie = ancho*largo*this.numeroPisos;
        System.out.println("La superfcicie total es "+superficie);
    }

    @Override
    public void calcularVoluman(double ancho, double largo, double alto) {
        double volumen = ancho*largo*alto*this.numeroPisos;
        System.out.println("El volumen total es "+volumen);
    }
    
}
