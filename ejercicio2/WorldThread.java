package ejercicio2;

public class WorldThread extends Thread {
    
    @Override
    public void run() {
        while (true) {
            System.out.print("Mundo ");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
