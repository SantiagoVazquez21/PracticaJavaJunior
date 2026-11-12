package hilosyconcurrencia;

public class HilosYConcurrencia {

    public static void main(String[] args) {
        
        Hilo hilo = new Hilo();
        hilo.start();
        
        Thread hiloRun = new Thread (new HiloRunnable());
        hiloRun.start();
    }
    
}
