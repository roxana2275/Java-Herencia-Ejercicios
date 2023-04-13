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
public final class Estudiante extends Persona{
    private String curso;
    

    public Estudiante() {
    }

    public Estudiante(String nombre, String apellido, int documento, EstadoCivil estCiv) {
        super(nombre, apellido, documento, estCiv);
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

        
    public void cargarEstudiante(){
        Scanner leer = new Scanner (System.in);
        
        cargarPersona();
        System.out.println("Ingrese el numero del curso");
        setCurso(leer.nextLine());
    }
    
}
