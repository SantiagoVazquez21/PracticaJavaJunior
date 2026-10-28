package sobrecarga;

public class Animal {
    
    private int id_animal;
    private String discripcion;
    
    //constructores
    
    //metodos getters y setters 
    
    //otros metodos
    public void hacerSonido(){
        System.out.println("El animal hace un sonido");
    }
    
    public void hacerSonido(String nombreAnimal){
        System.out.println("El animal " + nombreAnimal + " hace un sonido");
    }
    
    public void hacerSonido(String nombreAnimal, String tipoSonido) {
        System.out.println("El animal " + nombreAnimal + " hace un sonido de tipo " + tipoSonido);
    }
}
