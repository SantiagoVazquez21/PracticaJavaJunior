package arraylist_vs_linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayList_vs_LinkedList {

    public static void main(String[] args) {
        
        List<Persona> listaArray = new ArrayList<Persona>();
        listaArray.add(new Persona(1, "Santiago", 20));
        listaArray.add(new Persona(2, "Monti", 6));
        listaArray.add(new Persona(3, "Itnom", 18));
        listaArray.add(new Persona(4, "dralmuerzo", 15));
        
        List<Persona> listaLinked = new LinkedList<Persona>();
        listaLinked.add(new Persona(1, "Santiago", 20));
        listaLinked.add(new Persona(2, "Monti", 6));
        listaLinked.add(new Persona(3, "Itnom", 18));
        listaLinked.add(new Persona(4, "dralmuerzo", 15));
        
        //Remove en ArrayList
        listaArray.remove(1);
        
        //Remove en LinkedList
        String nombreBorrar = "Monti";
        
        for (Persona perso : listaLinked) {
            if (perso.getNombre().equals(nombreBorrar)){
                listaLinked.remove(perso);
                break; //Corto el bucle ya que los punteros de la LinkedList se tiene que reunir
            }
        }
        
        System.out.println("------Luego de eliminar------");
        
        System.out.println("------ArrayList------");
        for (Persona perso : listaArray) {
            System.out.println("Prueba: " + perso.getNombre());
        }
        
        System.out.println("------LinkedList------");
        for (Persona perso : listaLinked) {
            System.out.println("Prueba: " + perso.getNombre());
        }
        
        //Tamanio lista
        System.out.println("------Que tamanio tienen las listas?------");
        System.out.println("ArrayList: " + listaArray.size());
        System.out.println("LinkedList: " + listaLinked.size());
        
        //Obtener primero objeto
        System.out.println("------Primer y ultimo objeto (solo para LinkedList)------");
        System.out.println("Primero de LinkedList: " + listaLinked.getFirst().toString());
        System.out.println("Ultimo de LinkedList: " + listaLinked.getLast().toString());
        
        //Borrar toda la lista
        System.out.println("------Borrando listas...------");
        listaArray.clear();
        listaLinked.clear();
        
        //Comprobar si esta vacia
        System.out.println("------Esta vacia alguna lista?------");
        System.out.println("ArrayList: " + listaArray.isEmpty());
        System.out.println("LinkedList: " + listaLinked.isEmpty());
    }
    
}
