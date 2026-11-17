package com.mycompany.jpaprueba;

import com.mycompany.jpaprueba.logica.Alumno;
import com.mycompany.jpaprueba.logica.Carrera;
import com.mycompany.jpaprueba.logica.ControladoraLogica;
import com.mycompany.jpaprueba.logica.Materia;
import com.mycompany.jpaprueba.persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class JpaPrueba {

    public static void main(String[] args) throws NonexistentEntityException {
        
        ControladoraLogica control = new ControladoraLogica();
        
        //Clase JPA CRUD
        
        /*Alumno alumno2 = new Alumno (21, "Carlos", "Vazquez", new Date(), );
        control.crearAlumno(alumno2);
        
        control.eliminarAlumno(3);
        
        alumno.setApellido("dralmuerzo");
        control.modificarAlumno(alumno);
        
        System.out.println("--------Busqueda Individual--------");
        Alumno alumno = control.traerAlumno(1);
        System.out.println("El alumno es: " + alumno.toString());
        
        System.out.println("--------Busqueda de Todos--------");
        ArrayList<Alumno> listaAlumnos = control.traerListaAlumnos();
        for (Alumno al : listaAlumnos) {
            System.out.println("Alumno: " + al.toString());
        }*/
        
        //Clase JPA OneToOne
        /*
        //Creacion Carrera
        Carrera carrera = new Carrera(2, "Analista Funcional", "Matematicas");
        //Guardado Carrera en BD
        //control.crearCarrera(carrera);
        //Creacion Alumno (con Carrera)
        Alumno alumno = new Alumno(1, "Santiago", "Vazquez", new Date(), carrera);
       //Guardamos el alumno en la BD
       control.crearAlumno(alumno);
       //vemos el resultado
        System.out.println("--------Datos Alumno--------");
        Alumno alu = control.traerAlumno(30);
        System.out.println("Alumno: " + alu.getNombre() + " " + alu.getApellido());
        System.out.println("Cursa la carrera de: " + alu.getCarrera().getNombre());
        */
        
        //Clase JPA OneToMany
        
        //Creamos lista de materias y las agregamos
        LinkedList<Materia> listaMaterias = new LinkedList<Materia>();
        //Creacion Carrera
        Carrera carrera = new Carrera(2, "Analista Funcional", listaMaterias);
        //Guardado Carrera en BD
        control.crearCarrera(carrera);
        //Creacion Materias
        Materia materia = new Materia(58, "Estadistica", "Cuatrimestral", carrera);
        Materia materia2 = new Materia(23, "Algebra", "Anual", carrera);
        Materia materia3 = new Materia(12, "Matematica", "Anual", carrera);
        //Guardado Materias en BD
        control.crearMateria(materia);
        control.crearMateria(materia2);
        control.crearMateria(materia3);
        //Guardamos las materias en la lista
        listaMaterias.add(materia);
        listaMaterias.add(materia2);
        listaMaterias.add(materia3);
        //Mediante la modificacion agregamos las materias a la carrera
        carrera.setListaMaterias(listaMaterias);
        control.modificarCarrera(carrera);       
        //Creacion Alumno (con Carrera)
        Alumno alumno = new Alumno(1, "Santiago", "Vazquez", new Date(), carrera);
       //Guardamos el alumno en la BD
       control.crearAlumno(alumno);
       //vemos el resultado
        System.out.println("--------Datos Alumno--------");
        Alumno alu = control.traerAlumno(1);
        System.out.println("Alumno: " + alu.getNombre() + " " + alu.getApellido());
        System.out.println("Cursa la carrera de: " + alu.getCarrera().getNombre());
    }
}
