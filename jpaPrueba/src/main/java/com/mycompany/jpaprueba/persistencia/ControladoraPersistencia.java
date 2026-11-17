package com.mycompany.jpaprueba.persistencia;

import com.mycompany.jpaprueba.logica.Alumno;
import com.mycompany.jpaprueba.logica.Carrera;
import com.mycompany.jpaprueba.logica.Materia;
import com.mycompany.jpaprueba.persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;

public class ControladoraPersistencia {
    
    AlumnoJpaController aluJpa = new AlumnoJpaController();
    CarreraJpaController carreJpa = new CarreraJpaController();
    MateriaJpaController matJpa = new MateriaJpaController();

    public void crearAlumno(Alumno alumno) {
        aluJpa.create(alumno);
    }

    public void eliminarAlumno(int id) {
        try {
            aluJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            System.getLogger(ControladoraPersistencia.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }

    public void modificarAlumno(Alumno alumno) {
        try {
            aluJpa.edit(alumno);
        } catch (Exception ex) {
            System.getLogger(ControladoraPersistencia.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }

    public Alumno traerAlumno(int id) {
       return aluJpa.findAlumno(id);
    }

    public ArrayList<Alumno> traerListaAlumnos() {
        
        List<Alumno> lista = aluJpa.findAlumnoEntities();
        ArrayList<Alumno> listaAlumnos = new ArrayList<>(lista);
        return listaAlumnos;
    }

    public void crearCarrera(Carrera carrera) {
        carreJpa.create(carrera);
    }

    public void eliminarCarrera(int id) {
        try {
            carreJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            System.getLogger(ControladoraPersistencia.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }

    public void modificarCarrera(Carrera carrera) {
        try {
            carreJpa.edit(carrera);
        } catch (Exception ex) {
            System.getLogger(ControladoraPersistencia.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }

    public Carrera traerCarrera(int id) {     
        return carreJpa.findCarrera(id);
    }

    public ArrayList<Carrera> traerListaCarreras() {
        
        List<Carrera> lista = carreJpa.findCarreraEntities();
        ArrayList<Carrera> listaCarreras = new ArrayList<>(lista);
        return listaCarreras;
    }

    public void crearMateria(Materia materia) {
        matJpa.create(materia);
    }

    public void eliminarMateria(int id) {
        try {
            matJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            System.getLogger(ControladoraPersistencia.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }

    public void modificarMateria(Materia materia) {
        try {
            matJpa.edit(materia);
        } catch (Exception ex) {
            System.getLogger(ControladoraPersistencia.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }

    public Materia traerMateria(int id) {
        return matJpa.findMateria(id);
    }

    public ArrayList<Materia> traerListaMaterias() {
        List<Materia> lista = matJpa.findMateriaEntities();
        ArrayList<Materia> listaMaterias = new ArrayList<>(lista);
        return listaMaterias;
    }
    
    
}
