package conversiones;

public class Conversiones {

    public static void main(String[] args) {
        
        double num = 1.99;
        
        //Casteo a entero
        int numInt = (int) num;
        
        //Casteo a long
        long numLong = (long) num;
        
        
        System.out.println("double: " + num);
        System.out.println("int: " + numInt);
        System.out.println("long: " + numLong);
        
        String cantidad = "21";
        String precio = "150.67";
        
        //Casteo a entero (utilizando la wrapper class de int)
        int cantEntero = Integer.parseInt(cantidad);
        
        //Casteo a double (utilizando la wrapper class de double)
        double precioDouble = Double.parseDouble(precio);
        
        System.out.println("El valor total de la compra es: " + (cantEntero * precioDouble));
        
        int edad = 20;
        double estatura = 1.75;
        
        //Casteo a String de un entero
        String edadString = String.valueOf(edad);
        
        //Casteo a String de un double
        String estaturaString = String.valueOf(estatura);
        
        System.out.println("Edad: " + edadString + " Estatura: " + estaturaString);
    }
    
}
