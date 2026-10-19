package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        int limite;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba un numero limite");
        limite = teclado.nextInt();
        
        for (int i = 0; i < limite; i++) {
            System.out.println("Numero: " + (i + 1));
        }
    }
    
}
