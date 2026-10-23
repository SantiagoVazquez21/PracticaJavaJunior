package errordesbordamiento;

public class ErrorDesbordamiento {

    public static void main(String[] args) {
        int vector[] = {35, 23, 1};

        System.out.println("El valor de la 3era posicion es: " + vector[2]);

        for (int i = 0; i < 4; i++) {
            System.out.println("Valor: " + vector[i]);
        }
    }

}
