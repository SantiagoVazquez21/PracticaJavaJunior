package ejercicio1vector;

import java.util.Scanner;

public class Ejercicio1Vector {

    public static void main(String[] args) {
        String nombres[] = new String[8];
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Ingrese un nombre para guardar en el indice " + i);
            nombres[i] = teclado.nextLine();
        }

        for (int i = 0; i < nombres.length; i++) {
            System.out.println("En el indice: " + i + " se encuentra el nombre: " + nombres[i]);
        }

    }

}
