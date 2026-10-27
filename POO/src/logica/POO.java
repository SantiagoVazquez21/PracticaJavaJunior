package logica;

import java.util.HashSet;

public class POO {

    public static void main(String[] args) {
        
        Alumno alu1 = new Alumno();
        Alumno alu2 = new Alumno(5, "Santiago", "Vazquez");
        
        System.out.println("El id del alumno 2 es: " + alu2.getId());
        System.out.println("El nombre del alumno 2 es: " + alu2.getNombre());
        System.out.println("El apellido del alumno 2 es: " + alu2.getApellido());
        
        
        alu1.setId(8);
        alu1.setNombre("Monti");
        alu1.setApellido("Elian");
        
        System.out.println("El id del alumno 1 es: " + alu1.getId());
        System.out.println("El nombre del alumno 1 es: " + alu1.getNombre());
        System.out.println("El apellido del alumno 1 es: " + alu1.getApellido());
        
        alu2.setId(1);
        
        System.out.println("El id del alumno 2 ahora es: " + alu2.getId());
    }
    
}
