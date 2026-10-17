package ejerciciomerceria;

import java.util.Scanner;

public class EjercicioMerceria {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int cantTotal, cantCanutillos, cantMostacillas;
        int envio = 0;
        int precioCanutillos = 10;
        int precioMostacillas = 25;
        int precioTotal;
        double precioEntrar;
        double precioDescuento;

        System.out.println("Ingrese la cantidad de paquetes de canutillos a comprar");
        cantCanutillos = teclado.nextInt();
        System.out.println("Ingrese la cantidad de paquetes de mostacillas a comprar");
        cantMostacillas = teclado.nextInt();

        cantTotal = cantCanutillos + cantMostacillas;
        precioTotal = (precioCanutillos * cantCanutillos) + (precioMostacillas * cantMostacillas);

        if (cantTotal < 5) {
            System.out.println("No se permiten compras menores a 5 productos");
        } else {
            if (cantTotal >= 5 && cantTotal <= 15) {
                envio = 10;
                System.out.println("El costo de envio es de 10 USD");
            } else {
                System.out.println("El envio es gratuito");
            }
            if (precioTotal < 100) {
                precioEntrar = (100 - precioTotal);
                System.out.println("No hay promociones ya que su compra es de " + precioTotal + " USD mas el envio de " + envio + " USD, necesita " + precioEntrar + " para entrar a una promocion");
            } else {
                if (precioTotal >= 100 && precioTotal < 300) {
                    precioDescuento = precioTotal - (precioTotal * 0.05) + envio;
                    System.out.println("Su compra posee un descuento del 5%, precio final: " + precioDescuento);
                } else {
                    precioDescuento = precioTotal - (precioTotal * 0.10) + envio;
                    System.out.println("Su compra posee un descuento del 10%, precio final: " + precioDescuento);
                }
            }
        }
    }
}
