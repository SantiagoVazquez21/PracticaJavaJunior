package ejerciciowhile;

import java.util.Scanner;

public class EjercicioWhile {

    public static void main(String[] args) {
        
        /*  int contador = 0;
        
        while (contador < 10){
            System.out.println("Estoy en la vuelta N " + contador);
            contador++;
        } */
      
        boolean bandera = true;
        Scanner teclado = new Scanner(System.in);
        String respuesta;
        
        while (bandera == true) {
            System.out.println("El valor de mi bandera es: " + bandera);
            System.out.println("Sabes programar en Java? " + bandera);
            System.out.println("Queres seguir aprendiendo Java? " + bandera);
            respuesta = teclado.next();
            
            if (respuesta.equalsIgnoreCase("no")){
                bandera = false;
            }
        }
        
    }
    
}
