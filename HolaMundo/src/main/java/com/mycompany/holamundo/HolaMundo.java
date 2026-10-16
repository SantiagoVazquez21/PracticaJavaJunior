package com.mycompany.holamundo;

import java.util.Scanner;

public class HolaMundo {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int num1, num2, suma;
        
        System.out.println("Ingrese el primer numero a operar");
        num1 = teclado.nextInt();
        
        System.out.println("Ingrese el segundo numero a operar");
        num2 = teclado.nextInt();
        
        suma = num1 + num2;
        System.out.println("El resultado es: " + suma);
    }
}
