package ejercicioif;

import java.util.Scanner;

public class EjercicioIf {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        int edad;
        
        System.out.println("Ingrese su edad");
        edad = teclado.nextInt();
        
        if (edad > 18){
            System.out.println("Usted puede acceder al sistema");
        } 
        else {
            if (edad == 18) {
                System.out.println("Mande un Mail para pedir acceso al sistema");
            }
            else {
                System.out.println("Usted no puede acceder al sistema");
            }
        }
        
        
    }
    
}
