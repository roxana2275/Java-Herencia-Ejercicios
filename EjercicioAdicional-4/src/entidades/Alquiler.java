/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import static java.util.concurrent.TimeUnit.DAYS;

/**
 *
 * @author Usuario
 */
public final class Alquiler {
    private Cliente cliente;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private String posicionAmarre;
    private Barco barco;

    public Alquiler() {
    }

    public Alquiler(Cliente cliente, LocalDate fechaInicio, LocalDate fechaFin, String posicionAmarre, Barco barco) {
        this.cliente = cliente;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }

   

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(String posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }
    
    public void cargarAlguiler(){
        Scanner leer = new Scanner (System.in);
        
        Cliente clienteAlquiler = new Cliente();
        clienteAlquiler.cargarCliente();
        setCliente(clienteAlquiler);
        
        System.out.println("Ingrese si el dia de alquiler comienza hoy S/N");
        char opcion = leer.next().toUpperCase().charAt(0);
        LocalDate inicio = LocalDate.now();
        if(opcion =='S'){
            setFechaInicio(inicio);
        }else{
            System.out.println("Ingrese el dia de inicio de contrato");
            int dia = leer.nextInt();
            System.out.println("Ingrese el mes de inicio de contrato");
            int mes = leer.nextInt();
            System.out.println("Ingrese el año de inicio de contrato");
            int anio =leer.nextInt();
            inicio = LocalDate.of(anio, mes, dia);
            setFechaInicio(inicio);   
        }
        /*
        System.out.println("Ingrese la cantidad de días de alquiler");
        int cantidadDias=leer.nextInt();
        setFechaFin(inicio.plusDays(cantidadDias));*/
        
        System.out.println("Ingrese el dia de devolucion");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes de devolucion");
        int mes = leer.nextInt();
        System.out.println("Ingrese el año de devolucion");
        int anio =leer.nextInt();
        LocalDate fin = LocalDate.of(anio, mes, dia);
        setFechaFin(fin);   
        System.out.println("Ingrese la posicion de amarre");
        setPosicionAmarre(leer.next());
        
        int eleccion=0;
        do{
        System.out.println("Ingrese el tipo de barco a alquilar");
        System.out.println("1-Barco a Vela");
        System.out.println("2-Barco a motor");
        System.out.println("3-Barco de Lujo");
        eleccion=leer.nextInt();
            
        }while(eleccion!=1&&eleccion!=2&&eleccion!=3);
        //System.out.println(eleccion);
        long dias = ChronoUnit.DAYS.between(getFechaInicio(),getFechaFin());
        //System.out.println(dias);
        double precioFinal = 0;

        switch(eleccion){
            case 1:
                BarcoVela bv = new BarcoVela();
                bv.cargarBarcoVela();
                setBarco(bv);
                precioFinal =precioFinal +(bv.getEslora()*10+bv.getNumeroVelas())*dias;
                break;
            case 2:
                BarcoMotor bm = new BarcoMotor();
                bm.cargarBarcoMotor();
                setBarco(bm);
                precioFinal =precioFinal +(bm.getEslora()*10+bm.getPotenciaCV())*dias;
                break;
            case 3:
                BarcoLujo bl = new BarcoLujo();
                bl.cargarBarcoLujo();
                setBarco(bl);
                precioFinal = precioFinal +(bl.getEslora()*10+bl.getPotenciaCV()+bl.getNumeroCamarotes())*dias;
                break;
        }
        
        
        
        
        System.out.println("El alquiler es "+precioFinal);
        
    }
}
