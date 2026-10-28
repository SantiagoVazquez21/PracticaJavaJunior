package logica;

public class Consultor extends Persona{
    
    String nombreConsultora;
    int numConsultor;

    public Consultor() {
    }

    public Consultor(String nombreConsultora, int numConsultor, int id, String nombre, String apellido, String domicilio, String telefono) {
        super(id, nombre, apellido, domicilio, telefono);
        this.nombreConsultora = nombreConsultora;
        this.numConsultor = numConsultor;
    }

    public String getNombreConsultora() {
        return nombreConsultora;
    }

    public void setNombreConsultora(String nombreConsultora) {
        this.nombreConsultora = nombreConsultora;
    }

    public int getNumConsultor() {
        return numConsultor;
    }

    public void setNumConsultor(int numConsultor) {
        this.numConsultor = numConsultor;
    }
    
}
