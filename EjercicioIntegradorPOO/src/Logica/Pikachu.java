package Logica;

public class Pikachu extends Pokemon implements IElectrico{

    public Pikachu() {
    }
    
    @Override
    protected void atacarPlacaje() {
        System.out.println("Soy Pikachu y estoy atacando con placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Soy Pikachu y estoy atacando con araniazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Soy Pikachu y estoy atacando con mordisco");
    }

    @Override
    public void atacarImpactrueno() {
        System.out.println("Soy Pikachu y estoy atacando con impactrueno");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Soy Pikachu y estoy atacando con punio trueno");
    }
    
}
