/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import enumeraciones.EstadoCivil;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public abstract class Empleado extends Persona {

    protected LocalDate fechaIngreso;
    protected int numeroDespacho;

    public Empleado() {
    }

    public Empleado(LocalDate fechaIngreso, int numeroDespacho, String nombre, String apellido, int documento, EstadoCivil estCiv) {
        super(nombre, apellido, documento, estCiv);
        this.fechaIngreso = fechaIngreso;
        this.numeroDespacho = numeroDespacho;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public int getNumeroDespacho() {
        return numeroDespacho;
    }

    public void setNumeroDespacho(int numeroDespacho) {
        this.numeroDespacho = numeroDespacho;
    }

    public void cargarEmpleado() {
        Scanner leer = new Scanner(System.in);

        cargarPersona();
        int anio = 0, mes = 0, dia = 0;
        do {
            System.out.println("Ingrese el año de ingreso");
            anio = leer.nextInt();
        } while (anio < 1900 || anio > 2050);
        do {
            System.out.println("Ingrese el mes de ingreso");
            mes = leer.nextInt();
        } while (mes < 1 || mes > 12);
        if (mes == 2) {
            do {
                System.out.println("Ingrese el día de ingreso");
                dia = leer.nextInt();
            } while (dia < 0 || dia > 29);
        } else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            do {
                System.out.println("Ingrese el día de ingreso");
                dia = leer.nextInt();

            } while (dia < 0 && dia > 31);
        } else {
            do {
                System.out.println("Ingrese el día de ingreso");
                dia = leer.nextInt();

            } while (dia < 0 && dia > 30);
        }
        LocalDate fecha = LocalDate.of(anio, Month.MARCH, dia);
        setFechaIngreso(fecha);
        int despacho = 0;
        do {
            System.out.println("Ingrese el número de despacho");
            despacho = leer.nextInt();
        } while (despacho < 0);
        setNumeroDespacho(despacho);
    }

}
