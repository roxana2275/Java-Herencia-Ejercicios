/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import enumeraciones.EstadoCivil;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public abstract class Persona {
    protected String nombre;
    protected String apellido;
    protected int documento;
    protected EstadoCivil estCiv;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int documento, EstadoCivil estCiv) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.estCiv = estCiv;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public EstadoCivil getEstCiv() {
        return estCiv;
    }

    public void setEstCiv(EstadoCivil estCiv) {
        this.estCiv = estCiv;
    }
    
    public void cargarPersona(){
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese el nombre");
        setNombre(leer.nextLine());
        System.out.println("Ingrese el apellido");
        setApellido(leer.nextLine());
        System.out.println("Ingrese el documento");
        setDocumento(leer.nextInt());
        System.out.println("Seleccione el estado civil");
        System.out.println(EstadoCivil.SOLTERO.getClave()+"-"+EstadoCivil.SOLTERO.getDescripcion());
        System.out.println(EstadoCivil.CASADO.getClave()+"-"+EstadoCivil.CASADO.getDescripcion());
        System.out.println(EstadoCivil.SEPARADO.getClave()+"-"+EstadoCivil.SEPARADO.getDescripcion());
        System.out.println(EstadoCivil.DIVORCIADO.getClave()+"-"+EstadoCivil.DIVORCIADO.getDescripcion());
        System.out.println(EstadoCivil.VIUDO.getClave()+"-"+EstadoCivil.VIUDO.getDescripcion());
        int opcionEstCiv = leer.nextInt();
        switch(opcionEstCiv){
            case 1:
                setEstCiv(EstadoCivil.SOLTERO);
                break;
            case 2:
                setEstCiv(EstadoCivil.CASADO);
                break;
            case 3:
                setEstCiv(EstadoCivil.SEPARADO);
                break;            
            case 4:
                setEstCiv(EstadoCivil.DIVORCIADO);
                break;
            case 5:
                setEstCiv(EstadoCivil.VIUDO);
                break;
            default:
                System.out.println("Opcion no valida");
        }
    }
}
