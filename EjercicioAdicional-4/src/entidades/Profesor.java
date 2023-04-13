/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import enumeraciones.EstadoCivil;
import java.time.LocalDate;
import java.util.Scanner;


/**
 *
 * @author Usuario
 */
public final class Profesor extends Empleado{
    private String departamento;
    private String[] cursos = {"Lengua","Matematica","Historia", "Biología","Quimica","Fisica"};

    public Profesor() {
    }

    public Profesor(String departamento, LocalDate fechaIngreso, int numeroDespacho, String nombre, String apellido, int documento, EstadoCivil estCiv) {
        super(fechaIngreso, numeroDespacho, nombre, apellido, documento, estCiv);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String[] getCursos() {
        return cursos;
    }

    public void setCursos(String[] cursos) {
        this.cursos = cursos;
    }

    

   public void cargarProfesor(){
       Scanner leer = new Scanner (System.in);
       
       cargarEmpleado();
       System.out.println("Ingrese el departamento");
       for (int i = 0; i < getCursos().length; i++) {
           System.out.println((i+1)+"-"+getCursos()[i]);
       }
       int auxCurso = leer.nextInt();
       setDepartamento(getCursos()[auxCurso-1]);
   }
    
    
}
