package ejercicio2vector;

import java.util.Scanner;

public class Ejercicio2Vector {

    public static void main(String[] args) {
        int numeros[] = new int[10];
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese un numero para la posicion " + i);
            numeros[i] = teclado.nextInt();
        }

        int mayor = Integer.MIN_VALUE;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }

        int menor = Integer.MAX_VALUE;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        System.out.println("El numero mayor ingreso es: " + mayor);
        System.out.println("El numero menor ingreso es: " + menor);
    }

}
