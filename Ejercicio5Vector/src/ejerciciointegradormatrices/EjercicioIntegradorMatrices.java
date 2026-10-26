package ejerciciointegradormatrices;

import java.util.Scanner;

public class EjercicioIntegradorMatrices {

    public static void main(String[] args) {
        double notas[][] = new double[4][3];
        Scanner teclado = new Scanner(System.in);
        double promedios[] = new double[4];
        double sumTotal = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Ingrese las 3 notas del alumno " + (i + 1));
            for (int j = 0; j < notas[0].length; j++) {
                notas[i][j] = teclado.nextDouble();
            }
        }

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[0].length; j++) {
                sumTotal += notas[i][j];
            }
            promedios[i] = sumTotal / notas[0].length;
            sumTotal = 0;
        }

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Las notas del alumnos " + (i + 1) + " son:");
            for (int j = 0; j < notas[0].length; j++) {
                System.out.println(notas[i][j]);
            }
            System.out.println("el promedio del alumno " + (i + 1) + " es: " + promedios[i]);
        }
    }
}
