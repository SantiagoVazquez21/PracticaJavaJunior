package Logica;

public class Bulbasaur extends Pokemon implements IPlanta{

    public Bulbasaur() {
    }
    
    @Override
    protected void atacarPlacaje() {
        System.out.println("Soy Bulbasaur y estoy atacando con placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Soy Bulbasaur y estoy atacando con araniazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Soy Bulbasaur y estoy atacando con mordisco");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Soy Bulbasaur y estoy atacando con drenaje");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Soy Bulbasaur y estoy atacando con paralizar");
    }
    
}
