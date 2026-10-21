package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String palabra;
        do {
            System.out.println("Ingrese cualquier palabra, si desea frenar el bucle escriba SALIR");
            palabra = teclado.next();
            System.out.println(palabra);
        } while (!palabra.equalsIgnoreCase("salir"));
    }
    
}
