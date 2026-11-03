package hashmap;

import java.util.Map;
import java.util.HashMap;

public class HashMaps {

    public static void main(String[] args) {
        
        Map<Integer, String> mapaEmpleados =  new HashMap<>();
        
        
        mapaEmpleados.put(1542, "Santiago Vazquez");
        mapaEmpleados.put(5432, "Monti Elian");
        mapaEmpleados.put(6767, "dr almuerzo");
        mapaEmpleados.put(1111, "Garu Vazquez");
        mapaEmpleados.put(2222, "Juanchi Cejas");
        
        //Contiene valor?
        boolean esta = mapaEmpleados.containsValue("dralmuerzo");
        //Contiene llave?
        boolean esta2 = mapaEmpleados.containsKey(6767);
        
        if (esta == true) {
            System.out.println("El valor buscado esta");
        } else {
            System.out.println("El valor buscado no esta");
        }
        
        if (esta2 == true) {
            System.out.println("La key buscada esta");
        } else {
            System.out.println("La key buscada no esta");
        }
        
        System.out.println(mapaEmpleados.keySet());
        System.out.println(mapaEmpleados.values());
        
        //Obtener valor mendiante key
        String nombre = mapaEmpleados.get(1111);
        System.out.println(nombre);
        
        mapaEmpleados.remove(6767);
        System.out.println(mapaEmpleados.values());
        
    }
    
}
