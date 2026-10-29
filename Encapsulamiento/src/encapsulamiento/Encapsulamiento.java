package encapsulamiento;

public class Encapsulamiento {

    public static void main(String[] args) {
        
        Alumno alum = new Alumno();
        Alumno alum2 = new Alumno(1, "Santiago", "Vazquez");
        
        System.out.println("ID: " + alum2.getId());
        System.out.println("Nombre: " + alum2.getNombre());
        System.out.println("Apellido: " + alum2.getApellido());
        
        
    }
    
}
