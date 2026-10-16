package operadorternario;

import java.util.Scanner;

public class OperadorTernario {

    public static void main(String[] args) {
        
        //programa que dependiendo del promedio de un alumno, nos diga si aprobo o no una materia
        double promedio, nota1, nota2;
        String condicionFinal;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese la primer nota");
        nota1 = teclado.nextDouble();
        System.out.println("Ingrese la segunda nota");
        nota2 = teclado.nextDouble();

        promedio = (nota1 + nota2) / 2;

        System.out.println("El promedio del alumno es: " + promedio);

        condicionFinal = (promedio >= 6) ? "Aprobado" : "Desaprobado";
        System.out.println("El alumno esta " + condicionFinal);

    }

}
