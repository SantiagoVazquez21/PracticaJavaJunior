package ejercicio3vector;

import java.util.Scanner;

public class Ejercicio3Vector {

    public static void main(String[] args) {
        int numeros[] = new int[15];
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese un numeros para el indice " + i);
            numeros[i] = teclado.nextInt();
        }

        int contTres = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == 3) {
                contTres++;
            }
        }

        System.out.println("El numero 3 se repitio una cantidad de " + contTres + " veces");
    }

}
