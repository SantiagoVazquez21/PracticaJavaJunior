package relaciones;

import java.util.ArrayList;
import java.util.List;

public class Relaciones {

    public static void main(String[] args) {
        
        Auto auto = new Auto();
        auto.setId(1L);
        auto.setMarca("Volkswagen");
        auto.setModelo("Polo");
        
        List<Propietario> listaProp = new ArrayList<Propietario> ();
        
        Propietario prop1 = new Propietario();
        Propietario prop2 = new Propietario();
        
        prop1.setId(21L);
        prop1.setNombre("Santiago");
        prop1.setApellido("Vazquez");
        
        prop2.setId(17L);
        prop2.setNombre("Monti");
        prop2.setApellido("Elian");
        
        listaProp.add(prop1);
        listaProp.add(prop2);
        
        auto.setListaPropietarios(listaProp);
        
        System.out.println("El auto " + auto.getMarca() + " " + auto.getModelo() + " tiene como propietarios a: " + auto.getListaPropietarios().toString());
    }
    
}
