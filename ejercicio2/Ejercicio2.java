package ejercicio2;

public class Ejercicio2 {
    
    public static void main(String[] args) {
        
        Thread helloThread = new HelloThread();
        Thread worldThread = new WorldThread();

        helloThread.start();
        worldThread.start();

    }

}
