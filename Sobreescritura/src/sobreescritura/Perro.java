package sobreescritura;

public class Perro extends Animal{
    
    private String nombrePerro;
    private double peso;
    private String raza;
    private int sexo;
    
    //constructores
    
    //metodos getters y setters
    
    @Override
    public void hacerSonido(){
        System.out.println("Soy un perro y ladro guau guau");
    }
}

