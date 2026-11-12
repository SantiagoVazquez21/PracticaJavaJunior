package hilosyconcurrencia;

public class Hilo extends Thread{
       
    @Override
    public void run() {
        System.out.println("Hilo ejecutandose con clase Thread");
    }
}
