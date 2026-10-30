package linkedlists;

import java.util.LinkedList;
import java.util.List;

public class LinkedLists {

    public static void main(String[] args) {
        
        List<Persona> lista = new LinkedList<Persona>();
        
        //agregar personas a al final de la lista
        lista.add(new Persona(1, "Santiago", 20));
        lista.add(new Persona(2, "Monti", 6));
        lista.add(new Persona(3, "Itnom", 18));
        lista.add(new Persona(4, "dralmuerzo", 15));
        
        //agregar al principio
        lista.add(0, new Persona(5, "Probando", 93));
        
        //recorrido con FOREACH
        for (Persona perso:lista) {
            System.out.println("Prueba: " + perso.getNombre());
        }
    }
    
}
