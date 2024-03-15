package ejercicio2;

public class HelloThread extends Thread {
    
    @Override
    public void run() {
        while (true) {
            System.out.print("Hola ");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
