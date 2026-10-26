package ejercicio4vector;

import java.util.Scanner;

public class Ejercicio4Vector {

    public static void main(String[] args) {
        int sueldos[] = new int[12];
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < sueldos.length; i++) {
            System.out.println("Ingrese el sueldo del mes " + (i + 1));
            sueldos[i] = teclado.nextInt();
        }

        int sumTotal = 0;
        for (int i = 0; i < sueldos.length; i++) {
            sumTotal += sueldos[i];
        }

        int prom = sumTotal / sueldos.length;

        System.out.println("La suma total de los 12 sueldos es de " + sumTotal + " USD");
        System.out.println("El promedio de los 12 sueldos es de " + prom + " USD");
    }
}
