package Logica;

public class EjercicioIntegradorPOO {

    public static void main(String[] args) {
        
        Squirtle squirtle = new Squirtle();
        Charmander charmander = new Charmander();
        Bulbasaur bulbasaur = new Bulbasaur();
        Pikachu pikachu = new Pikachu();
        
        squirtle.atacarAraniazo();
        squirtle.atacarHidrobomba();
        charmander.atacarAraniazo();
        charmander.atacarAscuas();
        bulbasaur.atacarAraniazo();
        bulbasaur.atacarDrenaje();
        pikachu.atacarAraniazo();
        pikachu.atacarImpactrueno();
        
    }
    
}
