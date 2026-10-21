package ejerciciovectores;

import java.util.Scanner;

public class EjercicioVectores {

    public static void main(String[] args) {
        int numeros[] = new int[8];
        Scanner teclado = new Scanner(System.in);
        /* numeros[0] = 15;
        numeros[1] = 35;
        numeros[2] = 22;
        numeros[3] = 14;
        numeros[4] = 64;
        numeros[5] = 61;
        numeros[6] = 91;
        numeros[7] = 23; */

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese el valor para el indice: " + i);
            numeros[i] = teclado.nextInt();
        }

        System.out.println("Los valores ingresados fueron:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Indice: " + i + " Valor: " + numeros[i]);
        }
    }

}
