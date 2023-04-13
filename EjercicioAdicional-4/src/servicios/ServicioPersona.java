/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Empleado;
import entidades.Estudiante;
import entidades.Persona;
import entidades.PersonalServicio;
import entidades.Profesor;
import enumeraciones.EstadoCivil;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ServicioPersona {

    private ArrayList<Persona> personas = new ArrayList<>();

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }

    public void menuPrincipal() {
        Scanner leer = new Scanner(System.in);
        int eleccion = 0;
        do {
            System.out.println("Ingrese una de las siguientes opciones");
            System.out.println("1-Ingresar empleado o estudiante");
            System.out.println("2-Cambiar estado civil de una persona");
            System.out.println("3-Reasignación de despacho a un empleado.");
            System.out.println("4-Matriculación de un estudiante en un nuevo curso.");
            System.out.println("5-Cambio de departamento de un profesor");
            System.out.println("6-Traslado de sección de un empleado del personal de servicio");
            System.out.println("7-Mostrar datos de las Personas");
            System.out.println("9-Salir");
            eleccion = leer.nextInt();

            switch (eleccion) {
                case 1:
                    menuCargarPersona();
                    break;
                case 2:
                    menuEstadoCivil();
                    break;
                case 3:
                    menuCambiarDespacho();
                    break;
                case 4:
                    menuMatricularEstudiante();
                    break;
                case 5:
                    menuCambirarDepartamento();
                    break;
                case 6:
                    menuTrasladoSeccion();
                    break;
                case 7:
                    menuImprimir();
                    break;
                case 9:
                    break;
                default:
                    System.out.println("Opción no valida");
                    break;
            }
        } while (eleccion != 9);

    }

    public void menuCargarPersona() {
        Scanner leer = new Scanner(System.in);
        int auxMenuPersona = 0;
        do {
            System.out.println("Seleccione una de las siguientes opciones");
            System.out.println("1-Cargar Estudiante");
            System.out.println("2-Cargar Profesor");
            System.out.println("3-Cargar Personal de Servicio");
            System.out.println("9-Salir");
            auxMenuPersona = leer.nextInt();

            switch (auxMenuPersona) {
                case 1:
                    Estudiante estudiante = new Estudiante();
                    estudiante.cargarEstudiante();
                    personas.add(estudiante);
                    break;
                case 2:
                    Profesor profesor = new Profesor();
                    profesor.cargarProfesor();
                    personas.add(profesor);
                    break;
                case 3:
                    PersonalServicio personalServicio = new PersonalServicio();
                    personalServicio.cargarPersonalServicio();
                    personas.add(personalServicio);
                    break;
                case 9:
                    break;
                default:
                    System.out.println("Opción no valida");
                    break;
            }
        } while (auxMenuPersona != 9);

    }

    public void menuEstadoCivil() {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el dni de la persona a modificar");
        int auxDni = leer.nextInt();
        int cantidad = 0;
        for (Persona persona : personas) {
            if (persona.getDocumento() == auxDni) {
                cantidad = cantidad + 1;
                System.out.println("Seleccione el estado civil");
                System.out.println(EstadoCivil.SOLTERO.getClave() + "-" + EstadoCivil.SOLTERO.getDescripcion());
                System.out.println(EstadoCivil.CASADO.getClave() + "-" + EstadoCivil.CASADO.getDescripcion());
                System.out.println(EstadoCivil.SEPARADO.getClave() + "-" + EstadoCivil.SEPARADO.getDescripcion());
                System.out.println(EstadoCivil.DIVORCIADO.getClave() + "-" + EstadoCivil.DIVORCIADO.getDescripcion());
                System.out.println(EstadoCivil.VIUDO.getClave() + "-" + EstadoCivil.VIUDO.getDescripcion());
                int opcionEstCiv = leer.nextInt();
                switch (opcionEstCiv) {
                    case 1:
                        persona.setEstCiv(EstadoCivil.SOLTERO);
                        break;
                    case 2:
                        persona.setEstCiv(EstadoCivil.CASADO);
                        break;
                    case 3:
                        persona.setEstCiv(EstadoCivil.SEPARADO);
                        break;
                    case 4:
                        persona.setEstCiv(EstadoCivil.DIVORCIADO);
                        break;
                    case 5:
                        persona.setEstCiv(EstadoCivil.VIUDO);
                        break;
                    default:
                        System.out.println("Opcion no valida");
                }
            }
        }
        if (cantidad == 0) {
                System.out.println("No hay ninguna persona con ese Documento");
            }
    }

    public void menuCambiarDespacho() {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el dni de la persona");
        int auxDni = leer.nextInt();
        int cantidad = 0;
        for (Persona persona : personas) {
            if (persona instanceof Empleado) {
                if (persona.getDocumento() == auxDni) {
                    cantidad = cantidad + 1;
                    int despacho = 0;
                    do {
                        System.out.println("Ingrese el número de despacho");
                        despacho = leer.nextInt();
                    } while (despacho < 0);
                    ((Empleado) persona).setNumeroDespacho(despacho);

                }
            }
        }
        if (cantidad == 0) {
            System.out.println("No existe un empleado con ese Documento");
        }
    }

    public void menuMatricularEstudiante() {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el dni del estudiante");
        int auxDani = leer.nextInt();
        int cantidad = 0;
        for (Persona persona : personas) {
            cantidad = cantidad + 1;
            if (persona instanceof Estudiante) {
                System.out.println("Ingrese el numero del curso");
                ((Estudiante) persona).setCurso(leer.nextLine());
            }

        }
        if (cantidad == 0) {
                System.out.println("No existe un estudiante con ese Documento");
            }

    }

    public void menuCambirarDepartamento() {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el dni del Profesor");
        int auxDni = leer.nextInt();
        int cantidad = 0;
        for (Persona persona : personas) {
            if (persona instanceof Profesor) {
                if (persona.getDocumento() == auxDni) {
                    cantidad = cantidad+1;
                    System.out.println("Seleccione el departamento");
                    for (int i = 0; i < ((Profesor) persona).getCursos().length; i++) {
                        System.out.println((i + 1) + "-" + ((Profesor) persona).getCursos()[i]);
                    }
                    int auxCurso = leer.nextInt();
                    ((Profesor) persona).setDepartamento(((Profesor) persona).getCursos()[auxCurso - 1]);
                }

            } 
        }
        if(cantidad==0) {
                System.out.println("No existe un Profesor con ese Documento");
            }

    }

    public void menuTrasladoSeccion() {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el Documento del Personal de Servicio");
        int auxDni = leer.nextInt();
        int cantidad =0;
        for (Persona persona : personas) {
            if (persona instanceof PersonalServicio) {
                if (persona.getDocumento() == auxDni) {
                    cantidad ++;
                    System.out.println("Ingrese una de las siguientes opciones");
                    for (int i = 0; i < ((PersonalServicio) persona).getSeccion().length(); i++) {
                        System.out.println((i + 1) + "-" + ((PersonalServicio) persona).getSecciones()[i]);
                    }
                    int auxSecciones = leer.nextInt();
                    ((PersonalServicio) persona).setSeccion(((PersonalServicio) persona).getSecciones()[auxSecciones - 1]);
                }
            } 
        }
        if(cantidad ==0) {
                System.out.println("No hay Personal de Servicio con ese Documento");
            }
    }

    public void menuImprimir() {
        Scanner leer = new Scanner(System.in);
        int auxPersonal = 0;
        System.out.println("Ingrese el listado a imprimir");
        System.out.println("1-Estudiante");
        System.out.println("2-Profesor");
        System.out.println("3-Personal de Servicio");
        auxPersonal = leer.nextInt();
        switch (auxPersonal) {
            case 1:
                for (Persona persona : personas) {

                    if (persona instanceof Estudiante) {
                        System.out.println("==========LISTADO ESTUDIANTE==========");
                        System.out.println("--------------------------------------");
                        imprimirPersona(persona);
                        System.out.println("Curso: " + ((Estudiante) persona).getCurso());
                        System.out.println("--------------------------------------");
                    }

                }
                break;
            case 2:
                for (Persona persona : personas) {
                    if (persona instanceof Profesor) {
                        System.out.println("===========LISTADO PROFESOR===========");
                        System.out.println("--------------------------------------");
                        imprimirPersona(persona);
                        System.out.println("Fecha Ingreso: " + ((Profesor) persona).getFechaIngreso());
                        System.out.println("Despacho: " + ((Profesor) persona).getNumeroDespacho());
                        System.out.println("Departamento: " + ((Profesor) persona).getDepartamento());
                        System.out.println("--------------------------------------");
                    }

                }
                break;
            case 3:
                for (Persona persona : personas) {
                    if (persona instanceof PersonalServicio) {
                        System.out.println("=======LISTADO PERSONAL SERBICIO=======");
                        System.out.println("--------------------------------------");
                        imprimirPersona(persona);
                        System.out.println("Fecha Ingreso: " + ((PersonalServicio) persona).getFechaIngreso());
                        System.out.println("Despacho: " + ((PersonalServicio) persona).getNumeroDespacho());
                        System.out.println("Sección: " + ((PersonalServicio) persona).getSeccion());
                        System.out.println("--------------------------------------");
                    }

                }
                break;
        }

    }

    public void imprimirPersona(Persona persona) {
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Apellido: " + persona.getApellido());
        System.out.println("Documento: " + persona.getDocumento());
        System.out.println("Estado Civil: " + persona.getEstCiv());
    }

}
