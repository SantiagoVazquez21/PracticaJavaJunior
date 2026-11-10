package enums;

import enums.enums.Color;

public class Enums {
    
    public static void main(String[] args) {
        
        //metodos mas utilizados en enums
        
        //values();
        for (Color c : Color.values()) {
            System.out.println("Color: " + c);
        }
        
        Color color = Color.NARANJA;
        
        //name();
        System.out.println(color.name());
        
        //ordinal();
        System.out.println(color.ordinal());
        
        //valueOf();
        try {
            color = Color.valueOf("AZUL");
            System.out.println("Encontre " + color);
        } catch (IllegalArgumentException e) {
            System.out.println("Ocurrio una excepcion. El valor no es correcto");
        }
    }
    
}
