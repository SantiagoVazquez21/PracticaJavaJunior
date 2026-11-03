package excepciones;

public class Excepciones {

    public static void main(String[] args) {
        
        int edades [] = {12, 12, 23, 30};
        
        try {
            System.out.println("La edad de la posicion 4 es: " + edades[4]);
        } catch (Exception e) {
            System.out.println("El indice 4 no existe!");
        }       
    }   
}
