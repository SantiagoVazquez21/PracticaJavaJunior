package ejercicio.pkgswitch;

import java.util.Scanner;

public class EjercicioSwitch {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int dia;
        String nombreDia;
        
        System.out.println("Ingrese un numero del 1 al 7");
        dia = teclado.nextInt();
        
        switch(dia) {
            case 1: nombreDia = "Lunes";
                break;
            case 2: nombreDia = "Martes";
                break;
            case 3: nombreDia = "Miercoles";
                break;
            case 4: nombreDia = "Jueves";
                break;
            case 5: nombreDia = "Viernes";
                break;
            case 6: nombreDia = "Sabado";
                break; 
            case 7: nombreDia = "Domingo";
                break;
            default: nombreDia = "Dia incorrecto";
        }
        
        System.out.println("El dia de la semana es: " + nombreDia);
    }
    
}
