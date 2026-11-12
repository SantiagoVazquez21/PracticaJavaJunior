package hilosyconcurrencia;

public class HiloRunnable implements Runnable{
    
    @Override
    public void run(){
        System.out.println("Hilo ejecutandose usando Runnable");
    }
}