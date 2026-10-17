package ejerciciointegradorbasico;

import java.util.Scanner;

public class EjercicioIntegradorBasico {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String palabra = "";
        int tipo = 0, cantPorHora = 0, cantMediaJornada = 0, cantJornadaCompleta = 0;
        double valor = 0, valorTotal = 0;
        String patente;

        while (!palabra.equalsIgnoreCase("Fin")) {
            System.out.println("Ingrese la patente del vehiculo");
            patente = teclado.next();
            System.out.println("Ingrese el numero que corresponda al tipo de estacionamiento: 1: Por hora, 2: Media jornada, 3: Jornada completa");
            tipo = teclado.nextInt();

            if (tipo == 1) {
                valor = 3;
                valorTotal = valorTotal + valor;
                cantPorHora++;
            } else {
                if (tipo == 2) {
                    valor = 15 - (15 * 0.05);
                    valorTotal = valorTotal + valor;
                    cantMediaJornada++;
                } else {
                    if (tipo == 3) {
                        valor = 30 - (30 * 0.1);
                        valorTotal = valorTotal + valor;
                        cantJornadaCompleta++;
                    } else {
                        System.out.println("El numero ingresado no es valido, intente nuevamente");
                        continue;
                    }
                }
            }
            System.out.println("Si desea salir del programa ingrese 'Fin' de lo contrario ingrese cualquier caracter");
            palabra = teclado.next();
        }
        System.out.println("La cantidad de estacionamiento por hora es: " + cantPorHora);
        System.out.println("La cantidad de estacionamiento por media jornada es: " + cantMediaJornada);
        System.out.println("La cantidad de estacionamiento por jornada completa es: " + cantJornadaCompleta);
        System.out.println("La suma total de ingresos en USD es: " + valorTotal + " USD");
    }
}
