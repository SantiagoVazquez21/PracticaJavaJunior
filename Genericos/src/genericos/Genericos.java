package genericos;

public class Genericos {

    public static void main(String[] args) {
        
        Caja<String> cajaString = new Caja<>();
        cajaString.ponerAlgo("Santiago Vazquez");
        String contenido = cajaString.obtenerAlgo();
        
        System.out.println("El contenido es: " + contenido);
        
        Caja<Integer> cajaEnteros = new Caja<>();
        cajaEnteros.ponerAlgo(21);
        int numero = cajaEnteros.obtenerAlgo();
        
        System.out.println("El contenido es: " + numero);
    }
    
}
