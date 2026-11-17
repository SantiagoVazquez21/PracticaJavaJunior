package com.mycompany.jpaprueba.logica;

import com.mycompany.jpaprueba.persistencia.ControladoraPersistencia;
import java.util.ArrayList;

public class ControladoraLogica {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    // Alumno
    
    public void crearAlumno(Alumno alumno) {
        
        controlPersis.crearAlumno(alumno);
    }
    
    public void eliminarAlumno(int id) {
        
        controlPersis.eliminarAlumno(id);
    }
    
    public void modificarAlumno(Alumno alumno) {
        
        controlPersis.modificarAlumno(alumno);
    }
    
    public Alumno traerAlumno(int id) {
        
        return controlPersis.traerAlumno(id);
    }
    
    public ArrayList<Alumno> traerListaAlumnos() {
        
        return controlPersis.traerListaAlumnos();
    }
    
    // Carrera
    
    public void crearCarrera(Carrera carrera) {
        
        controlPersis.crearCarrera(carrera);
    }
    
    public void eliminarCarrera(int id) {
        
        controlPersis.eliminarCarrera(id);
    }
    
    public void modificarCarrera(Carrera carrera) {
        
        controlPersis.modificarCarrera(carrera);
    }
    
    public Carrera traerCarrera(int id) {
        
        return controlPersis.traerCarrera(id);
    }
    
    public ArrayList<Carrera> traerListaCarreras() {
        
        return controlPersis.traerListaCarreras();
    }
    
    // Materia
    
    public void crearMateria(Materia materia) {
        
        controlPersis.crearMateria(materia);
    }
    
    public void eliminarMateria(int id) {
        
        controlPersis.eliminarMateria(id);
    }
    
    public void modificarMateria(Materia materia) {
        
        controlPersis.modificarMateria(materia);
    }
    
    public Materia traerMateria(int id) {
        
        return controlPersis.traerMateria(id);
    }
    
    public ArrayList<Materia> traerListaMaterias() {
        
        return controlPersis.traerListaMaterias();
    }
}


