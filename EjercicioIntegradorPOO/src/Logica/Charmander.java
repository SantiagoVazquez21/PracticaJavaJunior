package Logica;

public class Charmander extends Pokemon implements IFuego{

    public Charmander() {
    }
    
    @Override
    protected void atacarPlacaje() {
        System.out.println("Soy Charmander y estoy atacando con placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Soy Charmander y estoy atacando con araniazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Soy Charmander y estoy atacando con mordisco");
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("Soy Charmander y estoy atacando con lanzallamas");
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Soy Charmander y estoy atacando con punio fuego");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Soy Charmander y estoy atacando con ascuas");
    }
    
}
