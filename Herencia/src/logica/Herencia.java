package logica;

public class Herencia {

    public static void main(String[] args) {

        Persona[] vector = new Persona[5];
        vector[0] = new Persona();
        vector[1] = new Empleado();
        vector[2] = new Consultor();
        vector[3] = new Jefe();
        
        Persona persona1 = new Persona();
        Consultor consultor1 = new Consultor();
        
        // SI SE PUEDE DE PADRE A HIJO persona1 = consultor1;
        // NO SE PUEDE DE HIJO A PADRE consultor1 = persona1;
    }

}
