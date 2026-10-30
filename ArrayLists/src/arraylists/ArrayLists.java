package arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {

    public static void main(String[] args) {
        
        List<Persona> lista = new ArrayList<Persona> ();
        lista.add(new Persona(1, "Santiago", 20));
        lista.add(new Persona(2, "Monti", 19));
        lista.add(new Persona(3, "Itnom", 17));
        lista.add(new Persona(4, "dralmuerzo", 15));
        
        //recorrido con FOR
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Prueba: " + lista.get(i).getNombre());
        }
        
        //recorrido con FOREACH
        for (Persona perso:lista){
            System.out.println("Prueba: " + perso.getNombre());
        }
    }
    
}
