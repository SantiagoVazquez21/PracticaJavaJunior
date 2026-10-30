package Logica;

public class Squirtle extends Pokemon implements IAgua{

    public Squirtle() {
    }
    
    @Override
    protected void atacarPlacaje() {
        System.out.println("Soy Squirtle y estoy atacando con placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Soy Squirtle y estoy atacando con araniazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Soy Squirtle y estoy atacando con mordisco");
    }

    @Override
    public void atacarHidrobomba() {
        System.out.println("Soy Squirtle y estoy atacando con hidrobomba");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Soy Squirtle y estoy atacando con burbuja");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Soy Squirtle y estoy atacando con pistola agua");
    }
    
}
