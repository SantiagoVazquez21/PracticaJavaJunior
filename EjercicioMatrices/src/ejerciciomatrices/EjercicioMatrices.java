package ejerciciomatrices;

import java.util.Scanner;

public class EjercicioMatrices {

    public static void main(String[] args) {
        int matriz[][] = new int[3][3];
        Scanner teclado = new Scanner(System.in);

        // Matriz Cuadrada
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Ingrese el valor para la fila: " + i + " columna: " + j);
                matriz[i][j] = teclado.nextInt();
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("El valor de la fila " + i + " y columna " + j + " es: " + matriz[i][j]);

            }
        }

        int matrizN[][] = new int[3][5];

        // Matriz No Cuadrada
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("Ingrese el valor para la fila: " + i + " columna: " + j);
                matriz[i][j] = teclado.nextInt();
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("El valor de la fila " + i + " y columna " + j + " es: " + matriz[i][j]);

            }
        }

    }

}
